package com.mike.gradlebuildexperiment;

import com.generated.sample.package_0.AJavaClass;
import com.generated.sample.package_0.Foo699;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar(toolbar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        new Foo699().foo10();
        new com.generated.sample.package_1.Foo699().foo10();
        new com.generated.sample.package_2.Foo699().foo10();
        new com.generated.sample.package_3.Foo699().foo10();
        new com.generated.sample.package_4.Foo699().foo10();
        new com.generated.sample.package_5.Foo699().foo10();
        new com.generated.sample.package_6.Foo699().foo10();
        new com.generated.sample.package_7.Foo699().foo10();
        new com.generated.sample.package_8.Foo699().foo10();
        new com.generated.sample.package_9.Foo699().foo10();
        new com.generated.sample.package_10.Foo699().foo10();
        new com.generated.sample.package_11.Foo699().foo10();
        new com.generated.sample.package_12.Foo699().foo10();
        new com.generated.sample.package_13.Foo699().foo10();
        new com.generated.sample.package_14.Foo699().foo10();
        new AJavaClass().printHello();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
