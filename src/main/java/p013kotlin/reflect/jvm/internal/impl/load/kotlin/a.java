package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractBinaryClassAnnotationAndConstantLoader f87608a;

    public a(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader) {
        this.f87608a = abstractBinaryClassAnnotationAndConstantLoader;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractBinaryClassAnnotationAndConstantLoader.v(this.f87608a, (KotlinJvmBinaryClass) obj);
    }
}
