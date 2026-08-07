package p013kotlin.reflect.jvm.internal.impl.renderer;

import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DescriptorRendererImpl f88408a;

    public n(DescriptorRendererImpl descriptorRendererImpl) {
        this.f88408a = descriptorRendererImpl;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.E(this.f88408a, (TypeProjection) obj);
    }
}
