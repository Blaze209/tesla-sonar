package er;

import android.os.Parcel;
import android.os.Parcelable;
import ru.c;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements ur.a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f63133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f63134b;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
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
            if (this.f63133a == bVar.f63133a && this.f63134b == bVar.f63134b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + c.a(this.f63133a)) * 31) + c.a(this.f63134b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f63133a + ", longitude=" + this.f63134b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.f63133a);
        parcel.writeFloat(this.f63134b);
    }

    public b(float f11, float f12) {
        ts.a.b(f11 >= -90.0f && f11 <= 90.0f && f12 >= -180.0f && f12 <= 180.0f, "Invalid latitude or longitude");
        this.f63133a = f11;
        this.f63134b = f12;
    }

    private b(Parcel parcel) {
        this.f63133a = parcel.readFloat();
        this.f63134b = parcel.readFloat();
    }
}
