fun main(args: Array<String>){

//FUNCTION
    fun suma():Int{
        return 5
    }
    println("Suma: "+suma())

    fun despedir():String{
        return "Adios"
    }
    println("Method "+despedir())

//FUNCTION WITH UNIT(VOID) = WITHOUT
    fun saludar():Unit{
        println("Hola mundo!")
    }
    saludar()

    fun saludar2(){
        println("Hola mundo!")
    }
    saludar()

//FUNCTION WITH PARAMETER
    fun elogiar(nombre:String):String{
        return "Buen trabajo $nombre"
    }
    println(elogiar("Santiago"))

//FUNCTION WITH PARAMETERS FOR DEFAULT
    fun resta(x:Int, y:Int=10):Int{
        return x-y
    }
    println("1 Parameter by default: x-y= "+resta(15))

    fun multiplicacion(x:Int=4, y:Int=3):Int{
        return x*y
    }
    println("2 Parameters by Default: x*y="+multiplicacion())

//FUNCTION NAMED PARAMETERS
    fun calculo(dia:Int, mes:Int, saludo:String, boleto:Boolean){
        println("Calculado"+dia+" "+mes+" "+saludo+" "+boleto)
    }
    calculo(dia = 1,mes = 2, boleto = true, saludo = "Hola")

//FUNCTION MEMBER
    var dato="cadena de oro"
    println("Function member: " + dato.capitalize())

//FUNCTION SIMPLE EXPRESSION
    fun square(n:Int)=n*n
    println("Function Simple expression: square="+square(3))

    fun multi(x:Int, y:Int, z:Int)=x*y*z
    println("Function Simple expression: multi="+multi(2,2,3))

//VARARGS
    fun saludos(vararg saludos:String){
        for (saludo in saludos){
            println("Varargs: "+saludo)
        }
    }
    saludos("Hola","Buenos dias","Buenas tardes","Buenas noches","good night")

//FUNCTION GENERIC
    fun <T> generica(t:T):Unit{
        println(t)
    }
    generica(9)
    generica(true)
    generica("casa")

//FUNCTION EXTENSION
    val text= "Hola    esto    tiene    mucho    espacio"
    println("Sin extension: "+text)

    fun String.quitarEspacio():String{
        var regex = Regex("\\s+")
        return regex.replace(this," ")
    }
    println("Extension: "+text.quitarEspacio())

//FUNCTION infix 1st Part
    val m = Elemento("M")
    val n = Elemento("N")
    val o = m sumar n
    println(o.nombre)

//FUNCTION CASE STAKOVERFLOW
    /* before fun write tailrec
    example: tailrec fun sumar(){}
     */
}

//FUNCTION infix 2nd Part
class Elemento(var nombre:String){}

infix fun Elemento.sumar(item:Elemento):Elemento{
    return Elemento(this.nombre + item.nombre)
}