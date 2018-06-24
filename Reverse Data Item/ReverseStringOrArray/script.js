// Program to demonstrate an algorithm used to reverse an array or string.

// Method to perform the reverse of a string.
var ReverseString = function (inputString) {

    var reversedString = "";

    for (let i = (inputString.length - 1); i >= 0; i--) {
        reversedString += inputString[i];
    }

    return reversedString;

}

// Method to perform the reverse of an array.
var ReverseArray = function (inputArray) {

    var reversedArray = [];

    for (let i = (inputArray.length - 1); i >= 0; i--) {
        reversedArray.push(inputArray[i]);
    }

    return reversedArray;

}

// Main function.
var Main = function () {

    // Array to be operated on.
    var arrayReverseMe = [];

    // Populate array with some integer values.
    for (let i = 0; i < 11; i++) {
        arrayReverseMe[i] = i;
    }

    // String to be operated on with a random value.
    var stringReverseMe = "123456789";

    // Print out elements before and after reversing algorithm has been called.

    // Array value outputs.
    console.log("Input: " + arrayReverseMe + "\n\n");
    console.log("Output: " + ReverseArray(arrayReverseMe) + "\n\n");

    // String value outputs.
    console.log("Input: " + stringReverseMe + "\n\n");
    console.log("Output: " + ReverseString(stringReverseMe) + "\n\n");

}
Main();
