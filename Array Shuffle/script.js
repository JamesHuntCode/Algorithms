// Program to demonstrate an algorithm used to shuffle an integer array.

// Method to perform and in place shuffle of an array.
var Shuffle = function (array) {
    

    // Return shuffled array.
    return array;
}

var Main = function () {
    // Array to be operated on.
    var shuffleMe = [];

    // Populate array with some integer values.
    for (let i = 0; i < 100; i++) {
        shuffleMe[i] = i;
    }

    // Print out elements before and after shuffling algorithm has been called.
    console.log("Input: " + shuffleMe + "\n\n");
    console.log("Output: " + Shuffle(shuffleMe) + "\n\n");
}
Main();
