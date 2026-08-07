package xr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.y0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class b implements ur.a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124032b;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b(String str, String str2) {
        this.f124031a = str;
        this.f124032b = str2;
    }

    @Override // ur.a.b
    public void O0(y0.b bVar) {
        String str = this.f124031a;
        str.getClass();
        switch (str) {
            case "ALBUM":
                bVar.N(this.f124032b);
                break;
            case "TITLE":
                bVar.m0(this.f124032b);
                break;
            case "DESCRIPTION":
                bVar.U(this.f124032b);
                break;
            case "ALBUMARTIST":
                bVar.M(this.f124032b);
                break;
            case "ARTIST":
                bVar.O(this.f124032b);
                break;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f124031a.equals(bVar.f124031a) && this.f124032b.equals(bVar.f124032b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f124031a.hashCode()) * 31) + this.f124032b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f124031a + "=" + this.f124032b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f124031a);
        parcel.writeString(this.f124032b);
    }

    protected b(Parcel parcel) {
        this.f124031a = (String) p0.j(parcel.readString());
        this.f124032b = (String) p0.j(parcel.readString());
    }
}
