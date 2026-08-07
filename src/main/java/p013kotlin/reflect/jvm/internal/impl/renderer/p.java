package p013kotlin.reflect.jvm.internal.impl.renderer;

import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DescriptorRendererImpl f88410a;

    public p(DescriptorRendererImpl descriptorRendererImpl) {
        this.f88410a = descriptorRendererImpl;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.H0(this.f88410a, (KotlinType) obj);
    }
}
