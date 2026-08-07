package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Cache {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashSet<File> f9239l = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f9240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f9241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f9242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f9243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<Cache.a>> f9244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Random f9245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f9248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Cache.CacheException f9250k;

    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f9251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f9251a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (h.this) {
                this.f9251a.open();
                h.this.p();
                h.this.f9241b.d();
            }
        }
    }

    public h(File file, b bVar, u7.a aVar) {
        this(file, bVar, aVar, null, false, false);
    }

    private void k(i iVar) {
        this.f9242c.k(iVar.f121092a).a(iVar);
        this.f9248i += iVar.f121094c;
        t(iVar);
    }

    private static void m(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        t.d("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    private static long n(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private i o(String str, long j11, long j12) {
        i iVarD;
        e eVarF = this.f9242c.f(str);
        if (eVarF == null) {
            return i.g(str, j11, j12);
        }
        while (true) {
            iVarD = eVarF.d(j11, j12);
            if (!iVarD.f121095d || ((File) s7.a.f(iVarD.f121096e)).length() == iVarD.f121094c) {
                break;
            }
            y();
        }
        return iVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!this.f9240a.exists()) {
            try {
                m(this.f9240a);
            } catch (Cache.CacheException e11) {
                this.f9250k = e11;
                return;
            }
        }
        File[] fileArrListFiles = this.f9240a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f9240a;
            t.d("SimpleCache", str);
            this.f9250k = new Cache.CacheException(str);
            return;
        }
        long jR = r(fileArrListFiles);
        this.f9247h = jR;
        if (jR == -1) {
            try {
                this.f9247h = n(this.f9240a);
            } catch (IOException e12) {
                String str2 = "Failed to create cache UID: " + this.f9240a;
                t.e("SimpleCache", str2, e12);
                this.f9250k = new Cache.CacheException(str2, e12);
                return;
            }
        }
        try {
            this.f9242c.l(this.f9247h);
            d dVar = this.f9243d;
            if (dVar != null) {
                dVar.e(this.f9247h);
                Map<String, c> mapB = this.f9243d.b();
                q(this.f9240a, true, fileArrListFiles, mapB);
                this.f9243d.g(mapB.keySet());
            } else {
                q(this.f9240a, true, fileArrListFiles, null);
            }
            this.f9242c.p();
            try {
                this.f9242c.q();
            } catch (IOException e13) {
                t.e("SimpleCache", "Storing index file failed", e13);
            }
        } catch (IOException e14) {
            String str3 = "Failed to initialize cache indices: " + this.f9240a;
            t.e("SimpleCache", str3, e14);
            this.f9250k = new Cache.CacheException(str3, e14);
        }
    }

    private void q(File file, boolean z11, File[] fileArr, Map<String, c> map) {
        long j11;
        long j12;
        if (fileArr == null || fileArr.length == 0) {
            if (z11) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z11 && name.indexOf(46) == -1) {
                q(file2, false, file2.listFiles(), map);
            } else if (!z11 || (!f.m(name) && !name.endsWith(".uid"))) {
                c cVarRemove = map != null ? map.remove(name) : null;
                if (cVarRemove != null) {
                    j11 = cVarRemove.f9208a;
                    j12 = cVarRemove.f9209b;
                } else {
                    j11 = -1;
                    j12 = -9223372036854775807L;
                }
                i iVarE = i.e(file2, j11, j12, this.f9242c);
                if (iVarE != null) {
                    k(iVarE);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long r(File[] fileArr) {
        int length = fileArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            File file = fileArr[i11];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return w(name);
                } catch (NumberFormatException unused) {
                    t.d("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean s(File file) {
        return f9239l.add(file.getAbsoluteFile());
    }

    private void t(i iVar) {
        ArrayList<Cache.a> arrayList = this.f9244e.get(iVar.f121092a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).e(this, iVar);
            }
        }
        this.f9241b.e(this, iVar);
    }

    private void u(w7.c cVar) {
        ArrayList<Cache.a> arrayList = this.f9244e.get(cVar.f121092a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).f(this, cVar);
            }
        }
        this.f9241b.f(this, cVar);
    }

    private void v(i iVar, w7.c cVar) {
        ArrayList<Cache.a> arrayList = this.f9244e.get(iVar.f121092a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).c(this, iVar, cVar);
            }
        }
        this.f9241b.c(this, iVar, cVar);
    }

    private static long w(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void x(w7.c cVar) {
        e eVarF = this.f9242c.f(cVar.f121092a);
        if (eVarF == null || !eVarF.j(cVar)) {
            return;
        }
        this.f9248i -= cVar.f121094c;
        if (this.f9243d != null) {
            String name = ((File) s7.a.f(cVar.f121096e)).getName();
            try {
                this.f9243d.f(name);
            } catch (IOException unused) {
                t.i("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f9242c.n(eVarF.f9214b);
        u(cVar);
    }

    private void y() {
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = this.f9242c.g().iterator();
        while (it.hasNext()) {
            for (i iVar : it.next().e()) {
                if (((File) s7.a.f(iVar.f121096e)).length() != iVar.f121094c) {
                    arrayList.add(iVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x((w7.c) arrayList.get(i11));
        }
    }

    private i z(String str, i iVar) {
        boolean z11;
        if (!this.f9246g) {
            return iVar;
        }
        String name = ((File) s7.a.f(iVar.f121096e)).getName();
        long j11 = iVar.f121094c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        d dVar = this.f9243d;
        if (dVar != null) {
            try {
                dVar.h(name, j11, jCurrentTimeMillis);
            } catch (IOException unused) {
                t.i("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z11 = false;
        } else {
            z11 = true;
        }
        i iVarK = ((e) s7.a.f(this.f9242c.f(str))).k(iVar, jCurrentTimeMillis, z11);
        v(iVar, iVarK);
        return iVarK;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void a(w7.c cVar) {
        s7.a.h(!this.f9249j);
        e eVar = (e) s7.a.f(this.f9242c.f(cVar.f121092a));
        eVar.l(cVar.f121093b);
        this.f9242c.n(eVar.f9214b);
        notifyAll();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized w7.d b(String str) {
        s7.a.h(!this.f9249j);
        return this.f9242c.h(str);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:? -> B:10:0x001e). Please report as a decompilation issue!!! */
    @Override // androidx.media3.datasource.cache.Cache
    public synchronized w7.c c(String str, long j11, long j12) throws Throwable {
        try {
            s7.a.h(!this.f9249j);
            l();
            while (true) {
                w7.c cVarE = e(str, j11, j12);
                long j13 = j12;
                long j14 = j11;
                String str2 = str;
                if (cVarE != null) {
                    return cVarE;
                }
                try {
                    wait();
                    str = str2;
                    j11 = j14;
                    j12 = j13;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized File d(String str, long j11, long j12) throws Throwable {
        Throwable th2;
        try {
            try {
                s7.a.h(!this.f9249j);
                l();
                e eVarF = this.f9242c.f(str);
                s7.a.f(eVarF);
                s7.a.h(eVarF.g(j11, j12));
                if (!this.f9240a.exists()) {
                    try {
                        m(this.f9240a);
                        y();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f9241b.b(this, str, j11, j12);
                File file = new File(this.f9240a, Integer.toString(this.f9245f.nextInt(10)));
                if (!file.exists()) {
                    m(file);
                }
                return i.i(file, eVarF.f9213a, j11, System.currentTimeMillis());
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized w7.c e(String str, long j11, long j12) throws Throwable {
        try {
            try {
                s7.a.h(!this.f9249j);
                l();
                i iVarO = o(str, j11, j12);
                if (iVarO.f121095d) {
                    return z(str, iVarO);
                }
                if (this.f9242c.k(str).i(j11, iVarO.f121094c)) {
                    return iVarO;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void f(w7.c cVar) {
        s7.a.h(!this.f9249j);
        x(cVar);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void g(String str, w7.e eVar) {
        s7.a.h(!this.f9249j);
        l();
        this.f9242c.d(str, eVar);
        try {
            this.f9242c.q();
        } catch (IOException e11) {
            throw new Cache.CacheException(e11);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void h(File file, long j11) {
        boolean z11 = true;
        s7.a.h(!this.f9249j);
        if (file.exists()) {
            if (j11 == 0) {
                file.delete();
                return;
            }
            i iVar = (i) s7.a.f(i.f(file, j11, this.f9242c));
            e eVar = (e) s7.a.f(this.f9242c.f(iVar.f121092a));
            s7.a.h(eVar.g(iVar.f121093b, iVar.f121094c));
            long jA = w7.d.a(eVar.c());
            if (jA != -1) {
                if (iVar.f121093b + iVar.f121094c > jA) {
                    z11 = false;
                }
                s7.a.h(z11);
            }
            if (this.f9243d == null) {
                k(iVar);
                this.f9242c.q();
                notifyAll();
                return;
            }
            try {
                this.f9243d.h(file.getName(), iVar.f121094c, iVar.f121097f);
                k(iVar);
                try {
                    this.f9242c.q();
                    notifyAll();
                    return;
                } catch (IOException e11) {
                    throw new Cache.CacheException(e11);
                }
            } catch (IOException e12) {
                throw new Cache.CacheException(e12);
            }
            throw th;
        }
    }

    public synchronized void l() {
        Cache.CacheException cacheException = this.f9250k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public h(File file, b bVar, u7.a aVar, byte[] bArr, boolean z11, boolean z12) {
        this(file, bVar, new f(aVar, file, bArr, z11, z12), (aVar == null || z12) ? null : new d(aVar));
    }

    h(File file, b bVar, f fVar, d dVar) {
        if (s(file)) {
            this.f9240a = file;
            this.f9241b = bVar;
            this.f9242c = fVar;
            this.f9243d = dVar;
            this.f9244e = new HashMap<>();
            this.f9245f = new Random();
            this.f9246g = bVar.a();
            this.f9247h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
