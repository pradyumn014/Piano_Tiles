package com.example.android.pianotiles;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.widget.Button;
import android.view.View;
import android.os.Message;
import android.os.Handler;
import android.widget.TextView;

import java.lang.Thread;


public class MainActivity extends AppCompatActivity
{
    int arr[][] = {{0,0},{0,0},{0,0},{0,0}};
    int currentrow=4;
    int ini_start=0;
    int start=0,score=0, time=600;
    Button finishbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random A = new Random();
        int number = A.nextInt(4);
        arr[0][0] = number;
        Button mybutton = (Button) findViewById(R.id.one);
        if (number == 1) mybutton = (Button) findViewById(R.id.two);
        if (number == 2) mybutton = (Button) findViewById(R.id.three);
        if (number == 3) mybutton = (Button) findViewById(R.id.four);
        mybutton.setBackgroundColor(Color.BLACK);


        number = A.nextInt(4);
        arr[1][0] = number;
        mybutton = (Button) findViewById(R.id.five);
        if (number == 1) mybutton = (Button) findViewById(R.id.six);
        if (number == 2) mybutton = (Button) findViewById(R.id.seven);
        if (number == 3) mybutton = (Button) findViewById(R.id.eight);
        mybutton.setBackgroundColor(Color.BLACK);

        number = A.nextInt(3);
        arr[2][0] = number;
        mybutton = (Button) findViewById(R.id.nine);
        if (number == 1) mybutton = (Button) findViewById(R.id.ten);
        if (number == 2) mybutton = (Button) findViewById(R.id.eleven);
        if (number == 3) mybutton = (Button) findViewById(R.id.twelve);
        mybutton.setBackgroundColor(Color.BLACK);

