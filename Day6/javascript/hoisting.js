console.log(a); //undefined but no error
var a = 10;
console.log(a);

// console.log(b);//error - cannot access before initialization
// let b = 20;
// console.log(b);

const test = function () {//anonymoius function -> used for callback
    console.log('Test Trigger');
}

const myFunction = function test() {//named function -> used for debugging , for recursion
    console.log('Test Trigger');
}
var factorial = function (n) {
    return n < 2 ? 1 : n * factorial(n - 1);
};

console.log(factorial(5));


