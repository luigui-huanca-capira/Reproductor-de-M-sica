// Autor: luigui alexander huanca capira
// Fecha creación: 2024-09-15
// Fecha última modificación: 2024-09-15
package com.example.luigui2

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.ArrayAdapter
import com.example.luigui2.R

class MusicPlayerActivity : Activity() {
    private lateinit var mediaPlayer: MediaPlayer
    private var isPlaying = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_player)

        val spinner: Spinner = findViewById(R.id.audioSpinner)
        val playButton: Button = findViewById(R.id.playButton)
        val stopButton: Button = findViewById(R.id.stopButton)
        val audioInfo: ImageView = findViewById(R.id.audioInfo)

        // Asegúrate de que los nombres aquí coinciden con los archivos en res/raw
        val audioList = arrayOf("audio1", "audio2", "audio3", "audio4", "audio5")

        // Adaptador para el Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, audioList)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Evento del botón de reproducción
        playButton.setOnClickListener {
            val selectedAudio = spinner.selectedItem.toString()
            playAudio(selectedAudio)  // Reproducir el audio seleccionado
        }

        // Evento del botón de detener
        stopButton.setOnClickListener {
            stopAudio()  // Detener el audio
        }
    }

    // Función para reproducir el audio
    private fun playAudio(audioName: String) {
        if (isPlaying) {
            mediaPlayer.stop()
            mediaPlayer.release()
        }

        // Busca el archivo en la carpeta res/raw por nombre
        val resId = resources.getIdentifier(audioName, "raw", packageName)

        // Crea el MediaPlayer con el recurso de audio
        if (resId != 0) {
            mediaPlayer = MediaPlayer.create(this, resId)
            mediaPlayer.start()
            isPlaying = true
        }
    }

    // Función para detener el audio
    private fun stopAudio() {
        if (isPlaying) {
            mediaPlayer.stop()
            mediaPlayer.release()
            isPlaying = false
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isPlaying) {
            mediaPlayer.release()
        }
    }
}
