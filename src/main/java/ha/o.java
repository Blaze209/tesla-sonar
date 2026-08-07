package ha;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72419e;

    class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i11) {
            return new o[i11];
        }
    }

    public o(Parcel parcel) {
        this.f72415a = parcel.readInt();
        this.f72417c = parcel.readInt();
        this.f72418d = parcel.readInt();
        this.f72419e = parcel.readInt();
        this.f72416b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f72415a);
        parcel.writeInt(this.f72417c);
        parcel.writeInt(this.f72418d);
        parcel.writeInt(this.f72419e);
        parcel.writeInt(this.f72416b);
    }
}
