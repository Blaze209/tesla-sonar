package nz;

import com.nimbusds.jose.JOSEException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f95507a = Collections.EMPTY_SET;

    public void a(jz.l lVar) throws JOSEException {
        if (!d(lVar)) {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
    }

    public Set<String> b() {
        return Collections.unmodifiableSet(this.f95507a);
    }

    public Set<String> c() {
        return Collections.singleton("b64");
    }

    public boolean d(jz.e eVar) {
        if (eVar.c() == null) {
            return true;
        }
        for (String str : eVar.c()) {
            if (!c().contains(str) && !b().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public void e(Set<String> set) {
        if (set == null) {
            this.f95507a = Collections.EMPTY_SET;
        } else {
            this.f95507a = set;
        }
    }
}
