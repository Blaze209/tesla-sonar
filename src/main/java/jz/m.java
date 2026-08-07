package jz;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.JOSEException;
import java.text.ParseException;

/* JADX INFO: loaded from: classes6.dex */
public class m extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l f84529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private yz.c f84530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private yz.c f84531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private yz.c f84532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private yz.c f84533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f84534h;

    public enum a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public m(l lVar, s sVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("The JWE header must not be null");
        }
        this.f84529c = lVar;
        if (sVar == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        d(sVar);
        this.f84530d = null;
        this.f84532f = null;
        this.f84534h = a.UNENCRYPTED;
    }

    private void h() {
        a aVar = this.f84534h;
        if (aVar != a.ENCRYPTED && aVar != a.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void i() {
        if (this.f84534h != a.ENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void j(k kVar) throws JOSEException {
        if (!kVar.c().contains(o().r())) {
            throw new JOSEException("The " + o().r() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + kVar.c());
        }
        if (kVar.b().contains(o().t())) {
            return;
        }
        throw new JOSEException("The " + o().t() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + kVar.b());
    }

    private void k() {
        if (this.f84534h != a.UNENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public static m q(String str) throws ParseException {
        yz.c[] cVarArrE = f.e(str);
        if (cVarArrE.length == 5) {
            return new m(cVarArrE[0], cVarArrE[1], cVarArrE[2], cVarArrE[3], cVarArrE[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public synchronized void f(j jVar) {
        i();
        try {
            d(new s(jVar.a(o(), n(), p(), m(), l())));
            this.f84534h = a.DECRYPTED;
        } catch (JOSEException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }

    public synchronized void g(k kVar) {
        try {
            k();
            j(kVar);
            try {
                try {
                    i iVarD = kVar.d(o(), b().d());
                    if (iVarD.d() != null) {
                        this.f84529c = iVarD.d();
                    }
                    this.f84530d = iVarD.c();
                    this.f84531e = iVarD.e();
                    this.f84532f = iVarD.b();
                    this.f84533g = iVarD.a();
                    this.f84534h = a.ENCRYPTED;
                } catch (Exception e11) {
                    throw new JOSEException(e11.getMessage(), e11);
                }
            } catch (JOSEException e12) {
                throw e12;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public yz.c l() {
        return this.f84533g;
    }

    public yz.c m() {
        return this.f84532f;
    }

    public yz.c n() {
        return this.f84530d;
    }

    public l o() {
        return this.f84529c;
    }

    public yz.c p() {
        return this.f84531e;
    }

    public String r() {
        h();
        StringBuilder sb2 = new StringBuilder(this.f84529c.h().toString());
        sb2.append(CoreConstants.DOT);
        yz.c cVar = this.f84530d;
        if (cVar != null) {
            sb2.append(cVar);
        }
        sb2.append(CoreConstants.DOT);
        yz.c cVar2 = this.f84531e;
        if (cVar2 != null) {
            sb2.append(cVar2);
        }
        sb2.append(CoreConstants.DOT);
        sb2.append(this.f84532f);
        sb2.append(CoreConstants.DOT);
        yz.c cVar3 = this.f84533g;
        if (cVar3 != null) {
            sb2.append(cVar3);
        }
        return sb2.toString();
    }

    public m(yz.c cVar, yz.c cVar2, yz.c cVar3, yz.c cVar4, yz.c cVar5) throws ParseException {
        if (cVar != null) {
            try {
                this.f84529c = l.x(cVar);
                if (cVar2 != null && !cVar2.toString().isEmpty()) {
                    this.f84530d = cVar2;
                } else {
                    this.f84530d = null;
                }
                if (cVar3 != null && !cVar3.toString().isEmpty()) {
                    this.f84531e = cVar3;
                } else {
                    this.f84531e = null;
                }
                if (cVar4 != null) {
                    this.f84532f = cVar4;
                    if (cVar5 != null && !cVar5.toString().isEmpty()) {
                        this.f84533g = cVar5;
                    } else {
                        this.f84533g = null;
                    }
                    this.f84534h = a.ENCRYPTED;
                    c(cVar, cVar2, cVar3, cVar4, cVar5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e11) {
                throw new ParseException("Invalid JWE header: " + e11.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
