package tj;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C2448a<?>> f114625a = new ArrayList();

    /* JADX INFO: renamed from: tj.a$a, reason: collision with other inner class name */
    private static final class C2448a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f114626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.d<T> f114627b;

        C2448a(@NonNull Class<T> cls, @NonNull dj.d<T> dVar) {
            this.f114626a = cls;
            this.f114627b = dVar;
        }

        boolean a(@NonNull Class<?> cls) {
            return this.f114626a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@NonNull Class<T> cls, @NonNull dj.d<T> dVar) {
        this.f114625a.add(new C2448a<>(cls, dVar));
    }

    public synchronized <T> dj.d<T> b(@NonNull Class<T> cls) {
        for (C2448a<?> c2448a : this.f114625a) {
            if (c2448a.a(cls)) {
                return (dj.d<T>) c2448a.f114627b;
            }
        }
        return null;
    }
}
