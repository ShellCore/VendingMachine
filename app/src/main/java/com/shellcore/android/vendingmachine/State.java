package com.shellcore.android.vendingmachine;

/**
 * Created by MOGC on 04/01/2018.
 */

public interface State {

    void execute(Context context, String input);
}
