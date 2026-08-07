package hf0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public df0.b f72646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f72649d;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(df0.b bVar, String str, int i11) {
        this(bVar, str, i11, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f72646a);
        parcel.writeString(this.f72647b);
        parcel.writeInt(this.f72648c);
        parcel.writeString(this.f72649d);
    }

    public c(df0.b bVar, String str, int i11, String str2) {
        this.f72646a = bVar;
        this.f72647b = str;
        this.f72648c = i11;
        this.f72649d = str2;
    }

    protected c(Parcel parcel) {
        this.f72646a = (df0.b) parcel.readSerializable();
        this.f72647b = parcel.readString();
        this.f72648c = parcel.readInt();
        this.f72649d = parcel.readString();
    }
}
