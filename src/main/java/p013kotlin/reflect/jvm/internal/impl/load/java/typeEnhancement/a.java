package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractSignatureParts f87457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractSignatureParts.a f87458b;

    public a(AbstractSignatureParts abstractSignatureParts, AbstractSignatureParts.a aVar) {
        this.f87457a = abstractSignatureParts;
        this.f87458b = aVar;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractSignatureParts.h(this.f87457a, this.f87458b, obj));
    }
}
