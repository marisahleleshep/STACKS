fun main(){
    var mystack=Stack()
    println(mystack.peek())
    println(mystack.pop())
    println(mystack.isEmpty())
    mystack.push(34)
    mystack.push(12)
    println(mystack.peek())
    mystack.push(3)
    mystack.push(7)
    mystack.pop()
    println(mystack.peek())
    var x=mystack.pop()
    var y=mystack.pop()
    var z=x!!+y!!
    println(z)

}


class Stack{
    var data = mutableListOf<Int>()

    fun push(value: Int){
        data.add(value)
    }
    fun pop():Char?{
        if (data.isEmpty()){
            return null
        }
        val top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Char?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
    fun reverseString(str: String):String{
        var result= mutableListOf<Char>()
        for (i in str.lastIndex downTo 0 ){
            result.add(str.)
        }
    }
    
}
