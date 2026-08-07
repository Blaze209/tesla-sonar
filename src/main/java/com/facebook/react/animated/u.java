package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/animated/u;", "Lcom/facebook/react/animated/b;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/o;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/o;)V", "Ljn0/h0;", "h", "()V", "", "e", "()Ljava/lang/String;", "f", "Lcom/facebook/react/animated/o;", "Lcom/facebook/react/bridge/JavaOnlyMap;", "g", "Lcom/facebook/react/bridge/JavaOnlyMap;", "animationConfig", "", "I", "animationId", IntegerTokenConverter.CONVERTER_KEY, "toValueNode", "j", "valueNode", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o nativeAnimatedNodesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final JavaOnlyMap animationConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int animationId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int toValueNode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int valueNode;

    public u(ReadableMap config, o nativeAnimatedNodesManager) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.animationConfig = JavaOnlyMap.INSTANCE.deepClone(config.getMap("animationConfig"));
        this.animationId = config.getInt("animationId");
        this.toValueNode = config.getInt("toValue");
        this.valueNode = config.getInt("value");
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "TrackingAnimatedNode[" + this.tag + "]: animationID: " + this.animationId + " toValueNode: " + this.toValueNode + " valueNode: " + this.valueNode + " animationConfig: " + this.animationConfig;
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        b bVarK = this.nativeAnimatedNodesManager.k(this.toValueNode);
        w wVar = bVarK instanceof w ? (w) bVarK : null;
        if (wVar != null) {
            this.animationConfig.putDouble("toValue", wVar.l());
        } else {
            this.animationConfig.putNull("toValue");
        }
        this.nativeAnimatedNodesManager.w(this.animationId, this.valueNode, this.animationConfig, null);
    }
}
