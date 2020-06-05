package com.mygdx.game.states

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3

abstract class State(
        gsm: GameStateManager
) {
    // Camera que vai localizar a posição no Game World
    private lateinit var cam: OrthographicCamera
    // Mouse que funciona com coordenadas XYZ
    private lateinit var mouse: Vector3
    // Gerencia os estados/transições entre estados, etc
    private lateinit var gsm: GameStateManager

    abstract fun handleInput()
    // DT: Diferença de tempo entre os frames
    abstract fun update(dt: Float)
    // SP: Container com tudo que a vamos renderizar na tela
    abstract fun render(sb: SpriteBatch)

    init {
        this.gsm = gsm
        cam = OrthographicCamera()
        mouse = Vector3()
    }
}