package mz;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyTypeException;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import jz.o;
import jz.p;
import kz.c;
import kz.d;
import kz.f;
import nz.r;
import nz.v;
import nz.z;
import pz.b;

/* JADX INFO: loaded from: classes6.dex */
public class a implements pz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<o> f92570b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f92571a = new b();

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(v.f95516d);
        linkedHashSet.addAll(z.f95520c);
        linkedHashSet.addAll(r.f95511c);
        f92570b = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // pz.a
    public b e() {
        return this.f92571a;
    }

    public jz.r g(p pVar, Key key) throws JOSEException {
        jz.r cVar;
        if (v.f95516d.contains(pVar.r())) {
            if (!(key instanceof SecretKey)) {
                throw new KeyTypeException(SecretKey.class);
            }
            cVar = new d((SecretKey) key);
        } else if (z.f95520c.contains(pVar.r())) {
            if (!(key instanceof RSAPublicKey)) {
                throw new KeyTypeException(RSAPublicKey.class);
            }
            cVar = new f((RSAPublicKey) key);
        } else {
            if (!r.f95511c.contains(pVar.r())) {
                throw new JOSEException("Unsupported JWS algorithm: " + pVar.r());
            }
            if (!(key instanceof ECPublicKey)) {
                throw new KeyTypeException(ECPublicKey.class);
            }
            cVar = new c((ECPublicKey) key);
        }
        cVar.e().c(this.f92571a.a());
        return cVar;
    }
}
