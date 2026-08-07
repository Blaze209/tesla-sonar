package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1811e;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i11) {
            return new ParcelableVolumeInfo[i11];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1807a = parcel.readInt();
        this.f1809c = parcel.readInt();
        this.f1810d = parcel.readInt();
        this.f1811e = parcel.readInt();
        this.f1808b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1807a);
        parcel.writeInt(this.f1809c);
        parcel.writeInt(this.f1810d);
        parcel.writeInt(this.f1811e);
        parcel.writeInt(this.f1808b);
    }
}
