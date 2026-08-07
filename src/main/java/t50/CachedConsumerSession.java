package t50;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: t50.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#¨\u0006$"}, d2 = {"Lt50/e;", "Landroid/os/Parcelable;", "", "emailAddress", "phoneNumber", "clientSecret", "publishableKey", "", "isVerified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", "p", DateTokenConverter.CONVERTER_KEY, "e", "Z", "()Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CachedConsumerSession implements Parcelable {
    public static final Parcelable.Creator<CachedConsumerSession> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publishableKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVerified;

    /* JADX INFO: renamed from: t50.e$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CachedConsumerSession> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CachedConsumerSession createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new CachedConsumerSession(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CachedConsumerSession[] newArray(int i11) {
            return new CachedConsumerSession[i11];
        }
    }

    public CachedConsumerSession(String emailAddress, String phoneNumber, String clientSecret, String str, boolean z11) {
        p013kotlin.jvm.internal.s.k(emailAddress, "emailAddress");
        p013kotlin.jvm.internal.s.k(phoneNumber, "phoneNumber");
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.clientSecret = clientSecret;
        this.publishableKey = str;
        this.isVerified = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedConsumerSession)) {
            return false;
        }
        CachedConsumerSession cachedConsumerSession = (CachedConsumerSession) other;
        return p013kotlin.jvm.internal.s.f(this.emailAddress, cachedConsumerSession.emailAddress) && p013kotlin.jvm.internal.s.f(this.phoneNumber, cachedConsumerSession.phoneNumber) && p013kotlin.jvm.internal.s.f(this.clientSecret, cachedConsumerSession.clientSecret) && p013kotlin.jvm.internal.s.f(this.publishableKey, cachedConsumerSession.publishableKey) && this.isVerified == cachedConsumerSession.isVerified;
    }

    public int hashCode() {
        int iHashCode = ((((this.emailAddress.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.clientSecret.hashCode()) * 31;
        String str = this.publishableKey;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isVerified);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public String toString() {
        return "CachedConsumerSession(emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ", clientSecret=" + this.clientSecret + ", publishableKey=" + this.publishableKey + ", isVerified=" + this.isVerified + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.emailAddress);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.publishableKey);
        parcel.writeInt(this.isVerified ? 1 : 0);
    }
}
