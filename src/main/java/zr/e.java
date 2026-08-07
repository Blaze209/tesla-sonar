package zr;

import android.os.Parcel;
import android.os.Parcelable;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f128517d;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f128515b = str;
        this.f128516c = str2;
        this.f128517d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (p0.c(this.f128516c, eVar.f128516c) && p0.c(this.f128515b, eVar.f128515b) && p0.c(this.f128517d, eVar.f128517d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f128515b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f128516c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f128517d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // zr.i
    public String toString() {
        return this.f128527a + ": language=" + this.f128515b + ", description=" + this.f128516c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128527a);
        parcel.writeString(this.f128515b);
        parcel.writeString(this.f128517d);
    }

    e(Parcel parcel) {
        super("COMM");
        this.f128515b = (String) p0.j(parcel.readString());
        this.f128516c = (String) p0.j(parcel.readString());
        this.f128517d = (String) p0.j(parcel.readString());
    }
}
