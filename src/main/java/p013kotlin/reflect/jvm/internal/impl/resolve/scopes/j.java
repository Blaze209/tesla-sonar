package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f88548a = new j();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return TypeIntersectionScope.e((CallableDescriptor) obj);
    }
}
