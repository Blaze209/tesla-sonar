package kk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class g implements k, mk.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Class<?> f86232r = g.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f86233s = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f86234t = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f86235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f86236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f86237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f86238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jk.c f86239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set<String> f86240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f86241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f86242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final uk.a f86243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f86244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j f86245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final jk.a f86246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f86247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f86248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final wk.a f86249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f86250p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f86251q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.this.f86250p) {
                g.this.p();
            }
            g.this.f86251q = true;
            g.this.f86237c.countDown();
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f86253a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f86254b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f86255c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f86255c;
        }

        public synchronized long b() {
            return this.f86254b;
        }

        public synchronized void c(long j11, long j12) {
            if (this.f86253a) {
                this.f86254b += j11;
                this.f86255c += j12;
            }
        }

        public synchronized boolean d() {
            return this.f86253a;
        }

        public synchronized void e() {
            this.f86253a = false;
            this.f86255c = -1L;
            this.f86254b = -1L;
        }

        public synchronized void f(long j11, long j12) {
            this.f86255c = j12;
            this.f86254b = j11;
            this.f86253a = true;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f86256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f86257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f86258c;

        public c(long j11, long j12, long j13) {
            this.f86256a = j11;
            this.f86257b = j12;
            this.f86258c = j13;
        }
    }

    public g(f fVar, j jVar, c cVar, jk.c cVar2, jk.a aVar, mk.b bVar, Executor executor, boolean z11) {
        this.f86235a = cVar.f86257b;
        long j11 = cVar.f86258c;
        this.f86236b = j11;
        this.f86238d = j11;
        this.f86243i = uk.a.d();
        this.f86244j = fVar;
        this.f86245k = jVar;
        this.f86241g = -1L;
        this.f86239e = cVar2;
        this.f86242h = cVar.f86256a;
        this.f86246l = aVar;
        this.f86248n = new b();
        this.f86249o = wk.d.a();
        this.f86247m = z11;
        this.f86240f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!z11) {
            this.f86237c = new CountDownLatch(0);
        } else {
            this.f86237c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private ik.a l(f.b bVar, jk.d dVar, String str) {
        ik.a aVarT;
        synchronized (this.f86250p) {
            aVarT = bVar.t(dVar);
            this.f86240f.add(str);
            this.f86248n.c(aVarT.size(), 1L);
        }
        return aVarT;
    }

    private void m(long j11, jk.c.a aVar) throws IOException {
        try {
            Collection<f.a> collectionN = n(this.f86244j.getEntries());
            long jB = this.f86248n.b();
            long j12 = jB - j11;
            int i11 = 0;
            long j13 = 0;
            for (f.a aVar2 : collectionN) {
                if (j13 > j12) {
                    break;
                }
                long jF = this.f86244j.f(aVar2);
                this.f86240f.remove(aVar2.getId());
                if (jF > 0) {
                    i11++;
                    j13 += jF;
                    l lVarE = l.a().j(aVar2.getId()).g(aVar).i(jF).f(jB - j13).e(j11);
                    jk.c cVar = this.f86239e;
                    if (cVar != null) {
                        cVar.c(lVarE);
                    }
                    lVarE.b();
                }
            }
            this.f86248n.c(-j13, -i11);
            this.f86244j.d();
        } catch (IOException e11) {
            this.f86246l.a(jk.a.EnumC1775a.EVICTION, f86232r, "evictAboveSize: " + e11.getMessage(), e11);
            throw e11;
        }
    }

    private Collection<f.a> n(Collection<f.a> collection) {
        long jNow = this.f86249o.now() + f86233s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (f.a aVar : collection) {
            if (aVar.a() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f86245k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f86250p) {
            try {
                boolean zP = p();
                s();
                long jB = this.f86248n.b();
                if (jB > this.f86238d && !zP) {
                    this.f86248n.e();
                    p();
                }
                long j11 = this.f86238d;
                if (jB > j11) {
                    m((j11 * 9) / 10, jk.c.a.CACHE_FULL);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long jNow = this.f86249o.now();
        if (this.f86248n.d()) {
            long j11 = this.f86241g;
            if (j11 != -1 && jNow - j11 <= f86234t) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        boolean z11;
        long j11;
        long jNow = this.f86249o.now();
        long j12 = f86233s + jNow;
        Set<String> hashSet = (this.f86247m && this.f86240f.isEmpty()) ? this.f86240f : this.f86247m ? new HashSet<>() : null;
        try {
            long size = 0;
            long jMax = -1;
            int size2 = 0;
            boolean z12 = false;
            int i11 = 0;
            int i12 = 0;
            z11 = false;
            for (f.a aVar : this.f86244j.getEntries()) {
                try {
                    i11++;
                    size += aVar.getSize();
                    if (aVar.a() > j12) {
                        i12++;
                        size2 = (int) (((long) size2) + aVar.getSize());
                        j11 = j12;
                        jMax = Math.max(aVar.a() - jNow, jMax);
                        z12 = true;
                    } else {
                        j11 = j12;
                        if (this.f86247m) {
                            pk.k.g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j12 = j11;
                } catch (IOException e11) {
                    e = e11;
                    this.f86246l.a(jk.a.EnumC1775a.GENERIC_IO, f86232r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z11;
                }
            }
            if (z12) {
                this.f86246l.a(jk.a.EnumC1775a.READ_INVALID_ENTRY, f86232r, "Future timestamp found in " + i12 + " files , with a total size of " + size2 + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j13 = i11;
            if (this.f86248n.a() != j13 || this.f86248n.b() != size) {
                if (this.f86247m && this.f86240f != hashSet) {
                    pk.k.g(hashSet);
                    this.f86240f.clear();
                    this.f86240f.addAll(hashSet);
                }
                this.f86248n.f(size, j13);
            }
            this.f86241g = jNow;
            return true;
        } catch (IOException e12) {
            e = e12;
            z11 = false;
        }
    }

    private f.b r(String str, jk.d dVar) {
        o();
        return this.f86244j.b(str, dVar);
    }

    private void s() {
        if (this.f86243i.f(this.f86244j.isExternal() ? uk.a.EnumC2508a.EXTERNAL : uk.a.EnumC2508a.INTERNAL, this.f86236b - this.f86248n.b())) {
            this.f86238d = this.f86235a;
        } else {
            this.f86238d = this.f86236b;
        }
    }

    @Override // kk.k
    public void a() {
        synchronized (this.f86250p) {
            try {
                this.f86244j.a();
                this.f86240f.clear();
                jk.c cVar = this.f86239e;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (IOException | NullPointerException e11) {
                this.f86246l.a(jk.a.EnumC1775a.EVICTION, f86232r, "clearAll: " + e11.getMessage(), e11);
            }
            this.f86248n.e();
        }
    }

    @Override // kk.k
    public ik.a b(jk.d dVar, jk.j jVar) {
        String strA;
        l lVarD = l.a().d(dVar);
        jk.c cVar = this.f86239e;
        if (cVar != null) {
            cVar.e(lVarD);
        }
        synchronized (this.f86250p) {
            strA = jk.e.a(dVar);
        }
        lVarD.j(strA);
        try {
            try {
                f.b bVarR = r(strA, dVar);
                try {
                    bVarR.s(jVar, dVar);
                    ik.a aVarL = l(bVarR, dVar, strA);
                    lVarD.i(aVarL.size()).f(this.f86248n.b());
                    jk.c cVar2 = this.f86239e;
                    if (cVar2 != null) {
                        cVar2.g(lVarD);
                    }
                    if (!bVarR.r()) {
                        qk.a.i(f86232r, "Failed to delete temp file");
                    }
                    lVarD.b();
                    return aVarL;
                } catch (Throwable th2) {
                    if (!bVarR.r()) {
                        qk.a.i(f86232r, "Failed to delete temp file");
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                lVarD.h(e11);
                jk.c cVar3 = this.f86239e;
                if (cVar3 != null) {
                    cVar3.a(lVarD);
                }
                qk.a.j(f86232r, "Failed inserting a file into the cache", e11);
                throw e11;
            }
        } catch (Throwable th3) {
            lVarD.b();
            throw th3;
        }
    }

    @Override // kk.k
    public boolean c(jk.d dVar) {
        synchronized (this.f86250p) {
            try {
                List<String> listB = jk.e.b(dVar);
                for (int i11 = 0; i11 < listB.size(); i11++) {
                    if (this.f86240f.contains(listB.get(i11))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kk.k
    public ik.a d(jk.d dVar) {
        ik.a aVarG;
        l lVarD = l.a().d(dVar);
        try {
            try {
                synchronized (this.f86250p) {
                    try {
                        List<String> listB = jk.e.b(dVar);
                        String str = null;
                        aVarG = null;
                        for (int i11 = 0; i11 < listB.size(); i11++) {
                            str = listB.get(i11);
                            lVarD.j(str);
                            aVarG = this.f86244j.g(str, dVar);
                            if (aVarG != null) {
                                break;
                            }
                        }
                        if (aVarG == null) {
                            jk.c cVar = this.f86239e;
                            if (cVar != null) {
                                cVar.h(lVarD);
                            }
                            this.f86240f.remove(str);
                        } else {
                            pk.k.g(str);
                            jk.c cVar2 = this.f86239e;
                            if (cVar2 != null) {
                                cVar2.f(lVarD);
                            }
                            this.f86240f.add(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lVarD.b();
                return aVarG;
            } catch (IOException e11) {
                this.f86246l.a(jk.a.EnumC1775a.GENERIC_IO, f86232r, "getResource", e11);
                lVarD.h(e11);
                jk.c cVar3 = this.f86239e;
                if (cVar3 != null) {
                    cVar3.d(lVarD);
                }
                lVarD.b();
                return null;
            }
        } catch (Throwable th3) {
            lVarD.b();
            throw th3;
        }
    }

    @Override // kk.k
    public void e(jk.d dVar) {
        synchronized (this.f86250p) {
            try {
                List<String> listB = jk.e.b(dVar);
                for (int i11 = 0; i11 < listB.size(); i11++) {
                    String str = listB.get(i11);
                    this.f86244j.remove(str);
                    this.f86240f.remove(str);
                }
            } catch (IOException e11) {
                this.f86246l.a(jk.a.EnumC1775a.DELETE_FILE, f86232r, "delete: " + e11.getMessage(), e11);
            }
        }
    }

    @Override // kk.k
    public boolean f(jk.d dVar) {
        synchronized (this.f86250p) {
            if (c(dVar)) {
                return true;
            }
            try {
                List<String> listB = jk.e.b(dVar);
                for (int i11 = 0; i11 < listB.size(); i11++) {
                    String str = listB.get(i11);
                    if (this.f86244j.c(str, dVar)) {
                        this.f86240f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // kk.k
    public boolean g(jk.d dVar) throws Throwable {
        String str;
        IOException e11;
        String str2 = null;
        try {
            try {
                synchronized (this.f86250p) {
                    try {
                        List<String> listB = jk.e.b(dVar);
                        int i11 = 0;
                        while (i11 < listB.size()) {
                            String str3 = listB.get(i11);
                            if (this.f86244j.e(str3, dVar)) {
                                this.f86240f.add(str3);
                                return true;
                            }
                            i11++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th2) {
                        str = str2;
                        th = th2;
                        try {
                            throw th;
                        } catch (IOException e12) {
                            e11 = e12;
                            l lVarH = l.a().d(dVar).j(str).h(e11);
                            jk.c cVar = this.f86239e;
                            if (cVar != null) {
                                cVar.d(lVarH);
                            }
                            lVarH.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            str = null;
            e11 = e13;
        }
    }
}
