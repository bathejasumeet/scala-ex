var x  = 1
while(x < 6){
  var y = 1
  while(y < 6) {
    val res = x * y;
    if (res.toString.contains('4') || res.toString.contains('6')) println(s" ${x} times ${y} is ${res}")
    y += 1
  }
  x += 1
}

// procedural syntax, return type is unit so beware
def add(x:Int, y:Int){
  return x + y;
}

add(2,3)

def add2(x:Int, y:Int) = {
  x + y
}
add2(2,3)