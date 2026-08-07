package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/animated/l;", "Lcom/facebook/react/animated/w;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/o;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/o;)V", "Ljn0/h0;", "h", "()V", "", "e", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/animated/o;", "", "j", "I", "inputNode", "", "k", "D", "modulus", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final o nativeAnimatedNodesManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int inputNode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final double modulus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ReadableMap config, o nativeAnimatedNodesManager) {
        super(null, 1, null);
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.inputNode = config.getInt("input");
        this.modulus = config.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.w, com.facebook.react.animated.b
    public String e() {
        return "NativeAnimatedNodesManager[" + this.tag + "] inputNode: " + this.inputNode + " modulus: " + this.modulus + " super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        b bVarK = this.nativeAnimatedNodesManager.k(this.inputNode);
        if (!(bVarK instanceof w)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double dL = ((w) bVarK).l();
        double d11 = this.modulus;
        this.nodeValue = ((dL % d11) + d11) % d11;
    }
}
