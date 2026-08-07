package com.fourthline.orca.internal;

import android.os.Build;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.List;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3945vg implements DeviceDataCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36110d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36111e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36114c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vg$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3945vg(Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f36112a = destination;
        this.f36113b = z11;
        String RELEASE = Build.VERSION.RELEASE;
        p013kotlin.jvm.internal.s.j(RELEASE, "RELEASE");
        List listF1 = p013kotlin.text.t.f1(RELEASE, new String[]{"."}, false, 0, 6, null);
        int size = listF1.size();
        if (size == 1) {
            RELEASE = listF1.get(0) + ".0.0";
        } else if (size == 2) {
            RELEASE = listF1.get(0) + "." + listF1.get(1) + ".0";
        }
        p013kotlin.jvm.internal.s.j(RELEASE, "with(...)");
        this.f36114c = RELEASE;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f36113b) {
            this.f36112a.put("sdkVersion", "3.2.22");
            this.f36112a.put("sdkPlatformName", "android");
            this.f36112a.put("deviceModel", Build.MODEL);
            this.f36112a.put("devicePlatformName", "Android");
            this.f36112a.put("devicePlatformVersion", this.f36114c);
        }
    }
}
