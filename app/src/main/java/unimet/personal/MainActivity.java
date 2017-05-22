package unimet.personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private ListView listaRecetas;
    private ArrayList<String> arrayRecetas=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase= FirebaseDatabase.getInstance().getReference().child("Recetas");

        listaRecetas=(ListView)findViewById(R.id.lvRecetas);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayRecetas);

        FirebaseListAdapter<Receta> adapterF = new FirebaseListAdapter<Receta>(
                this,Receta.class,android.R.layout.simple_list_item_1, mDatabase){
            @Override
            protected void populateView(View v, Receta model, int position) {

                ((ListView)v.findViewById(R.id.lvRecetas))

            }
        };

        listaRecetas.setAdapter(adapter);

        mDatabase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {



                String value = dataSnapshot.getValue(HashMap.class).get("Nombre").toString();

                arrayRecetas.add(value);

                adapter.notifyDataSetChanged();




            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {


            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}
