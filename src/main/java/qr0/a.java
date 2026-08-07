package qr0;

import com.squareup.moshi.j;
import com.squareup.moshi.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.h;
import retrofit2.z;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f105923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f105924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f105925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f105926d;

    private a(u uVar, boolean z11, boolean z12, boolean z13) {
        this.f105923a = uVar;
        this.f105924b = z11;
        this.f105925c = z12;
        this.f105926d = z13;
    }

    public static a f() {
        return g(new u.b().d());
    }

    public static a g(u uVar) {
        if (uVar != null) {
            return new a(uVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    private static Set<? extends Annotation> h(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // retrofit2.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, z zVar) {
        com.squareup.moshi.h hVarE = this.f105923a.e(type, h(annotationArr));
        if (this.f105924b) {
            hVarE = hVarE.lenient();
        }
        if (this.f105925c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.f105926d) {
            hVarE = hVarE.serializeNulls();
        }
        return new b(hVarE);
    }

    @Override // retrofit2.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, z zVar) {
        com.squareup.moshi.h hVarE = this.f105923a.e(type, h(annotationArr));
        if (this.f105924b) {
            hVarE = hVarE.lenient();
        }
        if (this.f105925c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.f105926d) {
            hVarE = hVarE.serializeNulls();
        }
        return new c(hVarE);
    }
}
