package p013kotlin.reflect.jvm.internal.impl.types.checker;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NewCapturedTypeConstructor f88976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KotlinTypeRefiner f88977b;

    public d(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f88976a = newCapturedTypeConstructor;
        this.f88977b = kotlinTypeRefiner;
    }

    @Override // wn0.a
    public Object invoke() {
        return NewCapturedTypeConstructor.i(this.f88976a, this.f88977b);
    }
}
