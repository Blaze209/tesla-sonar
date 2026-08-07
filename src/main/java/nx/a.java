package nx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kx.b;
import nx.a.InterfaceC2036a;

/* JADX INFO: loaded from: classes5.dex */
public class a<T extends InterfaceC2036a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kx.a f95488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f95489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<T> f95490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<a<T>> f95491d;

    /* JADX INFO: renamed from: nx.a$a, reason: collision with other inner class name */
    public interface InterfaceC2036a {
        b a();
    }

    public a(kx.a aVar) {
        this(aVar, 0);
    }

    private void b(double d11, double d12, T t11) {
        List<a<T>> list = this.f95491d;
        if (list == null) {
            if (this.f95490c == null) {
                this.f95490c = new LinkedHashSet();
            }
            this.f95490c.add(t11);
            if (this.f95490c.size() <= 50 || this.f95489b >= 40) {
                return;
            }
            e();
            return;
        }
        kx.a aVar = this.f95488a;
        if (d12 < aVar.f89442f) {
            if (d11 < aVar.f89441e) {
                list.get(0).b(d11, d12, t11);
                return;
            } else {
                list.get(1).b(d11, d12, t11);
                return;
            }
        }
        if (d11 < aVar.f89441e) {
            list.get(2).b(d11, d12, t11);
        } else {
            list.get(3).b(d11, d12, t11);
        }
    }

    private void d(kx.a aVar, Collection<T> collection) {
        if (this.f95488a.e(aVar)) {
            List<a<T>> list = this.f95491d;
            if (list != null) {
                Iterator<a<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().d(aVar, collection);
                }
            } else if (this.f95490c != null) {
                if (aVar.b(this.f95488a)) {
                    collection.addAll(this.f95490c);
                    return;
                }
                for (T t11 : this.f95490c) {
                    if (aVar.c(t11.a())) {
                        collection.add(t11);
                    }
                }
            }
        }
    }

    private void e() {
        ArrayList arrayList = new ArrayList(4);
        this.f95491d = arrayList;
        kx.a aVar = this.f95488a;
        arrayList.add(new a(aVar.f89437a, aVar.f89441e, aVar.f89438b, aVar.f89442f, this.f95489b + 1));
        List<a<T>> list = this.f95491d;
        kx.a aVar2 = this.f95488a;
        list.add(new a<>(aVar2.f89441e, aVar2.f89439c, aVar2.f89438b, aVar2.f89442f, this.f95489b + 1));
        List<a<T>> list2 = this.f95491d;
        kx.a aVar3 = this.f95488a;
        list2.add(new a<>(aVar3.f89437a, aVar3.f89441e, aVar3.f89442f, aVar3.f89440d, this.f95489b + 1));
        List<a<T>> list3 = this.f95491d;
        kx.a aVar4 = this.f95488a;
        list3.add(new a<>(aVar4.f89441e, aVar4.f89439c, aVar4.f89442f, aVar4.f89440d, this.f95489b + 1));
        Set<T> set = this.f95490c;
        this.f95490c = null;
        for (T t11 : set) {
            b(t11.a().f89443a, t11.a().f89444b, t11);
        }
    }

    public void a(T t11) {
        b bVarA = t11.a();
        if (this.f95488a.a(bVarA.f89443a, bVarA.f89444b)) {
            b(bVarA.f89443a, bVarA.f89444b, t11);
        }
    }

    public Collection<T> c(kx.a aVar) {
        ArrayList arrayList = new ArrayList();
        d(aVar, arrayList);
        return arrayList;
    }

    private a(double d11, double d12, double d13, double d14, int i11) {
        this(new kx.a(d11, d12, d13, d14), i11);
    }

    private a(kx.a aVar, int i11) {
        this.f95491d = null;
        this.f95488a = aVar;
        this.f95489b = i11;
    }
}
