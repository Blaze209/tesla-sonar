package kz;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import javax.crypto.SecretKey;
import jz.h;
import jz.i;
import jz.k;
import jz.l;
import nz.o;

/* JADX INFO: loaded from: classes6.dex */
public class b extends o implements k {
    public b(SecretKey secretKey) {
        super(secretKey);
    }

    public i d(l lVar, byte[] bArr) throws JOSEException {
        h hVarR = lVar.r();
        if (!hVarR.equals(h.f84475l)) {
            throw new JOSEException(nz.e.c(hVarR, o.f95508e));
        }
        jz.d dVarT = lVar.t();
        if (dVarT.b() == yz.e.f(i().getEncoded())) {
            return nz.l.c(lVar, bArr, i(), null, g());
        }
        throw new KeyLengthException(dVarT.b(), dVarT);
    }
}
