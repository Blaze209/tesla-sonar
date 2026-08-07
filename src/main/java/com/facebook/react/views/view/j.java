package com.facebook.react.views.view;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"Landroid/view/Window;", "", "isTranslucent", "Ljn0/h0;", "b", "(Landroid/view/Window;Z)V", "isHidden", DateTokenConverter.CONVERTER_KEY, "f", "(Landroid/view/Window;)V", "g", "e", "ReactAndroid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {
    public static final void b(Window window, boolean z11) {
        s.k(window, "<this>");
        if (z11) {
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.views.view.i
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return j.c(view, windowInsets);
                }
            });
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        ViewCompat.m0(window.getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets c(View v11, WindowInsets insets) {
        s.k(v11, "v");
        s.k(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = v11.onApplyWindowInsets(insets);
        return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public static final void d(Window window, boolean z11) {
        s.k(window, "<this>");
        if (z11) {
            f(window);
        } else {
            g(window);
        }
    }

    public static final void e(Window window, boolean z11) {
        s.k(window, "<this>");
        z0.b(window, !z11);
        if (z11) {
            int iArgb = 0;
            boolean z12 = (window.getContext().getResources().getConfiguration().uiMode & 48) == 32;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                window.setStatusBarContrastEnforced(false);
                window.setNavigationBarContrastEnforced(true);
            }
            window.setStatusBarColor(0);
            if (i11 < 29) {
                iArgb = (i11 < 27 || z12) ? Color.argb(128, 27, 27, 27) : Color.argb(EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 255, 255, 255);
            }
            window.setNavigationBarColor(iArgb);
            new WindowInsetsControllerCompat(window, window.getDecorView()).f(!z12);
            if (i11 >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = i11 >= 30 ? 3 : 1;
            }
        }
    }

    private static final void f(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            window.setDecorFitsSystemWindows(false);
        }
        window.addFlags(1024);
        window.clearFlags(2048);
    }

    private static final void g(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 0;
            window.setDecorFitsSystemWindows(true);
        }
        window.addFlags(2048);
        window.clearFlags(1024);
    }
}
