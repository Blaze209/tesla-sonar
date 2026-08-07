package jj;

import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f83890e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o<Object, Object> f83891f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f83892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f83893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f83894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u5.f<List<Throwable>> f83895d;

    private static class a implements o<Object, Object> {
        a() {
        }

        @Override // jj.o
        public boolean a(@NonNull Object obj) {
            return false;
        }

        @Override // jj.o
        public o.a<Object> b(@NonNull Object obj, int i11, int i12, @NonNull dj.h hVar) {
            return null;
        }
    }

    private static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<Model> f83896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<Data> f83897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p<? extends Model, ? extends Data> f83898c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
            this.f83896a = cls;
            this.f83897b = cls2;
            this.f83898c = pVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f83896a.isAssignableFrom(cls);
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return a(cls) && this.f83897b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        @NonNull
        public <Model, Data> r<Model, Data> a(@NonNull List<o<Model, Data>> list, @NonNull u5.f<List<Throwable>> fVar) {
            return new r<>(list, fVar);
        }
    }

    public s(@NonNull u5.f<List<Throwable>> fVar) {
        this(fVar, f83890e);
    }

    private <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar, boolean z11) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f83892a;
        list.add(z11 ? list.size() : 0, bVar);
    }

    @NonNull
    private <Model, Data> o<Model, Data> e(@NonNull b<?, ?> bVar) {
        return (o) xj.k.d(bVar.f83898c.e(this));
    }

    @NonNull
    private static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f83891f;
    }

    @NonNull
    private <Model, Data> p<Model, Data> h(@NonNull b<?, ?> bVar) {
        return (p<Model, Data>) bVar.f83898c;
    }

    synchronized <Model, Data> void b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    @NonNull
    synchronized <Model> List<o<Model, ?>> c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f83892a) {
                if (!this.f83894c.contains(bVar) && bVar.a(cls)) {
                    this.f83894c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f83894c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f83894c.clear();
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> o<Model, Data> d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z11 = false;
            for (b<?, ?> bVar : this.f83892a) {
                if (this.f83894c.contains(bVar)) {
                    z11 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f83894c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f83894c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f83893b.a(arrayList, this.f83895d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z11) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f83894c.clear();
            throw th2;
        }
    }

    @NonNull
    synchronized List<Class<?>> g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f83892a) {
            if (!arrayList.contains(bVar.f83897b) && bVar.a(cls)) {
                arrayList.add(bVar.f83897b);
            }
        }
        return arrayList;
    }

    @NonNull
    synchronized <Model, Data> List<p<? extends Model, ? extends Data>> i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f83892a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    @NonNull
    synchronized <Model, Data> List<p<? extends Model, ? extends Data>> j(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        List<p<? extends Model, ? extends Data>> listI;
        listI = i(cls, cls2);
        b(cls, cls2, pVar);
        return listI;
    }

    s(@NonNull u5.f<List<Throwable>> fVar, @NonNull c cVar) {
        this.f83892a = new ArrayList();
        this.f83894c = new HashSet();
        this.f83895d = fVar;
        this.f83893b = cVar;
    }
}
