package br.com.upk.paulistaokaraoke;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class NewsFragment extends Fragment {

    private static final String baseURl = "http://twitter.com";
    private static final String widgetInfo = "<a class=\"twitter-timeline\" href=\"https://twitter.com/paulistakaraoke?ref_src=twsrc%5Etfw\">Tweets by paulistakaraoke</a>" +
            "<script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script> ";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        WebView webView = view.findViewById(R.id.news_container);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL(baseURl, widgetInfo, "text/html", "UTF-8", null);

        return view;
    }

    public static NewsFragment newInstance() {
        return new NewsFragment();
    }
}
