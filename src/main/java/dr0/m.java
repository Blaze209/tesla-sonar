package dr0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes10.dex */
public class m implements yq0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f60958b = Logger.getLogger("org.jmrtd.protocol");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x f60959a;

    public m(zo0.e eVar) {
        this.f60959a = new x(eVar);
    }

    @Override // yq0.d
    public synchronized void a(zo0.c cVar, String str, int i11, byte[] bArr) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("OID cannot be null");
            }
            byte[] bArrX = yq0.o.X(str);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException("Unsupported key type reference (MRZ, CAN, etc), found " + i11);
            }
            byte[] bArrI = ap0.e.i(131, new byte[]{(byte) i11});
            if (bArr != null) {
                bArr = ap0.e.i(132, bArr);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(bArrX);
                byteArrayOutputStream.write(bArrI);
                if (bArr != null) {
                    byteArrayOutputStream.write(bArr);
                }
                short sD = (short) this.f60959a.b(cVar, new zo0.f(0, 34, 193, 164, byteArrayOutputStream.toByteArray())).d();
                if (sD != -28672) {
                    throw new CardServiceException("Sending MSE AT failed", sD);
                }
            } catch (IOException e11) {
                f60958b.log(Level.WARNING, "Error while copying data", (Throwable) e11);
                throw new IllegalStateException("Error while copying data");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // yq0.d
    public synchronized byte[] b(zo0.c cVar, byte[] bArr, int i11, boolean z11) {
        zo0.j jVarB;
        jVarB = this.f60959a.b(cVar, new zo0.f(z11 ? 0 : 16, -122, 0, 0, ap0.e.i(124, bArr), i11));
        short sD = (short) jVarB.d();
        if (sD != -28672) {
            throw new CardServiceException("Sending general authenticate failed", sD);
        }
        return ap0.e.h(124, jVarB.c());
    }
}
