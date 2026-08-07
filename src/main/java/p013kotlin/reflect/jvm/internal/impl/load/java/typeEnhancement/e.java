package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
final class e implements Annotations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FqName f87468a;

    public e(FqName fqNameToMatch) {
        s.k(fqNameToMatch, "fqNameToMatch");
        this.f87468a = fqNameToMatch;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d mo496findAnnotation(FqName fqName) {
        s.k(fqName, "fqName");
        if (s.f(fqName, this.f87468a)) {
            return d.f87466a;
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return v.m().iterator();
    }
}
