package sg.edu.rp.c346.colorlist;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    // Step 3a define array list
    // Modify your data class name
    ArrayList<Color> boxList;

    public CustomAdapter(Context context, int resource, ArrayList<Color> objects) { // change the 3rd argument only // Step 3a define array list
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        boxList = objects; // change the list name
    }

    // template for custom view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object

        // Standard code. Don't need to modify
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false); // standard code

        // Step 3b bind the UI elements to each row
        TextView tvColor = (TextView) rowView.findViewById(R.id.textViewColor);
        ImageView ivBox1 = (ImageView) rowView.findViewById(R.id.imageViewBox1);

        Color currentItem = boxList.get(position); // standard code
        tvColor.setText(currentItem.getColor());

        // Step 3c is add and display the UI
        if(currentItem.getColor().equals("blue")) {
            ivBox1.setImageResource(R.drawable.blue_box);
        } else if (currentItem.getColor().equals("orange")) {
            ivBox1.setImageResource(R.drawable.orange_box);
        } else {
            ivBox1.setImageResource(R.drawable.brown_box);
        }

        // return to view corresponding to the data at the specified position
        return rowView;
    }

}
