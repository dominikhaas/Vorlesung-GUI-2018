/**
 * Created by dominik.haas on 27.05.18.
 */
var message = "Hello ";

function sayHello(name) {
  alert(message + name);
}

sayHello("Rosenheim");


function Greeter(name) {
  this.name = name;
};

Greeter.prototype.greet = function() {
  alert("Hello222 " + this.name);
}

var greeter = new Greeter("Rosenheim");
greeter.greet();
console.log("-------");
console.log('5' + 3);
console.log('5' - 3);
console.log([1, 2, 3] + [4, 5, 6]);


function getMessage() {
  return {
    message: 'Hello world'
  }
}
console.log(getMessage().message);