        number = A.nextInt(3);
        arr[3][0] = number;
        mybutton = (Button) findViewById(R.id.thirteen);
        if (number == 1) mybutton = (Button) findViewById(R.id.fourteen);
        if (number == 2) mybutton = (Button) findViewById(R.id.fifteen);
        if (number == 3) mybutton = (Button) findViewById(R.id.sixteen);
        mybutton.setBackgroundColor(Color.BLACK);
        mybutton.setTextColor(Color.WHITE);
        mybutton.setText("Click to Play");

    }

    public void endgame(Button mybutton) {

        start=0;
        mybutton.setTextColor(Color.WHITE);
        mybutton.setText("Click for Score");
        mybutton.setBackgroundColor(Color.RED);
        finishbutton=mybutton;

    }
    public void layout() {

        Button mybutton = (Button) findViewById(R.id.one);
        switch (arr[3][0])
        {
            case 0:mybutton = (Button) findViewById(R.id.thirteen);break;
            case 1:mybutton = (Button) findViewById(R.id.fourteen);break;
            case 2:mybutton = (Button) findViewById(R.id.fifteen);break;
            case 3:mybutton = (Button) findViewById(R.id.sixteen);break;
        }
        mybutton.setBackgroundColor(Color.WHITE);
        mybutton.setText("");
        switch (arr[2][0])
        {
            case 0:mybutton = (Button) findViewById(R.id.thirteen);break;
            case 1:mybutton = (Button) findViewById(R.id.fourteen);break;
            case 2:mybutton = (Button) findViewById(R.id.fifteen);break;
            case 3:mybutton = (Button) findViewById(R.id.sixteen);break;
        }
       if(arr[2][1]==0) mybutton.setBackgroundColor(Color.BLACK); else mybutton.setBackgroundColor(Color.LTGRAY);
        switch (arr[2][0])
        {
            case 0:mybutton = (Button) findViewById(R.id.nine);break;
            case 1:mybutton = (Button) findViewById(R.id.ten);break;
            case 2:mybutton = (Button) findViewById(R.id.eleven);break;
            case 3:mybutton = (Button) findViewById(R.id.twelve);break;
        }
        mybutton.setBackgroundColor(Color.WHITE);
        switch (arr[1][0])
        {
            case 0:mybutton = (Button) findViewById(R.id.nine);break;
            case 1:mybutton = (Button) findViewById(R.id.ten);break;
            case 2:mybutton = (Button) findViewById(R.id.eleven);break;
            case 3:mybutton = (Button) findViewById(R.id.twelve);break;
        }
        if(arr[1][1]==0) mybutton.setBackgroundColor(Color.BLACK); else mybutton.setBackgroundColor(Color.LTGRAY);
        switch (arr[1][0])
        {
            case 0:mybutton = (Button) findViewById(R.id.five);break;
            case 1:mybutton = (Button) findViewById(R.id.six);break;
            case 2:mybutton = (Button) findViewById(R.id.seven);break;
            case 3:mybutton = (Button) findViewById(R.id.eight);break;
        }
        mybutton.setBackgroundColor(Color.WHITE);
        switch (arr[0][0])
        {
            case 0:mybutton = (Button) findViewById(R.id.five);break;
            case 1:mybutton = (Button) findViewById(R.id.six);break;
            case 2:mybutton = (Button) findViewById(R.id.seven);break;
            case 3:mybutton = (Button) findViewById(R.id.eight);break;
        }
        if(arr[0][1]==0) mybutton.setBackgroundColor(Color.BLACK); else mybutton.setBackgroundColor(Color.LTGRAY);
        switch (arr[0][0])
        {
            case 0:mybutton = (Button) findViewById(R.id.one);break;
            case 1:mybutton = (Button) findViewById(R.id.two);break;
            case 2:mybutton = (Button) findViewById(R.id.three);break;
            case 3:mybutton = (Button) findViewById(R.id.four);break;
        }

        mybutton.setBackgroundColor(Color.WHITE);
        Random A = new Random();
        int number = A.nextInt(4);
        mybutton = (Button) findViewById(R.id.one);
        if (number == 1) mybutton = (Button) findViewById(R.id.two);
        if (number == 2) mybutton = (Button) findViewById(R.id.three);
        if (number == 3) mybutton = (Button) findViewById(R.id.four);
        mybutton.setBackgroundColor(Color.BLACK);
        if(arr[3][1]==0)
        {   Button button=(Button) findViewById(R.id.thirteen);
            if(arr[3][0]==1) button=(Button) findViewById(R.id.fourteen);
            else if(arr[3][0]==2) button=(Button) findViewById(R.id.fifteen);
            else if(arr[3][0]==3) button=(Button) findViewById(R.id.sixteen);
            endgame(button);return;}

        for(int i=0;i<2;i++)
        {
            arr[3][i] = arr[2][i];
            arr[2][i] = arr[1][i];
            arr[1][i] = arr[0][i];
        }

        arr[0][0] = number;
        arr[0][1]=0;
        rowupdate();

    }

    final Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
               if(start==1) layout();
            }

        }
    };

    //Thread
    public void startProgress() {

       ini_start=ini_start+1;
        if(start!=0) return ;
       new Thread(new Task()).start();
        start=start+1;
    }

    class Task implements Runnable {
        @Override
        public void run()
        {
            while (start >= 1)
            {
                if(score%50==0&&time>600) time=time-30;
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e)

                {
                }
                Message msg = handler.obtainMessage();
                msg.what = 1;
                handler.sendMessage(msg);
            }

        }

    }
    public void rowupdate()
    {

       if(arr[3][1]==0) currentrow=4;
        else if(arr[2][1]==0) currentrow=3;
        else if(arr[1][1]==0) currentrow=2;
        else if(arr[0][1]==0) currentrow=1;

    }

        public void change(View view)
        {

            Button mybutton = (Button) findViewById(view.getId());
            if(mybutton==finishbutton)
            {
                int win=score;
                Intent someName = new Intent(MainActivity.this, Main2Activity.class);
                Bundle b = new Bundle();
                b.putInt("score", win);
                someName.putExtras(b);
                startActivity(someName);
                finish();
            }
            int col = 0,row=1;
            switch (mybutton.getId())
            {

                case R.id.one:row=1;col = 0;break;
                case R.id.two:row=1;col = 1;break;
                case R.id.three:row=1;col = 2;break;
                case R.id.four:row=1;col = 3;break;
                case R.id.five:row=2;col = 0;break;
                case R.id.six:row=2;col = 1;break;
                case R.id.seven:row=2;col = 2;break;
                case R.id.eight:row=2;col = 3;break;
                case R.id.nine:row=3;col = 0;break;
                case R.id.ten:row=3;col = 1;break;
                case R.id.eleven:row=3;col = 2;break;
                case R.id.twelve:row=3;col = 3;break;
                case R.id.thirteen:row=4;col = 0;break;
                case R.id.fourteen:row=4;col = 1;break;
                case R.id.fifteen:row=4;col = 2;break;
                case R.id.sixteen:row=4;col = 3;break;
            }
            for(int i=currentrow+1;i<=4;i++)
            {
                if (row==i&&arr[i-1][0]==col) return;
            }
             if(currentrow!=row)
             {

                 mybutton.setBackgroundColor(Color.RED);
                 endgame(mybutton);
                 return ;
             }

            if (col == arr[row-1][0])
            {
                view.setBackgroundColor(Color.LTGRAY);
                arr[row-1][1]=1;
                score++;
                TextView myscore=(TextView)findViewById(R.id.scoredisplay);
                myscore.setText(""+score);
                rowupdate();
                if(ini_start==0)startProgress();

            }
            else
            {

                mybutton.setBackgroundColor(Color.RED);
                endgame(mybutton);
                return ;
            }
        }



}