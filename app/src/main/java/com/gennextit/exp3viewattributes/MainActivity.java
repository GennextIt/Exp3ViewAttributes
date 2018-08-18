package com.gennextit.exp3viewattributes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etMusicSearch;
    private Button btnMusicSearch;
    private TextView tvMusicDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMusicSearch = (EditText) findViewById(R.id.et_music_search);
        btnMusicSearch = (Button) findViewById(R.id.btn__music_search);
        tvMusicDetail = (TextView) findViewById(R.id.tv_music_detail);

        btnMusicSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchText = etMusicSearch.getText().toString();
                tvMusicDetail.setText("You can search : "+searchText);
                etMusicSearch.setText("");
            }
        });
    }
}
