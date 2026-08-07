package p7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Comparable<m0>, Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f101424d = s7.q0.N0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f101425e = s7.q0.N0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f101426f = s7.q0.N0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101429c;

    class a implements Parcelable.Creator<m0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0 createFromParcel(Parcel parcel) {
            return new m0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m0[] newArray(int i11) {
            return new m0[i11];
        }
    }

    public m0(int i11, int i12, int i13) {
        this.f101427a = i11;
        this.f101428b = i12;
        this.f101429c = i13;
    }

    public static m0 b(Bundle bundle) {
        return new m0(bundle.getInt(f101424d, 0), bundle.getInt(f101425e, 0), bundle.getInt(f101426f, 0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m0 m0Var) {
        int i11 = this.f101427a - m0Var.f101427a;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.f101428b - m0Var.f101428b;
        return i12 == 0 ? this.f101429c - m0Var.f101429c : i12;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        int i11 = this.f101427a;
        if (i11 != 0) {
            bundle.putInt(f101424d, i11);
        }
        int i12 = this.f101428b;
        if (i12 != 0) {
            bundle.putInt(f101425e, i12);
        }
        int i13 = this.f101429c;
        if (i13 != 0) {
            bundle.putInt(f101426f, i13);
        }
        return bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f101427a == m0Var.f101427a && this.f101428b == m0Var.f101428b && this.f101429c == m0Var.f101429c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f101427a * 31) + this.f101428b) * 31) + this.f101429c;
    }

    public String toString() {
        return this.f101427a + "." + this.f101428b + "." + this.f101429c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f101427a);
        parcel.writeInt(this.f101428b);
        parcel.writeInt(this.f101429c);
    }

    m0(Parcel parcel) {
        this.f101427a = parcel.readInt();
        this.f101428b = parcel.readInt();
        this.f101429c = parcel.readInt();
    }
}
