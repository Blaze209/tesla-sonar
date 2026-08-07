package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.ReactContext;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/swmansion/rnscreens/w;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "changed", "", "left", "top", "right", "bottom", "Ljn0/h0;", "onLayout", "(ZIIII)V", "Lcom/swmansion/rnscreens/w$a;", "delegate", "Lcom/swmansion/rnscreens/w$a;", "getDelegate$react_native_screens_release", "()Lcom/swmansion/rnscreens/w$a;", "setDelegate$react_native_screens_release", "(Lcom/swmansion/rnscreens/w$a;)V", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class w extends com.facebook.react.views.view.e {
    private a delegate;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/swmansion/rnscreens/w$a;", "", "", "changed", "", "left", "top", "right", "bottom", "Ljn0/h0;", "onContentWrapperLayout", "(ZIIII)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void onContentWrapperLayout(boolean changed, int left, int top, int right, int bottom);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ReactContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
    }

    /* JADX INFO: renamed from: getDelegate$react_native_screens_release, reason: from getter */
    public final a getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        a aVar = this.delegate;
        if (aVar != null) {
            aVar.onContentWrapperLayout(changed, left, top, right, bottom);
        }
    }

    public final void setDelegate$react_native_screens_release(a aVar) {
        this.delegate = aVar;
    }
}
