package com.facebook.react.uimanager;

import android.annotation.TargetApi;
import android.graphics.BlendMode;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/c;", "", "<init>", "()V", "", "mixBlendMode", "Landroid/graphics/BlendMode;", "b", "(Ljava/lang/String;)Landroid/graphics/BlendMode;", "Landroid/view/ViewGroup;", "view", "", "a", "(Landroid/view/ViewGroup;)Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@TargetApi(29)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f23130a = new c();

    private c() {
    }

    public static final boolean a(ViewGroup view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        Iterator<View> it = androidx.core.view.s0.a(view).iterator();
        while (it.hasNext()) {
            if (it.next().getTag(com.facebook.react.m.f22668r) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final BlendMode b(String mixBlendMode) {
        if (mixBlendMode == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        switch (mixBlendMode.hashCode()) {
            case -2120744511:
                if (mixBlendMode.equals("luminosity")) {
                    return BlendMode.LUMINOSITY;
                }
                break;
            case -1427739212:
                if (mixBlendMode.equals("hard-light")) {
                    return BlendMode.HARD_LIGHT;
                }
                break;
            case -1338968417:
                if (mixBlendMode.equals("darken")) {
                    return BlendMode.DARKEN;
                }
                break;
            case -1247677005:
                if (mixBlendMode.equals("soft-light")) {
                    return BlendMode.SOFT_LIGHT;
                }
                break;
            case -1091287984:
                if (mixBlendMode.equals("overlay")) {
                    return BlendMode.OVERLAY;
                }
                break;
            case -1039745817:
                if (mixBlendMode.equals("normal")) {
                    return null;
                }
                break;
            case -907689876:
                if (mixBlendMode.equals(AnalyticsContext.Screen)) {
                    return BlendMode.SCREEN;
                }
                break;
            case -230491182:
                if (mixBlendMode.equals("saturation")) {
                    return BlendMode.SATURATION;
                }
                break;
            case -120580883:
                if (mixBlendMode.equals("color-dodge")) {
                    return BlendMode.COLOR_DODGE;
                }
                break;
            case 103672:
                if (mixBlendMode.equals("hue")) {
                    return BlendMode.HUE;
                }
                break;
            case 94842723:
                if (mixBlendMode.equals("color")) {
                    return BlendMode.COLOR;
                }
                break;
            case 170546239:
                if (mixBlendMode.equals("lighten")) {
                    return BlendMode.LIGHTEN;
                }
                break;
            case 653829668:
                if (mixBlendMode.equals("multiply")) {
                    return BlendMode.MULTIPLY;
                }
                break;
            case 1242982905:
                if (mixBlendMode.equals("color-burn")) {
                    return BlendMode.COLOR_BURN;
                }
                break;
            case 1686617550:
                if (mixBlendMode.equals("exclusion")) {
                    return BlendMode.EXCLUSION;
                }
                break;
            case 1728361789:
                if (mixBlendMode.equals("difference")) {
                    return BlendMode.DIFFERENCE;
                }
                break;
        }
        throw new IllegalArgumentException("Invalid mix-blend-mode name: " + mixBlendMode);
    }
}
