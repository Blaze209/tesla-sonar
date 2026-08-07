package bs;

import android.os.Parcel;
import android.os.Parcelable;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0359a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18016c;

    /* JADX INFO: renamed from: bs.a$a, reason: collision with other inner class name */
    class C0359a implements Parcelable.Creator<a> {
        C0359a() {
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

    /* synthetic */ a(Parcel parcel, C0359a c0359a) {
        this(parcel);
    }

    static a a(d0 d0Var, int i11, long j11) {
        long J = d0Var.J();
        int i12 = i11 - 4;
        byte[] bArr = new byte[i12];
        d0Var.l(bArr, 0, i12);
        return new a(J, bArr, j11);
    }

    @Override // bs.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f18014a + ", identifier= " + this.f18015b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f18014a);
        parcel.writeLong(this.f18015b);
        parcel.writeByteArray(this.f18016c);
    }

    private a(long j11, byte[] bArr, long j12) {
        this.f18014a = j12;
        this.f18015b = j11;
        this.f18016c = bArr;
    }

    private a(Parcel parcel) {
        this.f18014a = parcel.readLong();
        this.f18015b = parcel.readLong();
        this.f18016c = (byte[]) p0.j(parcel.createByteArray());
    }
}
