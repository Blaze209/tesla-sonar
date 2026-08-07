package nz;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<jz.o> f95516d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f95517c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(jz.o.f84535d);
        linkedHashSet.add(jz.o.f84536e);
        linkedHashSet.add(jz.o.f84537f);
        f95516d = Collections.unmodifiableSet(linkedHashSet);
    }

    protected v(byte[] bArr, Set<jz.o> set) throws KeyLengthException {
        super(set);
        if (bArr.length < 32) {
            throw new KeyLengthException("The secret length must be at least 256 bits");
        }
        this.f95517c = bArr;
    }

    protected static String h(jz.o oVar) throws JOSEException {
        if (oVar.equals(jz.o.f84535d)) {
            return "HMACSHA256";
        }
        if (oVar.equals(jz.o.f84536e)) {
            return "HMACSHA384";
        }
        if (oVar.equals(jz.o.f84537f)) {
            return "HMACSHA512";
        }
        throw new JOSEException(e.d(oVar, f95516d));
    }

    public byte[] i() {
        return this.f95517c;
    }
}
