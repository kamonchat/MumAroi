package npru.sangarun.kamonchat.mumaroi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Explicit
    private ManageTABLE objManageTABLE;
    private Spinner typeSpinner;
    private Button toTypeBotton, toAllBotton;
    private int indexAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindwidget();




        //REquest Database
        objManageTABLE = new ManageTABLE(this);

        //Create Spinner
        createSpinner();

        //Botton Controllre
        buttoncontrollre();
    }   // Main Method

    private void buttoncontrollre() {
        toAllBotton.setOnClickListener(this);
        toTypeBotton.setOnClickListener(this);
    }

    private void bindwidget() {
        toTypeBotton = (Button) findViewById(R.id.button);
        toAllBotton = (Button) findViewById(R.id.button2);


    }


    private void createSpinner() {


        typeSpinner = (Spinner) findViewById(R.id.spinner);
        String[] strType = getResources().getStringArray(R.array.type);
        ArrayAdapter<String> typeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strType);
        typeSpinner.setAdapter(typeAdapter);

        typeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                indexAnInt = position + 1;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                indexAnInt = 1;

            }
        });

    }   // createSpinner


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                indexAnInt = 0;
                break;
            case R.id.button2:
                break;
            default:
                indexAnInt =  0;
                break;
        } //switch

        //Intent to RestaurantListView
        Intent objIntent = new Intent(MainActivity. this, RestaurList.class);
        objIntent.putExtra("index", indexAnInt);
        startActivity(objIntent);

    } // onClick
}   // Main Class
