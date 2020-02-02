var a = 5 // do not change this line 
var b = 7 // do not change this line
val c = a.also {
    a = b
    b = it
}