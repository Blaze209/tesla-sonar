package xr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.y0;
import java.util.Arrays;
import ou.e;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements ur.a.b {
    public static final Parcelable.Creator<a> CREATOR = new C2682a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f124023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f124026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f124027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f124028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f124029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f124030h;

    /* JADX INFO: renamed from: xr.a$a, reason: collision with other inner class name */
    class C2682a implements Parcelable.Creator<a> {
        C2682a() {
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

    public a(int i11, String str, String str2, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f124023a = i11;
        this.f124024b = str;
        this.f124025c = str2;
        this.f124026d = i12;
        this.f124027e = i13;
        this.f124028f = i14;
        this.f124029g = i15;
        this.f124030h = bArr;
    }

    public static a a(d0 d0Var) {
        int iQ = d0Var.q();
        String strF = d0Var.F(d0Var.q(), e.f99998a);
        String strE = d0Var.E(d0Var.q());
        int iQ2 = d0Var.q();
        int iQ3 = d0Var.q();
        int iQ4 = d0Var.q();
        int iQ5 = d0Var.q();
        int iQ6 = d0Var.q();
        byte[] bArr = new byte[iQ6];
        d0Var.l(bArr, 0, iQ6);
        return new a(iQ, strF, strE, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    @Override // ur.a.b
    public void O0(y0.b bVar) {
        bVar.I(this.f124030h, this.f124023a);
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
            if (this.f124023a == aVar.f124023a && this.f124024b.equals(aVar.f124024b) && this.f124025c.equals(aVar.f124025c) && this.f124026d == aVar.f124026d && this.f124027e == aVar.f124027e && this.f124028f == aVar.f124028f && this.f124029g == aVar.f124029g && Arrays.equals(this.f124030h, aVar.f124030h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f124023a) * 31) + this.f124024b.hashCode()) * 31) + this.f124025c.hashCode()) * 31) + this.f124026d) * 31) + this.f124027e) * 31) + this.f124028f) * 31) + this.f124029g) * 31) + Arrays.hashCode(this.f124030h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f124024b + ", description=" + this.f124025c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f124023a);
        parcel.writeString(this.f124024b);
        parcel.writeString(this.f124025c);
        parcel.writeInt(this.f124026d);
        parcel.writeInt(this.f124027e);
        parcel.writeInt(this.f124028f);
        parcel.writeInt(this.f124029g);
        parcel.writeByteArray(this.f124030h);
    }

    a(Parcel parcel) {
        this.f124023a = parcel.readInt();
        this.f124024b = (String) p0.j(parcel.readString());
        this.f124025c = (String) p0.j(parcel.readString());
        this.f124026d = parcel.readInt();
        this.f124027e = parcel.readInt();
        this.f124028f = parcel.readInt();
        this.f124029g = parcel.readInt();
        this.f124030h = (byte[]) p0.j(parcel.createByteArray());
    }
}
