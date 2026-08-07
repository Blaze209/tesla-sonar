package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f86687a;

    public m(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f86687a = jvmBuiltInsCustomizer;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.A(this.f86687a, (CallableMemberDescriptor) obj);
    }
}
