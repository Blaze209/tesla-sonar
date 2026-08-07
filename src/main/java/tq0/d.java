package tq0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pq0.h;
import pq0.m;
import pq0.n;
import sq0.r;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<uq0.e> f114921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<vq0.a> f114922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f114923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<e> f114924d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<uq0.e> f114925a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<vq0.a> f114926b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<e> f114927c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set<Class<? extends sq0.a>> f114928d = h.q();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f114929e;

        class a implements c {
            a() {
            }

            @Override // tq0.c
            public tq0.a a(tq0.b bVar) {
                return new n(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c g() {
            c cVar = this.f114929e;
            return cVar != null ? cVar : new a();
        }

        public d f() {
            return new d(this);
        }
    }

    private h a() {
        return new h(this.f114921a, this.f114923c, this.f114922b);
    }

    private r c(r rVar) {
        Iterator<e> it = this.f114924d.iterator();
        while (it.hasNext()) {
            rVar = it.next().a(rVar);
        }
        return rVar;
    }

    public r b(String str) {
        if (str != null) {
            return c(a().s(str));
        }
        throw new NullPointerException("input must not be null");
    }

    private d(b bVar) {
        this.f114921a = h.j(bVar.f114925a, bVar.f114928d);
        c cVarG = bVar.g();
        this.f114923c = cVarG;
        this.f114924d = bVar.f114927c;
        List<vq0.a> list = bVar.f114926b;
        this.f114922b = list;
        cVarG.a(new m(list, Collections.EMPTY_MAP));
    }
}
