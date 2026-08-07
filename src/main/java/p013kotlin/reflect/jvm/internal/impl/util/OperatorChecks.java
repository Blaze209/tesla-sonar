package p013kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class OperatorChecks extends AbstractModifierChecks {
    public static final OperatorChecks INSTANCE = new OperatorChecks();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Checks> f89070a;

    static {
        Name name = OperatorNameConventions.GET;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.INSTANCE;
        Checks checks = new Checks(name, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(1)}, (l) null, 4, (DefaultConstructorMarker) null);
        Checks checks2 = new Checks(OperatorNameConventions.SET, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(2)}, c.f89084a);
        Name name2 = OperatorNameConventions.GET_VALUE;
        b bVar = b.f89082a;
        ValueParameterCountCheck.AtLeast atLeast = new ValueParameterCountCheck.AtLeast(2);
        a aVar = a.f89080a;
        Checks checks3 = new Checks(name2, new Check[]{memberOrExtension, bVar, atLeast, aVar}, (l) null, 4, (DefaultConstructorMarker) null);
        Checks checks4 = new Checks(OperatorNameConventions.SET_VALUE, new Check[]{memberOrExtension, bVar, new ValueParameterCountCheck.AtLeast(3), aVar}, (l) null, 4, (DefaultConstructorMarker) null);
        Checks checks5 = new Checks(OperatorNameConventions.PROVIDE_DELEGATE, new Check[]{memberOrExtension, bVar, new ValueParameterCountCheck.Equals(2), aVar}, (l) null, 4, (DefaultConstructorMarker) null);
        Checks checks6 = new Checks(OperatorNameConventions.INVOKE, new Check[]{memberOrExtension}, (l) null, 4, (DefaultConstructorMarker) null);
        Name name3 = OperatorNameConventions.CONTAINS;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.INSTANCE;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
        Checks checks7 = new Checks(name3, new Check[]{memberOrExtension, singleValueParameter, bVar, returnsBoolean}, (l) null, 4, (DefaultConstructorMarker) null);
        Name name4 = OperatorNameConventions.ITERATOR;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.INSTANCE;
        f89070a = v.p(checks, checks2, checks3, checks4, checks5, checks6, checks7, new Checks(name4, new Check[]{memberOrExtension, noValueParameters}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.NEXT, new Check[]{memberOrExtension, noValueParameters}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.HAS_NEXT, new Check[]{memberOrExtension, noValueParameters, returnsBoolean}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_TO, new Check[]{memberOrExtension, singleValueParameter, bVar}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_UNTIL, new Check[]{memberOrExtension, singleValueParameter, bVar}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.EQUALS, new Check[]{MemberKindCheck.Member.INSTANCE}, d.f89085a), new Checks(OperatorNameConventions.COMPARE_TO, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.INSTANCE, singleValueParameter, bVar}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.BINARY_OPERATION_NAMES, new Check[]{memberOrExtension, singleValueParameter, bVar}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new Check[]{memberOrExtension, noValueParameters}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(v.p(OperatorNameConventions.INC, OperatorNameConventions.DEC), new Check[]{memberOrExtension}, e.f89086a), new Checks(OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.INSTANCE, singleValueParameter, bVar}, (l) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{memberOrExtension, noValueParameters}, (l) null, 4, (DefaultConstructorMarker) null));
    }

    private OperatorChecks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(FunctionDescriptor Checks) {
        s.k(Checks, "$this$Checks");
        List<ValueParameterDescriptor> valueParameters = Checks.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) v.C0(valueParameters);
        boolean z11 = false;
        if (valueParameterDescriptor != null && !DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    public static final String e(FunctionDescriptor Checks) {
        boolean z11;
        s.k(Checks, "$this$Checks");
        DeclarationDescriptor containingDeclaration = Checks.getContainingDeclaration();
        s.j(containingDeclaration, "getContainingDeclaration(...)");
        if (f(containingDeclaration)) {
            z11 = true;
        } else {
            Collection<? extends FunctionDescriptor> overriddenDescriptors = Checks.getOverriddenDescriptors();
            s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
            Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        DeclarationDescriptor containingDeclaration2 = ((FunctionDescriptor) it.next()).getContainingDeclaration();
                        s.j(containingDeclaration2, "getContainingDeclaration(...)");
                        if (f(containingDeclaration2)) {
                        }
                    } else if (DescriptorUtilKt.isTypedEqualsInValueClass(Checks)) {
                        z11 = false;
                    }
                    z11 = true;
                }
            } else if (DescriptorUtilKt.isTypedEqualsInValueClass(Checks)) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z11) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("must override ''equals()'' in Any");
        DeclarationDescriptor containingDeclaration3 = Checks.getContainingDeclaration();
        s.j(containingDeclaration3, "getContainingDeclaration(...)");
        if (InlineClassesUtilsKt.isValueClass(containingDeclaration3)) {
            DescriptorRenderer descriptorRenderer = DescriptorRenderer.SHORT_NAMES_IN_TYPES;
            DeclarationDescriptor containingDeclaration4 = Checks.getContainingDeclaration();
            s.i(containingDeclaration4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            SimpleType defaultType = ((ClassDescriptor) containingDeclaration4).getDefaultType();
            s.j(defaultType, "getDefaultType(...)");
            sb2.append(" or define ''equals(other: " + descriptorRenderer.renderType(TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) + "): Boolean''");
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    private static final boolean f(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isAny((ClassDescriptor) declarationDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(FunctionDescriptor Checks) {
        boolean zIsSubtypeOf;
        s.k(Checks, "$this$Checks");
        ReceiverParameterDescriptor dispatchReceiverParameter = Checks.getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null) {
            dispatchReceiverParameter = Checks.getExtensionReceiverParameter();
        }
        OperatorChecks operatorChecks = INSTANCE;
        boolean z11 = false;
        if (dispatchReceiverParameter != null) {
            KotlinType returnType = Checks.getReturnType();
            if (returnType != null) {
                KotlinType type = dispatchReceiverParameter.getType();
                s.j(type, "getType(...)");
                zIsSubtypeOf = TypeUtilsKt.isSubtypeOf(returnType, type);
            } else {
                zIsSubtypeOf = false;
            }
            if (zIsSubtypeOf || operatorChecks.h(Checks, dispatchReceiverParameter)) {
                z11 = true;
            }
        }
        if (z11) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    private final boolean h(FunctionDescriptor functionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        ClassId classId;
        KotlinType returnType;
        ReceiverValue value = receiverParameterDescriptor.getValue();
        s.j(value, "getValue(...)");
        if (!(value instanceof ImplicitClassReceiver)) {
            return false;
        }
        ClassDescriptor classDescriptor = ((ImplicitClassReceiver) value).getClassDescriptor();
        if (!classDescriptor.isExpect() || (classId = DescriptorUtilsKt.getClassId(classDescriptor)) == null) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = FindClassInModuleKt.findClassifierAcrossModuleDependencies(DescriptorUtilsKt.getModule(classDescriptor), classId);
        TypeAliasDescriptor typeAliasDescriptor = classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies : null;
        if (typeAliasDescriptor == null || (returnType = functionDescriptor.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.isSubtypeOf(returnType, typeAliasDescriptor.getExpandedType());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    public List<Checks> getChecks$descriptors() {
        return f89070a;
    }
}
