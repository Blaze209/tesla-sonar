package nh0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: nh0.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Lnh0/b;", "Landroid/os/Parcelable;", "", "passportNumber", "Ljava/util/Date;", "expirationDate", "dateOfBirth", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPassportNumber", "b", "Ljava/util/Date;", "getExpirationDate", "()Ljava/util/Date;", "c", "getDateOfBirth", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MrzKey implements Parcelable {
    public static final Parcelable.Creator<MrzKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String passportNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expirationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date dateOfBirth;

    /* JADX INFO: renamed from: nh0.b$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MrzKey> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MrzKey createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new MrzKey(parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MrzKey[] newArray(int i11) {
            return new MrzKey[i11];
        }
    }

    public MrzKey(String passportNumber, Date expirationDate, Date dateOfBirth) {
        s.k(passportNumber, "passportNumber");
        s.k(expirationDate, "expirationDate");
        s.k(dateOfBirth, "dateOfBirth");
        this.passportNumber = passportNumber;
        this.expirationDate = expirationDate;
        this.dateOfBirth = dateOfBirth;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrzKey)) {
            return false;
        }
        MrzKey mrzKey = (MrzKey) other;
        return s.f(this.passportNumber, mrzKey.passportNumber) && s.f(this.expirationDate, mrzKey.expirationDate) && s.f(this.dateOfBirth, mrzKey.dateOfBirth);
    }

    public int hashCode() {
        return (((this.passportNumber.hashCode() * 31) + this.expirationDate.hashCode()) * 31) + this.dateOfBirth.hashCode();
    }

    public String toString() {
        return "MrzKey(passportNumber=" + this.passportNumber + ", expirationDate=" + this.expirationDate + ", dateOfBirth=" + this.dateOfBirth + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.passportNumber);
        dest.writeSerializable(this.expirationDate);
        dest.writeSerializable(this.dateOfBirth);
    }
}
