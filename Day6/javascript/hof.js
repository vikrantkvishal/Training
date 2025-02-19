const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// const resArray = [];

// for(let num of array){
//     resArray.push(num*3);
// }
// console.log(resArray);

const resArray = array.map((num) => num * 3);
console.log(resArray);

const evenArray = array.filter((num) => num % 2 == 0);
console.log(evenArray);

var found = array.find((num) => num === 6);
console.log(found);

found = array.find((num) => num === 11);
console.log(found);

console.log(found ? 'Found' : 'Not Found');

var index = array.findIndex((num) => num == 10);
console.log(index);

var index = array.findIndex((num) => num == 12);
console.log(index);

console.log(index ? 'Found' : 'Not Found');

var arr = [1, 2, 3, 2, 4, 5, 2, 6, 7, 2, 8, 2];
var a = arr.filter((num) => num == 2);
console.log(a.length);

array.forEach(num=>console.log(num));

var res = [35,67,89,65,94];
console.log(res.every(num=>num>=35));//if all => true

console.log(res.some(num=>num>=90));//if any one => true

console.log([[1,2],2,[3,4,5]].flat());

console.log(array.includes(5));

console.log("Vishal Kumar".indexOf('a'));

console.log("Vishal Kumar".toLowerCase().lastIndexOf('a'));

const myArray = [10.,20,30,40,50];
console.log(myArray.slice(2));
console.log(myArray.slice(2,4));

myArray.splice(3,0,60,70);
console.log(myArray);

myArray.splice(3,1);
console.log(myArray);

myArray.splice(3,1,35);
console.log(myArray);

