package zr;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f128520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f128521e;

    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i11) {
            return new f[i11];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f128518b = str;
        this.f128519c = str2;
        this.f128520d = str3;
        this.f128521e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (p0.c(this.f128518b, fVar.f128518b) && p0.c(this.f128519c, fVar.f128519c) && p0.c(this.f128520d, fVar.f128520d) && Arrays.equals(this.f128521e, fVar.f128521e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f128518b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f128519c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f128520d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f128521e);
    }

    @Override // zr.i
    public String toString() {
        return this.f128527a + ": mimeType=" + this.f128518b + ", filename=" + this.f128519c + ", description=" + this.f128520d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128518b);
        parcel.writeString(this.f128519c);
        parcel.writeString(this.f128520d);
        parcel.writeByteArray(this.f128521e);
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f128518b = (String) p0.j(parcel.readString());
        this.f128519c = (String) p0.j(parcel.readString());
        this.f128520d = (String) p0.j(parcel.readString());
        this.f128521e = (byte[]) p0.j(parcel.createByteArray());
    }
}
