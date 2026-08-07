package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010$R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/swmansion/rnscreens/d;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/swmansion/rnscreens/w0;", "config", "<init>", "(Landroid/content/Context;Lcom/swmansion/rnscreens/w0;)V", "", "left", "top", "right", "bottom", "Ljn0/h0;", "applyExactPadding", "(IIII)V", "requestForceShadowStateUpdateOnLayout", "()V", "requestLayout", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "", "hasSizeChanged", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "updateContentInsets", "Lcom/swmansion/rnscreens/w0;", "getConfig", "()Lcom/swmansion/rnscreens/w0;", "shouldAvoidDisplayCutout", "Z", "shouldApplyTopInset", "Lk5/e;", "lastInsets", "Lk5/e;", "isForceShadowStateUpdateOnLayoutRequested", "isLayoutEnqueued", "Landroid/view/Choreographer$FrameCallback;", "layoutCallback", "Landroid/view/Choreographer$FrameCallback;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public class d extends Toolbar {
    private final w0 config;
    private boolean isForceShadowStateUpdateOnLayoutRequested;
    private boolean isLayoutEnqueued;
    private k5.e lastInsets;
    private final Choreographer.FrameCallback layoutCallback;
    private final boolean shouldApplyTopInset;
    private final boolean shouldAvoidDisplayCutout;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/swmansion/rnscreens/d$a", "Landroid/view/Choreographer$FrameCallback;", "", "frameTimeNanos", "Ljn0/h0;", "doFrame", "(J)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Choreographer.FrameCallback {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            d.this.isLayoutEnqueued = false;
            d dVar = d.this;
            dVar.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(d.this.getHeight(), Integer.MIN_VALUE));
            d dVar2 = d.this;
            dVar2.layout(dVar2.getLeft(), d.this.getTop(), d.this.getRight(), d.this.getBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, w0 config) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(config, "config");
        this.config = config;
        this.shouldAvoidDisplayCutout = true;
        this.shouldApplyTopInset = true;
        k5.e NONE = k5.e.f84923e;
        p013kotlin.jvm.internal.s.j(NONE, "NONE");
        this.lastInsets = NONE;
        this.layoutCallback = new a();
    }

    private final void applyExactPadding(int left, int top, int right, int bottom) {
        requestForceShadowStateUpdateOnLayout();
        setPadding(left, top, right, bottom);
    }

    private final void requestForceShadowStateUpdateOnLayout() {
        this.isForceShadowStateUpdateOnLayoutRequested = this.shouldAvoidDisplayCutout;
    }

    public final w0 getConfig() {
        return this.config;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        WindowInsets rootWindowInsets = getRootWindowInsets();
        k5.e eVarResolveInsetsOrZero$default = com.swmansion.rnscreens.utils.e.resolveInsetsOrZero$default(this, WindowInsetsCompat.n.b(), rootWindowInsets, false, 4, null);
        k5.e eVarResolveInsetsOrZero$default2 = com.swmansion.rnscreens.utils.e.resolveInsetsOrZero$default(this, WindowInsetsCompat.n.h(), rootWindowInsets, false, 4, null);
        k5.e eVarResolveInsetsOrZero = com.swmansion.rnscreens.utils.e.resolveInsetsOrZero(this, WindowInsetsCompat.n.h(), rootWindowInsets, true);
        k5.e eVarC = k5.e.c(eVarResolveInsetsOrZero$default.f84924a + eVarResolveInsetsOrZero$default2.f84924a, 0, eVarResolveInsetsOrZero$default.f84926c + eVarResolveInsetsOrZero$default2.f84926c, 0);
        p013kotlin.jvm.internal.s.j(eVarC, "of(...)");
        k5.e eVarC2 = k5.e.c(0, Math.max(eVarResolveInsetsOrZero$default.f84925b, this.shouldApplyTopInset ? eVarResolveInsetsOrZero.f84925b : 0), 0, Math.max(eVarResolveInsetsOrZero$default.f84927d, 0));
        p013kotlin.jvm.internal.s.j(eVarC2, "of(...)");
        k5.e eVarA = k5.e.a(eVarC, eVarC2);
        p013kotlin.jvm.internal.s.j(eVarA, "add(...)");
        if (!p013kotlin.jvm.internal.s.f(this.lastInsets, eVarA)) {
            this.lastInsets = eVarA;
            applyExactPadding(eVarA.f84924a, eVarA.f84925b, eVarA.f84926c, eVarA.f84927d);
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean hasSizeChanged, int l11, int t11, int r11, int b11) {
        super.onLayout(hasSizeChanged, l11, t11, r11, b11);
        this.config.onNativeToolbarLayout(this, hasSizeChanged || this.isForceShadowStateUpdateOnLayoutRequested);
        this.isForceShadowStateUpdateOnLayoutRequested = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((com.facebook.react.uimanager.v0) context).getCurrentActivity();
        Integer numValueOf = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        com.facebook.react.modules.core.b.INSTANCE.a().k(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }

    public final void updateContentInsets() {
        setContentInsetStartWithNavigation(this.config.getPreferredContentInsetStartWithNavigation());
        setContentInsetsRelative(this.config.getPreferredContentInsetStart(), this.config.getDefaultStartInset());
    }
}
