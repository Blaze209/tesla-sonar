package retrofit2;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class s extends h.a {

    @IgnoreJRERequirement
    static final class a<T> implements h<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h<ResponseBody, T> f107943a;

        a(h<ResponseBody, T> hVar) {
            this.f107943a = hVar;
        }

        @Override // retrofit2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional<T> convert(ResponseBody responseBody) {
            return Optional.ofNullable(this.f107943a.convert(responseBody));
        }
    }

    s() {
    }

    @Override // retrofit2.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, z zVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(zVar.i(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
