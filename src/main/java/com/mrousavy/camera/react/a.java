package com.mrousavy.camera.react;

import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/mrousavy/camera/react/a;", "Lcom/facebook/react/uimanager/events/d;", "Lcom/mrousavy/camera/react/j;", "", "surfaceId", "viewId", "Lcom/facebook/react/bridge/WritableMap;", "data", "<init>", "(IILcom/facebook/react/bridge/WritableMap;)V", "", "getEventName", "()Ljava/lang/String;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "Lcom/facebook/react/bridge/WritableMap;", "b", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends com.facebook.react.uimanager.events.d<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WritableMap data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11, int i12, WritableMap data) {
        super(i11, i12);
        p013kotlin.jvm.internal.s.k(data, "data");
        this.data = data;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData, reason: from getter */
    protected WritableMap getData() {
        return this.data;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topCameraAverageFpsChanged";
    }
}
