package nz;

import com.nimbusds.jose.KeyLengthException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<jz.h> f95508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<jz.d> f95509f = l.f95505a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SecretKey f95510d;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(jz.h.f84475l);
        f95508e = Collections.unmodifiableSet(linkedHashSet);
    }

    protected o(SecretKey secretKey) {
        super(f95508e, h(yz.e.b(secretKey.getEncoded())));
        this.f95510d = secretKey;
    }

    private static Set<jz.d> h(int i11) throws KeyLengthException {
        Set<jz.d> set = l.f95506b.get(Integer.valueOf(i11));
        if (set != null) {
            return set;
        }
        throw new KeyLengthException("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
    }

    @Override // nz.g, jz.n
    public /* bridge */ /* synthetic */ Set b() {
        return super.b();
    }

    @Override // nz.g, jz.n
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // nz.g
    public /* bridge */ /* synthetic */ pz.c g() {
        return super.g();
    }

    public SecretKey i() {
        return this.f95510d;
    }
}
