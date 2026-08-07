package p013kotlin.reflect.jvm.internal.impl.load.java;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleFunctionDescriptor f87161a;

    public b(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        this.f87161a = simpleFunctionDescriptor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.b(this.f87161a, (CallableMemberDescriptor) obj));
    }
}
