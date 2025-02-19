const person={
    firstName:"AA",
    lastName:"BB",
    email:"aa@gmail.com",
    age:22,
    address:{
        street:"Times Square",
        city:"New York",
        pincode:456456,
        country:"US"
    },
    greeting: function(){
        console.log('Welcome '+this.firstName+" "+this.lastName);
        console.log(`Welcome ${this.firstName} ${this.lastName}`);
    }
}

console.log(person);
person.greeting();

console.log(person['email']);

for(let key in person){
    console.log(person[key]);
}

