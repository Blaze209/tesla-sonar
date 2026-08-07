package p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeProjection f88451a;

    public a(TypeProjection typeProjection) {
        this.f88451a = typeProjection;
    }

    @Override // wn0.a
    public Object invoke() {
        return CapturedTypeConstructorKt.c(this.f88451a);
    }
}
