package tt

import ChecksumAccumulator.calculate

import processing.core._
//import cell._

object Summer extends PApplet{

  
  def main(args: Array[String]): Unit = {
    var frame = new javax.swing.JFrame("Shit tards")
    var applet = Summer
    frame.getContentPane().add(applet)
    applet.init
    frame.pack
    frame.setVisible(true)
  }  
  
  override def setup(): Unit = {
    size(400, 400)
    val c1 = new Cell(0, 0, 10, 10, 240)

  }
  val home = new antHill(40)
  val a1 = new Ant(40, 40, random(0, 365))
  val a3 = new Ant(140, 40, random(0, 365))
  val a2 = new Ant(40, 140, random(0, 365))
  val a4 = new Ant(65, 240, random(0, 365))
  var ss = 255
  var yy = 1
  override def draw(): Unit = {
    background(51)
    ellipse(38, 65, home.size.toFloat, home.size.toFloat)
    	a1.move(400, 400, random(-5, 5))
    	a2.move(400, 400, random(-5, 5))
    	a3.move(400, 400, random(-5, 5))
    	a4.move(400, 400, random(-5, 5))
    	ellipse(a1.xpos.toFloat, a1.ypos.toFloat, 5, 10)
    	ellipse(a2.xpos.toFloat, a2.ypos.toFloat, 5, 10)
       	ellipse(a3.xpos.toFloat, a3.ypos.toFloat, 5, 10)
    	ellipse(a4.xpos.toFloat, a4.ypos.toFloat, 5, 10)
  }
}


