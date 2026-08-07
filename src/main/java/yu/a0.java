package yu;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes5.dex */
public final class a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f125812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f125813b;

    private @interface a {
    }

    public a0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f125812a = cls;
        this.f125813b = cls2;
    }

    @NonNull
    public static <T> a0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new a0<>(cls, cls2);
    }

    @NonNull
    public static <T> a0<T> b(Class<T> cls) {
        return new a0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f125813b.equals(a0Var.f125813b)) {
            return this.f125812a.equals(a0Var.f125812a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f125813b.hashCode() * 31) + this.f125812a.hashCode();
    }

    public String toString() {
        if (this.f125812a == a.class) {
            return this.f125813b.getName();
        }
        return "@" + this.f125812a.getName() + " " + this.f125813b.getName();
    }
}
