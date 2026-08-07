package kz;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;
import jz.p;
import jz.r;
import nz.m;
import nz.y;
import nz.z;

/* JADX INFO: loaded from: classes6.dex */
public class f extends z implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f89452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RSAPublicKey f89453e;

    public f(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // jz.r
    public boolean f(p pVar, byte[] bArr, yz.c cVar) throws JOSEException {
        if (!this.f89452d.d(pVar)) {
            return false;
        }
        Signature signatureC = y.c(pVar.r(), e().a());
        try {
            signatureC.initVerify(this.f89453e);
            try {
                signatureC.update(bArr);
                return signatureC.verify(cVar.a());
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e11) {
            throw new JOSEException("Invalid public RSA key: " + e11.getMessage(), e11);
        }
    }

    public f(RSAPublicKey rSAPublicKey, Set<String> set) {
        m mVar = new m();
        this.f89452d = mVar;
        if (rSAPublicKey == null) {
            throw new IllegalArgumentException("The public RSA key must not be null");
        }
        this.f89453e = rSAPublicKey;
        mVar.e(set);
    }
}
