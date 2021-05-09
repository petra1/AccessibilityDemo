package ch.petraaccess_for_all.accessibilitydemo;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class HeadersFragment extends Fragment {



    public HeadersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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