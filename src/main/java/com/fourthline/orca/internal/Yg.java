package com.fourthline.orca.internal;

import android.app.ActivityManager;
import android.os.Environment;
import android.os.StatFs;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Yg implements DeviceDataCollector {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29879e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29880f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f29881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f29882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Double[] f29884d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Yg(AndroidDataCollectorHelper helper, Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(helper, "helper");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f29881a = helper;
        this.f29882b = destination;
        this.f29883c = z11;
        this.f29884d = new Double[]{Double.valueOf(0.25d), Double.valueOf(0.5d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(4.0d), Double.valueOf(8.0d)};
    }

    private final double a(long j11) {
        return j11 / 1.073741824E9d;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f29883c) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.f29881a;
            String property = System.getProperty("os.arch");
            if (property == null) {
                property = "unknown";
            }
            this.f29882b.put("deviceArchitectureName", property);
            if (!p013kotlin.jvm.internal.s.f(property, "unknown")) {
                this.f29882b.put("deviceArchitectureBitness", p013kotlin.text.t.h0(property, "64", false, 2, null) ? "64" : "32");
            }
            this.f29882b.put("deviceProcessorsCount", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
            ActivityManager activityManager = androidDataCollectorHelper.getActivityManager();
            if (activityManager != null) {
                this.f29882b.put("deviceMemoryAmount", Double.valueOf(a(activityManager)));
            }
            Pair pairA = a();
            this.f29882b.put("deviceStorageAmountTotal", pairA.e());
            this.f29882b.put("deviceStorageAmountFree", pairA.f());
        }
    }

    private final double a(ActivityManager activityManager) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return a(memoryInfo.totalMem / 1.073741824E9d);
    }

    private final double a(double d11) {
        double dDoubleValue = ((Number) p013kotlin.collections.n.k0(this.f29884d)).doubleValue();
        double d12 = Double.MAX_VALUE;
        for (Double d13 : this.f29884d) {
            double dDoubleValue2 = d13.doubleValue();
            double dAbs = Math.abs(d11 - dDoubleValue2);
            if (dAbs < d12) {
                dDoubleValue = dDoubleValue2;
                d12 = dAbs;
            }
        }
        return dDoubleValue;
    }

    private final Pair a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return jn0.x.a(Double.valueOf(a(statFs.getTotalBytes())), Double.valueOf(a(statFs.getAvailableBlocksLong())));
    }
}
