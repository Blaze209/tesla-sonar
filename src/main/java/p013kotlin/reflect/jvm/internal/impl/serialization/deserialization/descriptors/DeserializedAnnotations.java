package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import co0.m;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public class DeserializedAnnotations implements Annotations {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f88671b = {o0.k(new f0(o0.b(DeserializedAnnotations.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NotNullLazyValue f88672a;

    public DeserializedAnnotations(StorageManager storageManager, a<? extends List<? extends AnnotationDescriptor>> compute) {
        s.k(storageManager, "storageManager");
        s.k(compute, "compute");
        this.f88672a = storageManager.createLazyValue(compute);
    }

    private final List<AnnotationDescriptor> b() {
        return (List) StorageKt.getValue(this.f88672a, this, (m<?>) f88671b[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo496findAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.findAnnotation(this, fqName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return b().iterator();
    }
}
