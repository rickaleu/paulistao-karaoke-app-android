package br.com.upk.paulistaokaraoke;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class LiveFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_live, container, false);

        WebView webView = view.findViewById(R.id.live_container);
        webView.loadUrl("file:///android_asset/vivo.html");


        return view;
    }

    public static LiveFragment newInstance() {
        return new LiveFragment();
    }
}
