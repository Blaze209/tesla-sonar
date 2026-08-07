package com.swmansion.rnscreens;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.swmansion.rnscreens.utils.PaddingBundle;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/swmansion/rnscreens/x0;", "Lcom/facebook/react/uimanager/m;", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "data", "Ljn0/h0;", "setLocalData", "(Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/ReactContext;", "", "paddingStart", Gender.FEMALE, "getPaddingStart", "()F", "setPaddingStart", "(F)V", "paddingEnd", "getPaddingEnd", "setPaddingEnd", Snapshot.HEIGHT, "getHeight", "setHeight", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 extends com.facebook.react.uimanager.m {
    private ReactContext context;
    private float height;
    private float paddingEnd;
    private float paddingStart;

    public x0(ReactContext context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getPaddingEnd() {
        return this.paddingEnd;
    }

    public final float getPaddingStart() {
        return this.paddingStart;
    }

    public final void setHeight(float f11) {
        this.height = f11;
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void setLocalData(Object data) {
        if (!(data instanceof PaddingBundle)) {
            super.setLocalData(data);
            return;
        }
        PaddingBundle paddingBundle = (PaddingBundle) data;
        this.paddingStart = paddingBundle.getPaddingStart();
        this.paddingEnd = paddingBundle.getPaddingEnd();
        this.height = paddingBundle.getHeight();
        setPadding(4, this.paddingStart);
        setPadding(5, this.paddingEnd);
        setPosition(1, -this.height);
    }

    public final void setPaddingEnd(float f11) {
        this.paddingEnd = f11;
    }

    public final void setPaddingStart(float f11) {
        this.paddingStart = f11;
    }
}
