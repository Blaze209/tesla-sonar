package vr;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements ur.a.b {
    public static final Parcelable.Creator<a> CREATOR = new C2563a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f119762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f119763b;

    /* JADX INFO: renamed from: vr.a$a, reason: collision with other inner class name */
    class C2563a implements Parcelable.Creator<a> {
        C2563a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) ts.a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(int i11, String str) {
        this.f119762a = i11;
        this.f119763b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f119762a + ",url=" + this.f119763b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f119763b);
        parcel.writeInt(this.f119762a);
    }
}
