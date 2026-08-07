package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class NonEmptyDeserializedAnnotations extends DeserializedAnnotations {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonEmptyDeserializedAnnotations(StorageManager storageManager, a<? extends List<? extends AnnotationDescriptor>> compute) {
        super(storageManager, compute);
        s.k(storageManager, "storageManager");
        s.k(compute, "compute");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations, p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }
}
