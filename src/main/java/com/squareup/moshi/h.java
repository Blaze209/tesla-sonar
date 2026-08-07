package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h<T> {

    class a extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f49401a;

        a(h hVar) {
            this.f49401a = hVar;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) {
            return (T) this.f49401a.fromJson(kVar);
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f49401a.isLenient();
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, T t11) {
            boolean zI = rVar.I();
            rVar.u0(true);
            try {
                this.f49401a.toJson(rVar, t11);
            } finally {
                rVar.u0(zI);
            }
        }

        public String toString() {
            return this.f49401a + ".serializeNulls()";
        }
    }

    class b extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f49403a;

        b(h hVar) {
            this.f49403a = hVar;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) {
            boolean zN = kVar.n();
            kVar.P(true);
            try {
                return (T) this.f49403a.fromJson(kVar);
            } finally {
                kVar.P(zN);
            }
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return true;
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, T t11) {
            boolean zJ = rVar.J();
            rVar.P(true);
            try {
                this.f49403a.toJson(rVar, t11);
            } finally {
                rVar.P(zJ);
            }
        }

        public String toString() {
            return this.f49403a + ".lenient()";
        }
    }

    class c extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f49405a;

        c(h hVar) {
            this.f49405a = hVar;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) {
            boolean zC = kVar.c();
            kVar.c0(true);
            try {
                return (T) this.f49405a.fromJson(kVar);
            } finally {
                kVar.c0(zC);
            }
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f49405a.isLenient();
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, T t11) {
            this.f49405a.toJson(rVar, t11);
        }

        public String toString() {
            return this.f49405a + ".failOnUnknown()";
        }
    }

    class d extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f49407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49408b;

        d(h hVar, String str) {
            this.f49407a = hVar;
            this.f49408b = str;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) {
            return (T) this.f49407a.fromJson(kVar);
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f49407a.isLenient();
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, T t11) {
            String strH = rVar.H();
            rVar.t0(this.f49408b);
            try {
                this.f49407a.toJson(rVar, t11);
            } finally {
                rVar.t0(strH);
            }
        }

        public String toString() {
            return this.f49407a + ".indent(\"" + this.f49408b + "\")";
        }
    }

    public interface e {
        h<?> create(Type type, Set<? extends Annotation> set, u uVar);
    }

    public final h<T> failOnUnknown() {
        return new c(this);
    }

    public abstract T fromJson(k kVar);

    public final T fromJson(okio.j jVar) {
        return fromJson(k.t(jVar));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new o(obj));
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public h<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    boolean isLenient() {
        return false;
    }

    public final h<T> lenient() {
        return new b(this);
    }

    public final h<T> nonNull() {
        return this instanceof v20.a ? this : new v20.a(this);
    }

    public final h<T> nullSafe() {
        return this instanceof v20.b ? this : new v20.b(this);
    }

    public final h<T> serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(r rVar, T t11);

    public final void toJson(okio.i iVar, T t11) {
        toJson(r.e0(iVar), t11);
    }

    public final Object toJsonValue(T t11) {
        q qVar = new q();
        try {
            toJson(qVar, t11);
            return qVar.T0();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public final T fromJson(String str) {
        k kVarT = k.t(new okio.h().l2(str));
        T tFromJson = fromJson(kVarT);
        if (isLenient() || kVarT.B() == k.c.END_DOCUMENT) {
            return tFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final String toJson(T t11) {
        okio.h hVar = new okio.h();
        try {
            toJson(hVar, t11);
            return hVar.t1();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}
