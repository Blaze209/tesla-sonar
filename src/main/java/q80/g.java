package q80;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends q80.a implements d, Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f104910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f104911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f104912f;

    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    }

    private boolean D(@NonNull g gVar) {
        return v80.c.a(this.f104910d, gVar.f104910d) && v80.c.a(this.f104911e, gVar.f104911e) && this.f104912f == gVar.f104912f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && D((g) obj);
        }
        return true;
    }

    @Override // q80.d
    public String g() {
        return this.f104911e;
    }

    public int hashCode() {
        return v80.c.b(this.f104910d, this.f104911e, Integer.valueOf(this.f104912f));
    }

    @Override // q80.d
    public String i() {
        return this.f104910d;
    }

    @Override // q80.d
    public int q() {
        return this.f104912f;
    }

    @Override // q80.d
    public void u(int i11) {
        this.f104912f = v80.a.g(i11);
    }

    @Override // q80.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f104910d);
        parcel.writeString(this.f104911e);
        parcel.writeInt(this.f104912f);
    }

    @Override // q80.d
    public void y(@NonNull String str) {
        this.f104910d = v80.a.e(str);
    }

    public g() {
    }

    private g(@NonNull Parcel parcel) {
        super(parcel);
        this.f104910d = parcel.readString();
        this.f104911e = parcel.readString();
        this.f104912f = parcel.readInt();
    }
}
