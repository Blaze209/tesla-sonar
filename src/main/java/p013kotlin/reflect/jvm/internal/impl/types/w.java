package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class w implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f89048a;

    public w(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f89048a = typeParameterUpperBoundEraser;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return TypeParameterUpperBoundEraser.e(this.f89048a, (TypeParameterUpperBoundEraser.a) obj);
    }
}
