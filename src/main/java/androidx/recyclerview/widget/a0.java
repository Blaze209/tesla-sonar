package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.x0;
import androidx.core.util.Pools$SimplePool;

/* JADX INFO: loaded from: classes3.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final x0<RecyclerView.g0, a> f13346a = new x0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.collection.v<RecyclerView.g0> f13347b = new androidx.collection.v<>();

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static u5.f<a> f13348d = new Pools$SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.n.c f13350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.n.c f13351c;

        private a() {
        }

        static void a() {
            while (f13348d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f13348d.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f13349a = 0;
            aVar.f13350b = null;
            aVar.f13351c = null;
            f13348d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.g0 g0Var, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void b(RecyclerView.g0 g0Var);

        void c(RecyclerView.g0 g0Var, @NonNull RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void d(RecyclerView.g0 g0Var, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2);
    }

    a0() {
    }

    private RecyclerView.n.c l(RecyclerView.g0 g0Var, int i11) {
        a aVarM;
        RecyclerView.n.c cVar;
        int iE = this.f13346a.e(g0Var);
        if (iE >= 0 && (aVarM = this.f13346a.m(iE)) != null) {
            int i12 = aVarM.f13349a;
            if ((i12 & i11) != 0) {
                int i13 = (~i11) & i12;
                aVarM.f13349a = i13;
                if (i11 == 4) {
                    cVar = aVarM.f13350b;
                } else {
                    if (i11 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM.f13351c;
                }
                if ((i13 & 12) == 0) {
                    this.f13346a.k(iE);
                    a.c(aVarM);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.g0 g0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f13346a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f13346a.put(g0Var, aVarB);
        }
        aVarB.f13349a |= 2;
        aVarB.f13350b = cVar;
    }

    void b(RecyclerView.g0 g0Var) {
        a aVarB = this.f13346a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f13346a.put(g0Var, aVarB);
        }
        aVarB.f13349a |= 1;
    }

    void c(long j11, RecyclerView.g0 g0Var) {
        this.f13347b.h(j11, g0Var);
    }

    void d(RecyclerView.g0 g0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f13346a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f13346a.put(g0Var, aVarB);
        }
        aVarB.f13351c = cVar;
        aVarB.f13349a |= 8;
    }

    void e(RecyclerView.g0 g0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f13346a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f13346a.put(g0Var, aVarB);
        }
        aVarB.f13350b = cVar;
        aVarB.f13349a |= 4;
    }

    void f() {
        this.f13346a.clear();
        this.f13347b.a();
    }

    RecyclerView.g0 g(long j11) {
        return this.f13347b.d(j11);
    }

    boolean h(RecyclerView.g0 g0Var) {
        a aVar = this.f13346a.get(g0Var);
        return (aVar == null || (aVar.f13349a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.g0 g0Var) {
        a aVar = this.f13346a.get(g0Var);
        return (aVar == null || (aVar.f13349a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.g0 g0Var) {
        p(g0Var);
    }

    RecyclerView.n.c m(RecyclerView.g0 g0Var) {
        return l(g0Var, 8);
    }

    RecyclerView.n.c n(RecyclerView.g0 g0Var) {
        return l(g0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.f13346a.getSize() - 1; size >= 0; size--) {
            RecyclerView.g0 g0VarI = this.f13346a.i(size);
            a aVarK = this.f13346a.k(size);
            int i11 = aVarK.f13349a;
            if ((i11 & 3) == 3) {
                bVar.b(g0VarI);
            } else if ((i11 & 1) != 0) {
                RecyclerView.n.c cVar = aVarK.f13350b;
                if (cVar == null) {
                    bVar.b(g0VarI);
                } else {
                    bVar.c(g0VarI, cVar, aVarK.f13351c);
                }
            } else if ((i11 & 14) == 14) {
                bVar.a(g0VarI, aVarK.f13350b, aVarK.f13351c);
            } else if ((i11 & 12) == 12) {
                bVar.d(g0VarI, aVarK.f13350b, aVarK.f13351c);
            } else if ((i11 & 4) != 0) {
                bVar.c(g0VarI, aVarK.f13350b, null);
            } else if ((i11 & 8) != 0) {
                bVar.a(g0VarI, aVarK.f13350b, aVarK.f13351c);
            }
            a.c(aVarK);
        }
    }

    void p(RecyclerView.g0 g0Var) {
        a aVar = this.f13346a.get(g0Var);
        if (aVar == null) {
            return;
        }
        aVar.f13349a &= -2;
    }

    void q(RecyclerView.g0 g0Var) {
        for (int iK = this.f13347b.k() - 1; iK >= 0; iK--) {
            if (g0Var == this.f13347b.l(iK)) {
                this.f13347b.j(iK);
                break;
            }
        }
        a aVarRemove = this.f13346a.remove(g0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
