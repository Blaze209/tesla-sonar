package kz;

import com.nimbusds.jose.JOSEException;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import jz.h;
import jz.i;
import jz.k;
import jz.l;
import nz.a0;
import nz.b0;
import nz.w;
import nz.x;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes6.dex */
public class e extends x implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RSAPublicKey f89450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SecretKey f89451g;

    public e(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // jz.k
    public i d(l lVar, byte[] bArr) throws JOSEException {
        yz.c cVarE;
        h hVarR = lVar.r();
        jz.d dVarT = lVar.t();
        SecretKey secretKeyD = this.f89451g;
        if (secretKeyD == null) {
            secretKeyD = nz.l.d(dVarT, g().b());
        }
        if (hVarR.equals(h.f84467d)) {
            cVarE = yz.c.e(w.a(this.f89450f, secretKeyD, g().e()));
        } else if (hVarR.equals(h.f84468e)) {
            cVarE = yz.c.e(a0.a(this.f89450f, secretKeyD, g().e()));
        } else if (hVarR.equals(h.f84469f)) {
            cVarE = yz.c.e(b0.a(this.f89450f, secretKeyD, 256, g().e()));
        } else if (hVarR.equals(h.f84470g)) {
            cVarE = yz.c.e(b0.a(this.f89450f, secretKeyD, KyberEngine.KyberPolyBytes, g().e()));
        } else {
            if (!hVarR.equals(h.f84471h)) {
                throw new JOSEException(nz.e.c(hVarR, x.f95518d));
            }
            cVarE = yz.c.e(b0.a(this.f89450f, secretKeyD, 512, g().e()));
        }
        return nz.l.c(lVar, bArr, secretKeyD, cVarE, g());
    }

    public e(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey == null) {
            throw new IllegalArgumentException("The public RSA key must not be null");
        }
        this.f89450f = rSAPublicKey;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));
        if (secretKey == null) {
            this.f89451g = null;
        } else {
            if (secretKey.getAlgorithm() == null || !setUnmodifiableSet.contains(secretKey.getAlgorithm())) {
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
            }
            this.f89451g = secretKey;
        }
    }
}
