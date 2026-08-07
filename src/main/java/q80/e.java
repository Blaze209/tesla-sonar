package q80;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends q80.a implements b, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f104908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f104909e;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    private boolean D(@NonNull e eVar) {
        return v80.c.a(this.f104908d, eVar.f104908d) && this.f104909e == eVar.f104909e;
    }

    @Override // q80.b
    public int b() {
        return this.f104909e;
    }

    @Override // q80.b
    public void c(@NonNull String str) {
        this.f104908d = v80.a.e(str);
    }

    @Override // q80.b
    public void d(int i11) {
        this.f104909e = v80.a.f(i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // q80.b
    public String e() {
        return this.f104908d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && D((e) obj);
        }
        return true;
    }

    public int hashCode() {
        return v80.c.b(this.f104908d, Integer.valueOf(this.f104909e));
    }

    @Override // q80.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f104908d);
        parcel.writeInt(this.f104909e);
    }

    public e() {
    }

    private e(@NonNull Parcel parcel) {
        super(parcel);
        this.f104908d = parcel.readString();
        this.f104909e = parcel.readInt();
    }
}
