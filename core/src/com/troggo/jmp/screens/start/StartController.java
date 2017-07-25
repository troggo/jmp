package com.troggo.jmp.screens.start;

import com.badlogic.gdx.InputAdapter;

class StartController extends InputAdapter {

    private final Start screen;

    StartController(Start _screen) {
        screen = _screen;
    }

    @Override
    public boolean touchDown(int x, int y, int pointer, int button) {
        screen.startGame();
        return true;
    }
}