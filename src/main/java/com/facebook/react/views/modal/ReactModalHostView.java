package com.facebook.react.views.modal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.m;
import com.facebook.react.q;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.view.e;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@fp.a
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0003\bL$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\tJ1\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010%\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\b*\u0010\tJ\u000f\u0010+\u001a\u00020\u0007H\u0014¢\u0006\u0004\b+\u0010\tJ!\u0010/\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u0010)J'\u0010;\u001a\u00020\u00072\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020,08j\b\u0012\u0004\u0012\u00020,`9H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0007¢\u0006\u0004\bA\u0010\tJ\u000f\u0010B\u001a\u00020\u0007H\u0016¢\u0006\u0004\bB\u0010\tJ\u000f\u0010C\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010\tJ\u000f\u0010D\u001a\u00020\u0007H\u0016¢\u0006\u0004\bD\u0010\tJ\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\tJ\u0017\u0010H\u001a\u00020\u00072\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IR(\u0010P\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8G@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010]\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010d\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u0010g\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010Q\u001a\u0004\be\u0010S\"\u0004\bf\u0010UR*\u0010j\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010Q\u001a\u0004\bh\u0010S\"\u0004\bi\u0010UR.\u0010o\u001a\u0004\u0018\u00010F2\b\u0010K\u001a\u0004\u0018\u00010F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010IR*\u0010s\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010Q\u001a\u0004\bq\u0010S\"\u0004\br\u0010UR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010uR\u0016\u0010w\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010QR\u0014\u0010z\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR)\u0010|\u001a\u0004\u0018\u00010{2\b\u0010|\u001a\u0004\u0018\u00010{8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R0\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00012\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Ljn0/h0;", "c", "()V", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "activity", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/app/Activity;)Z", IntegerTokenConverter.CONVERTER_KEY, "j", "Landroidx/core/view/WindowInsetsCompat;", "activityRootWindowInsets", "Landroidx/core/view/WindowInsetsControllerCompat;", "dialogWindowInsetsController", "", "", "types", "g", "(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsControllerCompat;Ljava/util/List;)V", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "id", "setId", "(I)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/View;", "child", "index", "addView", "(Landroid/view/View;I)V", "getChildCount", "()I", "getChildAt", "(I)Landroid/view/View;", "removeView", "(Landroid/view/View;)V", "removeViewAt", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outChildren", "addChildrenForAccessibility", "(Ljava/util/ArrayList;)V", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dispatchPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "e", "onHostResume", "onHostPause", "onHostDestroy", "f", "", "testId", "setDialogRootViewGroupTestId", "(Ljava/lang/String;)V", "Landroid/app/Dialog;", "value", "a", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "dialog", "Z", "getTransparent", "()Z", "setTransparent", "(Z)V", "transparent", "Landroid/content/DialogInterface$OnShowListener;", "Landroid/content/DialogInterface$OnShowListener;", "getOnShowListener", "()Landroid/content/DialogInterface$OnShowListener;", "setOnShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "onShowListener", "Lcom/facebook/react/views/modal/ReactModalHostView$c;", "Lcom/facebook/react/views/modal/ReactModalHostView$c;", "getOnRequestCloseListener", "()Lcom/facebook/react/views/modal/ReactModalHostView$c;", "setOnRequestCloseListener", "(Lcom/facebook/react/views/modal/ReactModalHostView$c;)V", "onRequestCloseListener", "getStatusBarTranslucent", "setStatusBarTranslucent", "statusBarTranslucent", "getNavigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarTranslucent", "Ljava/lang/String;", "getAnimationType", "()Ljava/lang/String;", "setAnimationType", "animationType", "h", "getHardwareAccelerated", "setHardwareAccelerated", "hardwareAccelerated", "Lcom/facebook/react/views/modal/ReactModalHostView$b;", "Lcom/facebook/react/views/modal/ReactModalHostView$b;", "dialogRootViewGroup", "createNewDialog", "getContentView", "()Landroid/view/View;", "contentView", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "getStateWrapper", "()Lcom/facebook/react/uimanager/u0;", "setStateWrapper", "(Lcom/facebook/react/uimanager/u0;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "setEventDispatcher", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "k", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ReactModalHostView extends ViewGroup implements LifecycleEventListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f23489k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f23490l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Dialog dialog;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean transparent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private DialogInterface.OnShowListener onShowListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private c onRequestCloseListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean statusBarTranslucent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean navigationBarTranslucent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String animationType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hardwareAccelerated;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final b dialogRootViewGroup;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean createNewDialog;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReactContext;)V", "", "getScreenDisplayMetricsWithoutInsets", "()J", "", Snapshot.WIDTH, Snapshot.HEIGHT, "c", "(FF)J", "", "TAG", "Ljava/lang/String;", "", "statusBarHeight", "I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long c(float width, float height) {
            return ((long) Float.floatToRawIntBits(height)) | (((long) Float.floatToRawIntBits(width)) << 32);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(ReactContext reactContext) {
            ReactModalHostView.f23490l = com.facebook.react.uimanager.d.f23131a.d(reactContext.getCurrentActivity());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @fp.a
        public final long getScreenDisplayMetricsWithoutInsets() {
            DisplayMetrics displayMetricsC = com.facebook.react.uimanager.d.c();
            w wVar = w.f23413a;
            return c(wVar.d(displayMetricsC.widthPixels), wVar.d(displayMetricsC.heightPixels - ReactModalHostView.f23490l));
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ!\u0010\"\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00109\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00108R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$b;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/uimanager/q0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "Ljn0/h0;", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", Snapshot.WIDTH, Snapshot.HEIGHT, "k", "(II)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onInterceptHoverEvent", "onHoverEvent", "Landroid/view/View;", "childView", "ev", "a", "(Landroid/view/View;Landroid/view/MotionEvent;)V", DateTokenConverter.CONVERTER_KEY, "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "Lcom/facebook/react/uimanager/u0;", "Lcom/facebook/react/uimanager/u0;", "getStateWrapper$ReactAndroid_release", "()Lcom/facebook/react/uimanager/u0;", "setStateWrapper$ReactAndroid_release", "(Lcom/facebook/react/uimanager/u0;)V", "stateWrapper", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "b", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "setEventDispatcher$ReactAndroid_release", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "eventDispatcher", "c", "I", "viewWidth", "viewHeight", "Lcom/facebook/react/uimanager/k;", "e", "Lcom/facebook/react/uimanager/k;", "jSTouchDispatcher", "Lcom/facebook/react/uimanager/j;", "f", "Lcom/facebook/react/uimanager/j;", "jSPointerDispatcher", "Lcom/facebook/react/uimanager/v0;", "getReactContext", "()Lcom/facebook/react/uimanager/v0;", "reactContext", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends e implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private u0 stateWrapper;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private EventDispatcher eventDispatcher;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int viewWidth;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int viewHeight;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final k jSTouchDispatcher;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private j jSPointerDispatcher;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/react/views/modal/ReactModalHostView$b$a", "Lcom/facebook/react/bridge/GuardedRunnable;", "Ljn0/h0;", "runGuarded", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends GuardedRunnable {
            a(v0 v0Var) {
                super(v0Var);
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) b.this.getReactContext().b().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(b.this.getId(), b.this.viewWidth, b.this.viewHeight);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            s.k(context, "context");
            this.jSTouchDispatcher = new k(this);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.jSPointerDispatcher = new j(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final v0 getReactContext() {
            Context context = getContext();
            s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            return (v0) context;
        }

        @Override // com.facebook.react.uimanager.q0
        public void a(View childView, MotionEvent ev2) {
            s.k(ev2, "ev");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.g(ev2, eventDispatcher);
                j jVar = this.jSPointerDispatcher;
                if (jVar != null) {
                    jVar.p(childView, ev2, eventDispatcher);
                }
            }
        }

        @Override // com.facebook.react.uimanager.q0
        public void d(View childView, MotionEvent ev2) {
            s.k(childView, "childView");
            s.k(ev2, "ev");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.f(ev2, eventDispatcher);
            }
            j jVar = this.jSPointerDispatcher;
            if (jVar != null) {
                jVar.o();
            }
        }

        /* JADX INFO: renamed from: getEventDispatcher$ReactAndroid_release, reason: from getter */
        public final EventDispatcher getEventDispatcher() {
            return this.eventDispatcher;
        }

        /* JADX INFO: renamed from: getStateWrapper$ReactAndroid_release, reason: from getter */
        public final u0 getStateWrapper() {
            return this.stateWrapper;
        }

        public final void k(int width, int height) {
            w wVar = w.f23413a;
            float fD = wVar.d(width);
            float fD2 = wVar.d(height);
            u0 u0Var = this.stateWrapper;
            if (u0Var == null) {
                getReactContext().runOnNativeModulesQueueThread(new a(getReactContext()));
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", fD);
            writableNativeMap.putDouble("screenHeight", fD2);
            u0Var.updateState(writableNativeMap);
        }

        @Override // com.facebook.react.views.view.e, android.view.View
        public boolean onHoverEvent(MotionEvent event) {
            j jVar;
            s.k(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null && (jVar = this.jSPointerDispatcher) != null) {
                jVar.k(event, eventDispatcher, false);
            }
            return super.onHoverEvent(event);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            s.k(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            String str = (String) getTag(m.f22670t);
            if (str != null) {
                info.setViewIdResourceName(str);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(MotionEvent event) {
            j jVar;
            s.k(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null && (jVar = this.jSPointerDispatcher) != null) {
                jVar.k(event, eventDispatcher, true);
            }
            return super.onHoverEvent(event);
        }

        @Override // com.facebook.react.views.view.e, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            s.k(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.d(event, eventDispatcher, getReactContext());
                j jVar = this.jSPointerDispatcher;
                if (jVar != null) {
                    jVar.k(event, eventDispatcher, true);
                }
            }
            return super.onInterceptTouchEvent(event);
        }

        @Override // com.facebook.react.views.view.e, android.view.View
        protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
            super.onSizeChanged(w11, h11, oldw, oldh);
            this.viewWidth = w11;
            this.viewHeight = h11;
            k(w11, h11);
        }

        @Override // com.facebook.react.views.view.e, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent event) {
            s.k(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.d(event, eventDispatcher, getReactContext());
                j jVar = this.jSPointerDispatcher;
                if (jVar != null) {
                    jVar.k(event, eventDispatcher, false);
                }
            }
            super.onTouchEvent(event);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        }

        public final void setEventDispatcher$ReactAndroid_release(EventDispatcher eventDispatcher) {
            this.eventDispatcher = eventDispatcher;
        }

        public final void setStateWrapper$ReactAndroid_release(u0 u0Var) {
            this.stateWrapper = u0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$c;", "", "Landroid/content/DialogInterface;", "dialog", "Ljn0/h0;", "a", "(Landroid/content/DialogInterface;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {
        void a(DialogInterface dialog);
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/react/views/modal/ReactModalHostView$d", "Landroid/content/DialogInterface$OnKeyListener;", "Landroid/content/DialogInterface;", "dialog", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKey", "(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements DialogInterface.OnKeyListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
            s.k(dialog, "dialog");
            s.k(event, "event");
            if (event.getAction() != 1) {
                return false;
            }
            if (keyCode == 4 || keyCode == 111) {
                c onRequestCloseListener = ReactModalHostView.this.getOnRequestCloseListener();
                if (onRequestCloseListener == null) {
                    throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal");
                }
                onRequestCloseListener.a(dialog);
                return true;
            }
            Context context = ReactModalHostView.this.getContext();
            s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(keyCode, event);
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactModalHostView(v0 context) {
        super(context);
        s.k(context, "context");
        f23489k.d(context);
        this.dialogRootViewGroup = new b(context);
    }

    private final void c() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.dialog;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) wo.a.a(dialog.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                dialog.dismiss();
            }
            this.dialog = null;
            this.createNewDialog = true;
            ViewParent parent = this.dialogRootViewGroup.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    private final boolean d(Activity activity) {
        return (activity == null || (activity.getWindow().getAttributes().flags & PKIFailureInfo.certRevoked) == 0) ? false : true;
    }

    private final void g(WindowInsetsCompat activityRootWindowInsets, WindowInsetsControllerCompat dialogWindowInsetsController, List<Integer> types) {
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (activityRootWindowInsets.q(iIntValue)) {
                if (dialogWindowInsetsController != null) {
                    dialogWindowInsetsController.i(iIntValue);
                }
            } else if (dialogWindowInsetsController != null) {
                dialogWindowInsetsController.c(iIntValue);
            }
        }
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.dialogRootViewGroup);
        if (!this.statusBarTranslucent) {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((v0) context).getCurrentActivity();
    }

    @fp.a
    private static final long getScreenDisplayMetricsWithoutInsets() {
        return f23489k.getScreenDisplayMetricsWithoutInsets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void h(ReactModalHostView reactModalHostView, WindowInsetsCompat windowInsetsCompat, WindowInsetsControllerCompat windowInsetsControllerCompat, List list, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = v.p(Integer.valueOf(WindowInsetsCompat.n.g()), Integer.valueOf(WindowInsetsCompat.n.f()));
        }
        reactModalHostView.g(windowInsetsCompat, windowInsetsControllerCompat, list);
    }

    private final void i() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            return;
        }
        try {
            Window window2 = currentActivity.getWindow();
            if (window2 != null) {
                if ((window2.getAttributes().flags & 1024) != 0) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
            }
            com.facebook.react.views.view.j.e(window, this.navigationBarTranslucent);
            if (!this.navigationBarTranslucent) {
                com.facebook.react.views.view.j.b(window, this.statusBarTranslucent);
            }
            if (this.transparent) {
                window.clearFlags(2);
            } else {
                window.setDimAmount(0.5f);
                window.setFlags(2, 2);
            }
        } catch (IllegalArgumentException e11) {
            qk.a.o("ReactNative", "ReactModalHostView: error while setting window flags: ", e11.getMessage());
        }
    }

    private final void j() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Dialog dialog = this.dialog;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Window window2 = currentActivity.getWindow();
        if (Build.VERSION.SDK_INT <= 30) {
            window.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility());
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window2, window2.getDecorView());
        WindowInsetsControllerCompat windowInsetsControllerCompat2 = new WindowInsetsControllerCompat(window, window.getDecorView());
        windowInsetsControllerCompat2.g(windowInsetsControllerCompat.e());
        WindowInsets rootWindowInsets = window2.getDecorView().getRootWindowInsets();
        if (rootWindowInsets != null) {
            WindowInsetsCompat windowInsetsCompatY = WindowInsetsCompat.y(rootWindowInsets);
            s.j(windowInsetsCompatY, "toWindowInsetsCompat(...)");
            h(this, windowInsetsCompatY, windowInsetsControllerCompat2, null, 4, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> outChildren) {
        s.k(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        UiThreadUtil.assertOnUiThread();
        this.dialogRootViewGroup.addView(child, index);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        s.k(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        s.k(structure, "structure");
        this.dialogRootViewGroup.dispatchProvideStructure(structure);
    }

    public final void e() {
        Context context = getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((v0) context).removeLifecycleEventListener(this);
        c();
    }

    public final void f() {
        int i11;
        Window window;
        Window window2;
        UiThreadUtil.assertOnUiThread();
        if (!this.createNewDialog) {
            i();
            return;
        }
        c();
        this.createNewDialog = false;
        String str = this.animationType;
        if (s.f(str, "fade")) {
            i11 = q.f22915e;
        } else {
            i11 = s.f(str, "slide") ? q.f22916f : q.f22914d;
        }
        Activity currentActivity = getCurrentActivity();
        Dialog dialog = new Dialog(currentActivity != null ? currentActivity : getContext(), i11);
        this.dialog = dialog;
        Window window3 = dialog.getWindow();
        Objects.requireNonNull(window3);
        window3.setFlags(8, 8);
        dialog.setContentView(getContentView());
        i();
        dialog.setOnShowListener(this.onShowListener);
        dialog.setOnKeyListener(new d());
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.setSoftInputMode(16);
        }
        if (this.hardwareAccelerated && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
        if (d(currentActivity) && (window = dialog.getWindow()) != null) {
            window.setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        dialog.show();
        j();
        Window window5 = dialog.getWindow();
        if (window5 != null) {
            window5.clearFlags(8);
        }
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int index) {
        return this.dialogRootViewGroup.getChildAt(index);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.dialogRootViewGroup.getChildCount();
    }

    public final Dialog getDialog() {
        return this.dialog;
    }

    public final EventDispatcher getEventDispatcher() {
        return this.dialogRootViewGroup.getEventDispatcher();
    }

    public final boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public final boolean getNavigationBarTranslucent() {
        return this.navigationBarTranslucent;
    }

    public final c getOnRequestCloseListener() {
        return this.onRequestCloseListener;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.onShowListener;
    }

    public final u0 getStateWrapper() {
        return this.dialogRootViewGroup.getStateWrapper();
    }

    public final boolean getStatusBarTranslucent() {
        return this.statusBarTranslucent;
    }

    public final boolean getTransparent() {
        return this.transparent;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((v0) context).addLifecycleEventListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        e();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View child) {
        UiThreadUtil.assertOnUiThread();
        if (child != null) {
            this.dialogRootViewGroup.removeView(child);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        UiThreadUtil.assertOnUiThread();
        this.dialogRootViewGroup.removeView(getChildAt(index));
    }

    public final void setAnimationType(String str) {
        this.animationType = str;
        this.createNewDialog = true;
    }

    public final void setDialogRootViewGroupTestId(String testId) {
        this.dialogRootViewGroup.setTag(m.f22670t, testId);
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.dialogRootViewGroup.setEventDispatcher$ReactAndroid_release(eventDispatcher);
    }

    public final void setHardwareAccelerated(boolean z11) {
        this.hardwareAccelerated = z11;
        this.createNewDialog = true;
    }

    @Override // android.view.View
    public void setId(int id2) {
        super.setId(id2);
        this.dialogRootViewGroup.setId(id2);
    }

    public final void setNavigationBarTranslucent(boolean z11) {
        this.navigationBarTranslucent = z11;
        this.createNewDialog = true;
    }

    public final void setOnRequestCloseListener(c cVar) {
        this.onRequestCloseListener = cVar;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.onShowListener = onShowListener;
    }

    public final void setStateWrapper(u0 u0Var) {
        this.dialogRootViewGroup.setStateWrapper$ReactAndroid_release(u0Var);
    }

    public final void setStatusBarTranslucent(boolean z11) {
        this.statusBarTranslucent = z11;
        this.createNewDialog = true;
    }

    public final void setTransparent(boolean z11) {
        this.transparent = z11;
    }
}
