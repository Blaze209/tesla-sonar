package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import p013kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinClassFinder f87565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeserializedDescriptorResolver f87566b;

    public JavaClassDataFinder(KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        s.k(kotlinClassFinder, "kotlinClassFinder");
        s.k(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f87565a = kotlinClassFinder;
        this.f87566b = deserializedDescriptorResolver;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        s.k(classId, "classId");
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f87565a, classId, DeserializationHelpersKt.jvmMetadataVersionOrDefault(this.f87566b.getComponents().getConfiguration()));
        if (kotlinJvmBinaryClassFindKotlinClass == null) {
            return null;
        }
        s.f(kotlinJvmBinaryClassFindKotlinClass.getClassId(), classId);
        return this.f87566b.readClassData$descriptors_jvm(kotlinJvmBinaryClassFindKotlinClass);
    }
}
