package dr0;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.CardServiceException;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes10.dex */
public class a implements yq0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f60919b = Logger.getLogger("org.jmrtd.protocol");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x f60920a;

    public a(zo0.e eVar) {
        this.f60920a = new x(eVar);
    }

    @Override // yq0.a
    public synchronized byte[] a(zo0.c cVar, int i11, byte[] bArr) {
        zo0.j jVarB;
        int iA;
        if (bArr != null) {
            if (bArr.length == 8) {
                int i12 = i11 <= 1848 ? 256 : 65536;
                zo0.f fVar = new zo0.f(0, -120, 0, 0, bArr, i12);
                byte[] bArrC = null;
                try {
                    jVarB = this.f60920a.b(cVar, fVar);
                    try {
                        iA = jVarB.d();
                    } catch (CardServiceException e11) {
                        e = e11;
                        f60919b.log(Level.INFO, "Exception during transmission of command APDU = " + bp0.a.b(fVar.c()), (Throwable) e);
                        iA = e.a();
                    }
                } catch (CardServiceException e12) {
                    e = e12;
                    jVarB = null;
                }
                short s11 = (short) iA;
                if (s11 == -28672 && jVarB != null) {
                    return jVarB.c();
                }
                if ((65280 & s11) != 24832 || i12 != 256) {
                    if (jVarB == null || jVarB.c() == null) {
                        throw new CardServiceException("Internal Authenticate failed", s11);
                    }
                    f60919b.warning("Internal Authenticate may not have succeeded, got status word " + Integer.toHexString(s11 & HPKE.aead_EXPORT_ONLY));
                    return jVarB.c();
                }
                byte[] bArrC2 = jVarB == null ? null : jVarB.c();
                zo0.j jVarB2 = this.f60920a.b(cVar, new zo0.f(0, -120, 0, 0, bArr, 65536));
                if (jVarB2 != null) {
                    bArrC = jVarB2.c();
                }
                if (bArrC2 == null && bArrC == null) {
                    throw new CardServiceException("Internal Authenticate failed", s11);
                }
                if (bArrC2 != null && bArrC == null) {
                    return bArrC2;
                }
                if (bArrC2 != null || bArrC == null) {
                    return bArrC2.length > bArrC.length ? bArrC2 : bArrC;
                }
                return bArrC;
            }
        }
        throw new IllegalArgumentException("rndIFD wrong length");
    }
}
