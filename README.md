# ATM

## Initialization Steps

1. Initialize a Java project in project repo
	1. `gradle init --type java-application`
	1. Add `id 'eclipse'` to `plugins` block in `build.gradle`
	1. Run `gradle eclipse`
1. Import into Eclipse

## Development Steps

1. Initialize `git` repo: `git init`

### Top Down Development Approach

1. Begin User Interface with `Application.java`
1. Test first method (`checkBalance`) driven by UI creation
1. Get rid of all compilation errors by generating code
1. Static imports (ctrl + shift + M)
1. Test for $100 balance
1. Test for $200 balance
1. Refactor

### Git environment setup

1. `git init`
1. `git add .`
1. `git commit -m "Initial project setup"`
1. `git remote add origin https://github.com/WeCanCodeIT/cbus-2019-spring-atm` \*
1. `git push -u origin master` \*
1. make `dev` branch: `git checkout -b dev`
1. push `dev` to GitHub: `git push -u origin dev`

\* - copied from GitHub

### Feature Branching

#### Donny

1. Create feature branch from `dev`: `git checkout -b withdaw-method`
1. Test drive the creation of the method by writing a test the asserts the epected behavior
	1. returns 50
	1. decreases balance by 50
1. Create actual code for method and refactor
1. `add`, `commit`, `push`
1. Pull Request on GitHub (Make sure the PR is to `dev` and not `master`)
1. Clear merge conflicts as necessary

### Alan
1. From master, create a new branch off of dev `git checkout -b deposit-method dev`
1. Test drive the deposit method...notice the name of my branch describes the feature I am building (helps for team communication)
1. `add`, `commit` and `push`
1. Place a Pull Request on GitHub

## Stretch Tasks

Make sure to Test Drive all code
1. Withdraw/deposit methods that accept custom amounts
1. User can only withdraw in multiples of 10
1. User cannot withdraw more than is available in `balance`
1. User must enter a correct Personal Identification Number (PIN) to access ATM options
1. User only has three tries to enter PIN
