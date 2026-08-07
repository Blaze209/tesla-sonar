package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class FilteredAnnotations implements Annotations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotations f86744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f86745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<FqName, Boolean> f86746c;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(Annotations delegate, boolean z11, l<? super FqName, Boolean> fqNameFilter) {
        s.k(delegate, "delegate");
        s.k(fqNameFilter, "fqNameFilter");
        this.f86744a = delegate;
        this.f86745b = z11;
        this.f86746c = fqNameFilter;
    }

    private final boolean b(AnnotationDescriptor annotationDescriptor) {
        FqName fqName = annotationDescriptor.getFqName();
        return fqName != null && this.f86746c.invoke(fqName).booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo496findAnnotation(FqName fqName) {
        s.k(fqName, "fqName");
        if (this.f86746c.invoke(fqName).booleanValue()) {
            return this.f86744a.mo496findAnnotation(fqName);
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        s.k(fqName, "fqName");
        if (this.f86746c.invoke(fqName).booleanValue()) {
            return this.f86744a.hasAnnotation(fqName);
        }
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z11;
        Annotations annotations = this.f86744a;
        if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                if (b(it.next())) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        if (this.f86745b) {
            return !z11;
        }
        return z11;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        Annotations annotations = this.f86744a;
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            if (b(annotationDescriptor)) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(Annotations delegate, l<? super FqName, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        s.k(delegate, "delegate");
        s.k(fqNameFilter, "fqNameFilter");
    }
}
