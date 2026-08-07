package z0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.g2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final i1 f126155a = d(0, a.INACTIVE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Set<Integer> f126156b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final g2<i1> f126157c = androidx.camera.core.impl.z0.f(d(0, a.ACTIVE));

    enum a {
        ACTIVE,
        INACTIVE
    }

    i1() {
    }

    @NonNull
    static i1 d(int i11, @NonNull a aVar) {
        return new m(i11, aVar, null);
    }

    @NonNull
    static i1 e(int i11, @NonNull a aVar, c0.z1.h hVar) {
        return new m(i11, aVar, hVar);
    }

    public abstract int a();

    public abstract c0.z1.h b();

    @NonNull
    public abstract a c();
}
