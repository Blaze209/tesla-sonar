package t80;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.interfaces.ECPublicKey;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: t80.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lt80/a;", "Landroid/os/Parcelable;", "", "acsUrl", "Ljava/security/interfaces/ECPublicKey;", "acsEphemPubKey", "sdkEphemPubKey", "<init>", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)V", "a", "()Ljava/lang/String;", "b", "()Ljava/security/interfaces/ECPublicKey;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAcsUrl", "Ljava/security/interfaces/ECPublicKey;", "getAcsEphemPubKey", "c", "getSdkEphemPubKey", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AcsData implements Parcelable {
    public static final Parcelable.Creator<AcsData> CREATOR = new C2410a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acsUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ECPublicKey acsEphemPubKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ECPublicKey sdkEphemPubKey;

    /* JADX INFO: renamed from: t80.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C2410a implements Parcelable.Creator<AcsData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AcsData createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new AcsData(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AcsData[] newArray(int i11) {
            return new AcsData[i11];
        }
    }

    public AcsData(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        p013kotlin.jvm.internal.s.k(acsUrl, "acsUrl");
        p013kotlin.jvm.internal.s.k(acsEphemPubKey, "acsEphemPubKey");
        p013kotlin.jvm.internal.s.k(sdkEphemPubKey, "sdkEphemPubKey");
        this.acsUrl = acsUrl;
        this.acsEphemPubKey = acsEphemPubKey;
        this.sdkEphemPubKey = sdkEphemPubKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAcsUrl() {
        return this.acsUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ECPublicKey getAcsEphemPubKey() {
        return this.acsEphemPubKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcsData)) {
            return false;
        }
        AcsData acsData = (AcsData) other;
        return p013kotlin.jvm.internal.s.f(this.acsUrl, acsData.acsUrl) && p013kotlin.jvm.internal.s.f(this.acsEphemPubKey, acsData.acsEphemPubKey) && p013kotlin.jvm.internal.s.f(this.sdkEphemPubKey, acsData.sdkEphemPubKey);
    }

    public int hashCode() {
        return (((this.acsUrl.hashCode() * 31) + this.acsEphemPubKey.hashCode()) * 31) + this.sdkEphemPubKey.hashCode();
    }

    public String toString() {
        return "AcsData(acsUrl=" + this.acsUrl + ", acsEphemPubKey=" + this.acsEphemPubKey + ", sdkEphemPubKey=" + this.sdkEphemPubKey + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.acsUrl);
        parcel.writeSerializable(this.acsEphemPubKey);
        parcel.writeSerializable(this.sdkEphemPubKey);
    }
}
