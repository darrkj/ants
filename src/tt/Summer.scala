package util

import processing.core._

object Summer extends PApplet{
  
  // Size of the grid
  val grid = (800, 800)
  
  override def setup(): Unit = {
    size(grid._1, grid._2)    // Instantiate gird with size
  }
  
  val home = new AntHill(grid)    // Create ant hill
  
  val food = new Food(grid)
  
  val n = 200  // Number of ants to create
  
  var ants: List[Ant] = Nil     // Initialize list of ants

  // Loop to add ants to list
  for (i <- 0 until n) ants = ants ::: List(new Ant(grid, home))

  override def draw(): Unit = {
    background(51)
    home.draw()
    food.draw()
    
    // Move ants and draw them
    ants.map(_.move(food))
  }
}