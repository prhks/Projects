package com.example.cgpacalc;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class my_performance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_performance);

        //FOR CARD VIEW ELEVATION.
        CardView cv1= findViewById(R.id.c1);
        CardView cv2= findViewById(R.id.c2);
        CardView cv3= findViewById(R.id.c3);
        CardView cv4= findViewById(R.id.c4);
        CardView cv5= findViewById(R.id.c5);
        CardView cv6= findViewById(R.id.c6);
        CardView cv7= findViewById(R.id.c7);
        CardView cv8= findViewById(R.id.c8);

        //FOR SHOWING GPAs OF ALL SEMESTERS UNDER MY PERFORMANCE.
        TextView sem1= findViewById(R.id.tv_mp_sem1);
        TextView sem2= findViewById(R.id.tv_mp_sem2);
        TextView sem3= findViewById(R.id.tv_mp_sem3);
        TextView sem4= findViewById(R.id.tv_mp_sem4);
        TextView sem5= findViewById(R.id.tv_mp_sem5);
        TextView sem6= findViewById(R.id.tv_mp_sem6);
        TextView sem7= findViewById(R.id.tv_mp_sem7);
        TextView sem8= findViewById(R.id.tv_mp_sem8);

        DBHelper mydata=new DBHelper(this);

        String s1=mydata.getGpa("sem1");
        String s2=mydata.getGpa("sem2");
        String s3=mydata.getGpa("sem3");
        String s4=mydata.getGpa("sem4");
        String s5=mydata.getGpa("sem5");
        String s6=mydata.getGpa("sem6");
        String s7=mydata.getGpa("sem7");
        String s8=mydata.getGpa("sem8");

        //TextView title1=findViewById(R.id.tv_mp_titleSem1);

        if(s1.equals("")||s1.equals("0"))
        {
            sem1.setText("N/A");
            cv1.setEnabled(false);
            sem1.setEnabled(false);
        }
        else
            {
                cv1.setEnabled(true);
                sem1.setEnabled(true);
                sem1.setText(s1);
            }

        if(s2.equals("")||s2.equals("0"))
        {
            sem2.setText("N/A");
            cv2.setEnabled(false);
            sem2.setEnabled(false);
        }
        else
        {
            cv2.setEnabled(true);
            sem2.setEnabled(true);
            sem2.setText(s2);
        }

        if(s3.equals("")||s3.equals("0"))
        {
            sem3.setText("N/A");
            cv3.setEnabled(false);
            sem3.setEnabled(false);
        }
        else
        {
            cv3.setEnabled(true);
            sem3.setEnabled(true);
            sem3.setText(s3);
        }

        if(s4.equals("")||s4.equals("0"))
        {
            sem4.setText("N/A");
            cv4.setEnabled(false);
            sem4.setEnabled(false);
        }
        else
        {
            cv4.setEnabled(true);
            sem4.setEnabled(true);
            sem4.setText(s4);
        }

        if(s5.equals("")||s5.equals("0"))
        {
            sem5.setText("N/A");
            cv5.setEnabled(false);
            sem5.setEnabled(false);
        }
        else
        {
            cv5.setEnabled(true);
            sem5.setEnabled(true);
            sem5.setText(s5);
        }

        if(s6.equals("")||s6.equals("0"))
        {
            sem6.setText("N/A");
            cv6.setEnabled(false);
            sem6.setEnabled(false);
        }
        else
        {
            cv6.setEnabled(true);
            sem6.setEnabled(true);
            sem6.setText(s6);
        }

        if(s7.equals("")||s7.equals("0"))
        {
            sem7.setText("N/A");
            cv7.setEnabled(false);
            sem7.setEnabled(false);
        }
        else
        {
            cv7.setEnabled(true);
            sem7.setEnabled(true);
            sem7.setText(s7);
        }

        if(s8.equals("")||s8.equals("0"))
        {
            sem8.setText("N/A");
            cv8.setEnabled(false);
            sem8.setEnabled(false);
        }
        else
        {
            cv8.setEnabled(true);
            sem8.setEnabled(true);
            sem8.setText(s8);
        }


        /////////////////////////////////
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem_overview=new Intent(my_performance.this, sem_overview.class);
                sem_overview.putExtra("message","Sem 1");
                startActivity(sem_overview);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem_overview=new Intent(my_performance.this, sem_overview.class);
                sem_overview.putExtra("message","Sem 2");
                startActivity(sem_overview);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem_overview=new Intent(my_performance.this, sem_overview.class);
                sem_overview.putExtra("message","Sem 3");
                startActivity(sem_overview);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem_overview=new Intent(my_performance.this, sem_overview.class);
                sem_overview.putExtra("message","Sem 4");
                startActivity(sem_overview);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem_overview=new Intent(my_performance.this, sem_overview.class);
                sem_overview.putExtra("message","Sem 5");
                startActivity(sem_overview);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem_overview=new Intent(my_performance.this, sem_overview.class);
                sem_overview.putExtra("message","Sem 6");
                startActivity(sem_overview);
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem_overview=new Intent(my_performance.this, sem_overview.class);
                sem_overview.putExtra("message","Sem 7");
                startActivity(sem_overview);
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem_overview=new Intent(my_performance.this, sem_overview.class);
                sem_overview.putExtra("message","Sem 8");
                startActivity(sem_overview);
            }
        });
    }
}
