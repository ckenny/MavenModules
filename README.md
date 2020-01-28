# Multi-Module Sample Project

A multi-module sample is required as a reference that will have a parent and few sub modules with internal dependencies.

## Modules

Here is a brief understanding about the modules developed in this project.

```bash
MavenModules
AModule
BModule
CommonPart
```
And here is a dependency tree,
```bash
MavenModules
    |-AModule
        |-BModule
            |-CommonPart
```
