package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes10.dex */
public interface e<R, T> {

    public static abstract class a {
        protected static Type getParameterUpperBound(int i11, ParameterizedType parameterizedType) {
            return d0.g(i11, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return d0.h(type);
        }

        public abstract e<?, ?> get(Type type, Annotation[] annotationArr, z zVar);
    }

    T adapt(d<R> dVar);

    Type responseType();
}
