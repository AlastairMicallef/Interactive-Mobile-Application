package mt.edu.mcast.alastairmicallef.worksheet2;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PizzaOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_option);
    }

    public void OnClickCappriciosa(){
        String value = "Cappriciosa";
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("sample_name",value);
        startActivity(intent);
    }
}
