function f1()
{
    console.log("hello I am JS normal function");
}
f1();

const af=()=>{   //arrow or anonymous func
    let id;
    let name;
    console.log('Welcome to arrow function');

}
af();
// af=()=>{console.log("this is my arrow function by rupa");}
// af();
function add(a,b=5)
{
    return a+b;
}
var result= add(3,7);
console.log(result);

//spread or rest operator
function fun1(name,city,...a1)
{
    console.log("fun1 executed....");
    console.log(name+":"+city);
    console.log(a1[0]+" "+a1[1]+" "+a1[2]);
}
fun1("Rupa","Tanuku",1,2,3,4,5,6,7,8,9);

const obj={first:'Asim',last:'Hussain',age:39};
// const f=obj.first;
// const l=obj.last;
// console.log(f);
// console.log(l);

//object destructing
const{first:f, last:l}=obj;
console.log(f);
console.log(l);
