package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PrimitiveType f88470a;

    public a(PrimitiveType primitiveType) {
        this.f88470a = primitiveType;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return ConstantValueFactory.c(this.f88470a, (ModuleDescriptor) obj);
    }
}
