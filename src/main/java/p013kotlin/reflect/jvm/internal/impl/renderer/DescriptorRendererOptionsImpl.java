package p013kotlin.reflect.jvm.internal.impl.renderer;

import co0.m;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.c;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.z;
import p013kotlin.properties.ObservableProperty;
import p013kotlin.properties.a;
import p013kotlin.properties.d;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    static final /* synthetic */ m<Object>[] Z = {o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), o0.f(new z(o0.b(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    private final d A;
    private final d B;
    private final d C;
    private final d D;
    private final d E;
    private final d F;
    private final d G;
    private final d H;
    private final d I;
    private final d J;
    private final d K;
    private final d L;
    private final d M;
    private final d N;
    private final d O;
    private final d P;
    private final d Q;
    private final d R;
    private final d S;
    private final d T;
    private final d U;
    private final d V;
    private final d W;
    private final d X;
    private final d Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f88367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f88368b = d(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f88369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f88370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f88371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f88372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f88373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f88374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f88375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f88376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f88377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f88378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d f88379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f88380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d f88381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d f88382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f88383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final d f88384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f88385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d f88386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final d f88387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d f88388v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final d f88389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final d f88390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final d f88391y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final d f88392z;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f88369c = d(bool);
        this.f88370d = d(bool);
        this.f88371e = d(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f88372f = d(bool2);
        this.f88373g = d(bool2);
        this.f88374h = d(bool2);
        this.f88375i = d(bool2);
        this.f88376j = d(bool2);
        this.f88377k = d(bool);
        this.f88378l = d(bool2);
        this.f88379m = d(bool2);
        this.f88380n = d(bool2);
        this.f88381o = d(bool);
        this.f88382p = d(bool);
        this.f88383q = d(bool2);
        this.f88384r = d(bool2);
        this.f88385s = d(bool2);
        this.f88386t = d(bool2);
        this.f88387u = d(bool2);
        this.f88388v = d(null);
        this.f88389w = d(bool2);
        this.f88390x = d(bool2);
        this.f88391y = d(r.f88412a);
        this.f88392z = d(s.f88413a);
        this.A = d(bool);
        this.B = d(OverrideRenderingPolicy.RENDER_OPEN);
        this.C = d(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE);
        this.D = d(RenderingFormat.PLAIN);
        this.E = d(ParameterNameRenderingPolicy.ALL);
        this.F = d(bool2);
        this.G = d(bool2);
        this.H = d(PropertyAccessorRenderingPolicy.DEBUG);
        this.I = d(bool2);
        this.J = d(bool2);
        this.K = d(d1.d());
        this.L = d(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve());
        this.M = d(null);
        this.N = d(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.O = d(bool2);
        this.P = d(bool);
        this.Q = d(bool);
        this.R = d(bool2);
        this.S = d(bool2);
        this.T = d(bool);
        this.U = d(bool);
        this.V = d(bool2);
        this.W = d(bool2);
        this.X = d(bool2);
        this.Y = d(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(ValueParameterDescriptor it) {
        s.k(it, "it");
        return "...";
    }

    private final <T> d<DescriptorRendererOptionsImpl, T> d(final T t11) {
        a aVar = a.f86546a;
        return new ObservableProperty<T>(t11) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1
            @Override // p013kotlin.properties.ObservableProperty
            protected boolean beforeChange(m<?> property, T t12, T t13) {
                s.k(property, "property");
                if (this.isLocked()) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType e(KotlinType it) {
        s.k(it, "it");
        return it;
    }

    public final DescriptorRendererOptionsImpl copy() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Iterator itA = c.a(DescriptorRendererOptionsImpl.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    s.j(name, "getName(...)");
                    t.b0(name, "is", false, 2, null);
                    co0.d dVarB = o0.b(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    s.j(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        s.j(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.d(observableProperty.getValue(this, new f0(dVarB, name2, sb2.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean) this.f88385s.getValue(this, Z[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) this.O.getValue(this, Z[39])).booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) this.N.getValue(this, Z[38]);
    }

    public l<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return (l) this.M.getValue(this, Z[37]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean) this.X.getValue(this, Z[48])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) this.f88375i.getValue(this, Z[7])).booleanValue();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) this.f88368b.getValue(this, Z[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return ((Boolean) this.f88374h.getValue(this, Z[6])).booleanValue();
    }

    public l<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return (l) this.f88392z.getValue(this, Z[24]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean) this.J.getValue(this, Z[34])).booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return ((Boolean) this.f88379m.getValue(this, Z[11])).booleanValue();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) this.K.getValue(this, Z[35]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) this.L.getValue(this, Z[36]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) this.T.getValue(this, Z[44])).booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getIncludeAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeAnnotationArguments(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getIncludeEmptyAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) this.f88387u.getValue(this, Z[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((Boolean) this.Y.getValue(this, Z[49])).booleanValue();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) this.f88371e.getValue(this, Z[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) this.f88380n.getValue(this, Z[12])).booleanValue();
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) this.B.getValue(this, Z[26]);
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) this.E.getValue(this, Z[29]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) this.U.getValue(this, Z[45])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean) this.W.getValue(this, Z[47])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy) this.H.getValue(this, Z[32]);
    }

    public l<ConstantValue<?>, String> getPropertyConstantRenderer() {
        return (l) this.f88388v.getValue(this, Z[20]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) this.F.getValue(this, Z[30])).booleanValue();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return ((Boolean) this.S.getValue(this, Z[43])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) this.G.getValue(this, Z[31])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean) this.f88383q.getValue(this, Z[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) this.P.getValue(this, Z[40])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) this.I.getValue(this, Z[33])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean) this.f88382p.getValue(this, Z[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) this.f88381o.getValue(this, Z[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean) this.f88384r.getValue(this, Z[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean) this.R.getValue(this, Z[42])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) this.Q.getValue(this, Z[41])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) this.A.getValue(this, Z[25])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) this.f88373g.getValue(this, Z[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) this.f88372f.getValue(this, Z[4])).booleanValue();
    }

    public RenderingFormat getTextFormat() {
        return (RenderingFormat) this.D.getValue(this, Z[28]);
    }

    public l<KotlinType, KotlinType> getTypeNormalizer() {
        return (l) this.f88391y.getValue(this, Z[23]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) this.f88386t.getValue(this, Z[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) this.f88377k.getValue(this, Z[9])).booleanValue();
    }

    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return (DescriptorRenderer.ValueParametersHandler) this.C.getValue(this, Z[27]);
    }

    public boolean getVerbose() {
        return ((Boolean) this.f88376j.getValue(this, Z[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) this.f88369c.getValue(this, Z[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) this.f88370d.getValue(this, Z[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) this.f88378l.getValue(this, Z[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) this.f88390x.getValue(this, Z[22])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) this.f88389w.getValue(this, Z[21])).booleanValue();
    }

    public final boolean isLocked() {
        return this.f88367a;
    }

    public final void lock() {
        this.f88367a = true;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        s.k(annotationArgumentsRenderingPolicy, "<set-?>");
        this.N.setValue(this, Z[38], annotationArgumentsRenderingPolicy);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        s.k(classifierNamePolicy, "<set-?>");
        this.f88368b.setValue(this, Z[0], classifierNamePolicy);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z11) {
        this.f88374h.setValue(this, Z[6], Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        s.k(set, "<set-?>");
        this.L.setValue(this, Z[36], set);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        s.k(set, "<set-?>");
        this.f88371e.setValue(this, Z[3], set);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        s.k(parameterNameRenderingPolicy, "<set-?>");
        this.E.setValue(this, Z[29], parameterNameRenderingPolicy);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z11) {
        this.F.setValue(this, Z[30], Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z11) {
        this.G.setValue(this, Z[31], Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z11) {
        this.f88372f.setValue(this, Z[4], Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(RenderingFormat renderingFormat) {
        s.k(renderingFormat, "<set-?>");
        this.D.setValue(this, Z[28], renderingFormat);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z11) {
        this.f88376j.setValue(this, Z[8], Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z11) {
        this.f88369c.setValue(this, Z[1], Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z11) {
        this.f88390x.setValue(this, Z[22], Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z11) {
        this.f88389w.setValue(this, Z[21], Boolean.valueOf(z11));
    }
}
