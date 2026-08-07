package p013kotlin.reflect.jvm.internal.impl.renderer;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.m;
import org.slf4j.Marker;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.collections.g0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import p013kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import p013kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p013kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.WrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p013kotlin.text.a;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DescriptorRendererOptionsImpl f88364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f88365b;

    private final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<h0, StringBuilder> {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        private final void g(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2, String str) throws IOException {
            int i11 = WhenMappings.$EnumSwitchMapping$0[DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    c(propertyAccessorDescriptor, sb2);
                    return;
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            DescriptorRendererImpl.this.R(propertyAccessorDescriptor, sb2);
            sb2.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
            s.j(correspondingProperty, "getCorrespondingProperty(...)");
            descriptorRendererImpl.A0(correspondingProperty, sb2);
        }

        public void a(ClassDescriptor descriptor, StringBuilder builder) throws IOException {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.X(descriptor, builder);
        }

        public void b(ConstructorDescriptor constructorDescriptor, StringBuilder builder) throws IOException {
            s.k(constructorDescriptor, "constructorDescriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.b0(constructorDescriptor, builder);
        }

        public void c(FunctionDescriptor descriptor, StringBuilder builder) throws IOException {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.j0(descriptor, builder);
        }

        public void d(ModuleDescriptor descriptor, StringBuilder builder) {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.s0(descriptor, builder, true);
        }

        public void e(PackageFragmentDescriptor descriptor, StringBuilder builder) {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.w0(descriptor, builder);
        }

        public void f(PackageViewDescriptor descriptor, StringBuilder builder) {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.y0(descriptor, builder);
        }

        public void h(PropertyDescriptor descriptor, StringBuilder builder) throws IOException {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.A0(descriptor, builder);
        }

        public void i(PropertyGetterDescriptor descriptor, StringBuilder builder) throws IOException {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            g(descriptor, builder, "getter");
        }

        public void j(PropertySetterDescriptor descriptor, StringBuilder builder) throws IOException {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            g(descriptor, builder, "setter");
        }

        public void k(ReceiverParameterDescriptor descriptor, StringBuilder builder) {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void l(TypeAliasDescriptor descriptor, StringBuilder builder) {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.J0(descriptor, builder);
        }

        public void m(TypeParameterDescriptor descriptor, StringBuilder builder) {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.N0(descriptor, builder, true);
        }

        public void n(ValueParameterDescriptor descriptor, StringBuilder builder) {
            s.k(descriptor, "descriptor");
            s.k(builder, "builder");
            DescriptorRendererImpl.this.S0(descriptor, true, builder, true);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
            a(classDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb2) throws IOException {
            b(constructorDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb2) throws IOException {
            c(functionDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb2) {
            d(moduleDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
            e(packageFragmentDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
            f(packageViewDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb2) throws IOException {
            h(propertyDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb2) throws IOException {
            i(propertyGetterDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb2) throws IOException {
            j(propertySetterDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb2) {
            k(receiverParameterDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
            l(typeAliasDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2) {
            m(typeParameterDescriptor, sb2);
            return h0.f84049a;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ h0 visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb2) {
            n(valueParameterDescriptor, sb2);
            return h0.f84049a;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl options) {
        s.k(options, "options");
        this.f88364a = options;
        options.isLocked();
        this.f88365b = m.b(new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(PropertyDescriptor propertyDescriptor, StringBuilder sb2) throws IOException {
        PropertyDescriptor propertyDescriptor2;
        StringBuilder sb3;
        if (getStartFromName()) {
            propertyDescriptor2 = propertyDescriptor;
            sb3 = sb2;
        } else {
            if (!getStartFromDeclarationKeyword()) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                s.j(contextReceiverParameters, "getContextReceiverParameters(...)");
                d0(contextReceiverParameters, sb2);
                B0(propertyDescriptor, sb2);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                s.j(visibility, "getVisibility(...)");
                V0(visibility, sb2);
                boolean z11 = false;
                r0(sb2, getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                o0(propertyDescriptor, sb2);
                q0(propertyDescriptor, sb2);
                v0(propertyDescriptor, sb2);
                if (getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    z11 = true;
                }
                r0(sb2, z11, "lateinit");
                n0(propertyDescriptor, sb2);
            }
            propertyDescriptor2 = propertyDescriptor;
            sb3 = sb2;
            R0(this, propertyDescriptor2, sb3, false, 4, null);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor2.getTypeParameters();
            s.j(typeParameters, "getTypeParameters(...)");
            P0(typeParameters, sb3, true);
            C0(propertyDescriptor2, sb3);
        }
        s0(propertyDescriptor2, sb3, true);
        sb3.append(": ");
        KotlinType type = propertyDescriptor2.getType();
        s.j(type, "getType(...)");
        sb3.append(renderType(type));
        D0(propertyDescriptor2, sb3);
        l0(propertyDescriptor2, sb3);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor2.getTypeParameters();
        s.j(typeParameters2, "getTypeParameters(...)");
        W0(typeParameters2, sb3);
    }

    private final void B0(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            V(this, sb2, propertyDescriptor, null, 2, null);
            FieldDescriptor backingField = propertyDescriptor.getBackingField();
            if (backingField != null) {
                U(sb2, backingField, AnnotationUseSiteTarget.FIELD);
            }
            FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
            if (delegateField != null) {
                U(sb2, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    U(sb2, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    U(sb2, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                    s.j(valueParameters, "getValueParameters(...)");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) v.U0(valueParameters);
                    s.h(valueParameterDescriptor);
                    U(sb2, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void C(StringBuilder sb2, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String name;
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) || (declarationDescriptor instanceof PackageViewDescriptor) || (containingDeclaration = declarationDescriptor.getContainingDeclaration()) == null || (containingDeclaration instanceof ModuleDescriptor)) {
            return;
        }
        sb2.append(" ");
        sb2.append(renderMessage("defined in"));
        sb2.append(" ");
        FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
        s.j(fqName, "getFqName(...)");
        sb2.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
        if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
            sb2.append(" ");
            sb2.append(renderMessage("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    private final void C0(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            U(sb2, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            s.j(type, "getType(...)");
            sb2.append(h0(type));
            sb2.append(".");
        }
    }

    private final void D(StringBuilder sb2, List<? extends TypeProjection> list) throws IOException {
        g0.v0(list, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new n(this));
    }

    private final void D0(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) != null) {
            sb2.append(" on ");
            KotlinType type = extensionReceiverParameter.getType();
            s.j(type, "getType(...)");
            sb2.append(renderType(type));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence E(DescriptorRendererImpl descriptorRendererImpl, TypeProjection it) {
        s.k(it, "it");
        if (it.isStarProjection()) {
            return Marker.ANY_MARKER;
        }
        KotlinType type = it.getType();
        s.j(type, "getType(...)");
        String strRenderType = descriptorRendererImpl.renderType(type);
        if (it.getProjectionKind() == Variance.INVARIANT) {
            return strRenderType;
        }
        return it.getProjectionKind() + ' ' + strRenderType;
    }

    private final void E0(StringBuilder sb2, SimpleType simpleType) {
        if (s.f(simpleType, TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
            sb2.append("???");
            return;
        }
        if (ErrorUtils.isUninferredTypeVariable(simpleType)) {
            if (!getUninferredTypeParameterAsName()) {
                sb2.append("???");
                return;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            s.i(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(f0(((ErrorTypeConstructor) constructor).getParam(0)));
            return;
        }
        if (KotlinTypeKt.isError(simpleType)) {
            e0(sb2, simpleType);
        } else if (X0(simpleType)) {
            k0(sb2, simpleType);
        } else {
            e0(sb2, simpleType);
        }
    }

    private final String F() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 == 1) {
            return G("->");
        }
        if (i11 == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void F0(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final String G(String str) {
        return getTextFormat().escape(str);
    }

    private final void G0(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
        if (getWithoutSuperTypes() || KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            return;
        }
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        s.j(supertypes, "getSupertypes(...)");
        if (supertypes.isEmpty()) {
            return;
        }
        if (supertypes.size() == 1 && KotlinBuiltIns.isAnyOrNullableAny(supertypes.iterator().next())) {
            return;
        }
        F0(sb2);
        sb2.append(": ");
        g0.v0(supertypes, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new p(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DescriptorRendererImpl H(DescriptorRendererImpl descriptorRendererImpl) {
        DescriptorRenderer descriptorRendererWithOptions = descriptorRendererImpl.withOptions(q.f88411a);
        s.i(descriptorRendererWithOptions, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (DescriptorRendererImpl) descriptorRendererWithOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence H0(DescriptorRendererImpl descriptorRendererImpl, KotlinType kotlinType) {
        s.h(kotlinType);
        return descriptorRendererImpl.renderType(kotlinType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 I(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setExcludedTypeAnnotationClasses(d1.n(withOptions.getExcludedTypeAnnotationClasses(), v.p(StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams)));
        return h0.f84049a;
    }

    private final void I0(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        r0(sb2, functionDescriptor.isSuspend(), "suspend");
    }

    private final DescriptorRendererImpl J() {
        return (DescriptorRendererImpl) this.f88365b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
        V(this, sb2, typeAliasDescriptor, null, 2, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        s.j(visibility, "getVisibility(...)");
        V0(visibility, sb2);
        o0(typeAliasDescriptor, sb2);
        sb2.append(m0("typealias"));
        sb2.append(" ");
        s0(typeAliasDescriptor, sb2, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        s.j(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        P0(declaredTypeParameters, sb2, false);
        W(typeAliasDescriptor, sb2);
        sb2.append(" = ");
        sb2.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    private final String K() {
        return G(">");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K0(KotlinType it) {
        s.k(it, "it");
        return it instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) it).getOriginalTypeVariable() : it;
    }

    private final boolean L(KotlinType kotlinType) {
        return FunctionTypesKt.isSuspendFunctionType(kotlinType) || !kotlinType.getAnnotations().isEmpty();
    }

    private final void L0(StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType possiblyInnerTypeBuildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (possiblyInnerTypeBuildPossiblyInnerType != null) {
            z0(sb2, possiblyInnerTypeBuildPossiblyInnerType);
        } else {
            sb2.append(renderTypeConstructor(typeConstructor));
            sb2.append(renderTypeArguments(kotlinType.getArguments()));
        }
    }

    private final Modality M(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
        if (!overriddenDescriptors.isEmpty() && classDescriptor.getModality() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() != ClassKind.INTERFACE || s.f(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
            return Modality.FINAL;
        }
        Modality modality = callableMemberDescriptor.getModality();
        Modality modality2 = Modality.ABSTRACT;
        return modality == modality2 ? modality2 : Modality.OPEN;
    }

    static /* synthetic */ void M0(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.L0(sb2, kotlinType, typeConstructor);
    }

    private final boolean N(AnnotationDescriptor annotationDescriptor) {
        return s.f(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2, boolean z11) {
        if (z11) {
            sb2.append(O());
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(typeParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        r0(sb2, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z12 = true;
        r0(sb2, label.length() > 0, label);
        V(this, sb2, typeParameterDescriptor, null, 2, null);
        s0(typeParameterDescriptor, sb2, z11);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z11) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb2.append(" : ");
                s.h(next);
                sb2.append(renderType(next));
            }
        } else if (z11) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z12) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    s.h(kotlinType);
                    sb2.append(renderType(kotlinType));
                    z12 = false;
                }
            }
        }
        if (z11) {
            sb2.append(K());
        }
    }

    private final String O() {
        return G("<");
    }

    private final void O0(StringBuilder sb2, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            N0(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final boolean P(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.getOverriddenDescriptors().isEmpty();
    }

    private final void P0(List<? extends TypeParameterDescriptor> list, StringBuilder sb2, boolean z11) {
        if (getWithoutTypeParameters() || list.isEmpty()) {
            return;
        }
        sb2.append(O());
        O0(sb2, list);
        sb2.append(K());
        if (z11) {
            sb2.append(" ");
        }
    }

    private final void Q(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat textFormat = getTextFormat();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (textFormat == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        u0(sb2, abbreviatedType.getAbbreviation());
        sb2.append(" */");
        if (getTextFormat() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    private final void Q0(VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z11) {
        if (z11 || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb2.append(m0(variableDescriptor.isVar() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2) {
        o0(propertyAccessorDescriptor, sb2);
    }

    static /* synthetic */ void R0(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        descriptorRendererImpl.Q0(variableDescriptor, sb2, z11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    private final void S(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        boolean z11;
        boolean z12 = false;
        if (functionDescriptor.isOperator()) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
            s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
            Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isOperator()) {
                            if (!getAlwaysRenderModifiers()) {
                                z11 = false;
                            }
                        }
                    }
                }
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (functionDescriptor.isInfix()) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
            s.j(overriddenDescriptors2, "getOverriddenDescriptors(...)");
            Collection<? extends FunctionDescriptor> collection2 = overriddenDescriptors2;
            if (collection2.isEmpty()) {
                z12 = true;
            } else {
                Iterator<T> it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (((FunctionDescriptor) it2.next()).isInfix()) {
                        if (getAlwaysRenderModifiers()) {
                            break;
                        }
                    }
                }
                z12 = true;
            }
        }
        r0(sb2, functionDescriptor.isTailrec(), "tailrec");
        I0(functionDescriptor, sb2);
        r0(sb2, functionDescriptor.isInline(), "inline");
        r0(sb2, z12, "infix");
        r0(sb2, z11, "operator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    public final void S0(ValueParameterDescriptor valueParameterDescriptor, boolean z11, StringBuilder sb2, boolean z12) {
        boolean z13;
        if (z12) {
            sb2.append(m0("value-parameter"));
            sb2.append(" ");
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(valueParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        V(this, sb2, valueParameterDescriptor, null, 2, null);
        r0(sb2, valueParameterDescriptor.isCrossinline(), "crossinline");
        r0(sb2, valueParameterDescriptor.isNoinline(), "noinline");
        boolean z14 = false;
        if (getRenderPrimaryConstructorParametersAsProperties()) {
            CallableDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
            ClassConstructorDescriptor classConstructorDescriptor = containingDeclaration instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) containingDeclaration : null;
            if (classConstructorDescriptor == null || !classConstructorDescriptor.isPrimary()) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else {
            z13 = false;
        }
        if (z13) {
            r0(sb2, getActualPropertiesInPrimaryConstructor(), "actual");
        }
        U0(valueParameterDescriptor, z11, sb2, z12, z13);
        if (getDefaultParameterValueRenderer() != null) {
            if (getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor)) {
                z14 = true;
            }
        }
        if (z14) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" = ");
            l<ValueParameterDescriptor, String> defaultParameterValueRenderer = getDefaultParameterValueRenderer();
            s.h(defaultParameterValueRenderer);
            sb3.append(defaultParameterValueRenderer.invoke(valueParameterDescriptor));
            sb2.append(sb3.toString());
        }
    }

    private final List<String> T(AnnotationDescriptor annotationDescriptor) {
        ClassConstructorDescriptor classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        List listM = null;
        ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotationDescriptor) : null;
        if (annotationClass != null && (classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor = annotationClass.mo495getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters) {
                if (((ValueParameterDescriptor) obj).declaresDefaultValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
            }
            listM = arrayList2;
        }
        if (listM == null) {
            listM = v.m();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM) {
            if (!allValueArguments.containsKey((Name) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(v.y(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Name) it2.next()).asString() + " = ...");
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = allValueArguments.entrySet();
        ArrayList arrayList5 = new ArrayList(v.y(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Name name = (Name) entry.getKey();
            ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name.asString());
            sb2.append(" = ");
            sb2.append(!listM.contains(name) ? a0(constantValue) : "...");
            arrayList5.add(sb2.toString());
        }
        return v.Y0(v.P0(arrayList4, arrayList5));
    }

    private final void T0(Collection<? extends ValueParameterDescriptor> collection, boolean z11, StringBuilder sb2) {
        boolean zY0 = Y0(z11);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb2);
        int i11 = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i11, size, sb2);
            S0(valueParameterDescriptor, zY0, sb2, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i11, size, sb2);
            i11++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb2);
    }

    private final void U(StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            l<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!v.g0(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && !N(annotationDescriptor) && (annotationFilter == null || annotationFilter.invoke(annotationDescriptor).booleanValue())) {
                    sb2.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb2.append('\n');
                        s.j(sb2, "append(...)");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void U0(VariableDescriptor variableDescriptor, boolean z11, StringBuilder sb2, boolean z12, boolean z13) {
        KotlinType type = variableDescriptor.getType();
        s.j(type, "getType(...)");
        ValueParameterDescriptor valueParameterDescriptor = variableDescriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) variableDescriptor : null;
        KotlinType varargElementType = valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null;
        KotlinType kotlinType = varargElementType == null ? type : varargElementType;
        r0(sb2, varargElementType != null, "vararg");
        if (z13 || (z12 && !getStartFromName())) {
            Q0(variableDescriptor, sb2, z13);
        }
        if (z11) {
            s0(variableDescriptor, sb2, z12);
            sb2.append(": ");
        }
        sb2.append(renderType(kotlinType));
        l0(variableDescriptor, sb2);
        if (!getVerbose() || varargElementType == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(renderType(type));
        sb2.append("*/");
    }

    static /* synthetic */ void V(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.U(sb2, annotated, annotationUseSiteTarget);
    }

    private final boolean V0(DescriptorVisibility descriptorVisibility, StringBuilder sb2) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && s.f(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb2.append(m0(descriptorVisibility.getInternalDisplayName()));
        sb2.append(" ");
        return true;
    }

    private final void W(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb2) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        s.j(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        s.j(parameters, "getParameters(...)");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb2.append(" /*captured type parameters: ");
            O0(sb2, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    private final void W0(List<? extends TypeParameterDescriptor> list, StringBuilder sb2) throws IOException {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            s.j(upperBounds, "getUpperBounds(...)");
            for (KotlinType kotlinType : v.i0(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                s.j(name, "getName(...)");
                sb3.append(renderName(name, false));
                sb3.append(" : ");
                s.h(kotlinType);
                sb3.append(renderType(kotlinType));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(m0("where"));
        sb2.append(" ");
        g0.v0(arrayList, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
        ClassConstructorDescriptor classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor;
        boolean z11 = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        if (!getStartFromName()) {
            List<ReceiverParameterDescriptor> contextReceivers = classDescriptor.getContextReceivers();
            s.j(contextReceivers, "getContextReceivers(...)");
            d0(contextReceivers, sb2);
            V(this, sb2, classDescriptor, null, 2, null);
            if (!z11) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                s.j(visibility, "getVisibility(...)");
                V0(visibility, sb2);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.getModality() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != Modality.FINAL)) {
                Modality modality = classDescriptor.getModality();
                s.j(modality, "getModality(...)");
                p0(modality, sb2, M(classDescriptor));
            }
            o0(classDescriptor, sb2);
            r0(sb2, getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner(), "inner");
            r0(sb2, getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData(), "data");
            r0(sb2, getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            r0(sb2, getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor.isValue(), "value");
            r0(sb2, getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor.isFun(), "fun");
            Y(classDescriptor, sb2);
        }
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            Z(classDescriptor, sb2);
        } else {
            if (!getStartFromName()) {
                F0(sb2);
            }
            s0(classDescriptor, sb2, true);
        }
        if (z11) {
            return;
        }
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        s.j(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        P0(declaredTypeParameters, sb2, false);
        W(classDescriptor, sb2);
        if (!classDescriptor.getKind().isSingleton() && getClassWithPrimaryConstructor() && (classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor = classDescriptor.mo495getUnsubstitutedPrimaryConstructor()) != null) {
            sb2.append(" ");
            V(this, sb2, classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor, null, 2, null);
            DescriptorVisibility visibility2 = classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor.getVisibility();
            s.j(visibility2, "getVisibility(...)");
            V0(visibility2, sb2);
            sb2.append(m0("constructor"));
            List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor.getValueParameters();
            s.j(valueParameters, "getValueParameters(...)");
            T0(valueParameters, classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb2);
        }
        G0(classDescriptor, sb2);
        W0(declaredTypeParameters, sb2);
    }

    private final boolean X0(KotlinType kotlinType) {
        if (!FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        List<TypeProjection> arguments = kotlinType.getArguments();
        if ((arguments instanceof Collection) && arguments.isEmpty()) {
            return true;
        }
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            if (((TypeProjection) it.next()).isStarProjection()) {
                return false;
            }
        }
        return true;
    }

    private final void Y(ClassDescriptor classDescriptor, StringBuilder sb2) {
        sb2.append(m0(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    private final boolean Y0(boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return !z11;
        }
        if (i11 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void Z(DeclarationDescriptor declarationDescriptor, StringBuilder sb2) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb2.append("companion object");
            }
            F0(sb2);
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb2.append("of ");
                Name name = containingDeclaration.getName();
                s.j(name, "getName(...)");
                sb2.append(renderName(name, false));
            }
        }
        if (getVerbose() || !s.f(declarationDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
            if (!getStartFromName()) {
                F0(sb2);
            }
            Name name2 = declarationDescriptor.getName();
            s.j(name2, "getName(...)");
            sb2.append(renderName(name2, true));
        }
    }

    private final String a0(ConstantValue<?> constantValue) {
        l<ConstantValue<?>, String> propertyConstantRenderer = this.f88364a.getPropertyConstantRenderer();
        if (propertyConstantRenderer != null) {
            return propertyConstantRenderer.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String strA0 = a0((ConstantValue) it.next());
                if (strA0 != null) {
                    arrayList.add(strA0);
                }
            }
            return v.y0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return t.T0(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null), "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value2).getType() + "::class";
        }
        if (!(value2 instanceof KClassValue.Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
        String strAsString = normalClass.getClassId().asSingleFqName().asString();
        s.j(strAsString, "asString(...)");
        for (int i11 = 0; i11 < normalClass.getArrayDimensions(); i11++) {
            strAsString = "kotlin.Array<" + strAsString + '>';
        }
        return strAsString + "::class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public final void b0(ConstructorDescriptor constructorDescriptor, StringBuilder sb2) throws IOException {
        boolean z11;
        ClassConstructorDescriptor classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor;
        V(this, sb2, constructorDescriptor, null, 2, null);
        if (this.f88364a.getRenderDefaultVisibility() || constructorDescriptor.getConstructedClass().getModality() != Modality.SEALED) {
            DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            s.j(visibility, "getVisibility(...)");
            if (V0(visibility, sb2)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        n0(constructorDescriptor, sb2);
        boolean z12 = getRenderConstructorKeyword() || !constructorDescriptor.isPrimary() || z11;
        if (z12) {
            sb2.append(m0("constructor"));
        }
        ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
        s.j(containingDeclaration, "getContainingDeclaration(...)");
        if (getSecondaryConstructorsAsPrimary()) {
            if (z12) {
                sb2.append(" ");
            }
            s0(containingDeclaration, sb2, true);
            List<TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
            s.j(typeParameters, "getTypeParameters(...)");
            P0(typeParameters, sb2, false);
        }
        List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        T0(valueParameters, constructorDescriptor.hasSynthesizedParameterNames(), sb2);
        if (getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof ClassDescriptor) && (classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor = ((ClassDescriptor) containingDeclaration).mo495getUnsubstitutedPrimaryConstructor()) != null) {
            List<ValueParameterDescriptor> valueParameters2 = classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor.getValueParameters();
            s.j(valueParameters2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters2) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(m0("this"));
                sb2.append(v.y0(arrayList, ", ", "(", ")", 0, null, o.f88409a, 24, null));
            }
        }
        if (getSecondaryConstructorsAsPrimary()) {
            List<TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
            s.j(typeParameters2, "getTypeParameters(...)");
            W0(typeParameters2, sb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c0(ValueParameterDescriptor valueParameterDescriptor) {
        return "";
    }

    private final void d0(List<? extends ReceiverParameterDescriptor> list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        int i11 = 0;
        for (ReceiverParameterDescriptor receiverParameterDescriptor : list) {
            int i12 = i11 + 1;
            U(sb2, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptor.getType();
            s.j(type, "getType(...)");
            sb2.append(h0(type));
            if (i11 == v.o(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i11 = i12;
        }
    }

    private final void e0(StringBuilder sb2, KotlinType kotlinType) {
        V(this, sb2, kotlinType, null, 2, null);
        DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) kotlinType : null;
        SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (KotlinTypeKt.isError(kotlinType)) {
            if (TypeUtilsKt.isUnresolvedType(kotlinType) && getPresentableUnresolvedTypes()) {
                sb2.append(f0(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(kotlinType)));
            } else {
                if (!(kotlinType instanceof ErrorType) || getInformativeErrorType()) {
                    sb2.append(kotlinType.getConstructor().toString());
                } else {
                    sb2.append(((ErrorType) kotlinType).getDebugMessage());
                }
                sb2.append(renderTypeArguments(kotlinType.getArguments()));
            }
        } else if (kotlinType instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable().toString());
        } else if (original instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            M0(this, sb2, kotlinType, null, 2, null);
            h0 h0Var = h0.f84049a;
        }
        if (kotlinType.isMarkedNullable()) {
            sb2.append(CallerData.NA);
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb2.append(" & Any");
        }
    }

    private final String f0(String str) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 == 1) {
            return str;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final void g0(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat textFormat = getTextFormat();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (textFormat == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        u0(sb2, abbreviatedType.getExpandedType());
        sb2.append(" */");
        if (getTextFormat() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    private final String h0(KotlinType kotlinType) {
        String strRenderType = renderType(kotlinType);
        if ((!X0(kotlinType) || TypeUtils.isNullableType(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) {
            return strRenderType;
        }
        return CoreConstants.LEFT_PARENTHESIS_CHAR + strRenderType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private final String i0(List<Name> list) {
        return G(RenderingUtilsKt.renderFqName(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(FunctionDescriptor functionDescriptor, StringBuilder sb2) throws IOException {
        FunctionDescriptor functionDescriptor2;
        StringBuilder sb3;
        if (getStartFromName()) {
            functionDescriptor2 = functionDescriptor;
            sb3 = sb2;
        } else {
            if (getStartFromDeclarationKeyword()) {
                functionDescriptor2 = functionDescriptor;
                sb3 = sb2;
            } else {
                List<ReceiverParameterDescriptor> contextReceiverParameters = functionDescriptor.getContextReceiverParameters();
                s.j(contextReceiverParameters, "getContextReceiverParameters(...)");
                d0(contextReceiverParameters, sb2);
                functionDescriptor2 = functionDescriptor;
                sb3 = sb2;
                V(this, sb3, functionDescriptor2, null, 2, null);
                DescriptorVisibility visibility = functionDescriptor2.getVisibility();
                s.j(visibility, "getVisibility(...)");
                V0(visibility, sb3);
                q0(functionDescriptor2, sb3);
                if (getIncludeAdditionalModifiers()) {
                    o0(functionDescriptor2, sb3);
                }
                v0(functionDescriptor2, sb3);
                if (getIncludeAdditionalModifiers()) {
                    S(functionDescriptor2, sb3);
                } else {
                    I0(functionDescriptor2, sb3);
                }
                n0(functionDescriptor2, sb3);
                if (getVerbose()) {
                    if (functionDescriptor2.isHiddenToOvercomeSignatureClash()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor2.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb3.append(m0("fun"));
            sb3.append(" ");
            List<TypeParameterDescriptor> typeParameters = functionDescriptor2.getTypeParameters();
            s.j(typeParameters, "getTypeParameters(...)");
            P0(typeParameters, sb3, true);
            C0(functionDescriptor2, sb3);
        }
        s0(functionDescriptor2, sb3, true);
        List<ValueParameterDescriptor> valueParameters = functionDescriptor2.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        T0(valueParameters, functionDescriptor2.hasSynthesizedParameterNames(), sb3);
        D0(functionDescriptor2, sb3);
        KotlinType returnType = functionDescriptor2.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb3.append(": ");
            sb3.append(returnType == null ? "[NULL]" : renderType(returnType));
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor2.getTypeParameters();
        s.j(typeParameters2, "getTypeParameters(...)");
        W0(typeParameters2, sb3);
    }

    private final void k0(StringBuilder sb2, KotlinType kotlinType) {
        Name nameExtractParameterNameFromFunctionTypeArgument;
        int length = sb2.length();
        V(J(), sb2, kotlinType, null, 2, null);
        boolean z11 = sb2.length() != length;
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        boolean zIsSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean zIsMarkedNullable = kotlinType.isMarkedNullable();
        boolean z12 = zIsMarkedNullable || (z11 && receiverTypeFromFunctionType != null);
        if (z12) {
            if (zIsSuspendFunctionType) {
                sb2.insert(length, CoreConstants.LEFT_PARENTHESIS_CHAR);
            } else {
                if (z11) {
                    a.c(t.Q1(sb2));
                    if (sb2.charAt(t.p0(sb2) - 1) != ')') {
                        sb2.insert(t.p0(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb2.append("context(");
            Iterator<KotlinType> it = contextReceiverTypesFromFunctionType.subList(0, v.o(contextReceiverTypesFromFunctionType)).iterator();
            while (it.hasNext()) {
                t0(sb2, it.next());
                sb2.append(", ");
            }
            t0(sb2, (KotlinType) v.A0(contextReceiverTypesFromFunctionType));
            sb2.append(") ");
        }
        r0(sb2, zIsSuspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            boolean z13 = (X0(receiverTypeFromFunctionType) && !receiverTypeFromFunctionType.isMarkedNullable()) || L(receiverTypeFromFunctionType) || (receiverTypeFromFunctionType instanceof DefinitelyNotNullType);
            if (z13) {
                sb2.append("(");
            }
            t0(sb2, receiverTypeFromFunctionType);
            if (z13) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!FunctionTypesKt.isBuiltinExtensionFunctionalType(kotlinType) || kotlinType.getArguments().size() > 1) {
            int i11 = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
                int i12 = i11 + 1;
                if (i11 > 0) {
                    sb2.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    KotlinType type = typeProjection.getType();
                    s.j(type, "getType(...)");
                    nameExtractParameterNameFromFunctionTypeArgument = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                } else {
                    nameExtractParameterNameFromFunctionTypeArgument = null;
                }
                if (nameExtractParameterNameFromFunctionTypeArgument != null) {
                    sb2.append(renderName(nameExtractParameterNameFromFunctionTypeArgument, false));
                    sb2.append(": ");
                }
                sb2.append(renderTypeProjection(typeProjection));
                i11 = i12;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(F());
        sb2.append(" ");
        t0(sb2, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z12) {
            sb2.append(")");
        }
        if (zIsMarkedNullable) {
            sb2.append(CallerData.NA);
        }
    }

    private final void l0(VariableDescriptor variableDescriptor, StringBuilder sb2) {
        ConstantValue<?> constantValueMo497getCompileTimeInitializer;
        String strA0;
        if (!getIncludePropertyConstant() || (constantValueMo497getCompileTimeInitializer = variableDescriptor.mo497getCompileTimeInitializer()) == null || (strA0 = a0(constantValueMo497getCompileTimeInitializer)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(G(strA0));
    }

    private final String m0(String str) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!getBoldOnlyForNamesInHtml()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    private final void n0(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb2.append("*/ ");
        }
    }

    private final void o0(MemberDescriptor memberDescriptor, StringBuilder sb2) {
        r0(sb2, memberDescriptor.isExternal(), "external");
        boolean z11 = false;
        r0(sb2, getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        if (getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual()) {
            z11 = true;
        }
        r0(sb2, z11, "actual");
    }

    private final void p0(Modality modality, StringBuilder sb2, Modality modality2) {
        if (getRenderDefaultModality() || modality != modality2) {
            r0(sb2, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
        }
    }

    private final void q0(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && P(callableMemberDescriptor)) {
            return;
        }
        Modality modality = callableMemberDescriptor.getModality();
        s.j(modality, "getModality(...)");
        p0(modality, sb2, M(callableMemberDescriptor));
    }

    private final void r0(StringBuilder sb2, boolean z11, String str) {
        if (z11) {
            sb2.append(m0(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(DeclarationDescriptor declarationDescriptor, StringBuilder sb2, boolean z11) {
        Name name = declarationDescriptor.getName();
        s.j(name, "getName(...)");
        sb2.append(renderName(name, z11));
    }

    private final void t0(StringBuilder sb2, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        AbbreviatedType abbreviatedType = unwrappedTypeUnwrap instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeUnwrap : null;
        if (abbreviatedType == null) {
            u0(sb2, kotlinType);
            return;
        }
        if (getRenderTypeExpansions()) {
            u0(sb2, abbreviatedType.getExpandedType());
            if (getRenderAbbreviatedTypeComments()) {
                Q(sb2, abbreviatedType);
                return;
            }
            return;
        }
        u0(sb2, abbreviatedType.getAbbreviation());
        if (getRenderUnabbreviatedType()) {
            g0(sb2, abbreviatedType);
        }
    }

    private final void u0(StringBuilder sb2, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb2.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            sb2.append(((FlexibleType) unwrappedTypeUnwrap).render(this, this));
        } else {
            if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(sb2, (SimpleType) unwrappedTypeUnwrap);
        }
    }

    private final void v0(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && P(callableMemberDescriptor) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            r0(sb2, true, "override");
            if (getVerbose()) {
                sb2.append("/*");
                sb2.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
        x0(packageFragmentDescriptor.getFqName(), "package-fragment", sb2);
        if (getDebugMode()) {
            sb2.append(" in ");
            s0(packageFragmentDescriptor.getContainingDeclaration(), sb2, false);
        }
    }

    private final void x0(FqName fqName, String str, StringBuilder sb2) {
        sb2.append(m0(str));
        FqNameUnsafe unsafe = fqName.toUnsafe();
        s.j(unsafe, "toUnsafe(...)");
        String strRenderFqName = renderFqName(unsafe);
        if (strRenderFqName.length() > 0) {
            sb2.append(" ");
            sb2.append(strRenderFqName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
        x0(packageViewDescriptor.getFqName(), "package", sb2);
        if (getDebugMode()) {
            sb2.append(" in context of ");
            s0(packageViewDescriptor.getModule(), sb2, false);
        }
    }

    private final void z0(StringBuilder sb2, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            z0(sb2, outerType);
            sb2.append(CoreConstants.DOT);
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            s.j(name, "getName(...)");
            sb2.append(renderName(name, false));
        } else {
            TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            s.j(typeConstructor, "getTypeConstructor(...)");
            sb2.append(renderTypeConstructor(typeConstructor));
        }
        sb2.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.f88364a.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.f88364a.getAlwaysRenderModifiers();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.f88364a.getAnnotationArgumentsRenderingPolicy();
    }

    public l<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.f88364a.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.f88364a.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.f88364a.getClassWithPrimaryConstructor();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.f88364a.getClassifierNamePolicy();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.f88364a.getDebugMode();
    }

    public l<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.f88364a.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.f88364a.getEachAnnotationOnNewLine();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.f88364a.getEnhancedTypes();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return this.f88364a.getExcludedAnnotationClasses();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.f88364a.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.f88364a.getIncludeAdditionalModifiers();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getIncludeAnnotationArguments() {
        return this.f88364a.getIncludeAnnotationArguments();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getIncludeEmptyAnnotationArguments() {
        return this.f88364a.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.f88364a.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.f88364a.getInformativeErrorType();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return this.f88364a.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.f88364a.getNormalizedVisibilities();
    }

    public final DescriptorRendererOptionsImpl getOptions() {
        return this.f88364a;
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.f88364a.getOverrideRenderingPolicy();
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.f88364a.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.f88364a.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.f88364a.getPresentableUnresolvedTypes();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.f88364a.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.f88364a.getReceiverAfterName();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return this.f88364a.getRenderAbbreviatedTypeComments();
    }

    public boolean getRenderCompanionObjectName() {
        return this.f88364a.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.f88364a.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.f88364a.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.f88364a.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.f88364a.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.f88364a.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.f88364a.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.f88364a.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.f88364a.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.f88364a.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.f88364a.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.f88364a.getStartFromName();
    }

    public RenderingFormat getTextFormat() {
        return this.f88364a.getTextFormat();
    }

    public l<KotlinType, KotlinType> getTypeNormalizer() {
        return this.f88364a.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.f88364a.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.f88364a.getUnitReturnType();
    }

    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.f88364a.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.f88364a.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.f88364a.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.f88364a.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.f88364a.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.f88364a.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.f88364a.getWithoutTypeParameters();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String render(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), sb2);
        if (getWithDefinedIn()) {
            C(sb2, declarationDescriptor);
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderAnnotation(AnnotationDescriptor annotation, AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        s.k(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + CoreConstants.COLON_CHAR);
        }
        KotlinType type = annotation.getType();
        sb2.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            List<String> listT = T(annotation);
            if (getIncludeEmptyAnnotationArguments() || !listT.isEmpty()) {
                g0.v0(listT, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().mo500getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public String renderClassifierName(ClassifierDescriptor klass) {
        s.k(klass, "klass");
        return ErrorUtils.isError(klass) ? klass.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(klass, this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFlexibleType(String lowerRendered, String upperRendered, KotlinBuiltIns builtIns) {
        s.k(lowerRendered, "lowerRendered");
        s.k(upperRendered, "upperRendered");
        s.k(builtIns, "builtIns");
        if (RenderingUtilsKt.typeStringsDifferOnlyInNullability(lowerRendered, upperRendered)) {
            if (!t.b0(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return CoreConstants.LEFT_PARENTHESIS_CHAR + lowerRendered + ")!";
        }
        ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
        ClassDescriptor collection = builtIns.getCollection();
        s.j(collection, "getCollection(...)");
        String strZ1 = t.z1(classifierNamePolicy.renderClassifier(collection, this), "Collection", null, 2, null);
        String strReplacePrefixesInTypeRepresentations = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, strZ1 + "Mutable", upperRendered, strZ1, strZ1 + CoreConstants.LEFT_PARENTHESIS_CHAR + "Mutable" + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (strReplacePrefixesInTypeRepresentations != null) {
            return strReplacePrefixesInTypeRepresentations;
        }
        String strReplacePrefixesInTypeRepresentations2 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, strZ1 + "MutableMap.MutableEntry", upperRendered, strZ1 + "Map.Entry", strZ1 + "(Mutable)Map.(Mutable)Entry");
        if (strReplacePrefixesInTypeRepresentations2 != null) {
            return strReplacePrefixesInTypeRepresentations2;
        }
        ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
        ClassDescriptor array = builtIns.getArray();
        s.j(array, "getArray(...)");
        String strZ2 = t.z1(classifierNamePolicy2.renderClassifier(array, this), "Array", null, 2, null);
        String strReplacePrefixesInTypeRepresentations3 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, strZ2 + G("Array<"), upperRendered, strZ2 + G("Array<out "), strZ2 + G("Array<(out) "));
        if (strReplacePrefixesInTypeRepresentations3 != null) {
            return strReplacePrefixesInTypeRepresentations3;
        }
        return CoreConstants.LEFT_PARENTHESIS_CHAR + lowerRendered + CallerDataConverter.DEFAULT_RANGE_DELIMITER + upperRendered + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFqName(FqNameUnsafe fqName) {
        s.k(fqName, "fqName");
        List<Name> listPathSegments = fqName.pathSegments();
        s.j(listPathSegments, "pathSegments(...)");
        return i0(listPathSegments);
    }

    public String renderMessage(String message) {
        s.k(message, "message");
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 == 1) {
            return message;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderName(Name name, boolean z11) {
        s.k(name, "name");
        String strG = G(RenderingUtilsKt.render(name));
        if (!getBoldOnlyForNamesInHtml() || getTextFormat() != RenderingFormat.HTML || !z11) {
            return strG;
        }
        return "<b>" + strG + "</b>";
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderType(KotlinType type) {
        s.k(type, "type");
        StringBuilder sb2 = new StringBuilder();
        t0(sb2, getTypeNormalizer().invoke(type));
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public String renderTypeArguments(List<? extends TypeProjection> typeArguments) throws IOException {
        s.k(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(O());
        D(sb2, typeArguments);
        sb2.append(K());
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public String renderTypeConstructor(TypeConstructor typeConstructor) {
        s.k(typeConstructor, "typeConstructor");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = typeConstructor.mo500getDeclarationDescriptor();
        if ((classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor) || (classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor) || (classifierDescriptorMo500getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            return renderClassifierName(classifierDescriptorMo500getDeclarationDescriptor);
        }
        if (classifierDescriptorMo500getDeclarationDescriptor == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(m.f88407a) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + classifierDescriptorMo500getDeclarationDescriptor.getClass()).toString());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderTypeProjection(TypeProjection typeProjection) throws IOException {
        s.k(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        D(sb2, v.e(typeProjection));
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        s.k(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f88364a.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        s.k(classifierNamePolicy, "<set-?>");
        this.f88364a.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z11) {
        this.f88364a.setDebugMode(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        s.k(set, "<set-?>");
        this.f88364a.setExcludedTypeAnnotationClasses(set);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        s.k(set, "<set-?>");
        this.f88364a.setModifiers(set);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        s.k(parameterNameRenderingPolicy, "<set-?>");
        this.f88364a.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z11) {
        this.f88364a.setReceiverAfterName(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z11) {
        this.f88364a.setRenderCompanionObjectName(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z11) {
        this.f88364a.setStartFromName(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(RenderingFormat renderingFormat) {
        s.k(renderingFormat, "<set-?>");
        this.f88364a.setTextFormat(renderingFormat);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z11) {
        this.f88364a.setVerbose(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z11) {
        this.f88364a.setWithDefinedIn(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z11) {
        this.f88364a.setWithoutSuperTypes(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z11) {
        this.f88364a.setWithoutTypeParameters(z11);
    }
}
