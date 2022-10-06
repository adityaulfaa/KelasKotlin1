package oop

class Mobil(kapasitasTanki: Int) {
    var merk = "Honda"
        get () = field

        set(value) {

            if (value == "Toyota"){
                field = "Toyota Fortuner"
            } else {
                field = "Honda"
            }

            field = "Rubah merk $value"
        }

    val tenaga = kapasitasTanki

    fun gas(){
        println("Gasss")
    }
}