package com.amrfares.daqiiqa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceError;
import android.widget.Toast;

public class MainActivity extends Activity {
  private WebView web;
  private static final String ONLINE_URL = "https://amrfares03-coder.github.io/90-daqiqa/";
  @Override public void onCreate(Bundle b){ super.onCreate(b); getWindow().getDecorView().setSystemUiVisibility(5894); web=new WebView(this); setContentView(web);
    WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setDatabaseEnabled(true); s.setMediaPlaybackRequiresUserGesture(false); s.setAllowFileAccess(true); s.setAllowContentAccess(true); s.setBuiltInZoomControls(false); s.setDisplayZoomControls(false);
    web.setWebViewClient(new WebViewClient()); web.setWebChromeClient(new WebChromeClient());
    load();
  }
  protected void load(){
    web.loadUrl("file:///android_asset/game/index.html");
  }
  @Override public void onBackPressed(){ if(web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}
