package com.teslamotors.TeslaApp;

import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.s;
import com.facebook.react.v;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapsSdkInitializedCallback;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.teslamotors.TeslaApp.MainActivity;
import com.teslamotors.plugins.ble.i;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import expo.modules.ReactActivityDelegateWrapper;
import gj0.f;
import ie0.r;
import java.util.List;
import jn.e;
import nc0.l;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import qb0.a;
import ra0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001\u001f\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/teslamotors/TeslaApp/MainActivity;", "Lcom/facebook/react/s;", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "x", "(Landroid/content/Intent;)V", "u", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onStart", "onStop", "", "n", "()Ljava/lang/String;", "Lcom/facebook/react/v;", "m", "()Lcom/facebook/react/v;", "onPause", "onUserInteraction", "v", "onNewIntent", "Ljn/e;", "g", "Ljn/e;", "shakeDetector", "com/teslamotors/TeslaApp/MainActivity$d", "h", "Lcom/teslamotors/TeslaApp/MainActivity$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, IntegerTokenConverter.CONVERTER_KEY, "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainActivity extends s {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final g f56627j = g.INSTANCE.a("MainActivity");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f56628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f56629l;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private e shakeDetector;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d listener = new d();

    /* JADX INFO: renamed from: com.teslamotors.TeslaApp.MainActivity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/teslamotors/TeslaApp/MainActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "", "SESSION_INFO_THROTTLE_MS", "J", "lastSessionInfoRequestTime", "lastSessionInfoRequestVin", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56632a;

        static {
            int[] iArr = new int[MapsInitializer.Renderer.values().length];
            try {
                iArr[MapsInitializer.Renderer.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapsInitializer.Renderer.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56632a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/teslamotors/TeslaApp/MainActivity$c", "Lcom/facebook/react/v;", "Landroid/os/Bundle;", "getLaunchOptions", "()Landroid/os/Bundle;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends v {
        c(String str) {
            super((s) MainActivity.this, str);
        }

        @Override // com.facebook.react.v
        protected Bundle getLaunchOptions() {
            he0.b bVarM = he0.b.m(MainActivity.this);
            Bundle bundle = new Bundle();
            bundle.putString("gitHash", a.INSTANCE.b().t());
            bundle.putString("remoteNotificationDeviceType", bVarM.w());
            bundle.putString("appStartTimestamp", String.valueOf(System.currentTimeMillis()));
            bundle.putLong("binaryBuiltMillis", BuildConfig.BINARY_BUILD_TIMESTAMP);
            return bundle;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/teslamotors/TeslaApp/MainActivity$d", "Lkb0/g$b;", "", "vin", "Lkb0/g$c;", "state", "Ljn0/h0;", "a", "(Ljava/lang/String;Lkb0/g$c;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements kb0.g.b {
        d() {
        }

        @Override // kb0.g.b
        public void a(String vin, kb0.g.c state) {
            p013kotlin.jvm.internal.s.k(vin, "vin");
            p013kotlin.jvm.internal.s.k(state, "state");
            i.B(MainActivity.this.getApplicationContext(), "MainActivity#onVehicleConnectivityStateChange").w0(vin, state);
            if (state == kb0.g.c.ONLINE) {
                le0.a.f89960a.c(vin);
            }
        }
    }

    private final void u() {
        long j11 = 1024;
        long jFreeMemory = (Runtime.getRuntime().freeMemory() / j11) / j11;
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        long availableBlocksLong = ((statFs.getAvailableBlocksLong() * statFs.getFreeBlocksLong()) / j11) / j11;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        teslaLog.d("MainApplication", "Free Disk Space : " + availableBlocksLong + " Mb");
        teslaLog.d("MainApplication", "Free Memory Java Heap : " + jFreeMemory + " Mb");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w() {
        com.tesla.logging.a.d(com.tesla.logging.a.EnumC1131a.MOTION_SHAKE, null, 2, null);
    }

    private final void x(Intent intent) {
        if (f.a(intent)) {
            Bundle bundleC = f.c(intent);
            p013kotlin.jvm.internal.s.j(bundleC, "extractBundleFromIntent(...)");
            IPushNotification iPushNotificationL = com.wix.reactnativenotifications.core.notification.a.l(getApplicationContext(), bundleC);
            if (iPushNotificationL != null) {
                iPushNotificationL.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(MapsInitializer.Renderer renderer) {
        p013kotlin.jvm.internal.s.k(renderer, "renderer");
        int i11 = b.f56632a[renderer.ordinal()];
        if (i11 == 1) {
            f56627j.j("using legacy map renderer");
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f56627j.j("using latest map renderer");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(ic0.g it) {
        p013kotlin.jvm.internal.s.k(it, "it");
    }

    @Override // com.facebook.react.s
    protected v m() {
        return new ReactActivityDelegateWrapper(this, false, new c(n()));
    }

    @Override // com.facebook.react.s
    protected String n() {
        return "TeslaV4";
    }

    @Override // com.facebook.react.s, androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        g gVar = f56627j;
        gVar.j("onCreate started");
        ld0.d.b(l.ANDROID_TIME_TO_INTERACTIVE);
        ld0.d.b(l.JS_STARTUP);
        super.onCreate(null);
        u();
        if (r.a()) {
            md0.d.f91834a.d(true, this);
        }
        if (getIntent() != null) {
            Intent intent = getIntent();
            p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
            com.teslamotors.plugins.widget.a.a(this, intent);
        }
        if (savedInstanceState == null && getIntent() != null) {
            Intent intent2 = getIntent();
            p013kotlin.jvm.internal.s.j(intent2, "getIntent(...)");
            x(intent2);
        }
        if (!r.a()) {
            MapsInitializer.initialize(getApplicationContext(), MapsInitializer.Renderer.LEGACY, new OnMapsSdkInitializedCallback() { // from class: ue0.b
                @Override // com.google.android.gms.maps.OnMapsSdkInitializedCallback
                public final void onMapsSdkInitialized(MapsInitializer.Renderer renderer) {
                    MainActivity.y(renderer);
                }
            });
        }
        fa0.l.f64736a.b();
        gVar.j("onCreate ended");
    }

    @Override // com.facebook.react.s, androidx.p002activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        p013kotlin.jvm.internal.s.k(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        com.teslamotors.plugins.widget.a.a(this, intent);
        x(intent);
        ReactContext reactContextE = q().getReactInstanceManager().E();
        if (reactContextE != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data == null || action != null || (deviceEventManagerModule = (DeviceEventManagerModule) reactContextE.getNativeModule(DeviceEventManagerModule.class)) == null) {
                return;
            }
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
    }

    @Override // com.facebook.react.s, androidx.fragment.app.u, android.app.Activity
    protected void onPause() {
        f56627j.j("onPause");
        super.onPause();
        i.B(getApplicationContext(), "MainActivity#onPause").V();
        e eVar = this.shakeDetector;
        if (eVar != null) {
            eVar.f();
        }
        kd0.e.INSTANCE.a().g(l.WAKE_TO_FRESH_DATA);
        h.f107467a.g();
    }

    @Override // com.facebook.react.s, androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        f56627j.j("onResume");
        super.onResume();
        i.B(getApplicationContext(), "MainActivity#onResume").W();
        List<String> listV = he0.b.m(getApplicationContext()).v();
        p013kotlin.jvm.internal.s.j(listV, "getRecentlySelectedVINs(...)");
        String str = (String) p013kotlin.collections.v.q0(listV);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null && (!p013kotlin.jvm.internal.s.f(str, f56629l) || jCurrentTimeMillis - f56628k > 60000)) {
            f56629l = str;
            ob0.e eVar = ob0.e.f97095a;
            Context applicationContext = getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            ic0.e eVarG = eVar.g(applicationContext);
            if (eVarG != null) {
                f56628k = jCurrentTimeMillis;
                eb0.f.Companion aVar = eb0.f.INSTANCE;
                Context applicationContext2 = getApplicationContext();
                p013kotlin.jvm.internal.s.j(applicationContext2, "getApplicationContext(...)");
                aVar.a(applicationContext2).a(eVarG, new ce0.d() { // from class: ue0.a
                    @Override // ce0.d
                    public final void a(ic0.g gVar) {
                        MainActivity.z(gVar);
                    }
                });
            }
        }
        e eVar2 = this.shakeDetector;
        if (eVar2 != null) {
            Object systemService = getSystemService("sensor");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            eVar2.e((SensorManager) systemService);
        }
        wd0.i iVar = wd0.i.f121692a;
        Context applicationContext3 = getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext3, "getApplicationContext(...)");
        iVar.b(applicationContext3);
        h.f107467a.h();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    protected void onStart() {
        f56627j.j("onStart");
        super.onStart();
        com.tesla.remotelog_core.a.Companion c1141a = com.tesla.remotelog_core.a.INSTANCE;
        Context applicationContext = getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        c1141a.c(applicationContext).a();
        le0.a.f89960a.b();
        ie0.c.f77575a.f(this);
        kb0.g.f85866a.s(this.listener);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    protected void onStop() {
        f56627j.j("onStop");
        super.onStop();
        com.tesla.remotelog_core.a.Companion c1141a = com.tesla.remotelog_core.a.INSTANCE;
        Context applicationContext = getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        c1141a.c(applicationContext).b();
        ie0.c.f77575a.g(this);
        kb0.g.f85866a.v(this.listener);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        h.f107467a.c();
    }

    public final void v() {
        if (this.shakeDetector == null) {
            e eVar = new e(new e.a() { // from class: ue0.c
                @Override // jn.e.a
                public final void a() {
                    MainActivity.w();
                }
            }, 0, 2, null);
            this.shakeDetector = eVar;
            Object systemService = getSystemService("sensor");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            eVar.e((SensorManager) systemService);
        }
    }
}
