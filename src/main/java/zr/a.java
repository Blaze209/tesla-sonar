package zr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.y0;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C2793a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f128501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f128502e;

    /* JADX INFO: renamed from: zr.a$a, reason: collision with other inner class name */
    class C2793a implements Parcelable.Creator<a> {
        C2793a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(String str, String str2, int i11, byte[] bArr) {
        super("APIC");
        this.f128499b = str;
        this.f128500c = str2;
        this.f128501d = i11;
        this.f128502e = bArr;
    }

    @Override // ur.a.b
    public void O0(y0.b bVar) {
        bVar.I(this.f128502e, this.f128501d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f128501d == aVar.f128501d && p0.c(this.f128499b, aVar.f128499b) && p0.c(this.f128500c, aVar.f128500c) && Arrays.equals(this.f128502e, aVar.f128502e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (527 + this.f128501d) * 31;
        String str = this.f128499b;
        int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f128500c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f128502e);
    }

    @Override // zr.i
    public String toString() {
        return this.f128527a + ": mimeType=" + this.f128499b + ", description=" + this.f128500c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128499b);
        parcel.writeString(this.f128500c);
        parcel.writeInt(this.f128501d);
        parcel.writeByteArray(this.f128502e);
    }

    a(Parcel parcel) {
        super("APIC");
        this.f128499b = (String) p0.j(parcel.readString());
        this.f128500c = parcel.readString();
        this.f128501d = parcel.readInt();
        this.f128502e = (byte[]) p0.j(parcel.createByteArray());
    }
}
