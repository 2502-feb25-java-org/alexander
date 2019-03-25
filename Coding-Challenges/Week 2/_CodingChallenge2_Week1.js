console.fibonacci = function(n) {
    if (n === 0) {
        return 0;
    }
    else if (n === 1) {
        return 1;
    }
    else {
        return console.fibonacci(n-1) + console.fibonacci(n-2);
    }
}

//tests
//console.log(console.fibonacci(0));
//console.log(console.fibonacci(1));
//console.log(console.fibonacci(10));