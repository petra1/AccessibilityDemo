package ch.petraaccess_for_all.accessibilitydemo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class ImageButtonFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ImageButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        if (getArguments () != null) {
            mParam1 = getArguments ().getString (ARG_PARAM1);
            mParam2 = getArguments ().getString (ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate (R.layout.fragment_image_button, container, false);
        ImageButton imageButton1 = (ImageButton) v.findViewById (R.id.imageButton);
        ImageButton imageButton2 = (ImageButton) v.findViewById (R.id.imageButton2);
        imageButton2.setContentDescription(getString(R.string.get_the_answer_to_question_two));
        final TextView textView12 = (TextView) v.findViewById (R.id.textView12);
        final TextView textView13 = (TextView) v.findViewById (R.id.textView13);


        imageButton1.setOnClickListener (
                new Button.OnClickListener () {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        textView12.setText (getString(R.string.version_of_wcag));
                    }

                }
        );
        imageButton2.setOnClickListener (
                new Button.OnClickListener () {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        textView13.setText (getString(R.string.released_wcag));
                    }


                }
        );

        return v;
    }
}