package com.facebook.react.animated;

import android.view.View;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/facebook/react/animated/q;", "Lcom/facebook/react/animated/b;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/o;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/o;)V", "", "viewTag", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(ILcom/facebook/react/bridge/UIManager;)V", "j", "(I)V", "l", "()V", "m", "", "e", "()Ljava/lang/String;", "f", "Lcom/facebook/react/animated/o;", "g", "I", "connectedViewTag", "", "h", "Ljava/util/Map;", "propNodeMapping", "Lcom/facebook/react/bridge/JavaOnlyMap;", "Lcom/facebook/react/bridge/JavaOnlyMap;", "propMap", "Lcom/facebook/react/bridge/UIManager;", "connectedViewUIManager", "Landroid/view/View;", "k", "()Landroid/view/View;", "connectedView", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o nativeAnimatedNodesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int connectedViewTag;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> propNodeMapping;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final JavaOnlyMap propMap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private UIManager connectedViewUIManager;

    public q(ReadableMap config, o nativeAnimatedNodesManager) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.connectedViewTag = -1;
        this.propMap = new JavaOnlyMap();
        ReadableMap map = config.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        this.propNodeMapping = new LinkedHashMap();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.propNodeMapping.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "PropsAnimatedNode[" + this.tag + "] connectedViewTag: " + this.connectedViewTag + " propNodeMapping: " + this.propNodeMapping + " propMap: " + this.propMap;
    }

    public final void i(int viewTag, UIManager uiManager) {
        if (this.connectedViewTag == -1) {
            this.connectedViewTag = viewTag;
            this.connectedViewUIManager = uiManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.tag + " is already attached to a view: " + this.connectedViewTag);
    }

    public final void j(int viewTag) {
        int i11 = this.connectedViewTag;
        if (i11 == viewTag || i11 == -1) {
            this.connectedViewTag = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + viewTag + " but is connected to view " + this.connectedViewTag);
    }

    public final View k() {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            UIManager uIManager = this.connectedViewUIManager;
            objB = jn0.s.b(uIManager != null ? uIManager.resolveView(this.connectedViewTag) : null);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        return (View) (jn0.s.g(objB) ? null : objB);
    }

    public final void l() {
        int i11 = this.connectedViewTag;
        if (i11 == -1 || oo.a.a(i11) == 2) {
            return;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.propMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            this.propMap.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        UIManager uIManager = this.connectedViewUIManager;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.connectedViewTag, this.propMap);
        }
    }

    public final void m() {
        if (this.connectedViewTag == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.propNodeMapping.entrySet()) {
            String key = entry.getKey();
            b bVarK = this.nativeAnimatedNodesManager.k(entry.getValue().intValue());
            if (bVarK == null) {
                throw new IllegalArgumentException("Mapped property node does not exist");
            }
            if (bVarK instanceof s) {
                ((s) bVarK).i(this.propMap);
            } else if (bVarK instanceof w) {
                w wVar = (w) bVarK;
                Object objectValue = wVar.getObjectValue();
                if (objectValue instanceof Integer) {
                    this.propMap.putInt(key, ((Number) objectValue).intValue());
                } else if (objectValue instanceof String) {
                    this.propMap.putString(key, (String) objectValue);
                } else {
                    this.propMap.putDouble(key, wVar.l());
                }
            } else if (bVarK instanceof f) {
                this.propMap.putInt(key, ((f) bVarK).i());
            } else {
                if (!(bVarK instanceof p)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + bVarK.getClass());
                }
                ((p) bVarK).i(key, this.propMap);
            }
        }
        UIManager uIManager = this.connectedViewUIManager;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.connectedViewTag, this.propMap);
        }
    }
}
