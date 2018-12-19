package com.example.vaibhavmishra.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addData(View view) {
        TextView name=findViewById(R.id.name);
        TextView regno=findViewById(R.id.regno);
        TextView age=findViewById(R.id.age);
        if(TextUtils.isEmpty(name.getText())||TextUtils.isEmpty(regno.getText())||TextUtils.isEmpty(age.getText())) {
            Toast.makeText(this,"Fill all fields",Toast.LENGTH_SHORT).show();
            return;
        }
        User user=new User(name.getText().toString(),regno.getText().toString(),Integer.parseInt(age.getText().toString()));
        FirebaseDatabase fb=FirebaseDatabase.getInstance().getReference().getDatabase();
        DatabaseReference dr=fb.getReference("user");
        String key=dr.push().getKey();
        dr.child(key).setValue(user);

        Toast.makeText(this,"Data Added",Toast.LENGTH_SHORT).show();
        name.setText("");
        regno.setText("");
        age.setText("");
    }

    public void fetchData(View view) {
        Intent intent=new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }
}
