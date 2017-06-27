# bract.dev

This documentation is for the _bract.dev_ module. Refer [Bract documentation](https://bract.github.io/about.html)
for overall Bract documentation.

Leiningen coordinates: `[bract/bract.dev "0.3.1"]`


## Keys

This module does not expose any context/config keys.


## Inducers

This module does not expose any inducers.


## Entry points

This module exposes several functions as entry point for REPL based interactive development. These functions are
available in the `bract.dev.reload` namespace:

| Function call | Description |
|---------------|-------------|
| `(reinit)`    | De-init application, then code reload followed by init |
| `(reset)`     | Stop application, followed by re-init |
| `(go)`        | Same as `reset` |
| `(restart)`   | Stop application, then re-init followed by starting app |
