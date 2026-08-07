package kz;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Set;
import jz.o;
import jz.p;
import nz.m;
import nz.q;
import nz.r;

/* JADX INFO: loaded from: classes6.dex */
public class c extends r implements jz.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f89447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ECPublicKey f89448e;

    public c(ECPublicKey eCPublicKey) {
        this(eCPublicKey, null);
    }

    @Override // jz.r
    public boolean f(p pVar, byte[] bArr, yz.c cVar) throws JOSEException {
        o oVarR = pVar.r();
        if (!g().contains(oVarR)) {
            throw new JOSEException(nz.e.d(oVarR, g()));
        }
        if (!this.f89447d.d(pVar)) {
            return false;
        }
        byte[] bArrA = cVar.a();
        if (q.a(pVar.r()) != bArrA.length) {
            return false;
        }
        try {
            byte[] bArrE = q.e(bArrA);
            Signature signatureB = q.b(oVarR, e().a());
            try {
                signatureB.initVerify(this.f89448e);
                signatureB.update(bArr);
                return signatureB.verify(bArrE);
            } catch (InvalidKeyException e11) {
                throw new JOSEException("Invalid EC public key: " + e11.getMessage(), e11);
            } catch (SignatureException unused) {
                return false;
            }
        } catch (JOSEException unused2) {
            return false;
        }
    }

    public c(ECPublicKey eCPublicKey, Set<String> set) throws JOSEException {
        super(q.c(eCPublicKey));
        m mVar = new m();
        this.f89447d = mVar;
        this.f89448e = eCPublicKey;
        if (!oz.b.b(eCPublicKey, qz.a.b(h()).iterator().next().e())) {
            throw new JOSEException("Curve / public key parameters mismatch");
        }
        mVar.e(set);
    }
}
