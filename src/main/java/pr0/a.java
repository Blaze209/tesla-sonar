package pr0;

import com.google.gson.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.h;
import retrofit2.z;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f103922a;

    private a(f fVar) {
        this.f103922a = fVar;
    }

    public static a f() {
        return g(new f());
    }

    public static a g(f fVar) {
        if (fVar != null) {
            return new a(fVar);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, z zVar) {
        return new b(this.f103922a, this.f103922a.l(com.google.gson.reflect.a.get(type)));
    }

    @Override // retrofit2.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, z zVar) {
        return new c(this.f103922a, this.f103922a.l(com.google.gson.reflect.a.get(type)));
    }
}
