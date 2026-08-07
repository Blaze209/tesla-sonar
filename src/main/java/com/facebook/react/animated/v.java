package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/animated/v;", "Lcom/facebook/react/animated/b;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/o;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/o;)V", "Lcom/facebook/react/bridge/JavaOnlyMap;", "propsMap", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/JavaOnlyMap;)V", "", "e", "()Ljava/lang/String;", "f", "Lcom/facebook/react/animated/o;", "", "Lcom/facebook/react/animated/v$c;", "g", "Ljava/util/List;", "transformConfigs", "c", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends com.facebook.react.animated.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o nativeAnimatedNodesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<c> transformConfigs;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/facebook/react/animated/v$a;", "Lcom/facebook/react/animated/v$c;", "Lcom/facebook/react/animated/v;", "<init>", "(Lcom/facebook/react/animated/v;)V", "", "c", "I", "()I", DateTokenConverter.CONVERTER_KEY, "(I)V", "nodeTag", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int nodeTag;

        public a() {
            super();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getNodeTag() {
            return this.nodeTag;
        }

        public final void d(int i11) {
            this.nodeTag = i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/facebook/react/animated/v$b;", "Lcom/facebook/react/animated/v$c;", "Lcom/facebook/react/animated/v;", "<init>", "(Lcom/facebook/react/animated/v;)V", "", "c", "D", "()D", DateTokenConverter.CONVERTER_KEY, "(D)V", "value", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private double value;

        public b() {
            super();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public final void d(double d11) {
            this.value = d11;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0092\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/animated/v$c;", "", "<init>", "(Lcom/facebook/react/animated/v;)V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "property", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String property;

        public c() {
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getProperty() {
            return this.property;
        }

        public final void b(String str) {
            this.property = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.facebook.react.animated.v$b, com.facebook.react.animated.v$c] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.facebook.react.animated.v$a, com.facebook.react.animated.v$c] */
    public v(ReadableMap config, o nativeAnimatedNodesManager) {
        List<c> listM;
        ?? bVar;
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("transforms");
        if (array == null) {
            listM = p013kotlin.collections.v.m();
        } else {
            int size = array.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                ReadableMap map = array.getMap(i11);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String string = map.getString("property");
                if (p013kotlin.jvm.internal.s.f(map.getString("type"), "animated")) {
                    bVar = new a();
                    bVar.b(string);
                    bVar.d(map.getInt("nodeTag"));
                } else {
                    bVar = new b();
                    bVar.b(string);
                    bVar.d(map.getDouble("value"));
                }
                arrayList.add(bVar);
            }
            listM = arrayList;
        }
        this.transformConfigs = listM;
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "TransformAnimatedNode[" + this.tag + "]: transformConfigs: " + this.transformConfigs;
    }

    public final void i(JavaOnlyMap propsMap) {
        double value;
        p013kotlin.jvm.internal.s.k(propsMap, "propsMap");
        int size = this.transformConfigs.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.transformConfigs.get(i11);
            if (cVar instanceof a) {
                com.facebook.react.animated.b bVarK = this.nativeAnimatedNodesManager.k(((a) cVar).getNodeTag());
                if (bVarK == null) {
                    throw new IllegalArgumentException("Mapped style node does not exist");
                }
                if (!(bVarK instanceof w)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + bVarK.getClass());
                }
                value = ((w) bVarK).l();
            } else {
                p013kotlin.jvm.internal.s.i(cVar, "null cannot be cast to non-null type com.facebook.react.animated.TransformAnimatedNode.StaticTransformConfig");
                value = ((b) cVar).getValue();
            }
            arrayList.add(JavaOnlyMap.INSTANCE.of(cVar.getProperty(), Double.valueOf(value)));
        }
        propsMap.putArray("transform", JavaOnlyArray.INSTANCE.from(arrayList));
    }
}
