//Types -- TS allows for strict typing
var num = 10;
//num = 'testing';
var b = true;
var s = 'this is a string';
var arr = [1, 4, 6, 7, 8];
//arr = [1, 5, 'test'];
/*
TUPLE: allow you to express an array where the
type of a fixed number of elements is known, but
need not be the same
*/
var kv = [1, 'Genesis'];
//generic array types
var arr2 = [1, 5, 7, 8];
//can arrays have fixed sizes?
/*
Enums - a way of giving names to sets of numeric values
*/
var Days;
(function (Days) {
    Days[Days["Monday"] = 0] = "Monday";
    Days[Days["Tuesday"] = 1] = "Tuesday";
    Days[Days["Wednesday"] = 2] = "Wednesday";
    Days[Days["Thursday"] = 3] = "Thursday";
    Days[Days["Friday"] = 4] = "Friday";
})(Days || (Days = {}));
var today = Days[4];
var yesterday = Days.Thursday;
//FUNCTIONS
//we can give functions both parameter types and return types
function add(a, b) {
    return a + b;
}
function doThings() {
    return 'test';
}
function voidType() {
    console.log('simply does not return a value');
}
function nevertype() {
    //this means that the end of the method is unreachable
    throw new Error('never reach end of code!');
}
function anotherNever() {
    while (true) {
        //
    }
}
var something = 'this is a string';
var len = something.length;
var u = {
    id: 1,
    username: 'testuser',
    password: '123',
    useApp: function () {
        console.log('learning things');
    }
};
var o = {
    id: 1,
    username: 'dfewgffg',
    password: "sfsvsa"
};
var Point = /** @class */ (function () {
    function Point(x, y) {
        this.x = x;
        this.y = y;
    }
    Point.prototype.getDistance = function () {
        return Math.sqrt(this.x * this.x * +this.y * this.y);
    };
    return Point;
}());
var pointA = new Point(5, 5);
console.log(pointA.getDistance());
