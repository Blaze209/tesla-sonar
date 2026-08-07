package jj;

import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f83877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f83878b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C1774a<?>> f83879a = new HashMap();

        /* JADX INFO: renamed from: jj.q$a$a, reason: collision with other inner class name */
        private static class C1774a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List<o<Model, ?>> f83880a;

            public C1774a(List<o<Model, ?>> list) {
                this.f83880a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f83879a.clear();
        }

        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C1774a<?> c1774a = this.f83879a.get(cls);
            if (c1774a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c1774a.f83880a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f83879a.put(cls, new C1774a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public q(@NonNull u5.f<List<Throwable>> fVar) {
        this(new s(fVar));
    }

    @NonNull
    private static <A> Class<A> b(@NonNull A a11) {
        return (Class<A>) a11.getClass();
    }

    @NonNull
    private synchronized <A> List<o<A, ?>> e(@NonNull Class<A> cls) {
        List<o<A, ?>> listB;
        listB = this.f83878b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f83877a.c(cls));
            this.f83878b.c(cls, listB);
        }
        return listB;
    }

    private <Model, Data> void g(@NonNull List<p<? extends Model, ? extends Data>> list) {
        Iterator<p<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        this.f83877a.b(cls, cls2, pVar);
        this.f83878b.a();
    }

    @NonNull
    public synchronized List<Class<?>> c(@NonNull Class<?> cls) {
        return this.f83877a.g(cls);
    }

    @NonNull
    public <A> List<o<A, ?>> d(@NonNull A a11) {
        List<o<A, ?>> listE = e(b(a11));
        if (listE.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a11);
        }
        int size = listE.size();
        List<o<A, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            o<A, ?> oVar = listE.get(i11);
            if (oVar.a(a11)) {
                if (z11) {
                    arrayList = new ArrayList<>(size - i11);
                    z11 = false;
                }
                arrayList.add(oVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a11, listE);
        }
        return arrayList;
    }

    public synchronized <Model, Data> void f(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        g(this.f83877a.j(cls, cls2, pVar));
        this.f83878b.a();
    }

    private q(@NonNull s sVar) {
        this.f83878b = new a();
        this.f83877a = sVar;
    }
}
