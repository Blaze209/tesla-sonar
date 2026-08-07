package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile n f8152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final n f8153c = new n(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, w.e<?, ?>> f8154a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f8155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8156b;

        a(Object obj, int i11) {
            this.f8155a = obj;
            this.f8156b = i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8155a == aVar.f8155a && this.f8156b == aVar.f8156b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f8155a) * 65535) + this.f8156b;
        }
    }

    n() {
        this.f8154a = new HashMap();
    }

    public static n b() {
        n nVarA;
        if (a1.f8036d) {
            return f8153c;
        }
        n nVar = f8152b;
        if (nVar != null) {
            return nVar;
        }
        synchronized (n.class) {
            try {
                nVarA = f8152b;
                if (nVarA == null) {
                    nVarA = m.a();
                    f8152b = nVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVarA;
    }

    public <ContainingType extends p0> w.e<ContainingType, ?> a(ContainingType containingtype, int i11) {
        return (w.e) this.f8154a.get(new a(containingtype, i11));
    }

    n(boolean z11) {
        this.f8154a = Collections.EMPTY_MAP;
    }
}
