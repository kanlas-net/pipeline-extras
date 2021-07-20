# Pipeline Extras Library
The main goal of this [Jenkins Shared Library](https://www.jenkins.io/doc/book/pipeline/shared-libraries/) is to add missed features and make some trivial actions easier.  
Feel free to copy, fork and modify this code.

Simple connection in pipeline:
```groovy
@Library("github.com/kanlas-net/pipeline-extras@master") _
```

Documentation can be found [here](docs/Common.md).

Some library functions require [AnsicColor](https://plugins.jenkins.io/ansicolor/) plugin.  
You don't need to use this plugin directly, library uses it by itself when needed.