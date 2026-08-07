package p013kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f88975a;

    public c(List list) {
        this.f88975a = list;
    }

    @Override // wn0.a
    public Object invoke() {
        return NewCapturedTypeConstructor.h(this.f88975a);
    }
}
