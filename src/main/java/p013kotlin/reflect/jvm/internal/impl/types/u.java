package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class u implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StarProjectionImpl f89046a;

    public u(StarProjectionImpl starProjectionImpl) {
        this.f89046a = starProjectionImpl;
    }

    @Override // wn0.a
    public Object invoke() {
        return StarProjectionImpl.a(this.f89046a);
    }
}
