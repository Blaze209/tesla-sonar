package t80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: t80.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b$\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006&"}, d2 = {"Lt80/c;", "Landroid/os/Parcelable;", "", "deviceData", "Lt80/q;", "sdkTransactionId", "sdkAppId", "sdkReferenceNumber", "sdkEphemeralPublicKey", "messageVersion", "<init>", "(Ljava/lang/String;Lt80/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Lt80/q;", "f", "()Lt80/q;", "c", DateTokenConverter.CONVERTER_KEY, "e", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AuthenticationRequestParameters implements Parcelable {
    public static final Parcelable.Creator<AuthenticationRequestParameters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q sdkTransactionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkAppId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkReferenceNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkEphemeralPublicKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageVersion;

    /* JADX INFO: renamed from: t80.c$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuthenticationRequestParameters> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AuthenticationRequestParameters createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new AuthenticationRequestParameters(parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AuthenticationRequestParameters[] newArray(int i11) {
            return new AuthenticationRequestParameters[i11];
        }
    }

    public AuthenticationRequestParameters(String deviceData, q sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        p013kotlin.jvm.internal.s.k(deviceData, "deviceData");
        p013kotlin.jvm.internal.s.k(sdkTransactionId, "sdkTransactionId");
        p013kotlin.jvm.internal.s.k(sdkAppId, "sdkAppId");
        p013kotlin.jvm.internal.s.k(sdkReferenceNumber, "sdkReferenceNumber");
        p013kotlin.jvm.internal.s.k(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        p013kotlin.jvm.internal.s.k(messageVersion, "messageVersion");
        this.deviceData = deviceData;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDeviceData() {
        return this.deviceData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSdkAppId() {
        return this.sdkAppId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationRequestParameters)) {
            return false;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) other;
        return p013kotlin.jvm.internal.s.f(this.deviceData, authenticationRequestParameters.deviceData) && p013kotlin.jvm.internal.s.f(this.sdkTransactionId, authenticationRequestParameters.sdkTransactionId) && p013kotlin.jvm.internal.s.f(this.sdkAppId, authenticationRequestParameters.sdkAppId) && p013kotlin.jvm.internal.s.f(this.sdkReferenceNumber, authenticationRequestParameters.sdkReferenceNumber) && p013kotlin.jvm.internal.s.f(this.sdkEphemeralPublicKey, authenticationRequestParameters.sdkEphemeralPublicKey) && p013kotlin.jvm.internal.s.f(this.messageVersion, authenticationRequestParameters.messageVersion);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final q getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public int hashCode() {
        return (((((((((this.deviceData.hashCode() * 31) + this.sdkTransactionId.hashCode()) * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode();
    }

    public String toString() {
        return "AuthenticationRequestParameters(deviceData=" + this.deviceData + ", sdkTransactionId=" + this.sdkTransactionId + ", sdkAppId=" + this.sdkAppId + ", sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkEphemeralPublicKey=" + this.sdkEphemeralPublicKey + ", messageVersion=" + this.messageVersion + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.deviceData);
        this.sdkTransactionId.writeToParcel(parcel, flags);
        parcel.writeString(this.sdkAppId);
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeString(this.sdkEphemeralPublicKey);
        parcel.writeString(this.messageVersion);
    }
}
