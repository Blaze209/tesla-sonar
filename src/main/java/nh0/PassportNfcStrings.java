package nh0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: nh0.k, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010\u001d¨\u0006A"}, d2 = {"Lnh0/k;", "Landroid/os/Parcelable;", "", "nfcScanPrompt", "authenticating", "reading", "cancelNfcScan", "nfcScanSuccess", "enablePassportNfcText", "enablePassportNfcConfirmButtonText", "enablePassportNfcCancelButtonText", "connectionLostText", "connectionLostConfirmButtonText", "authenticationErrorText", "authenticationErrorConfirmButtonText", "genericErrorText", "genericErrorConfirmButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getNfcScanPrompt", "b", "getAuthenticating", "c", "getReading", DateTokenConverter.CONVERTER_KEY, "getCancelNfcScan", "e", "getNfcScanSuccess", "f", "getEnablePassportNfcText", "g", "getEnablePassportNfcConfirmButtonText", "h", "getEnablePassportNfcCancelButtonText", IntegerTokenConverter.CONVERTER_KEY, "getConnectionLostText", "j", "getConnectionLostConfirmButtonText", "k", "getAuthenticationErrorText", "l", "getAuthenticationErrorConfirmButtonText", "m", "getGenericErrorText", "n", "getGenericErrorConfirmButtonText", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassportNfcStrings implements Parcelable {
    public static final Parcelable.Creator<PassportNfcStrings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nfcScanPrompt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authenticating;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reading;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cancelNfcScan;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nfcScanSuccess;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String enablePassportNfcText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String enablePassportNfcConfirmButtonText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String enablePassportNfcCancelButtonText;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String connectionLostText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String connectionLostConfirmButtonText;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authenticationErrorText;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authenticationErrorConfirmButtonText;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String genericErrorText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String genericErrorConfirmButtonText;

    /* JADX INFO: renamed from: nh0.k$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportNfcStrings> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PassportNfcStrings createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new PassportNfcStrings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PassportNfcStrings[] newArray(int i11) {
            return new PassportNfcStrings[i11];
        }
    }

    public PassportNfcStrings(String nfcScanPrompt, String authenticating, String reading, String cancelNfcScan, String nfcScanSuccess, String enablePassportNfcText, String enablePassportNfcConfirmButtonText, String enablePassportNfcCancelButtonText, String connectionLostText, String connectionLostConfirmButtonText, String authenticationErrorText, String authenticationErrorConfirmButtonText, String genericErrorText, String genericErrorConfirmButtonText) {
        s.k(nfcScanPrompt, "nfcScanPrompt");
        s.k(authenticating, "authenticating");
        s.k(reading, "reading");
        s.k(cancelNfcScan, "cancelNfcScan");
        s.k(nfcScanSuccess, "nfcScanSuccess");
        s.k(enablePassportNfcText, "enablePassportNfcText");
        s.k(enablePassportNfcConfirmButtonText, "enablePassportNfcConfirmButtonText");
        s.k(enablePassportNfcCancelButtonText, "enablePassportNfcCancelButtonText");
        s.k(connectionLostText, "connectionLostText");
        s.k(connectionLostConfirmButtonText, "connectionLostConfirmButtonText");
        s.k(authenticationErrorText, "authenticationErrorText");
        s.k(authenticationErrorConfirmButtonText, "authenticationErrorConfirmButtonText");
        s.k(genericErrorText, "genericErrorText");
        s.k(genericErrorConfirmButtonText, "genericErrorConfirmButtonText");
        this.nfcScanPrompt = nfcScanPrompt;
        this.authenticating = authenticating;
        this.reading = reading;
        this.cancelNfcScan = cancelNfcScan;
        this.nfcScanSuccess = nfcScanSuccess;
        this.enablePassportNfcText = enablePassportNfcText;
        this.enablePassportNfcConfirmButtonText = enablePassportNfcConfirmButtonText;
        this.enablePassportNfcCancelButtonText = enablePassportNfcCancelButtonText;
        this.connectionLostText = connectionLostText;
        this.connectionLostConfirmButtonText = connectionLostConfirmButtonText;
        this.authenticationErrorText = authenticationErrorText;
        this.authenticationErrorConfirmButtonText = authenticationErrorConfirmButtonText;
        this.genericErrorText = genericErrorText;
        this.genericErrorConfirmButtonText = genericErrorConfirmButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportNfcStrings)) {
            return false;
        }
        PassportNfcStrings passportNfcStrings = (PassportNfcStrings) other;
        return s.f(this.nfcScanPrompt, passportNfcStrings.nfcScanPrompt) && s.f(this.authenticating, passportNfcStrings.authenticating) && s.f(this.reading, passportNfcStrings.reading) && s.f(this.cancelNfcScan, passportNfcStrings.cancelNfcScan) && s.f(this.nfcScanSuccess, passportNfcStrings.nfcScanSuccess) && s.f(this.enablePassportNfcText, passportNfcStrings.enablePassportNfcText) && s.f(this.enablePassportNfcConfirmButtonText, passportNfcStrings.enablePassportNfcConfirmButtonText) && s.f(this.enablePassportNfcCancelButtonText, passportNfcStrings.enablePassportNfcCancelButtonText) && s.f(this.connectionLostText, passportNfcStrings.connectionLostText) && s.f(this.connectionLostConfirmButtonText, passportNfcStrings.connectionLostConfirmButtonText) && s.f(this.authenticationErrorText, passportNfcStrings.authenticationErrorText) && s.f(this.authenticationErrorConfirmButtonText, passportNfcStrings.authenticationErrorConfirmButtonText) && s.f(this.genericErrorText, passportNfcStrings.genericErrorText) && s.f(this.genericErrorConfirmButtonText, passportNfcStrings.genericErrorConfirmButtonText);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.nfcScanPrompt.hashCode() * 31) + this.authenticating.hashCode()) * 31) + this.reading.hashCode()) * 31) + this.cancelNfcScan.hashCode()) * 31) + this.nfcScanSuccess.hashCode()) * 31) + this.enablePassportNfcText.hashCode()) * 31) + this.enablePassportNfcConfirmButtonText.hashCode()) * 31) + this.enablePassportNfcCancelButtonText.hashCode()) * 31) + this.connectionLostText.hashCode()) * 31) + this.connectionLostConfirmButtonText.hashCode()) * 31) + this.authenticationErrorText.hashCode()) * 31) + this.authenticationErrorConfirmButtonText.hashCode()) * 31) + this.genericErrorText.hashCode()) * 31) + this.genericErrorConfirmButtonText.hashCode();
    }

    public String toString() {
        return "PassportNfcStrings(nfcScanPrompt=" + this.nfcScanPrompt + ", authenticating=" + this.authenticating + ", reading=" + this.reading + ", cancelNfcScan=" + this.cancelNfcScan + ", nfcScanSuccess=" + this.nfcScanSuccess + ", enablePassportNfcText=" + this.enablePassportNfcText + ", enablePassportNfcConfirmButtonText=" + this.enablePassportNfcConfirmButtonText + ", enablePassportNfcCancelButtonText=" + this.enablePassportNfcCancelButtonText + ", connectionLostText=" + this.connectionLostText + ", connectionLostConfirmButtonText=" + this.connectionLostConfirmButtonText + ", authenticationErrorText=" + this.authenticationErrorText + ", authenticationErrorConfirmButtonText=" + this.authenticationErrorConfirmButtonText + ", genericErrorText=" + this.genericErrorText + ", genericErrorConfirmButtonText=" + this.genericErrorConfirmButtonText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.nfcScanPrompt);
        dest.writeString(this.authenticating);
        dest.writeString(this.reading);
        dest.writeString(this.cancelNfcScan);
        dest.writeString(this.nfcScanSuccess);
        dest.writeString(this.enablePassportNfcText);
        dest.writeString(this.enablePassportNfcConfirmButtonText);
        dest.writeString(this.enablePassportNfcCancelButtonText);
        dest.writeString(this.connectionLostText);
        dest.writeString(this.connectionLostConfirmButtonText);
        dest.writeString(this.authenticationErrorText);
        dest.writeString(this.authenticationErrorConfirmButtonText);
        dest.writeString(this.genericErrorText);
        dest.writeString(this.genericErrorConfirmButtonText);
    }
}
