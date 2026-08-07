package hf0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f72664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f72667d;

    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    public l(boolean z11, String str, int i11, g gVar) {
        this.f72664a = z11;
        this.f72665b = str;
        this.f72666c = i11;
        this.f72667d = gVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.f72664a ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f72665b);
        parcel.writeInt(this.f72666c);
        parcel.writeParcelable(this.f72667d, i11);
    }

    protected l(Parcel parcel) {
        this.f72664a = parcel.readByte() != 0;
        this.f72665b = parcel.readString();
        this.f72666c = parcel.readInt();
        this.f72667d = (g) parcel.readParcelable(g.class.getClassLoader());
    }
}
