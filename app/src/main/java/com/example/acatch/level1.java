package com.example.acatch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class level1 extends AppCompatActivity {
    ImageButton ImgButton;
    ImageButton ImgButton2;
    ImageButton ImgButton3;
    ImageButton ImgButton1;
     int x=0;
    int t1=(int)(Math.random()*100);
    int t2=t1%4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        t2=(int)(Math.random()*100)%4;
        ImgButton = (ImageButton)findViewById(R.id.imageButton);

        ImgButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=0;
               if(t==t2)
               {


                   ImgButton.setImageResource(R.drawable.cat);
                   AlertDialog.Builder builder = new AlertDialog.Builder(level1.this);

                   builder.setCancelable(true);
                   builder.setTitle("police catch thief");
                   builder.setMessage("Level 1 completed");
                   builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int i) {
                           openActivity();
                       }
                   });
                   builder.show();
                    x++;

               }
               else
                   {
                       x++;
                   ImgButton.setImageResource(R.drawable.polic);
                       if(t2==2)
                       {
                           ImgButton2.setImageResource(R.drawable.thi);
                       }
                       else if(t2==3)
                       {
                           ImgButton3.setImageResource(R.drawable.thi);
                       }
                       else if(t2==1)
                       {
                           ImgButton1.setImageResource(R.drawable.thi);
                       }

               }
                t2=(int)(Math.random()*100)%4;

            }
        });

        t2=(int)(Math.random()*100)%4;
        ImgButton1 = (ImageButton)findViewById(R.id.imageButton2);

        ImgButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=1;
                if(t==t2)
                {

                    ImgButton1.setImageResource(R.drawable.cat);
                    AlertDialog.Builder builder = new AlertDialog.Builder(level1.this);

                    builder.setCancelable(true);
                    builder.setTitle("Police catch thief");
                    builder.setMessage("Level 1 completed");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            openActivity();
                        }
                    });
                    builder.show();




                }
                else
                {
                    x++;
                    ImgButton1.setImageResource(R.drawable.polic);
                    if(t2==2)
                    {
                       ImgButton2.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);
                    }
                    else if(t2==0)
                    {
                        ImgButton.setImageResource(R.drawable.thi);
                    }



                }
                t2=(int)(Math.random()*100)%4;

            }
        });

        t2=(int)(Math.random()*100)%4;
        ImgButton2 = (ImageButton)findViewById(R.id.imageButton3);

        ImgButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=2;
                if(t==t2)
                {

                    ImgButton2.setImageResource(R.drawable.cat);
                    AlertDialog.Builder builder = new AlertDialog.Builder(level1.this);

                    builder.setCancelable(true);
                    builder.setTitle("Police catch thief");
                    builder.setMessage("Level 1 completed");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            openActivity();
                        }
                    });
                    builder.show();

                }
                else
                {
                    x++;
                    ImgButton2.setImageResource(R.drawable.polic);
                    if(t2==1)
                    {
                        ImgButton1.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);
                    }
                    else if(t2==0)
                    {
                        ImgButton.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%4;

            }
        });
        t2=(int)(Math.random()*100)%4;
        ImgButton3 = (ImageButton)findViewById(R.id.imageButton4);

        ImgButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=3;
                if(t==t2)
                {

                    ImgButton3.setImageResource(R.drawable.cat);

                    AlertDialog.Builder builder = new AlertDialog.Builder(level1.this);

                    builder.setCancelable(true);
                    builder.setTitle("Police catch thief");
                    builder.setMessage("Level 1 completed");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            openActivity();
                        }
                    });
                    builder.show();

                }
                else
                {
                    x++;
                    ImgButton3.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%4;
                    if(t2==2)
                    {
                        ImgButton2.setImageResource(R.drawable.thi);
                    }
                    else if(t2==1)
                    {
                        ImgButton1.setImageResource(R.drawable.thi);
                    }
                    else if(t2==0)
                    {
                        ImgButton.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%4;

            }
        });








    }
    public void openActivity()
    {

        Intent intent = new Intent(this, level2.class);
        startActivity(intent);

    }


}