package tj;

import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import qj.g;
import xj.j;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q<?, ?, ?> f114629c = new q<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.a<j, q<?, ?, ?>> f114630a = new androidx.collection.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<j> f114631b = new AtomicReference<>();

    private j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f114631b.getAndSet(null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f114630a) {
            qVar = (q) this.f114630a.get(jVarB);
        }
        this.f114631b.set(jVarB);
        return qVar;
    }

    public boolean c(q<?, ?, ?> qVar) {
        return f114629c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, q<?, ?, ?> qVar) {
        synchronized (this.f114630a) {
            androidx.collection.a<j, q<?, ?, ?>> aVar = this.f114630a;
            j jVar = new j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f114629c;
            }
            aVar.put(jVar, qVar);
        }
    }
}
