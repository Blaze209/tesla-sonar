package p013kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Set;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f88980a;

    public g(Set set) {
        this.f88980a = set;
    }

    @Override // wn0.a
    public Object invoke() {
        return TypeIntersector.d(this.f88980a);
    }
}
