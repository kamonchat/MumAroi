package npru.sangarun.kamonchat.mumaroi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class RestaurList extends AppCompatActivity {
    //Explicit
    private int indexAnInt;
    private String[] nameStrings, typeStrings, iconStrings,
            detailStrings, potentialStrings, latStrings, lngStrings, remarkStrings;
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

        objListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent objIntent = new Intent(RestaurList.this, DetailActivity.class);
                objIntent.putExtra("Name", nameStrings[position]);
                objIntent.putExtra("Type", typeStrings[position]);
                objIntent.putExtra("Image", iconInts[position]);
                objIntent.putExtra("Detail", detailStrings[position]);
                objIntent.putExtra("Potential", potentialStrings[position]);
                objIntent.putExtra("Lat", latStrings[position]);
                objIntent.putExtra("Lng", lngStrings[position]);
                objIntent.putExtra("Remark", remarkStrings[position]);



                startActivity(objIntent);

            }
        });




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
                detailStrings = objManageTABLE.readAllData(4);
                potentialStrings = objManageTABLE.readAllData(5);
                latStrings = objManageTABLE.readAllData(6);
                lngStrings = objManageTABLE.readAllData(7);
                remarkStrings = objManageTABLE.readAllData(8);

                int intTimes = 0;
                iconInts = new int[iconStrings.length];
                while (intTimes < nameStrings.length) {
                    iconInts[intTimes] = setUpIconInt(Integer.parseInt(iconStrings[intTimes]));
                    intTimes += 1;
                }   // while

                break;
            case 1:// ร้านอาหาร
                break;
            case 2:// ชาบู-สุกี้
                break;
            case 3:// สเต็ก
                break;
            case 4:// เครื่องดิ่ม
                break;
            case 5:// อาหารจานเดียว
                break;
            case 6:// ปิ้งย่าง
                break;
            case 7:// ซีฟู้ด
                break;
            case 8:// อื่นๆ
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
            case 7:
                intResult = R.drawable.food8;
                break;
            case 8:
                intResult = R.drawable.food9;
                break;
            case 9:
                intResult = R.drawable.food10;
                break;
            case 10:
                intResult = R.drawable.food11;
                break;
            case 11:
                intResult = R.drawable.food12;
                break;
            case 12:
                intResult = R.drawable.food13;
                break;
            case 13:
                intResult = R.drawable.food14;
                break;
            case 14:
                intResult = R.drawable.food15;
                break;
            case 15:
                intResult = R.drawable.food16;
                break;
            case 16:
                intResult = R.drawable.food17;
                break;
            case 17:
                intResult = R.drawable.food18;
                break;
            case 18:
                intResult = R.drawable.food19;
                break;
            case 19:
                intResult = R.drawable.food20;
                break;
            case 20:
                intResult = R.drawable.food21;
                break;


            default:
                intResult = R.drawable.food1;
                break;
        }

        return intResult;
    }

}   // Main Class