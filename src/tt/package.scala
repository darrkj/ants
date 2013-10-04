
import scala.math._
import scala.util._
import util.Summer.{random, ellipse}


package object util {
  
  def rand(x: Int) =  (for (z <- (1 to x)) yield Random.nextDouble()).toArray

  
  def qrand(x: Int) =  (for (z <- (1 to x)) yield Random.nextGaussian()).toArray
  //val dt = qrand(length)
  
  def normal(x: Int, mean: Double, stddev: Double): Array[Double] = {
	  qrand(x).toList.map(_ * stddev + mean).toArray
  }
  
  def uniform(x: Int, min: Double, max: Double): Array[Double] = {
	  rand(x).toList.map(_ * (max - min) + min).toArray
  }

  def expon(x: Int, lambda: Double): Array[Double] = {
	  rand(x).toList.map(1 - _).map(-Math.log(_)/lambda).toArray
  }
  
  /*val ds = rand(length)
  def mean(): Double = ds.sum / ds.length

  def variance(): Double = {
	  val xbar = mean()
	  ds.toList.map(_ - xbar).map(Math.pow(_, 2)).sum / (ds.length)
  }*/
}