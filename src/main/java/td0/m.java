package td0;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import ie0.b0;
import io.realm.CompactOnLaunchCallback;
import io.realm.c0;
import io.realm.exceptions.RealmError;
import io.realm.h0;
import io.realm.i0;
import io.realm.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile m f113219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f113220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ThreadPoolExecutor f113221g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.tesla.logging.g f113222a = com.tesla.logging.g.h("RealmHelper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, a> f113225d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f113223b = new i0.a().e("TrealmStorage").f(3).b(new CompactOnLaunchCallback() { // from class: td0.k
        @Override // io.realm.CompactOnLaunchCallback
        public final boolean shouldCompact(long j11, long j12) {
            return m.b(j11, j12);
        }
    }).d(new u()).a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f113224c = s.c();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s0<o> f113226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h0<s0<o>> f113227b;

        private a() {
        }
    }

    static {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1000);
        f113220f = arrayBlockingQueue;
        f113221g = new ThreadPoolExecutor(5, 16, 500L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
    }

    private m() {
    }

    public static /* synthetic */ boolean b(long j11, long j12) {
        return j11 > ((long) 52428800) && ((double) j12) / ((double) j11) < 0.7d;
    }

    private String f(String str, String str2) {
        return str.startsWith("_") ? this.f113224c.a(str2) : str2;
    }

    private String g(String str, String str2) {
        return str.startsWith("_") ? this.f113224c.b(str2) : str2;
    }

    public static m j() {
        if (f113219e == null) {
            synchronized (m.class) {
                try {
                    if (f113219e == null) {
                        f113219e = new m();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f113219e;
    }

    private s0<o> l(String str, c0 c0Var) {
        return c0Var.e1(o.class).i("async_key", str).k();
    }

    private void m(Error error) {
        String message;
        if ((error instanceof RealmError) && (message = error.getMessage()) != null && message.contains("No space left on device")) {
            d.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(String str, String str2, List list, CountDownLatch countDownLatch) {
        String strF = f(str, str2);
        synchronized (list) {
            list.add(new Pair(str, strF));
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(b0 b0Var, String str, s0 s0Var) {
        if (s0Var.size() == 1) {
            b0Var.a(str, f(str, ((o) s0Var.first()).l()));
        } else {
            b0Var.b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Map map, Bundle bundle, String str, CountDownLatch countDownLatch) {
        synchronized (map) {
            map.put(str, g(str, bundle.getString(str)));
        }
        countDownLatch.countDown();
    }

    public boolean e(List<String> list, List<String> list2) {
        try {
            c0 c0VarO0 = c0.O0(this.f113223b);
            try {
                c0VarO0.beginTransaction();
                s0 s0VarK = c0VarO0.e1(o.class).k();
                if (list.size() > 0) {
                    s0VarK = s0VarK.l().p().l("async_key", (String[]) list.toArray(new String[0])).k();
                }
                if (list2.size() > 0) {
                    Iterator<String> it = list2.iterator();
                    while (it.hasNext()) {
                        s0VarK = s0VarK.l().p().c("async_key", it.next()).k();
                    }
                }
                if (s0VarK.size() > 0) {
                    s0VarK.a();
                }
                this.f113222a.a("Clear Values: Keep Keys [" + TextUtils.join(",", list) + "] Keep Prefixes [" + TextUtils.join(",", list2) + "] Success for string items");
                s0 s0VarK2 = c0VarO0.e1(q.class).k();
                if (list.size() > 0) {
                    s0VarK2 = s0VarK2.l().p().l("async_key", (String[]) list.toArray(new String[0])).k();
                }
                if (list2.size() > 0) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        s0VarK2 = s0VarK2.l().p().c("async_key", it2.next()).k();
                    }
                }
                if (s0VarK2.size() > 0) {
                    s0VarK2.a();
                }
                this.f113222a.a("Clear Values: Keep Keys [" + TextUtils.join(",", list) + "] Keep Prefixes [" + TextUtils.join(",", list2) + "] Success for raw items");
                c0VarO0.o();
                c0VarO0.close();
                return true;
            } catch (Throwable th2) {
                if (c0VarO0 != null) {
                    try {
                        c0VarO0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Error e11) {
            this.f113222a.f("Clear Values Error", e11);
            m(e11);
            return false;
        }
    }

    public String h(String str) {
        try {
            c0 c0VarO0 = c0.O0(this.f113223b);
            try {
                s0<o> s0VarL = l(str, c0VarO0);
                if (s0VarL.size() != 1) {
                    this.f113222a.a("Retrieving Value " + str + " Fail");
                    if (c0VarO0 != null) {
                        c0VarO0.close();
                    }
                    return null;
                }
                this.f113222a.a("Retrieving Value " + str + " Success ");
                String strF = f(str, ((o) s0VarL.get(0)).l());
                if (c0VarO0 == null) {
                    return strF;
                }
                c0VarO0.close();
                return strF;
            } catch (Throwable th2) {
                if (c0VarO0 != null) {
                    try {
                        c0VarO0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Error e11) {
            this.f113222a.d("Retrieving Value " + str + " Error", e11);
            m(e11);
            return null;
        } catch (Exception e12) {
            this.f113222a.d("Retrieving Value " + str + " Exception", e12);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[Catch: Exception -> 0x00ea, NoSuchElementException -> 0x00ed, InterruptedException -> 0x00f0, Error -> 0x00f3, SYNTHETIC, TRY_LEAVE, TryCatch #8 {Error -> 0x00f3, InterruptedException -> 0x00f0, NoSuchElementException -> 0x00ed, Exception -> 0x00ea, blocks: (B:52:0x0102, B:51:0x00ff, B:35:0x00e6), top: B:77:0x0011 }] */
    public List<Pair<String, String>> i(List<String> list, List<String> list2) throws Throwable {
        Throwable th2;
        if (list.size() == 0 && list2.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        try {
            try {
                c0 c0VarO0 = c0.O0(this.f113223b);
                try {
                    ArrayList<o> arrayList = new ArrayList();
                    if (list.size() != 0) {
                        try {
                            arrayList.addAll(c0VarO0.u0(c0VarO0.e1(o.class).l("async_key", (String[]) list.toArray(new String[0])).k()));
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (c0VarO0 != null) {
                                throw th2;
                            }
                            try {
                                c0VarO0.close();
                                throw th2;
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                                throw th2;
                            }
                        }
                    }
                    if (list2.size() != 0) {
                        Iterator<String> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.addAll(c0VarO0.u0(c0VarO0.e1(o.class).c("async_key", it.next()).k()));
                        }
                    }
                    this.f113222a.a("Retrieve Values: Keys [" + TextUtils.join(",", list) + "] Prefixes [" + TextUtils.join(",", list2) + "] Success with # of Results " + arrayList.size());
                    final List<Pair<String, String>> listSynchronizedList = Collections.synchronizedList(new ArrayList());
                    final CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                    for (o oVar : arrayList) {
                        final String strK = oVar.k();
                        final String strL = oVar.l();
                        try {
                            f113221g.execute(new Runnable() { // from class: td0.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f113206a.n(strK, strL, listSynchronizedList, countDownLatch);
                                }
                            });
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            if (c0VarO0 != null) {
                                throw th2;
                            }
                            c0VarO0.close();
                            throw th2;
                        }
                    }
                    countDownLatch.await();
                    if (c0VarO0 == null) {
                        return listSynchronizedList;
                    }
                    c0VarO0.close();
                    return listSynchronizedList;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Error e11) {
                e = e11;
                Error error = e;
                this.f113222a.f("Retrieving Values Error", error);
                m(error);
                return Collections.EMPTY_LIST;
            } catch (InterruptedException e12) {
                e = e12;
                this.f113222a.d("Countdown Interrupted", e);
                return Collections.EMPTY_LIST;
            } catch (NoSuchElementException e13) {
                e = e13;
                this.f113222a.d("No Such Element", e);
                return Collections.EMPTY_LIST;
            } catch (Exception e14) {
                e = e14;
                this.f113222a.f("Retrieving Values Exception", e);
                return Collections.EMPTY_LIST;
            }
        } catch (Error e15) {
            e = e15;
            Error error2 = e;
            this.f113222a.f("Retrieving Values Error", error2);
            m(error2);
            return Collections.EMPTY_LIST;
        } catch (InterruptedException e16) {
            e = e16;
            this.f113222a.d("Countdown Interrupted", e);
            return Collections.EMPTY_LIST;
        } catch (NoSuchElementException e17) {
            e = e17;
            this.f113222a.d("No Such Element", e);
            return Collections.EMPTY_LIST;
        } catch (Exception e18) {
            e = e18;
            this.f113222a.f("Retrieving Values Exception", e);
            return Collections.EMPTY_LIST;
        }
    }

    @NonNull
    public List<Pair<String, String>> k() {
        return new ArrayList();
    }

    @NonNull
    public String q(@NonNull final String str, @NonNull final b0 b0Var) {
        String string = UUID.randomUUID().toString();
        try {
            s0<o> s0VarL = l(str, c0.O0(this.f113223b));
            a aVar = new a();
            aVar.f113226a = s0VarL;
            aVar.f113227b = new h0() { // from class: td0.l
                @Override // io.realm.h0
                public final void a(Object obj) {
                    this.f113216a.o(b0Var, str, (s0) obj);
                }
            };
            this.f113225d.put(string, aVar);
            s0VarL.g(aVar.f113227b);
            return string;
        } catch (Exception e11) {
            this.f113222a.f("Failed to observe key " + str, e11);
            return string;
        }
    }

    public boolean r(String str) {
        try {
            c0 c0VarO0 = c0.O0(this.f113223b);
            try {
                c0VarO0.beginTransaction();
                c0VarO0.e1(o.class).i("async_key", str).k().a();
                c0VarO0.e1(q.class).i("async_key", str).k().a();
                this.f113222a.a("Remove Value " + str + " Success");
                c0VarO0.o();
                c0VarO0.close();
                return true;
            } catch (Throwable th2) {
                if (c0VarO0 != null) {
                    try {
                        c0VarO0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Error e11) {
            this.f113222a.f("Remove Value " + str + " Error", e11);
            m(e11);
            return false;
        }
    }

    public boolean s(List<String> list, List<String> list2) {
        int size;
        int i11;
        if (list.isEmpty() && list2.isEmpty()) {
            return true;
        }
        try {
            c0 c0VarO0 = c0.O0(this.f113223b);
            try {
                c0VarO0.beginTransaction();
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    s0 s0VarK = c0VarO0.e1(o.class).l("async_key", (String[]) list.toArray(new String[0])).k();
                    int size2 = s0VarK.size();
                    s0VarK.a();
                    s0 s0VarK2 = c0VarO0.e1(q.class).l("async_key", (String[]) list.toArray(new String[0])).k();
                    size = size2 + s0VarK2.size();
                    s0VarK2.a();
                }
                if (list2.isEmpty()) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    for (String str : list2) {
                        s0 s0VarK3 = c0VarO0.e1(o.class).c("async_key", str).k();
                        int size3 = s0VarK3.size();
                        s0VarK3.a();
                        s0 s0VarK4 = c0VarO0.e1(q.class).c("async_key", str).k();
                        int size4 = s0VarK4.size() + size3;
                        s0VarK4.a();
                        i11 = size4;
                    }
                }
                this.f113222a.a("Remove Values: Keys [" + TextUtils.join(",", list) + "] Deleted: " + size + " Prefixes [" + TextUtils.join(",", list2) + "] Deleted: " + i11 + " Success");
                c0VarO0.o();
                c0VarO0.close();
                return true;
            } catch (Throwable th2) {
                if (c0VarO0 != null) {
                    try {
                        c0VarO0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Error e11) {
            this.f113222a.f("Remove Values Error", e11);
            m(e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
    public boolean t(Bundle bundle) throws Throwable {
        final m mVar;
        Throwable th2;
        c0 c0VarO0 = null;
        try {
            try {
                Set<String> setKeySet = bundle.keySet();
                final Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
                final CountDownLatch countDownLatch = new CountDownLatch(setKeySet.size());
                for (final String str : setKeySet) {
                    mVar = this;
                    final Bundle bundle2 = bundle;
                    try {
                        f113221g.execute(new Runnable() { // from class: td0.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f113211a.p(mapSynchronizedMap, bundle2, str, countDownLatch);
                            }
                        });
                        bundle = bundle2;
                    } catch (Error e11) {
                        e = e11;
                        Error error = e;
                        mVar.f113222a.f("Set Values Error", error);
                        m(error);
                        if (c0VarO0 != null) {
                            c0VarO0.close();
                        }
                        return false;
                    } catch (InterruptedException e12) {
                        e = e12;
                        mVar.f113222a.d("Countdown Interrupted", e);
                        if (c0VarO0 != null) {
                            c0VarO0.close();
                        }
                        return false;
                    }
                }
                mVar = this;
                countDownLatch.await();
                c0VarO0 = c0.O0(mVar.f113223b);
                c0VarO0.beginTransaction();
                for (String str2 : setKeySet) {
                    c0VarO0.z0(new o().m(str2).n((String) mapSynchronizedMap.get(str2)), new io.realm.o[0]);
                }
                c0VarO0.o();
                c0VarO0.close();
                return true;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                if (0 != 0) {
                    throw th2;
                }
                c0VarO0.close();
                throw th2;
            }
        } catch (Error e13) {
            e = e13;
            mVar = this;
        } catch (InterruptedException e14) {
            e = e14;
            mVar = this;
        } catch (Throwable th4) {
            th = th4;
            th2 = th;
            if (0 != 0) {
                throw th2;
            }
            c0VarO0.close();
            throw th2;
        }
    }

    public boolean u(String str, String str2) {
        if (str2 == null) {
            return r(str);
        }
        try {
            c0 c0VarO0 = c0.O0(this.f113223b);
            try {
                c0VarO0.beginTransaction();
                c0VarO0.z0(new o().m(str).n(g(str, str2)), new io.realm.o[0]);
                this.f113222a.a("Set Value " + str + " Success");
                c0VarO0.o();
                c0VarO0.close();
                return true;
            } catch (Throwable th2) {
                if (c0VarO0 != null) {
                    try {
                        c0VarO0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Error e11) {
            this.f113222a.f("Set Value " + str + " Error", e11);
            m(e11);
            return false;
        }
    }

    public void v(String str) {
        a aVarRemove = this.f113225d.remove(str);
        if (aVarRemove != null) {
            aVarRemove.f113226a.k(aVarRemove.f113227b);
        }
    }
}
