package com.mygdx.game.states

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3

abstract class State(
        // Gerencia os estados/transições entre estados, etc
        protected val gsm: GameStateManager
) {
    // Camera que vai localizar a posição no Game World
    protected val cam: OrthographicCamera = OrthographicCamera()

    // Mouse que funciona com coordenadas XYZ
    protected val mouse = Vector3()

    abstract fun handleInput()
    // DT: Diferença de tempo entre os frames
    abstract fun update(dt: Float)
    // SP: Container com tudo que a vamos renderizar na tela
    abstract fun render(sb: SpriteBatch)

    // Evita vazamento de memória
    abstract fun dispose()
}