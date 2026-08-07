package q80;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements c, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f104905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f104906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f104907c;

    a() {
    }

    @Override // q80.c
    public String f() {
        return this.f104906b;
    }

    @Override // q80.c
    public String r() {
        return this.f104905a;
    }

    @Override // q80.c
    public void setTextColor(@NonNull String str) {
        this.f104906b = v80.a.e(str);
    }

    @Override // q80.c
    public int v() {
        return this.f104907c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f104905a);
        parcel.writeString(this.f104906b);
        parcel.writeInt(this.f104907c);
    }

    @Override // q80.c
    public void z(int i11) {
        this.f104907c = v80.a.g(i11);
    }

    a(@NonNull Parcel parcel) {
        this.f104905a = parcel.readString();
        this.f104906b = parcel.readString();
        this.f104907c = parcel.readInt();
    }
}
