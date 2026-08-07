package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.v0;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public class d extends WebView implements LifecycleEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f48563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f48564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f48565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected jb.e.a f48566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f48567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f48568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f48569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f48570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RNCWebViewMessagingModule f48571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected f f48572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f48573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.facebook.react.views.scroll.c f48574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f48575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f48576n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected C0768d f48577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected List<Map<String, String>> f48578p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    WebChromeClient f48579q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f48580r;

    class a extends ActionMode.Callback2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMode.Callback f48581a;

        /* JADX INFO: renamed from: com.reactnativecommunity.webview.d$a$a, reason: collision with other inner class name */
        class C0767a implements ValueCallback<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MenuItem f48583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WritableMap f48584b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ActionMode f48585c;

            C0767a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.f48583a = menuItem;
                this.f48584b = writableMap;
                this.f48585c = actionMode;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                String string;
                Map<String, String> map = d.this.f48578p.get(this.f48583a.getItemId());
                this.f48584b.putString(AnnotatedPrivateKey.LABEL, map.get(AnnotatedPrivateKey.LABEL));
                this.f48584b.putString(Action.KEY_ATTRIBUTE, map.get(Action.KEY_ATTRIBUTE));
                try {
                    string = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    string = "";
                }
                this.f48584b.putString("selectedText", string);
                d dVar = d.this;
                dVar.g(dVar, new p00.b(o.a(d.this), this.f48584b));
                this.f48585c.finish();
            }
        }

        a(ActionMode.Callback callback) {
            this.f48581a = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            d.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C0767a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i11 = 0; i11 < d.this.f48578p.size(); i11++) {
                menu.add(0, i11, i11, d.this.f48578p.get(i11).get(AnnotatedPrivateKey.LABEL));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback2
        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.f48581a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    class b implements jb.e.a {
        b() {
        }

        @Override // jb.e.a
        public void a(@NonNull WebView webView, @NonNull jb.b bVar, @NonNull Uri uri, boolean z11, @NonNull jb.a aVar) {
            d.this.j(bVar.b(), uri.toString());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f48588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f48590c;

        c(WebView webView, String str, String str2) {
            this.f48588a = webView;
            this.f48589b = str;
            this.f48590c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = d.this.f48572j;
            if (fVar == null) {
                return;
            }
            WritableMap writableMapA = fVar.a(this.f48588a, this.f48589b);
            writableMapA.putString("data", this.f48590c);
            d dVar = d.this;
            if (dVar.f48571i != null) {
                dVar.e(writableMapA);
            } else {
                dVar.g(this.f48588a, new p00.h(o.a(this.f48588a), writableMapA));
            }
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.d$d, reason: collision with other inner class name */
    protected static class C0768d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f48592a = false;

        protected C0768d() {
        }

        public boolean a() {
            return this.f48592a;
        }

        public void b(boolean z11) {
            this.f48592a = z11;
        }
    }

    protected class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f48593a = "RNCWebViewBridge";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f48594b;

        e(d dVar) {
            this.f48594b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            d dVar = this.f48594b;
            dVar.j(str, dVar.getUrl());
        }

        @JavascriptInterface
        public void postMessage(final String str) {
            if (this.f48594b.getMessagingEnabled()) {
                this.f48594b.post(new Runnable() { // from class: com.reactnativecommunity.webview.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48596a.b(str);
                    }
                });
            } else {
                qk.a.I(this.f48593a, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public d(v0 v0Var) {
        super(v0Var);
        this.f48566d = null;
        this.f48567e = true;
        this.f48568f = true;
        this.f48569g = false;
        this.f48573k = false;
        this.f48575m = false;
        this.f48576n = false;
        this.f48580r = null;
        this.f48571i = (RNCWebViewMessagingModule) ((v0) getContext()).b().getJSModule(RNCWebViewMessagingModule.class);
        this.f48577o = new C0768d();
    }

    private void i() {
        String str;
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            if (this.f48580r == null) {
                str = null;
            } else {
                str = "`" + this.f48580r + "`";
            }
            sb2.append(str);
            sb2.append("; };\n})();");
            h(sb2.toString());
        }
    }

    public void a() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f48563a) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f48563a + ";\n})();");
        i();
    }

    public void b() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f48564b) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f48564b + ";\n})();");
        i();
    }

    protected void c() {
        setWebViewClient(null);
        destroy();
    }

    protected void d(d dVar) {
        if (jb.f.a("WEB_MESSAGE_LISTENER")) {
            if (this.f48566d == null) {
                this.f48566d = new b();
                jb.e.a(dVar, "ReactNativeWebView", com.google.android.gms.measurement.internal.b.a(new Object[]{Marker.ANY_MARKER}), this.f48566d);
            }
        } else if (this.f48565c == null) {
            e eVar = new e(dVar);
            this.f48565c = eVar;
            addJavascriptInterface(eVar, "ReactNativeWebView");
        }
        i();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebChromeClient webChromeClient = this.f48579q;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    protected void e(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f48570h);
        this.f48571i.onMessage(writableNativeMap);
    }

    protected boolean f(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f48570h);
        this.f48571i.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    protected void g(WebView webView, com.facebook.react.uimanager.events.d dVar) {
        b1.c(getThemedReactContext(), o.a(webView)).h(dVar);
    }

    public boolean getMessagingEnabled() {
        return this.f48569g;
    }

    public f getRNCWebViewClient() {
        return this.f48572j;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().b();
    }

    public v0 getThemedReactContext() {
        return (v0) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f48579q;
    }

    protected void h(String str) {
        evaluateJavascript(str, null);
    }

    public void j(String str, String str2) {
        getThemedReactContext();
        if (this.f48572j != null) {
            post(new c(this, str2, str));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", str);
        if (this.f48571i != null) {
            e(writableMapCreateMap);
        } else {
            g(this, new p00.h(o.a(this), writableMapCreateMap));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        if (this.f48575m) {
            if (this.f48574l == null) {
                this.f48574l = new com.facebook.react.views.scroll.c();
            }
            if (this.f48574l.c(i11, i12)) {
                g(this, com.facebook.react.views.scroll.k.e(o.a(this), com.facebook.react.views.scroll.l.SCROLL, i11, i12, this.f48574l.getXFlingVelocity(), this.f48574l.getYFlingVelocity(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f48573k) {
            g(this, new com.facebook.react.uimanager.events.c(o.a(this), i11, i12));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48576n) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(com.reactnativecommunity.webview.a aVar) {
        this.f48572j.d(aVar);
    }

    public void setHasScrollEvent(boolean z11) {
        this.f48575m = z11;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.f48580r = str;
        i();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f48578p = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z11) {
        if (this.f48569g == z11) {
            return;
        }
        this.f48569g = z11;
        if (z11) {
            d(this);
        }
    }

    public void setNestedScrollEnabled(boolean z11) {
        this.f48576n = z11;
    }

    public void setSendContentSizeChangeEvents(boolean z11) {
        this.f48573k = z11;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f48579q = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof com.reactnativecommunity.webview.c) {
            ((com.reactnativecommunity.webview.c) webChromeClient).h(this.f48577o);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof f) {
            f fVar = (f) webViewClient;
            this.f48572j = fVar;
            fVar.e(this.f48577o);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i11) {
        return this.f48578p == null ? super.startActionMode(callback, i11) : super.startActionMode(new a(callback), i11);
    }
}
