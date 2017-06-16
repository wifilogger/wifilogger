# Wifilogger

## Commit conventions

Our commit conventions are based on
[AngularJS conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153#format-of-the-commit-message).
They differ in the allowed scopes and in the fact that the footer only references issues.

### Format of the commit message

    <type>(<scope>): <subject>
    <BLANK LINE>
    <body>
    <BLANK LINE>
    <footer>

Any line of the commit message cannot be longer 100 characters! This allows the message to be easier to read on github
as well as in various git tools.

#### Subject line

Subject line contains succinct description of the change.

##### Allowed `<type>`

* feat (feature)
* fix (bug fix)
* docs (documentation)
* style (formatting, missing semi colons, ...)
* refactor
* test (when adding missing tests)
* chore (maintain)

##### Allowed `<scope>`

The scope can be one of the following:

* readme
* build_system

Not every commit to projects that do have scopes will necessarily specify a scope. If the commit is not limited or
relevant to a single scope, leave it out.

##### `<subject>` text

* use imperative, present tense: “change” not “changed” nor “changes”
* don't capitalize first letter
* no dot (.) at the end

#### Message body

* use imperative, present tense: “change” not “changed” nor “changes”
* includes motivation for the change and contrasts with previous behavior

http://365git.tumblr.com/post/3308646748/writing-git-commit-messages
http://tbaggery.com/2008/04/19/a-note-about-git-commit-messages.html

#### Message footer

Closed bugs should be listed on a separate line in the footer prefixed with "Closes" keyword like this:

    Closes #234

or in case of multiple issues:

    Closes #123, #245, #992
