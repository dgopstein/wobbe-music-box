package controllers

import javafx.scene.media.Media
import javafx.scene.media.MediaPlayer

object Audio extends Controllers {

  def playMp3(mp3: String) {
    var hit: Media = new Media(mp3);
    var mediaPlayer: MediaPlayer = new MediaPlayer(hit);
    mediaPlayer.play();
  }
}
