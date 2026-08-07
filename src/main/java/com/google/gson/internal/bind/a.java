package com.google.gson.internal.bind;

import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class a<E> extends x<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f44874c = new C0702a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<E> f44875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x<E> f44876b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C0702a implements y {
        C0702a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeG = bx.x.g(type);
            return new a(fVar, fVar.l(com.google.gson.reflect.a.get(typeG)), bx.x.k(typeG));
        }
    }

    public a(com.google.gson.f fVar, x<E> xVar, Class<E> cls) {
        this.f44876b = new o(fVar, xVar, cls);
        this.f44875a = cls;
    }

    @Override // com.google.gson.x
    public Object b(ex.a aVar) throws IOException {
        if (aVar.n0() == ex.b.NULL) {
            aVar.c0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.f();
        while (aVar.hasNext()) {
            arrayList.add(this.f44876b.b(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        if (!this.f44875a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f44875a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f44875a, size);
        for (int i11 = 0; i11 < size; i11++) {
            Array.set(objNewInstance, i11, arrayList.get(i11));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.x
    public void d(ex.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.k0();
            return;
        }
        cVar.p();
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f44876b.d(cVar, (E) Array.get(obj, i11));
        }
        cVar.C();
    }
}
