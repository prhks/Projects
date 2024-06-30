package com.example.cgpacalc;

import android.graphics.Paint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class sem_overview extends AppCompatActivity {

    AdView mAdView;

    TextView title;
    TextView sno1,sno2,sno3,sno4,sno5,sno6,sno7,sno8,sno9,sno10;
    TextView course1,course2,course3,course4,course5,course6,course7,course8,course9,course10;
    TextView credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8,credit9,credit10;
    TextView grade1,grade2,grade3,grade4,grade5,grade6,grade7,grade8,grade9,grade10;

    DBHelper mydata=new DBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_overview);

        /////////////////////////////////////////////////
        MobileAds.initialize(this,"ca-app-pub-3665830956202942~1802511655");

        mAdView=(AdView)findViewById(R.id.adView1);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        //FOR SETTING THE TITLE OF PERFORMANCE REPORT.
        title=findViewById(R.id.tv_title);
        title.setPaintFlags(title.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        title.setText(getIntent().getStringExtra("message"));



        //FOR SETTING THE TOTAL CREDITS.
        //total_credits.findViewById(R.id.tv_totalCredits);
        TextView tot_credits=findViewById(R.id.tv_totalCredits);

        String Title=title.getText().toString();
        System.out.println(Title);

        if(Title.equals("Sem 1"))
        {
            String TotalCredits=mydata.totalCredits("sem1");
            if(TotalCredits.length()==1)
            {
                TotalCredits="0"+TotalCredits;
                tot_credits.setText(TotalCredits);
            }
            else
                tot_credits.setText(TotalCredits);
        }

        if(Title.equals("Sem 2"))
        {
            String TotalCredits=mydata.totalCredits("sem2");
            if(TotalCredits.length()==1)
            {
                TotalCredits="0"+TotalCredits;
                tot_credits.setText(TotalCredits);
            }
            else
                tot_credits.setText(TotalCredits);
        }

        if(Title.equals("Sem 3"))
        {
            String TotalCredits=mydata.totalCredits("sem3");
            if(TotalCredits.length()==1)
            {
                TotalCredits="0"+TotalCredits;
                tot_credits.setText(TotalCredits);
            }
            else
                tot_credits.setText(TotalCredits);
        }

        if(Title.equals("Sem 4"))
        {
            String TotalCredits=mydata.totalCredits("sem4");
            if(TotalCredits.length()==1)
            {
                TotalCredits="0"+TotalCredits;
                tot_credits.setText(TotalCredits);
            }
            else
                tot_credits.setText(TotalCredits);
        }

        if(Title.equals("Sem 5"))
        {
            String TotalCredits=mydata.totalCredits("sem5");
            if(TotalCredits.length()==1)
            {
                TotalCredits="0"+TotalCredits;
                tot_credits.setText(TotalCredits);
            }
            else
                tot_credits.setText(TotalCredits);
        }

        if(Title.equals("Sem 6"))
        {
            String TotalCredits=mydata.totalCredits("sem6");
            if(TotalCredits.length()==1)
            {
                TotalCredits="0"+TotalCredits;
                tot_credits.setText(TotalCredits);
            }
            else
                tot_credits.setText(TotalCredits);
        }

        if(Title.equals("Sem 7"))
        {
            String TotalCredits=mydata.totalCredits("sem7");
            if(TotalCredits.length()==1)
            {
                TotalCredits="0"+TotalCredits;
                tot_credits.setText(TotalCredits);
            }
            else
                tot_credits.setText(TotalCredits);
        }

        if(Title.equals("Sem 8"))
        {
            String TotalCredits=mydata.totalCredits("sem8");
            if(TotalCredits.length()==1)
            {
                TotalCredits="0"+TotalCredits;
                tot_credits.setText(TotalCredits);
            }
            else
                tot_credits.setText(TotalCredits);
        }

        //FOR SETTING THE GPAs.
        TextView gpa=findViewById(R.id.tv_grade);

        if(Title.equals("Sem 1"))
            gpa.setText(mydata.getGpa("sem1"));

        if(Title.equals("Sem 2"))
            gpa.setText(mydata.getGpa("sem2"));

        if(Title.equals("Sem 3"))
            gpa.setText(mydata.getGpa("sem3"));

        if(Title.equals("Sem 4"))
            gpa.setText(mydata.getGpa("sem4"));

        if(Title.equals("Sem 5"))
            gpa.setText(mydata.getGpa("sem5"));

        if(Title.equals("Sem 6"))
            gpa.setText(mydata.getGpa("sem6"));

        if(Title.equals("Sem 7"))
            gpa.setText(mydata.getGpa("sem7"));

        if(Title.equals("Sem 8"))
            gpa.setText(mydata.getGpa("sem8"));


        //FOR SETTING COURSE DETAILS.
         sno1=findViewById(R.id.tv_sno1);
         sno2=findViewById(R.id.tv_sno2);
         sno3=findViewById(R.id.tv_sno3);
         sno4=findViewById(R.id.tv_sno4);
         sno5=findViewById(R.id.tv_sno5);
         sno6=findViewById(R.id.tv_sno6);
         sno7=findViewById(R.id.tv_sno7);
         sno8=findViewById(R.id.tv_sno8);
         sno9=findViewById(R.id.tv_sno9);
         sno10=findViewById(R.id.tv_sno10);

        course1=findViewById(R.id.tv_course1);
        course2=findViewById(R.id.tv_course2);
        course3=findViewById(R.id.tv_course3);
        course4=findViewById(R.id.tv_course4);
        course5=findViewById(R.id.tv_course5);
        course6=findViewById(R.id.tv_course6);
        course7=findViewById(R.id.tv_course7);
        course8=findViewById(R.id.tv_course8);
        course9=findViewById(R.id.tv_course9);
        course10=findViewById(R.id.tv_course10);

        credit1=findViewById(R.id.tv_credit1);
        credit2=findViewById(R.id.tv_credit2);
        credit3=findViewById(R.id.tv_credit3);
        credit4=findViewById(R.id.tv_credit4);
        credit5=findViewById(R.id.tv_credit5);
        credit6=findViewById(R.id.tv_credit6);
        credit7=findViewById(R.id.tv_credit7);
        credit8=findViewById(R.id.tv_credit8);
        credit9=findViewById(R.id.tv_credit9);
        credit10=findViewById(R.id.tv_credit10);

        grade1=findViewById(R.id.tv_grade1);
        grade2=findViewById(R.id.tv_grade2);
        grade3=findViewById(R.id.tv_grade3);
        grade4=findViewById(R.id.tv_grade4);
        grade5=findViewById(R.id.tv_grade5);
        grade6=findViewById(R.id.tv_grade6);
        grade7=findViewById(R.id.tv_grade7);
        grade8=findViewById(R.id.tv_grade8);
        grade9=findViewById(R.id.tv_grade9);
        grade10=findViewById(R.id.tv_grade10);

        if(Title.equals("Sem 1"))
            printCourseDetails("sem1");

        if(Title.equals("Sem 2"))
            printCourseDetails("sem2");

        if(Title.equals("Sem 3"))
            printCourseDetails("sem3");

        if(Title.equals("Sem 4"))
            printCourseDetails("sem4");

        if(Title.equals("Sem 5"))
            printCourseDetails("sem5");

        if(Title.equals("Sem 6"))
            printCourseDetails("sem6");

        if(Title.equals("Sem 7"))
            printCourseDetails("sem7");

        if(Title.equals("Sem 8"))
            printCourseDetails("sem8");

    }

    public void printCourseDetails(String tname){

        String details[]=new String[31];
        details=mydata.courseDetails(tname);

        if(!(details[0].equals("")) && !(details[1].equals("")) && !(details[2].equals(""))){
            sno1.setText("01");
            course1.setText(details[0]);
            if(details[1].length()==1)
            {
                details[1]="0"+details[1];
                credit1.setText(details[1]);
            }
            else
                credit1.setText(details[1]);
            grade1.setText(details[2]);
        }

        else{
            sno1.setText("");
            course1.setText("");
            credit1.setText("");
            grade1.setText("");
        }

        if(!(details[3].equals("")) && !(details[4].equals("")) && !(details[5].equals(""))){
            sno2.setText("02");
            course2.setText(details[3]);
            if(details[4].length()==1)
            {
                details[4]="0"+details[4];
                credit2.setText(details[4]);
            }
            else
                credit2.setText(details[4]);
            grade2.setText(details[5]);
        }

        else{
            sno2.setText("");
            course2.setText("");
            credit2.setText("");
            grade2.setText("");
        }

        if(!(details[6].equals("")) && !(details[7].equals("")) && !(details[8].equals(""))){
            sno3.setText("03");
            course3.setText(details[6]);
            if(details[7].length()==1)
            {
                details[7]="0"+details[7];
                credit3.setText(details[7]);
            }
            else
                credit3.setText(details[7]);
            grade3.setText(details[8]);
        }

        else{
            sno3.setText("");
            course3.setText("");
            credit3.setText("");
            grade3.setText("");
        }

        if(!(details[9].equals("")) && !(details[10].equals("")) && !(details[11].equals(""))){
            sno4.setText("04");
            course4.setText(details[9]);
            if(details[10].length()==1)
            {
                details[10]="0"+details[10];
                credit4.setText(details[10]);
            }
            else
                credit4.setText(details[10]);
            grade4.setText(details[11]);
        }

        else{
            sno4.setText("");
            course4.setText("");
            credit4.setText("");
            grade4.setText("");
        }

        if(!(details[12].equals("")) && !(details[13].equals("")) && !(details[14].equals(""))){
            sno5.setText("05");
            course5.setText(details[12]);
            if(details[13].length()==1)
            {
                details[13]="0"+details[13];
                credit4.setText(details[13]);
            }
            else
                credit5.setText(details[13]);
            grade5.setText(details[14]);
        }

        else{
            sno5.setText("");
            course5.setText("");
            credit5.setText("");
            grade5.setText("");
        }

        if(!(details[15].equals("")) && !(details[16].equals("")) && !(details[17].equals(""))){
            sno6.setText("06");
            course6.setText(details[15]);
            if(details[16].length()==1)
            {
                details[16]="0"+details[16];
                credit6.setText(details[16]);
            }
            else
                credit6.setText(details[16]);
            grade6.setText(details[17]);
        }

        else{
            sno6.setText("");
            course6.setText("");
            credit6.setText("");
            grade6.setText("");
        }

        if(!(details[18].equals("")) && !(details[19].equals("")) && !(details[20].equals(""))){
            sno7.setText("07");
            course7.setText(details[18]);
            if(details[19].length()==1)
            {
                details[19]="0"+details[19];
                credit7.setText(details[19]);
            }
            else
                credit7.setText(details[19]);
            grade7.setText(details[20]);
        }

        else{
            sno7.setText("");
            course7.setText("");
            credit7.setText("");
            grade7.setText("");
        }

        if(!(details[21].equals("")) && !(details[22].equals("")) && !(details[23].equals(""))){
            sno8.setText("08");
            course8.setText(details[21]);
            if(details[22].length()==1)
            {
                details[22]="0"+details[22];
                credit8.setText(details[22]);
            }
            else
                credit8.setText(details[22]);
            grade8.setText(details[23]);
        }

        else{
            sno8.setText("");
            course8.setText("");
            credit8.setText("");
            grade8.setText("");
        }

        if(!(details[24].equals("")) && !(details[25].equals("")) && !(details[26].equals(""))){
            sno9.setText("09");
            course9.setText(details[24]);
            if(details[25].length()==1)
            {
                details[25]="0"+details[25];
                credit9.setText(details[25]);
            }
            else
                credit9.setText(details[25]);
            grade9.setText(details[26]);
        }

        else{
            sno9.setText("");
            course9.setText("");
            credit9.setText("");
            grade9.setText("");
        }

        if(!(details[27].equals("")) && !(details[28].equals("")) && !(details[29].equals(""))){
            sno10.setText("10");
            course10.setText(details[27]);
            if(details[28].length()==1)
            {
                details[28]="0"+details[28];
                credit9.setText(details[28]);
            }
            else
                credit10.setText(details[28]);
            grade10.setText(details[29]);
        }

        else{
            sno10.setText("");
            course10.setText("");
            credit10.setText("");
            grade10.setText("");
        }
    }


}
