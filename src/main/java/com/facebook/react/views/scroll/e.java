package com.facebook.react.views.scroll;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/views/scroll/e;", "Lcom/facebook/react/views/view/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "changed", "", "left", "top", "right", "bottom", "Ljn0/h0;", "onLayout", "(ZIIII)V", "a", "Z", "isRTL", "value", "getRemoveClippedSubviews", "()Z", "setRemoveClippedSubviews", "(Z)V", "removeClippedSubviews", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.facebook.react.views.view.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isRTL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        s.k(context, "context");
        this.isRTL = com.facebook.react.modules.i18nmanager.a.INSTANCE.a().i(context);
    }

    @Override // com.facebook.react.views.view.e, com.facebook.react.uimanager.z
    public boolean getRemoveClippedSubviews() {
        return super.getRemoveClippedSubviews();
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.isRTL) {
            setLeft(0);
            setTop(top);
            setRight(right - left);
            setBottom(bottom);
        }
    }

    @Override // com.facebook.react.views.view.e
    public void setRemoveClippedSubviews(boolean z11) {
        if (this.isRTL) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z11);
        }
    }
}
