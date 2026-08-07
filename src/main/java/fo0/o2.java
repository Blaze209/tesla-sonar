package fo0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfo0/j2$a;", "", "isGetter", "Lgo0/h;", "b", "(Lfo0/j2$a;Z)Lgo0/h;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Z", "", "f", "(Lfo0/j2$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public static final go0.h<?> b(j2.a<?, ?> aVar, boolean z11) {
        n.e eVarC;
        Method methodC;
        go0.h aVar2;
        JvmProtoBuf.JvmMethodSignature setter;
        go0.h cVar;
        Method methodM;
        if (c1.INSTANCE.a().i(aVar.a().getSignature())) {
            return go0.l.f69290a;
        }
        p pVarF = e3.f66120a.f(aVar.a().U());
        if (pVarF instanceof p.c) {
            p.c cVar2 = (p.c) pVarF;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignatureF = cVar2.getSignature();
            if (z11) {
                if (jvmPropertySignatureF.hasGetter()) {
                    setter = jvmPropertySignatureF.getGetter();
                } else {
                    setter = null;
                }
            } else if (jvmPropertySignatureF.hasSetter()) {
                setter = jvmPropertySignatureF.getSetter();
            } else {
                setter = null;
            }
            Method methodU = setter != null ? aVar.a().getContainer().u(cVar2.getNameResolver().getString(setter.getName()), cVar2.getNameResolver().getString(setter.getDesc())) : null;
            if (methodU != null) {
                if (!Modifier.isStatic(methodU.getModifiers())) {
                    cVar = aVar.S() ? new go0.i.h.a(methodU, f(aVar)) : new go0.i.h.e(methodU);
                } else if (d(aVar)) {
                    cVar = aVar.S() ? new go0.i.h.b(methodU) : new go0.i.h.f(methodU);
                } else {
                    cVar = aVar.S() ? new go0.i.h.c(methodU, f(aVar)) : new go0.i.h.g(methodU);
                }
                aVar2 = cVar;
            } else if (InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(aVar.a().U()) && p013kotlin.jvm.internal.s.f(aVar.a().U().getVisibility(), DescriptorVisibilities.INTERNAL)) {
                Class<?> clsS = go0.o.s(aVar.a().U().getContainingDeclaration());
                if (clsS == null || (methodM = go0.o.m(clsS, aVar.a().U())) == null) {
                    throw new x2("Underlying property of inline class " + aVar.a() + " should have a field");
                }
                aVar2 = aVar.S() ? new go0.k.a(methodM, f(aVar)) : new go0.k.b(methodM);
            } else {
                Field fieldD0 = aVar.a().d0();
                if (fieldD0 == null) {
                    throw new x2("No accessors or field is found for property " + aVar.a());
                }
                aVar2 = c(aVar, z11, fieldD0);
            }
        } else if (pVarF instanceof p.a) {
            aVar2 = c(aVar, z11, ((p.a) pVarF).getField());
        } else {
            if (!(pVarF instanceof p.b)) {
                if (!(pVarF instanceof p.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z11) {
                    eVarC = ((p.d) pVarF).getGetterSignature();
                } else {
                    eVarC = ((p.d) pVarF).getSetterSignature();
                    if (eVarC == null) {
                        throw new x2("No setter found for property " + aVar.a());
                    }
                }
                Method methodU2 = aVar.a().getContainer().u(eVarC.c(), eVarC.b());
                if (methodU2 != null) {
                    Modifier.isStatic(methodU2.getModifiers());
                    return aVar.S() ? new go0.i.h.a(methodU2, f(aVar)) : new go0.i.h.e(methodU2);
                }
                throw new x2("No accessor found for property " + aVar.a());
            }
            if (z11) {
                methodC = ((p.b) pVarF).getGetterMethod();
            } else {
                p.b bVar = (p.b) pVarF;
                methodC = bVar.getSetterMethod();
                if (methodC == null) {
                    throw new x2("No source found for setter of Java method property: " + bVar.getGetterMethod());
                }
            }
            aVar2 = aVar.S() ? new go0.i.h.a(methodC, f(aVar)) : new go0.i.h.e(methodC);
        }
        return go0.o.j(aVar2, aVar.U(), false, 2, null);
    }

    private static final go0.i<Field> c(j2.a<?, ?> aVar, boolean z11, Field field) {
        if (g(aVar.a().U()) || !Modifier.isStatic(field.getModifiers())) {
            if (z11) {
                return aVar.S() ? new go0.i.f.a(field, f(aVar)) : new go0.i.f.c(field);
            }
            return aVar.S() ? new go0.i.g.a(field, e(aVar), f(aVar)) : new go0.i.g.c(field, e(aVar));
        }
        if (!d(aVar)) {
            return z11 ? new go0.i.f.e(field) : new go0.i.g.e(field, e(aVar));
        }
        if (z11) {
            return aVar.S() ? new go0.i.f.b(field) : new go0.i.f.d(field);
        }
        return aVar.S() ? new go0.i.g.b(field, e(aVar)) : new go0.i.g.d(field, e(aVar));
    }

    private static final boolean d(j2.a<?, ?> aVar) {
        return aVar.a().U().getAnnotations().hasAnnotation(i3.j());
    }

    private static final boolean e(j2.a<?, ?> aVar) {
        return !TypeUtils.isNullableType(aVar.a().U().getType());
    }

    public static final Object f(j2.a<?, ?> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        return aVar.a().Z();
    }

    private static final boolean g(PropertyDescriptor propertyDescriptor) {
        DeclarationDescriptor containingDeclaration = propertyDescriptor.getContainingDeclaration();
        p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
        if (!DescriptorUtils.isCompanionObject(containingDeclaration)) {
            return false;
        }
        DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        if (DescriptorUtils.isInterface(containingDeclaration2) || DescriptorUtils.isAnnotationClass(containingDeclaration2)) {
            return (propertyDescriptor instanceof DeserializedPropertyDescriptor) && JvmProtoBufUtil.isMovedFromInterfaceCompanion(((DeserializedPropertyDescriptor) propertyDescriptor).getProto());
        }
        return true;
    }
}
