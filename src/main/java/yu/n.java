package yu;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class n implements d, qv.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final yv.b<Set<Object>> f125849i = new yv.b() { // from class: yu.j
        @Override // yv.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<c<?>, yv.b<?>> f125850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<a0<?>, yv.b<?>> f125851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<a0<?>, u<?>> f125852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<yv.b<ComponentRegistrar>> f125853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f125854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f125855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f125856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f125857h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f125858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<yv.b<ComponentRegistrar>> f125859b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<c<?>> f125860c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i f125861d = i.f125842a;

        b(Executor executor) {
            this.f125858a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f125860c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f125859b.add(new yv.b() { // from class: yu.o
                @Override // yv.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<yv.b<ComponentRegistrar>> collection) {
            this.f125859b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f125858a, this.f125859b, this.f125860c, this.f125861d);
        }

        public b f(i iVar) {
            this.f125861d = iVar;
            return this;
        }
    }

    public static /* synthetic */ Object j(n nVar, c cVar) {
        nVar.getClass();
        return cVar.h().a(new b0(cVar, nVar));
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<yv.b<ComponentRegistrar>> it = this.f125853d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f125857h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e11) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e11);
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                for (Object obj : it2.next().j().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f125854e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f125854e.add(obj.toString());
                    }
                }
            }
            if (this.f125850a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f125850a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f125850a.put(cVar, new t(new yv.b() { // from class: yu.k
                    @Override // yv.b
                    public final Object get() {
                        return n.j(this.f125843a, cVar);
                    }
                }));
            }
            arrayList.addAll(t(list));
            arrayList.addAll(u());
            s();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        r();
    }

    private void o(Map<c<?>, yv.b<?>> map, boolean z11) {
        for (Map.Entry<c<?>, yv.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            yv.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z11)) {
                value.get();
            }
        }
        this.f125855f.e();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void r() {
        Boolean bool = this.f125856g.get();
        if (bool != null) {
            o(this.f125850a, bool.booleanValue());
        }
    }

    private void s() {
        for (c<?> cVar : this.f125850a.keySet()) {
            for (q qVar : cVar.g()) {
                if (qVar.g() && !this.f125852c.containsKey(qVar.c())) {
                    this.f125852c.put(qVar.c(), u.b(Collections.EMPTY_SET));
                } else if (this.f125851b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", cVar, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f125851b.put(qVar.c(), y.e());
                    }
                }
            }
        }
    }

    private List<Runnable> t(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final yv.b<?> bVar = this.f125850a.get(cVar);
                for (a0<? super Object> a0Var : cVar.j()) {
                    if (this.f125851b.containsKey(a0Var)) {
                        final y yVar = (y) this.f125851b.get(a0Var);
                        arrayList.add(new Runnable() { // from class: yu.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                yVar.g(bVar);
                            }
                        });
                    } else {
                        this.f125851b.put(a0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> u() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<c<?>, yv.b<?>> entry : this.f125850a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                yv.b<?> value = entry.getValue();
                for (a0<? super Object> a0Var : key.j()) {
                    if (!map.containsKey(a0Var)) {
                        map.put(a0Var, new HashSet());
                    }
                    ((Set) map.get(a0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f125852c.containsKey(entry2.getKey())) {
                final u<?> uVar = this.f125852c.get(entry2.getKey());
                for (final yv.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: yu.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f125852c.put((a0) entry2.getKey(), u.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // yu.d
    public synchronized <T> yv.b<Set<T>> c(a0<T> a0Var) {
        u<?> uVar = this.f125852c.get(a0Var);
        if (uVar != null) {
            return uVar;
        }
        return (yv.b<Set<T>>) f125849i;
    }

    @Override // yu.d
    public synchronized <T> yv.b<T> e(a0<T> a0Var) {
        z.c(a0Var, "Null interface requested.");
        return (yv.b) this.f125851b.get(a0Var);
    }

    @Override // yu.d
    public <T> yv.a<T> g(a0<T> a0Var) {
        yv.b<T> bVarE = e(a0Var);
        if (bVarE == null) {
            return y.e();
        }
        return bVarE instanceof y ? (y) bVarE : y.f(bVarE);
    }

    public void p(boolean z11) {
        HashMap map;
        if (androidx.camera.view.i.a(this.f125856g, null, Boolean.valueOf(z11))) {
            synchronized (this) {
                map = new HashMap(this.f125850a);
            }
            o(map, z11);
        }
    }

    private n(Executor executor, Iterable<yv.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f125850a = new HashMap();
        this.f125851b = new HashMap();
        this.f125852c = new HashMap();
        this.f125854e = new HashSet();
        this.f125856g = new AtomicReference<>();
        s sVar = new s(executor);
        this.f125855f = sVar;
        this.f125857h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.q(sVar, s.class, vv.d.class, vv.c.class));
        arrayList.add(c.q(this, qv.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f125853d = q(iterable);
        n(arrayList);
    }
}
