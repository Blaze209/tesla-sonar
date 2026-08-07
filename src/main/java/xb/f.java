package xb;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.m f123168b;

    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i11) {
            return new f[i11];
        }
    }

    public f(Parcel parcel) {
        this.f123167a = parcel.readString();
        this.f123168b = new androidx.work.m(parcel.readInt(), (Notification) parcel.readParcelable(getClass().getClassLoader()), parcel.readInt());
    }

    public androidx.work.m a() {
        return this.f123168b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f123167a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f123167a);
        parcel.writeInt(this.f123168b.c());
        parcel.writeInt(this.f123168b.a());
        parcel.writeParcelable(this.f123168b.b(), i11);
    }
}
