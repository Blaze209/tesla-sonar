package q80;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends q80.a implements o, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f104913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f104914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f104915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f104916g;

    class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(@NonNull Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i11) {
            return new i[i11];
        }
    }

    private boolean D(@NonNull i iVar) {
        return this.f104913d == iVar.f104913d && v80.c.a(this.f104914e, iVar.f104914e) && this.f104915f == iVar.f104915f && v80.c.a(this.f104916g, iVar.f104916g);
    }

    @Override // q80.o
    public int b() {
        return this.f104915f;
    }

    @Override // q80.o
    public void d(int i11) {
        this.f104915f = v80.a.f(i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && D((i) obj);
        }
        return true;
    }

    public int hashCode() {
        return v80.c.b(Integer.valueOf(this.f104913d), this.f104914e, Integer.valueOf(this.f104915f), this.f104916g);
    }

    @Override // q80.o
    public String j() {
        return this.f104914e;
    }

    @Override // q80.o
    public void l(@NonNull String str) {
        this.f104914e = v80.a.e(str);
    }

    @Override // q80.o
    public void m(int i11) {
        this.f104913d = v80.a.f(i11);
    }

    @Override // q80.o
    public String s() {
        return this.f104916g;
    }

    @Override // q80.a, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f104913d);
        parcel.writeString(this.f104914e);
        parcel.writeInt(this.f104915f);
        parcel.writeString(this.f104916g);
    }

    public i() {
    }

    private i(@NonNull Parcel parcel) {
        super(parcel);
        this.f104913d = parcel.readInt();
        this.f104914e = parcel.readString();
        this.f104915f = parcel.readInt();
        this.f104916g = parcel.readString();
    }
}
