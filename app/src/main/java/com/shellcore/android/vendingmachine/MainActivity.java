package com.shellcore.android.vendingmachine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_coin)
    TextView txtCoin;

    Context context = new Context();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_coin, R.id.btn_push})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_coin:
                context.execute("coin");
                break;
            case R.id.btn_push:
                context.execute("push");
                break;
        }

        txtCoin.setText(Output.getOutput());
    }
}
