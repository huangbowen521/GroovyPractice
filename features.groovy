//Print Data
def mydate = new java.util.Date()
println mydate
def name='World';println "Hello $name!"
//Iterate through a map

def numbersMAP=["1":"one","2":"two"]
for(entry in numbersMAP){
	println "${entry.key}=${entry.value}"
}

//Introducing the range
def range = "a".."d"

println range

//Lists
def numberList=[1,2,3,4,5,6,7,8]
println numberList;
println "Maximum value:${numberList.max()}"

class Greet {
def name
Greet(who) {name = who[0].toUpperCase() + who[1..-1]}
def salute() { println "Hello $name!" }
}
g = new Greet('world')
g.salute()
