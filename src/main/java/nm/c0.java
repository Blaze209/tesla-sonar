package nm;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f95141b = c0.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<jk.d, um.k> f95142a = new HashMap();

    private c0() {
    }

    public static c0 d() {
        return new c0();
    }

    private synchronized void e() {
        qk.a.y(f95141b, "Count = %d", Integer.valueOf(this.f95142a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f95142a.values());
            this.f95142a.clear();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            um.k kVar = (um.k) arrayList.get(i11);
            if (kVar != null) {
                kVar.close();
            }
        }
    }

    public synchronized boolean b(jk.d dVar) {
        pk.k.g(dVar);
        if (!this.f95142a.containsKey(dVar)) {
            return false;
        }
        um.k kVar = this.f95142a.get(dVar);
        synchronized (kVar) {
            if (um.k.u0(kVar)) {
                return true;
            }
            this.f95142a.remove(dVar);
            qk.a.G(f95141b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVar)), dVar.getAnimationUriString(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    public synchronized um.k c(jk.d dVar) {
        pk.k.g(dVar);
        um.k kVarN = this.f95142a.get(dVar);
        if (kVarN != null) {
            synchronized (kVarN) {
                if (!um.k.u0(kVarN)) {
                    this.f95142a.remove(dVar);
                    qk.a.G(f95141b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVarN)), dVar.getAnimationUriString(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                kVarN = um.k.n(kVarN);
            }
        }
        return kVarN;
    }

    public synchronized void f(jk.d dVar, um.k kVar) {
        pk.k.g(dVar);
        pk.k.b(Boolean.valueOf(um.k.u0(kVar)));
        um.k.o(this.f95142a.put(dVar, um.k.n(kVar)));
        e();
    }

    public boolean g(jk.d dVar) {
        um.k kVarRemove;
        pk.k.g(dVar);
        synchronized (this) {
            kVarRemove = this.f95142a.remove(dVar);
        }
        if (kVarRemove == null) {
            return false;
        }
        try {
            return kVarRemove.t0();
        } finally {
            kVarRemove.close();
        }
    }

    public synchronized boolean h(jk.d dVar, um.k kVar) {
        pk.k.g(dVar);
        pk.k.g(kVar);
        pk.k.b(Boolean.valueOf(um.k.u0(kVar)));
        um.k kVar2 = this.f95142a.get(dVar);
        if (kVar2 == null) {
            return false;
        }
        tk.a<PooledByteBuffer> aVarT = kVar2.t();
        tk.a<PooledByteBuffer> aVarT2 = kVar.t();
        if (aVarT != null && aVarT2 != null) {
            try {
                if (aVarT.H() == aVarT2.H()) {
                    this.f95142a.remove(dVar);
                    tk.a.C(aVarT2);
                    tk.a.C(aVarT);
                    um.k.o(kVar2);
                    e();
                    return true;
                }
            } catch (Throwable th2) {
                tk.a.C(aVarT2);
                tk.a.C(aVarT);
                um.k.o(kVar2);
                throw th2;
            }
        }
        tk.a.C(aVarT2);
        tk.a.C(aVarT);
        um.k.o(kVar2);
        return false;
    }
}
