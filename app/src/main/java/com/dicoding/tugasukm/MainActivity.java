package com.dicoding.tugasukm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.btn_my_biodata)
    void Button() {
        Intent Biodata = new Intent(MainActivity.this, Biodataku.class);
        startActivity(Biodata);

    }

    @OnClick(R.id.btn_my_hobby)
    void c() {
        Intent Myhobby = new Intent(MainActivity.this, MyHobby.class);
        startActivity(Myhobby);
    }

    @OnClick(R.id.btn_my_number)
    void b() {
        String phoneNumber = "081210841382";
        Intent mynumberIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
        startActivity(mynumberIntent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void procces(View view) {
        if (view.getId() == R.id.btn_my_email) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"isnawati14021998@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "It's my email");
            intent.putExtra(Intent.EXTRA_TEXT, "You can send your message for me in this email");
            intent.setType("message/rfc882");
            Intent choose = Intent.createChooser(intent, "Send your email");
            startActivity(choose);

        }
    }

}