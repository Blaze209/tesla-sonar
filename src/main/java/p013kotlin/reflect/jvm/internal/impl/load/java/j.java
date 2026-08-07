package p013kotlin.reflect.jvm.internal.impl.load.java;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f87203a = new j();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(SpecialBuiltinMembers.f((CallableMemberDescriptor) obj));
    }
}
