package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, a {
    public static final Companion Companion = Companion.f86735a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f86735a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Annotations f86736b = new Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
            public Void findAnnotation(FqName fqName) {
                s.k(fqName, "fqName");
                return null;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean hasAnnotation(FqName fqName) {
                return Annotations.DefaultImpls.hasAnnotation(this, fqName);
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<AnnotationDescriptor> iterator() {
                return v.m().iterator();
            }

            public String toString() {
                return "EMPTY";
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* JADX INFO: renamed from: findAnnotation, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ AnnotationDescriptor mo496findAnnotation(FqName fqName) {
                return (AnnotationDescriptor) findAnnotation(fqName);
            }
        };

        private Companion() {
        }

        public final Annotations create(List<? extends AnnotationDescriptor> annotations) {
            s.k(annotations, "annotations");
            return annotations.isEmpty() ? f86736b : new AnnotationsImpl(annotations);
        }

        public final Annotations getEMPTY() {
            return f86736b;
        }
    }

    public static final class DefaultImpls {
        public static AnnotationDescriptor findAnnotation(Annotations annotations, FqName fqName) {
            AnnotationDescriptor next;
            s.k(fqName, "fqName");
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.f(next.getFqName(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean hasAnnotation(Annotations annotations, FqName fqName) {
            s.k(fqName, "fqName");
            return annotations.mo496findAnnotation(fqName) != null;
        }
    }

    /* JADX INFO: renamed from: findAnnotation */
    AnnotationDescriptor mo496findAnnotation(FqName fqName);

    boolean hasAnnotation(FqName fqName);

    boolean isEmpty();
}
