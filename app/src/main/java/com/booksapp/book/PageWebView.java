package com.booksapp.book;

import android.app.Activity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PageWebView extends WebView
{
    private Activity context;

    public PageWebView(final Activity context)
    {
        super(context);
        this.context = context;

        this.getSettings().setSupportZoom(true);
        this.getSettings().setBuiltInZoomControls(true);
        this.getSettings().setDisplayZoomControls(false);
        this.getSettings().setLoadsImagesAutomatically(true);
        this.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);

        this.getSettings().setUseWideViewPort(true);
        this.getSettings().setLoadWithOverviewMode(true);
        this.getSettings().setMinimumFontSize(1);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt)
    {
        super.onScrollChanged(l, t, oldl, oldt);
    }

    public void showPage(String HTML)
    {
        int screenHeight = context.getResources().getDisplayMetrics().heightPixels;
        int screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        float density = context.getResources().getDisplayMetrics().density;

        int text_indent = (int)(8 * density);
        int text_size = (int)(5 * density);
        int content_margin = (int)(5 * density);
        int content_width = (int)(96 * screenWidth * this.getScaleX());



        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>");
        sb.append("\n<html>");
        sb.append("\n<head>");
        sb.append("\n<meta charset=\"utf-8\">");
        sb.append("\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, text/html,charset=utf-8, user-scalable=yes\">");
        sb.append("\n<style>");
        sb.append("\np { text-indent: " + text_indent + "px; margin-top: 0em; margin-bottom: 0em; text-align: justify; }");
        sb.append("\nH1, H2, H3, H4 { text-align: center;}");
        sb.append("\nIMG { width: 98%;}");
        sb.append("\nBODY { margin: " + content_margin + " auto; font-family: serif; font-size: " + text_size + "px;}");
        sb.append("\nol { text-align:  justify;}\n" +
                "\n" +
                ".image {text-align: center;}\n" +
                "\n" +
                ".container\n" +
                "{\n" +
                "\t/* border: 1px solid black; */\n" +
                "\twidth:100%;\n" +
                "}\n" +
                ".left-block_center{width:45%; float:left;padding-right:2%;margin-left:2%;}\n" +
                ".right-block_center{width:45%;float:left;padding-left:2%;margin-right:2%;}\n" +
                ".text{float: none; text-align:  justify;}\n" +
                "\n" +
                ".elipse\n" +
                "{\n" +
                "\ttext-align: center; \n" +
                "\tborder: 1px solid black; \n" +
                "\twidth:45px; \n" +
                "\tborder-radius: 5px;\n" +
                "\tdisplay: inline-block; \n" +
                "\tpadding: 1px;\n" +
                "\tline-height: 13px; \n" +
                "}");
        sb.append("\n</style>");
        sb.append("\n</head>");

        sb.append("\n\n<body>");

        sb.append(HTML);

        sb.append("\n</body>");
        sb.append("\n</html>");

        final String baseUrl = "file:///android_asset/";
        final String html = sb.toString();

        this.post(new Runnable()
        {
            @Override
            public void run()
            {
                loadDataWithBaseURL(baseUrl, html, "text/html", "UTF-8", "UTF-8");
            }
        });
    }

    public void clear()
    {
        final String baseUrl = "file:///android_asset/";
        final String html = "<html></html>";

        this.post(new Runnable()
        {
            @Override
            public void run()
            {
                loadDataWithBaseURL(baseUrl, html, "text/html", "UTF-8", "UTF-8");
            }
        });
    }
}
