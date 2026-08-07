package nz;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
abstract class g implements jz.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<jz.h> f95494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<jz.d> f95495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pz.c f95496c = new pz.c();

    public g(Set<jz.h> set, Set<jz.d> set2) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
        }
        this.f95494a = Collections.unmodifiableSet(set);
        if (set2 == null) {
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        this.f95495b = set2;
    }

    @Override // jz.n
    public Set<jz.d> b() {
        return this.f95495b;
    }

    @Override // jz.n
    public Set<jz.h> c() {
        return this.f95494a;
    }

    public pz.c g() {
        return this.f95496c;
    }
}
