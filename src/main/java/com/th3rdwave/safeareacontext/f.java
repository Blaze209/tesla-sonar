package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0014\u001a\u00020\u00072&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015R6\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fj\u0004\u0018\u0001`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/th3rdwave/safeareacontext/f;", "Lcom/facebook/react/views/view/e;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "h", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "onPreDraw", "()Z", "Lkotlin/Function3;", "Lcom/th3rdwave/safeareacontext/a;", "Lcom/th3rdwave/safeareacontext/c;", "Lcom/th3rdwave/safeareacontext/OnInsetsChangeHandler;", "handler", "setOnInsetsChangeHandler", "(Lwn0/q;)V", "a", "Lwn0/q;", "mInsetsChangeHandler", "b", "Lcom/th3rdwave/safeareacontext/a;", "mLastInsets", "c", "Lcom/th3rdwave/safeareacontext/c;", "mLastFrame", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends com.facebook.react.views.view.e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private wn0.q<? super f, ? super EdgeInsets, ? super Rect, h0> mInsetsChangeHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private EdgeInsets mLastInsets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Rect mLastFrame;

    public f(Context context) {
        super(context);
    }

    private final void h() {
        EdgeInsets edgeInsetsE;
        wn0.q<? super f, ? super EdgeInsets, ? super Rect, h0> qVar = this.mInsetsChangeHandler;
        if (qVar == null || (edgeInsetsE = h.e(this)) == null) {
            return;
        }
        View rootView = getRootView();
        s.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        Rect rectA = h.a((ViewGroup) rootView, this);
        if (rectA == null) {
            return;
        }
        if (s.f(this.mLastInsets, edgeInsetsE) && s.f(this.mLastFrame, rectA)) {
            return;
        }
        qVar.invoke(this, edgeInsetsE, rectA);
        this.mLastInsets = edgeInsetsE;
        this.mLastFrame = rectA;
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        h();
        return true;
    }

    public final void setOnInsetsChangeHandler(wn0.q<? super f, ? super EdgeInsets, ? super Rect, h0> handler) {
        this.mInsetsChangeHandler = handler;
        h();
    }
}
