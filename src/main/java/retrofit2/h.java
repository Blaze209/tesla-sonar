package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes10.dex */
public interface h<F, T> {

    public static abstract class a {
        protected static Type a(int i11, ParameterizedType parameterizedType) {
            return d0.g(i11, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return d0.h(type);
        }

        public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, z zVar) {
            return null;
        }

        public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, z zVar) {
            return null;
        }

        public h<?, String> e(Type type, Annotation[] annotationArr, z zVar) {
            return null;
        }
    }

    T convert(F f11);
}
