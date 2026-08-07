package com.reactnativecommunity.webview;

import android.R;
import android.content.ComponentCallbacks2;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c extends WebChromeClient implements LifecycleEventListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final FrameLayout.LayoutParams f48547n = new FrameLayout.LayoutParams(-1, -1, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected d f48548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f48549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected WebChromeClient.CustomViewCallback f48550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected PermissionRequest f48551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List<String> f48552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected GeolocationPermissions.Callback f48553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f48554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f48555h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected List<String> f48556i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected d.C0768d f48557j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f48558k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f48559l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private co.g f48560m = new co.g() { // from class: com.reactnativecommunity.webview.b
        @Override // co.g
        public final boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
            return this.f48546a.d(i11, strArr, iArr);
        }
    };

    class a extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f48561a;

        a(WebView webView) {
            this.f48561a = webView;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("targetUrl", str);
            WebView webView2 = this.f48561a;
            ((d) webView2).g(webView2, new p00.i(o.a(this.f48561a), writableMapCreateMap));
            return true;
        }
    }

    public c(d dVar) {
        this.f48548a = dVar;
    }

    private co.f b() {
        ComponentCallbacks2 currentActivity = this.f48548a.getThemedReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof co.f) {
            return (co.f) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(int i11, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        GeolocationPermissions.Callback callback;
        String str;
        this.f48555h = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String str2 = strArr[i12];
            boolean z12 = iArr[i12] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = this.f48553f) != null && (str = this.f48554g) != null) {
                if (z12) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                this.f48553f = null;
                this.f48554g = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z12 && (list4 = this.f48552e) != null) {
                    list4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z11 = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z12 && (list3 = this.f48552e) != null) {
                    list3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z11 = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z12 && (list2 = this.f48552e) != null) {
                    list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z11 = true;
            }
        }
        if (z11 && (permissionRequest = this.f48551d) != null && (list = this.f48552e) != null) {
            permissionRequest.grant((String[]) list.toArray(new String[0]));
            this.f48551d = null;
            this.f48552e = null;
        }
        if (this.f48556i.isEmpty()) {
            return true;
        }
        e(this.f48556i);
        return false;
    }

    private synchronized void e(List<String> list) {
        if (this.f48555h) {
            this.f48556i.addAll(list);
            return;
        }
        co.f fVarB = b();
        this.f48555h = true;
        fVarB.a((String[]) list.toArray(new String[0]), 3, this.f48560m);
        this.f48556i.clear();
    }

    protected ViewGroup c() {
        return (ViewGroup) this.f48548a.getThemedReactContext().getCurrentActivity().findViewById(R.id.content);
    }

    public void f(boolean z11) {
        this.f48558k = z11;
    }

    public void g(boolean z11) {
        this.f48559l = z11;
    }

    public void h(d.C0768d c0768d) {
        this.f48557j = c0768d;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (ln.a.DEBUG) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z11, boolean z12, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f48559l) {
            webView2.setWebViewClient(new a(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (androidx.core.content.b.checkSelfPermission(this.f48548a.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f48553f = callback;
        this.f48554g = str;
        e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        View view = this.f48549b;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.f48549b.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f48552e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i11 = 0;
        while (true) {
            String str = null;
            if (i11 >= length) {
                break;
            }
            String str2 = resources[i11];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.f48558k) {
                    this.f48552e.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (androidx.core.content.b.checkSelfPermission(this.f48548a.getThemedReactContext(), str) == 0) {
                    this.f48552e.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i11++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.f48552e.toArray(new String[0]));
            this.f48552e = null;
        } else {
            this.f48551d = permissionRequest;
            e(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i11) {
        super.onProgressChanged(webView, i11);
        String url = webView.getUrl();
        if (this.f48557j.a()) {
            return;
        }
        int iA = o.a(webView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", iA);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putString(ImagesContract.URL, url);
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, i11 / 100.0f);
        b1.c(this.f48548a.getThemedReactContext(), iA).h(new p00.f(iA, writableMapCreateMap));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((RNCWebViewModule) this.f48548a.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }
}
