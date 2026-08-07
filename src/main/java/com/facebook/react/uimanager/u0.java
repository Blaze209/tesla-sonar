package com.facebook.react.uimanager;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/u0;", "", "Lcom/facebook/react/bridge/WritableMap;", "map", "Ljn0/h0;", "updateState", "(Lcom/facebook/react/bridge/WritableMap;)V", "destroyState", "()V", "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "getStateDataMapBuffer", "()Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "stateDataMapBuffer", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface u0 {
    void destroyState();

    ReadableMapBuffer getStateDataMapBuffer();

    void updateState(WritableMap map);
}
