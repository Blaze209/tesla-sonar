package com.content.pushprovisioning;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/c;", "Lcom/facebook/react/uimanager/events/d;", "", "viewTag", "Lcom/facebook/react/bridge/WritableMap;", AnalyticsAttribute.Error, "<init>", "(ILcom/facebook/react/bridge/WritableMap;)V", "a", "()Lcom/facebook/react/bridge/WritableMap;", "", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "Ljn0/h0;", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/bridge/WritableMap;", "b", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WritableMap error;

    public c(int i11, WritableMap writableMap) {
        super(i11);
        this.error = writableMap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final WritableMap getError() {
        return this.error;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.k(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), getError());
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onCompleteAction";
    }
}
