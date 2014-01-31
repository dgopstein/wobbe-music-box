package controllers

import javazoom.jl.player.Player

object Audio extends Controllers {
  def playMp3(mp3: String) {
    fis: FileInputStream  = new FileInputStream("mysong.mp3");
    playMP3: Player = new Player(fis);
    playMP3.play();
  }
}
