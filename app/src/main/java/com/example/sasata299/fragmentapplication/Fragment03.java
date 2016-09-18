package com.example.sasata299.fragmentapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sasata299 on 16/09/19.
 */
public class Fragment03 extends Fragment {
    public static final String FRAGMENT_NAME = Fragment03.class.getName();

    private View view;

    private PersonalData personalData;

    public Fragment03() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // データを受け取る。
        this.personalData = (PersonalData) getArguments().get("personal_data");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment03, container, false);

        TextView heightText = (TextView) view.findViewById(R.id.text_height);
        heightText.setText(String.valueOf(personalData.getHeight()));

        TextView weightText = (TextView) view.findViewById(R.id.text_weight);
        weightText.setText(String.valueOf(personalData.getWeight()));

        TextView addressText = (TextView) view.findViewById(R.id.text_address);
        addressText.setText(personalData.getAddress());

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
