package controllers

import javazoom.jl.player.Player
import java.io.FileInputStream

object Audio {
  def playMp3(mp3: String) {
    val fis  = new FileInputStream(mp3)
    val playMP3 = new Player(fis)
    playMP3.play()
  }
}
