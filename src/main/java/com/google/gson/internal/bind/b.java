package com.google.gson.internal.bind;

import bx.d0;
import bx.v;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f44877a;

    private static final class a<E> extends x<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x<E> f44878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0<? extends Collection<E>> f44879b;

        a(x<E> xVar, d0<? extends Collection<E>> d0Var) {
            this.f44878a = xVar;
            this.f44879b = d0Var;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            Collection<E> collectionConstruct = this.f44879b.construct();
            aVar.f();
            while (aVar.hasNext()) {
                collectionConstruct.add(this.f44878a.b(aVar));
            }
            aVar.e();
            return collectionConstruct;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.k0();
                return;
            }
            cVar.p();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f44878a.d(cVar, it.next());
            }
            cVar.C();
        }
    }

    public b(v vVar) {
        this.f44877a = vVar;
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeH = bx.x.h(type, rawType);
        return new a(new o(fVar, fVar.l(com.google.gson.reflect.a.get(typeH)), typeH), this.f44877a.w(aVar, false));
    }
}
