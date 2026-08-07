package p013kotlin.reflect.jvm.internal.impl.renderer;

import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DescriptorRenderer {
    public static final DescriptorRenderer COMPACT;
    public static final DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES;
    public static final DescriptorRenderer COMPACT_WITH_MODIFIERS;
    public static final DescriptorRenderer COMPACT_WITH_SHORT_TYPES;
    public static final Companion Companion;
    public static final DescriptorRenderer DEBUG_TEXT;
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES;
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS;
    public static final DescriptorRenderer HTML;
    public static final DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES;
    public static final DescriptorRenderer SHORT_NAMES_IN_TYPES;
    public static final DescriptorRenderer WITHOUT_MODIFIERS;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getClassifierKindPrefix(ClassifierDescriptorWithTypeParameters classifier) {
            s.k(classifier, "classifier");
            if (classifier instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (!(classifier instanceof ClassDescriptor)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifier;
            if (classDescriptor.isCompanionObject()) {
                return "companion object";
            }
            switch (WhenMappings.$EnumSwitchMapping$0[classDescriptor.getKind().ordinal()]) {
                case 1:
                    return Action.CLASS_ATTRIBUTE;
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final DescriptorRenderer withOptions(l<? super DescriptorRendererOptions, h0> changeOptions) {
            s.k(changeOptions, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.lock();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        private Companion() {
        }
    }

    public interface ValueParametersHandler {

        public static final class DEFAULT implements ValueParametersHandler {
            public static final DEFAULT INSTANCE = new DEFAULT();

            private DEFAULT() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameter(ValueParameterDescriptor parameter, int i11, int i12, StringBuilder builder) {
                s.k(parameter, "parameter");
                s.k(builder, "builder");
                if (i11 != i12 - 1) {
                    builder.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameters(int i11, StringBuilder builder) {
                s.k(builder, "builder");
                builder.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameter(ValueParameterDescriptor parameter, int i11, int i12, StringBuilder builder) {
                s.k(parameter, "parameter");
                s.k(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameters(int i11, StringBuilder builder) {
                s.k(builder, "builder");
                builder.append("(");
            }
        }

        void appendAfterValueParameter(ValueParameterDescriptor valueParameterDescriptor, int i11, int i12, StringBuilder sb2);

        void appendAfterValueParameters(int i11, StringBuilder sb2);

        void appendBeforeValueParameter(ValueParameterDescriptor valueParameterDescriptor, int i11, int i12, StringBuilder sb2);

        void appendBeforeValueParameters(int i11, StringBuilder sb2);
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        WITHOUT_MODIFIERS = companion.withOptions(a.f88395a);
        COMPACT_WITH_MODIFIERS = companion.withOptions(c.f88397a);
        COMPACT = companion.withOptions(d.f88398a);
        COMPACT_WITHOUT_SUPERTYPES = companion.withOptions(e.f88399a);
        COMPACT_WITH_SHORT_TYPES = companion.withOptions(f.f88400a);
        ONLY_NAMES_WITH_SHORT_TYPES = companion.withOptions(g.f88401a);
        FQ_NAMES_IN_TYPES = companion.withOptions(h.f88402a);
        FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS = companion.withOptions(i.f88403a);
        SHORT_NAMES_IN_TYPES = companion.withOptions(j.f88404a);
        DEBUG_TEXT = companion.withOptions(k.f88405a);
        HTML = companion.withOptions(b.f88396a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setWithDefinedIn(false);
        withOptions.setModifiers(d1.d());
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setWithDefinedIn(false);
        withOptions.setModifiers(d1.d());
        withOptions.setWithoutSuperTypes(true);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setWithDefinedIn(false);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setModifiers(d1.d());
        withOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
        withOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setDebugMode(true);
        withOptions.setClassifierNamePolicy(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
        withOptions.setModifiers(DescriptorRendererModifier.ALL);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setModifiers(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setModifiers(DescriptorRendererModifier.ALL);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 h(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setTextFormat(RenderingFormat.HTML);
        withOptions.setModifiers(DescriptorRendererModifier.ALL);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setWithDefinedIn(false);
        withOptions.setModifiers(d1.d());
        withOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
        withOptions.setWithoutTypeParameters(true);
        withOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.NONE);
        withOptions.setReceiverAfterName(true);
        withOptions.setRenderCompanionObjectName(true);
        withOptions.setWithoutSuperTypes(true);
        withOptions.setStartFromName(true);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
        withOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(DescriptorRendererOptions withOptions) {
        s.k(withOptions, "$this$withOptions");
        withOptions.setModifiers(d1.d());
        return h0.f84049a;
    }

    public static /* synthetic */ String renderAnnotation$default(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i11 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.renderAnnotation(annotationDescriptor, annotationUseSiteTarget);
    }

    public abstract String render(DeclarationDescriptor declarationDescriptor);

    public abstract String renderAnnotation(AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract String renderFlexibleType(String str, String str2, KotlinBuiltIns kotlinBuiltIns);

    public abstract String renderFqName(FqNameUnsafe fqNameUnsafe);

    public abstract String renderName(Name name, boolean z11);

    public abstract String renderType(KotlinType kotlinType);

    public abstract String renderTypeProjection(TypeProjection typeProjection);

    public final DescriptorRenderer withOptions(l<? super DescriptorRendererOptions, h0> changeOptions) {
        s.k(changeOptions, "changeOptions");
        s.i(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplCopy = ((DescriptorRendererImpl) this).getOptions().copy();
        changeOptions.invoke(descriptorRendererOptionsImplCopy);
        descriptorRendererOptionsImplCopy.lock();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplCopy);
    }
}
