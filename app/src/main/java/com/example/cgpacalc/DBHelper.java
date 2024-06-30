package com.example.cgpacalc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import static java.lang.Integer.*;

public class DBHelper extends SQLiteOpenHelper {

    static final private String DB_NAME="MyCgpaDb";
    static final private String DB_TABLE1="sem1";
    static final private String DB_TABLE2="sem2";
    static final private String DB_TABLE3="sem3";
    static final private String DB_TABLE4="sem4";
    static final private String DB_TABLE5="sem5";
    static final private String DB_TABLE6="sem6";
    static final private String DB_TABLE7="sem7";
    static final private String DB_TABLE8="sem8";
    static final private int DB_VER=6;

    private Context ctx;
    private SQLiteDatabase myDb;

    DBHelper(Context ct){

        super(ct,DB_NAME,null,DB_VER);
        ctx=ct;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table if not exists "+DB_TABLE1+" (CourseName1 text, Credit1 text, Grade1 text, CourseName2 text, Credit2 text, Grade2 text, CourseName3 text, Credit3 text, Grade3 text, CourseName4 text, Credit4 text, Grade4 text, CourseName5 text, Credit5 text, Grade5 text, CourseName6 text, Credit6 text, Grade6 text, CourseName7 text, Credit7 text, Grade7 text, CourseName8 text, Credit8 text, Grade8 text, CourseName9 text, Credit9 text, Grade9 text, CourseName10 text, Credit10 text, Grade10 text, gpa text );");
        sqLiteDatabase.execSQL("create table if not exists "+DB_TABLE2+" (CourseName1 text, Credit1 text, Grade1 text, CourseName2 text, Credit2 text, Grade2 text, CourseName3 text, Credit3 text, Grade3 text, CourseName4 text, Credit4 text, Grade4 text, CourseName5 text, Credit5 text, Grade5 text, CourseName6 text, Credit6 text, Grade6 text, CourseName7 text, Credit7 text, Grade7 text, CourseName8 text, Credit8 text, Grade8 text, CourseName9 text, Credit9 text, Grade9 text, CourseName10 text, Credit10 text, Grade10 text, gpa text );");
        sqLiteDatabase.execSQL("create table if not exists "+DB_TABLE3+" (CourseName1 text, Credit1 text, Grade1 text, CourseName2 text, Credit2 text, Grade2 text, CourseName3 text, Credit3 text, Grade3 text, CourseName4 text, Credit4 text, Grade4 text, CourseName5 text, Credit5 text, Grade5 text, CourseName6 text, Credit6 text, Grade6 text, CourseName7 text, Credit7 text, Grade7 text, CourseName8 text, Credit8 text, Grade8 text, CourseName9 text, Credit9 text, Grade9 text, CourseName10 text, Credit10 text, Grade10 text, gpa text );");
        sqLiteDatabase.execSQL("create table if not exists "+DB_TABLE4+" (CourseName1 text, Credit1 text, Grade1 text, CourseName2 text, Credit2 text, Grade2 text, CourseName3 text, Credit3 text, Grade3 text, CourseName4 text, Credit4 text, Grade4 text, CourseName5 text, Credit5 text, Grade5 text, CourseName6 text, Credit6 text, Grade6 text, CourseName7 text, Credit7 text, Grade7 text, CourseName8 text, Credit8 text, Grade8 text, CourseName9 text, Credit9 text, Grade9 text, CourseName10 text, Credit10 text, Grade10 text, gpa text );");
        sqLiteDatabase.execSQL("create table if not exists "+DB_TABLE5+" (CourseName1 text, Credit1 text, Grade1 text, CourseName2 text, Credit2 text, Grade2 text, CourseName3 text, Credit3 text, Grade3 text, CourseName4 text, Credit4 text, Grade4 text, CourseName5 text, Credit5 text, Grade5 text, CourseName6 text, Credit6 text, Grade6 text, CourseName7 text, Credit7 text, Grade7 text, CourseName8 text, Credit8 text, Grade8 text, CourseName9 text, Credit9 text, Grade9 text, CourseName10 text, Credit10 text, Grade10 text, gpa text );");
        sqLiteDatabase.execSQL("create table if not exists "+DB_TABLE6+" (CourseName1 text, Credit1 text, Grade1 text, CourseName2 text, Credit2 text, Grade2 text, CourseName3 text, Credit3 text, Grade3 text, CourseName4 text, Credit4 text, Grade4 text, CourseName5 text, Credit5 text, Grade5 text, CourseName6 text, Credit6 text, Grade6 text, CourseName7 text, Credit7 text, Grade7 text, CourseName8 text, Credit8 text, Grade8 text, CourseName9 text, Credit9 text, Grade9 text, CourseName10 text, Credit10 text, Grade10 text, gpa text );");
        sqLiteDatabase.execSQL("create table if not exists "+DB_TABLE7+" (CourseName1 text, Credit1 text, Grade1 text, CourseName2 text, Credit2 text, Grade2 text, CourseName3 text, Credit3 text, Grade3 text, CourseName4 text, Credit4 text, Grade4 text, CourseName5 text, Credit5 text, Grade5 text, CourseName6 text, Credit6 text, Grade6 text, CourseName7 text, Credit7 text, Grade7 text, CourseName8 text, Credit8 text, Grade8 text, CourseName9 text, Credit9 text, Grade9 text, CourseName10 text, Credit10 text, Grade10 text, gpa text );");
        sqLiteDatabase.execSQL("create table if not exists "+DB_TABLE8+" (CourseName1 text, Credit1 text, Grade1 text, CourseName2 text, Credit2 text, Grade2 text, CourseName3 text, Credit3 text, Grade3 text, CourseName4 text, Credit4 text, Grade4 text, CourseName5 text, Credit5 text, Grade5 text, CourseName6 text, Credit6 text, Grade6 text, CourseName7 text, Credit7 text, Grade7 text, CourseName8 text, Credit8 text, Grade8 text, CourseName9 text, Credit9 text, Grade9 text, CourseName10 text, Credit10 text, Grade10 text, gpa text );");
       // Log.i("Database","Table Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+DB_TABLE1);
        db.execSQL("drop table if exists "+DB_TABLE2);
        db.execSQL("drop table if exists "+DB_TABLE3);
        db.execSQL("drop table if exists "+DB_TABLE4);
        db.execSQL("drop table if exists "+DB_TABLE5);
        db.execSQL("drop table if exists "+DB_TABLE6);
        db.execSQL("drop table if exists "+DB_TABLE7);
        db.execSQL("drop table if exists "+DB_TABLE8);
        onCreate(db);
    }

