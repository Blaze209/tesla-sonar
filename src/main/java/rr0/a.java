package rr0;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.h;
import retrofit2.z;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtensionRegistryLite f109067a;

    private a(ExtensionRegistryLite extensionRegistryLite) {
        this.f109067a = extensionRegistryLite;
    }

    public static a f() {
        return new a(null);
    }

    @Override // retrofit2.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, z zVar) {
        if ((type instanceof Class) && MessageLite.class.isAssignableFrom((Class) type)) {
            return new b();
        }
        return null;
    }

    @Override // retrofit2.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, z zVar) {
        Parser parser;
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!MessageLite.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            try {
                parser = (Parser) cls.getDeclaredMethod("parser", null).invoke(null, null);
            } catch (IllegalAccessException | NoSuchFieldException e11) {
                throw new IllegalArgumentException("Found a protobuf message but " + cls.getName() + " had no parser() method or PARSER field.", e11);
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            parser = (Parser) cls.getDeclaredField("PARSER").get(null);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12.getCause());
        }
        return new c(parser, this.f109067a);
    }
}
