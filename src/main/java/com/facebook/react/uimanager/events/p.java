package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/events/p;", "", "", "surfaceId", "reactTag", "", "eventName", "", "canCoalesceEvent", "Lcom/facebook/react/bridge/WritableMap;", "params", "eventCategory", "experimentalIsSynchronous", "Ljn0/h0;", "receiveEvent", "(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;IZ)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface p {
    void receiveEvent(int surfaceId, int reactTag, String eventName, boolean canCoalesceEvent, WritableMap params, int eventCategory, boolean experimentalIsSynchronous);
}
