package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import ho0.i;
import ho0.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class CompositeAnnotations implements Annotations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Annotations> f86743a;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(List<? extends Annotations> delegates) {
        s.k(delegates, "delegates");
        this.f86743a = delegates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationDescriptor e(FqName fqName, Annotations it) {
        s.k(it, "it");
        return it.mo496findAnnotation(fqName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i h(Annotations it) {
        s.k(it, "it");
        return v.e0(it);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo496findAnnotation(FqName fqName) {
        s.k(fqName, "fqName");
        return (AnnotationDescriptor) l.M(l.V(v.e0(this.f86743a), new c(fqName)));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        s.k(fqName, "fqName");
        Iterator it = v.e0(this.f86743a).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.f86743a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return l.N(v.e0(this.f86743a), d.f86750a).iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(Annotations... delegates) {
        this((List<? extends Annotations>) n.w1(delegates));
        s.k(delegates, "delegates");
    }
}
