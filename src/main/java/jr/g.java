package jr;

import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f84281a;

    public g(u0 u0Var) {
        this.f84281a = u0Var;
    }

    private static String a(int i11) {
        switch (i11) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i11) {
        if (i11 == 1) {
            return "audio/raw";
        }
        if (i11 == 85) {
            return "audio/mpeg";
        }
        if (i11 == 255) {
            return "audio/mp4a-latm";
        }
        if (i11 == 8192) {
            return "audio/ac3";
        }
        if (i11 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static a c(d0 d0Var) {
        d0Var.V(4);
        int iU = d0Var.u();
        int iU2 = d0Var.u();
        d0Var.V(4);
        int iU3 = d0Var.u();
        String strA = a(iU3);
        if (strA != null) {
            u0.b bVar = new u0.b();
            bVar.n0(iU).S(iU2).g0(strA);
            return new g(bVar.G());
        }
        u.i("StreamFormatChunk", "Ignoring track with unsupported compression " + iU3);
        return null;
    }

    public static a d(int i11, d0 d0Var) {
        if (i11 == 2) {
            return c(d0Var);
        }
        if (i11 == 1) {
            return e(d0Var);
        }
        u.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + p0.k0(i11));
        return null;
    }

    private static a e(d0 d0Var) {
        int iZ = d0Var.z();
        String strB = b(iZ);
        if (strB == null) {
            u.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZ);
            return null;
        }
        int iZ2 = d0Var.z();
        int iU = d0Var.u();
        d0Var.V(6);
        int iA0 = p0.a0(d0Var.N());
        int iZ3 = d0Var.z();
        byte[] bArr = new byte[iZ3];
        d0Var.l(bArr, 0, iZ3);
        u0.b bVar = new u0.b();
        bVar.g0(strB).J(iZ2).h0(iU);
        if ("audio/raw".equals(strB) && iA0 != 0) {
            bVar.a0(iA0);
        }
        if ("audio/mp4a-latm".equals(strB) && iZ3 > 0) {
            bVar.V(x.s(bArr));
        }
        return new g(bVar.G());
    }

    @Override // jr.a
    public int getType() {
        return 1718776947;
    }
}
