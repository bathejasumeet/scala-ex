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