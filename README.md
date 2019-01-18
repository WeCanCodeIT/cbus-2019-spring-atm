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

### Alan
1. From master, create a new branch off of dev `git checkout -b deposit-method dev`
1. Test drive the deposit method...notice the name of my branch describes the feature I am building (helps for team communication)
1. `add`, `commit` and `push`
1. Place a Pull Request on GitHub