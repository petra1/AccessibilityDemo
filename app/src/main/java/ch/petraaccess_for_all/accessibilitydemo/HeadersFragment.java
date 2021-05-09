package ch.petraaccess_for_all.accessibilitydemo;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class HeadersFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HeadersFragment() {
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
            View v = inflater.inflate (R.layout.fragment_contact, container, false);
            WebView webView = v.findViewById (R.id.webView);
        v.setVerticalScrollBarEnabled(true);
        v.setHorizontalScrollBarEnabled(true);

            switch (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
                case Configuration.UI_MODE_NIGHT_YES:
                    webView.loadUrl ("file:///android_asset/" + getString (R.string.dark_mode_heading__html));
                    break;
                case  Configuration.UI_MODE_NIGHT_NO:
                    webView.loadUrl ("file:///android_asset/" + getString (R.string.header_html));
                    break;
            }








            return v;



    }}