// Program to demonstrate an algorithm used to shuffle an array.

/// Method to perform and in place shuffle of an array (Fisher-Yates algorithm).
var Shuffle = function (array) {
    var currentIndex = array.length;
    var temporaryValue;
    var randomIndex;

    // Shuffle (while) not all elements have been shuffled.
    while (currentIndex != 0) {

        // Select an random element.
        randomIndex = Math.floor(Math.random() * currentIndex);
        currentIndex -= 1;

        // Swap selected random element from above with current element to be shuffled.
        temporaryValue = array[currentIndex];
        array[currentIndex] = array[randomIndex];
        array[randomIndex] = temporaryValue;
        
    }

    // Return shuffled array.
    return array;
}

/// Main function.
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
