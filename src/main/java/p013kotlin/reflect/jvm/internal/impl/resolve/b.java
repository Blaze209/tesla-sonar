package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f88442a = new b();

    @Override // wn0.p
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.i((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
