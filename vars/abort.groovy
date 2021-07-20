void call(Object message) {
    print("WARNING: ${message ? message.toString() : "abort was called for stage $env.STAGE_NAME"}")
    timeout(0) {
        sleep 1
    }
}