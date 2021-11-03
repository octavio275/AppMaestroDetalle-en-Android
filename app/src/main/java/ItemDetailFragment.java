public class ItemDetailFragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_website_detail,

                container, false);

// Show the dummy content as text in a TextView.

        if (mItem != null) {

            WebView webview= WebView webview= ((WebView)
                    RootView.findViewById(R.id.website_detail));

            webview.setWebViewClient(new WebViewClient());

            webview.loadUrl(mItem.website_url);

        }

        return rootView;

    }
}
