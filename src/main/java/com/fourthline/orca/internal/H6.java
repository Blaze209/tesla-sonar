package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class H6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26084e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26085f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f26087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AndroidDataCollectorHelper f26088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E6 f26089d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public H6(Context context, Activity activity, AndroidDataCollectorHelper androidDataCollectorHelper, E6 deviceDataBundle) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(androidDataCollectorHelper, "androidDataCollectorHelper");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        this.f26086a = context;
        this.f26087b = activity;
        this.f26088c = androidDataCollectorHelper;
        this.f26089d = deviceDataBundle;
    }

    public final List a(DeviceDataCollection config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.getEnabled();
        return p013kotlin.collections.v.p(new C3945vg(this.f26089d.e(), config.getEnabled()), new V0(this.f26088c, this.f26089d.a(), config.getEnabled() && config.getBattery().getEnabled()), new Z3(this.f26088c, this.f26089d.b(), config.getEnabled() && config.getCellular().getEnabled()), new C2926Qe(this.f26088c, this.f26089d.d(), config.getEnabled() && config.getEnvironment().getEnabled()), new Eg(this.f26088c, this.f26089d.f(), config.getEnabled() && config.getGps().getEnabled()), new Yg(this.f26088c, this.f26089d.g(), config.getEnabled() && config.getHardware().getEnabled()), new C3433jj(this.f26089d.h(), config.getEnabled() && config.getLocale().getEnabled()), new C3052al(this.f26088c, this.f26089d.k(), config.getEnabled() && config.getNetwork().getEnabled()), new C3191dx(this.f26088c, this.f26089d.l(), config.getEnabled() && config.getScreen().getEnabled()), new JA(this.f26086a, this.f26087b, this.f26089d.n(), config.getEnabled() && config.getSystem().getEnabled()));
    }
}
