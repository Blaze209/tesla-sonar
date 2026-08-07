package u20;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b<T> implements h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Class<T> f115312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f115313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<String> f115314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<Type> f115315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final h<Object> f115316e;

    class a extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f115317a;

        a(Object obj) {
            this.f115317a = obj;
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(k kVar) {
            kVar.F();
            return this.f115317a;
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, Object obj) {
            throw new IllegalArgumentException("Expected one of " + b.this.f115315d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    /* JADX INFO: renamed from: u20.b$b, reason: collision with other inner class name */
    static final class C2468b extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f115319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<String> f115320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<Type> f115321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<h<Object>> f115322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final h<Object> f115323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final k.b f115324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final k.b f115325g;

        C2468b(String str, List<String> list, List<Type> list2, List<h<Object>> list3, h<Object> hVar) {
            this.f115319a = str;
            this.f115320b = list;
            this.f115321c = list2;
            this.f115322d = list3;
            this.f115323e = hVar;
            this.f115324f = k.b.a(str);
            this.f115325g = k.b.a((String[]) list.toArray(new String[0]));
        }

        private int a(k kVar) {
            kVar.h();
            while (kVar.hasNext()) {
                if (kVar.T(this.f115324f) != -1) {
                    int iB0 = kVar.b0(this.f115325g);
                    if (iB0 != -1 || this.f115323e != null) {
                        return iB0;
                    }
                    throw new JsonDataException("Expected one of " + this.f115320b + " for key '" + this.f115319a + "' but found '" + kVar.O() + "'. Register a subtype for this label.");
                }
                kVar.e0();
                kVar.F();
            }
            throw new JsonDataException("Missing label for " + this.f115319a);
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(k kVar) throws IOException {
            k kVarC = kVar.C();
            kVarC.c0(false);
            try {
                int iA = a(kVarC);
                kVarC.close();
                return iA == -1 ? this.f115323e.fromJson(kVar) : this.f115322d.get(iA).fromJson(kVar);
            } catch (Throwable th2) {
                kVarC.close();
                throw th2;
            }
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, Object obj) {
            h<Object> hVar;
            int iIndexOf = this.f115321c.indexOf(obj.getClass());
            if (iIndexOf == -1) {
                hVar = this.f115323e;
                if (hVar == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f115321c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                hVar = this.f115322d.get(iIndexOf);
            }
            rVar.o();
            if (hVar != this.f115323e) {
                rVar.b0(this.f115319a).G0(this.f115320b.get(iIndexOf));
            }
            int iN = rVar.n();
            hVar.toJson(rVar, obj);
            rVar.B(iN);
            rVar.C();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f115319a + ")";
        }
    }

    b(Class<T> cls, String str, List<String> list, List<Type> list2, h<Object> hVar) {
        this.f115312a = cls;
        this.f115313b = str;
        this.f115314c = list;
        this.f115315d = list2;
        this.f115316e = hVar;
    }

    private h<Object> a(T t11) {
        return new a(t11);
    }

    public static <T> b<T> b(Class<T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        }
        if (str == null) {
            throw new NullPointerException("labelKey == null");
        }
        List list = Collections.EMPTY_LIST;
        return new b<>(cls, str, list, list, null);
    }

    public b<T> c(T t11) {
        return d(a(t11));
    }

    @Override // com.squareup.moshi.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, u uVar) {
        if (y.g(type) != this.f115312a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f115315d.size());
        int size = this.f115315d.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(uVar.d(this.f115315d.get(i11)));
        }
        return new C2468b(this.f115313b, this.f115314c, this.f115315d, arrayList, this.f115316e).nullSafe();
    }

    public b<T> d(h<Object> hVar) {
        return new b<>(this.f115312a, this.f115313b, this.f115314c, this.f115315d, hVar);
    }

    public b<T> e(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.f115314c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.f115314c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f115315d);
        arrayList2.add(cls);
        return new b<>(this.f115312a, this.f115313b, arrayList, arrayList2, this.f115316e);
    }
}
