package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f22441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReactContext f22442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f22443c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22444a;

        a(boolean z11) {
            this.f22444a = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f22444a || d.this.f22443c != null) {
                if (this.f22444a || d.this.f22443c == null) {
                    return;
                }
                d.this.f22443c.removeAllViews();
                d.this.f22441a.removeView(d.this.f22443c);
                d.this.f22443c = null;
                return;
            }
            if (!d.g(d.this.f22442b)) {
                qk.a.b("ReactNative", "Wait for overlay permission to be set");
                return;
            }
            d.this.f22443c = new j0(d.this.f22442b);
            d.this.f22441a.addView(d.this.f22443c, new WindowManager.LayoutParams(-1, -1, k1.TYPE_SYSTEM_OVERLAY, 24, -3));
        }
    }

    public d(ReactContext reactContext) {
        this.f22442b = reactContext;
        this.f22441a = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean f(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void h(Context context) {
        if (Settings.canDrawOverlays(context)) {
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        qk.a.I("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
        if (f(context, intent)) {
            context.startActivity(intent);
        }
    }

    public void i(boolean z11) {
        UiThreadUtil.runOnUiThread(new a(z11));
    }
}
