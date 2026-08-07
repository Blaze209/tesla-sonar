package er;

import android.os.Parcel;
import android.os.Parcelable;
import ru.h;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ur.a.b {
    public static final Parcelable.Creator<a> CREATOR = new C1297a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63132a;

    /* JADX INFO: renamed from: er.a$a, reason: collision with other inner class name */
    class C1297a implements Parcelable.Creator<a> {
        C1297a() {
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

    /* synthetic */ a(Parcel parcel, C1297a c1297a) {
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
        return (obj instanceof a) && this.f63132a == ((a) obj).f63132a;
    }

    public int hashCode() {
        return h.c(this.f63132a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creation time: ");
        long j11 = this.f63132a;
        sb2.append(j11 == -2082844800000L ? "unset" : Long.valueOf(j11));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f63132a);
    }

    public a(long j11) {
        this.f63132a = j11;
    }

    private a(Parcel parcel) {
        this.f63132a = parcel.readLong();
    }
}
