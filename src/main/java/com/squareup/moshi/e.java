package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
abstract class e<C extends Collection<T>, T> extends h<C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h.e f49399b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<T> f49400a;

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, u uVar) {
            Class<?> clsG = y.g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsG == List.class || clsG == Collection.class) {
                return e.b(type, uVar).nullSafe();
            }
            if (clsG == Set.class) {
                return e.d(type, uVar).nullSafe();
            }
            return null;
        }
    }

    class b extends e<Collection<T>, T> {
        b(h hVar) {
            super(hVar, null);
        }

        @Override // com.squareup.moshi.e
        Collection<T> c() {
            return new ArrayList();
        }

        @Override // com.squareup.moshi.h
        public /* bridge */ /* synthetic */ Object fromJson(k kVar) {
            return super.a(kVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.h
        public /* bridge */ /* synthetic */ void toJson(r rVar, Object obj) {
            super.e(rVar, (Collection) obj);
        }
    }

    class c extends e<Set<T>, T> {
        c(h hVar) {
            super(hVar, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set<T> c() {
            return new LinkedHashSet();
        }

        @Override // com.squareup.moshi.h
        public /* bridge */ /* synthetic */ Object fromJson(k kVar) {
            return super.a(kVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.h
        public /* bridge */ /* synthetic */ void toJson(r rVar, Object obj) {
            super.e(rVar, (Collection) obj);
        }
    }

    /* synthetic */ e(h hVar, a aVar) {
        this(hVar);
    }

    static <T> h<Collection<T>> b(Type type, u uVar) {
        return new b(uVar.d(y.c(type, Collection.class)));
    }

    static <T> h<Set<T>> d(Type type, u uVar) {
        return new c(uVar.d(y.c(type, Collection.class)));
    }

    public C a(k kVar) {
        C c11 = (C) c();
        kVar.f();
        while (kVar.hasNext()) {
            c11.add(this.f49400a.fromJson(kVar));
        }
        kVar.e();
        return c11;
    }

    abstract C c();

    public void e(r rVar, C c11) {
        rVar.c();
        Iterator it = c11.iterator();
        while (it.hasNext()) {
            this.f49400a.toJson(rVar, (T) it.next());
        }
        rVar.t();
    }

    public String toString() {
        return this.f49400a + ".collection()";
    }

    private e(h<T> hVar) {
        this.f49400a = hVar;
    }
}
