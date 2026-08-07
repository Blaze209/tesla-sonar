package com.facebook.react.devsupport;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 implements pn.e {
    private pn.g A;
    private final pn.b C;
    private List<pn.f> D;
    private final Map<String, jo.f> E;
    private final jn.i F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jn.e f22404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BroadcastReceiver f22405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f22406d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final z0 f22408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f22410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final File f22411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final DefaultJSExceptionHandler f22412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final pn.c f22413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final pn.i f22414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private jn.h f22415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AlertDialog f22416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.facebook.react.devsupport.d f22417o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ReactContext f22420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final eo.a f22421s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f22425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final pn.j f22426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f22427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private pn.k[] f22428z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashMap<String, pn.d> f22407e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22418p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f22419q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f22422t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f22423u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f22424v = false;
    private int B = 0;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (c0.i0(context).equals(intent.getAction())) {
                c0.this.C();
            }
        }
    }

    class b implements pn.d {
        b() {
        }

        @Override // pn.d
        public void a() {
            if (!c0.this.f22421s.k() && c0.this.f22421s.p()) {
                Toast.makeText(c0.this.f22403a, c0.this.f22403a.getString(com.facebook.react.p.f22892h), 1).show();
                c0.this.f22421s.c(false);
            }
            c0.this.C();
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditText f22431a;

        c(EditText editText) {
            this.f22431a = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            c0.this.f22421s.getPackagerConnectionSettings().d(this.f22431a.getText().toString());
            c0.this.C();
        }
    }

    class d implements pn.d {
        d() {
        }

        @Override // pn.d
        public void a() {
            c0.this.f22421s.n(!c0.this.f22421s.j());
            c0.this.f22408f.g();
        }
    }

    class e extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f22434a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i11, String[] strArr, Set set) {
            super(context, i11, strArr);
            this.f22434a = set;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i11, view, viewGroup);
            view2.setEnabled(isEnabled(i11));
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i11) {
            return !this.f22434a.contains(getItem(i11));
        }
    }

    class f implements pn.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.devsupport.b.c f22436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pn.a f22437b;

        f(com.facebook.react.devsupport.b.c cVar, pn.a aVar) {
            this.f22436a = cVar;
            this.f22437b = aVar;
        }

        @Override // pn.b
        public void a(String str, Integer num, Integer num2) {
            c0.this.f22413k.a(str, num, num2);
            if (c0.this.C != null) {
                c0.this.C.a(str, num, num2);
            }
        }

        @Override // pn.b
        public void onFailure(Exception exc) {
            c0.this.k0();
            if (c0.this.C != null) {
                c0.this.C.onFailure(exc);
            }
            qk.a.n("ReactNative", "Unable to download JS bundle", exc);
            c0.this.E0(exc);
            this.f22437b.onError(exc);
        }

        @Override // pn.b
        public void onSuccess() {
            c0.this.k0();
            if (c0.this.C != null) {
                c0.this.C.onSuccess();
            }
            ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, this.f22436a.c());
            this.f22437b.onSuccess();
        }
    }

    class g implements k.g {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h() {
            c0.this.r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i() {
            c0.this.C();
        }

        @Override // com.facebook.react.devsupport.k.g
        public void a() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                c0.this.f22406d.n();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22467a.i();
                }
            });
        }

        @Override // com.facebook.react.devsupport.k.g
        public Map<String, jo.f> b() {
            return c0.this.E;
        }

        @Override // com.facebook.react.devsupport.k.g
        public void c() {
            c0.this.f22425w = true;
        }

        @Override // com.facebook.react.devsupport.k.g
        public void d() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22446a.h();
                }
            });
        }

        @Override // com.facebook.react.devsupport.k.g
        public void e() {
            c0.this.f22425w = false;
        }
    }

    public c0(Context context, z0 z0Var, String str, boolean z11, pn.j jVar, pn.b bVar, int i11, Map<String, jo.f> map, jn.i iVar, pn.c cVar, pn.i iVar2) {
        this.f22408f = z0Var;
        this.f22403a = context;
        this.f22409g = str;
        j jVar2 = new j(context, new j.b() { // from class: com.facebook.react.devsupport.m
            @Override // com.facebook.react.devsupport.j.b
            public final void a() {
                this.f22542a.D0();
            }
        });
        this.f22421s = jVar2;
        this.f22406d = new k(jVar2, context, jVar2.getPackagerConnectionSettings());
        this.C = bVar;
        this.f22404b = new jn.e(new jn.e.a() { // from class: com.facebook.react.devsupport.n
            @Override // jn.e.a
            public final void a() {
                this.f22544a.r();
            }
        }, i11);
        this.E = map;
        this.f22405c = new a();
        String strJ0 = j0();
        this.f22410h = new File(context.getFilesDir(), strJ0 + "ReactNativeDevBundle.js");
        this.f22411i = context.getDir(strJ0.toLowerCase(Locale.ROOT) + "_dev_js_split_bundles", 0);
        this.f22412j = new DefaultJSExceptionHandler();
        m(z11);
        this.f22426x = jVar;
        this.f22413k = cVar == null ? new h(z0Var) : cVar;
        this.F = iVar;
        this.f22414l = iVar2 == null ? new x0(new u5.j() { // from class: com.facebook.react.devsupport.o
            @Override // u5.j
            public final Object get() {
                return this.f22546a.n0();
            }
        }) : iVar2;
    }

    private void A0(Exception exc) {
        StringBuilder sb2 = new StringBuilder(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append("\n\n");
            sb2.append(cause.getMessage());
        }
        if (!(exc instanceof JavascriptException)) {
            I0(sb2.toString(), exc);
        } else {
            qk.a.n("ReactNative", "Exception in native call from JS", exc);
            H0(exc.getMessage().toString(), new pn.k[0], -1, pn.g.JS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        UiThreadUtil.assertOnUiThread();
        if (!this.f22424v) {
            com.facebook.react.devsupport.d dVar = this.f22417o;
            if (dVar != null) {
                dVar.i(false);
            }
            if (this.f22423u) {
                this.f22404b.f();
                this.f22423u = false;
            }
            if (this.f22422t) {
                this.f22403a.unregisterReceiver(this.f22405c);
                this.f22422t = false;
            }
            w();
            l0();
            this.f22413k.hide();
            this.f22406d.j();
            return;
        }
        com.facebook.react.devsupport.d dVar2 = this.f22417o;
        if (dVar2 != null) {
            dVar2.i(this.f22421s.o());
        }
        if (!this.f22423u) {
            this.f22404b.e((SensorManager) this.f22403a.getSystemService("sensor"));
            this.f22423u = true;
        }
        if (!this.f22422t) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(i0(this.f22403a));
            c0(this.f22403a, this.f22405c, intentFilter, true);
            this.f22422t = true;
        }
        if (this.f22418p) {
            this.f22413k.b("Reloading...");
        }
        this.f22406d.z(getClass().getSimpleName(), new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(final Exception exc) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f22558a.o0(exc);
            }
        });
    }

    private void F0(ReactContext reactContext) {
        if (this.f22420r == reactContext) {
            return;
        }
        this.f22420r = reactContext;
        com.facebook.react.devsupport.d dVar = this.f22417o;
        if (dVar != null) {
            dVar.i(false);
        }
        if (reactContext != null) {
            this.f22417o = new com.facebook.react.devsupport.d(reactContext);
        }
        if (this.f22420r != null) {
            try {
                URL url = new URL(y());
                ((HMRClient) this.f22420r.getJSModule(HMRClient.class)).setup("android", url.getPath().substring(1), url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.f22421s.p(), url.getProtocol());
            } catch (MalformedURLException e11) {
                I0(e11.getMessage(), e11);
            }
        }
        D0();
    }

    private void G0(String str) {
        if (this.f22403a == null) {
            return;
        }
        try {
            URL url = new URL(str);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            this.f22413k.b(this.f22403a.getString(com.facebook.react.p.f22896l, url.getHost() + ":" + port));
            this.f22418p = true;
        } catch (MalformedURLException e11) {
            qk.a.m("ReactNative", "Bundle url format is invalid. \n\n" + e11.toString());
        }
    }

    private void H0(final String str, final pn.k[] kVarArr, final int i11, final pn.g gVar) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f22563a.y0(str, kVarArr, i11, gVar);
            }
        });
    }

    private void J0(String str, pn.k[] kVarArr, int i11, pn.g gVar) {
        this.f22427y = str;
        this.f22428z = kVarArr;
        this.B = i11;
        this.A = gVar;
    }

    private void c0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z11) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z11 ? 2 : 4);
        }
    }

    private String g0() {
        try {
            return h0().getJavaScriptExecutorFactory().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i0(Context context) {
        return context.getPackageName() + ".RELOAD_APP_ACTION";
    }

    private void l0() {
        AlertDialog alertDialog = this.f22416n;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f22416n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(pn.h hVar) {
        this.f22406d.w(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Context n0() {
        Activity currentActivity = this.f22408f.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return null;
        }
        return currentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(Exception exc) {
        if (exc instanceof DebugServerException) {
            I0(((DebugServerException) exc).getMessage(), exc);
        } else {
            I0(this.f22403a.getString(com.facebook.react.p.f22901q), exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(boolean z11) {
        this.f22421s.i(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(boolean z11) {
        this.f22421s.c(z11);
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0() {
        Activity currentActivity = this.f22408f.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            qk.a.m("ReactNative", "Unable to launch change bundle location because react activity is not available");
            return;
        }
        EditText editText = new EditText(currentActivity);
        editText.setHint("localhost:8081");
        new AlertDialog.Builder(currentActivity).setTitle(this.f22403a.getString(com.facebook.react.p.f22886b)).setView(editText).setPositiveButton(R.string.ok, new c(editText)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0() {
        boolean zP = this.f22421s.p();
        this.f22421s.c(!zP);
        ReactContext reactContext = this.f22420r;
        if (reactContext != null) {
            if (zP) {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).disable();
            } else {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).enable();
            }
        }
        if (zP || this.f22421s.k()) {
            return;
        }
        Context context = this.f22403a;
        Toast.makeText(context, context.getString(com.facebook.react.p.f22893i), 1).show();
        this.f22421s.m(true);
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        if (!this.f22421s.o()) {
            Activity currentActivity = this.f22408f.getCurrentActivity();
            if (currentActivity == null) {
                qk.a.m("ReactNative", "Unable to get reference to react activity");
            } else {
                com.facebook.react.devsupport.d.h(currentActivity);
            }
        }
        eo.a aVar = this.f22421s;
        aVar.i(!aVar.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0() {
        Intent intent = new Intent(this.f22403a, (Class<?>) DevSettingsActivity.class);
        intent.setFlags(268435456);
        this.f22403a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(pn.d[] dVarArr, DialogInterface dialogInterface, int i11) {
        dVarArr[i11].a();
        this.f22416n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(DialogInterface dialogInterface) {
        this.f22416n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(String str, pn.k[] kVarArr, int i11, pn.g gVar) {
        J0(str, kVarArr, i11, gVar);
        if (this.f22415m == null) {
            jn.h hVarD = d(NativeRedBoxSpec.NAME);
            if (hVarD != null) {
                this.f22415m = hVarD;
            } else {
                this.f22415m = new f1(this);
            }
            this.f22415m.c(NativeRedBoxSpec.NAME);
        }
        if (this.f22415m.a()) {
            return;
        }
        this.f22415m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0() {
        eo.a aVar = this.f22421s;
        aVar.n(!aVar.j());
        this.f22408f.g();
    }

    @Override // pn.e
    public pn.k[] A() {
        return this.f22428z;
    }

    @Override // pn.e
    public void B(final pn.h hVar) {
        new Runnable() { // from class: com.facebook.react.devsupport.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f22550a.m0(hVar);
            }
        }.run();
    }

    public void C0(String str, pn.a aVar) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        G0(str);
        com.facebook.react.devsupport.b.c cVar = new com.facebook.react.devsupport.b.c();
        this.f22406d.o(new f(cVar, aVar), this.f22410h, str, cVar);
    }

    @Override // pn.e
    public boolean D() {
        if (this.f22424v && this.f22410h.exists()) {
            try {
                String packageName = this.f22403a.getPackageName();
                if (this.f22410h.lastModified() > this.f22403a.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, "/data/local/tmp/exopackage/%s//secondary-dex", packageName));
                    return !file.exists() || this.f22410h.lastModified() > file.lastModified();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                qk.a.m("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    public void D0() {
        if (UiThreadUtil.isOnUiThread()) {
            B0();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22540a.B0();
                }
            });
        }
    }

    public void I0(String str, Throwable th2) {
        qk.a.n("ReactNative", "Exception in native call", th2);
        H0(str, i1.a(th2), -1, pn.g.NATIVE);
    }

    @Override // pn.e
    public void a(String str, pn.e.a aVar) {
        this.f22414l.a(str, aVar);
    }

    @Override // pn.e
    public View b(String str) {
        return this.f22408f.b(str);
    }

    @Override // pn.e
    public void c(final boolean z11) {
        if (this.f22424v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22553a.q0(z11);
                }
            });
        }
    }

    @Override // pn.e
    public jn.h d(String str) {
        jn.i iVar = this.F;
        if (iVar == null) {
            return null;
        }
        return iVar.d(str);
    }

    public pn.c d0() {
        return this.f22413k;
    }

    @Override // pn.e
    public void e(View view) {
        this.f22408f.e(view);
    }

    public k e0() {
        return this.f22406d;
    }

    @Override // pn.e
    public void f() {
        this.f22414l.f();
    }

    public String f0() {
        return this.f22409g;
    }

    @Override // pn.e
    public void g() {
        if (this.f22424v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22556a.z0();
                }
            });
        }
    }

    @Override // pn.e
    public Activity getCurrentActivity() {
        return this.f22408f.getCurrentActivity();
    }

    @Override // pn.e
    public ReactContext h() {
        return this.f22420r;
    }

    public z0 h0() {
        return this.f22408f;
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (this.f22424v) {
            A0(exc);
        } else {
            this.f22412j.handleException(exc);
        }
    }

    @Override // pn.e
    public void i(final boolean z11) {
        if (this.f22424v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22400a.p0(z11);
                }
            });
        }
    }

    @Override // pn.e
    public String j() {
        return this.f22410h.getAbsolutePath();
    }

    protected abstract String j0();

    @Override // pn.e
    public boolean k() {
        return this.f22424v;
    }

    protected void k0() {
        this.f22413k.hide();
        this.f22418p = false;
    }

    @Override // pn.e
    public Pair<String, pn.k[]> l(Pair<String, pn.k[]> pair) {
        List<pn.f> list = this.D;
        if (list != null) {
            Iterator<pn.f> it = list.iterator();
            while (it.hasNext()) {
                Pair<String, pn.k[]> pairA = it.next().a(pair);
                if (pairA != null) {
                    pair = pairA;
                }
            }
        }
        return pair;
    }

    @Override // pn.e
    public void m(boolean z11) {
        this.f22424v = z11;
        D0();
    }

    @Override // pn.e
    public void n(String str, pn.d dVar) {
        this.f22407e.put(str, dVar);
    }

    @Override // pn.e
    public pn.j o() {
        return this.f22426x;
    }

    @Override // pn.e
    public void p(ReactContext reactContext) {
        F0(reactContext);
    }

    @Override // pn.e
    /* JADX INFO: renamed from: q */
    public eo.a getDevSettings() {
        return this.f22421s;
    }

    @Override // pn.e
    public void r() {
        if (this.f22416n == null && this.f22424v && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            linkedHashMap.put(this.f22403a.getString(com.facebook.react.p.f22900p), new b());
            if (this.f22421s.getIsDeviceDebugEnabled()) {
                boolean z11 = this.f22425w;
                String string = this.f22403a.getString(z11 ? com.facebook.react.p.f22887c : com.facebook.react.p.f22888d);
                if (!z11) {
                    hashSet.add(string);
                }
                linkedHashMap.put(string, new pn.d() { // from class: com.facebook.react.devsupport.u
                    @Override // pn.d
                    public final void a() {
                        this.f22571a.r0();
                    }
                });
            }
            linkedHashMap.put(this.f22403a.getString(com.facebook.react.p.f22886b), new pn.d() { // from class: com.facebook.react.devsupport.v
                @Override // pn.d
                public final void a() {
                    this.f22575a.s0();
                }
            });
            linkedHashMap.put(this.f22403a.getString(com.facebook.react.p.f22895k), new d());
            linkedHashMap.put(this.f22421s.p() ? this.f22403a.getString(com.facebook.react.p.f22894j) : this.f22403a.getString(com.facebook.react.p.f22891g), new pn.d() { // from class: com.facebook.react.devsupport.w
                @Override // pn.d
                public final void a() {
                    this.f22577a.t0();
                }
            });
            linkedHashMap.put(this.f22421s.o() ? this.f22403a.getString(com.facebook.react.p.f22899o) : this.f22403a.getString(com.facebook.react.p.f22898n), new pn.d() { // from class: com.facebook.react.devsupport.x
                @Override // pn.d
                public final void a() {
                    this.f22579a.u0();
                }
            });
            linkedHashMap.put(this.f22403a.getString(com.facebook.react.p.f22902r), new pn.d() { // from class: com.facebook.react.devsupport.y
                @Override // pn.d
                public final void a() {
                    this.f22582a.v0();
                }
            });
            if (this.f22407e.size() > 0) {
                linkedHashMap.putAll(this.f22407e);
            }
            final pn.d[] dVarArr = (pn.d[]) linkedHashMap.values().toArray(new pn.d[0]);
            Activity currentActivity = this.f22408f.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                qk.a.m("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(currentActivity);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(currentActivity);
            textView.setText(currentActivity.getString(com.facebook.react.p.f22889e, j0()));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String strG0 = g0();
            if (strG0 != null) {
                TextView textView2 = new TextView(currentActivity);
                textView2.setText(currentActivity.getString(com.facebook.react.p.f22890f, strG0));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(currentActivity).setCustomTitle(linearLayout).setAdapter(new e(currentActivity, R.layout.simple_list_item_1, (String[]) linkedHashMap.keySet().toArray(new String[0]), hashSet), new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    this.f22585a.w0(dVarArr, dialogInterface, i11);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.a0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f22384a.x0(dialogInterface);
                }
            }).create();
            this.f22416n = alertDialogCreate;
            alertDialogCreate.show();
            ReactContext reactContext = this.f22420r;
            if (reactContext != null) {
                ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit("RCTDevMenuShown", null);
            }
        }
    }

    @Override // pn.e
    public void s(ReactContext reactContext) {
        if (reactContext == this.f22420r) {
            F0(null);
        }
        System.gc();
    }

    @Override // pn.e
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void r0() {
        this.f22406d.x(this.f22420r, this.f22403a.getString(com.facebook.react.p.f22897m));
    }

    @Override // pn.e
    public String u() {
        return this.f22427y;
    }

    @Override // pn.e
    public void v() {
        this.f22406d.i();
    }

    @Override // pn.e
    public void w() {
        jn.h hVar = this.f22415m;
        if (hVar == null) {
            return;
        }
        hVar.hide();
    }

    @Override // pn.e
    public pn.g x() {
        return this.A;
    }

    @Override // pn.e
    public String y() {
        String str = this.f22409g;
        return str == null ? "" : this.f22406d.v((String) gn.a.c(str));
    }

    @Override // pn.e
    public void z() {
        if (this.f22424v) {
            this.f22406d.y();
        }
    }
}
