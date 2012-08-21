def fun(int i, Closure c){
c.call(i)
}

[1,2,3].each() {item -> print "${item}-"}
fun(123) {i -> println i }

[1,2,3].each ({item -> print "${item}-"} )

[1,2,3].each { item -> print "${item}-"}

[1,2,3].each(({ item -> print "${item}-"}))

[1,2,3].each {fun(it,{item -> print "${item}-"})}

def closure = {i -> println i}

