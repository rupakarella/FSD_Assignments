class Employee {
    eid:number=99;
    ename:string="javeed";
    constructor(){
        console.log("Employee constructor");
    }
    display():string
    {
        return "Hello";
    }
    x:any=99;
    n1:number=(<number>this.x);
}
const employee=new Employee();
employee.eid=101;
employee.ename="rupa";
console.log(employee);

