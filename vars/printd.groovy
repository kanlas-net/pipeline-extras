String formString(Map style, Object message) {
    textStyle = [
        bold     : 1,
        italic   : 3,
        underline: 4,
        strike   : 9,
        default  : 10
    ]
    fgColor = [
        black  : 30,
        red    : 31,
        green  : 32,
        yellow : 33,
        blue   : 34,
        magenta: 35,
        cyan   : 36,
        white  : 37,
        default: 39
    ]
    bgColor = [
        black  : 40,
        red    : 41,
        green  : 42,
        yellow : 43,
        blue   : 44,
        magenta: 45,
        cyan   : 46,
        white  : 47,
        default: 49
    ]

    ts = textStyle[style.ts] ?: textStyle['default']
    fg = fgColor[style.fg] ?: fgColor['default']
    bg = bgColor[style.bg] ?: bgColor['default']

    start = "\033[$ts;$fg;${bg}m"
    end = '\033[0m'

    return start + message.toString() + end
}

void call(Map style, Object message) {
	ansiColor('xterm') {
		print(formString(style, message))
	}
}

void call(Object message) {
	print(message)
}