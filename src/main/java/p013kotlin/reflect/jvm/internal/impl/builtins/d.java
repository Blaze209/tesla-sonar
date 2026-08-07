package p013kotlin.reflect.jvm.internal.impl.builtins;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PrimitiveType f86591a;

    public d(PrimitiveType primitiveType) {
        this.f86591a = primitiveType;
    }

    @Override // wn0.a
    public Object invoke() {
        return PrimitiveType.arrayTypeFqName_delegate$lambda$1(this.f86591a);
    }
}
