package zr;

import android.os.Parcel;
import android.os.Parcelable;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f128530d;

    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i11) {
            return new j[i11];
        }
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f128528b = str;
        this.f128529c = str2;
        this.f128530d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (p0.c(this.f128529c, jVar.f128529c) && p0.c(this.f128528b, jVar.f128528b) && p0.c(this.f128530d, jVar.f128530d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f128528b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f128529c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f128530d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // zr.i
    public String toString() {
        return this.f128527a + ": domain=" + this.f128528b + ", description=" + this.f128529c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128527a);
        parcel.writeString(this.f128528b);
        parcel.writeString(this.f128530d);
    }

    j(Parcel parcel) {
        super("----");
        this.f128528b = (String) p0.j(parcel.readString());
        this.f128529c = (String) p0.j(parcel.readString());
        this.f128530d = (String) p0.j(parcel.readString());
    }
}
