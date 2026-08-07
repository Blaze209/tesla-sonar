package as;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e implements ur.a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14971b;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
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
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f14970a == eVar.f14970a && this.f14971b == eVar.f14971b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + ru.c.a(this.f14970a)) * 31) + this.f14971b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f14970a + ", svcTemporalLayerCount=" + this.f14971b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.f14970a);
        parcel.writeInt(this.f14971b);
    }

    public e(float f11, int i11) {
        this.f14970a = f11;
        this.f14971b = i11;
    }

    private e(Parcel parcel) {
        this.f14970a = parcel.readFloat();
        this.f14971b = parcel.readInt();
    }
}
