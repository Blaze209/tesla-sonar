package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
final class b extends h<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h.e f49379c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f49380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<Object> f49381b;

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, u uVar) {
            Type typeA = y.a(type);
            if (typeA != null && set.isEmpty()) {
                return new b(y.g(typeA), uVar.d(typeA)).nullSafe();
            }
            return null;
        }
    }

    b(Class<?> cls, h<Object> hVar) {
        this.f49380a = cls;
        this.f49381b = hVar;
    }

    @Override // com.squareup.moshi.h
    public Object fromJson(k kVar) {
        ArrayList arrayList = new ArrayList();
        kVar.f();
        while (kVar.hasNext()) {
            arrayList.add(this.f49381b.fromJson(kVar));
        }
        kVar.e();
        Object objNewInstance = Array.newInstance(this.f49380a, arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Array.set(objNewInstance, i11, arrayList.get(i11));
        }
        return objNewInstance;
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, Object obj) {
        rVar.c();
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f49381b.toJson(rVar, Array.get(obj, i11));
        }
        rVar.t();
    }

    public String toString() {
        return this.f49381b + ".array()";
    }
}
