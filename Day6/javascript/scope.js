let name = "test";

function hello() {
    if (true) {
        let a = 10;
        const b = 20;
        var c = 30;

        console.log('Inside if block: let:', a);
        console.log('Inside if block: const: ', b);
        console.log('Inside if block: var: ', c);
    }

    // console.log('Outside if block: let:', a);
    // console.log('Outside if block: const: ', b);
    console.log('Outside if block: var: ', c);
}

function myfunc() {
    let a = 10;
    const b = 20;
    var c = 30;

    console.log('let:', a);
    console.log('const: ', b);
    console.log('var: ', c);
}

myfunc();
//not defined error
// console.log('let: ',a);
// console.log('const: ',b);
// console.log('var: ',c);

hello();