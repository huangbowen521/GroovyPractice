def closure = {param -> println("hello ${param}")}
closure.call("world!")

closure = { greeting, name -> println(greeting + name ) }
closure.call("hello", "world!")
closure = {  println it +  " hello "}
closure.call("world!")

square = {it * it}
println square(9)
list = [1,2,3,4]
list = list.collect(square)
println list

