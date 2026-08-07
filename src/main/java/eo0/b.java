package eo0;

import co0.f;
import co0.q;
import co0.r;
import fo0.t2;
import fo0.x2;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lco0/q;", "Lco0/d;", "b", "(Lco0/q;)Lco0/d;", "getJvmErasure$annotations", "(Lco0/q;)V", "jvmErasure", "Lco0/f;", "a", "(Lco0/f;)Lco0/d;", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final co0.d<?> a(f fVar) {
        Object obj;
        co0.d<?> dVarB;
        s.k(fVar, "<this>");
        if (fVar instanceof co0.d) {
            return (co0.d) fVar;
        }
        if (!(fVar instanceof r)) {
            throw new x2("Cannot calculate JVM erasure for type: " + fVar);
        }
        List<q> upperBounds = ((r) fVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            q qVar = (q) next;
            s.i(qVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = ((t2) qVar).getType().getConstructor().mo500getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.INTERFACE && classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        q qVar2 = (q) obj;
        if (qVar2 == null) {
            qVar2 = (q) v.q0(upperBounds);
        }
        return (qVar2 == null || (dVarB = b(qVar2)) == null) ? o0.b(Object.class) : dVarB;
    }

    public static final co0.d<?> b(q qVar) {
        co0.d<?> dVarA;
        s.k(qVar, "<this>");
        f classifier = qVar.getClassifier();
        if (classifier != null && (dVarA = a(classifier)) != null) {
            return dVarA;
        }
        throw new x2("Cannot calculate JVM erasure for type: " + qVar);
    }
}
