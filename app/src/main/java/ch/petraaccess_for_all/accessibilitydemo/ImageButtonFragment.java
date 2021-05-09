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


    public ImageButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_image_button, container, false);
        ImageButton imageButton1 = v.findViewById(R.id.imageButton);
        ImageButton imageButton2 = v.findViewById(R.id.imageButton2);
        Button buttonReset = v.findViewById(R.id.buttonReset);
        imageButton2.setContentDescription(getString(R.string.get_the_answer_to_question_two));
        final TextView textView12 = v.findViewById(R.id.textView12);
        final TextView textView13 = v.findViewById(R.id.textView13);


        imageButton1.setOnClickListener(
                new Button.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        textView12.setText(getString(R.string.version_of_wcag));
                    }

                }
        );
        imageButton2.setOnClickListener(
                new Button.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        textView13.setText(getString(R.string.released_wcag));
                    }


                }
        );

        buttonReset.setOnClickListener(
                new Button.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        textView12.setText(getString(R.string.what_is_the_current_version_of_wcag));
                        textView13.setText(getString(R.string.when_was_the_current_version_of_wcag_released));
                    }
                }

        );

        return v;
    }
}