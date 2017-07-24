package sg.edu.rp.c346.colorlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Step 4a define this 3 things and change the data class
    ListView lvBoxArrangement;
    ArrayList<Color> boxArrangementList;
    CustomAdapter caBoxArrangement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 4b standard code // (binding)
        lvBoxArrangement = (ListView)findViewById(R.id.listViewBox);
        boxArrangementList = new ArrayList<Color>();

        caBoxArrangement = new CustomAdapter(this, R.layout.color_row, boxArrangementList);
        lvBoxArrangement.setAdapter(caBoxArrangement);

        // Step 4c create your data object 1, 2, 3.....
        Color item1 = new Color("blue"); // create a Color object named item1
        boxArrangementList.add(item1); // add the object to the Color ArrayList
        Color item2 = new Color("orange");
        boxArrangementList.add(item2);
        Color item3 = new Color("brown");
        boxArrangementList.add(item3);
    }
}
