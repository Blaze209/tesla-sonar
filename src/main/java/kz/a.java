package kz;

import com.nimbusds.jose.JOSEException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import jz.h;
import jz.j;
import jz.l;
import nz.m;
import nz.o;

/* JADX INFO: loaded from: classes6.dex */
public class a extends o implements j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f89445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f89446h;

    public a(SecretKey secretKey, boolean z11) {
        super(secretKey);
        this.f89446h = new m();
        this.f89445g = z11;
    }

    @Override // jz.j
    public byte[] a(l lVar, yz.c cVar, yz.c cVar2, yz.c cVar3, yz.c cVar4) throws JOSEException {
        if (!this.f89445g) {
            h hVarR = lVar.r();
            if (!hVarR.equals(h.f84475l)) {
                throw new JOSEException(nz.e.c(hVarR, o.f95508e));
            }
            if (cVar != null) {
                throw new JOSEException("Unexpected present JWE encrypted key");
            }
        }
        if (cVar2 == null) {
            throw new JOSEException("Unexpected present JWE initialization vector (IV)");
        }
        if (cVar4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        }
        this.f89446h.a(lVar);
        return nz.l.b(lVar, null, cVar2, cVar3, cVar4, i(), g());
    }

    public a(byte[] bArr) {
        this(new SecretKeySpec(bArr, "AES"), false);
    }
}
