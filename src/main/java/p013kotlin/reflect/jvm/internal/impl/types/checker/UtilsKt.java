package p013kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

/* JADX INFO: loaded from: classes9.dex */
public final class UtilsKt {
    private static final KotlinType a(KotlinType kotlinType) {
        return CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType).getUpper();
    }

    private static final String b(TypeConstructor typeConstructor) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + typeConstructor, sb2);
        c("hashCode: " + typeConstructor.hashCode(), sb2);
        c("javaClass: " + typeConstructor.getClass().getCanonicalName(), sb2);
        for (DeclarationDescriptor declarationDescriptorMo500getDeclarationDescriptor = typeConstructor.mo500getDeclarationDescriptor(); declarationDescriptorMo500getDeclarationDescriptor != null; declarationDescriptorMo500getDeclarationDescriptor = declarationDescriptorMo500getDeclarationDescriptor.getContainingDeclaration()) {
            c("fqName: " + DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptorMo500getDeclarationDescriptor), sb2);
            c("javaClass: " + declarationDescriptorMo500getDeclarationDescriptor.getClass().getCanonicalName(), sb2);
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        s.k(str, "<this>");
        sb2.append(str);
        s.j(sb2, "append(...)");
        sb2.append('\n');
        s.j(sb2, "append(...)");
        return sb2;
    }

    public static final KotlinType findCorrespondingSupertype(KotlinType subtype, KotlinType supertype, TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        s.k(subtype, "subtype");
        s.k(supertype, "supertype");
        s.k(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new e(subtype, null));
        TypeConstructor constructor = supertype.getConstructor();
        while (!arrayDeque.isEmpty()) {
            e eVar = (e) arrayDeque.poll();
            KotlinType kotlinTypeB = eVar.b();
            TypeConstructor constructor2 = kotlinTypeB.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = kotlinTypeB.isMarkedNullable();
                for (e eVarA = eVar.a(); eVarA != null; eVarA = eVarA.a()) {
                    KotlinType kotlinTypeB2 = eVarA.b();
                    List<TypeProjection> arguments = kotlinTypeB2.getArguments();
                    if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                        Iterator<T> it = arguments.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                kotlinTypeB = TypeConstructorSubstitution.Companion.create(kotlinTypeB2).buildSubstitutor().safeSubstitute(kotlinTypeB, Variance.INVARIANT);
                                s.h(kotlinTypeB);
                                break;
                            }
                            Variance projectionKind = ((TypeProjection) it.next()).getProjectionKind();
                            Variance variance = Variance.INVARIANT;
                            if (projectionKind != variance) {
                                KotlinType kotlinTypeSafeSubstitute = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(kotlinTypeB2), false, 1, null).buildSubstitutor().safeSubstitute(kotlinTypeB, variance);
                                s.j(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                                kotlinTypeB = a(kotlinTypeSafeSubstitute);
                                break;
                            }
                        }
                    } else {
                        kotlinTypeB = TypeConstructorSubstitution.Companion.create(kotlinTypeB2).buildSubstitutor().safeSubstitute(kotlinTypeB, Variance.INVARIANT);
                        s.h(kotlinTypeB);
                        break;
                    }
                    zIsMarkedNullable = zIsMarkedNullable || kotlinTypeB2.isMarkedNullable();
                }
                TypeConstructor constructor3 = kotlinTypeB.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return TypeUtils.makeNullableAsSpecified(kotlinTypeB, zIsMarkedNullable);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(constructor3) + ", \n\nsupertype: " + b(constructor) + " \n" + typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
            }
            for (KotlinType kotlinType : constructor2.getSupertypes()) {
                s.h(kotlinType);
                arrayDeque.add(new e(kotlinType, eVar));
            }
        }
        return null;
    }
}
