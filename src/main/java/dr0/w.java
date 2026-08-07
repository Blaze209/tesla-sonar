package dr0;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes10.dex */
public class w implements yq0.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f60996c = Logger.getLogger("org.jmrtd.protocol");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x f60997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zo0.e f60998b;

    public w(zo0.e eVar) {
        this.f60998b = eVar;
        this.f60997a = new x(eVar);
    }

    private static void c(zo0.f fVar, zo0.j jVar) throws CardServiceException {
        if (jVar == null) {
            throw new CardServiceException("No response APDU");
        }
        byte[] bArrC = jVar.c();
        short sD = (short) jVar.d();
        String str = "CAPDU = " + bp0.a.b(fVar.c()) + ", RAPDU = " + bp0.a.b(jVar.b());
        if ((sD & 26368) == 26368 && (bArrC == null || bArrC.length == 0)) {
            throw new CardServiceException("Wrong length, " + str, sD);
        }
        if (sD != -28672) {
            if (sD == 25218) {
                if (bArrC == null || bArrC.length == 0) {
                    throw new CardServiceException("End of file, " + str, sD);
                }
                return;
            }
            if (sD != 27010) {
                if (sD == 27266) {
                    throw new CardServiceException("File not found, " + str, sD);
                }
                if (sD != 27013 && sD != 27014) {
                    throw new CardServiceException("Error occured, " + str, sD);
                }
            }
            throw new CardServiceException("Access to file denied, " + str, sD);
        }
    }

    private static byte[] d(zo0.j jVar, boolean z11) throws CardServiceException {
        if (jVar == null) {
            return null;
        }
        byte[] bArrC = jVar.c();
        if (bArrC == null) {
            throw new CardServiceException("Malformed read binary long response data");
        }
        if (!z11) {
            return bArrC;
        }
        if (bArrC[0] != 83) {
            throw new CardServiceException("Malformed read binary long response data");
        }
        int i11 = bArrC[1];
        int i12 = (((byte) (i11 & 128)) == -128 ? (i11 & 15) + 1 : 1) + 1;
        int length = bArrC.length - i12;
        byte[] bArr = new byte[length];
        System.arraycopy(bArrC, i12, bArr, 0, length);
        return bArr;
    }

    @Override // yq0.e
    public synchronized byte[] a(zo0.c cVar, int i11, int i12, int i13, boolean z11, boolean z12) {
        zo0.f fVar;
        int i14;
        int iA;
        int i15;
        zo0.j jVarB = null;
        if (i13 == 0) {
            return null;
        }
        byte b11 = (byte) ((65280 & i12) >> 8);
        byte b12 = (byte) (i12 & 255);
        try {
            if (z12) {
                if (i13 < 128) {
                    i15 = i13 + 2;
                } else {
                    i15 = i13 < 256 ? i13 + 3 : i13;
                }
                int i16 = i15 > 256 ? 256 : i15;
                fVar = new zo0.f(0, -79, 0, 0, new byte[]{84, 2, b11, b12}, i16);
                i14 = i16;
            } else {
                fVar = z11 ? new zo0.f(0, -80, (byte) i11, b12, i13) : new zo0.f(0, -80, b11, b12, i13);
                i14 = i13;
            }
            try {
                jVarB = this.f60997a.b(cVar, fVar);
                iA = jVarB.d();
            } catch (CardServiceException e11) {
                if (this.f60998b.c(e11)) {
                    throw e11;
                }
                f60996c.log(Level.FINE, "Exception during READ BINARY", (Throwable) e11);
                iA = e11.a();
            }
            short s11 = (short) iA;
            byte[] bArrD = d(jVarB, z12);
            if (bArrD == null || bArrD.length == 0) {
                f60996c.warning("Empty response data: response APDU bytes = " + Arrays.toString(bArrD) + ", le = " + i14 + ", sw = " + Integer.toHexString(s11));
            }
            c(fVar, jVarB);
            return bArrD;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // yq0.e
    public synchronized void b(zo0.c cVar, short s11) {
        zo0.f fVar = new zo0.f(0, -92, 2, 12, new byte[]{(byte) ((s11 >> 8) & 255), (byte) (s11 & 255)}, 0);
        zo0.j jVarB = this.f60997a.b(cVar, fVar);
        if (jVarB == null) {
            return;
        }
        c(fVar, jVarB);
    }

    public synchronized void e(zo0.c cVar, byte[] bArr) {
        try {
            if (bArr == null) {
                throw new IllegalArgumentException("AID cannot be null");
            }
            zo0.f fVar = new zo0.f(0, -92, 4, 12, bArr);
            c(fVar, this.f60997a.b(cVar, fVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
