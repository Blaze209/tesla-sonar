package com.fourthline.orca.internal;

import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3191dx implements DeviceDataCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f31266d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f31267e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f31268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31270c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dx$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3191dx(AndroidDataCollectorHelper helper, Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(helper, "helper");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f31268a = helper;
        this.f31269b = destination;
        this.f31270c = z11;
    }

    private final float a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    private final Pair b(WindowManager windowManager) {
        Pair pairA;
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            pairA = jn0.x.a(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            pairA = jn0.x.a(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
        return jn0.x.a(Integer.valueOf((int) (((Number) pairA.e()).floatValue() / a(windowManager))), Integer.valueOf((int) (((Number) pairA.f()).floatValue() / a(windowManager))));
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        AndroidDataCollectorHelper androidDataCollectorHelper;
        WindowManager windowManager;
        if (!this.f31270c || (windowManager = (androidDataCollectorHelper = this.f31268a).getWindowManager()) == null) {
            return;
        }
        Pair pairB = b(windowManager);
        this.f31269b.put("screenWidth", pairB.e());
        this.f31269b.put("screenHeight", pairB.f());
        this.f31269b.put("screenScaleFactor", Float.valueOf(a(windowManager)));
        try {
            this.f31269b.put("screenBrightness", Double.valueOf(((double) Settings.System.getInt(androidDataCollectorHelper.getContentResolver(), "screen_brightness")) / 100.0d));
        } catch (Exception unused) {
        }
    }
}
