package tj;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xj.j;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<j> f114632a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<j, List<Class<?>>> f114633b = new androidx.collection.a<>();

    public List<Class<?>> a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f114632a.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f114633b) {
            list = this.f114633b.get(andSet);
        }
        this.f114632a.set(andSet);
        return list;
    }

    public void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f114633b) {
            this.f114633b.put(new j(cls, cls2, cls3), list);
        }
    }
}
