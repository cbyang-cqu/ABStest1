/*MainActivit是老版本，参考MainActivity1*/
package com.patac.abstest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void OnNext(View v){
        startActivity(new Intent(MainActivity.this,TestActivity.class));
    }
}
