package guru.drako.examples.gildedrose
/**
 * A Singleton Class.
 *
 * This singleton used to share logic/helper functions.
 **/

object Utils {

  fun checkItem(source: String, target: String): Boolean {
    // Check if the target string is substring of source string
    return source!!.contains(target.toString(), ignoreCase = true)
  }

  fun sellInCheck(days: Int, quality: Int) : Int {
    // Update the quality of the `Backstage pass` based on the sell-in days
    // If sell-in pass, the quality drops to 0
    if (days < 0) return 0

    // else, quality increases by 1 and by 2 when there are 10 days or less and by 3 when there are 5 days
    var out = quality
    if (quality < 50) {
     out += 1

      if ((days < 11) && (out < 50)) {
          out++
        }

        if ((days < 6) && (out < 50)) {
          out++
        }

    }
   return out
  }

  fun updateItemQuality(name: String, sellIn: Int, quality: Int): Int {
    var finalQuality = quality
    when {
      // Aged Brie actually increases in quality the older it gets
      checkItem(name, "Aged Brie") -> if (finalQuality < 50)  ++finalQuality
      // Backstage passes, like aged brie, increases in quality as its sellIn value approaches
      checkItem(name, "Backstage passes") -> finalQuality = sellInCheck(sellIn, finalQuality)
      // "Conjured" items degrade in quality twice as fast as normal items
      (checkItem(name, "Conjured") && (finalQuality > 0)) -> if (finalQuality >= 2)  finalQuality -= 2 else finalQuality--
      // "Sulfuras", being a legendary item, never has to be sold or decreases in quality
      else -> if (!checkItem(name, "Sulfuras") && (finalQuality > 0)) finalQuality -= 1
    }
    return finalQuality
  }


}
