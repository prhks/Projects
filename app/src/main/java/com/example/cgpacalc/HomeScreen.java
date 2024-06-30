package com.example.cgpacalc;


import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Integer.*;

public class HomeScreen extends AppCompatActivity {


    CardView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    Button calc_cgpa,my_performance;

    DBHelper mydata=new DBHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        sem1=findViewById(R.id.cv_sem1);
        sem2=findViewById(R.id.cv_sem2);
        sem3=findViewById(R.id.cv_sem3);
        sem4=findViewById(R.id.cv_sem4);
        sem5=findViewById(R.id.cv_sem5);
        sem6=findViewById(R.id.cv_sem6);
        sem7=findViewById(R.id.cv_sem7);
        sem8=findViewById(R.id.cv_sem8);

        calc_cgpa=findViewById(R.id.btn_calc_cgpa);
        my_performance=findViewById(R.id.btn_my_performance);


        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_intent = new Intent(HomeScreen.this,gpa.class);
                register_intent.putExtra("message","SEMESTER I");
                startActivity(register_intent);


            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_intent = new Intent(HomeScreen.this,gpa.class);
                register_intent.putExtra("message","SEMESTER II");
                startActivity(register_intent);

            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_intent = new Intent(HomeScreen.this,gpa.class);
                register_intent.putExtra("message","SEMESTER III");
                startActivity(register_intent);

            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_intent = new Intent(HomeScreen.this,gpa.class);
                register_intent.putExtra("message","SEMESTER IV");
                startActivity(register_intent);

            }
        });

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_intent = new Intent(HomeScreen.this,gpa.class);
                register_intent.putExtra("message","SEMESTER V");
                startActivity(register_intent);

            }
        });

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_intent = new Intent(HomeScreen.this,gpa.class);
                register_intent.putExtra("message","SEMESTER VI");
                startActivity(register_intent);

            }
        });

        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_intent = new Intent(HomeScreen.this,gpa.class);
                register_intent.putExtra("message","SEMESTER VII");
                startActivity(register_intent);

            }
        });

        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_intent = new Intent(HomeScreen.this,gpa.class);
                register_intent.putExtra("message","SEMESTER VIII");
                startActivity(register_intent);

            }
        });

        my_performance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myPerformance_intent=new Intent(HomeScreen.this,my_performance.class);
                startActivity(myPerformance_intent);
                String s1=mydata.getGpa("sem1");
                String s2=mydata.getGpa("sem2");
                String s3=mydata.getGpa("sem3");
                String s4=mydata.getGpa("sem4");
                String s5=mydata.getGpa("sem5");
                String s6=mydata.getGpa("sem6");
                String s7=mydata.getGpa("sem7");
                String s8=mydata.getGpa("sem8");

                //Toast.makeText(getApplicationContext(),s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n"+s7+"\n"+s8, Toast.LENGTH_LONG).show();
                //mydata.getAll();
            }
        });

        calc_cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //CALCULATE THE CGPA ---- FETCH THE DATA.
                float g1= Float.parseFloat(mydata.getGpa("sem1"));
                float g2= Float.parseFloat(mydata.getGpa("sem2"));
                float g3= Float.parseFloat(mydata.getGpa("sem3"));
                float g4= Float.parseFloat(mydata.getGpa("sem4"));
                float g5= Float.parseFloat(mydata.getGpa("sem5"));
                float g6= Float.parseFloat(mydata.getGpa("sem6"));
                float g7= Float.parseFloat(mydata.getGpa("sem7"));
                float g8= Float.parseFloat(mydata.getGpa("sem8"));


                int c1=parseInt(mydata.totalCredits("sem1"));
                int c2=parseInt(mydata.totalCredits("sem2"));
                int c3=parseInt(mydata.totalCredits("sem3"));
                int c4=parseInt(mydata.totalCredits("sem4"));
                int c5=parseInt(mydata.totalCredits("sem5"));
                int c6=parseInt(mydata.totalCredits("sem6"));
                int c7=parseInt(mydata.totalCredits("sem7"));
                int c8=parseInt(mydata.totalCredits("sem8"));


                float cgpa1=((g1*c1)+(g2*c2)+(g3*c3)+(g4*c4)+(g5*c5)+(g6*c6)+(g7*c7)+(g8*c8))/(float)((c1+c2+c3+c4+c5+c6+c7+c8));
                cgpa1= (float) (Math.round(cgpa1*100.0)/100.0);


                /*CGPA_alertDialog cgpa_alertDialog=new CGPA_alertDialog();
                cgpa_alertDialog.AssignCgpa(Float.toString(cgpa1));
                cgpa_alertDialog.show(getSupportFragmentManager(),"example dialog");*/
                showCgpaDialog(Float.toString(cgpa1));
            }
        });
    }

    public void showCgpaDialog(String cgpa){

        ViewGroup viewGroup=findViewById(R.id.content);


        View dialogView = LayoutInflater.from(this).inflate(R.layout.cgpa_dialog,viewGroup,false);

        AlertDialog.Builder builder=new AlertDialog.Builder(this);


        TextView dialogCgpa=dialogView.findViewById(R.id.dialog_gpa1);
        dialogCgpa.setText(cgpa);
        builder.setView(dialogView);


        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

}
