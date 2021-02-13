# bract.dev Change Log

## TODO

- [Idea] Colourful output support using AvisoNovate/pretty
- [Idea] Install coloured, pretty-printing fns using Puget: https://github.com/greglook/puget


## [WIP] 0.6.2-0.2.0-alpha4 / 2021-February-??

- Use bract.core 0.6.2-alpha4
- Use tools.namespace 1.1.0


## 0.6.2-0.2.0-beta3 / 2021-February-06

- Use bract.core 0.6.2-beta3


## 0.6.2-0.2.0-beta2 / 2021-January-28

- Drop `bract.dev.ring` ns - subsumed in `bract.ring`
- Drop `bract.dev.edn` file - subsumed in `bract.ring`
- Add `bract.dev.repl/help` fn for help text


## 0.6.2-0.2.0-beta1 / 2021-January-27

- Use bract.core 0.6.2-beta1


## 0.6.2-0.2.0-alpha3 / 2020-October-12

- Use bract.core 0.6.2-alpha3
- Do not log Ring request-arrived event in traffic-log wrapper options


## 0.6.2-0.2.0-alpha2 / 2020-October-06

- Include `clojure.repl` vars in `bract.dev.repl` namespace
- Logger functions `bract.dev.ring/log-*` for `bract.ring.wrapper/traffic-log-wrapper`
- Provide DEV config resource `bract/dev/config.dev.edn`
- More refer'ed vars in `bract.dev.repl` ns (parity with `lein repl`)


## 0.6.2-0.2.0-alpha1 / 2020-October-01

- Upgrade bract.core to version 0.6.2
- Upgrade tools.namespace to 1.0.0
- Add namespace `bract.dev.repl` for REPL support
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
