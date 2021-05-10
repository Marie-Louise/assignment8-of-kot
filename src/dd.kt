import javax.accessibility.AccessibleHyperlink

fun main() {
  println(num(56))
  println(num(33))
    var product1:Product
    println(arrayListOf("Marie","Jeannine"))
    println(arrayListOf("Mary"))
  println(arrayListOf("banana"))

    }
fun num(a:Int):Boolean{
    if (a%2==0){
        return true
    }
    else return false
}

data class Product(var name:String,var weight:Double,var price:Int,var category:String)
fun categorizeProduct(product:Product) {
    var groceriesList = mutableListOf<Product>()
    var hygieneList = mutableListOf<Product>()
    var otherList = mutableListOf<Product>()
    when (product.category) {
        "groceries" -> groceriesList.add(product)
        "hygiene" -> hygieneList.add(product)
        else -> otherList.add(product)
    }
    println(groceriesList)
    println(hygieneList)
    println(otherList)

    }
fun evenStrings(worldsArray:Array<String>): List<String>{
    var evenWorlds= mutableListOf<String>()
    worldsArray.forEach {world->
        if(world.length%2==0){
            evenWorlds.add(world)
        }
    }
    return evenWorlds

    }

fun evenIndices(word:String):String {
    var outputString=""
    word.forEachIndexed{index,character->
        if (index%2==0){
            outputString+=character
        }
    }
    return outputString
}


























































