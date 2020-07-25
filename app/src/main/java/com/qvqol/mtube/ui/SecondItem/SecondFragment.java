package com.qvqol.mtube.ui.SecondItem;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.qvqol.mtube.R;
import com.qvqol.mtube.ui.SecondItem.Tab.SectionsPagerAdapter;

public class SecondFragment extends Fragment {


   private Context context;
     public SecondFragment(Context context ){
          this.context=context;

     }
    private ListView listView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_second_tab, container, false);
        root.setBackgroundColor(Color.WHITE);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(context, getChildFragmentManager());
        return root;
    }
}
