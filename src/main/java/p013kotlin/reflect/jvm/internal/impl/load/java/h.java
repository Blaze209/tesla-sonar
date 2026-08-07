package p013kotlin.reflect.jvm.internal.impl.load.java;

import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NullabilityAnnotationStatesImpl f87201a;

    public h(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl) {
        this.f87201a = nullabilityAnnotationStatesImpl;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return NullabilityAnnotationStatesImpl.b(this.f87201a, (FqName) obj);
    }
}
