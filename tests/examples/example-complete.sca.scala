// Basic Declaration
val c: Int = 5 + 6;
// var x: Int = 5 + 6, y: Int = 5 * 4, z: Int = 5 / 4; FIXME modificare la gra dichiarazione in sequenza di elementi
var x: Int = 5 + 6;
var y: Int = 5 * 4;
var z: Int = 5 / 4;

// Compound Declaration
var s: Array[Char](4) = Array('a', 'b', 'c', 'd');
var a: Boolean = True;

def proc(valres c: Int, b: Boolean): Int = {
    return (c);
}

// Function Declaration
def func(a: Int, b: Boolean, d: Char, n: Float, l: Boolean): Int = {
    // Basic Declaration
    var counter: Int = a;
    var z: Int = proc(counter, b);
    counter = a;

    // Iteration Statement
    while (b == True) {
        // Function Call
        var z: Int = proc(counter, b);
        proc(counter, b);
    }

    // Selection Statement
    if ((10 >= 8) || (counter > 5)) {
        var counter: Int = 2;
    } else {
        var counter: Int = 4;
    }

    // Left Expression Declaration
    ++counter;
    --counter;

    // Jump Statement
    return (1+1);
}

def main(): Unit {
    val z: Int = func(1, True, 'a', 3, False);
    return;
}

// Program execution
val run: Unit = main();