package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/animated/s;", "Lcom/facebook/react/animated/b;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/o;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/o;)V", "Lcom/facebook/react/bridge/JavaOnlyMap;", "propsMap", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/JavaOnlyMap;)V", "", "e", "()Ljava/lang/String;", "f", "Lcom/facebook/react/animated/o;", "", "", "g", "Ljava/util/Map;", "propMapping", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o nativeAnimatedNodesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> propMapping;

    public s(ReadableMap config, o nativeAnimatedNodesManager) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        ReadableMap map = config.getMap("style");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        Map mapC = v0.c();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            mapC.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.propMapping = v0.b(mapC);
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "StyleAnimatedNode[" + this.tag + "] mPropMapping: " + this.propMapping;
    }

    public final void i(JavaOnlyMap propsMap) {
        p013kotlin.jvm.internal.s.k(propsMap, "propsMap");
        for (Map.Entry<String, Integer> entry : this.propMapping.entrySet()) {
            String key = entry.getKey();
            b bVarK = this.nativeAnimatedNodesManager.k(entry.getValue().intValue());
            if (bVarK == null) {
                throw new IllegalArgumentException("Mapped style node does not exist");
            }
            if (bVarK instanceof v) {
                ((v) bVarK).i(propsMap);
            } else if (bVarK instanceof w) {
                w wVar = (w) bVarK;
                Object objectValue = wVar.getObjectValue();
                if (objectValue instanceof Integer) {
                    propsMap.putInt(key, ((Number) objectValue).intValue());
                } else if (objectValue instanceof String) {
                    propsMap.putString(key, (String) objectValue);
                } else {
                    propsMap.putDouble(key, wVar.l());
                }
            } else if (bVarK instanceof f) {
                propsMap.putInt(key, ((f) bVarK).i());
            } else {
                if (!(bVarK instanceof p)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + bVarK.getClass());
                }
                ((p) bVarK).i(key, propsMap);
            }
        }
    }
}
