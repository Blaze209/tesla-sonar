package p013kotlin.reflect.jvm.internal.impl.builtins;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PrimitiveType f86590a;

    public c(PrimitiveType primitiveType) {
        this.f86590a = primitiveType;
    }

    @Override // wn0.a
    public Object invoke() {
        return PrimitiveType.typeFqName_delegate$lambda$0(this.f86590a);
    }
}
