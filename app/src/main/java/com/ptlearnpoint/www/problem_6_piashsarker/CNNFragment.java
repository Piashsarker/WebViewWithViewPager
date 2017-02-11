package com.ptlearnpoint.www.problem_6_piashsarker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by PT on 2/3/2017.
 */

public class CNNFragment extends Fragment {

    public CNNFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cnn_fragment, container, false);
        // Inflate the layout for this fragment
        WebView myWebView = (WebView) rootView.findViewById(R.id.cnn_webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("http://www.cnn.com");
        return rootView ;
    }
}