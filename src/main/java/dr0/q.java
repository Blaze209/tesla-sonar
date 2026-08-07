package dr0;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes10.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ECPrivateKey f60965a;

    public ECPoint a(PublicKey publicKey) throws InvalidKeyException {
        if (this.f60965a == null) {
            throw new IllegalStateException("Not initialized!");
        }
        if (!(publicKey instanceof ECPublicKey)) {
            throw new InvalidKeyException("Not an ECPublicKey");
        }
        org.bouncycastle.math.ec.ECPoint eCPointNormalize = yq0.o.R((ECPublicKey) publicKey).getQ().multiply(yq0.o.Q(this.f60965a).getD()).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalStateException("Infinity");
        }
        return yq0.o.j(eCPointNormalize);
    }

    public void b(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof ECPrivateKey)) {
            throw new InvalidKeyException("Not an ECPrivateKey");
        }
        this.f60965a = (ECPrivateKey) privateKey;
    }
}
