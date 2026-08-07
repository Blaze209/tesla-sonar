package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f88443a = new c();

    @Override // wn0.p
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.e((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
