package io.realm;

import io.realm.exceptions.RealmFileException;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Util;
import io.realm.log.RealmLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
final class g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<WeakReference<g0>> f78916f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Collection<g0> f78917g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f78919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i0 f78920c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<en0.a<d, OsSharedRealm.a>, e> f78918a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f78921d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<String> f78922e = new HashSet();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f78923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0 f78924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f78925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f78926d;

        a(File file, i0 i0Var, boolean z11, String str) {
            this.f78923a = file;
            this.f78924b = i0Var;
            this.f78925c = z11;
            this.f78926d = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (this.f78923a != null) {
                g0.c(this.f78924b.c(), this.f78923a);
            }
            if (this.f78925c) {
                g0.c(io.realm.internal.i.c(this.f78924b.t()).f(this.f78924b), new File(this.f78926d));
            }
        }
    }

    interface b {
        void onResult(int i11);
    }

    private static class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.realm.a f78927c;

        private c() {
            super(null);
        }

        @Override // io.realm.g0.e
        public void a() {
            String path = this.f78927c.getPath();
            this.f78928a.set(null);
            this.f78927c = null;
            if (this.f78929b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " not be negative.");
        }

        @Override // io.realm.g0.e
        io.realm.a c() {
            return this.f78927c;
        }

        @Override // io.realm.g0.e
        int d() {
            return this.f78929b.get();
        }

        @Override // io.realm.g0.e
        boolean e() {
            return this.f78927c != null;
        }

        @Override // io.realm.g0.e
        void g(io.realm.a aVar) {
            this.f78927c = aVar;
            this.f78928a.set(0);
            this.f78929b.incrementAndGet();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private enum d {
        TYPED_REALM,
        DYNAMIC_REALM;

        static d valueOf(Class<? extends io.realm.a> cls) {
            if (cls == c0.class) {
                return TYPED_REALM;
            }
            if (cls == h.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    private g0(String str) {
        this.f78919b = str;
    }

    private static void b(i0 i0Var) {
        File file = i0Var.p() ? new File(i0Var.l(), i0Var.m()) : null;
        String strG = io.realm.internal.i.c(i0Var.t()).g(i0Var);
        boolean zF = Util.f(strG);
        boolean z11 = !zF;
        if (file == null && zF) {
            return;
        }
        OsObjectStore.a(i0Var, new a(file, i0Var, z11, strG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[SYNTHETIC] */
    public static void c(String str, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file.exists()) {
            return;
        }
        InputStream inputStream = null;
        e = null;
        inputStream = null;
        try {
            InputStream inputStreamOpen = io.realm.a.f78891h.getAssets().open(str);
            try {
                if (inputStreamOpen == null) {
                    throw new RealmFileException(RealmFileException.Kind.ACCESS_ERROR, "Invalid input stream to the asset file: " + str);
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i11 = inputStreamOpen.read(bArr);
                        if (i11 > -1) {
                            fileOutputStream.write(bArr, 0, i11);
                        } else {
                            try {
                                break;
                            } catch (IOException e11) {
                                e = e11;
                            }
                        }
                    }
                    inputStreamOpen.close();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e12) {
                        if (e == null) {
                            e = e12;
                        }
                    }
                    if (e != null) {
                        throw new RealmFileException(RealmFileException.Kind.ACCESS_ERROR, e);
                    }
                } catch (IOException e13) {
                    e = e13;
                    inputStream = inputStreamOpen;
                    try {
                        throw new RealmFileException(RealmFileException.Kind.ACCESS_ERROR, "Could not resolve the path to the asset file: " + str, e);
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused2) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (IOException e15) {
            e = e15;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    private <E extends io.realm.a> void d(Class<E> cls, e eVar, OsSharedRealm.a aVar) {
        io.realm.a aVarK0;
        if (cls == c0.class) {
            aVarK0 = c0.H0(this, aVar);
            aVarK0.J().d();
        } else {
            if (cls != h.class) {
                throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
            }
            aVarK0 = h.k0(this, aVar);
        }
        eVar.g(aVarK0);
    }

    static <E extends io.realm.a> E e(i0 i0Var, Class<E> cls) {
        return (E) h(i0Var.k(), true).f(i0Var, cls, OsSharedRealm.a.f79041c);
    }

    private synchronized <E extends io.realm.a> E f(i0 i0Var, Class<E> cls, OsSharedRealm.a aVar) {
        E e11;
        try {
            e eVarJ = j(cls, aVar);
            boolean z11 = k() == 0;
            if (z11) {
                b(i0Var);
                boolean zU = i0Var.u();
                if (i0Var.t() && (!zU || this.f78922e.contains(i0Var.k()))) {
                    io.realm.internal.i.e().j(new OsRealmConfig.b(i0Var).b());
                    io.realm.internal.i.e().b(i0Var);
                    this.f78922e.remove(i0Var.k());
                }
                this.f78920c = i0Var;
            } else {
                p(i0Var);
            }
            if (!eVarJ.e()) {
                d(cls, eVarJ, aVar);
            }
            eVarJ.f(1);
            e11 = (E) eVarJ.c();
            if (z11) {
                io.realm.internal.i.e().a(c0.J0(e11.f78899e), i0Var);
                if (!i0Var.r()) {
                    e11.e0();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return e11;
    }

    private synchronized void g(b bVar) {
        bVar.onResult(k());
    }

    private static g0 h(String str, boolean z11) {
        g0 g0Var;
        List<WeakReference<g0>> list = f78916f;
        synchronized (list) {
            try {
                Iterator<WeakReference<g0>> it = list.iterator();
                g0Var = null;
                while (it.hasNext()) {
                    g0 g0Var2 = it.next().get();
                    if (g0Var2 == null) {
                        it.remove();
                    } else if (g0Var2.f78919b.equals(str)) {
                        g0Var = g0Var2;
                    }
                }
                if (g0Var == null && z11) {
                    g0Var = new g0(str);
                    f78916f.add(new WeakReference<>(g0Var));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    private <E extends io.realm.a> e j(Class<E> cls, OsSharedRealm.a aVar) {
        en0.a<d, OsSharedRealm.a> aVar2 = new en0.a<>(d.valueOf((Class<? extends io.realm.a>) cls), aVar);
        e fVar = this.f78918a.get(aVar2);
        if (fVar == null) {
            boolean zEquals = aVar.equals(OsSharedRealm.a.f79041c);
            a aVar3 = null;
            fVar = zEquals ? new f(aVar3) : new c(aVar3);
            this.f78918a.put(aVar2, fVar);
        }
        return fVar;
    }

    private int k() {
        Iterator<e> it = this.f78918a.values().iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += it.next().b();
        }
        return iB;
    }

    private int l() {
        int iB = 0;
        for (e eVar : this.f78918a.values()) {
            if (eVar instanceof f) {
                iB += eVar.b();
            }
        }
        return iB;
    }

    static void m(i0 i0Var, b bVar) {
        synchronized (f78916f) {
            try {
                g0 g0VarH = h(i0Var.k(), false);
                if (g0VarH == null) {
                    bVar.onResult(0);
                } else {
                    g0VarH.g(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p(i0 i0Var) {
        if (this.f78920c.equals(i0Var)) {
            return;
        }
        if (!Arrays.equals(this.f78920c.f(), i0Var.f())) {
            throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
        }
        m0 m0VarI = i0Var.i();
        m0 m0VarI2 = this.f78920c.i();
        if (m0VarI2 != null && m0VarI != null && m0VarI2.getClass().equals(m0VarI.getClass()) && !m0VarI.equals(m0VarI2)) {
            throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: " + i0Var.i().getClass().getCanonicalName());
        }
        throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. \nCached configuration: \n" + this.f78920c + "\n\nNew configuration: \n" + i0Var);
    }

    public i0 i() {
        return this.f78920c;
    }

    void n() {
        if (this.f78921d.getAndSet(true)) {
            return;
        }
        f78917g.add(this);
    }

    synchronized void o(io.realm.a aVar) {
        io.realm.a aVarC;
        try {
            String path = aVar.getPath();
            e eVarJ = j(aVar.getClass(), aVar.b0() ? aVar.f78899e.getVersionID() : OsSharedRealm.a.f79041c);
            int iD = eVarJ.d();
            if (iD <= 0) {
                RealmLog.g("%s has been closed already. refCount is %s", path, Integer.valueOf(iD));
                return;
            }
            int i11 = iD - 1;
            if (i11 == 0) {
                eVarJ.a();
                aVar.t();
                if (l() == 0) {
                    this.f78920c = null;
                    for (e eVar : this.f78918a.values()) {
                        if ((eVar instanceof c) && (aVarC = eVar.c()) != null) {
                            while (!aVarC.isClosed()) {
                                aVarC.close();
                            }
                        }
                    }
                    io.realm.internal.i.c(aVar.I().t()).i(aVar.I());
                }
            } else {
                eVarJ.h(i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static class f extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ThreadLocal<io.realm.a> f78930c;

        private f() {
            super(null);
            this.f78930c = new ThreadLocal<>();
        }

        @Override // io.realm.g0.e
        public void a() {
            String path = this.f78930c.get().getPath();
            this.f78928a.set(null);
            this.f78930c.set(null);
            if (this.f78929b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " can not be negative.");
        }

        @Override // io.realm.g0.e
        public io.realm.a c() {
            return this.f78930c.get();
        }

        @Override // io.realm.g0.e
        public int d() {
            Integer num = this.f78928a.get();
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // io.realm.g0.e
        public boolean e() {
            return this.f78930c.get() != null;
        }

        @Override // io.realm.g0.e
        public void g(io.realm.a aVar) {
            this.f78930c.set(aVar);
            this.f78928a.set(0);
            this.f78929b.incrementAndGet();
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final ThreadLocal<Integer> f78928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected AtomicInteger f78929b;

        private e() {
            this.f78928a = new ThreadLocal<>();
            this.f78929b = new AtomicInteger(0);
        }

        abstract void a();

        public int b() {
            return this.f78929b.get();
        }

        abstract io.realm.a c();

        abstract int d();

        abstract boolean e();

        public void f(int i11) {
            Integer num = this.f78928a.get();
            ThreadLocal<Integer> threadLocal = this.f78928a;
            if (num != null) {
                i11 += num.intValue();
            }
            threadLocal.set(Integer.valueOf(i11));
        }

        abstract void g(io.realm.a aVar);

        public void h(int i11) {
            this.f78928a.set(Integer.valueOf(i11));
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
