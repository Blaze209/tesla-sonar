package uv;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, rv.c<?>> f116733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, rv.e<?>> f116734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rv.c<Object> f116735c;

    public static final class a implements sv.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.c<Object> f116736d = new rv.c() { // from class: uv.g
            @Override // rv.c
            public final void encode(Object obj, Object obj2) {
                h.a.a(obj, (rv.d) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, rv.c<?>> f116737a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, rv.e<?>> f116738b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private rv.c<Object> f116739c = f116736d;

        public static /* synthetic */ void a(Object obj, rv.d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f116737a), new HashMap(this.f116738b), this.f116739c);
        }

        @NonNull
        public a c(@NonNull sv.a aVar) {
            aVar.configure(this);
            return this;
        }

        @Override // sv.b
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <U> a registerEncoder(@NonNull Class<U> cls, @NonNull rv.c<? super U> cVar) {
            this.f116737a.put(cls, cVar);
            this.f116738b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, rv.c<?>> map, Map<Class<?>, rv.e<?>> map2, rv.c<Object> cVar) {
        this.f116733a = map;
        this.f116734b = map2;
        this.f116735c = cVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new f(outputStream, this.f116733a, this.f116734b, this.f116735c).o(obj);
    }

    @NonNull
    public byte[] c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
