const print = ()=>console.log('Sample');

const greeting = (name)=>console.log('Welcome ' + name);

const add = (num1,num2)=>num1+num2;//implicit return 

const calc = (num1,num2)=>{
    const a = num1+num2;
    const b = num1*num2;
    return a*b;//explicit return
}

print();
greeting("Vishal");
console.log(add(1,2));
console.log(calc(2,3));