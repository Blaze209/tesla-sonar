package y8;

import com.google.common.collect.x;
import p7.u;
import s7.c0;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f125274a;

    public g(u uVar) {
        this.f125274a = uVar;
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

    private static a c(c0 c0Var) {
        c0Var.c0(4);
        int iZ = c0Var.z();
        int iZ2 = c0Var.z();
        c0Var.c0(4);
        int iZ3 = c0Var.z();
        String strA = a(iZ3);
        if (strA != null) {
            u.b bVar = new u.b();
            bVar.F0(iZ).h0(iZ2).y0(strA);
            return new g(bVar.P());
        }
        t.i("StreamFormatChunk", "Ignoring track with unsupported compression " + iZ3);
        return null;
    }

    public static a d(int i11, c0 c0Var) {
        if (i11 == 2) {
            return c(c0Var);
        }
        if (i11 == 1) {
            return e(c0Var);
        }
        t.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + q0.C0(i11));
        return null;
    }

    private static a e(c0 c0Var) {
        int iE = c0Var.E();
        String strB = b(iE);
        if (strB == null) {
            t.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + iE);
            return null;
        }
        int iE2 = c0Var.E();
        int iZ = c0Var.z();
        c0Var.c0(6);
        int iQ0 = q0.q0(c0Var.E());
        int iE3 = c0Var.a() > 0 ? c0Var.E() : 0;
        u.b bVar = new u.b();
        bVar.y0(strB).T(iE2).z0(iZ);
        if (strB.equals("audio/raw") && iQ0 != 0) {
            bVar.s0(iQ0);
        }
        if (strB.equals("audio/mp4a-latm") && iE3 > 0) {
            byte[] bArr = new byte[iE3];
            c0Var.q(bArr, 0, iE3);
            bVar.k0(x.s(bArr));
        }
        return new g(bVar.P());
    }

    @Override // y8.a
    public int getType() {
        return 1718776947;
    }
}
