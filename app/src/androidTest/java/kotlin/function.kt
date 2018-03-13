package kotlin

import android.renderscript.Byte3

/**
 * Created by ganesh on 12/3/18.
 */
val fu:(num1:Int)-> Unit= fun (num1: Int){
    println("Numder is $num1")

}
val fun1: (num1:Int)-> Unit={a-> print("values is $a")}
fun funDemo(cb:(num1: Int)->Boolean) {
    cb(20)
}

fun callDemo(){

    funDemo (fun(_):Boolean{
        return  true

    })

    funDemo ({  _->true} )
funDemo {
    println("value of int is $it")
    true
}
}
fun funDemo1():()->Unit{
    return fun (){

    }

}
fun fun2():()->Unit{
    return {

    }
}