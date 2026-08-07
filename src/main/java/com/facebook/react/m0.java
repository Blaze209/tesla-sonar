package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.jscexecutor.JSCExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class m0 {
    private static final String C = "m0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSBundleLoader f22679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f22680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f22681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Application f22682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.facebook.react.devsupport.f0 f22684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LifecycleState f22687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSExceptionHandler f22688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Activity f22689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private co.a f22690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private pn.j f22691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private pn.b f22693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private JavaScriptExecutorFactory f22694r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private UIManagerProvider f22697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Map<String, jo.f> f22698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private v0.a f22699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private jn.i f22700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private pn.c f22701y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<p0> f22677a = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f22695s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f22696t = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f22702z = null;
    private sn.b A = null;
    private pn.i B = null;

    m0() {
    }

    private JavaScriptExecutorFactory c(String str, String str2, Context context) {
        j0.N(context);
        f fVar = this.f22702z;
        if (fVar != null) {
            if (fVar == f.HERMES) {
                HermesExecutor.e();
                return new fm.a();
            }
            JSCExecutor.b();
            return new vn.a(str, str2);
        }
        try {
            try {
                HermesExecutor.e();
                return new fm.a();
            } catch (UnsatisfiedLinkError unused) {
                JSCExecutor.b();
                return new vn.a(str, str2);
            }
        } catch (UnsatisfiedLinkError e11) {
            qk.a.m(C, "Unable to load neither the Hermes nor the JSC native library. Your application is not built correctly and will fail to execute");
            if (e11.getMessage().contains("__cxa_bad_typeid")) {
                throw e11;
            }
            return null;
        }
    }

    public m0 a(p0 p0Var) {
        this.f22677a.add(p0Var);
        return this;
    }

    public j0 b() {
        String str;
        gn.a.d(this.f22682f, "Application property has not been set with this builder");
        if (this.f22687k == LifecycleState.RESUMED) {
            gn.a.d(this.f22689m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z11 = true;
        gn.a.b((!this.f22683g && this.f22678b == null && this.f22679c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f22680d == null && this.f22678b == null && this.f22679c == null) {
            z11 = false;
        }
        gn.a.b(z11, "Either MainModulePath or JS Bundle File needs to be provided");
        String packageName = this.f22682f.getPackageName();
        String strD = com.facebook.react.modules.systeminfo.a.d();
        Application application = this.f22682f;
        Activity activity = this.f22689m;
        co.a aVar = this.f22690n;
        JavaScriptExecutorFactory javaScriptExecutorFactoryC = this.f22694r;
        if (javaScriptExecutorFactoryC == null) {
            javaScriptExecutorFactoryC = c(packageName, strD, application.getApplicationContext());
        }
        JSBundleLoader jSBundleLoaderCreateAssetLoader = this.f22679c;
        if (jSBundleLoaderCreateAssetLoader == null && (str = this.f22678b) != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(this.f22682f, str, false);
        }
        JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
        String str2 = this.f22680d;
        List<p0> list = this.f22677a;
        boolean z12 = this.f22683g;
        com.facebook.react.devsupport.f0 iVar = this.f22684h;
        if (iVar == null) {
            iVar = new com.facebook.react.devsupport.i();
        }
        return new j0(application, activity, aVar, javaScriptExecutorFactoryC, jSBundleLoader, str2, list, z12, iVar, this.f22685i, this.f22686j, this.f22681e, (LifecycleState) gn.a.d(this.f22687k, "Initial lifecycle state was not set"), this.f22688l, this.f22691o, this.f22692p, this.f22693q, this.f22695s, this.f22696t, this.f22697u, this.f22698v, this.f22699w, this.f22700x, this.f22701y, this.A, this.B);
    }

    public m0 d(Application application) {
        this.f22682f = application;
        return this;
    }

    public m0 e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f22678b = str2;
        this.f22679c = null;
        return this;
    }

    public m0 f(sn.b bVar) {
        this.A = bVar;
        return this;
    }

    public m0 g(pn.c cVar) {
        this.f22701y = cVar;
        return this;
    }

    public m0 h(com.facebook.react.devsupport.f0 f0Var) {
        this.f22684h = f0Var;
        return this;
    }

    public m0 i(LifecycleState lifecycleState) {
        this.f22687k = lifecycleState;
        return this;
    }

    public m0 j(String str) {
        if (!str.startsWith("assets://")) {
            return k(JSBundleLoader.createFileLoader(str));
        }
        this.f22678b = str;
        this.f22679c = null;
        return this;
    }

    public m0 k(JSBundleLoader jSBundleLoader) {
        this.f22679c = jSBundleLoader;
        this.f22678b = null;
        return this;
    }

    public m0 l(f fVar) {
        this.f22702z = fVar;
        return this;
    }

    public m0 m(JSExceptionHandler jSExceptionHandler) {
        this.f22688l = jSExceptionHandler;
        return this;
    }

    public m0 n(String str) {
        this.f22680d = str;
        return this;
    }

    public m0 o(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f22694r = javaScriptExecutorFactory;
        return this;
    }

    public m0 p(boolean z11) {
        this.f22692p = z11;
        return this;
    }

    public m0 q(pn.i iVar) {
        this.B = iVar;
        return this;
    }

    public m0 r(v0.a aVar) {
        this.f22699w = aVar;
        return this;
    }

    public m0 s(pn.j jVar) {
        this.f22691o = jVar;
        return this;
    }

    public m0 t(boolean z11) {
        this.f22685i = z11;
        return this;
    }

    public m0 u(jn.i iVar) {
        this.f22700x = iVar;
        return this;
    }

    public m0 v(UIManagerProvider uIManagerProvider) {
        this.f22697u = uIManagerProvider;
        return this;
    }

    public m0 w(boolean z11) {
        this.f22683g = z11;
        return this;
    }
}
