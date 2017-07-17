# CheckStyle plugin

The CheckStyle plugin is run by the `build` task, using `config/checkstyle/checkstyle.xml` (which is trying to follow
Google style conventions).

For convenience, there exists a CheckStyle-IDEA plugin that can be installed in Android-Studio.

## Command line

A `checkstyle` task is defined in the root `build.gradle` and can be run as follows:

    $ ./gradlew checkstyle

The `build` task depends on `checkstyle`, too.

## Android-Studio

### Setup

1. Install the plugin called "CheckStyle-IDEA" in Android-Studio.
2. Import the checkstyle configuration as a code style scheme in _Settings > Editor > Code Style > Java > Manage... >
   Import..._ by selecting "CheckStyle configuration" and then browsing to `config/checkstyle/checkstyle.xml`.
3. In _Settings > Other Settings > Checkstyle_, change the "Scan Scope" to "Only Java sources (including tests)".
4. Still in _Settings > Other Settings > Checkstyle_, add a new configuration file and browse to
   `config/checkstyle/checkstyle.xml`.

### Usage

In Android-Studio's bottom task bar, you should see a "CheckStyle" tab. It will allow you to select your configuration
with the "Rules" dropdown-list, and to run the analysis on your code.