    void insert(String tname,String courseName1, String credit1, String grade1, String courseName2, String credit2, String grade2, String courseName3, String credit3, String grade3, String courseName4, String credit4, String grade4, String courseName5, String credit5, String grade5, String courseName6, String credit6, String grade6, String courseName7, String credit7, String grade7, String courseName8, String credit8, String grade8, String courseName9, String credit9, String grade9, String courseName10, String credit10, String grade10, String gpa){
        myDb=getWritableDatabase();

        myDb.execSQL("insert into "+tname+" (CourseName1,Credit1,Grade1,CourseName2,Credit2,Grade2,CourseName3,Credit3,Grade3,CourseName4,Credit4,Grade4,CourseName5,Credit5,Grade5,CourseName6,Credit6,Grade6,CourseName7,Credit7,Grade7,CourseName8,Credit8,Grade8,CourseName9,Credit9,Grade9,CourseName10,Credit10,Grade10,gpa) values('"+courseName1+"','"+credit1+"','"+grade1+"','"+courseName2+"','"+credit2+"','"+grade2+"','"+courseName3+"','"+credit3+"','"+grade3+"','"+courseName4+"','"+credit4+"','"+grade4+"','"+courseName5+"','"+credit5+"','"+grade5+"','"+courseName6+"','"+credit6+"','"+grade6+"','"+courseName7+"','"+credit7+"','"+grade7+"','"+courseName8+"','"+credit8+"','"+grade8+"','"+courseName9+"','"+credit9+"','"+grade9+"','"+courseName10+"','"+credit10+"','"+grade10+"','"+gpa+"');");
       /* myDb.execSQL("insert into "+DB_TABLE2+" (CourseName1,Credit1,Grade1,CourseName2,Credit2,Grade2,CourseName3,Credit3,Grade3,CourseName4,Credit4,Grade4,CourseName5,Credit5,Grade5,CourseName6,Credit6,Grade6,CourseName7,Credit7,Grade7,CourseName8,Credit8,Grade8,CourseName9,Credit9,Grade9,CourseName10,Credit10,Grade10,gpa) values('"+courseName1+"','"+credit1+"','"+grade1+"','"+courseName2+"','"+credit2+"','"+grade2+"','"+courseName3+"','"+credit3+"','"+grade3+"','"+courseName4+"','"+credit4+"','"+grade4+"','"+courseName5+"','"+credit5+"','"+grade5+"','"+courseName6+"','"+credit6+"','"+grade6+"','"+courseName7+"','"+credit7+"','"+grade7+"','"+courseName8+"','"+credit8+"','"+grade8+"','"+courseName9+"','"+credit9+"','"+grade9+"','"+courseName10+"','"+credit10+"','"+grade10+"','"+gpa+"');");
        myDb.execSQL("insert into "+DB_TABLE3+" (CourseName1,Credit1,Grade1,CourseName2,Credit2,Grade2,CourseName3,Credit3,Grade3,CourseName4,Credit4,Grade4,CourseName5,Credit5,Grade5,CourseName6,Credit6,Grade6,CourseName7,Credit7,Grade7,CourseName8,Credit8,Grade8,CourseName9,Credit9,Grade9,CourseName10,Credit10,Grade10,gpa) values('"+courseName1+"','"+credit1+"','"+grade1+"','"+courseName2+"','"+credit2+"','"+grade2+"','"+courseName3+"','"+credit3+"','"+grade3+"','"+courseName4+"','"+credit4+"','"+grade4+"','"+courseName5+"','"+credit5+"','"+grade5+"','"+courseName6+"','"+credit6+"','"+grade6+"','"+courseName7+"','"+credit7+"','"+grade7+"','"+courseName8+"','"+credit8+"','"+grade8+"','"+courseName9+"','"+credit9+"','"+grade9+"','"+courseName10+"','"+credit10+"','"+grade10+"','"+gpa+"');");
        myDb.execSQL("insert into "+DB_TABLE4+" (CourseName1,Credit1,Grade1,CourseName2,Credit2,Grade2,CourseName3,Credit3,Grade3,CourseName4,Credit4,Grade4,CourseName5,Credit5,Grade5,CourseName6,Credit6,Grade6,CourseName7,Credit7,Grade7,CourseName8,Credit8,Grade8,CourseName9,Credit9,Grade9,CourseName10,Credit10,Grade10,gpa) values('"+courseName1+"','"+credit1+"','"+grade1+"','"+courseName2+"','"+credit2+"','"+grade2+"','"+courseName3+"','"+credit3+"','"+grade3+"','"+courseName4+"','"+credit4+"','"+grade4+"','"+courseName5+"','"+credit5+"','"+grade5+"','"+courseName6+"','"+credit6+"','"+grade6+"','"+courseName7+"','"+credit7+"','"+grade7+"','"+courseName8+"','"+credit8+"','"+grade8+"','"+courseName9+"','"+credit9+"','"+grade9+"','"+courseName10+"','"+credit10+"','"+grade10+"','"+gpa+"');");
        myDb.execSQL("insert into "+DB_TABLE5+" (CourseName1,Credit1,Grade1,CourseName2,Credit2,Grade2,CourseName3,Credit3,Grade3,CourseName4,Credit4,Grade4,CourseName5,Credit5,Grade5,CourseName6,Credit6,Grade6,CourseName7,Credit7,Grade7,CourseName8,Credit8,Grade8,CourseName9,Credit9,Grade9,CourseName10,Credit10,Grade10,gpa) values('"+courseName1+"','"+credit1+"','"+grade1+"','"+courseName2+"','"+credit2+"','"+grade2+"','"+courseName3+"','"+credit3+"','"+grade3+"','"+courseName4+"','"+credit4+"','"+grade4+"','"+courseName5+"','"+credit5+"','"+grade5+"','"+courseName6+"','"+credit6+"','"+grade6+"','"+courseName7+"','"+credit7+"','"+grade7+"','"+courseName8+"','"+credit8+"','"+grade8+"','"+courseName9+"','"+credit9+"','"+grade9+"','"+courseName10+"','"+credit10+"','"+grade10+"','"+gpa+"');");
        myDb.execSQL("insert into "+DB_TABLE6+" (CourseName1,Credit1,Grade1,CourseName2,Credit2,Grade2,CourseName3,Credit3,Grade3,CourseName4,Credit4,Grade4,CourseName5,Credit5,Grade5,CourseName6,Credit6,Grade6,CourseName7,Credit7,Grade7,CourseName8,Credit8,Grade8,CourseName9,Credit9,Grade9,CourseName10,Credit10,Grade10,gpa) values('"+courseName1+"','"+credit1+"','"+grade1+"','"+courseName2+"','"+credit2+"','"+grade2+"','"+courseName3+"','"+credit3+"','"+grade3+"','"+courseName4+"','"+credit4+"','"+grade4+"','"+courseName5+"','"+credit5+"','"+grade5+"','"+courseName6+"','"+credit6+"','"+grade6+"','"+courseName7+"','"+credit7+"','"+grade7+"','"+courseName8+"','"+credit8+"','"+grade8+"','"+courseName9+"','"+credit9+"','"+grade9+"','"+courseName10+"','"+credit10+"','"+grade10+"','"+gpa+"');");
        *///Toast.makeText(ctx,"Inserted Successfully", Toast.LENGTH_LONG).show();
    }

