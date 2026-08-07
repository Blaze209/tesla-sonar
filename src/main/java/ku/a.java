package ku;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1882a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f89385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f89386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f89387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f89388d;

    /* JADX INFO: renamed from: ku.a$a, reason: collision with other inner class name */
    class C1882a implements Parcelable.Creator<a> {
        C1882a() {
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

    public a(Parcel parcel) {
        this.f89385a = parcel.readLong();
        this.f89386b = parcel.readLong();
        this.f89387c = parcel.readLong();
        this.f89388d = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f89385a);
        parcel.writeLong(this.f89386b);
        parcel.writeLong(this.f89387c);
        parcel.writeFloat(this.f89388d);
    }

    public a(long j11, long j12, long j13, float f11) {
        this.f89385a = j11;
        this.f89386b = j12;
        this.f89387c = j13;
        this.f89388d = f11;
    }
}
