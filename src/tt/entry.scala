package util

import processing.core._

object entry extends PApplet{

  def main(args: Array[String]): Unit = {
    var frame = new javax.swing.JFrame("Ant Simulation")
    var applet = Summer
    frame.getContentPane().add(applet)
    applet.init
    frame.pack
    frame.setVisible(true)
  }

}
