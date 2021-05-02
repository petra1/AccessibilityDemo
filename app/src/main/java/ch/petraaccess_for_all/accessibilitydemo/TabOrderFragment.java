package ch.petraaccess_for_all.accessibilitydemo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class TabOrderFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TabOrderFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    //from here copy
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tab_order, container, false);

        Button button01 = v.findViewById(R.id.button01);
        Button button02 = v.findViewById(R.id.button02);
        ImageButton imageButton3 = v.findViewById(R.id.imageButton3);
        imageButton3.setContentDescription(getString(R.string.help));
        ImageButton imageButton4 = v.findViewById(R.id.imageButton4);
        imageButton4.setContentDescription(getString(R.string.help));
        final TextView textView01 = v.findViewById(R.id.textView01);
        final TextView textView02 = v.findViewById(R.id.textView02);
        final EditText editText01 = v.findViewById(R.id.editText01);
        final EditText editText02 = v.findViewById(R.id.editText02);


        button01.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView01.setText(editText01.getText());
                        textView01.setContentDescription(getString(R.string.your_first_name_is) + textView01.getText() );
                    }

                }
        );

        button02.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView02.setText(editText02.getText());
                        textView02.setContentDescription(getString(R.string.your_last_name_is) + textView02.getText());
                    }

                }
        );

        imageButton3.setOnClickListener(
                new Button.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), R.string.somethings_wrong, Toast.LENGTH_SHORT).show();
                    }


                }
        );

        imageButton4.setOnClickListener(
                new Button.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), R.string.tab_correct, Toast.LENGTH_SHORT).show();
                    }


                }
        );

        return v;
    }
}