# Introduction to bract.dev

This module provides namespace hot-reloading support for REPL based development.


## Setup

The instructions below are for [Leiningen](https://leiningen.org/) users.


### Project configuration

Configure `project.clj` to specify DEV dependency and the REPL namespace:

```edn
  :profiles {:dev {:dependencies [bract/bract.dev "<version>"]
                   :repl-options {:init-ns bract.dev.repl}}}
```


### Using the REPL

Now, you can run `lein repl` to invoke the REPL and run commands - modified namespaces are automatically
reloaded on each command run:

```clojure
(help)     ; show REPL help text
(start)    ; launch the application
(restart)  ; stop and start again
```
