package p013kotlin.reflect.jvm.internal.impl.load.java;

import ho0.i;
import ho0.l;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import p013kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;

/* JADX INFO: loaded from: classes9.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType b(ValueParameterDescriptor valueParameterDescriptor) {
        return valueParameterDescriptor.getType();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result isOverridable(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        s.k(superDescriptor, "superDescriptor");
        s.k(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            List<TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            s.j(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo basicOverridabilityProblem = OverridingUtil.getBasicOverridabilityProblem(superDescriptor, subDescriptor);
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
                Object[] objArr = 0;
                if ((basicOverridabilityProblem != null ? basicOverridabilityProblem.getResult() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getValueParameters();
                s.j(valueParameters, "getValueParameters(...)");
                i iVarU = l.U(v.e0(valueParameters), f.f87199a);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                s.h(returnType);
                i iVarY = l.Y(iVarU, returnType);
                ReceiverParameterDescriptor extensionReceiverParameter = javaMethodDescriptor.getExtensionReceiverParameter();
                for (KotlinType kotlinType : l.X(iVarY, v.q(extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null))) {
                    if (!kotlinType.getArguments().isEmpty() && !(kotlinType.unwrap() instanceof RawTypeImpl)) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                CallableDescriptor callableDescriptorSubstitute = superDescriptor.substitute(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0).buildSubstitutor());
                if (callableDescriptorSubstitute == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (callableDescriptorSubstitute instanceof SimpleFunctionDescriptor) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptorSubstitute;
                    List<TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    s.j(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        callableDescriptorSubstitute = simpleFunctionDescriptor.newCopyBuilder().setTypeParameters(v.m()).build();
                        s.h(callableDescriptorSubstitute);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptorSubstitute, subDescriptor, false).getResult();
                s.j(result, "getResult(...)");
                return WhenMappings.$EnumSwitchMapping$0[result.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
