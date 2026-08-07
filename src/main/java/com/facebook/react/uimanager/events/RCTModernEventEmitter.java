package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJI\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "", "surfaceId", "targetTag", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "Ljn0/h0;", "receiveEvent", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "", "canCoalesceEvent", "customCoalesceKey", "category", "(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V", "Lcom/facebook/react/uimanager/events/q;", "event", "receiveTouches", "(Lcom/facebook/react/uimanager/events/q;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int surfaceId, int targetTag, String eventName, WritableMap params);

    void receiveEvent(int surfaceId, int targetTag, String eventName, boolean canCoalesceEvent, int customCoalesceKey, WritableMap params, int category);

    @jn0.e
    void receiveTouches(q event);
}
