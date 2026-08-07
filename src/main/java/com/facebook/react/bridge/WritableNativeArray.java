package com.facebook.react.bridge;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@in.a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u000e\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0013H\u0096 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0016H\u0096 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0019H\u0096 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u001cH\u0096 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/react/bridge/WritableNativeArray;", "Lcom/facebook/react/bridge/ReadableNativeArray;", "Lcom/facebook/react/bridge/WritableArray;", "<init>", "()V", "Ljn0/h0;", "initHybrid", "array", "pushNativeArray", "(Lcom/facebook/react/bridge/ReadableNativeArray;)V", "Lcom/facebook/react/bridge/ReadableNativeMap;", "map", "pushNativeMap", "(Lcom/facebook/react/bridge/ReadableNativeMap;)V", "pushNull", "", "value", "pushBoolean", "(Z)V", "", "pushDouble", "(D)V", "", "pushInt", "(I)V", "", "pushLong", "(J)V", "", "pushString", "(Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableArray;", "pushArray", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/bridge/ReadableMap;", "pushMap", "(Lcom/facebook/react/bridge/ReadableMap;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    public WritableNativeArray() {
        initHybrid();
    }

    private final native void initHybrid();

    private final native void pushNativeArray(ReadableNativeArray array);

    private final native void pushNativeMap(ReadableNativeMap map);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(ReadableArray array) {
        if (array != null && !(array instanceof ReadableNativeArray)) {
            throw new IllegalStateException("Illegal type provided");
        }
        pushNativeArray((ReadableNativeArray) array);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean value);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double value);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int value);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushLong(long value);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(ReadableMap map) {
        if (map != null && !(map instanceof ReadableNativeMap)) {
            throw new IllegalStateException("Illegal type provided");
        }
        pushNativeMap((ReadableNativeMap) map);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(String value);
}
