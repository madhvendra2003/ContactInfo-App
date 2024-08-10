package com.example.contact_ture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.contact_ture.data.DatabaseHandler;
import com.example.contact_ture.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(MainActivity.this);

//        Contact a = new Contact("Greg", "91645");
//        db.addContact(a);
//
//        db.addContact(new Contact("James","213986"));
//        db.addContact(new Contact("Greg","098765"));
//        db.addContact(new Contact("Helena","40678765"));
//        db.addContact(new Contact("Carimo","768345"));
//
//        db.addContact(new Contact("Silo","3445"));
//        db.addContact(new Contact("Santos","6665"));
//        db.addContact(new Contact("Litos","5344"));
//        db.addContact(new Contact("Karate","96534"));
//        db.addContact(new Contact("Guerra","158285"));
//        db.addContact(new Contact("Gema","78130"));
          Contact c = db.getContact(1);

//        int id =   db.updateContact(c);
//        Log.d("row","onCreate: " + id);

//        db.deleteContact(c);

        List<Contact> contactList = db.getAllContacts();

        for (Contact contact : contactList) {
            Log.d("MainActivity", "onCreate: " + contact.getName());

        }



    }
}