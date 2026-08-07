package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class q0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ValueParameterDescriptor f87494a;

    public q0(ValueParameterDescriptor valueParameterDescriptor) {
        this.f87494a = valueParameterDescriptor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return SignatureEnhancement.o(this.f87494a, (CallableMemberDescriptor) obj);
    }
}
