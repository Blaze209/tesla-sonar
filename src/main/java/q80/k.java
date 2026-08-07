package q80;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends q80.a implements p, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f104917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f104918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f104919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f104920g;

    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i11) {
            return new k[i11];
        }
    }

    private boolean D(@NonNull k kVar) {
        return v80.c.a(this.f104917d, kVar.f104917d) && v80.c.a(this.f104918e, kVar.f104918e) && v80.c.a(this.f104919f, kVar.f104919f) && v80.c.a(this.f104920g, kVar.f104920g);
    }

    @Override // q80.p
    public String A() {
        return this.f104920g;
    }

    @Override // q80.p
    public String a() {
        return this.f104918e;
    }

    @Override // q80.p
    public void c(@NonNull String str) {
        this.f104917d = v80.a.e(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // q80.p
    public String e() {
        return this.f104917d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && D((k) obj);
        }
        return true;
    }

    @Override // q80.p
    public String h() {
        return this.f104919f;
    }

    public int hashCode() {
        return v80.c.b(this.f104917d, this.f104918e, this.f104919f, this.f104920g);
    }

    @Override // q80.p
    public void k(@NonNull String str) {
        this.f104919f = v80.a.h(str);
    }

    @Override // q80.p
    public void w(@NonNull String str) {
        this.f104918e = v80.a.e(str);
    }

    @Override // q80.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f104917d);
        parcel.writeString(this.f104918e);
        parcel.writeString(this.f104919f);
        parcel.writeString(this.f104920g);
    }

    @Override // q80.p
    public void x(@NonNull String str) {
        this.f104920g = v80.a.h(str);
    }

    public k() {
    }

    private k(@NonNull Parcel parcel) {
        super(parcel);
        this.f104917d = parcel.readString();
        this.f104918e = parcel.readString();
        this.f104919f = parcel.readString();
        this.f104920g = parcel.readString();
    }
}
