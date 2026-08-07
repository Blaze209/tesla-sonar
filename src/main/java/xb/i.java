package xb;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.y;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y.a f123174a;

    class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i11) {
            return new i[i11];
        }
    }

    public i(Parcel parcel) {
        this.f123174a = b(parcel.readInt(), new d(parcel).getData());
    }

    private static y.a b(int i11, androidx.work.g gVar) {
        if (i11 == 1) {
            return y.a.d();
        }
        if (i11 == 2) {
            return y.a.f(gVar);
        }
        if (i11 == 3) {
            return y.a.b(gVar);
        }
        throw new IllegalStateException("Unknown result type " + i11);
    }

    private static int c(y.a aVar) {
        if (aVar instanceof y.a.b) {
            return 1;
        }
        if (aVar instanceof y.a.c) {
            return 2;
        }
        if (aVar instanceof y.a.C0256a) {
            return 3;
        }
        throw new IllegalStateException("Unknown Result " + aVar);
    }

    public y.a a() {
        return this.f123174a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(c(this.f123174a));
        new d(this.f123174a.c()).writeToParcel(parcel, i11);
    }
}
