var Demo = /** @class */ (function () {
    function Demo() {
        console.log("Demo() default constructor executed");
    }
    Demo.prototype.f1 = function () {
        console.log("This is f1()");
    };
    return Demo;
}());
var d1 = new Demo();
d1.f1();
