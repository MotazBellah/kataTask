package guru.drako.examples.gildedrose

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle
import kotlin.test.Test
import kotlin.test.assertTrue

@TestInstance(Lifecycle.PER_CLASS)
class DummyTest {
  private  val items = listOf<Item>(
    Item("Conjured", 5, 10)
  )
  private val testShop: Shop = Shop(items)
  @Test
  fun `test the truth`() {
    assertTrue(actual = true)
  }

}
