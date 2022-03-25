package u04lab.polyglot.a01a
import Logics.*
import scala.util.Random

/** solution and descriptions at https://bitbucket.org/mviroli/oop2019-esami/src/master/a01a/sol2/ */
class LogicsImpl(private val size: Int, private val boat: Int) extends Logics:

  val random = Random ()
  private val FAILURES = 5
  private var hitS: Int = 0
  private var boatRow: Int = random.nextInt(size)
  private var boatLeftCol: Int = random.nextInt(size-boat+1)
  private var boatSize: Int = boat
  private var failures: Int = 0

  println(s"x= $boatLeftCol, y= $boatRow")

  def hit(row: Int, col: Int): Result =
    if (row == boatRow && col >= boatLeftCol && col < (boatLeftCol+boatSize))
      hitS = hitS + 1
      if (hitS == boatSize) then Result.WON else Result.HIT
    else
      failures = failures + 1
      if (failures == FAILURES) then Result.LOST else Result.MISS




