package zr;

import android.os.Parcel;
import android.os.Parcelable;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128542c;

    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i11) {
            return new n[i11];
        }
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f128541b = str2;
        this.f128542c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f128527a.equals(nVar.f128527a) && p0.c(this.f128541b, nVar.f128541b) && p0.c(this.f128542c, nVar.f128542c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f128527a.hashCode()) * 31;
        String str = this.f128541b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f128542c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // zr.i
    public String toString() {
        return this.f128527a + ": url=" + this.f128542c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128527a);
        parcel.writeString(this.f128541b);
        parcel.writeString(this.f128542c);
    }

    n(Parcel parcel) {
        super((String) p0.j(parcel.readString()));
        this.f128541b = parcel.readString();
        this.f128542c = (String) p0.j(parcel.readString());
    }
}
