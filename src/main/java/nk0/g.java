package nk0;

import io.reactivex.rxjava3.core.h;
import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.y;
import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends retrofit2.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f95109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f95110b;

    private g(t tVar, boolean z11) {
        this.f95109a = tVar;
        this.f95110b = z11;
    }

    public static g a() {
        return new g(null, false);
    }

    @Override // retrofit2.e.a
    public retrofit2.e<?, ?> get(Type type, Annotation[] annotationArr, z zVar) {
        Type parameterUpperBound;
        boolean z11;
        boolean z12;
        String str;
        Class<?> rawType = retrofit2.e.a.getRawType(type);
        if (rawType == io.reactivex.rxjava3.core.b.class) {
            return new f(Void.class, this.f95109a, this.f95110b, false, true, false, false, false, true);
        }
        boolean z13 = rawType == h.class;
        boolean z14 = rawType == u.class;
        boolean z15 = rawType == j.class;
        if (rawType != o.class && !z13 && !z14 && !z15) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z13) {
                str = "Flowable";
            } else if (z14) {
                str = "Single";
            } else {
                str = z15 ? "Maybe" : "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound2 = retrofit2.e.a.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = retrofit2.e.a.getRawType(parameterUpperBound2);
        if (rawType2 == y.class) {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = retrofit2.e.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z12 = false;
            z11 = false;
        } else if (rawType2 != d.class) {
            parameterUpperBound = parameterUpperBound2;
            z11 = true;
            z12 = false;
        } else {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            parameterUpperBound = retrofit2.e.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z12 = true;
            z11 = false;
        }
        return new f(parameterUpperBound, this.f95109a, this.f95110b, z12, z11, z13, z14, z15, false);
    }
}
