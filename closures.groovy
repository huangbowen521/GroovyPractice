def closure = {param -> println("hello ${param}")}
closure.call("world!")

closure = { greeting, name -> println(greeting + name ) }
closure.call("hello", "world!")
closure = {  println it +  " hello "}
closure.call("world!")
