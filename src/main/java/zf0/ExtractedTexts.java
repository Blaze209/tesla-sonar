package zf0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: zf0.c0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lzf0/c0;", "Landroid/os/Parcelable;", "Ljava/util/Date;", "dateOfBirth", "expirationDate", "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "()Ljava/util/Date;", "b", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExtractedTexts implements Parcelable {
    public static final Parcelable.Creator<ExtractedTexts> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date dateOfBirth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expirationDate;

    /* JADX INFO: renamed from: zf0.c0$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtractedTexts> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExtractedTexts createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ExtractedTexts((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExtractedTexts[] newArray(int i11) {
            return new ExtractedTexts[i11];
        }
    }

    public ExtractedTexts(Date dateOfBirth, Date expirationDate) {
        p013kotlin.jvm.internal.s.k(dateOfBirth, "dateOfBirth");
        p013kotlin.jvm.internal.s.k(expirationDate, "expirationDate");
        this.dateOfBirth = dateOfBirth;
        this.expirationDate = expirationDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtractedTexts)) {
            return false;
        }
        ExtractedTexts extractedTexts = (ExtractedTexts) other;
        return p013kotlin.jvm.internal.s.f(this.dateOfBirth, extractedTexts.dateOfBirth) && p013kotlin.jvm.internal.s.f(this.expirationDate, extractedTexts.expirationDate);
    }

    public int hashCode() {
        return (this.dateOfBirth.hashCode() * 31) + this.expirationDate.hashCode();
    }

    public String toString() {
        return "ExtractedTexts(dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeSerializable(this.dateOfBirth);
        dest.writeSerializable(this.expirationDate);
    }
}
