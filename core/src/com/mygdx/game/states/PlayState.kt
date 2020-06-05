package com.mygdx.game.states

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.mygdx.game.FlappyDemo

class PlayState(gsm: GameStateManager) : State(gsm) {
    private val bird = Texture("bird.png")

    init {
        // Configura a área que será mostrada da câmera
        cam.setToOrtho(false,
                (FlappyDemo.WIDTH / 2).toFloat(),
                (FlappyDemo.HEITGHT / 2).toFloat())
    }

    override fun handleInput() {
//        TODO("Not yet implemented")
    }

    override fun update(dt: Float) {
//        TODO("Not yet implemented")
    }

    override fun render(sb: SpriteBatch) {
        // Projection Matrix mostra onde nós estamos
        // para que seja renderizado apenas o que podemos ver
        sb.projectionMatrix = cam.combined
        sb.begin()
        sb.draw(bird, 50.toFloat(), 50.toFloat())
        sb.end()
    }

    override fun dispose() {
//        TODO("Not yet implemented")
    }
}