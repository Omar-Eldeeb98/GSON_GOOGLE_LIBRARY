package com.example.gsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        Gson gson = new Gson(); // object from GSON


        /*  --> DESERIALIZE ARRAY LIST DIRECTLY:

        String json = "[\n" +
                "  {\n" +
                "    \"age\": 40,\n" +
                "    \"role\": \"wife\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"age\": 8,\n" +
                "    \"role\": \"son\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"age\": 5,\n" +
                "    \"role\": \"daughter\"\n" +
                "  }\n" +
                "]\n";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        ArrayList<FamilyMember> family = gson.fromJson( json,familyType );

         */


      /* -->  SERIALIZE ARRAY list DIRECTLY:
        List<FamilyMember> familyMembers = new ArrayList<>(  );
        familyMembers.add( new FamilyMember( "wife" , 40 ) );
        familyMembers.add( new FamilyMember( "son" , 8 ) );
        familyMembers.add( new FamilyMember( "daughter" , 5 ) );

        String json = gson.toJson( familyMembers );

       */

        /*   -->  LISTS DESERIALIZATION:

        String json = "{\"age\":\"30\",\"firstName\":\"Omar\",\"address\":{\"city\":\"Alexandria\",\"country\":\"Egypt\"}," +
                "\"family\":[{\"age\":\"35\",\"role\":\"Wife\"},{\"age\":\"5\",\"role\":\"Daughter\"}]," +
                "\"mail\":\"od55@yahoo.com\"}";

        Employee employee = gson.fromJson( json , Employee.class );

         */


        /*  --> LISTS SERIALIZATION:

        Address address = new Address( "Egypt" , "Alexandria" );
        List<FamilyMember> mFamily = new ArrayList<>(  );
        mFamily.add( new FamilyMember( "Wife" , 35 ) );
        mFamily.add( new FamilyMember( "Daughter" , 5 ) );
        Employee employee = new Employee( "Omar" , 30 , "od55@yahoo.com" , address , mFamily );
        String json = gson.toJson( employee );

       */


        /*  --> NESTED OBJECT DESERIALIZATION:

        String json = "{\"address\":{\"city\":\"alexandria\",\"country\":\"egypt\"},\"firstName\":\"Omar\",\"age\":\"20\",\"mail\":\"oo99@yahoo.com\"}";
        Employee employee = gson.fromJson( json , Employee.class );

         */


      /*     --> NESTED OBJECT SERIALIZATION:

        Address address = new Address( "Egypt" , "Alexandria" );
        Employee employee = new Employee( "Omar" , 20 , "o88@gmail.com" ,address);
        String json = gson.toJson( employee );

         */


          /* --> SIMPLE  SERIALIZATION:

        Employee employee = new Employee( "Omar" , 20,"o77@gamil.com" );// object from the java class Employee
        String json = gson.toJson( employee ); // method to convert java object to json file
        */


         /* --> SIMPLE DESERIALIZATION:

        String json = "{\"first_Name\":\"Omar\",\"age\":\"20\",\"mail\":\"omar22@gmail.com\"}";
        Employee employee = gson.fromJson(json,Employee.class);

          */
    }

}
