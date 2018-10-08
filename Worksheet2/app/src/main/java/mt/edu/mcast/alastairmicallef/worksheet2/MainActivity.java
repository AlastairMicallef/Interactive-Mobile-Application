package mt.edu.mcast.alastairmicallef.worksheet2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String value = null;
        Bundle bundle = getIntent().getExtras();
        if(bundle  != null){
            value = bundle.getString("sample_name");
        }
        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();


    }
    public void OnClick(View arg0){

        Intent nextScreen = new Intent(getApplicationContext(),PizzaOptionActivity.class);
        startActivity(nextScreen);

    }
}
