const prompt = require("prompt-sync")();

let tryagain = 0;
let attempts = 0;

let randomNumber = parseInt(prompt("Enter number between 1 - 5\n"));
attempts++;

if (randomNumber >= 1 && randomNumber <= 5) {
  console.log("Correct");
} else {
  while (randomNumber < 1 || randomNumber > 5) {
    console.log("try again!");
    randomNumber = parseInt(prompt("Enter number between 1 - 5\n"));
    attempts++;
    tryagain++;
  }
  console.log("Correct");
}

console.log("The total attempts is: " + attempts);
console.log("The total tryagain is: " + tryagain);