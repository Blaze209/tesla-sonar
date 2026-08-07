package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@jn0.e
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB!\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/uimanager/events/c;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewTag", Snapshot.WIDTH, Snapshot.HEIGHT, "<init>", "(IIII)V", "(III)V", "", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "I", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int height;

    public c(int i11, int i12, int i13, int i14) {
        super(i11, i12);
        this.width = i13;
        this.height = i14;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(Snapshot.WIDTH, w.f(this.width));
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, w.f(this.height));
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topContentSizeChange";
    }

    @jn0.e
    public c(int i11, int i12, int i13) {
        this(-1, i11, i12, i13);
    }
}
