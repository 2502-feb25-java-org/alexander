function fizzBuzz(number) {
    if (number % 3 === 0 && number % 5 === 0) {
        return "Fizz Buzz";
    }
    else if (number % 3 === 0) {
        return "Fizz";
    }
    else if (number % 5 === 0) {
        return "Buzz";
    }
    else {
        return number.toString();
    }
}

//tests
//console.log(fizzBuzz(15));
//console.log(fizzBuzz(9));
//console.log(fizzBuzz(10));
//console.log(fizzBuzz(13));