package j9;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import p7.e0;
import p7.f0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f83122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f83123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f83124f;

    public b(int i11, String str, String str2, String str3, boolean z11, int i12) {
        s7.a.a(i12 == -1 || i12 > 0);
        this.f83119a = i11;
        this.f83120b = str;
        this.f83121c = str2;
        this.f83122d = str3;
        this.f83123e = z11;
        this.f83124f = i12;
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
                        t.i("IcyHeaders", "Invalid bitrate: " + str3);
                        z11 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        t.i("IcyHeaders", "Invalid bitrate header: " + str3);
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
                        t.i("IcyHeaders", "Invalid metadata interval: " + str5);
                        z12 = z11;
                    } catch (NumberFormatException unused3) {
                        i13 = i14;
                        t.i("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z11 = z12;
            } catch (NumberFormatException unused4) {
            }
        }
        return z11 ? new b(i11, str4, str, str2, zEquals, i13) : null;
    }

    @Override // p7.f0.a
    public void I(e0.b bVar) {
        String str = this.f83121c;
        if (str != null) {
            bVar.n0(str);
        }
        String str2 = this.f83120b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f83119a == bVar.f83119a && Objects.equals(this.f83120b, bVar.f83120b) && Objects.equals(this.f83121c, bVar.f83121c) && Objects.equals(this.f83122d, bVar.f83122d) && this.f83123e == bVar.f83123e && this.f83124f == bVar.f83124f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (527 + this.f83119a) * 31;
        String str = this.f83120b;
        int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83121c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83122d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f83123e ? 1 : 0)) * 31) + this.f83124f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f83121c + "\", genre=\"" + this.f83120b + "\", bitrate=" + this.f83119a + ", metadataInterval=" + this.f83124f;
    }
}
