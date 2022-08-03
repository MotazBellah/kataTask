package guru.drako.examples.gildedrose
/**
 * A Singleton Class.
 *
 * This singleton used to share logic/helper functions.
 */

object Utils {
  fun checkQuality(value: Int?) : Boolean {
    return value!! > 0
  }


  fun checkItem(source: String, target: String): Boolean {
    return source?.contains(target.toString(), ignoreCase = true)
  }

  fun sellInCheck(days: Int, quality: Int) : Int {
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


}
