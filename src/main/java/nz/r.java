package nz;

import com.nimbusds.jose.JOSEException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<jz.o> f95511c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(jz.o.f84541j);
        linkedHashSet.add(jz.o.f84542k);
        linkedHashSet.add(jz.o.f84543l);
        linkedHashSet.add(jz.o.f84544m);
        f95511c = Collections.unmodifiableSet(linkedHashSet);
    }

    protected r(jz.o oVar) throws JOSEException {
        super(new HashSet(Collections.singletonList(oVar)));
        if (f95511c.contains(oVar)) {
            return;
        }
        throw new JOSEException("Unsupported EC DSA algorithm: " + oVar);
    }

    public jz.o h() {
        return g().iterator().next();
    }
}
