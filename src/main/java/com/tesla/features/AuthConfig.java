package com.tesla.features;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tesla/features/AuthConfig;", "", "enabled", "", "minVersion", "", "<init>", "(ZI)V", "getEnabled", "()Z", "getMinVersion", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthConfig {

    @g(name = "enabled")
    private final boolean enabled;

    @g(name = "min_version")
    private final int minVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthConfig() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ AuthConfig copy$default(AuthConfig authConfig, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = authConfig.enabled;
        }
        if ((i12 & 2) != 0) {
            i11 = authConfig.minVersion;
        }
        return authConfig.copy(z11, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinVersion() {
        return this.minVersion;
    }

    public final AuthConfig copy(boolean enabled, int minVersion) {
        return new AuthConfig(enabled, minVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthConfig)) {
            return false;
        }
        AuthConfig authConfig = (AuthConfig) other;
        return this.enabled == authConfig.enabled && this.minVersion == authConfig.minVersion;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + Integer.hashCode(this.minVersion);
    }

    public String toString() {
        return "AuthConfig(enabled=" + this.enabled + ", minVersion=" + this.minVersion + ")";
    }

    public AuthConfig(boolean z11, int i11) {
        this.enabled = z11;
        this.minVersion = i11;
    }

    public /* synthetic */ AuthConfig(boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11);
    }
}
