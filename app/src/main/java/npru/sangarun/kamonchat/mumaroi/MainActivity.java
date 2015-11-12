package npru.sangarun.kamonchat.mumaroi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private ManageTABLE objManageTABLE;
    private Spinner typeSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //REquest Database
        objManageTABLE = new ManageTABLE(this);

        //Create Spinner
        createSpinner();
    }   // Main Method

    private void createSpinner() {


        typeSpinner = (Spinner) findViewById(R.id.spinner);
        String[] strType = getResources().getStringArray(R.array.type);
        ArrayAdapter<String> typeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strType);
        typeSpinner.setAdapter(typeAdapter);

    }


}   // Main Class