    public void getAll(){
        myDb=getReadableDatabase();

        Cursor cr=myDb.rawQuery("Select * from "+DB_TABLE2,null);

        StringBuilder str=new StringBuilder();

        while(cr.moveToNext()){
            if(cr.getCount()==1){
            String s1=cr.getString(0);
            String s2=cr.getString(1);
            str.append(s1).append("                    ").append(s2).append(" \n");}
        }
        cr.close();
        Toast.makeText(ctx,str.toString(),Toast.LENGTH_LONG).show();
    }

    public Boolean isEmpty(String tname){
        myDb=getWritableDatabase();
        String count= "SELECT count(*) FROM "+tname;
        Cursor mcursor=myDb.rawQuery(count,null);
        mcursor.moveToFirst();
        int icount=mcursor.getInt(0);
        mcursor.close();
        if(icount>0)
            return false;
        else
            return true;
    }

    public void Update(String tname,String cname1,String c1,String g1,String cname2,String c2,String g2,String cname3,String c3,String g3,String cname4,String c4,String g4,String cname5,String c5,String g5,String cname6,String c6,String g6,String cname7,String c7,String g7,String cname8,String c8,String g8,String cname9,String c9,String g9,String cname10,String c10,String g10,String cal_gpa){

        myDb=getWritableDatabase();

        //String query="UPDATE "+tname+" SET CourseName1 = "+cname1+", Credit1 = "+c1+", Grade1="+g1+",CourseName2 = "+cname2+", Credit2 = "+c2+", Grade2="+g2+",CourseName3 = "+cname3+", Credit3 = "+c3+", Grade3="+g3+",CourseName4 = "+cname4+", Credit4 = "+c4+", Grade4="+g4+",CourseName5 = "+cname5+", Credit5 = "+c5+", Grade5="+g5+",CourseName6 = "+cname6+", Credit6 = "+c6+", Grade6="+g6+",CourseName7 = "+cname7+", Credit7 = "+c7+", Grade7="+g7+",CourseName8 = "+cname8+", Credit8 = "+c8+", Grade8="+g8+",CourseName9 = "+cname9+", Credit9 = "+c9+", Grade9="+g9+",CourseName10 = "+cname10+", Credit10 = "+c10+", Grade10="+g10+",gpa="+gpa+"";

        //myDb.execSQL(query);
        ContentValues cv=new ContentValues();
        cv.put("CourseName1",cname1);
        cv.put("Credit1",c1);
        cv.put("Grade1",g1);
        cv.put("CourseName2",cname2);
        cv.put("Credit2",c2);
        cv.put("Grade2",g2);
        cv.put("CourseName3",cname3);
        cv.put("Credit3",c3);
        cv.put("Grade3",g3);
        cv.put("CourseName4",cname4);
        cv.put("Credit4",c4);
        cv.put("Grade4",g4);
        cv.put("CourseName5",cname5);
        cv.put("Credit5",c5);
        cv.put("Grade5",g5);
        cv.put("CourseName6",cname6);
        cv.put("Credit6",c6);
        cv.put("Grade6",g6);
        cv.put("CourseName7",cname7);
        cv.put("Credit7",c7);
        cv.put("Grade7",g7);
        cv.put("CourseName8",cname8);
        cv.put("Credit8",c8);
        cv.put("Grade8",g8);
        cv.put("CourseName9",cname9);
        cv.put("Credit9",c9);
        cv.put("Grade9",g9);
        cv.put("CourseName10",cname10);
        cv.put("Credit10",c10);
        cv.put("Grade10",g10);
        cv.put("gpa",cal_gpa);

        myDb.update(tname,cv,null,null);
        //Toast.makeText(ctx,"Updated Successfully", Toast.LENGTH_LONG).show();

    }

