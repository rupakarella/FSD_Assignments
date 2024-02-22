var Employee = /** @class */ (function () {
    function Employee() {
        this.eid = 99;
        this.ename = "javeed";
        console.log("Employee constructor");
    }
    return Employee;
}());
var employee = new Employee();
employee.eid = 101;
employee.ename = "rupa";
console.log(employee);
