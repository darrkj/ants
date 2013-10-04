package util

import processing.core.PApplet._
import processing.core._
import util.Summer.{mouseX, mouseY, fill, random, ellipse}
import scala.math.floor

class Ant(grid: (Int, Int), home: AntHill) {
  val xmax = grid._1
  val ymax = grid._2
  var xpos = random(0, xmax)
  var ypos = random(0, ymax)
  var angle = random(0, 360).toDouble
  //var mat = new Array[Int](3)[]
  
  var pher = false

  
  def move(food: Food) = {
    fill(180)
    angle += random(-5, 5)
        

    if (atFood(food)) pher = true
    if (atHome(home)) pher = false
    
   //if (pher & relAngle < angle) angle = angle + 5 else angle = angle - 5


    xpos += math.sin(math.toRadians(angle + 90)).toFloat
    ypos += math.cos(math.toRadians(angle + 90)).toFloat
    
    if (xpos < 0) {
    	xpos = 0
    	angle += 180
    }
    if (ypos < 0) {
    	ypos = 0
    	angle += 180
    }
    if (xpos > xmax) {
    	xpos = xmax - 1
    	angle += 180
    }
    if (ypos > ymax) {
    	ypos = ymax - 1
    	angle += 180
    }
    
    if (angle > 360) angle = angle - 360
    if (angle < 0) angle = angle + 360

    if (pher & xpos < home.locX)
      if (angle < 180) angle -= 5 else angle += 5
      
    if (pher & xpos > home.locX)
      if (angle < 180) angle += 5 else angle -= 5
      
    if (pher & ypos < home.locY)
      if (angle < 90 | angle > 270) angle -= 5 else angle += 5
      
    if (pher & ypos > home.locY)
      if (angle < 90 | angle > 270) angle += 5 else angle -= 5  
      
    if (pher) xpos
      
    //println(angle)

    if (pher) fill(204, 102, 0) else fill(180)
    ellipse(xpos, ypos, 5, 10)
    //ellipse(mouseX, mouseY, 80, 80);
  } 
  
  def atFood(food: Food): Boolean = {
    val ax = floor(xpos.toDouble)
    val ay = floor(ypos.toDouble)
    val fx = floor(food.locX.toDouble)
    val fy = floor(food.locY.toDouble)
    //println(ax + "   " + fx + "    " + ay + "    " + fy)
    if (ax > fx - 5 & ax < fx + 5 & ay > fy - 5 & ay < fy + 5) true else false
  }
  
  
    def atHome(l: AntHill): Boolean = {
    val ax = floor(xpos.toDouble)
    val ay = floor(ypos.toDouble)
    val fx = floor(l.locX.toDouble)
    val fy = floor(l.locY.toDouble)
    //println(ax + "   " + fx + "    " + ay + "    " + fy)
    if (ax > fx - 5 & ax < fx + 5 & ay > fy - 5 & ay < fy + 5) true else false
  }
}