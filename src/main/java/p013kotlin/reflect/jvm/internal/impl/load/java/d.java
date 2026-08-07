package p013kotlin.reflect.jvm.internal.impl.load.java;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f87197a = new d();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.e((CallableMemberDescriptor) obj));
    }
}
