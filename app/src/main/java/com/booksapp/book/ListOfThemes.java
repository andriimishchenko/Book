package com.booksapp.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.RelativeLayout;
import android.widget.SimpleExpandableListAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class ListOfThemes extends AppCompatActivity {

    ExpandableListView listOfItems;
    AdapterHelper ah;
    SimpleExpandableListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Думай и богатей");

        RelativeLayout relLayout=new RelativeLayout(this);
        RelativeLayout.LayoutParams relLayoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        listOfItems=new ExpandableListView(this);
        listOfItems.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));

        ah = new AdapterHelper(this);
        adapter = ah.getAdapter();


        listOfItems.setAdapter(adapter);
        setContentView(relLayout, relLayoutParams);
        setContentView(listOfItems);

        listOfItems.setOnChildClickListener(new OnChildClickListener() {
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition,   int childPosition, long id) {
                if (groupPosition==0){
                    switch (childPosition){
                        case 0:
                            Intent intent1 = new Intent(getBaseContext(), Page001.class);
                            startActivity(intent1);
                        break;
                        case 1:
                            Intent intent2 = new Intent(getBaseContext(), Page002.class);
                            startActivity(intent2);
                            break;
                        case 2:
                            Intent intent3 = new Intent(getBaseContext(), Page003.class);
                            startActivity(intent3);
                            break;
                        case 3:
                            Intent intent4 = new Intent(getBaseContext(), Page004.class);
                            startActivity(intent4);
                            break;
                    }
                }
                else if  (groupPosition==1){
                    switch (childPosition){
                        case 0:
                            Intent intent_100 = new Intent(getBaseContext(), Page101.class);
                            startActivity(intent_100);
                            break;
                        case 1:
                            Intent intent_101 = new Intent(getBaseContext(), Page102.class);
                            startActivity(intent_101);
                            break;
                        case 2:
                            Intent intent_102 = new Intent(getBaseContext(), Page103.class);
                            startActivity(intent_102);
                            break;
                        case 3:
                            Intent intent_103 = new Intent(getBaseContext(), Page104.class);
                            startActivity(intent_103);
                            break;
                        case 4:
                            Intent intent_104 = new Intent(getBaseContext(), Page105.class);
                            startActivity(intent_104);
                            break;
                        case 5:
                            Intent intent_105 = new Intent(getBaseContext(), Page106.class);
                            startActivity(intent_105);
                            break;
                        case 6:
                            Intent intent_106 = new Intent(getBaseContext(), Page107.class);
                            startActivity(intent_106);
                            break;
                        case 7:
                            Intent intent_107 = new Intent(getBaseContext(), Page108.class);
                            startActivity(intent_107);
                            break;
                        case 8:
                            Intent intent_108 = new Intent(getBaseContext(), Page109.class);
                            startActivity(intent_108);
                            break;
                        case 9:
                            Intent intent_109 = new Intent(getBaseContext(), Page110.class);
                            startActivity(intent_109);
                            break;
                        case 10:
                            Intent intent_110 = new Intent(getBaseContext(), Page111.class);
                            startActivity(intent_110);
                            break;
                    }
                    }
                else if  (groupPosition==2){
                    switch (childPosition){
                        case 0:
                            Intent intent_100 = new Intent(getBaseContext(), Page201.class);
                            startActivity(intent_100);
                            break;
                        case 1:
                            Intent intent_101 = new Intent(getBaseContext(), Page202.class);
                            startActivity(intent_101);
                            break;
                        case 2:
                            Intent intent_102 = new Intent(getBaseContext(), Page203.class);
                            startActivity(intent_102);
                            break;
                        case 3:
                            Intent intent_103 = new Intent(getBaseContext(), Page204.class);
                            startActivity(intent_103);
                            break;
                        case 4:
                            Intent intent_104 = new Intent(getBaseContext(), Page205.class);
                            startActivity(intent_104);
                            break;
                        case 5:
                            Intent intent_105 = new Intent(getBaseContext(), Page206.class);
                            startActivity(intent_105);
                            break;
                        case 6:
                            Intent intent_106 = new Intent(getBaseContext(), Page207.class);
                            startActivity(intent_106);
                            break;
                        case 7:
                            Intent intent_107 = new Intent(getBaseContext(), Page208.class);
                            startActivity(intent_107);
                            break;
                        case 8:
                            Intent intent_108 = new Intent(getBaseContext(), Page209.class);
                            startActivity(intent_108);
                            break;
                        case 9:
                            Intent intent_109 = new Intent(getBaseContext(), Page210.class);
                            startActivity(intent_109);
                            break;
                        case 10:
                            Intent intent_110 = new Intent(getBaseContext(), Page211.class);
                            startActivity(intent_110);
                            break;
                        case 11:
                            Intent intent_111 = new Intent(getBaseContext(), Page212.class);
                            startActivity(intent_111);
                            break;
                        case 12:
                            Intent intent_112 = new Intent(getBaseContext(), Page213.class);
                            startActivity(intent_112);
                            break;
                    }
                }
                else if  (groupPosition==3){
                    switch (childPosition){
                        case 0:
                            Intent intent_100 = new Intent(getBaseContext(), Page301.class);
                            startActivity(intent_100);
                            break;
                        case 1:
                            Intent intent_101 = new Intent(getBaseContext(), Page302.class);
                            startActivity(intent_101);
                            break;
                        case 2:
                            Intent intent_102 = new Intent(getBaseContext(), Page303.class);
                            startActivity(intent_102);
                            break;
                        case 3:
                            Intent intent_103 = new Intent(getBaseContext(), Page304.class);
                            startActivity(intent_103);
                            break;
                        case 4:
                            Intent intent_104 = new Intent(getBaseContext(), Page305.class);
                            startActivity(intent_104);
                            break;
                        case 5:
                            Intent intent_105 = new Intent(getBaseContext(), Page306.class);
                            startActivity(intent_105);
                            break;
                        case 6:
                            Intent intent_106 = new Intent(getBaseContext(), Page307.class);
                            startActivity(intent_106);
                            break;
                        case 7:
                            Intent intent_107 = new Intent(getBaseContext(), Page308.class);
                            startActivity(intent_107);
                            break;
                        case 8:
                            Intent intent_108 = new Intent(getBaseContext(), Page309.class);
                            startActivity(intent_108);
                            break;
                        case 9:
                            Intent intent_109 = new Intent(getBaseContext(), Page310.class);
                            startActivity(intent_109);
                            break;
                    }
                }
//                else if  (groupPosition==4){
//                    switch (childPosition){
//                        case 0:
//                            Intent intent_100 = new Intent(getBaseContext(), Page401.class);
//                            startActivity(intent_100);
//                            break;
//                        case 1:
//                            Intent intent_101 = new Intent(getBaseContext(), Page402.class);
//                            startActivity(intent_101);
//                            break;
//                        case 2:
//                            Intent intent_102 = new Intent(getBaseContext(), Page403.class);
//                            startActivity(intent_102);
//                            break;
//                        case 3:
//                            Intent intent_103 = new Intent(getBaseContext(), Page404.class);
//                            startActivity(intent_103);
//                            break;
//                        case 4:
//                            Intent intent_104 = new Intent(getBaseContext(), Page405.class);
//                            startActivity(intent_104);
//                            break;
//                        case 5:
//                            Intent intent_105 = new Intent(getBaseContext(), Page406.class);
//                            startActivity(intent_105);
//                            break;
//                    }
//                }
//                else if  (groupPosition==5){
//                    switch (childPosition){
//                        case 0:
//                            Intent intent_100 = new Intent(getBaseContext(), Page501.class);
//                            startActivity(intent_100);
//                            break;
//                        case 1:
//                            Intent intent_101 = new Intent(getBaseContext(), Page502.class);
//                            startActivity(intent_101);
//                            break;
//                        case 2:
//                            Intent intent_102 = new Intent(getBaseContext(), Page503.class);
//                            startActivity(intent_102);
//                            break;
//                        case 3:
//                            Intent intent_103 = new Intent(getBaseContext(), Page504.class);
//                            startActivity(intent_103);
//                            break;
//                        case 4:
//                            Intent intent_104 = new Intent(getBaseContext(), Page505.class);
//                            startActivity(intent_104);
//                            break;
//                        case 5:
//                            Intent intent_105 = new Intent(getBaseContext(), Page506.class);
//                            startActivity(intent_105);
//                            break;
//                        case 6:
//                            Intent intent_106 = new Intent(getBaseContext(), Page506.class);
//                            startActivity(intent_106);
//                            break;
//                        case 7:
//                            Intent intent_107 = new Intent(getBaseContext(), Page506.class);
//                            startActivity(intent_107);
//                            break;
//                        case 8:
//                            Intent intent_108 = new Intent(getBaseContext(), Page506.class);
//                            startActivity(intent_108);
//                            break;
//                        case 9:
//                            Intent intent_109 = new Intent(getBaseContext(), Page506.class);
//                            startActivity(intent_109);
//                            break;
//                        case 10:
//                            Intent intent_110 = new Intent(getBaseContext(), Page506.class);
//                            startActivity(intent_110);
//                            break;
//                        case 11:
//                            Intent intent_111 = new Intent(getBaseContext(), Page506.class);
//                            startActivity(intent_111);
//                            break;
//                        case 12:
//                            Intent intent_112 = new Intent(getBaseContext(), Page506.class);
//                            startActivity(intent_112);
//                            break;
//                        case 13:
//                            Intent intent_113 = new Intent(getBaseContext(), Page514.class);
//                            startActivity(intent_113);
//                            break;
//                    }
//                }
                return false;}
        });
    }



 }
