package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J'\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u0017\u0010\u001bJI\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010 R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0016\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\t\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/react/animated/EventAnimationDriver;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "", "eventName", "", "viewTag", "", "eventPath", "Lcom/facebook/react/animated/w;", "valueNode", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/facebook/react/animated/w;)V", "targetTag", "Lcom/facebook/react/bridge/WritableMap;", "params", "Ljn0/h0;", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "surfaceId", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "Lcom/facebook/react/uimanager/events/q;", "event", "(Lcom/facebook/react/uimanager/events/q;)V", "", "canCoalesceEvent", "customCoalesceKey", "category", "(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V", "Ljava/lang/String;", "I", "Ljava/util/List;", "Lcom/facebook/react/animated/w;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventAnimationDriver implements RCTModernEventEmitter {
    public String eventName;
    private final List<String> eventPath;
    public w valueNode;
    public int viewTag;

    public EventAnimationDriver(String eventName, int i11, List<String> eventPath, w valueNode) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        p013kotlin.jvm.internal.s.k(valueNode, "valueNode");
        this.eventName = eventName;
        this.viewTag = i11;
        this.eventPath = eventPath;
        this.valueNode = valueNode;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @jn0.e
    public void receiveEvent(int targetTag, String eventName, WritableMap params) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        receiveEvent(-1, targetTag, eventName, params);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @jn0.e
    public void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(touches, "touches");
        p013kotlin.jvm.internal.s.k(changedIndices, "changedIndices");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, WritableMap params) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        receiveEvent(surfaceId, targetTag, eventName, false, 0, params, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    @jn0.e
    public void receiveTouches(com.facebook.react.uimanager.events.q event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, boolean canCoalesceEvent, int customCoalesceKey, WritableMap params, int category) {
        ReadableMap readableMap;
        ReadableType type;
        ReadableMap map;
        ReadableMap readableMap2;
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        if (params != null) {
            int size = this.eventPath.size() - 1;
            int i11 = 0;
            ReadableArray array = null;
            while (i11 < size) {
                if (readableMap != null) {
                    String str = this.eventPath.get(i11);
                    ReadableType type2 = readableMap.getType(str);
                    if (type2 == ReadableType.Map) {
                        readableMap = params;
                        map = readableMap.getMap(str);
                        readableMap2 = map;
                        array = null;
                    } else {
                        if (type2 != ReadableType.Array) {
                            readableMap = params;
                            throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for key '" + str + "'");
                        }
                        readableMap = params;
                        array = readableMap.getArray(str);
                        readableMap2 = null;
                    }
                } else {
                    int i12 = Integer.parseInt(this.eventPath.get(i11));
                    if (array != null) {
                        readableMap = params;
                        type = array.getType(i12);
                    } else {
                        readableMap = params;
                        type = null;
                    }
                    if (type == ReadableType.Map) {
                        map = array != null ? array.getMap(i12) : null;
                        readableMap2 = map;
                        array = null;
                    } else {
                        if (type != ReadableType.Array) {
                            throw new UnexpectedNativeTypeException("Unexpected type " + type + " for index '" + i12 + "'");
                        }
                        array = array != null ? array.getArray(i12) : null;
                        readableMap2 = null;
                    }
                }
                i11++;
                readableMap = readableMap2;
            }
            readableMap = params;
            List<String> list = this.eventPath;
            String str2 = list.get(list.size() - 1);
            if (readableMap != null) {
                this.valueNode.nodeValue = readableMap.getDouble(str2);
                return;
            }
            this.valueNode.nodeValue = array != null ? array.getDouble(Integer.parseInt(str2)) : 0.0d;
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }
}
