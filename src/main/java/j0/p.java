package j0;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class p<V> implements s<List<V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<? extends s<? extends V>> f82323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<V> f82324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f82325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final AtomicInteger f82326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final s<List<V>> f82327e = androidx.concurrent.futures.c.a(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.concurrent.futures.c.a<List<V>> f82328f;

    class a implements androidx.concurrent.futures.c.InterfaceC0146c<List<V>> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0146c
        public Object a(@NonNull androidx.concurrent.futures.c.a<List<V>> aVar) {
            u5.h.j(p.this.f82328f == null, "The result can only set once!");
            p.this.f82328f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.f82324b = null;
            pVar.f82323a = null;
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f82331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f82332b;

        c(int i11, s sVar) {
            this.f82331a = i11;
            this.f82332b = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f(this.f82331a, this.f82332b);
        }
    }

    p(@NonNull List<? extends s<? extends V>> list, boolean z11, @NonNull Executor executor) {
        this.f82323a = (List) u5.h.g(list);
        this.f82324b = new ArrayList(list.size());
        this.f82325c = z11;
        this.f82326d = new AtomicInteger(list.size());
        e(executor);
    }

    private void a() throws InterruptedException {
        List<? extends s<? extends V>> list = this.f82323a;
        if (list == null || isDone()) {
            return;
        }
        for (s<? extends V> sVar : list) {
            while (!sVar.isDone()) {
                try {
                    sVar.get();
                } catch (Error e11) {
                    throw e11;
                } catch (InterruptedException e12) {
                    throw e12;
                } catch (Throwable unused) {
                    if (this.f82325c) {
                        return;
                    }
                }
            }
        }
    }

    private void e(@NonNull Executor executor) {
        b(new b(), i0.c.b());
        if (this.f82323a.isEmpty()) {
            this.f82328f.c(new ArrayList(this.f82324b));
            return;
        }
        for (int i11 = 0; i11 < this.f82323a.size(); i11++) {
            this.f82324b.add(null);
        }
        List<? extends s<? extends V>> list = this.f82323a;
        for (int i12 = 0; i12 < list.size(); i12++) {
            s<? extends V> sVar = list.get(i12);
            sVar.b(new c(i12, sVar), executor);
        }
    }

    @Override // com.google.common.util.concurrent.s
    public void b(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f82327e.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws InterruptedException {
        a();
        return this.f82327e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        List<? extends s<? extends V>> list = this.f82323a;
        if (list != null) {
            Iterator<? extends s<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z11);
            }
        }
        return this.f82327e.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j11, @NonNull TimeUnit timeUnit) {
        return this.f82327e.get(j11, timeUnit);
    }

    void f(int i11, @NonNull Future<? extends V> future) {
        androidx.concurrent.futures.c.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.f82324b;
        if (isDone() || list == null) {
            u5.h.j(this.f82325c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            u5.h.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i11, (V) n.m(future));
                            int iDecrementAndGet = this.f82326d.decrementAndGet();
                            u5.h.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List<V> list2 = this.f82324b;
                                if (list2 != null) {
                                    this.f82328f.c(new ArrayList(list2));
                                } else {
                                    u5.h.i(isDone());
                                }
                            }
                        } catch (ExecutionException e11) {
                            if (this.f82325c) {
                                this.f82328f.f(e11.getCause());
                            }
                            int iDecrementAndGet2 = this.f82326d.decrementAndGet();
                            u5.h.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List<V> list3 = this.f82324b;
                                if (list3 != null) {
                                    aVar = this.f82328f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                u5.h.i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f82325c) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f82326d.decrementAndGet();
                        u5.h.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List<V> list4 = this.f82324b;
                            if (list4 != null) {
                                aVar = this.f82328f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            u5.h.i(isDone());
                        }
                    }
                } catch (Error e12) {
                    this.f82328f.f(e12);
                    int iDecrementAndGet4 = this.f82326d.decrementAndGet();
                    u5.h.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List<V> list5 = this.f82324b;
                        if (list5 != null) {
                            aVar = this.f82328f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        u5.h.i(isDone());
                    }
                }
            } catch (RuntimeException e13) {
                if (this.f82325c) {
                    this.f82328f.f(e13);
                }
                int iDecrementAndGet5 = this.f82326d.decrementAndGet();
                u5.h.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List<V> list6 = this.f82324b;
                    if (list6 != null) {
                        aVar = this.f82328f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    u5.h.i(isDone());
                }
            }
        } catch (Throwable th2) {
            int iDecrementAndGet6 = this.f82326d.decrementAndGet();
            u5.h.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.f82324b;
                if (list7 != null) {
                    this.f82328f.c(new ArrayList(list7));
                } else {
                    u5.h.i(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f82327e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f82327e.isDone();
    }
}
