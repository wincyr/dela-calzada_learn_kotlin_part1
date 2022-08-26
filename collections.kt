// lists 
//immutable
fun main() {
    // Write your code below 🏊‍♀️
    val waterSports = listOf("Wind Surfing","Sailing","Swimming","Jet Skiing","Water Skiing")
    println(waterSports)
}


//accessing the indexes in the list 
fun main() {
    // Write your code below 🏃‍♀️
    var unitedStatesMarathons = listOf("Boston Marathon","Bank of America Chicago Marathon","TCS NYC Marathon","Marine Corps Marathon")
    unitedStatesMarathons[1]
    print(unitedStatesMarathons[1])

}


//mutable list
fun main() {
    // Write your code below 🎭
    var openBroadwayShows = mutableListOf("The Lion King","Chicago","The Cher Show","Les Miserables")
    openBroadwayShows[2] = "Wicked"
    print(openBroadwayShows)
}


//mutable list with size 
fun main() {
    // Write your code below 🍎
  
    var fruitTrees = mutableListOf("Apple", "Plum", "Pear", "Cherry")
  
    println("I am growing ${fruitTrees.size} different types of fruit in my garden.")
}
/*"I am growing ${listName.size} different types of fruit in my garden." */




    fun main() {

        val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
      
        // Write your code below 🪐
        planets.remove("Pluto")
        planets.add("Earth")
      
        println(planets.random())
      }


//set
fun main() {
    // Write your code below 💾
    var obsoleteTech = setOf("Rolodex","Phonograph","Videocassette recorder"
  ,"Video projector","Rolodex")
    
    println(obsoleteTech)
  }




    fun main() {
        // Write your code below 
        var islandsOfHawaii = setOf("Maui","Lanai","Oahu","Kauai")
      
        println(islandsOfHawaii.elementAt(2))
        println(islandsOfHawaii.elementAtOrNull(6))
      }
 /*the elementAtOrNull() function, a safer variation of elementAt() to return null as opposed to an error when an element does not exist in the set: */   





    fun main() {
        // Write your code below 👩‍🚀
      
        var apolloLandingSites = mutableSetOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes", "Taurus-Littrow", "Oceanus Procellarum")
      
        println(apolloLandingSites)
      
      }




fun main() {

    var uniqueParticipants = mutableSetOf<String>() 
    var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")
  
    // Write your code below 🎤
  
    uniqueParticipants.addAll(participants)
    println("The talent show has ${uniqueParticipants.size} unique participants.")
    uniqueParticipants.clear()
    print(uniqueParticipants)
  }
//clear() is to clear the set or the list




    fun main() {
        // Write your code below 📝
      
        var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)
        var sum = testGrades.sum()
        var numStudents = testGrades.size
        var average = sum/numStudents
      
        if (average < 65){
          println("Failed")
        } else {
          print("Passed")
        }
      }



      

//maps 
//val/var mapName = mapOf(key1 to val1, key2 to val2, key3 to val3)

fun main() {
    // Write your code below 🏞
    var codeysMap = mutableMapOf("valley" to "scorpions", "creek" to "snakes", "forest" to "bears")
  
    println(codeysMap)
  }




fun main() {
    var uniqueTransport = mapOf("India" to "Tuktuk", "Egypt" to "Felucca", "Peru" to "Totora Boat", "Hong Kong" to "Junk Boat")
  
    // Write your code below 🚜
    println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")
  
    println(uniqueTransport.keys)
    println(uniqueTransport.values)
  }




//mutable map
fun main() {
    // Write your code below 📺
   var tvShows = mutableMapOf("The Big Bang Theory" to 278, "Modern Family" to 250, "Bewitched" to 254, "That '70s Show" to 200)
  
  tvShows["The Big Bang Theory"] = 279
  
  print(tvShows)
  }

/*We can utilize Kotlin’s built-in put() function to add a new entry to the mutable map: */

fun main() {
    // Write your code below 🖼
  
    var momaPaintings = mutableMapOf("Les Demoiselles d'avignon" to "Pablo Picasso", "The Starry Night" to "Vincent Van Gogh", "Mona Lisa" to "Leonardo Da Vinci", "The Persistance of Memory" to "Salvador Dali")
  
    if (!momaPaintings.containsValue("Claude Monet")) {
      // Write your code for Step 1 here 
        momaPaintings.put("Water Lillies", "Claude Monet")
    }
  
      // Write your code for Step 2 here
    
      momaPaintings.remove("Mona Lisa")
      print(momaPaintings)
  }