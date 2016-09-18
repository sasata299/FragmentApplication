package com.example.sasata299.fragmentapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by sasata299 on 16/09/19.
 */
public class Fragment01 extends Fragment {
    public static final String FRAGMENT_NAME = Fragment01.class.getName();

    View view;

    public Fragment01() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment01, container, false);

        Button buttonTanaka = (Button) view.findViewById(R.id.button_tanaka);
        buttonTanaka.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction();
                Fragment02 fragment = new Fragment02();
                // 個別にデータ入力
                Bundle args = new Bundle();
                PersonalData data = new PersonalData();
                data.setName("田中 芳郎");
                data.setAddress("東京都大田区");
                data.setHeight(170.2);
                data.setWeight(65.3);
                data.setAge(32);
                // バンドルにデータセット
                args.putSerializable("personal_data", data);
                // フラグメントにBundle経由でデータを渡す。
                fragment.setArguments(args);

                transaction.replace(R.id.fragment_container, fragment,
                        Fragment02.FRAGMENT_NAME);
                // バックキーで戻れるようにスタック(null)でも可
                transaction.addToBackStack(Fragment02.FRAGMENT_NAME);
                // 画面に表示
                transaction.commit();
            }
        });

        Button buttonSato = (Button) view.findViewById(R.id.button_sato);
        buttonSato.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction();
                Fragment02 fragment = new Fragment02();
                // 個別にデータ入力
                Bundle args = new Bundle();
                PersonalData data = new PersonalData();
                data.setName("佐藤 幸恵");
                data.setAddress("大阪府大阪市");
                data.setHeight(155.5);
                data.setWeight(99.9);
                data.setAge(99);
                // バンドルにデータセット
                args.putSerializable("personal_data", data);
                // フラグメントにBundle経由でデータを渡す。
                fragment.setArguments(args);

                transaction.replace(R.id.fragment_container, fragment,
                        Fragment02.FRAGMENT_NAME);
                // バックキーで戻れるようにスタック(null)でも可
                transaction.addToBackStack(Fragment02.FRAGMENT_NAME);
                // 画面に表示
                transaction.commit();
            }
        });

        Button buttonSuzuki = (Button) view.findViewById(R.id.button_suzuki);
        buttonSuzuki.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction();
                Fragment02 fragment = new Fragment02();
                // 個別にデータ入力
                Bundle args = new Bundle();
                PersonalData data = new PersonalData();
                data.setName("鈴木 功");
                data.setAddress("北海道札幌市");
                data.setHeight(182.6);
                data.setWeight(88.2);
                data.setAge(40);
                // バンドルにデータセット
                args.putSerializable("personal_data", data);
                // フラグメントにBundle経由でデータを渡す。
                fragment.setArguments(args);

                transaction.replace(R.id.fragment_container, fragment,
                        Fragment02.FRAGMENT_NAME);
                // バックキーで戻れるようにスタック(null)でも可
                transaction.addToBackStack(Fragment02.FRAGMENT_NAME);
                // 画面に表示
                transaction.commit();
            }
        });

        return view;
    }
}
