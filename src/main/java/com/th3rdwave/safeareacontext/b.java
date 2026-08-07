package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/th3rdwave/safeareacontext/b;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewTag", "Lcom/th3rdwave/safeareacontext/a;", "mInsets", "Lcom/th3rdwave/safeareacontext/c;", "mFrame", "<init>", "(IILcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V", "", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "Ljn0/h0;", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "a", "Lcom/th3rdwave/safeareacontext/a;", "b", "Lcom/th3rdwave/safeareacontext/c;", "c", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.facebook.react.uimanager.events.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EdgeInsets mInsets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Rect mFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, int i12, EdgeInsets mInsets, Rect mFrame) {
        super(i12);
        s.k(mInsets, "mInsets");
        s.k(mFrame, "mFrame");
        this.mInsets = mInsets;
        this.mFrame = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.k(rctEventEmitter, "rctEventEmitter");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("insets", q.b(this.mInsets));
        writableMapCreateMap.putMap("frame", q.d(this.mFrame));
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topInsetsChange";
    }
}
