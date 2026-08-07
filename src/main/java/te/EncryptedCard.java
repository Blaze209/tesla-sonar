package te;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: te.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\n¨\u0006\u001f"}, d2 = {"Lte/b;", "Landroid/os/Parcelable;", "", "encryptedCardNumber", "encryptedExpiryMonth", "encryptedExpiryYear", "encryptedSecurityCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EncryptedCard implements Parcelable {
    public static final Parcelable.Creator<EncryptedCard> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptedCardNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptedExpiryMonth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptedExpiryYear;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptedSecurityCode;

    /* JADX INFO: renamed from: te.b$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EncryptedCard> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EncryptedCard createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new EncryptedCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EncryptedCard[] newArray(int i11) {
            return new EncryptedCard[i11];
        }
    }

    public EncryptedCard(String str, String str2, String str3, String str4) {
        this.encryptedCardNumber = str;
        this.encryptedExpiryMonth = str2;
        this.encryptedExpiryYear = str3;
        this.encryptedSecurityCode = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedCard)) {
            return false;
        }
        EncryptedCard encryptedCard = (EncryptedCard) other;
        return s.f(this.encryptedCardNumber, encryptedCard.encryptedCardNumber) && s.f(this.encryptedExpiryMonth, encryptedCard.encryptedExpiryMonth) && s.f(this.encryptedExpiryYear, encryptedCard.encryptedExpiryYear) && s.f(this.encryptedSecurityCode, encryptedCard.encryptedSecurityCode);
    }

    public int hashCode() {
        String str = this.encryptedCardNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.encryptedExpiryMonth;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encryptedExpiryYear;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encryptedSecurityCode;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "EncryptedCard(encryptedCardNumber=" + this.encryptedCardNumber + ", encryptedExpiryMonth=" + this.encryptedExpiryMonth + ", encryptedExpiryYear=" + this.encryptedExpiryYear + ", encryptedSecurityCode=" + this.encryptedSecurityCode + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.encryptedCardNumber);
        parcel.writeString(this.encryptedExpiryMonth);
        parcel.writeString(this.encryptedExpiryYear);
        parcel.writeString(this.encryptedSecurityCode);
    }
}
