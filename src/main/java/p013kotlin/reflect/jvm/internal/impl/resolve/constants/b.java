package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntegerLiteralTypeConstructor f88471a;

    public b(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        this.f88471a = integerLiteralTypeConstructor;
    }

    @Override // wn0.a
    public Object invoke() {
        return IntegerLiteralTypeConstructor.e(this.f88471a);
    }
}
