package p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f88485a;

    public d(boolean z11) {
        this.f88485a = z11;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return DescriptorUtilsKt.h(this.f88485a, (CallableMemberDescriptor) obj);
    }
}
