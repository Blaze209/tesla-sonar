package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p013kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractSignatureParts f87463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeSystemContext f87464b;

    public c(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext) {
        this.f87463a = abstractSignatureParts;
        this.f87464b = typeSystemContext;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractSignatureParts.p(this.f87463a, this.f87464b, (AbstractSignatureParts.a) obj);
    }
}
