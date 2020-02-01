package com.example.acatch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class level2 extends AppCompatActivity {
    ImageButton ImgButton;
    ImageButton ImgButton2;
    ImageButton ImgButton3;
    ImageButton ImgButton4;
    ImageButton ImgButton5;
    ImageButton ImgButton6;

    int x=0;
    int t1=(int)(Math.random()*100);
    int t2=t1%6;
    int bo=((int)(Math.random()*100))%6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
        
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
                else if(bo==t2)
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
                        ImgButton3.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton4.setImageResource(R.drawable.thi);
                    }
                    else if(t2==1)
                    {
                        ImgButton2.setImageResource(R.drawable.thi);
                    }
                    else if(t2==4)
                    {
                        ImgButton5.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;

            }
        });

        t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
        ImgButton2 = (ImageButton)findViewById(R.id.imageButton2);

        ImgButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=1;
                if(t==t2)
                {

                    ImgButton2.setImageResource(R.drawable.cat);
                    dialog();




                }

                else if(bo==t2)
                {


                    ImgButton2.setImageResource(R.drawable.bomp);
                    bomb();

                }
                else
                {

                    count();
                    ImgButton2.setImageResource(R.drawable.polic);
                    if(t2==2)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton4.setImageResource(R.drawable.thi);
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



                }
                t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;

            }
        });

        t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
        ImgButton3 = (ImageButton)findViewById(R.id.imageButton3);

        ImgButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=2;
                if(t==t2)
                {

                    ImgButton3.setImageResource(R.drawable.cat);
                    dialog();

                }
                else if(bo==t2)
                {


                    ImgButton3.setImageResource(R.drawable.bomp);
                    bomb();

                }
                else
                {
                    count();

                    ImgButton3.setImageResource(R.drawable.polic);
                    if(t2==1)
                    {
                        ImgButton2.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton4.setImageResource(R.drawable.thi);
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

                }
                t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;

            }
        });
        t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
        ImgButton4 = (ImageButton)findViewById(R.id.imageButton4);

        ImgButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=3;
                if(t==t2)
                {

                    ImgButton4.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(bo==t2)
                {


                    ImgButton4.setImageResource(R.drawable.bomp);
                    bomb();

                }
                else
                {
                    count();

                    ImgButton4.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
                    if(t2==2)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);
                    }
                    else if(t2==1)
                    {
                        ImgButton2.setImageResource(R.drawable.thi);
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

                }
                t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;

            }
        });



        t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
        ImgButton5 = (ImageButton)findViewById(R.id.imageButton5);

        ImgButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=4;
                if(t==t2)
                {

                    ImgButton5.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(bo==t2)
                {


                    ImgButton5.setImageResource(R.drawable.bomp);
                    bomb();

                }
                else
                {
                    count();

                    ImgButton5.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
                    if(t2==2)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);
                    }
                    else if(t2==1)
                    {
                        ImgButton2.setImageResource(R.drawable.thi);
                    }
                    else if(t2==0)
                    {
                        ImgButton.setImageResource(R.drawable.thi);
                    }
                    else if(t2==3)
                    {
                        ImgButton4.setImageResource(R.drawable.thi);
                    }
                    else if(t2==5)
                    {
                        ImgButton6.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;

            }
        });




        t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
        ImgButton6 = (ImageButton)findViewById(R.id.imageButton6);

        ImgButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int t=5;
                if(t==t2)
                {

                    ImgButton6.setImageResource(R.drawable.cat);

                    dialog();

                }
                else if(bo==t2)
                {


                    ImgButton6.setImageResource(R.drawable.bomp);
                    bomb();

                }
                else
                {
                    count();

                    ImgButton6.setImageResource(R.drawable.polic);
                    t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;
                    if(t2==2)
                    {
                        ImgButton3.setImageResource(R.drawable.thi);
                    }
                    else if(t2==1)
                    {
                        ImgButton2.setImageResource(R.drawable.thi);
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
                        ImgButton4.setImageResource(R.drawable.thi);
                    }

                }
                t2=(int)(Math.random()*100)%6;
        bo=((int)(Math.random()*100))%6;

            }
        });







    }
    public void bomb()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(level2.this);

        builder.setCancelable(true);
        builder.setTitle("You picked bomb");
        builder.setMessage("Level failed");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                openActivity();
            }
        });
        builder.show();
    }
    public void dialog()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(level2.this);

        builder.setCancelable(true);
        builder.setTitle("Police catch thief");
        builder.setMessage("Level 2 completed");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                openActivity3();
            }
        });
        builder.show();
    }
    public void openActivity()
    {

        Intent intent = new Intent(this, level2.class);
        startActivity(intent);

    }
    public void count()
    {
        x++;
        if(x>4)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(level2.this);

            builder.setCancelable(true);
            builder.setTitle("Thief escapes");
            builder.setMessage("Your attempts limit exceeded");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    openActivity();
                }
            });
            builder.show();


        }
    }
    public void openActivity3()
    {
        Intent intent = new Intent(this, level3.class);
        startActivity(intent);
    }


}
