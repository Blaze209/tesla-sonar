package qg;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import di.i;
import di.p;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d extends qg.c implements qg.e.f, qg.e.g, qg.e.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f105384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f105385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f105386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ai.a f105387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f105388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f105389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qg.e f105390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qg.f f105391j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f105382a.finish();
        }
    }

    public class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qg.e f105393a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qg.e eVar) {
            super(null);
            this.f105393a = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f105393a.i();
            d.this.f105386e = false;
        }
    }

    public class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qg.e f105395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f105396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qg.e eVar, String str) {
            super(null);
            this.f105395a = eVar;
            this.f105396b = str;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.removeView(this.f105395a);
            d.this.f105390i.f(this.f105396b);
            d.this.f105386e = false;
        }
    }

    /* JADX INFO: renamed from: qg.d$d, reason: collision with other inner class name */
    public class RunnableC2233d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f105398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f105399b;

        /* JADX INFO: renamed from: qg.d$d$a */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                RunnableC2233d.this.f105399b.cancel();
                hh.a.g(d.this.f105387f, "net", "SSLDenied", "2");
                fh.b.c(fh.b.a());
                RunnableC2233d.this.f105398a.finish();
            }
        }

        public RunnableC2233d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.f105398a = activity;
            this.f105399b = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            qg.b.b(this.f105398a, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new a(), null, null);
        }
    }

    public static abstract class e implements Animation.AnimationListener {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<qg.e> f105402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final JSONObject f105405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f105406e = false;

        public f(qg.e eVar, String str, String str2, JSONObject jSONObject) {
            this.f105402a = new WeakReference<>(eVar);
            this.f105403b = str;
            this.f105404c = str2;
            this.f105405d = jSONObject;
        }

        public static String a(String str) {
            return TextUtils.isEmpty(str) ? "" : str.replace("'", "");
        }

        public void b(JSONObject jSONObject) {
            qg.e eVar;
            if (this.f105406e || (eVar = (qg.e) p.i(this.f105402a)) == null) {
                return;
            }
            this.f105406e = true;
            eVar.f(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", a(this.f105404c), a(jSONObject.toString())));
        }
    }

    public static class g implements fh.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f105407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105408b;

        public g(f fVar, String str) {
            this.f105407a = fVar;
            this.f105408b = str;
        }

        @Override // fh.d.a
        public void a(boolean z11, JSONObject jSONObject, String str) {
            try {
                this.f105407a.b(new JSONObject().put("success", z11).put("random", this.f105408b).put("code", jSONObject).put(PermissionsResponse.STATUS_KEY, str));
            } catch (JSONException unused) {
            }
        }
    }

    public d(Activity activity, ai.a aVar, String str) {
        super(activity, str);
        this.f105384c = false;
        this.f105385d = "GET";
        this.f105386e = false;
        this.f105390i = null;
        this.f105391j = new qg.f();
        this.f105387f = aVar;
        A();
    }

    public final synchronized boolean A() {
        try {
            qg.e eVar = new qg.e(this.f105382a, this.f105387f, new qg.e.C2235e(!m(), !m()));
            this.f105390i = eVar;
            eVar.setChromeProxy(this);
            this.f105390i.setWebClientProxy(this);
            this.f105390i.setWebEventProxy(this);
            addView(this.f105390i);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    public final void B() {
        qg.e eVar = this.f105390i;
        if (eVar != null) {
            WebView webView = eVar.getWebView();
            if (TextUtils.isEmpty(this.f105389h)) {
                webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
                return;
            }
            String strA = di.f.a(this.f105389h);
            if (TextUtils.isEmpty(strA)) {
                hh.a.g(this.f105387f, "biz", "injectJsApi", "escapeCashierBizDataError");
            } else {
                webView.evaluateJavascript("(function() {window.alipayjsbridgeCashierMainData=" + ("'" + strA.substring(1, strA.length() - 1) + "'") + ";})();", null);
            }
            webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    public boolean C() {
        return this.f105388g;
    }

    public final synchronized void D() {
        try {
            WebView webView = this.f105390i.getWebView();
            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                qg.f fVar = this.f105391j;
                if (fVar == null || fVar.c()) {
                    t(false);
                } else {
                    y();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void E() {
        hh.a.a(this.f105387f, "biz", "webViewLoadStart");
        if (!lh.b.E().F(null)) {
            hh.a.a(this.f105387f, "biz", "webLoad|onlineUrl");
            return;
        }
        if (!rh.b.m().k()) {
            hh.a.a(this.f105387f, "biz", "webLoad|localUrl");
            return;
        }
        hh.a.a(this.f105387f, "biz", "webLoad|local|" + rh.b.m().n());
    }

    @Override // qg.e.f
    public synchronized void a(qg.e eVar, String str) {
        if (!str.startsWith("http") && !eVar.getUrl().endsWith(str)) {
            this.f105390i.getTitle().setText(str);
        }
    }

    @Override // qg.e.f
    public synchronized boolean b(qg.e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
                this.f105382a.runOnUiThread(new a());
            }
            jsPromptResult.cancel();
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    @Override // qg.e.g
    public WebResourceResponse c(WebView webView, String str) {
        if (!rh.b.m().k()) {
            return null;
        }
        WebResourceResponse webResourceResponseA = di.e.a(rh.b.m().h(str));
        if (webResourceResponseA != null) {
            di.g.f("mspl", "shouldInterceptRequest return not null, url=" + str);
        }
        return webResourceResponseA;
    }

    @Override // qg.e.g
    public synchronized boolean d(qg.e eVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.f105382a;
        if (activity == null) {
            return true;
        }
        hh.a.g(this.f105387f, "net", "SSLError", "2-" + sslError);
        activity.runOnUiThread(new RunnableC2233d(activity, sslErrorHandler));
        return true;
    }

    @Override // qg.e.g
    public synchronized boolean e(qg.e eVar, String str) {
        hh.a.b(this.f105387f, "biz", "h5ld", SystemClock.elapsedRealtime() + "|" + p.b0(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
            B();
        }
        return false;
    }

    @Override // qg.e.g
    public synchronized boolean f(qg.e eVar, String str) {
        hh.a.b(this.f105387f, "biz", "h5ldd", SystemClock.elapsedRealtime() + "|" + p.b0(str));
        B();
        eVar.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // qg.e.g
    public synchronized boolean g(qg.e eVar, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Activity activity = this.f105382a;
            if (activity == null) {
                return true;
            }
            if (p.z(this.f105387f, str, activity)) {
                return true;
            }
            if (str.startsWith("alipayjsbridge://")) {
                w(str.substring(17));
            } else if (TextUtils.equals(str, "sdklite://h5quit")) {
                t(false);
            } else if (str.startsWith("http://") || str.startsWith("https://")) {
                this.f105390i.f(str);
            } else {
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    activity.startActivity(intent);
                } catch (Throwable th2) {
                    hh.a.e(this.f105387f, "biz", th2);
                }
            }
            return true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // qg.e.g
    public synchronized boolean h(qg.e eVar, int i11, String str, String str2) {
        this.f105388g = true;
        hh.a.g(this.f105387f, "net", "webError", "onReceivedError:" + i11 + "|" + str2);
        eVar.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // qg.e.h
    public synchronized void i(qg.e eVar) {
        z();
    }

    @Override // qg.e.h
    public synchronized void j(qg.e eVar) {
        eVar.getWebView().reload();
        eVar.getRefreshButton().setVisibility(4);
    }

    @Override // qg.c
    public synchronized boolean n() {
        try {
            Activity activity = this.f105382a;
            if (activity == null) {
                return true;
            }
            if (!m()) {
                if (!this.f105386e) {
                    z();
                }
                return true;
            }
            qg.e eVar = this.f105390i;
            if (eVar != null && eVar.getWebView() != null) {
                if (!eVar.getWebView().canGoBack()) {
                    fh.b.c(fh.b.a());
                    activity.finish();
                } else if (C()) {
                    fh.c cVarA = fh.c.a(fh.c.NETWORK_ERROR.c());
                    fh.b.c(fh.b.b(cVarA.c(), cVarA.b(), ""));
                    activity.finish();
                } else if (this.f105384c) {
                    fh.b.c(fh.b.a());
                    activity.finish();
                }
                return true;
            }
            activity.finish();
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // qg.c
    public synchronized void o() {
        this.f105390i.i();
        this.f105391j.a();
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f105386e ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public synchronized void q(String str) {
        try {
            di.g.h("mspl", "WebContainerImpl loadUrl:" + str);
            E();
            if ("POST".equals(this.f105385d)) {
                this.f105390i.g(str, null);
            } else {
                this.f105390i.f(str);
            }
            qg.c.k(this.f105390i.getWebView());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void r(String str, String str2, String str3) {
        try {
            qg.e eVar = this.f105390i;
            if (eVar == null) {
                return;
            }
            JSONObject jSONObjectY = p.Y(str3);
            f fVar = new f(eVar, str, str2, jSONObjectY);
            Context context = eVar.getContext();
            try {
                String str4 = fVar.f105403b;
                switch (str4.hashCode()) {
                    case -1785164386:
                        if (str4.equals("canUseTaoLogin")) {
                            String url = eVar.getUrl();
                            if (!p.y(this.f105387f, url)) {
                                hh.a.g(this.f105387f, "biz", "jsUrlErr", url);
                            } else {
                                JSONObject jSONObject = new JSONObject();
                                boolean zC = fh.d.c(this.f105387f, context);
                                jSONObject.put("enabled", zC);
                                hh.a.b(this.f105387f, "biz", "TbChk", String.valueOf(zC));
                                fVar.b(jSONObject);
                            }
                        }
                        break;
                    case -552487705:
                        if (str4.equals("taoLogin")) {
                            String url2 = eVar.getUrl();
                            if (!p.y(this.f105387f, url2)) {
                                hh.a.g(this.f105387f, "biz", "jsUrlErr", url2);
                            } else {
                                String strOptString = jSONObjectY.optString("random");
                                JSONObject jSONObjectOptJSONObject = jSONObjectY.optJSONObject("options");
                                if (!TextUtils.isEmpty("random") && jSONObjectOptJSONObject != null) {
                                    String strOptString2 = jSONObjectOptJSONObject.optString(ImagesContract.URL);
                                    String strOptString3 = jSONObjectOptJSONObject.optString("action");
                                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && (context instanceof Activity)) {
                                        fh.d.b(this.f105387f, (Activity) context, 1010, strOptString2, strOptString3, new g(fVar, strOptString));
                                    }
                                }
                            }
                        }
                        break;
                    case 3015911:
                        if (str4.equals("back")) {
                            D();
                        }
                        break;
                    case 3127582:
                        if (str4.equals("exit")) {
                            fh.b.c(jSONObjectY.optString("result", null));
                            t(jSONObjectY.optBoolean("success", false));
                        }
                        break;
                    case 110371416:
                        if (str4.equals("title") && jSONObjectY.has("title")) {
                            eVar.getTitle().setText(jSONObjectY.optString("title", ""));
                        }
                        break;
                    case 1085444827:
                        if (str4.equals("refresh")) {
                            eVar.getWebView().reload();
                        }
                        break;
                    case 1235264121:
                        if (str4.equals("netWorkReachableType")) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("result", !lh.b.E().B(null) ? "-2" : i.a(getContext()));
                            fVar.b(jSONObject2);
                        }
                        break;
                    case 1703426986:
                        if (str4.equals("pushWindow")) {
                            x(jSONObjectY.optString(ImagesContract.URL), jSONObjectY.optString("title", ""));
                        }
                        break;
                    case 1906413305:
                        if (str4.equals("backButton")) {
                            eVar.getBackButton().setVisibility(jSONObjectY.optBoolean("show", true) ? 0 : 4);
                        }
                        break;
                    case 1942429949:
                        if (str4.equals("h5LifeCycle")) {
                            String strOptString4 = jSONObjectY.optString("type");
                            hh.a.a(this.f105387f, "biz", "h5LifeCycle|" + strOptString4);
                        }
                        break;
                    case 1947723784:
                        if (str4.equals("sdkInfo")) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("sdk_version", "15.8.42");
                            jSONObject3.put("app_name", this.f105387f.m());
                            jSONObject3.put("app_version", this.f105387f.q());
                            fVar.b(jSONObject3);
                        }
                        break;
                    case 2033767917:
                        if (str4.equals("refreshButton")) {
                            eVar.getRefreshButton().setVisibility(jSONObjectY.optBoolean("show", true) ? 0 : 4);
                        }
                        break;
                }
            } catch (Throwable th2) {
                hh.a.d(this.f105387f, "biz", "jInfoErr", th2, str);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void s(String str, String str2, boolean z11) {
        this.f105385d = str2;
        this.f105390i.getTitle().setText(str);
        this.f105384c = z11;
    }

    public synchronized void setCashierBizData(String str) {
        this.f105389h = str;
    }

    public final synchronized void t(boolean z11) {
        fh.b.d(z11);
        this.f105382a.finish();
    }

    public final synchronized void w(String str) {
        try {
            di.g.h("mspl", "processJsBridge urlContent:" + str);
            Map<String, String> mapE = p.E(this.f105387f, str);
            if (str.startsWith("callNativeFunc")) {
                r(mapE.get("func"), mapE.get("cbId"), mapE.get("data"));
            } else if (str.startsWith("onBack")) {
                D();
            } else if (str.startsWith("setTitle") && mapE.containsKey("title")) {
                this.f105390i.getTitle().setText(mapE.get("title"));
            } else if (str.startsWith("onRefresh")) {
                this.f105390i.getWebView().reload();
            } else if (str.startsWith("showBackButton") && mapE.containsKey("bshow")) {
                this.f105390i.getBackButton().setVisibility(TextUtils.equals("true", mapE.get("bshow")) ? 0 : 4);
            } else if (str.startsWith("onExit")) {
                fh.b.c(mapE.get("result"));
                t(TextUtils.equals("true", mapE.get("bsucc")));
            } else if (str.startsWith("onLoadJs")) {
                this.f105390i.f("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean x(String str, String str2) {
        qg.e eVar = this.f105390i;
        try {
            qg.e eVar2 = new qg.e(this.f105382a, this.f105387f, new qg.e.C2235e(!m(), !m()));
            this.f105390i = eVar2;
            eVar2.setChromeProxy(this);
            this.f105390i.setWebClientProxy(this);
            this.f105390i.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f105390i.getTitle().setText(str2);
            }
            this.f105386e = true;
            this.f105391j.b(eVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new c(eVar, str));
            this.f105390i.setAnimation(translateAnimation);
            addView(this.f105390i);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    public final synchronized boolean y() {
        try {
            if (this.f105391j.c()) {
                this.f105382a.finish();
            } else {
                this.f105386e = true;
                qg.e eVar = this.f105390i;
                this.f105390i = this.f105391j.d();
                TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(false);
                translateAnimation.setAnimationListener(new b(eVar));
                eVar.setAnimation(translateAnimation);
                removeView(eVar);
                addView(this.f105390i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    public final synchronized void z() {
        try {
            Activity activity = this.f105382a;
            qg.e eVar = this.f105390i;
            if (activity != null && eVar != null) {
                if (this.f105384c) {
                    activity.finish();
                } else {
                    eVar.f("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
