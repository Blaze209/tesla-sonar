package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u0012\u0004\b\u001c\u0010\u0003R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003¨\u0006 "}, d2 = {"Lcom/facebook/react/uimanager/d;", "", "<init>", "()V", "Landroid/util/DisplayMetrics;", "e", "()Landroid/util/DisplayMetrics;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "g", "(Landroid/content/Context;)V", "f", "", "fontScale", "Lcom/facebook/react/bridge/WritableMap;", "a", "(D)Lcom/facebook/react/bridge/WritableMap;", "displayMetrics", "b", "(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;", "Landroid/app/Activity;", "activity", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/app/Activity;)I", "Landroid/util/DisplayMetrics;", "getWindowDisplayMetrics$annotations", "windowDisplayMetrics", "getScreenDisplayMetrics$annotations", "screenDisplayMetrics", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23131a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static DisplayMetrics windowDisplayMetrics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static DisplayMetrics screenDisplayMetrics;

    private d() {
    }

    public static final WritableMap a(double fontScale) {
        if (windowDisplayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        if (screenDisplayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        d dVar = f23131a;
        DisplayMetrics displayMetrics = windowDisplayMetrics;
        p013kotlin.jvm.internal.s.i(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", dVar.b(displayMetrics, fontScale));
        DisplayMetrics displayMetrics2 = screenDisplayMetrics;
        p013kotlin.jvm.internal.s.i(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", dVar.b(displayMetrics2, fontScale));
        return writableNativeMap;
    }

    private final WritableMap b(DisplayMetrics displayMetrics, double fontScale) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, displayMetrics.widthPixels);
        writableNativeMap.putInt(Snapshot.HEIGHT, displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", fontScale);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static final DisplayMetrics c() {
        DisplayMetrics displayMetrics = screenDisplayMetrics;
        if (displayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        p013kotlin.jvm.internal.s.i(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final DisplayMetrics e() {
        DisplayMetrics displayMetrics = windowDisplayMetrics;
        if (displayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        p013kotlin.jvm.internal.s.i(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final void f(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        windowDisplayMetrics = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        screenDisplayMetrics = displayMetrics2;
    }

    public static final void g(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        if (screenDisplayMetrics != null) {
            return;
        }
        f(context);
    }

    public final int d(Activity activity) {
        Window window;
        View decorView;
        WindowInsetsCompat windowInsetsCompatH;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (windowInsetsCompatH = ViewCompat.H(decorView)) == null) {
            return 0;
        }
        return windowInsetsCompatH.f(WindowInsetsCompat.n.g() | WindowInsetsCompat.n.f() | WindowInsetsCompat.n.b()).f84925b;
    }
}
