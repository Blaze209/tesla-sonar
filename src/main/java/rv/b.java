package rv;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f109219b;

    /* JADX INFO: renamed from: rv.b$b, reason: collision with other inner class name */
    public static final class C2317b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f109220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f109221b = null;

        C2317b(String str) {
            this.f109220a = str;
        }

        @NonNull
        public b a() {
            return new b(this.f109220a, this.f109221b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f109221b)));
        }

        @NonNull
        public <T extends Annotation> C2317b b(@NonNull T t11) {
            if (this.f109221b == null) {
                this.f109221b = new HashMap();
            }
            this.f109221b.put(t11.annotationType(), t11);
            return this;
        }
    }

    @NonNull
    public static C2317b a(@NonNull String str) {
        return new C2317b(str);
    }

    @NonNull
    public static b d(@NonNull String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    @NonNull
    public String b() {
        return this.f109218a;
    }

    public <T extends Annotation> T c(@NonNull Class<T> cls) {
        return (T) this.f109219b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f109218a.equals(bVar.f109218a) && this.f109219b.equals(bVar.f109219b);
    }

    public int hashCode() {
        return (this.f109218a.hashCode() * 31) + this.f109219b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f109218a + ", properties=" + this.f109219b.values() + "}";
    }

    private b(String str, Map<Class<?>, Object> map) {
        this.f109218a = str;
        this.f109219b = map;
    }
}
