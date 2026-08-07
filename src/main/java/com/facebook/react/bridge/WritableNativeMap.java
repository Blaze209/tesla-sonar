package com.facebook.react.bridge;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@in.a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\"\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0004J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0012H\u0096 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0015H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0018H\u0096 ¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u001bH\u0096 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010 \u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0096 ¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/facebook/react/bridge/WritableNativeMap;", "Lcom/facebook/react/bridge/ReadableNativeMap;", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "putNativeMap", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeMap;)V", "Lcom/facebook/react/bridge/ReadableNativeArray;", "putNativeArray", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeArray;)V", "source", "mergeNativeMap", "(Lcom/facebook/react/bridge/ReadableNativeMap;)V", "initHybrid", "", "putBoolean", "(Ljava/lang/String;Z)V", "", "putDouble", "(Ljava/lang/String;D)V", "", "putInt", "(Ljava/lang/String;I)V", "", "putLong", "(Ljava/lang/String;J)V", "putNull", "(Ljava/lang/String;)V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "putMap", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/ReadableArray;", "putArray", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "merge", "(Lcom/facebook/react/bridge/ReadableMap;)V", "copy", "()Lcom/facebook/react/bridge/WritableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    public WritableNativeMap() {
        initHybrid();
    }

    private final native void initHybrid();

    private final native void mergeNativeMap(ReadableNativeMap source);

    private final native void putNativeArray(String key, ReadableNativeArray value);

    private final native void putNativeMap(String key, ReadableNativeMap value);

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap source) {
        s.k(source, "source");
        gn.a.b(source instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) source);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String key, ReadableArray value) {
        s.k(key, "key");
        gn.a.b(value == null || (value instanceof ReadableNativeArray), "Illegal type provided");
        putNativeArray(key, (ReadableNativeArray) value);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(String key, boolean value);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(String key, double value);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(String key, int value);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putLong(String key, long value);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String key, ReadableMap value) {
        s.k(key, "key");
        gn.a.b(value == null || (value instanceof ReadableNativeMap), "Illegal type provided");
        putNativeMap(key, (ReadableNativeMap) value);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(String key);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(String key, String value);
}
