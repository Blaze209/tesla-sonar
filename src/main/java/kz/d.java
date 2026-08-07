package kz;

import java.util.Set;
import javax.crypto.SecretKey;
import jz.p;
import jz.r;
import nz.m;
import nz.s;
import nz.v;

/* JADX INFO: loaded from: classes6.dex */
public class d extends v implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f89449e;

    public d(byte[] bArr) {
        this(bArr, null);
    }

    @Override // jz.r
    public boolean f(p pVar, byte[] bArr, yz.c cVar) {
        if (this.f89449e.d(pVar)) {
            return oz.a.a(s.a(v.h(pVar.r()), i(), bArr, e().a()), cVar.a());
        }
        return false;
    }

    public d(SecretKey secretKey) {
        this(secretKey.getEncoded());
    }

    public d(byte[] bArr, Set<String> set) {
        super(bArr, v.f95516d);
        m mVar = new m();
        this.f89449e = mVar;
        mVar.e(set);
    }
}
