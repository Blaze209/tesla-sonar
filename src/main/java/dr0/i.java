package dr0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes10.dex */
public class i implements yq0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f60943b = Logger.getLogger("org.jmrtd.protocol");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x f60944a;

    public i(zo0.e eVar) {
        this.f60944a = new x(eVar);
    }

    @Override // yq0.c
    public synchronized void a(zo0.c cVar, byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[bArr.length + (bArr2 != null ? bArr2.length : 0)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            }
            short sD = (short) this.f60944a.b(cVar, new zo0.f(0, 34, 65, 166, bArr3)).d();
            if (sD != -28672) {
                throw new CardServiceException("Sending MSE KAT failed", sD);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0007, B:8:0x0010, B:9:0x0023, B:16:0x003b, B:26:0x006f, B:27:0x0076, B:20:0x0064, B:15:0x0032, B:17:0x004e), top: B:32:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #1 {, blocks: (B:5:0x0007, B:8:0x0010, B:9:0x0023, B:16:0x003b, B:26:0x006f, B:27:0x0076, B:20:0x0064, B:15:0x0032, B:17:0x004e), top: B:32:0x0007, inners: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x006d, please report this as an issue */
    @Override // yq0.c
    public synchronized void b(zo0.c cVar, String str, BigInteger bigInteger) {
        zo0.j jVarB;
        short sD;
        if (bigInteger == null) {
            jVarB = this.f60944a.b(cVar, new zo0.f(0, 34, 65, 164, yq0.o.X(str)));
            if (jVarB == null) {
                sD = -1;
            } else {
                sD = (short) jVarB.d();
            }
            if (sD != -28672) {
                throw new CardServiceException("Sending MSE AT failed", sD);
            }
        } else if (bigInteger.compareTo(BigInteger.ZERO) < 0) {
            jVarB = this.f60944a.b(cVar, new zo0.f(0, 34, 65, 164, yq0.o.X(str)));
            if (jVarB == null) {
                sD = -1;
            } else {
                sD = (short) jVarB.d();
            }
            if (sD != -28672) {
                throw new CardServiceException("Sending MSE AT failed", sD);
            }
        } else {
            byte[] bArrX = yq0.o.X(str);
            byte[] bArrI = ap0.e.i(132, yq0.o.A(bigInteger));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(bArrX);
                byteArrayOutputStream.write(bArrI);
                byteArrayOutputStream.close();
            } catch (IOException e11) {
                f60943b.log(Level.WARNING, "Exception", (Throwable) e11);
            }
            jVarB = this.f60944a.b(cVar, new zo0.f(0, 34, 65, 164, byteArrayOutputStream.toByteArray()));
            if (jVarB == null) {
                sD = -1;
            } else {
                sD = (short) jVarB.d();
            }
            if (sD != -28672) {
                throw new CardServiceException("Sending MSE AT failed", sD);
            }
        }
        throw th;
    }

    @Override // yq0.c
    public synchronized byte[] c(zo0.c cVar, byte[] bArr, boolean z11) {
        return d(cVar, bArr, 256, z11);
    }

    public synchronized byte[] d(zo0.c cVar, byte[] bArr, int i11, boolean z11) {
        byte[] bArrC;
        try {
            byte[] bArrI = ap0.e.i(124, bArr);
            zo0.j jVarB = this.f60944a.b(cVar, new zo0.f(z11 ? 0 : 16, -122, 0, 0, bArrI, i11));
            short sD = (short) jVarB.d();
            if (sD == 26368) {
                jVarB = this.f60944a.b(cVar, new zo0.f(z11 ? 0 : 16, -122, 0, 0, bArrI, 256));
            }
            if (sD != -28672) {
                throw new CardServiceException("Sending general authenticate failed", sD);
            }
            bArrC = jVarB.c();
            try {
                bArrC = ap0.e.h(124, bArrC);
            } catch (Exception e11) {
                f60943b.log(Level.WARNING, "Could not unwrap response to GENERAL AUTHENTICATE", (Throwable) e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bArrC;
    }
}
