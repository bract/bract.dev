# bract.dev Change Log

## TODO

- [Idea] Colourful output support using AvisoNovate/pretty
- [Idea] Install coloured, pretty-printing fns using Puget: https://github.com/greglook/puget


## 0.6.2-0.2.0 / 2021-February-28

- Dependency update
  - Use bract.core 0.6.2
  - Upgrade tools.namespace to 1.1.0
- New features
  - Add namespace `bract.dev.repl` for REPL support (with `clojure.repl` vars and `help` fn)
- Documentation
  - Add _cljdoc_ badge
  - Reformat docstring for _cljdoc_
  - Add documentation page with usage instructions


## 0.6.0-0.1.0 / 2018-October-10

- Upgrade bract.core to 0.6.1


## 0.6.0-0.1.0 / 2018-May-16

- Upgrade bract.core to 0.6.0


## 0.5.1 / 2018-March-05

- Use bract.core 0.5.1


## 0.5.0 / 2018-February-18

- Use bract.core 0.5.0
- [BREAKING CHANGE] Do not return context from `bract.dev.reload` functions (for REPL usability)
  - `reinit` (by extension `reset` and `go`)


## 0.4.1 / 2017-August-08

- Use bract.core 0.4.1


## 0.4.0 / 2017-August-05

- Use the GA version of bract.core 0.4.0


## 0.4.0-alpha2 / 2017-August-01

- Use bract.core 0.4.0-alpha2


## 0.4.0-alpha1 / 2017-July-31

- Use bract.core 0.4.0-alpha1


## 0.3.1 / 2017-June-30
- Use bract.core 0.3.1
- Fix docstring of `bract.dev.reload/go`


## 0.3.0 / 2017-June-11
- Use bract.core 0.3
- [BREAKING CHANGE] Move `verbose` function to `bract.core` module


## 0.2.0 / 2017-June-04
- Moved into `bract.dev` module (`bract.dev.reload` namespace)
- Compatibility with [Reloaded](https://github.com/stuartsierra/reloaded) workflow
- Function `verbose` to regulate verbose mode


## 0.1.0 / 2017-April-25 (part of demo application code base)
- REPL based dev/test (with reinit) support
