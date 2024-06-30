package com.example.cgpacalc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class gpa extends AppCompatActivity {

    Button calc_gpa_btn;
    TextView actionBar,dialogGpa;

    AdView mAdView;
    DBHelper mydata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        ///////////////////////////////////////////////
        //test app ID
        MobileAds.initialize(this,"ca-app-pub-3665830956202942~1802511655");

        mAdView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mydata=new DBHelper(this);
       // LayoutInflater inflater=(LayoutInflater)gpa.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //FOR CHANGING ACTIONBAR
        actionBar=findViewById(R.id.tv_actionBar);
        actionBar.setText(getIntent().getStringExtra("message"));

        //FOR AUTOCOMPLETE TEXT VIEW ---- COURSE SELECTION.
        String[] courses=getResources().getStringArray(R.array.CourseName);

        final AutoCompleteTextView editText1=findViewById(R.id.actv_course1);
        final AutoCompleteTextView editText2=findViewById(R.id.actv_course2);
        final AutoCompleteTextView editText3=findViewById(R.id.actv_course3);
        final AutoCompleteTextView editText4=findViewById(R.id.actv_course4);
        final AutoCompleteTextView editText5=findViewById(R.id.actv_course5);
        final AutoCompleteTextView editText6=findViewById(R.id.actv_course6);
        final AutoCompleteTextView editText7=findViewById(R.id.actv_course7);
        final AutoCompleteTextView editText8=findViewById(R.id.actv_course8);
        final AutoCompleteTextView editText9=findViewById(R.id.actv_course9);
        final AutoCompleteTextView editText10=findViewById(R.id.actv_course10);

        //FOR EDIT TEXT VIEW ---- CREDITS.
        final EditText credit1=findViewById(R.id.et_credit1);
        final EditText credit2=findViewById(R.id.et_credit2);
        final EditText credit3=findViewById(R.id.et_credit3);
        final EditText credit4=findViewById(R.id.et_credit4);
        final EditText credit5=findViewById(R.id.et_credit5);
        final EditText credit6=findViewById(R.id.et_credit6);
        final EditText credit7=findViewById(R.id.et_credit7);
        final EditText credit8=findViewById(R.id.et_credit8);
        final EditText credit9=findViewById(R.id.et_credit9);
        final EditText credit10=findViewById(R.id.et_credit10);

        //FOR EDIT TEXT VIEW ---- GRADES.
        final EditText grade1=findViewById(R.id.et_grade1);
        final EditText grade2=findViewById(R.id.et_grade2);
        final EditText grade3=findViewById(R.id.et_grade3);
        final EditText grade4=findViewById(R.id.et_grade4);
        final EditText grade5=findViewById(R.id.et_grade5);
        final EditText grade6=findViewById(R.id.et_grade6);
        final EditText grade7=findViewById(R.id.et_grade7);
        final EditText grade8=findViewById(R.id.et_grade8);
        final EditText grade9=findViewById(R.id.et_grade9);
        final EditText grade10=findViewById(R.id.et_grade10);


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,courses);

        editText1.setAdapter(adapter);
        editText2.setAdapter(adapter);
        editText3.setAdapter(adapter);
        editText4.setAdapter(adapter);
        editText5.setAdapter(adapter);
        editText6.setAdapter(adapter);
        editText7.setAdapter(adapter);
        editText8.setAdapter(adapter);
        editText9.setAdapter(adapter);
        editText10.setAdapter(adapter);


        //CHECKS WHETHER ALL TABLES ARE EMPTY OR NOT.
        final String semNo=actionBar.getText().toString();
       // if(semNo.equals("SEMESTER I"))
        if(mydata.isEmpty("sem1")){
            mydata.insert("sem1","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","0");

        }

        if(mydata.isEmpty("sem2")){
            mydata.insert("sem2","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","0");

        }

        if(mydata.isEmpty("sem3")){
            mydata.insert("sem3","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","0");

        }

        if(mydata.isEmpty("sem4")){
            mydata.insert("sem4","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","0");

        }

        if(mydata.isEmpty("sem5")){
            mydata.insert("sem5","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","0");

        }

        if(mydata.isEmpty("sem6")){
            mydata.insert("sem6","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","0");

        }

        if(mydata.isEmpty("sem7")){
            mydata.insert("sem7","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","0");

        }

        if(mydata.isEmpty("sem8")){
            mydata.insert("sem8","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","0");

        }

        //Calculate GPA Button.
        calc_gpa_btn=findViewById(R.id.btn_calcGPA);
        calc_gpa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //SAVE IN THE DATABASE
                String cname1=editText1.getText().toString();
                String cname2=editText2.getText().toString();
                String cname3=editText3.getText().toString();
                String cname4=editText4.getText().toString();
                String cname5=editText5.getText().toString();
                String cname6=editText6.getText().toString();
                String cname7=editText7.getText().toString();
                String cname8=editText8.getText().toString();
                String cname9=editText9.getText().toString();
                String cname10=editText10.getText().toString();

                String cred1=credit1.getText().toString();
                String cred2=credit2.getText().toString();
                String cred3=credit3.getText().toString();
                String cred4=credit4.getText().toString();
                String cred5=credit5.getText().toString();
                String cred6=credit6.getText().toString();
                String cred7=credit7.getText().toString();
                String cred8=credit8.getText().toString();
                String cred9=credit9.getText().toString();
                String cred10=credit10.getText().toString();

                String grd1=grade1.getText().toString();
                String grd2=grade2.getText().toString();
                String grd3=grade3.getText().toString();
                String grd4=grade4.getText().toString();
                String grd5=grade5.getText().toString();
                String grd6=grade6.getText().toString();
                String grd7=grade7.getText().toString();
                String grd8=grade8.getText().toString();
                String grd9=grade9.getText().toString();
                String grd10=grade10.getText().toString();


                if(((cname1.equals("")&&(cred1.equals(""))&&grd1.equals(""))||((!cname1.equals(""))&&(!cred1.equals(""))&&(!grd1.equals(""))))&&((cname2.equals("")&&(cred2.equals(""))&&grd2.equals(""))||((!cname2.equals(""))&&(!cred2.equals(""))&&(!grd2.equals(""))))&&((cname3.equals("")&&(cred3.equals(""))&&grd3.equals(""))||((!cname3.equals(""))&&(!cred3.equals(""))&&(!grd3.equals(""))))&&((cname4.equals("")&&(cred4.equals(""))&&grd4.equals(""))||((!cname4.equals(""))&&(!cred4.equals(""))&&(!grd4.equals(""))))&&((cname5.equals("")&&(cred5.equals(""))&&grd5.equals(""))||((!cname5.equals(""))&&(!cred5.equals(""))&&(!grd5.equals(""))))&&((cname6.equals("")&&(cred6.equals(""))&&grd6.equals(""))||((!cname6.equals(""))&&(!cred6.equals(""))&&(!grd6.equals(""))))&&((cname7.equals("")&&(cred7.equals(""))&&grd7.equals(""))||((!cname7.equals(""))&&(!cred7.equals(""))&&(!grd7.equals(""))))&&((cname8.equals("")&&(cred8.equals(""))&&grd8.equals(""))||((!cname8.equals(""))&&(!cred8.equals(""))&&(!grd8.equals(""))))&&((cname9.equals("")&&(cred9.equals(""))&&grd9.equals(""))||((!cname9.equals(""))&&(!cred9.equals(""))&&(!grd9.equals(""))))&&((cname10.equals("")&&(cred10.equals(""))&&grd10.equals(""))||((!cname10.equals(""))&&(!cred10.equals(""))&&(!grd10.equals(""))))) {

                    String cal_gpa = findGpa(cred1, cred2, cred3, cred4, cred5, cred6, cred7, cred8, cred9, cred10, grd1, grd2, grd3, grd4, grd5, grd6, grd7, grd8, grd9, grd10);

                    if (semNo.equals("SEMESTER I"))
                        mydata.Update("sem1", cname1, cred1, grd1, cname2, cred2, grd2, cname3, cred3, grd3, cname4, cred4, grd4, cname5, cred5, grd5, cname6, cred6, grd6, cname7, cred7, grd7, cname8, cred8, grd8, cname9, cred9, grd9, cname10, cred10, grd10, cal_gpa);

                    if (semNo.equals("SEMESTER II"))
                        mydata.Update("sem2", cname1, cred1, grd1, cname2, cred2, grd2, cname3, cred3, grd3, cname4, cred4, grd4, cname5, cred5, grd5, cname6, cred6, grd6, cname7, cred7, grd7, cname8, cred8, grd8, cname9, cred9, grd9, cname10, cred10, grd10, cal_gpa);

                    if (semNo.equals("SEMESTER III"))
                        mydata.Update("sem3", cname1, cred1, grd1, cname2, cred2, grd2, cname3, cred3, grd3, cname4, cred4, grd4, cname5, cred5, grd5, cname6, cred6, grd6, cname7, cred7, grd7, cname8, cred8, grd8, cname9, cred9, grd9, cname10, cred10, grd10, cal_gpa);

                    if (semNo.equals("SEMESTER IV"))
                        mydata.Update("sem4", cname1, cred1, grd1, cname2, cred2, grd2, cname3, cred3, grd3, cname4, cred4, grd4, cname5, cred5, grd5, cname6, cred6, grd6, cname7, cred7, grd7, cname8, cred8, grd8, cname9, cred9, grd9, cname10, cred10, grd10, cal_gpa);

                    if (semNo.equals("SEMESTER V"))
                        mydata.Update("sem5", cname1, cred1, grd1, cname2, cred2, grd2, cname3, cred3, grd3, cname4, cred4, grd4, cname5, cred5, grd5, cname6, cred6, grd6, cname7, cred7, grd7, cname8, cred8, grd8, cname9, cred9, grd9, cname10, cred10, grd10, cal_gpa);

                    if (semNo.equals("SEMESTER VI"))
                        mydata.Update("sem6", cname1, cred1, grd1, cname2, cred2, grd2, cname3, cred3, grd3, cname4, cred4, grd4, cname5, cred5, grd5, cname6, cred6, grd6, cname7, cred7, grd7, cname8, cred8, grd8, cname9, cred9, grd9, cname10, cred10, grd10, cal_gpa);

                    if (semNo.equals("SEMESTER VII"))
                        mydata.Update("sem7", cname1, cred1, grd1, cname2, cred2, grd2, cname3, cred3, grd3, cname4, cred4, grd4, cname5, cred5, grd5, cname6, cred6, grd6, cname7, cred7, grd7, cname8, cred8, grd8, cname9, cred9, grd9, cname10, cred10, grd10, cal_gpa);

                    if (semNo.equals("SEMESTER VIII"))
                        mydata.Update("sem8", cname1, cred1, grd1, cname2, cred2, grd2, cname3, cred3, grd3, cname4, cred4, grd4, cname5, cred5, grd5, cname6, cred6, grd6, cname7, cred7, grd7, cname8, cred8, grd8, cname9, cred9, grd9, cname10, cred10, grd10, cal_gpa);

                    //openDialog(cal_gpa);
                    showCustomDialog(cal_gpa);

                }

                else
                {
                    if(!((cname1.equals("")&&(cred1.equals(""))&&grd1.equals(""))||((!cname1.equals(""))&&(!cred1.equals(""))&&(!grd1.equals(""))))) {
                        if (grd1.equals("")) {
                            grade1.requestFocus();
                            grade1.setError("Grade Cannot be Empty");
                        }

                        if(cred1.equals("")) {
                            credit1.requestFocus();
                            credit1.setError("Credit Cannot be Empty");
                        }

                        if(cname1.equals("")){
                            editText1.requestFocus();
                            editText1.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname2.equals("")&&(cred2.equals(""))&&grd2.equals(""))||((!cname2.equals(""))&&(!cred2.equals(""))&&(!grd2.equals(""))))) {
                        if (grd2.equals("")) {
                            grade2.requestFocus();
                            grade2.setError("Grade Cannot be Empty");
                        }

                        if(cred2.equals("")) {
                            credit2.requestFocus();
                            credit2.setError("Credit Cannot be Empty");
                        }

                        if(cname2.equals("")){
                            editText2.requestFocus();
                            editText2.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname3.equals("")&&(cred3.equals(""))&&grd3.equals(""))||((!cname3.equals(""))&&(!cred3.equals(""))&&(!grd3.equals(""))))) {
                        if (grd3.equals("")) {
                            grade3.requestFocus();
                            grade3.setError("Grade Cannot be Empty");
                        }

                        if(cred3.equals("")) {
                            credit3.requestFocus();
                            credit3.setError("Credit Cannot be Empty");
                        }

                        if(cname3.equals("")){
                            editText3.requestFocus();
                            editText3.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname4.equals("")&&(cred4.equals(""))&&grd4.equals(""))||((!cname4.equals(""))&&(!cred4.equals(""))&&(!grd4.equals(""))))) {
                        if (grd4.equals("")) {
                            grade4.requestFocus();
                            grade4.setError("Grade Cannot be Empty");
                        }

                        if(cred4.equals("")) {
                            credit4.requestFocus();
                            credit4.setError("Credit Cannot be Empty");
                        }

                        if(cname4.equals("")){
                            editText4.requestFocus();
                            editText4.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname5.equals("")&&(cred5.equals(""))&&grd5.equals(""))||((!cname5.equals(""))&&(!cred5.equals(""))&&(!grd5.equals(""))))) {
                        if (grd5.equals("")) {
                            grade5.requestFocus();
                            grade5.setError("Grade Cannot be Empty");
                        }

                        if(cred5.equals("")) {
                            credit5.requestFocus();
                            credit5.setError("Credit Cannot be Empty");
                        }

                        if(cname5.equals("")){
                            editText5.requestFocus();
                            editText5.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname6.equals("")&&(cred6.equals(""))&&grd6.equals(""))||((!cname6.equals(""))&&(!cred6.equals(""))&&(!grd6.equals(""))))) {
                        if (grd6.equals("")) {
                            grade6.requestFocus();
                            grade6.setError("Grade Cannot be Empty");
                        }

                        if(cred6.equals("")) {
                            credit6.requestFocus();
                            credit6.setError("Credit Cannot be Empty");
                        }

                        if(cname6.equals("")){
                            editText6.requestFocus();
                            editText6.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname7.equals("")&&(cred7.equals(""))&&grd7.equals(""))||((!cname7.equals(""))&&(!cred7.equals(""))&&(!grd7.equals(""))))) {
                        if (grd7.equals("")) {
                            grade7.requestFocus();
                            grade7.setError("Grade Cannot be Empty");
                        }

                        if(cred7.equals("")) {
                            credit7.requestFocus();
                            credit7.setError("Credit Cannot be Empty");
                        }

                        if(cname7.equals("")){
                            editText7.requestFocus();
                            editText7.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname8.equals("")&&(cred8.equals(""))&&grd8.equals(""))||((!cname8.equals(""))&&(!cred8.equals(""))&&(!grd8.equals(""))))) {
                        if (grd8.equals("")) {
                            grade8.requestFocus();
                            grade8.setError("Grade Cannot be Empty");
                        }

                        if(cred8.equals("")) {
                            credit8.requestFocus();
                            credit8.setError("Credit Cannot be Empty");
                        }

                        if(cname8.equals("")){
                            editText8.requestFocus();
                            editText8.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname9.equals("")&&(cred9.equals(""))&&grd9.equals(""))||((!cname9.equals(""))&&(!cred9.equals(""))&&(!grd9.equals(""))))) {
                        if (grd9.equals("")) {
                            grade9.requestFocus();
                            grade9.setError("Grade Cannot be Empty");
                        }

                        if(cred9.equals("")) {
                            credit9.requestFocus();
                            credit9.setError("Credit Cannot be Empty");
                        }

                        if(cname9.equals("")){
                            editText9.requestFocus();
                            editText9.setError("Course Name Cannot be Empty");
                        }



                    }

                    if(!((cname10.equals("")&&(cred10.equals(""))&&grd10.equals(""))||((!cname10.equals(""))&&(!cred10.equals(""))&&(!grd10.equals(""))))) {
                        if (grd10.equals("")) {
                            grade10.requestFocus();
                            grade10.setError("Grade Cannot be Empty");
                        }

                        if(cred10.equals("")) {
                            credit10.requestFocus();
                            credit10.setError("Credit Cannot be Empty");
                        }

                        if(cname10.equals("")){
                            editText10.requestFocus();
                            editText10.setError("Course Name Cannot be Empty");
                        }



                    }

                }
            }
        });

        ///////////////
       //grade2=(EditText)findViewById(R.id.et_grade2);
       // EditText editor =new EditText(this);
       //editor.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS);
       /* grade2.setFilters(new InputFilter[] {
                new InputFilter(){

                    @Override
                    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                        if(source.equals("")){
                            return source;
                        }
                        if(source.toString().matches("(S|A|B|C|D|E|F)")){
                            return source;
                        }

                        return "";
                    }
                }
        });*/

    }

    //FOR DIALOG BOX SHOWING GPA.
    public void openDialog(String gpa) {
        ExampleDialog exampleDialog=new ExampleDialog();
        exampleDialog.AssignGpa(gpa);
        exampleDialog.show(getSupportFragmentManager(),"example dialog");

    }

    private void showCustomDialog(String gpa2){


        ViewGroup viewGroup=findViewById(R.id.content);


        View dialogView = LayoutInflater.from(this).inflate(R.layout.gpa_dialog,viewGroup,false);

        AlertDialog.Builder builder=new AlertDialog.Builder(this);


        dialogGpa=dialogView.findViewById(R.id.dialog_gpa1);
        dialogGpa.setText(gpa2);
        builder.setView(dialogView);


        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }


    public String findGpa(String c1,String c2,String c3,String c4,String c5,String c6,String c7,String c8,String c9,String c10,String g1,String g2,String g3,String g4,String g5,String g6,String g7,String g8,String g9,String g10){

        int cr1,cr2,cr3,cr4,cr5,cr6,cr7,cr8,cr9,cr10,gd1,gd2,gd3,gd4,gd5,gd6,gd7,gd8,gd9,gd10;

        if(c1.equals(""))
            cr1=0;
        else
            cr1=Integer.parseInt(c1);

        if(c2.equals(""))
            cr2=0;
        else
            cr2=Integer.parseInt(c2);

        if(c3.equals(""))
            cr3=0;
        else
            cr3=Integer.parseInt(c3);

        if(c4.equals(""))
            cr4=0;
        else
            cr4=Integer.parseInt(c4);

        if(c5.equals(""))
            cr5=0;
        else
            cr5=Integer.parseInt(c5);

        if(c6.equals(""))
            cr6=0;
        else
            cr6=Integer.parseInt(c6);

        if(c7.equals(""))
            cr7=0;
        else
            cr7=Integer.parseInt(c7);

        if(c8.equals(""))
            cr8=0;
        else
            cr8=Integer.parseInt(c8);

        if(c9.equals(""))
            cr9=0;
        else
            cr9=Integer.parseInt(c9);

        if(c10.equals(""))
            cr10=0;
        else
            cr10=Integer.parseInt(c10);


        switch (g1) {
            case "S":
            case "s":
                gd1 = 10;

                break;
            case "A":
            case "a":
                gd1 = 9;

                break;
            case "B":
            case "b":
                gd1 = 8;

                break;
            case "C":
            case "c":
                gd1 = 7;

                break;
            case "D":
            case "d":
                gd1 = 6;

                break;
            case "E":
            case "e":
                gd1 = 5;

                break;
            case "F":
            case "f":
                gd1 = 4;

                break;
            default:
                gd1 = 0;

                break;
        }

        switch (g2) {
            case "S":
            case "s":
                gd2 = 10;
                break;
            case "A":
            case "a":
                gd2 = 9;
                break;
            case "B":
            case "b":
                gd2 = 8;
                break;
            case "C":
            case "c":
                gd2 = 7;
                break;
            case "D":
            case "d":
                gd2 = 6;
                break;
            case "E":
            case "e":
                gd2 = 5;
                break;
            case "F":
            case "f":
                gd2 = 4;
                break;
            default:
                gd2 = 0;
                break;
        }

        switch (g3) {
            case "S":
            case "s":
                gd3 = 10;
                break;
            case "A":
            case "a":
                gd3 = 9;
                break;
            case "B":
            case "b":
                gd3 = 8;
                break;
            case "C":
            case "c":
                gd3 = 7;
                break;
            case "D":
            case "d":
                gd3 = 6;
                break;
            case "E":
            case "e":
                gd3 = 5;
                break;
            case "F":
            case "f":
                gd3 = 4;
                break;
            default:
                gd3 = 0;
                break;
        }

        switch (g4) {
            case "S":
            case "s":
                gd4 = 10;
                break;
            case "A":
            case "a":
                gd4 = 9;
                break;
            case "B":
            case "b":
                gd4 = 8;
                break;
            case "C":
            case "c":
                gd4 = 7;
                break;
            case "D":
            case "d":
                gd4 = 6;
                break;
            case "E":
            case "e":
                gd4 = 5;
                break;
            case "F":
            case "f":
                gd4 = 4;
                break;
            default:
                gd4 = 0;
                break;
        }

        switch (g5) {
            case "S":
            case "s":
                gd5 = 10;
                break;
            case "A":
            case "a":
                gd5 = 9;
                break;
            case "B":
            case "b":
                gd5 = 8;
                break;
            case "C":
            case "c":
                gd5 = 7;
                break;
            case "D":
            case "d":
                gd5 = 6;
                break;
            case "E":
            case "e":
                gd5 = 5;
                break;
            case "F":
            case "f":
                gd5 = 4;
                break;
            default:
                gd5 = 0;
                break;
        }

        switch (g6) {
            case "S":
            case "s":
                gd6 = 10;
                break;
            case "A":
            case "a":
                gd6 = 9;
                break;
            case "B":
            case "b":
                gd6 = 8;
                break;
            case "C":
            case "c":
                gd6 = 7;
                break;
            case "D":
            case "d":
                gd6 = 6;
                break;
            case "E":
            case "e":
                gd6 = 5;
                break;
            case "F":
            case "f":
                gd6 = 4;
                break;
            default:
                gd6 = 0;
                break;
        }

        switch (g7) {
            case "S":
            case "s":
                gd7 = 10;
                break;
            case "A":
            case "a":
                gd7 = 9;
                break;
            case "B":
            case "b":
                gd7 = 8;
                break;
            case "C":
            case "c":
                gd7 = 7;
                break;
            case "D":
            case "d":
                gd7 = 6;
                break;
            case "E":
            case "e":
                gd7 = 5;
                break;
            case "F":
            case "f":
                gd7 = 4;
                break;
            default:
                gd7 = 0;
                break;
        }

        switch (g8) {
            case "S":
            case "s":
                gd8 = 10;
                break;
            case "A":
            case "a":
                gd8 = 9;
                break;
            case "B":
            case "b":
                gd8 = 8;
                break;
            case "C":
            case "c":
                gd8 = 7;
                break;
            case "D":
            case "d":
                gd8 = 6;
                break;
            case "E":
            case "e":
                gd8 = 5;
                break;
            case "F":
            case "f":
                gd8 = 4;
                break;
            default:
                gd8 = 0;
                break;
        }

        switch (g9) {
            case "S":
            case "s":
                gd9 = 10;
                break;
            case "A":
            case "a":
                gd9 = 9;
                break;
            case "B":
            case "b":
                gd9 = 8;
                break;
            case "C":
            case "c":
                gd9 = 7;
                break;
            case "D":
            case "d":
                gd9 = 6;
                break;
            case "E":
            case "e":
                gd9 = 5;
                break;
            case "F":
            case "f":
                gd9 = 4;
                break;
            default:
                gd9 = 0;
                break;
        }

        switch (g10) {
            case "S":
            case "s":
                gd10 = 10;
                break;
            case "A":
            case "a":
                gd10 = 9;
                break;
            case "B":
            case "b":
                gd10= 8;
                break;
            case "C":
            case "c":
                gd10= 7;
                break;
            case "D":
            case "d":
                gd10= 6;
                break;
            case "E":
            case "e":
                gd10= 5;
                break;
            case "F":
            case "f":
                gd10= 4;
                break;
            default:
                gd10= 0;
                break;
        }

        float gpa1=((cr1*gd1)+(cr2*gd2)+(cr3*gd3)+(cr4*gd4)+(cr5*gd5)+(cr6*gd6)+(cr7*gd7)+(cr8*gd8)+(cr9*gd9)+(cr10*gd10))/(float)((cr1+cr2+cr3+cr4+cr5+cr6+cr7+cr8+cr9+cr10));
        gpa1= (float) (Math.round(gpa1*100.0)/100.0);

        return Float.toString(gpa1);
    }



}
