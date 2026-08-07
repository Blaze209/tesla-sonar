package t7;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p7.f0;
import s7.c0;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f112696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112698d;

    public c(String str, byte[] bArr, int i11, int i12) {
        c(str, bArr, i12);
        this.f112695a = str;
        this.f112696b = bArr;
        this.f112697c = i11;
        this.f112698d = i12;
    }

    private static String b(List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        ou.i.f(CoreConstants.COMMA_CHAR).b(sb2, list);
        return sb2.toString();
    }

    private static void c(String str, byte[] bArr, int i11) {
        byte b11;
        str.getClass();
        boolean z11 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z11 = true;
                }
                s7.a.a(z11);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b11 = bArr[0]) == 0 || b11 == 1)) {
                    z11 = true;
                }
                s7.a.a(z11);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z11 = true;
                }
                s7.a.a(z11);
                break;
            case "auxiliary.tracks.map":
                s7.a.a(i11 == 0);
                break;
        }
    }

    public List<Integer> a() {
        s7.a.i(this.f112695a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b11 = this.f112696b[1];
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < b11; i11++) {
            arrayList.add(Integer.valueOf(this.f112696b[i11 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f112695a.equals(cVar.f112695a) && Arrays.equals(this.f112696b, cVar.f112696b) && this.f112697c == cVar.f112697c && this.f112698d == cVar.f112698d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f112695a.hashCode()) * 31) + Arrays.hashCode(this.f112696b)) * 31) + this.f112697c) * 31) + this.f112698d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public String toString() {
        String strB;
        int i11 = this.f112698d;
        if (i11 != 0) {
            if (i11 == 1) {
                strB = q0.K(this.f112696b);
            } else if (i11 == 23) {
                strB = String.valueOf(Float.intBitsToFloat(ru.f.h(this.f112696b)));
            } else if (i11 == 67) {
                strB = String.valueOf(ru.f.h(this.f112696b));
            } else if (i11 == 75) {
                strB = String.valueOf(b.a(this.f112696b[0]));
            } else if (i11 != 78) {
                strB = q0.J1(this.f112696b);
            } else {
                strB = String.valueOf(new c0(this.f112696b).T());
            }
        } else if (this.f112695a.equals("auxiliary.tracks.map")) {
            strB = b(a());
        } else {
            strB = q0.J1(this.f112696b);
        }
        return "mdta: key=" + this.f112695a + ", value=" + strB;
    }
}
