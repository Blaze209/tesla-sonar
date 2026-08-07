package zr;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f128531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f128533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f128534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f128535f;

    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i11) {
            return new k[i11];
        }
    }

    public k(int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f128531b = i11;
        this.f128532c = i12;
        this.f128533d = i13;
        this.f128534e = iArr;
        this.f128535f = iArr2;
    }

    @Override // zr.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f128531b == kVar.f128531b && this.f128532c == kVar.f128532c && this.f128533d == kVar.f128533d && Arrays.equals(this.f128534e, kVar.f128534e) && Arrays.equals(this.f128535f, kVar.f128535f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f128531b) * 31) + this.f128532c) * 31) + this.f128533d) * 31) + Arrays.hashCode(this.f128534e)) * 31) + Arrays.hashCode(this.f128535f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f128531b);
        parcel.writeInt(this.f128532c);
        parcel.writeInt(this.f128533d);
        parcel.writeIntArray(this.f128534e);
        parcel.writeIntArray(this.f128535f);
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f128531b = parcel.readInt();
        this.f128532c = parcel.readInt();
        this.f128533d = parcel.readInt();
        this.f128534e = (int[]) p0.j(parcel.createIntArray());
        this.f128535f = (int[]) p0.j(parcel.createIntArray());
    }
}
