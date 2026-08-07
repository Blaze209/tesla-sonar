package tj;

import androidx.annotation.NonNull;
import dj.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?>> f114639a = new ArrayList();

    private static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f114640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k<T> f114641b;

        a(@NonNull Class<T> cls, @NonNull k<T> kVar) {
            this.f114640a = cls;
            this.f114641b = kVar;
        }

        boolean a(@NonNull Class<?> cls) {
            return this.f114640a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@NonNull Class<Z> cls, @NonNull k<Z> kVar) {
        this.f114639a.add(new a<>(cls, kVar));
    }

    public synchronized <Z> k<Z> b(@NonNull Class<Z> cls) {
        int size = this.f114639a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a<?> aVar = this.f114639a.get(i11);
            if (aVar.a(cls)) {
                return (k<Z>) aVar.f114641b;
            }
        }
        return null;
    }
}
