package t80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t80.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b%\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\u001f¨\u0006)"}, d2 = {"Lt80/e;", "Landroid/os/Parcelable;", "", "threeDsServerTransactionId", "acsTransactionId", "acsRefNumber", "acsSignedContent", "threeDSRequestorAppURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "c", "setThreeDsServerTransactionId", "(Ljava/lang/String;)V", "b", "setAcsTransactionId", "getAcsRefNumber", "setAcsRefNumber", DateTokenConverter.CONVERTER_KEY, "setAcsSignedContent", "e", "getThreeDSRequestorAppURL", "setThreeDSRequestorAppURL", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallengeParameters implements Parcelable {
    public static final Parcelable.Creator<ChallengeParameters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String threeDsServerTransactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String acsTransactionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String acsRefNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String acsSignedContent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String threeDSRequestorAppURL;

    /* JADX INFO: renamed from: t80.e$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChallengeParameters> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallengeParameters createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ChallengeParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChallengeParameters[] newArray(int i11) {
            return new ChallengeParameters[i11];
        }
    }

    public ChallengeParameters() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeParameters)) {
            return false;
        }
        ChallengeParameters challengeParameters = (ChallengeParameters) other;
        return p013kotlin.jvm.internal.s.f(this.threeDsServerTransactionId, challengeParameters.threeDsServerTransactionId) && p013kotlin.jvm.internal.s.f(this.acsTransactionId, challengeParameters.acsTransactionId) && p013kotlin.jvm.internal.s.f(this.acsRefNumber, challengeParameters.acsRefNumber) && p013kotlin.jvm.internal.s.f(this.acsSignedContent, challengeParameters.acsSignedContent) && p013kotlin.jvm.internal.s.f(this.threeDSRequestorAppURL, challengeParameters.threeDSRequestorAppURL);
    }

    public int hashCode() {
        String str = this.threeDsServerTransactionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransactionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acsRefNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acsSignedContent;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.threeDSRequestorAppURL;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeParameters(threeDsServerTransactionId=" + this.threeDsServerTransactionId + ", acsTransactionId=" + this.acsTransactionId + ", acsRefNumber=" + this.acsRefNumber + ", acsSignedContent=" + this.acsSignedContent + ", threeDSRequestorAppURL=" + this.threeDSRequestorAppURL + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.threeDsServerTransactionId);
        parcel.writeString(this.acsTransactionId);
        parcel.writeString(this.acsRefNumber);
        parcel.writeString(this.acsSignedContent);
        parcel.writeString(this.threeDSRequestorAppURL);
    }

    public ChallengeParameters(String str, String str2, String str3, String str4, String str5) {
        this.threeDsServerTransactionId = str;
        this.acsTransactionId = str2;
        this.acsRefNumber = str3;
        this.acsSignedContent = str4;
        this.threeDSRequestorAppURL = str5;
    }

    public /* synthetic */ ChallengeParameters(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}
