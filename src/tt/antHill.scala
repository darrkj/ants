package util

import util.Summer.{fill, random, ellipse}

class AntHill(grid: (Int, Int)) {
	val locX = random(0, grid._1)
	val locY = random(0, grid._2)
	
	
	//
	def draw() = {
	  fill(150)
	  ellipse(locX, locY, 35, 40)
	}
}