package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class v implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f89047a;

    public v(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f89047a = typeParameterUpperBoundEraser;
    }

    @Override // wn0.a
    public Object invoke() {
        return TypeParameterUpperBoundEraser.c(this.f89047a);
    }
}
