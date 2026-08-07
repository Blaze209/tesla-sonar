package ds;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.g;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements Comparable<a>, Parcelable, g {
    public static final Parcelable.Creator<a> CREATOR = new C1244a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61010d = p0.t0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f61011e = p0.t0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f61012f = p0.t0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61015c;

    /* JADX INFO: renamed from: ds.a$a, reason: collision with other inner class name */
    class C1244a implements Parcelable.Creator<a> {
        C1244a() {
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

    public a(int i11, int i12, int i13) {
        this.f61013a = i11;
        this.f61014b = i12;
        this.f61015c = i13;
    }

    public static a b(Bundle bundle) {
        return new a(bundle.getInt(f61010d, 0), bundle.getInt(f61011e, 0), bundle.getInt(f61012f, 0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        int i11 = this.f61013a - aVar.f61013a;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.f61014b - aVar.f61014b;
        return i12 == 0 ? this.f61015c - aVar.f61015c : i12;
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
            if (this.f61013a == aVar.f61013a && this.f61014b == aVar.f61014b && this.f61015c == aVar.f61015c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f61013a * 31) + this.f61014b) * 31) + this.f61015c;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i11 = this.f61013a;
        if (i11 != 0) {
            bundle.putInt(f61010d, i11);
        }
        int i12 = this.f61014b;
        if (i12 != 0) {
            bundle.putInt(f61011e, i12);
        }
        int i13 = this.f61015c;
        if (i13 != 0) {
            bundle.putInt(f61012f, i13);
        }
        return bundle;
    }

    public String toString() {
        return this.f61013a + "." + this.f61014b + "." + this.f61015c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f61013a);
        parcel.writeInt(this.f61014b);
        parcel.writeInt(this.f61015c);
    }

    a(Parcel parcel) {
        this.f61013a = parcel.readInt();
        this.f61014b = parcel.readInt();
        this.f61015c = parcel.readInt();
    }
}
