package util

class Cell(x1: Int, x2: Int, y1: Int, y2: Int, rnd: Double) {
  val xmin = x1
  val xmax = x2
  val ymin = y1
  val ymax = y2
  val alive = if (rnd > 230) 1 else 0

}