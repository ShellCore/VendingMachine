package com.shellcore.android.vendingmachine;

/**
 * Created by MOGC on 04/01/2018.
 */

public class Locked implements State {

    @Override
    public void execute(Context context, String input) {
        if (input.equals("coin")) {
            Output.setOutput("Por favor tira de la palanca");
            context.setState(new Unlocked());
        } else {
            Output.setOutput("Inserta una moneda para jugar");
        }
    }
}
