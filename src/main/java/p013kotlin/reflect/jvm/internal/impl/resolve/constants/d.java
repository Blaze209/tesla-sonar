package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinType f88473a;

    public d(KotlinType kotlinType) {
        this.f88473a = kotlinType;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return TypedArrayValue.a(this.f88473a, (ModuleDescriptor) obj);
    }
}
