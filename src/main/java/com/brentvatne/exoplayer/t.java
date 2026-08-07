package com.brentvatne.exoplayer;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.pm.ActivityInfo;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Process;
import android.util.Rational;
import androidx.core.util.Consumer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.Lifecycle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u000fJ7\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0014H\u0003¢\u0006\u0004\b2\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u0010/¨\u00065"}, d2 = {"Lcom/brentvatne/exoplayer/t;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/brentvatne/exoplayer/p0;", "view", "Ljava/lang/Runnable;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/uimanager/v0;Lcom/brentvatne/exoplayer/p0;)Ljava/lang/Runnable;", "Landroid/app/PictureInPictureParams;", "pictureInPictureParams", "Ljn0/h0;", "p", "(Lcom/facebook/react/uimanager/v0;Landroid/app/PictureInPictureParams;)V", "Landroid/app/PictureInPictureParams$Builder;", "pipParamsBuilder", "Lzi/c;", "receiver", "", "isPaused", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/uimanager/v0;Landroid/app/PictureInPictureParams$Builder;Lzi/c;Z)V", "autoEnterEnabled", "h", "(Lcom/facebook/react/uimanager/v0;Landroid/app/PictureInPictureParams$Builder;Z)V", "Lcom/brentvatne/exoplayer/l;", "playerView", "j", "(Lcom/facebook/react/uimanager/v0;Landroid/app/PictureInPictureParams$Builder;Lcom/brentvatne/exoplayer/l;)V", "pipParams", "t", "Ljava/util/ArrayList;", "Landroid/app/RemoteAction;", "Lkotlin/collections/ArrayList;", "q", "(Lcom/facebook/react/uimanager/v0;ZLzi/c;)Ljava/util/ArrayList;", "Landroid/graphics/Rect;", "l", "(Lcom/brentvatne/exoplayer/l;)Landroid/graphics/Rect;", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "Landroid/util/Rational;", "k", "(Landroidx/media3/exoplayer/ExoPlayer;)Landroid/util/Rational;", "r", "(Lcom/facebook/react/uimanager/v0;)Z", "s", "()Z", "m", "n", "o", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f20428a = new t();

    private t() {
    }

    public static final Runnable d(com.facebook.react.uimanager.v0 context, final p0 view) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(view, "view");
        final ComponentActivity componentActivityA = u.a(context);
        final Consumer<androidx.core.app.w> consumer = new Consumer() { // from class: com.brentvatne.exoplayer.q
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                t.e(view, componentActivityA, (androidx.core.app.w) obj);
            }
        };
        final Runnable runnable = new Runnable() { // from class: com.brentvatne.exoplayer.r
            @Override // java.lang.Runnable
            public final void run() {
                t.f(view);
            }
        };
        componentActivityA.addOnPictureInPictureModeChangedListener(consumer);
        if (Build.VERSION.SDK_INT < 31) {
            componentActivityA.addOnUserLeaveHintListener(runnable);
        }
        return new Runnable() { // from class: com.brentvatne.exoplayer.s
            @Override // java.lang.Runnable
            public final void run() {
                t.g(componentActivityA, consumer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p0 p0Var, ComponentActivity componentActivity, androidx.core.app.w info) {
        p013kotlin.jvm.internal.s.k(info, "info");
        p0Var.setIsInPictureInPicture(info.getIsInPictureInPictureMode());
        if (info.getIsInPictureInPictureMode() || componentActivity.getLifecycle().getState() != Lifecycle.State.CREATED || p0Var.f20369h0) {
            return;
        }
        p0Var.setPausedModifier(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p0 p0Var) {
        if (p0Var.f20398w) {
            p0Var.R0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ComponentActivity componentActivity, Consumer consumer, Runnable runnable) {
        componentActivity.removeOnPictureInPictureModeChangedListener(consumer);
        componentActivity.removeOnUserLeaveHintListener(runnable);
    }

    public static final void h(com.facebook.react.uimanager.v0 context, PictureInPictureParams.Builder pipParamsBuilder, boolean autoEnterEnabled) {
        p013kotlin.jvm.internal.s.k(context, "context");
        if (pipParamsBuilder == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        pipParamsBuilder.setAutoEnterEnabled(autoEnterEnabled);
        t tVar = f20428a;
        PictureInPictureParams pictureInPictureParamsBuild = pipParamsBuilder.build();
        p013kotlin.jvm.internal.s.j(pictureInPictureParamsBuild, "build(...)");
        tVar.t(context, pictureInPictureParamsBuild);
    }

    public static final void i(com.facebook.react.uimanager.v0 context, PictureInPictureParams.Builder pipParamsBuilder, zi.c receiver, boolean isPaused) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(receiver, "receiver");
        if (pipParamsBuilder == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        pipParamsBuilder.setActions(q(context, isPaused, receiver));
        t tVar = f20428a;
        PictureInPictureParams pictureInPictureParamsBuild = pipParamsBuilder.build();
        p013kotlin.jvm.internal.s.j(pictureInPictureParamsBuild, "build(...)");
        tVar.t(context, pictureInPictureParamsBuild);
    }

    public static final void j(com.facebook.react.uimanager.v0 context, PictureInPictureParams.Builder pipParamsBuilder, l playerView) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(playerView, "playerView");
        if (pipParamsBuilder == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        pipParamsBuilder.setSourceRectHint(l(playerView));
        t tVar = f20428a;
        PictureInPictureParams pictureInPictureParamsBuild = pipParamsBuilder.build();
        p013kotlin.jvm.internal.s.j(pictureInPictureParamsBuild, "build(...)");
        tVar.t(context, pictureInPictureParamsBuild);
    }

    public static final Rational k(ExoPlayer player) {
        p013kotlin.jvm.internal.s.k(player, "player");
        Rational rational = new Rational(player.O().f101332a, player.O().f101333b);
        Rational rational2 = new Rational(EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, 100);
        Rational rational3 = new Rational(100, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE);
        if (rational.floatValue() > rational2.floatValue()) {
            return rational2;
        }
        return rational.floatValue() < rational3.floatValue() ? rational3 : rational;
    }

    private static final Rect l(l playerView) {
        Rect rect = new Rect();
        playerView.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        playerView.getLocationOnScreen(iArr);
        int i11 = rect.bottom - rect.top;
        int i12 = iArr[1];
        rect.top = i12;
        rect.bottom = i12 + i11;
        return rect;
    }

    private final boolean m() {
        return true;
    }

    private final boolean n(com.facebook.react.uimanager.v0 context) {
        boolean z11;
        ComponentActivity componentActivityA = u.a(context);
        if (componentActivityA == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = componentActivityA.getPackageManager().getActivityInfo(componentActivityA.getComponentName(), 128);
            p013kotlin.jvm.internal.s.j(activityInfo, "getActivityInfo(...)");
            z11 = (activityInfo.flags & 4194304) != 0;
        } catch (Exception unused) {
        }
        return z11 && componentActivityA.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    private final boolean o(com.facebook.react.uimanager.v0 context) {
        Activity currentActivity = context.getCurrentActivity();
        if (currentActivity == null) {
            return false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            return androidx.core.app.g.b(currentActivity, "android:picture_in_picture", Process.myUid(), currentActivity.getPackageName()) == 0;
        }
        return i11 < 26;
    }

    public static final void p(com.facebook.react.uimanager.v0 context, PictureInPictureParams pictureInPictureParams) {
        p013kotlin.jvm.internal.s.k(context, "context");
        t tVar = f20428a;
        if (tVar.r(context)) {
            if (!tVar.s() || pictureInPictureParams == null) {
                try {
                    u.a(context).enterPictureInPictureMode();
                    return;
                } catch (IllegalStateException e11) {
                    xi.a.b("PictureInPictureUtil", e11.toString());
                    return;
                }
            }
            try {
                u.a(context).enterPictureInPictureMode(pictureInPictureParams);
            } catch (IllegalStateException e12) {
                xi.a.b("PictureInPictureUtil", e12.toString());
            }
        }
    }

    public static final ArrayList<RemoteAction> q(com.facebook.react.uimanager.v0 context, boolean isPaused, zi.c receiver) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(receiver, "receiver");
        PendingIntent pendingIntentA = receiver.a(isPaused);
        Icon iconCreateWithResource = Icon.createWithResource(context, isPaused ? ia.r.f77205c : ia.r.f77204b);
        p013kotlin.jvm.internal.s.j(iconCreateWithResource, "createWithResource(...)");
        String str = isPaused ? "play" : "pause";
        p.a();
        return p013kotlin.collections.v.h(o.a(iconCreateWithResource, str, str, pendingIntentA));
    }

    private final boolean r(com.facebook.react.uimanager.v0 context) {
        return m() && n(context) && o(context);
    }

    private final boolean s() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final void t(com.facebook.react.uimanager.v0 context, PictureInPictureParams pipParams) {
        if (s() && r(context)) {
            try {
                u.a(context).setPictureInPictureParams(pipParams);
            } catch (IllegalStateException e11) {
                xi.a.b("PictureInPictureUtil", e11.toString());
            }
        }
    }
}
