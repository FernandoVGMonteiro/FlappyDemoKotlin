package com.mygdx.game.states

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import java.util.*

class GameStateManager {
    // States funciona como uma pilha de estados, o estado
    // no topo é quem é atualizado e renderizado
    private val states = Stack<State>()

    fun push(state: State) {
        states.push(state)
    }

    fun pop() {
        states.pop()
    }

    fun set(state: State) {
        states.pop()
        states.push(state)
    }

    // DT(Delta Time): Tempo entre dois renders
    fun update(dt: Float) {
        states.peek().update(dt)
    }

    // SpriteBatch: Container que renderiza a tela
    fun render(sb: SpriteBatch) {
        states.peek().render(sb)
    }
}