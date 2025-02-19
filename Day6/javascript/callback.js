//pass function as argument its called callback

let data = [];
const fetchData=(cb)=>{
    setTimeout(()=>{
        data=[1,2,3,4,5,6,7];
        console.log("Data fetched successfully");
        cb();//trigger callback here
    },2000)
}

const displayData = ()=>{
    console.log("Sisplaying Data: ",data);
}

fetchData(displayData);//passing function as argument

