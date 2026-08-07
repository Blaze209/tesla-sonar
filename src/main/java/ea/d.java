package ea;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.util.Arrays;
import org.spongycastle.math.ec.Tnaf;
import s7.c0;
import s7.q0;
import s7.t;
import w8.q;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f62324a = {0, 0, 0, 0, Tnaf.POW_2_WIDTH, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f62325b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62327b;

        private a(int i11, long j11) {
            this.f62326a = i11;
            this.f62327b = j11;
        }

        public static a a(q qVar, c0 c0Var) {
            qVar.e(c0Var.f(), 0, 8);
            c0Var.b0(0);
            return new a(c0Var.v(), c0Var.C());
        }
    }

    public static boolean a(q qVar) {
        c0 c0Var = new c0(8);
        int i11 = a.a(qVar, c0Var).f62326a;
        if (i11 != 1380533830 && i11 != 1380333108) {
            return false;
        }
        qVar.e(c0Var.f(), 0, 4);
        c0Var.b0(0);
        int iV = c0Var.v();
        if (iV == 1463899717) {
            return true;
        }
        t.d("WavHeaderReader", "Unsupported form type: " + iV);
        return false;
    }

    public static c b(q qVar) throws ParserException {
        byte[] bArr;
        c0 c0Var = new c0(16);
        a aVarD = d(1718449184, qVar, c0Var);
        s7.a.h(aVarD.f62327b >= 16);
        qVar.e(c0Var.f(), 0, 16);
        c0Var.b0(0);
        int iE = c0Var.E();
        int iE2 = c0Var.E();
        int iD = c0Var.D();
        int iD2 = c0Var.D();
        int iE3 = c0Var.E();
        int iE4 = c0Var.E();
        int i11 = ((int) aVarD.f62327b) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            qVar.e(bArr, 0, i11);
            if (iE == 65534 && i11 == 24) {
                c0 c0Var2 = new c0(bArr);
                c0Var2.E();
                int iE5 = c0Var2.E();
                if (iE5 != 0 && iE5 != iE4) {
                    throw ParserException.d("validBits ( " + iE5 + ")  != bitsPerSample( " + iE4 + ") are not supported");
                }
                int iD3 = c0Var2.D();
                if ((iD3 >> 18) != 0) {
                    throw ParserException.d("invalid channel mask " + iD3);
                }
                if (iD3 != 0 && Integer.bitCount(iD3) != iE2) {
                    throw ParserException.d("invalid number of channels (" + Integer.bitCount(iD3) + ") in channel mask " + iD3);
                }
                iE = c0Var2.E();
                byte[] bArr2 = new byte[14];
                c0Var2.q(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, f62324a) && !Arrays.equals(bArr2, f62325b)) {
                    throw ParserException.d("invalid wav format extension guid");
                }
            }
        } else {
            bArr = q0.f110459f;
        }
        byte[] bArr3 = bArr;
        int i12 = iE;
        qVar.k((int) (qVar.h() - qVar.getPosition()));
        return new c(i12, iE2, iD, iD2, iE3, iE4, bArr3);
    }

    public static long c(q qVar) {
        c0 c0Var = new c0(8);
        a aVarA = a.a(qVar, c0Var);
        if (aVarA.f62326a != 1685272116) {
            qVar.g();
            return -1L;
        }
        qVar.i(8);
        c0Var.b0(0);
        qVar.e(c0Var.f(), 0, 8);
        long jA = c0Var.A();
        qVar.k(((int) aVarA.f62327b) + 8);
        return jA;
    }

    private static a d(int i11, q qVar, c0 c0Var) throws ParserException {
        a aVarA = a.a(qVar, c0Var);
        while (aVarA.f62326a != i11) {
            t.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f62326a);
            long j11 = aVarA.f62327b;
            long j12 = 8 + j11;
            if (j11 % 2 != 0) {
                j12 = 9 + j11;
            }
            if (j12 > 2147483647L) {
                throw ParserException.d("Chunk is too large (~2GB+) to skip; id: " + aVarA.f62326a);
            }
            qVar.k((int) j12);
            aVarA = a.a(qVar, c0Var);
        }
        return aVarA;
    }

    public static Pair<Long, Long> e(q qVar) throws ParserException {
        qVar.g();
        a aVarD = d(1684108385, qVar, new c0(8));
        qVar.k(8);
        return Pair.create(Long.valueOf(qVar.getPosition()), Long.valueOf(aVarD.f62327b));
    }
}
