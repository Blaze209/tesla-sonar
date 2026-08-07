package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor.a f89014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractTypeConstructor f89015b;

    public j(AbstractTypeConstructor.a aVar, AbstractTypeConstructor abstractTypeConstructor) {
        this.f89014a = aVar;
        this.f89015b = abstractTypeConstructor;
    }

    @Override // wn0.a
    public Object invoke() {
        return AbstractTypeConstructor.a.d(this.f89014a, this.f89015b);
    }
}
