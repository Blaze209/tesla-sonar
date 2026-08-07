package com.tesla.features;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/tesla/features/SigningGate;", "", "", "enabled", "", "minVersion", "<init>", "(ZI)V", "component1", "()Z", "component2", "()I", "copy", "(ZI)Lcom/tesla/features/SigningGate;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "I", "getMinVersion", "enabledAndMeetsVersionThreshold", "getEnabledAndMeetsVersionThreshold", "Companion", "a", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SigningGate {
    public static final int SIGNING_GATE_LOCAL_VERSION = 2;

    @g(name = "enabled")
    private final boolean enabled;
    private final boolean enabledAndMeetsVersionThreshold;

    @g(name = "min_version")
    private final int minVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public SigningGate() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ SigningGate copy$default(SigningGate signingGate, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = signingGate.enabled;
        }
        if ((i12 & 2) != 0) {
            i11 = signingGate.minVersion;
        }
        return signingGate.copy(z11, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinVersion() {
        return this.minVersion;
    }

    public final SigningGate copy(boolean enabled, int minVersion) {
        return new SigningGate(enabled, minVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SigningGate)) {
            return false;
        }
        SigningGate signingGate = (SigningGate) other;
        return this.enabled == signingGate.enabled && this.minVersion == signingGate.minVersion;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getEnabledAndMeetsVersionThreshold() {
        return this.enabledAndMeetsVersionThreshold;
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + Integer.hashCode(this.minVersion);
    }

    public String toString() {
        return "SigningGate(enabled=" + this.enabled + ", minVersion=" + this.minVersion + ")";
    }

    public SigningGate(boolean z11, int i11) {
        this.enabled = z11;
        this.minVersion = i11;
        this.enabledAndMeetsVersionThreshold = z11 && 2 >= i11;
    }

    public /* synthetic */ SigningGate(boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11);
    }
}
