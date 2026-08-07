package as;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements ur.a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0261a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14959d;

    /* JADX INFO: renamed from: as.a$a, reason: collision with other inner class name */
    class C0261a implements Parcelable.Creator<a> {
        C0261a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, C0261a c0261a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f14956a.equals(aVar.f14956a) && Arrays.equals(this.f14957b, aVar.f14957b) && this.f14958c == aVar.f14958c && this.f14959d == aVar.f14959d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f14956a.hashCode()) * 31) + Arrays.hashCode(this.f14957b)) * 31) + this.f14958c) * 31) + this.f14959d;
    }

    public String toString() {
        String strC;
        int i11 = this.f14959d;
        if (i11 == 1) {
            strC = p0.C(this.f14957b);
        } else if (i11 != 23) {
            strC = i11 != 67 ? p0.V0(this.f14957b) : String.valueOf(p0.W0(this.f14957b));
        } else {
            strC = String.valueOf(p0.U0(this.f14957b));
        }
        return "mdta: key=" + this.f14956a + ", value=" + strC;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f14956a);
        parcel.writeByteArray(this.f14957b);
        parcel.writeInt(this.f14958c);
        parcel.writeInt(this.f14959d);
    }

    public a(String str, byte[] bArr, int i11, int i12) {
        this.f14956a = str;
        this.f14957b = bArr;
        this.f14958c = i11;
        this.f14959d = i12;
    }

    private a(Parcel parcel) {
        this.f14956a = (String) p0.j(parcel.readString());
        this.f14957b = (byte[]) p0.j(parcel.createByteArray());
        this.f14958c = parcel.readInt();
        this.f14959d = parcel.readInt();
    }
}
