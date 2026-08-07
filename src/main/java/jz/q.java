package jz;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.JOSEException;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class q extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f84565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f84566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private yz.c f84567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<a> f84568f;

    public enum a {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public q(yz.c cVar, yz.c cVar2, yz.c cVar3) {
        this(cVar, new s(cVar2), cVar3);
    }

    private String f() {
        if (this.f84565c.t()) {
            return h().h().toString() + CoreConstants.DOT + b().c().toString();
        }
        return h().h().toString() + CoreConstants.DOT + b().toString();
    }

    private void g() {
        if (this.f84568f.get() != a.SIGNED && this.f84568f.get() != a.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    public static q k(String str) throws ParseException {
        yz.c[] cVarArrE = f.e(str);
        if (cVarArrE.length == 3) {
            return new q(cVarArrE[0], cVarArrE[1], cVarArrE[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    public p h() {
        return this.f84565c;
    }

    public yz.c i() {
        return this.f84567e;
    }

    public byte[] j() {
        return this.f84566d.getBytes(yz.l.f126026a);
    }

    public String l() {
        return m(false);
    }

    public String m(boolean z11) {
        g();
        if (!z11) {
            return this.f84566d + CoreConstants.DOT + this.f84567e.toString();
        }
        return this.f84565c.h().toString() + CoreConstants.DOT + CoreConstants.DOT + this.f84567e.toString();
    }

    public synchronized boolean n(r rVar) {
        boolean zF;
        g();
        try {
            zF = rVar.f(h(), j(), i());
            if (zF) {
                this.f84568f.set(a.VERIFIED);
            }
        } catch (JOSEException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
        return zF;
    }

    public q(yz.c cVar, s sVar, yz.c cVar2) throws ParseException {
        AtomicReference<a> atomicReference = new AtomicReference<>();
        this.f84568f = atomicReference;
        if (cVar == null) {
            throw new IllegalArgumentException("The first part must not be null");
        }
        try {
            this.f84565c = p.w(cVar);
            if (sVar == null) {
                throw new IllegalArgumentException("The payload (second part) must not be null");
            }
            d(sVar);
            this.f84566d = f();
            if (cVar2 == null) {
                throw new IllegalArgumentException("The third part must not be null");
            }
            this.f84567e = cVar2;
            atomicReference.set(a.SIGNED);
            if (h().t()) {
                c(cVar, sVar.c(), cVar2);
            } else {
                c(cVar, new yz.c(""), cVar2);
            }
        } catch (ParseException e11) {
            throw new ParseException("Invalid JWS header: " + e11.getMessage(), 0);
        }
    }
}
