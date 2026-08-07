package jm;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nm.n;
import pk.i;
import um.e;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jk.d f83995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n<jk.d, e> f83996b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<jk.d> f83998d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.b<jk.d> f83997c = new a();

    class a implements n.b<jk.d> {
        a() {
        }

        @Override // nm.n.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(jk.d dVar, boolean z11) {
            c.this.f(dVar, z11);
        }
    }

    static class b implements jk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final jk.d f84000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f84001b;

        public b(jk.d dVar, int i11) {
            this.f84000a = dVar;
            this.f84001b = i11;
        }

        @Override // jk.d
        /* JADX INFO: renamed from: a */
        public String getAnimationUriString() {
            return null;
        }

        @Override // jk.d
        public boolean b() {
            return false;
        }

        @Override // jk.d
        public boolean c(Uri uri) {
            return this.f84000a.c(uri);
        }

        @Override // jk.d
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f84001b == bVar.f84001b && this.f84000a.equals(bVar.f84000a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // jk.d
        public int hashCode() {
            return (this.f84000a.hashCode() * 1013) + this.f84001b;
        }

        public String toString() {
            return i.b(this).b("imageCacheKey", this.f84000a).a("frameIndex", this.f84001b).toString();
        }
    }

    public c(jk.d dVar, n<jk.d, e> nVar) {
        this.f83995a = dVar;
        this.f83996b = nVar;
    }

    private b e(int i11) {
        return new b(this.f83995a, i11);
    }

    private synchronized jk.d g() {
        jk.d next;
        Iterator<jk.d> it = this.f83998d.iterator();
        if (it.hasNext()) {
            next = it.next();
            it.remove();
        } else {
            next = null;
        }
        return next;
    }

    public tk.a<e> a(int i11, tk.a<e> aVar) {
        return this.f83996b.g(e(i11), aVar, this.f83997c);
    }

    public boolean b(int i11) {
        return this.f83996b.contains(e(i11));
    }

    public tk.a<e> c(int i11) {
        return this.f83996b.get(e(i11));
    }

    public tk.a<e> d() {
        tk.a<e> aVarD;
        do {
            jk.d dVarG = g();
            if (dVarG == null) {
                return null;
            }
            aVarD = this.f83996b.d(dVarG);
        } while (aVarD == null);
        return aVarD;
    }

    public synchronized void f(jk.d dVar, boolean z11) {
        try {
            if (z11) {
                this.f83998d.add(dVar);
            } else {
                this.f83998d.remove(dVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
