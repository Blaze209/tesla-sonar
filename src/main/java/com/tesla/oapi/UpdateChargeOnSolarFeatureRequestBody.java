package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/tesla/oapi/UpdateChargeOnSolarFeatureRequestBody;", "", "enabled", "", "lowerChargeLimit", "", "upperChargeLimit", "<init>", "(ZFF)V", "getEnabled", "()Z", "getLowerChargeLimit", "()F", "getUpperChargeLimit", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpdateChargeOnSolarFeatureRequestBody {

    @g(name = "enabled")
    private final boolean enabled;

    @g(name = "lower_charge_limit")
    private final float lowerChargeLimit;

    @g(name = "upper_charge_limit")
    private final float upperChargeLimit;

    public UpdateChargeOnSolarFeatureRequestBody(boolean z11, float f11, float f12) {
        this.enabled = z11;
        this.lowerChargeLimit = f11;
        this.upperChargeLimit = f12;
    }

    public static /* synthetic */ UpdateChargeOnSolarFeatureRequestBody copy$default(UpdateChargeOnSolarFeatureRequestBody updateChargeOnSolarFeatureRequestBody, boolean z11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = updateChargeOnSolarFeatureRequestBody.enabled;
        }
        if ((i11 & 2) != 0) {
            f11 = updateChargeOnSolarFeatureRequestBody.lowerChargeLimit;
        }
        if ((i11 & 4) != 0) {
            f12 = updateChargeOnSolarFeatureRequestBody.upperChargeLimit;
        }
        return updateChargeOnSolarFeatureRequestBody.copy(z11, f11, f12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLowerChargeLimit() {
        return this.lowerChargeLimit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getUpperChargeLimit() {
        return this.upperChargeLimit;
    }

    public final UpdateChargeOnSolarFeatureRequestBody copy(boolean enabled, float lowerChargeLimit, float upperChargeLimit) {
        return new UpdateChargeOnSolarFeatureRequestBody(enabled, lowerChargeLimit, upperChargeLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateChargeOnSolarFeatureRequestBody)) {
            return false;
        }
        UpdateChargeOnSolarFeatureRequestBody updateChargeOnSolarFeatureRequestBody = (UpdateChargeOnSolarFeatureRequestBody) other;
        return this.enabled == updateChargeOnSolarFeatureRequestBody.enabled && Float.compare(this.lowerChargeLimit, updateChargeOnSolarFeatureRequestBody.lowerChargeLimit) == 0 && Float.compare(this.upperChargeLimit, updateChargeOnSolarFeatureRequestBody.upperChargeLimit) == 0;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getLowerChargeLimit() {
        return this.lowerChargeLimit;
    }

    public final float getUpperChargeLimit() {
        return this.upperChargeLimit;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enabled) * 31) + Float.hashCode(this.lowerChargeLimit)) * 31) + Float.hashCode(this.upperChargeLimit);
    }

    public String toString() {
        return "UpdateChargeOnSolarFeatureRequestBody(enabled=" + this.enabled + ", lowerChargeLimit=" + this.lowerChargeLimit + ", upperChargeLimit=" + this.upperChargeLimit + ")";
    }
}
