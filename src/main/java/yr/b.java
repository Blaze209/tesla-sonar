package yr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.y0;
import java.util.List;
import java.util.Map;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements ur.a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f125783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f125786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f125787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f125788f;

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

    public b(int i11, String str, String str2, String str3, boolean z11, int i12) {
        ts.a.a(i12 == -1 || i12 > 0);
        this.f125783a = i11;
        this.f125784b = str;
        this.f125785c = str2;
        this.f125786d = str3;
        this.f125787e = z11;
        this.f125788f = i12;
    }

    public static b a(Map<String, List<String>> map) {
        boolean z11;
        int i11;
        String str;
        String str2;
        boolean zEquals;
        int i12;
        List<String> list = map.get("icy-br");
        boolean z12 = true;
        int i13 = -1;
        if (list != null) {
            String str3 = list.get(0);
            try {
                i12 = Integer.parseInt(str3) * 1000;
                if (i12 > 0) {
                    z11 = true;
                } else {
                    try {
                        u.i("IcyHeaders", "Invalid bitrate: " + str3);
                        z11 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        u.i("IcyHeaders", "Invalid bitrate header: " + str3);
                        z11 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
            i11 = i12;
        } else {
            z11 = false;
            i11 = -1;
        }
        List<String> list2 = map.get("icy-genre");
        String str4 = null;
        if (list2 != null) {
            str4 = list2.get(0);
            z11 = true;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str = list3.get(0);
            z11 = true;
        } else {
            str = str4;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str2 = list4.get(0);
            z11 = true;
        } else {
            str2 = str4;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z11 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i14 = Integer.parseInt(str5);
                if (i14 > 0) {
                    i13 = i14;
                } else {
                    try {
                        u.i("IcyHeaders", "Invalid metadata interval: " + str5);
                        z12 = z11;
                    } catch (NumberFormatException unused3) {
                        i13 = i14;
                        u.i("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z11 = z12;
            } catch (NumberFormatException unused4) {
            }
        }
        return z11 ? new b(i11, str4, str, str2, zEquals, i13) : null;
    }

    @Override // ur.a.b
    public void O0(y0.b bVar) {
        String str = this.f125785c;
        if (str != null) {
            bVar.k0(str);
        }
        String str2 = this.f125784b;
        if (str2 != null) {
            bVar.Z(str2);
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f125783a == bVar.f125783a && p0.c(this.f125784b, bVar.f125784b) && p0.c(this.f125785c, bVar.f125785c) && p0.c(this.f125786d, bVar.f125786d) && this.f125787e == bVar.f125787e && this.f125788f == bVar.f125788f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (527 + this.f125783a) * 31;
        String str = this.f125784b;
        int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f125785c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f125786d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f125787e ? 1 : 0)) * 31) + this.f125788f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f125785c + "\", genre=\"" + this.f125784b + "\", bitrate=" + this.f125783a + ", metadataInterval=" + this.f125788f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f125783a);
        parcel.writeString(this.f125784b);
        parcel.writeString(this.f125785c);
        parcel.writeString(this.f125786d);
        p0.a1(parcel, this.f125787e);
        parcel.writeInt(this.f125788f);
    }

    b(Parcel parcel) {
        this.f125783a = parcel.readInt();
        this.f125784b = parcel.readString();
        this.f125785c = parcel.readString();
        this.f125786d = parcel.readString();
        this.f125787e = p0.K0(parcel);
        this.f125788f = parcel.readInt();
    }
}
