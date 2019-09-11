package ru.startandroid.myapplicationtestwifi;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {


    Button btnYel, btnBl, btnRed, btnGrn;
    WebView webView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдем View-элементы

        btnYel = (Button) findViewById(R.id.btnYel);
        btnBl = (Button) findViewById(R.id.btnBl);
        btnRed = (Button) findViewById(R.id.btnRed);
        btnGrn = (Button) findViewById(R.id.btnGrn);
        webView = (WebView) findViewById(R.id.webView);


        /**На эту часть можешь не обращать внимание*/
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (v.getId()) {
                    case R.id.btnYel:
                        // кнопка ОК
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl("http://192.168.1.1/ledYelon");
                        break;
                   /* case R.id.btnOff:
                        // кнопка Cancel
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl("http://192.168.1.1/led1off");
                        break;*/
                }
            }
        };

        // присвоим обработчик кнопке OK (btnOk)
        //btnOn.setOnClickListener(oclBtn);
        btnYel.setOnClickListener(oclBtn);

        /*********************************************************/

       btnYel.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View v, MotionEvent event) {
               if(event.getAction() == MotionEvent.ACTION_DOWN)
               {
                   webView.getSettings().setJavaScriptEnabled(true);
                   webView.loadUrl("http://192.168.1.1/ledYelON");
               }
               else if (event.getAction() == MotionEvent.ACTION_UP)
               {
                   webView.getSettings().setJavaScriptEnabled(true);
                   webView.loadUrl("http://192.168.1.1/ledYelOFF");
               }
               return false;
           }
       });

        btnBl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("http://192.168.1.1/ledBlON");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP)
                {
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("http://192.168.1.1/ledBlOFF");
                }
                return false;
            }
        });

        btnRed.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("http://192.168.1.1/ledRedON");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP)
                {
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("http://192.168.1.1/ledRedOFF");
                }
                return false;
            }
        });

        btnGrn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("http://192.168.1.1/ledGrnON");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP)
                {
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("http://192.168.1.1/ledGrnOFF");
                }
                return false;
            }
        });
    }
}