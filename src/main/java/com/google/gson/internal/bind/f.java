package com.google.gson.internal.bind;

import bx.a0;
import com.google.gson.x;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class f extends x<com.google.gson.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f f44893a = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44894a;

        static {
            int[] iArr = new int[ex.b.values().length];
            f44894a = iArr;
            try {
                iArr[ex.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44894a[ex.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44894a[ex.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44894a[ex.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44894a[ex.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44894a[ex.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private f() {
    }

    private com.google.gson.l f(ex.a aVar, ex.b bVar) throws IOException {
        int i11 = a.f44894a[bVar.ordinal()];
        if (i11 == 3) {
            return new com.google.gson.p(aVar.O());
        }
        if (i11 == 4) {
            return new com.google.gson.p(new a0(aVar.O()));
        }
        if (i11 == 5) {
            return new com.google.gson.p(Boolean.valueOf(aVar.nextBoolean()));
        }
        if (i11 == 6) {
            aVar.c0();
            return com.google.gson.m.f45010a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private com.google.gson.l g(ex.a aVar, ex.b bVar) throws IOException {
        int i11 = a.f44894a[bVar.ordinal()];
        if (i11 == 1) {
            aVar.f();
            return new com.google.gson.i();
        }
        if (i11 != 2) {
            return null;
        }
        aVar.h();
        return new com.google.gson.n();
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.google.gson.l b(ex.a aVar) throws IOException {
        if (aVar instanceof g) {
            return ((g) aVar).K0();
        }
        ex.b bVarN0 = aVar.n0();
        com.google.gson.l lVarG = g(aVar, bVarN0);
        if (lVarG == null) {
            return f(aVar, bVarN0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String strL = lVarG instanceof com.google.gson.n ? aVar.L() : null;
                ex.b bVarN1 = aVar.n0();
                com.google.gson.l lVarG2 = g(aVar, bVarN1);
                boolean z11 = lVarG2 != null;
                if (lVarG2 == null) {
                    lVarG2 = f(aVar, bVarN1);
                }
                if (lVarG instanceof com.google.gson.i) {
                    ((com.google.gson.i) lVarG).k(lVarG2);
                } else {
                    ((com.google.gson.n) lVarG).k(strL, lVarG2);
                }
                if (z11) {
                    arrayDeque.addLast(lVarG);
                    lVarG = lVarG2;
                }
            } else {
                if (lVarG instanceof com.google.gson.i) {
                    aVar.e();
                } else {
                    aVar.j();
                }
                if (arrayDeque.isEmpty()) {
                    return lVarG;
                }
                lVarG = (com.google.gson.l) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(ex.c cVar, com.google.gson.l lVar) throws IOException {
        if (lVar == null || lVar.h()) {
            cVar.k0();
            return;
        }
        if (lVar.j()) {
            com.google.gson.p pVarD = lVar.d();
            if (pVarD.r()) {
                cVar.K0(pVarD.o());
                return;
            } else if (pVarD.p()) {
                cVar.P0(pVarD.m());
                return;
            } else {
                cVar.O0(pVarD.f());
                return;
            }
        }
        if (lVar.g()) {
            cVar.p();
            Iterator<com.google.gson.l> it = lVar.a().iterator();
            while (it.hasNext()) {
                d(cVar, it.next());
            }
            cVar.C();
            return;
        }
        if (!lVar.i()) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        cVar.t();
        for (Map.Entry<String, com.google.gson.l> entry : lVar.b().m()) {
            cVar.c0(entry.getKey());
            d(cVar, entry.getValue());
        }
        cVar.H();
    }
}