    public String getGpa(String tname){
        myDb=getReadableDatabase();

        Cursor cr=myDb.rawQuery("Select gpa from "+tname,null);
        StringBuilder str=new StringBuilder();
        while (cr.moveToNext()) {
            String s1 = cr.getString(0);
            str.append(s1);
        }
        cr.close();

        return str.toString();
    }

    public String totalCredits(String tname){
        myDb=getReadableDatabase();
        int tc = 0;

        Cursor cr=myDb.rawQuery("SELECT Credit1,Credit2,Credit3,Credit4,Credit5,Credit6,Credit7,Credit8,Credit9,Credit10 from "+tname,null);
        while(cr.moveToNext()){
            String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

            if(cr.getString(0).equals(""))
                c1="0";
            else
                c1=cr.getString(0);

            if(cr.getString(1).equals(""))
                c2="0";
            else
                c2=cr.getString(1);

            if(cr.getString(2).equals(""))
                c3="0";
            else
                c3=cr.getString(2);

            if(cr.getString(3).equals(""))
                c4="0";
            else
                c4=cr.getString(3);

            if(cr.getString(4).equals(""))
                c5="0";
            else
                c5=cr.getString(4);

            if(cr.getString(5).equals(""))
                c6="0";
            else
                c6=cr.getString(5);

            if(cr.getString(6).equals(""))
                c7="0";
            else
                c7=cr.getString(6);

            if(cr.getString(7).equals(""))
                c8="0";
            else
                c8=cr.getString(7);

            if(cr.getString(8).equals(""))
                c9="0";
            else
                c9=cr.getString(8);

            if(cr.getString(9).equals(""))
                c10="0";
            else
                c10=cr.getString(9);

            tc= parseInt(c1)+ parseInt(c2)+ parseInt(c3)+ parseInt(c4)+ parseInt(c5)+ parseInt(c6)+ parseInt(c7)+ parseInt(c8)+ parseInt(c9)+ parseInt(c10);
        }

        cr.close();;
        return Integer.toString(tc);
    }

