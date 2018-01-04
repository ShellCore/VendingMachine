package com.shellcore.android.vendingmachine;

/**
 * Created by MOGC on 04/01/2018.
 */

public class Unlocked implements State {

    @Override
    public void execute(Context context, String input) {
        if (input.equals("coin")) {
            Output.setOutput("Ya has pagado la tirada");
        } else {
            Output.setOutput("Gracias por jugar");
            context.setState(new Locked());
        }
    }
}
