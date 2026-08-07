package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntersectionTypeConstructor f89018a;

    public m(IntersectionTypeConstructor intersectionTypeConstructor) {
        this.f89018a = intersectionTypeConstructor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.d(this.f89018a, (KotlinTypeRefiner) obj);
    }
}
