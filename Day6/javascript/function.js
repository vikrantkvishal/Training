console.log(greet('Vikrant Vishal'));//can use before function initialization -> no error

function greet(name){
    return 'Welcome '+name;
}

function print(){
    console.log("Hello World");
}

print();

function cube(n){
    return n*n*n;
}

const res = greet("Vishal");
console.log(cube(4));
console.log(res);


//Function Expression
const data = function(){
    console.log('Data fetched successfully');
}

console.log(data);