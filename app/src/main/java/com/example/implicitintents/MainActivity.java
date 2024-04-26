package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    1 usage
    private EditText mWebsiteEditText ;
1 usage
    private EditText mLocationEditText;
1 usage
    private EditText mShareTextEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebsiteEditText= findViewById(r.id.Website_edittext);
        mLocationEditText= findviewById(r.id.location_edittext);
        mShareTextEditText= findviewById(r.id.share_edittext);

    }
1 usage
public void openiWebsite(View view) {
    {1 usage

        public void openiWebsite(View view)
        {
        String url = mWebsiteEditText.getText().toString();

        uri webpage = uri.prase(url):
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);

        if (intent.resolveActivity(getPackageManager()) != null){startActivity(intent);
        }else {
            log.d(tag:"Implicitents",msg:"can't handlethis intentent!");
        }

    }
    }
    {1 usage

        public void openLocation(View view)
        {
            String loc = mLocationEditText.getText().toString();
            uri addressUri1 = uri.prase(eriString "geo:0,?q=" +loc);
            Intent intent = new Intent(Intent.ACTION_VIEW,addressUri1);

            if (intent.resolveActivity(getPackageManager()) != null){startActivity(intent);
            }else {
                log.d(tag:"Implicitents",msg:"can't handlethis intentent!");

        }
            {1 usage

                public void shareText(View view)
                {
                    string txt =mShareTextEditText.getText().toString();
                    String mimeType = "text/plain";
                    ShareCompat.intentbuilder
                            .form(launchingActivity: this )
                             .setType(mimeType)
                             .setChooserTitle(R.string.share_text_with)
                              .setText(txt)
                               .starchooser();

}
