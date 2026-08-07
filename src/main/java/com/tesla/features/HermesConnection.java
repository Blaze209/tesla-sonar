package com.tesla.features;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\n¨\u0006\""}, d2 = {"Lcom/tesla/features/HermesConnection;", "", "", "enabled", "", "minVersion", "connectOnDemand", "<init>", "(ZIZ)V", "component1", "()Z", "component2", "()I", "component3", "copy", "(ZIZ)Lcom/tesla/features/HermesConnection;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "I", "getMinVersion", "getConnectOnDemand", "enabledAndMeetsVersionThreshold", "getEnabledAndMeetsVersionThreshold", "useConnectOnDemand", "getUseConnectOnDemand", "Companion", "a", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HermesConnection {
    public static final int HERMES_CONNECTION_LOCAL_VERSION = 1;

    @g(name = "connect_on_demand")
    private final boolean connectOnDemand;

    @g(name = "enabled")
    private final boolean enabled;
    private final boolean enabledAndMeetsVersionThreshold;

    @g(name = "min_version")
    private final int minVersion;
    private final boolean useConnectOnDemand;

    public HermesConnection() {
        this(false, 0, false, 7, null);
    }

    public static /* synthetic */ HermesConnection copy$default(HermesConnection hermesConnection, boolean z11, int i11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = hermesConnection.enabled;
        }
        if ((i12 & 2) != 0) {
            i11 = hermesConnection.minVersion;
        }
        if ((i12 & 4) != 0) {
            z12 = hermesConnection.connectOnDemand;
        }
        return hermesConnection.copy(z11, i11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinVersion() {
        return this.minVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getConnectOnDemand() {
        return this.connectOnDemand;
    }

    public final HermesConnection copy(boolean enabled, int minVersion, boolean connectOnDemand) {
        return new HermesConnection(enabled, minVersion, connectOnDemand);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HermesConnection)) {
            return false;
        }
        HermesConnection hermesConnection = (HermesConnection) other;
        return this.enabled == hermesConnection.enabled && this.minVersion == hermesConnection.minVersion && this.connectOnDemand == hermesConnection.connectOnDemand;
    }

    public final boolean getConnectOnDemand() {
        return this.connectOnDemand;
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

    public final boolean getUseConnectOnDemand() {
        return this.useConnectOnDemand;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enabled) * 31) + Integer.hashCode(this.minVersion)) * 31) + Boolean.hashCode(this.connectOnDemand);
    }

    public String toString() {
        return "HermesConnection(enabled=" + this.enabled + ", minVersion=" + this.minVersion + ", connectOnDemand=" + this.connectOnDemand + ")";
    }

    public HermesConnection(boolean z11, int i11, boolean z12) {
        this.enabled = z11;
        this.minVersion = i11;
        this.connectOnDemand = z12;
        boolean z13 = false;
        boolean z14 = z11 && 1 >= i11;
        this.enabledAndMeetsVersionThreshold = z14;
        if (z14 && z12) {
            z13 = true;
        }
        this.useConnectOnDemand = z13;
    }

    public /* synthetic */ HermesConnection(boolean z11, int i11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? false : z12);
    }
}
