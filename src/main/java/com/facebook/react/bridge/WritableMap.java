package com.facebook.react.bridge;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u001e\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/bridge/ReadableMap;", "copy", "()Lcom/facebook/react/bridge/WritableMap;", "source", "Ljn0/h0;", "merge", "(Lcom/facebook/react/bridge/ReadableMap;)V", "", Action.KEY_ATTRIBUTE, "Lcom/facebook/react/bridge/ReadableArray;", "value", "putArray", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "putBoolean", "(Ljava/lang/String;Z)V", "", "putDouble", "(Ljava/lang/String;D)V", "", "putInt", "(Ljava/lang/String;I)V", "", "putLong", "(Ljava/lang/String;J)V", "putMap", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "putNull", "(Ljava/lang/String;)V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WritableMap extends ReadableMap {
    WritableMap copy();

    void merge(ReadableMap source);

    void putArray(String key, ReadableArray value);

    void putBoolean(String key, boolean value);

    void putDouble(String key, double value);

    void putInt(String key, int value);

    void putLong(String key, long value);

    void putMap(String key, ReadableMap value);

    void putNull(String key);

    void putString(String key, String value);
}
