package dr0;

import java.security.PublicKey;
import org.jmrtd.CardServiceProtocolException;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yq0.a f60921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f60922b;

    public b(yq0.a aVar, y yVar) {
        this.f60921a = aVar;
        this.f60922b = yVar;
    }

    public c a(PublicKey publicKey, String str, String str2, byte[] bArr) throws CardServiceProtocolException {
        if (bArr != null) {
            try {
                if (bArr.length == 8) {
                    return new c(publicKey, str, str2, bArr, this.f60921a.a(this.f60922b, yq0.o.m(publicKey), bArr));
                }
            } catch (Exception e11) {
                throw new CardServiceProtocolException("Exception", 1, e11);
            }
        }
        throw new IllegalArgumentException("AA failed: bad challenge");
    }
}
