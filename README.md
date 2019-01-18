# ATM

## Initialization Steps

1. Initialize a Java project in project repo
	1. `gradle init --type java-application`
	1. Add `id 'eclipse'` to `plugins` block in `build.gradle`
	1. Run `gradle eclipse`
1. Import into Eclipse

## Development Steps

1. Initialize `git` repo: `git init`
1. Make `dev` branch: `git checkout -b dev`

### Top Down Development Approach

1. Begin User Interface with `Application.java`
1. Test first method (`checkBalance`) driven by UI creation
1. Get rid of all compilation errors by generating code
1. Static imports (ctrl + shift + M)