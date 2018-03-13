var exec = require('cordova/exec');

/**
 * Sends the given message through exec() to the Echo plugin, which sends it back to the successCallback.
 * @param message The string to be echoed.
 * @param successCallback Invoked with plugin result.
 */
module.exports = function(message, successCallback) {
    var action = 'echo';
    var args = [message];
    exec(successCallback, null, "Echo", action, args);
};
