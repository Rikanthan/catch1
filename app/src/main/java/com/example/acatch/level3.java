package com.example.acatch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class level3 extends AppCompatActivity {
    ImageButton ImgButton;
    ImageButton ImgButton2;
    ImageButton ImgButton3;
    ImageButton ImgButton1;
    ImageButton ImgButton5;
    ImageButton ImgButton6;
    ImageButton ImgButton7;
    ImageButton ImgButton8;
    ImageButton ImgButton9;

    int x=0;
    int t1=(int)(Math.random()*100);
    int t2=t1%9;
    int bo=((int)(Math.random()*100))%9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        t2=(int)(Math.random()*100)%9;
        ImgButton = (ImageButton)findViewById(R.id.imageButton);

        ImgButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=0;
                if(t==t2)
                {


                    ImgButton.setImageResource(R.drawable.cat);
                    dialog();

                }
                else if(t==bo)
                {
                    ImgButton.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {
                    count();

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
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }
                    else if(t2==6)
                    {
                        ImgButton7.setImageResource(R.drawable.thi);
                    }
                    else if(t2==7)
                    {
                        ImgButton8.setImageResource(R.drawable.thi);
                    }
                    else if(t2==8)
                    {
                        ImgButton9.setImageResource(R.drawable.thi);
                    }
                    

                }
                t2=(int)(Math.random()*100)%9;

            }
        });

        t2=(int)(Math.random()*100)%9;
        ImgButton1 = (ImageButton)findViewById(R.id.imageButton1);

        ImgButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=1;
                if(t==t2)
                {

                    ImgButton1.setImageResource(R.drawable.cat);
                    dialog();




                }
                else if(t==bo)
                {
                    ImgButton1.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {

                    count();
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
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }
                    else if(t2==6)
                    {
                        ImgButton7.setImageResource(R.drawable.thi);
                    }
                    else if(t2==7)
                    {
                        ImgButton8.setImageResource(R.drawable.thi);
                    }
                    else if(t2==8)
                    {
                        ImgButton9.setImageResource(R.drawable.thi);
                    }



                }
                t2=(int)(Math.random()*100)%9;

            }
        });

        t2=(int)(Math.random()*100)%9;
        ImgButton2 = (ImageButton)findViewById(R.id.imageButton2);

        ImgButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=2;
                if(t==t2)
                {

                    ImgButton2.setImageResource(R.drawable.cat);
                    dialog();

                }
                else if(t==bo)
                {
                    ImgButton2.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {
                    count();

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
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }
                    else if(t2==6)
                    {
                        ImgButton7.setImageResource(R.drawable.thi);
                    }
                    else if(t2==7)
                    {
                        ImgButton8.setImageResource(R.drawable.thi);
                    }
                    else if(t2==8)
                    {
                        ImgButton9.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%9;

            }
        });
        t2=(int)(Math.random()*100)%9;
        ImgButton3 = (ImageButton)findViewById(R.id.imageButton3);

        ImgButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=3;
                if(t==t2)
                {

                    ImgButton3.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(t==bo)
                {
                    ImgButton3.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {
                    count();

                    ImgButton3.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%9;
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
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }
                    else if(t2==6)
                    {
                        ImgButton7.setImageResource(R.drawable.thi);
                    }
                    else if(t2==7)
                    {
                        ImgButton8.setImageResource(R.drawable.thi);
                    }
                    else if(t2==8)
                    {
                        ImgButton9.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%9;

            }
        });



        t2=(int)(Math.random()*100)%9;
        ImgButton5 = (ImageButton)findViewById(R.id.imageButton6);

        ImgButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=4;
                if(t==t2)
                {

                    ImgButton5.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(t==bo)
                {
                    ImgButton5.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {
                    count();

                    ImgButton5.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%9;
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
                    else if(t2==3)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }
                    else if(t2==6)
                    {
                        ImgButton7.setImageResource(R.drawable.thi);
                    }
                    else if(t2==7)
                    {
                        ImgButton8.setImageResource(R.drawable.thi);
                    }
                    else if(t2==8)
                    {
                        ImgButton9.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%9;

            }
        });




        t2=(int)(Math.random()*100)%9;
        ImgButton6 = (ImageButton)findViewById(R.id.imageButton7);

        ImgButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=5;
                if(t==t2)
                {

                    ImgButton6.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(t==bo)
                {
                    ImgButton6.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {
                    count();

                    ImgButton3.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%9;
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
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);

                    }
                    else if(t2==6)
                    {
                        ImgButton7.setImageResource(R.drawable.thi);
                    }
                    else if(t2==7)
                    {
                        ImgButton8.setImageResource(R.drawable.thi);
                    }
                    else if(t2==8)
                    {
                        ImgButton9.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%9;

            }
        });


        t2=(int)(Math.random()*100)%9;
        ImgButton7 = (ImageButton)findViewById(R.id.imageButton8);

        ImgButton7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=6;
                if(t==t2)
                {

                    ImgButton7.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(t==bo)
                {
                    ImgButton7.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {
                    count();

                    ImgButton7.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%9;
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
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);

                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }
                    else if(t2==7)
                    {
                        ImgButton8.setImageResource(R.drawable.thi);
                    }
                    else if(t2==8)
                    {
                        ImgButton9.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%9;

            }
        });



        t2=(int)(Math.random()*100)%9;
        ImgButton8 = (ImageButton)findViewById(R.id.imageButton4);

        ImgButton8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=7;
                if(t==t2)
                {

                    ImgButton8.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(t==bo)
                {
                    ImgButton8.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {
                    count();

                    ImgButton8.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%9;
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
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);

                    }
                    else if(t2==6)
                    {
                        ImgButton7.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }
                    else if(t2==8)
                    {
                        ImgButton9.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%9;

            }
        });

        t2=(int)(Math.random()*100)%9;
        ImgButton6 = (ImageButton)findViewById(R.id.imageButton6);

        ImgButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=8;
                if(t==t2)
                {

                    ImgButton9.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(t==bo)
                {
                    ImgButton9.setImageResource(R.drawable.bomp);
                    bomb();
                }
                else
                {
                    count();

                    ImgButton9.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%9;
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
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);

                    }
                    else if(t2==6)
                    {
                        ImgButton7.setImageResource(R.drawable.thi);
                    }
                    else if(t2==7)
                    {
                        ImgButton8.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%9;

            }
        });








    }
    public void dialog()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(level3.this);

        builder.setCancelable(true);
        builder.setTitle("Police catch thief");
        builder.setMessage("Level 3 completed");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                openActivity();
            }
        });
        builder.show();
    }
    public void bomb()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(level3.this);

        builder.setCancelable(true);
        builder.setTitle("You picked bomb");
        builder.setMessage("Level failed");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                openActivity2();
            }
        });
        builder.show();
    }
    public void openActivity()
    {

        Intent intent = new Intent(this, level3.class);
        startActivity(intent);

    }
    public void count()
    {
        x++;
        if(x>4)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(level3.this);

            builder.setCancelable(true);
            builder.setTitle("Thief escapes");
            builder.setMessage("Your attempts limit exceeded");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    openActivity3();
                }
            });
            builder.show();


        }
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, level3.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent = new Intent(this, level3.class);
        startActivity(intent);
    }


}
