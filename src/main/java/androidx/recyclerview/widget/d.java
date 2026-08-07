package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Executor f13361h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f13362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f13363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Executor f13364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b<T>> f13365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<T> f13366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private List<T> f13367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f13368g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f13369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f13370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f13372d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C0219a extends h.b {
            C0219a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean a(int i11, int i12) {
                Object obj = a.this.f13369a.get(i11);
                Object obj2 = a.this.f13370b.get(i12);
                if (obj != null && obj2 != null) {
                    return d.this.f13363b.b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean b(int i11, int i12) {
                Object obj = a.this.f13369a.get(i11);
                Object obj2 = a.this.f13370b.get(i12);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f13363b.b().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public Object c(int i11, int i12) {
                Object obj = a.this.f13369a.get(i11);
                Object obj2 = a.this.f13370b.get(i12);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f13363b.b().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int d() {
                return a.this.f13370b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int e() {
                return a.this.f13369a.size();
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h.e f13375a;

            b(h.e eVar) {
                this.f13375a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f13368g == aVar.f13371c) {
                    dVar.c(aVar.f13370b, this.f13375a, aVar.f13372d);
                }
            }
        }

        a(List list, List list2, int i11, Runnable runnable) {
            this.f13369a = list;
            this.f13370b = list2;
            this.f13371c = i11;
            this.f13372d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f13364c.execute(new b(h.b(new C0219a())));
        }
    }

    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    private static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f13377a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f13377a.post(runnable);
        }
    }

    public d(@NonNull RecyclerView.h hVar, @NonNull h.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new androidx.recyclerview.widget.c.a(fVar).a());
    }

    private void d(@NonNull List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f13365d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f13367f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(@NonNull b<T> bVar) {
        this.f13365d.add(bVar);
    }

    @NonNull
    public List<T> b() {
        return this.f13367f;
    }

    void c(@NonNull List<T> list, @NonNull h.e eVar, Runnable runnable) {
        List<T> list2 = this.f13367f;
        this.f13366e = list;
        this.f13367f = Collections.unmodifiableList(list);
        eVar.b(this.f13362a);
        d(list2, runnable);
    }

    public void e(List<T> list) {
        f(list, null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i11 = this.f13368g + 1;
        this.f13368g = i11;
        List<T> list2 = this.f13366e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f13367f;
        if (list == null) {
            int size = list2.size();
            this.f13366e = null;
            this.f13367f = Collections.EMPTY_LIST;
            this.f13362a.c(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f13363b.a().execute(new a(list2, list, i11, runnable));
            return;
        }
        this.f13366e = list;
        this.f13367f = Collections.unmodifiableList(list);
        this.f13362a.b(0, list.size());
        d(list3, runnable);
    }

    public d(@NonNull r rVar, @NonNull androidx.recyclerview.widget.c<T> cVar) {
        this.f13365d = new CopyOnWriteArrayList();
        this.f13367f = Collections.EMPTY_LIST;
        this.f13362a = rVar;
        this.f13363b = cVar;
        if (cVar.c() != null) {
            this.f13364c = cVar.c();
        } else {
            this.f13364c = f13361h;
        }
    }
}
