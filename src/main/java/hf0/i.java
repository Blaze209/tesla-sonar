package hf0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f72659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    byte[] f72660b;

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

    protected i(Parcel parcel) {
        this.f72659a = parcel.readString();
        this.f72660b = parcel.createByteArray();
    }

    public byte[] a() {
        return this.f72660b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f72659a);
        parcel.writeByteArray(this.f72660b);
    }

    public i(String str, byte[] bArr) {
        this.f72659a = str;
        this.f72660b = bArr;
    }
}
