package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f88546a = new h();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return TypeIntersectionScope.f((SimpleFunctionDescriptor) obj);
    }
}
