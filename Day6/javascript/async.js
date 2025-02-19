function f1(){
    console.log("F1 Executed");
}

function f2(){
    setTimeout(()=>console.log('F2 Executed'),2000);
}
function f3(){
    console.log("F3 Executed");
}
function f4(){
    console.log("F4 Executed");
}

f1();f2();f3();f4();