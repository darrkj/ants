package tt

class Ant(x: Double, y: Double, dir: Double) {
  var xpos = x
  var ypos = y
  var angle = dir
  
  def move(xmax: Float, ymax: Float, tmp: Double) = {
    angle += tmp

    xpos += math.sin(math.toRadians(angle))
    ypos += math.cos(math.toRadians(angle))
    
    if (xpos < 0) {
    	xpos = 0
    	angle += 20
    }
    if (ypos < 0) {
    	ypos = 0
    	angle += 20
    }
    if (xpos > xmax) {
    	xpos = ymax
    	angle += tmp * 4
    }
    if (ypos > ymax) {
    	ypos = ymax
    	angle += tmp * 4
    }
  }
}

