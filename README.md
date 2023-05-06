# Kotlin/Wasm/Skia/Compose Example

This repository contains an example demonstrating how to use [Kotlin/Wasm](kotl.in/wasm) with Jet.
To know more about Kotlin wasm, please visit https://kotl.in/wasm.

# The App:

It's a simple web version of compose landing preview animation built with Compose Multiplatform.

![](%20screenshots%2Flanding-preview-animation.gif)

## Build and run

Check out the repo, navigate to the project folder, and use the following commands:

### Run Web version via Gradle

`./gradlew :webApp:wasmRun`


## Setup Environment

>**Note**
> Using experimental Kotlin/Wasm may require enabling experimental features in the target environment.

- **Chrome** 110 or newer: enable **WebAssembly Garbage Collection** at [chrome://flags/#enable-webassembly-garbage-collection](chrome://flags/#enable-webassembly-garbage-collection) or with Chrome 109 or newer, run the program with the `--js-flags=--experimental-wasm-gc` command line argument.
- **Firefox Nightly** 112 or newer: enable **javascript.options.wasm_function_references** and **javascript.options.wasm_gc** at [about:config](about:config).
- **Edge** 109 or newer: run the program with the `--js-flags=--experimental-wasm-gc` command line argument.

For more information see https://kotl.in/wasm_help/.

## IDE

It's recommended to use [IntelliJ IDEA 2023.1 or newer](https://www.jetbrains.com/idea/) to work with the project.
