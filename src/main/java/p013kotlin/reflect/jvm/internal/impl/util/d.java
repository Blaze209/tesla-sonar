package p013kotlin.reflect.jvm.internal.impl.util;

import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f89085a = new d();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return OperatorChecks.e((FunctionDescriptor) obj);
    }
}
