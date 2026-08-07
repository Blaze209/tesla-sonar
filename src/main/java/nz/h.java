package nz;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h implements pz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<jz.o> f95497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pz.b f95498b = new pz.b();

    public h(Set<jz.o> set) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
        }
        this.f95497a = Collections.unmodifiableSet(set);
    }

    @Override // pz.a
    public pz.b e() {
        return this.f95498b;
    }

    public Set<jz.o> g() {
        return this.f95497a;
    }
}
