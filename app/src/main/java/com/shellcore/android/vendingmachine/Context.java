package com.shellcore.android.vendingmachine;

/**
 * Created by MOGC on 04/01/2018.
 */

public class Context {

    private State state;

    public Context() {
        setState(new Locked());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void execute(String input) {
        this.state.execute(this, input);
    }
}
