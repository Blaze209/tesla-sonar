package com.google.gson.internal.bind;

import bx.d0;
import bx.h0;
import bx.v;
import bx.z;
import com.adyen.checkout.components.core.Address;
import com.google.gson.JsonSyntaxException;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f44900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f44901b;

    private final class a<K, V> extends x<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x<K> f44902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x<V> f44903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d0<? extends Map<K, V>> f44904c;

        a(x<K> xVar, x<V> xVar2, d0<? extends Map<K, V>> d0Var) {
            this.f44902a = xVar;
            this.f44903b = xVar2;
            this.f44904c = d0Var;
        }

        private String e(com.google.gson.l lVar) {
            if (!lVar.j()) {
                if (lVar.h()) {
                    return Address.ADDRESS_NULL_PLACEHOLDER;
                }
                throw new AssertionError();
            }
            com.google.gson.p pVarD = lVar.d();
            if (pVarD.r()) {
                return String.valueOf(pVarD.o());
            }
            if (pVarD.p()) {
                return Boolean.toString(pVarD.m());
            }
            if (pVarD.s()) {
                return pVarD.f();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(ex.a aVar) throws IOException {
            ex.b bVarN0 = aVar.n0();
            if (bVarN0 == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            Map<K, V> mapConstruct = this.f44904c.construct();
            if (bVarN0 != ex.b.BEGIN_ARRAY) {
                aVar.h();
                while (aVar.hasNext()) {
                    z.f18226a.a(aVar);
                    K kB = this.f44902a.b(aVar);
                    if (mapConstruct.put(kB, this.f44903b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + kB);
                    }
                }
                aVar.j();
                return mapConstruct;
            }
            aVar.f();
            while (aVar.hasNext()) {
                aVar.f();
                K kB2 = this.f44902a.b(aVar);
                if (mapConstruct.put(kB2, this.f44903b.b(aVar)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + kB2);
                }
                aVar.e();
            }
            aVar.e();
            return mapConstruct;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.k0();
                return;
            }
            if (!i.this.f44901b) {
                cVar.t();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.c0(String.valueOf(entry.getKey()));
                    this.f44903b.d(cVar, entry.getValue());
                }
                cVar.H();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i11 = 0;
            boolean z11 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.l lVarC = this.f44902a.c(entry2.getKey());
                arrayList.add(lVarC);
                arrayList2.add(entry2.getValue());
                z11 |= lVarC.g() || lVarC.i();
            }
            if (!z11) {
                cVar.t();
                int size = arrayList.size();
                while (i11 < size) {
                    cVar.c0(e((com.google.gson.l) arrayList.get(i11)));
                    this.f44903b.d(cVar, (V) arrayList2.get(i11));
                    i11++;
                }
                cVar.H();
                return;
            }
            cVar.p();
            int size2 = arrayList.size();
            while (i11 < size2) {
                cVar.p();
                h0.b((com.google.gson.l) arrayList.get(i11), cVar);
                this.f44903b.d(cVar, (V) arrayList2.get(i11));
                cVar.C();
                i11++;
            }
            cVar.C();
        }
    }

    public i(v vVar, boolean z11) {
        this.f44900a = vVar;
        this.f44901b = z11;
    }

    private x<?> b(com.google.gson.f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? p.f44962f : fVar.l(com.google.gson.reflect.a.get(type));
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] typeArrJ = bx.x.j(type, rawType);
        Type type2 = typeArrJ[0];
        Type type3 = typeArrJ[1];
        return new a(new o(fVar, b(fVar, type2), type2), new o(fVar, fVar.l(com.google.gson.reflect.a.get(type3)), type3), this.f44900a.w(aVar, false));
    }
}
