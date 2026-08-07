package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NotFoundClasses f86752a;

    public c(NotFoundClasses notFoundClasses) {
        this.f86752a = notFoundClasses;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return NotFoundClasses.d(this.f86752a, (FqName) obj);
    }
}
