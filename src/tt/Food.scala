package util


import util.Summer.{fill, rect, random}

class Food(grid: (Int, Int)) {
    
	val locX = random(0, grid._1)
	val locY = random(0, grid._2)
	
	//
	
	def draw() = {
	  fill(150)
	  rect(locX, locY, 20, 20)
	}
}