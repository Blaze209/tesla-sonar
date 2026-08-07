package com.swmansion.rnscreens.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010&\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/b;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/c0;", "Lcom/facebook/react/uimanager/f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "initialAlpha", "Lcom/swmansion/rnscreens/bottomsheet/g;", "pointerEventsProxy", "<init>", "(Landroid/content/Context;FLcom/swmansion/rnscreens/bottomsheet/g;)V", "(Landroid/content/Context;F)V", "", "changed", "", "l", "t", "r", "b", "Ljn0/h0;", "onLayout", "(ZIIII)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "x", "y", "reactTagForTouch", "(FF)I", "interceptsTouchEvent", "(FF)Z", "onDetachedFromWindow", "()V", "Lcom/swmansion/rnscreens/bottomsheet/g;", "getBlockGestures$react_native_screens_release", "()Z", "blockGestures", "Lcom/facebook/react/uimanager/x;", "getPointerEvents", "()Lcom/facebook/react/uimanager/x;", "pointerEvents", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class b extends ViewGroup implements c0, f0 {
    public static final String TAG = "DimmingView";
    private final g pointerEventsProxy;

    public /* synthetic */ b(Context context, float f11, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0.6f : f11, gVar);
    }

    public final boolean getBlockGestures$react_native_screens_release() {
        return !aa0.b.equalWithRespectToEps$default(getAlpha(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    @Override // com.facebook.react.uimanager.f0
    public x getPointerEvents() {
        return this.pointerEventsProxy.getPointerEvents();
    }

    @Override // com.facebook.react.uimanager.c0
    public boolean interceptsTouchEvent(float x11, float y11) {
        return getBlockGestures$react_native_screens_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.pointerEventsProxy.setPointerEventsImpl(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        if (getBlockGestures$react_native_screens_release()) {
            callOnClick();
        }
        return getBlockGestures$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.b0
    public int reactTagForTouch(float x11, float y11) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, float f11, g pointerEventsProxy) {
        super(context);
        s.k(context, "context");
        s.k(pointerEventsProxy, "pointerEventsProxy");
        this.pointerEventsProxy = pointerEventsProxy;
        pointerEventsProxy.setPointerEventsImpl(new f(this));
        setBackgroundColor(-16777216);
        setAlpha(f11);
    }

    public /* synthetic */ b(Context context, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0.6f : f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, float f11) {
        this(context, f11, new g(null));
        s.k(context, "context");
    }
}
