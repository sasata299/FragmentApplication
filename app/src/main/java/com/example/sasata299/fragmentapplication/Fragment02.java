package com.example.sasata299.fragmentapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sasata299 on 16/09/19.
 */
public class Fragment02 extends Fragment {
    public static final String FRAGMENT_NAME = Fragment02.class.getName();

    private View view;

    private PersonalData personalData;

    public Fragment02() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // データを受け取る。
        this.personalData = (PersonalData) getArguments().get("personal_data");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment02, container, false);
        // 名前を設定
        TextView nameText = (TextView) view.findViewById(R.id.text_name);
        nameText.setText(personalData.getName());
        // 年齢を設定
        TextView ageText = (TextView) view.findViewById(R.id.text_age);
        ageText.setText(String.valueOf(personalData.getAge()));

        // 詳細ボタンを設定
        Button buttonDetail = (Button) view.findViewById(R.id.button_detail);
        buttonDetail.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // 詳細画面を表示していなかったら表示する.
                if (getFragmentManager().findFragmentByTag(Fragment03.FRAGMENT_NAME) == null) {
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                            .beginTransaction();
                    Fragment03 fragment = new Fragment03();
                    Bundle args = new Bundle();
                    args.putSerializable("personal_data", personalData);
                    fragment.setArguments(args);

                    transaction.add(R.id.fragment_container, fragment,
                            Fragment03.FRAGMENT_NAME);
                    transaction.addToBackStack(Fragment03.FRAGMENT_NAME);
                    transaction.commit();
                }
            }
        });

        return view;
    }
}
