package as;

import android.os.Parcel;
import android.os.Parcelable;
import ru.h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements ur.a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14964e;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i11) {
            return new b[i11];
        }
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f14960a == bVar.f14960a && this.f14961b == bVar.f14961b && this.f14962c == bVar.f14962c && this.f14963d == bVar.f14963d && this.f14964e == bVar.f14964e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.c(this.f14960a)) * 31) + h.c(this.f14961b)) * 31) + h.c(this.f14962c)) * 31) + h.c(this.f14963d)) * 31) + h.c(this.f14964e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f14960a + ", photoSize=" + this.f14961b + ", photoPresentationTimestampUs=" + this.f14962c + ", videoStartPosition=" + this.f14963d + ", videoSize=" + this.f14964e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f14960a);
        parcel.writeLong(this.f14961b);
        parcel.writeLong(this.f14962c);
        parcel.writeLong(this.f14963d);
        parcel.writeLong(this.f14964e);
    }

    public b(long j11, long j12, long j13, long j14, long j15) {
        this.f14960a = j11;
        this.f14961b = j12;
        this.f14962c = j13;
        this.f14963d = j14;
        this.f14964e = j15;
    }

    private b(Parcel parcel) {
        this.f14960a = parcel.readLong();
        this.f14961b = parcel.readLong();
        this.f14962c = parcel.readLong();
        this.f14963d = parcel.readLong();
        this.f14964e = parcel.readLong();
    }
}
