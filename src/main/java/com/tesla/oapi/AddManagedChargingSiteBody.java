package com.tesla.oapi;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tesla/oapi/AddManagedChargingSiteBody;", "", "publicKey", "", "din", OrcaKeys.LATITUDE, "", OrcaKeys.LONGITUDE, "<init>", "(Ljava/lang/String;Ljava/lang/String;FF)V", "getPublicKey", "()Ljava/lang/String;", "getDin", "getLatitude", "()F", "getLongitude", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddManagedChargingSiteBody {

    @g(name = "din")
    private final String din;

    @g(name = "lat")
    private final float latitude;

    @g(name = "lon")
    private final float longitude;

    @g(name = "public_key")
    private final String publicKey;

    public AddManagedChargingSiteBody(String publicKey, String din, float f11, float f12) {
        s.k(publicKey, "publicKey");
        s.k(din, "din");
        this.publicKey = publicKey;
        this.din = din;
        this.latitude = f11;
        this.longitude = f12;
    }

    public static /* synthetic */ AddManagedChargingSiteBody copy$default(AddManagedChargingSiteBody addManagedChargingSiteBody, String str, String str2, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addManagedChargingSiteBody.publicKey;
        }
        if ((i11 & 2) != 0) {
            str2 = addManagedChargingSiteBody.din;
        }
        if ((i11 & 4) != 0) {
            f11 = addManagedChargingSiteBody.latitude;
        }
        if ((i11 & 8) != 0) {
            f12 = addManagedChargingSiteBody.longitude;
        }
        return addManagedChargingSiteBody.copy(str, str2, f11, f12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDin() {
        return this.din;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    public final AddManagedChargingSiteBody copy(String publicKey, String din, float latitude, float longitude) {
        s.k(publicKey, "publicKey");
        s.k(din, "din");
        return new AddManagedChargingSiteBody(publicKey, din, latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddManagedChargingSiteBody)) {
            return false;
        }
        AddManagedChargingSiteBody addManagedChargingSiteBody = (AddManagedChargingSiteBody) other;
        return s.f(this.publicKey, addManagedChargingSiteBody.publicKey) && s.f(this.din, addManagedChargingSiteBody.din) && Float.compare(this.latitude, addManagedChargingSiteBody.latitude) == 0 && Float.compare(this.longitude, addManagedChargingSiteBody.longitude) == 0;
    }

    public final String getDin() {
        return this.din;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return (((((this.publicKey.hashCode() * 31) + this.din.hashCode()) * 31) + Float.hashCode(this.latitude)) * 31) + Float.hashCode(this.longitude);
    }

    public String toString() {
        return "AddManagedChargingSiteBody(publicKey=" + this.publicKey + ", din=" + this.din + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
