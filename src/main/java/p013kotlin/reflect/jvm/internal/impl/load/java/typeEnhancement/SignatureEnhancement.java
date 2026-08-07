package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.RawType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaTypeEnhancement f87445a;

    public SignatureEnhancement(JavaTypeEnhancement typeEnhancement) {
        s.k(typeEnhancement, "typeEnhancement");
        this.f87445a = typeEnhancement;
    }

    private final boolean f(KotlinType kotlinType) {
        return TypeUtils.contains(kotlinType, t0.f87503a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean g(UnwrappedType unwrappedType) {
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = unwrappedType.getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorMo500getDeclarationDescriptor.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        return Boolean.valueOf(s.f(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && s.f(DescriptorUtilsKt.fqNameOrNull(classifierDescriptorMo500getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
    }

    private final KotlinType h(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z11, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z12, l<? super CallableMemberDescriptor, ? extends KotlinType> lVar) {
        u0 u0Var = new u0(annotated, z11, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinTypeInvoke = lVar.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(v.y(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            s.h(callableMemberDescriptor2);
            arrayList.add(lVar.invoke(callableMemberDescriptor2));
        }
        return i(u0Var, kotlinTypeInvoke, arrayList, typeEnhancementInfo, z12);
    }

    private final KotlinType i(u0 u0Var, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z11) {
        return this.f87445a.enhance(kotlinType, u0Var.computeIndexedQualifiers(kotlinType, list, typeEnhancementInfo, z11), u0Var.getSkipRawTypeArguments());
    }

    static /* synthetic */ KotlinType j(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z11, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z12, l lVar, int i11, Object obj) {
        return signatureEnhancement.h(callableMemberDescriptor, annotated, z11, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i11 & 32) != 0 ? false : z12, lVar);
    }

    static /* synthetic */ KotlinType k(SignatureEnhancement signatureEnhancement, u0 u0Var, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return signatureEnhancement.i(u0Var, kotlinType, list, typeEnhancementInfo2, z11);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0223, code lost:
    
        if (r3 == null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D l(D r18, p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r19) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.l(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType m(CallableMemberDescriptor it) {
        s.k(it, "it");
        KotlinType returnType = it.getReturnType();
        s.h(returnType);
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType n(CallableMemberDescriptor it) {
        s.k(it, "it");
        ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
        s.h(extensionReceiverParameter);
        KotlinType type = extensionReceiverParameter.getType();
        s.j(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType o(ValueParameterDescriptor valueParameterDescriptor, CallableMemberDescriptor it) {
        s.k(it, "it");
        KotlinType type = it.getValueParameters().get(valueParameterDescriptor.getIndex()).getType();
        s.j(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(UnwrappedType it) {
        s.k(it, "it");
        return it instanceof RawType;
    }

    private final KotlinType q(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z11, l<? super CallableMemberDescriptor, ? extends KotlinType> lVar) {
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers;
        return h(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z11, lVar);
    }

    private final <D extends CallableMemberDescriptor> Annotations r(D d11, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d11);
        if (topLevelContainingClassifier == null) {
            return d11.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
        List<JavaAnnotation> list = moduleAnnotations;
        if (list == null || list.isEmpty()) {
            return d11.getAnnotations();
        }
        List<JavaAnnotation> list2 = moduleAnnotations;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
        }
        return Annotations.Companion.create(v.N0(d11.getAnnotations(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext c11, Collection<? extends D> platformSignatures) {
        s.k(c11, "c");
        s.k(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        ArrayList arrayList = new ArrayList(v.y(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(l((CallableMemberDescriptor) it.next(), c11));
        }
        return arrayList;
    }

    public final KotlinType enhanceSuperType(KotlinType type, LazyJavaResolverContext context) {
        s.k(type, "type");
        s.k(context, "context");
        KotlinType kotlinTypeK = k(this, new u0(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type, v.m(), null, false, 12, null);
        return kotlinTypeK == null ? type : kotlinTypeK;
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameter, List<? extends KotlinType> bounds, LazyJavaResolverContext context) {
        KotlinType kotlinType;
        KotlinType kotlinTypeK;
        s.k(typeParameter, "typeParameter");
        s.k(bounds, "bounds");
        s.k(context, "context");
        List<? extends KotlinType> list = bounds;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (KotlinType kotlinType2 : list) {
            if (TypeUtilsKt.contains(kotlinType2, s0.f87500a)) {
                kotlinType = kotlinType2;
            } else {
                kotlinType = kotlinType2;
                kotlinTypeK = k(this, new u0(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, v.m(), null, false, 12, null);
                if (kotlinTypeK == null) {
                }
                arrayList.add(kotlinTypeK);
            }
            kotlinTypeK = kotlinType;
            arrayList.add(kotlinTypeK);
        }
        return arrayList;
    }
}
