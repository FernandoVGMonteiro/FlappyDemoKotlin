package com.mygdx.game.states

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.mygdx.game.FlappyDemo

class MenuState(gsm: GameStateManager) : State(gsm) {
    private val background: Texture = Texture("bg.png")
    private val playBtn: Texture = Texture("playBtn.png")

    override fun handleInput() {
//        TODO("Not yet implemented")
    }

    override fun update(dt: Float) {
//        TODO("Not yet implemented")
    }

    // O SpriteBatch funciona como uma caixa,
    // abrimos a caixa, colocamos o que queremos
    // renderizar e fechamos a caixa novamente
    override fun render(sb: SpriteBatch) {
        // Abrindo a caixa
        sb.begin()

        // Colocando tudo dentro
        sb.draw(background, 0.toFloat(), 0.toFloat(),
                FlappyDemo.WIDTH.toFloat(), FlappyDemo.HEITGHT.toFloat())
        sb.draw(playBtn, ((FlappyDemo.WIDTH / 2) - (playBtn.width / 2)).toFloat(),
                (FlappyDemo.HEITGHT / 2).toFloat())

        // Fechando a caixa
        sb.end()
    }
}