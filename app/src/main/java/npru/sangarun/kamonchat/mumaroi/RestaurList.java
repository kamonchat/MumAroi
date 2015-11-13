package npru.sangarun.kamonchat.mumaroi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class RestaurList extends AppCompatActivity {
    //Explicit
    private int indexAnInt;
    private String[] nameStrings, typeStrings, iconStrings;
    private int[] iconInts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaur_list);

        //Receive Data
        receiveData();

        //Create ListView
        createListView();

    }   // Main Method

    private void createListView() {

        MyAdpter objMyAdapter = new MyAdpter(RestaurList.this, nameStrings, typeStrings, iconInts);
        ListView objListView = (ListView) findViewById(R.id.listView);
        objListView.setAdapter(objMyAdapter);


    }   // createListView

    private void receiveData() {
        indexAnInt = getIntent().getIntExtra("index", 0);
        Log.d("aoi", "index ==> " + Integer.toString(indexAnInt));

        ManageTABLE objManageTABLE = new ManageTABLE(this);

        switch (indexAnInt) {
            case 0:

                nameStrings = objManageTABLE.readAllData(2);
                typeStrings = objManageTABLE.readAllData(1);
                iconStrings = objManageTABLE.readAllData(3);

                int intTimes = 0;
                iconInts = new int[iconStrings.length];
                while (intTimes < nameStrings.length) {
                    iconInts[intTimes] = setUpIconInt(Integer.parseInt(iconStrings[intTimes]));
                    intTimes += 1;
                }   // while

                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }   //switch

    }   // receiveData

    private int setUpIconInt(int intValue) {

        int intResult = R.drawable.food1;
        switch (intValue) {
            case 0:
                intResult = R.drawable.food1;
                break;
            case 1:
                intResult = R.drawable.food2;
                break;
            case 2:
                intResult = R.drawable.food3;
                break;
            case 3:
                intResult = R.drawable.food4;
                break;
            case 4:
                intResult = R.drawable.food5;
                break;
            case 5:
                intResult = R.drawable.food6;
                break;
            case 6:
                intResult = R.drawable.food7;
                break;
            default:
                intResult = R.drawable.food1;
                break;
        }

        return intResult;
    }

}   // Main Class