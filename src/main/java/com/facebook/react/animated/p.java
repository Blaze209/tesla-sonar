package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/animated/p;", "Lcom/facebook/react/animated/b;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/o;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/o;)V", "Lcom/facebook/react/bridge/ReadableArray;", "source", "Lcom/facebook/react/bridge/JavaOnlyArray;", "j", "(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/JavaOnlyArray;", "Lcom/facebook/react/bridge/JavaOnlyMap;", "k", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/bridge/JavaOnlyMap;", "", "propKey", "propsMap", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lcom/facebook/react/bridge/JavaOnlyMap;)V", "e", "()Ljava/lang/String;", "f", "Lcom/facebook/react/animated/o;", "g", "Lcom/facebook/react/bridge/JavaOnlyMap;", "configClone", "h", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends com.facebook.react.animated.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o nativeAnimatedNodesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final JavaOnlyMap configClone;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22256a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f22256a = iArr;
        }
    }

    public p(ReadableMap config, o nativeAnimatedNodesManager) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.configClone = JavaOnlyMap.INSTANCE.deepClone(config);
    }

    private final JavaOnlyArray j(ReadableArray source) {
        if (source == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = source.size();
        for (int i11 = 0; i11 < size; i11++) {
            switch (b.f22256a[source.getType(i11).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(source.getBoolean(i11));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(source.getDouble(i11));
                    break;
                case 4:
                    javaOnlyArray.pushString(source.getString(i11));
                    break;
                case 5:
                    ReadableMap map = source.getMap(i11);
                    if (map != null && map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        com.facebook.react.animated.b bVarK = this.nativeAnimatedNodesManager.k(map.getInt("nodeTag"));
                        if (bVarK == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (bVarK instanceof w) {
                            w wVar = (w) bVarK;
                            Object objectValue = wVar.getObjectValue();
                            if (objectValue instanceof Integer) {
                                javaOnlyArray.pushInt(((Number) objectValue).intValue());
                            } else if (objectValue instanceof String) {
                                javaOnlyArray.pushString((String) objectValue);
                            } else {
                                javaOnlyArray.pushDouble(wVar.l());
                            }
                        } else if (bVarK instanceof f) {
                            javaOnlyArray.pushInt(((f) bVarK).i());
                        }
                    } else {
                        javaOnlyArray.pushMap(k(source.getMap(i11)));
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(j(source.getArray(i11)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return javaOnlyArray;
    }

    private final JavaOnlyMap k(ReadableMap source) {
        if (source == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = source.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (b.f22256a[source.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, source.getBoolean(strNextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(strNextKey, source.getDouble(strNextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(strNextKey, source.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = source.getMap(strNextKey);
                    if (map != null && map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        com.facebook.react.animated.b bVarK = this.nativeAnimatedNodesManager.k(map.getInt("nodeTag"));
                        if (bVarK == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (bVarK instanceof w) {
                            w wVar = (w) bVarK;
                            Object objectValue = wVar.getObjectValue();
                            if (objectValue instanceof Integer) {
                                javaOnlyMap.putInt(strNextKey, ((Number) objectValue).intValue());
                            } else if (!(objectValue instanceof String)) {
                                javaOnlyMap.putDouble(strNextKey, wVar.l());
                            } else {
                                javaOnlyMap.putString(strNextKey, (String) objectValue);
                            }
                        } else if (bVarK instanceof f) {
                            javaOnlyMap.putInt(strNextKey, ((f) bVarK).i());
                        }
                    } else {
                        javaOnlyMap.putMap(strNextKey, k(map));
                    }
                    break;
                case 6:
                    javaOnlyMap.putArray(strNextKey, j(source.getArray(strNextKey)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return javaOnlyMap;
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "ObjectAnimatedNode[" + this.tag + "]: mConfig: " + this.configClone;
    }

    public final void i(String propKey, JavaOnlyMap propsMap) {
        p013kotlin.jvm.internal.s.k(propKey, "propKey");
        p013kotlin.jvm.internal.s.k(propsMap, "propsMap");
        ReadableType type = this.configClone.getType("value");
        if (type == ReadableType.Map) {
            propsMap.putMap(propKey, k(this.configClone.getMap("value")));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            propsMap.putArray(propKey, j(this.configClone.getArray("value")));
        }
    }
}