    public String[] courseDetails(String tname){
        myDb=getReadableDatabase();

        String[] details=new String[31];

        Cursor cr=myDb.rawQuery("SELECT * FROM "+tname,null);
        while(cr.moveToNext()){
            details[0]=cr.getString(0);
            details[1]=cr.getString(1);
            details[2]=cr.getString(2);
            details[3]=cr.getString(3);
            details[4]=cr.getString(4);
            details[5]=cr.getString(5);
            details[6]=cr.getString(6);
            details[7]=cr.getString(7);
            details[8]=cr.getString(8);
            details[9]=cr.getString(9);
            details[10]=cr.getString(10);
            details[11]=cr.getString(11);
            details[12]=cr.getString(12);
            details[13]=cr.getString(13);
            details[14]=cr.getString(14);
            details[15]=cr.getString(15);
            details[16]=cr.getString(16);
            details[17]=cr.getString(17);
            details[18]=cr.getString(18);
            details[19]=cr.getString(19);
            details[20]=cr.getString(20);
            details[21]=cr.getString(21);
            details[22]=cr.getString(22);
            details[23]=cr.getString(23);
            details[24]=cr.getString(24);
            details[25]=cr.getString(25);
            details[26]=cr.getString(26);
            details[27]=cr.getString(27);
            details[28]=cr.getString(28);
            details[29]=cr.getString(29);

        }
        cr.close();
        return details;
    }

}
