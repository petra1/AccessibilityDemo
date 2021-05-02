package ch.petraaccess_for_all.accessibilitydemo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class EditFieldFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EditFieldFragment() {
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

        View v = inflater.inflate (R.layout.fragment_edit_field, container, false);

        Button button1 = v.findViewById (R.id.button1);
        Button button2 = v.findViewById (R.id.button2);
        final TextView textView1 = v.findViewById (R.id.textView1);
        final TextView textView2 = v.findViewById (R.id.textView2);
        final EditText editText1 = v.findViewById (R.id.editText1);
        final EditText editText2 = v.findViewById (R.id.editText2);

        button1.setOnClickListener (
                new Button.OnClickListener () {
                    @Override
                    public void onClick(View view) {
                        textView1.setText (editText1.getText ());

                    }


                }
        );

        button2.setOnClickListener (
                new Button.OnClickListener () {
                    @Override
                    public void onClick(View view) {
                        textView2.setText (editText2.getText ());
                        textView2.setContentDescription(getString(R.string.your_last_name_is) + textView2.getText() );
                    }

                                  }
        );





        return v;
    }
}
