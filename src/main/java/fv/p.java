package fv;

import gv.f0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f66667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ev.i f66668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f66669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f66670d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f66671e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f66672f = new k(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference<String> f66673g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference<e> f66674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<Runnable> f66675b = new AtomicReference<>(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f66676c;

        public a(boolean z11) {
            this.f66676c = z11;
            this.f66674a = new AtomicMarkableReference<>(new e(64, z11 ? PKIFailureInfo.certRevoked : 1024), false);
        }

        public static /* synthetic */ void a(a aVar) throws Throwable {
            aVar.f66675b.set(null);
            aVar.d();
        }

        private void c() {
            Runnable runnable = new Runnable() { // from class: fv.o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.a.a(this.f66666a);
                }
            };
            if (androidx.camera.view.i.a(this.f66675b, null, runnable)) {
                p.this.f66668b.diskWrite.e(runnable);
            }
        }

        private void d() throws Throwable {
            Map<String, String> mapA;
            synchronized (this) {
                try {
                    if (this.f66674a.isMarked()) {
                        mapA = this.f66674a.getReference().a();
                        AtomicMarkableReference<e> atomicMarkableReference = this.f66674a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mapA != null) {
                p.this.f66667a.r(p.this.f66669c, mapA, this.f66676c);
            }
        }

        public Map<String, String> b() {
            return this.f66674a.getReference().a();
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f66674a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<e> atomicMarkableReference = this.f66674a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public p(String str, jv.g gVar, ev.i iVar) {
        this.f66669c = str;
        this.f66667a = new g(gVar);
        this.f66668b = iVar;
    }

    public static /* synthetic */ void c(p pVar, String str, Map map, List list) throws Throwable {
        if (pVar.j() != null) {
            pVar.f66667a.t(str, pVar.j());
        }
        if (!map.isEmpty()) {
            pVar.f66667a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        pVar.f66667a.s(str, list);
    }

    public static p k(String str, jv.g gVar, ev.i iVar) {
        g gVar2 = new g(gVar);
        p pVar = new p(str, gVar, iVar);
        pVar.f66670d.f66674a.getReference().e(gVar2.i(str, false));
        pVar.f66671e.f66674a.getReference().e(gVar2.i(str, true));
        pVar.f66673g.set(gVar2.k(str), false);
        pVar.f66672f.c(gVar2.j(str));
        return pVar;
    }

    public static String l(String str, jv.g gVar) {
        return new g(gVar).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws Throwable {
        boolean z11;
        String strJ;
        synchronized (this.f66673g) {
            try {
                z11 = false;
                if (this.f66673g.isMarked()) {
                    strJ = j();
                    this.f66673g.set(strJ, false);
                    z11 = true;
                } else {
                    strJ = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            this.f66667a.t(this.f66669c, strJ);
        }
    }

    public Map<String, String> g(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f66670d.b();
        }
        HashMap map2 = new HashMap(this.f66670d.b());
        int i11 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strC = e.c(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, e.c(entry.getValue(), 1024));
            } else {
                i11++;
            }
        }
        if (i11 > 0) {
            bv.g.f().k("Ignored " + i11 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> h() {
        return this.f66671e.b();
    }

    public List<f0.e.d.AbstractC1440e> i() {
        return this.f66672f.a();
    }

    public String j() {
        return this.f66673g.getReference();
    }

    public boolean n(String str, String str2) {
        return this.f66670d.e(str, str2);
    }

    public boolean o(String str, String str2) {
        return this.f66671e.e(str, str2);
    }

    public void p(final String str) {
        synchronized (this.f66669c) {
            this.f66669c = str;
            final Map<String, String> mapB = this.f66670d.b();
            final List<j> listB = this.f66672f.b();
            this.f66668b.diskWrite.e(new Runnable() { // from class: fv.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.c(this.f66659a, str, mapB, listB);
                }
            });
        }
    }

    public void q(String str) {
        String strC = e.c(str, 1024);
        synchronized (this.f66673g) {
            try {
                if (com.google.firebase.crashlytics.internal.common.i.z(strC, this.f66673g.getReference())) {
                    return;
                }
                this.f66673g.set(strC, true);
                this.f66668b.diskWrite.e(new Runnable() { // from class: fv.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f66663a.m();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean r(List<j> list) {
        synchronized (this.f66672f) {
            try {
                if (!this.f66672f.c(list)) {
                    return false;
                }
                final List<j> listB = this.f66672f.b();
                this.f66668b.diskWrite.e(new Runnable() { // from class: fv.n
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        p pVar = this.f66664a;
                        pVar.f66667a.s(pVar.f66669c, listB);
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
