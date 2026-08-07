package p013kotlin.reflect.jvm.internal.impl.descriptors;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NotFoundClasses f86753a;

    public d(NotFoundClasses notFoundClasses) {
        this.f86753a = notFoundClasses;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return NotFoundClasses.c(this.f86753a, (NotFoundClasses.a) obj);
    }
}
