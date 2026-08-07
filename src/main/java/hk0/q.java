package hk0;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class q implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f73082e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ReferenceQueue f73083f = new ReferenceQueue();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f73084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f73085b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f73086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f73087d;

    q(lk0.q qVar) {
        this.f73084a = i.j(qVar);
    }

    private static void g() {
        while (true) {
            Reference referencePoll = f73083f.poll();
            if (referencePoll == null) {
                return;
            }
            Map map = f73082e;
            synchronized (map) {
                try {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        if (it.next() == referencePoll) {
                            it.remove();
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    p a() {
        p pVar;
        if (this.f73087d != null) {
            return new p(this, new Object(), true, false);
        }
        Map map = f73082e;
        synchronized (map) {
            try {
                Reference reference = (Reference) map.get(this);
                pVar = reference != null ? (p) reference.get() : null;
                if (pVar == null) {
                    q qVar = (q) clone();
                    p pVar2 = new p(qVar, new Object(), true, true);
                    map.put(qVar, new WeakReference(pVar2, f73083f));
                    pVar = pVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
        return pVar;
    }

    public boolean b() {
        return this.f73086c;
    }

    public int c() {
        return this.f73085b;
    }

    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException("Failed to clone ClassIntrospectorBuilder", e11);
        }
    }

    public t d() {
        return this.f73087d;
    }

    public u e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f73084a == qVar.f73084a && this.f73086c == qVar.f73086c && this.f73085b == qVar.f73085b && this.f73087d == qVar.f73087d;
    }

    public boolean f() {
        return this.f73084a;
    }

    public void h(t tVar) {
        this.f73087d = tVar;
    }

    public int hashCode() {
        return (((((((((this.f73084a ? 1231 : 1237) + 31) * 31) + (this.f73086c ? 1231 : 1237)) * 31) + this.f73085b) * 31) + System.identityHashCode(this.f73087d)) * 31) + System.identityHashCode(null);
    }
}
