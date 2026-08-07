package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinBuiltIns f86747a;

    public a(KotlinBuiltIns kotlinBuiltIns) {
        this.f86747a = kotlinBuiltIns;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AnnotationUtilKt.b(this.f86747a, (ModuleDescriptor) obj);
    }
}
