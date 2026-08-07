package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f86963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f86964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f86965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f86966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final KotlinType f86967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ValueParameterDescriptor f86968k;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ValueParameterDescriptorImpl createWithDestructuringDeclarations(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i11, Annotations annotations, Name name, KotlinType outType, boolean z11, boolean z12, boolean z13, KotlinType kotlinType, SourceElement source, a<? extends List<? extends VariableDescriptor>> aVar) {
            s.k(containingDeclaration, "containingDeclaration");
            s.k(annotations, "annotations");
            s.k(name, "name");
            s.k(outType, "outType");
            s.k(source, "source");
            return aVar == null ? new ValueParameterDescriptorImpl(containingDeclaration, valueParameterDescriptor, i11, annotations, name, outType, z11, z12, z13, kotlinType, source) : new WithDestructuringDeclaration(containingDeclaration, valueParameterDescriptor, i11, annotations, name, outType, z11, z12, z13, kotlinType, source, aVar);
        }

        private Companion() {
        }
    }

    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Lazy f86969l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i11, Annotations annotations, Name name, KotlinType outType, boolean z11, boolean z12, boolean z13, KotlinType kotlinType, SourceElement source, a<? extends List<? extends VariableDescriptor>> destructuringVariables) {
            super(containingDeclaration, valueParameterDescriptor, i11, annotations, name, outType, z11, z12, z13, kotlinType, source);
            s.k(containingDeclaration, "containingDeclaration");
            s.k(annotations, "annotations");
            s.k(name, "name");
            s.k(outType, "outType");
            s.k(source, "source");
            s.k(destructuringVariables, "destructuringVariables");
            this.f86969l = m.b(destructuringVariables);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List c(WithDestructuringDeclaration withDestructuringDeclaration) {
            return withDestructuringDeclaration.getDestructuringVariables();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        public ValueParameterDescriptor copy(CallableDescriptor newOwner, Name newName, int i11) {
            s.k(newOwner, "newOwner");
            s.k(newName, "newName");
            Annotations annotations = getAnnotations();
            s.j(annotations, "<get-annotations>(...)");
            KotlinType type = getType();
            s.j(type, "getType(...)");
            boolean zDeclaresDefaultValue = declaresDefaultValue();
            boolean zIsCrossinline = isCrossinline();
            boolean zIsNoinline = isNoinline();
            KotlinType varargElementType = getVarargElementType();
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            s.j(NO_SOURCE, "NO_SOURCE");
            return new WithDestructuringDeclaration(newOwner, null, i11, annotations, newName, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, NO_SOURCE, new j(this));
        }

        public final List<VariableDescriptor> getDestructuringVariables() {
            return (List) this.f86969l.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i11, Annotations annotations, Name name, KotlinType outType, boolean z11, boolean z12, boolean z13, KotlinType kotlinType, SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        s.k(containingDeclaration, "containingDeclaration");
        s.k(annotations, "annotations");
        s.k(name, "name");
        s.k(outType, "outType");
        s.k(source, "source");
        this.f86963f = i11;
        this.f86964g = z11;
        this.f86965h = z12;
        this.f86966i = z13;
        this.f86967j = kotlinType;
        this.f86968k = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    public static final ValueParameterDescriptorImpl createWithDestructuringDeclarations(CallableDescriptor callableDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i11, Annotations annotations, Name name, KotlinType kotlinType, boolean z11, boolean z12, boolean z13, KotlinType kotlinType2, SourceElement sourceElement, a<? extends List<? extends VariableDescriptor>> aVar) {
        return Companion.createWithDestructuringDeclarations(callableDescriptor, valueParameterDescriptor, i11, annotations, name, kotlinType, z11, z12, z13, kotlinType2, sourceElement, aVar);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> visitor, D d11) {
        s.k(visitor, "visitor");
        return visitor.visitValueParameterDescriptor(this, d11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public ValueParameterDescriptor copy(CallableDescriptor newOwner, Name newName, int i11) {
        s.k(newOwner, "newOwner");
        s.k(newName, "newName");
        Annotations annotations = getAnnotations();
        s.j(annotations, "<get-annotations>(...)");
        KotlinType type = getType();
        s.j(type, "getType(...)");
        boolean zDeclaresDefaultValue = declaresDefaultValue();
        boolean zIsCrossinline = isCrossinline();
        boolean zIsNoinline = isNoinline();
        KotlinType varargElementType = getVarargElementType();
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        s.j(NO_SOURCE, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(newOwner, null, i11, annotations, newName, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, NO_SOURCE);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean declaresDefaultValue() {
        if (!this.f86964g) {
            return false;
        }
        CallableDescriptor containingDeclaration = getContainingDeclaration();
        s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((CallableMemberDescriptor) containingDeclaration).getKind().isReal();
    }

    public Void getCompileTimeInitializer() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.f86963f;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<ValueParameterDescriptor> getOverriddenDescriptors() {
        Collection<? extends CallableDescriptor> overriddenDescriptors = getContainingDeclaration().getOverriddenDescriptors();
        s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(v.y(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallableDescriptor) it.next()).getValueParameters().get(getIndex()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public KotlinType getVarargElementType() {
        return this.f86967j;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility LOCAL = DescriptorVisibilities.LOCAL;
        s.j(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isCrossinline() {
        return this.f86965h;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return ValueParameterDescriptor.DefaultImpls.isLateInit(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isNoinline() {
        return this.f86966i;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: getCompileTimeInitializer, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ConstantValue mo497getCompileTimeInitializer() {
        return (ConstantValue) getCompileTimeInitializer();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public CallableDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (CallableDescriptor) containingDeclaration;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ValueParameterDescriptor substitute(TypeSubstitutor substitutor) {
        s.k(substitutor, "substitutor");
        if (substitutor.isEmpty()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ValueParameterDescriptor getOriginal() {
        ValueParameterDescriptor valueParameterDescriptor = this.f86968k;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.getOriginal();
    }
}
