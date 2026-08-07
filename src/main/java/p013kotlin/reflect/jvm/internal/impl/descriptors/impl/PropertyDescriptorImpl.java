package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p013kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {
    private FieldDescriptor A;
    private FieldDescriptor B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Modality f86921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DescriptorVisibility f86922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Collection<? extends PropertyDescriptor> f86923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PropertyDescriptor f86924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CallableMemberDescriptor.Kind f86925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f86926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f86927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f86928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f86929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f86930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f86931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<ReceiverParameterDescriptor> f86932t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ReceiverParameterDescriptor f86933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ReceiverParameterDescriptor f86934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<TypeParameterDescriptor> f86935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private PropertyGetterDescriptorImpl f86936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private PropertySetterDescriptor f86937y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f86938z;

    public class CopyConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DeclarationDescriptor f86939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Modality f86940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DescriptorVisibility f86941c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CallableMemberDescriptor.Kind f86944f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ReceiverParameterDescriptor f86947i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Name f86949k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private KotlinType f86950l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private PropertyDescriptor f86942d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f86943e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private TypeSubstitution f86945g = TypeSubstitution.EMPTY;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f86946h = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<TypeParameterDescriptor> f86948j = null;

        public CopyConfiguration() {
            this.f86939a = PropertyDescriptorImpl.this.getContainingDeclaration();
            this.f86940b = PropertyDescriptorImpl.this.getModality();
            this.f86941c = PropertyDescriptorImpl.this.getVisibility();
            this.f86944f = PropertyDescriptorImpl.this.getKind();
            this.f86947i = PropertyDescriptorImpl.this.f86933u;
            this.f86949k = PropertyDescriptorImpl.this.getName();
            this.f86950l = PropertyDescriptorImpl.this.getType();
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "setOwner";
            } else if (i11 == 2) {
                objArr[1] = "setOriginal";
            } else if (i11 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i11 == 5) {
                objArr[1] = "setReturnType";
            } else if (i11 == 7) {
                objArr[1] = "setModality";
            } else if (i11 == 9) {
                objArr[1] = "setVisibility";
            } else if (i11 == 11) {
                objArr[1] = "setKind";
            } else if (i11 == 19) {
                objArr[1] = "setName";
            } else if (i11 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i11 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i11 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i11 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 5 && i11 != 7 && i11 != 9 && i11 != 11 && i11 != 19 && i11 != 13 && i11 != 14 && i11 != 16 && i11 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public PropertyDescriptor build() {
            return PropertyDescriptorImpl.this.d(this);
        }

        PropertyGetterDescriptor n() {
            PropertyDescriptor propertyDescriptor = this.f86942d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getGetter();
        }

        PropertySetterDescriptor o() {
            PropertyDescriptor propertyDescriptor = this.f86942d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getSetter();
        }

        public CopyConfiguration setCopyOverrides(boolean z11) {
            this.f86946h = z11;
            return this;
        }

        public CopyConfiguration setKind(CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                a(10);
            }
            this.f86944f = kind;
            return this;
        }

        public CopyConfiguration setModality(Modality modality) {
            if (modality == null) {
                a(6);
            }
            this.f86940b = modality;
            return this;
        }

        public CopyConfiguration setOriginal(CallableMemberDescriptor callableMemberDescriptor) {
            this.f86942d = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        public CopyConfiguration setOwner(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                a(0);
            }
            this.f86939a = declarationDescriptor;
            return this;
        }

        public CopyConfiguration setSubstitution(TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                a(15);
            }
            this.f86945g = typeSubstitution;
            return this;
        }

        public CopyConfiguration setVisibility(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                a(8);
            }
            this.f86941c = descriptorVisibility;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected PropertyDescriptorImpl(DeclarationDescriptor declarationDescriptor, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z11, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(declarationDescriptor, annotations, name, null, z11, sourceElement);
        if (declarationDescriptor == null) {
            a(0);
        }
        if (annotations == null) {
            a(1);
        }
        if (modality == null) {
            a(2);
        }
        if (descriptorVisibility == null) {
            a(3);
        }
        if (name == null) {
            a(4);
        }
        if (kind == null) {
            a(5);
        }
        if (sourceElement == null) {
            a(6);
        }
        this.f86923k = null;
        this.f86932t = Collections.EMPTY_LIST;
        this.f86921i = modality;
        this.f86922j = descriptorVisibility;
        this.f86924l = propertyDescriptor == null ? this : propertyDescriptor;
        this.f86925m = kind;
        this.f86926n = z12;
        this.f86927o = z13;
        this.f86928p = z14;
        this.f86929q = z15;
        this.f86930r = z16;
        this.f86931s = z17;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        if (i11 != 28 && i11 != 38 && i11 != 39 && i11 != 41 && i11 != 42) {
            switch (i11) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i11 != 28 && i11 != 38 && i11 != 39 && i11 != 41 && i11 != 42) {
            switch (i11) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    i12 = 2;
                    break;
                default:
                    i12 = 3;
                    break;
            }
        } else {
            i12 = 2;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i11 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i11 == 38) {
            objArr[1] = "getOriginal";
        } else if (i11 == 39) {
            objArr[1] = "getKind";
        } else if (i11 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i11 != 42) {
            switch (i11) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 28 && i11 != 38 && i11 != 39 && i11 != 41 && i11 != 42) {
            switch (i11) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static PropertyDescriptorImpl create(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z11, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        if (declarationDescriptor == null) {
            a(7);
        }
        if (annotations == null) {
            a(8);
        }
        if (modality == null) {
            a(9);
        }
        if (descriptorVisibility == null) {
            a(10);
        }
        if (name == null) {
            a(11);
        }
        if (kind == null) {
            a(12);
        }
        if (sourceElement == null) {
            a(13);
        }
        return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z11, name, kind, sourceElement, z12, z13, z14, z15, z16, z17);
    }

    private SourceElement e(boolean z11, PropertyDescriptor propertyDescriptor) {
        SourceElement source;
        if (z11) {
            if (propertyDescriptor == null) {
                propertyDescriptor = getOriginal();
            }
            source = propertyDescriptor.getSource();
        } else {
            source = SourceElement.NO_SOURCE;
        }
        if (source == null) {
            a(28);
        }
        return source;
    }

    private static FunctionDescriptor f(TypeSubstitutor typeSubstitutor, PropertyAccessorDescriptor propertyAccessorDescriptor) {
        if (typeSubstitutor == null) {
            a(30);
        }
        if (propertyAccessorDescriptor == null) {
            a(31);
        }
        if (propertyAccessorDescriptor.getInitialSignatureDescriptor() != null) {
            return propertyAccessorDescriptor.getInitialSignatureDescriptor().substitute(typeSubstitutor);
        }
        return null;
    }

    private static DescriptorVisibility g(DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind) {
        return (kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(descriptorVisibility.normalize())) ? DescriptorVisibilities.INVISIBLE_FAKE : descriptorVisibility;
    }

    private static ReceiverParameterDescriptor h(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeSubstitute = typeSubstitutor.substitute(receiverParameterDescriptor.getType(), Variance.IN_VARIANCE);
        if (kotlinTypeSubstitute == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ContextReceiver(propertyDescriptor, kotlinTypeSubstitute, ((ImplicitContextReceiver) receiverParameterDescriptor.getValue()).getCustomLabelName(), receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    private static ReceiverParameterDescriptor i(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeSubstitute = typeSubstitutor.substitute(receiverParameterDescriptor.getType(), Variance.IN_VARIANCE);
        if (kotlinTypeSubstitute == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ExtensionReceiver(propertyDescriptor, kotlinTypeSubstitute, receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return declarationDescriptorVisitor.visitPropertyDescriptor(this, d11);
    }

    protected PropertyDescriptorImpl c(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            a(32);
        }
        if (modality == null) {
            a(33);
        }
        if (descriptorVisibility == null) {
            a(34);
        }
        if (kind == null) {
            a(35);
        }
        if (name == null) {
            a(36);
        }
        if (sourceElement == null) {
            a(37);
        }
        return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, isVar(), name, kind, sourceElement, isLateInit(), isConst(), isExpect(), isActual(), isExternal(), isDelegated());
    }

    protected PropertyDescriptor d(CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        a<NullableLazyValue<ConstantValue<?>>> aVar;
        if (copyConfiguration == null) {
            a(29);
        }
        PropertyDescriptorImpl propertyDescriptorImplC = c(copyConfiguration.f86939a, copyConfiguration.f86940b, copyConfiguration.f86941c, copyConfiguration.f86942d, copyConfiguration.f86944f, copyConfiguration.f86949k, e(copyConfiguration.f86943e, copyConfiguration.f86942d));
        List<TypeParameterDescriptor> typeParameters = copyConfiguration.f86948j == null ? getTypeParameters() : copyConfiguration.f86948j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorSubstituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, copyConfiguration.f86945g, propertyDescriptorImplC, arrayList);
        KotlinType kotlinType = copyConfiguration.f86950l;
        KotlinType kotlinTypeSubstitute = typeSubstitutorSubstituteTypeParameters.substitute(kotlinType, Variance.OUT_VARIANCE);
        if (kotlinTypeSubstitute == null) {
            return null;
        }
        KotlinType kotlinTypeSubstitute2 = typeSubstitutorSubstituteTypeParameters.substitute(kotlinType, Variance.IN_VARIANCE);
        if (kotlinTypeSubstitute2 != null) {
            propertyDescriptorImplC.setInType(kotlinTypeSubstitute2);
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = copyConfiguration.f86947i;
        if (receiverParameterDescriptor2 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorSubstitute = receiverParameterDescriptor2.substitute(typeSubstitutorSubstituteTypeParameters);
            if (receiverParameterDescriptorSubstitute == null) {
                return null;
            }
            receiverParameterDescriptor = receiverParameterDescriptorSubstitute;
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = this.f86934v;
        ReceiverParameterDescriptor receiverParameterDescriptorI = receiverParameterDescriptor3 != null ? i(typeSubstitutorSubstituteTypeParameters, propertyDescriptorImplC, receiverParameterDescriptor3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<ReceiverParameterDescriptor> it = this.f86932t.iterator();
        while (it.hasNext()) {
            ReceiverParameterDescriptor receiverParameterDescriptorH = h(typeSubstitutorSubstituteTypeParameters, propertyDescriptorImplC, it.next());
            if (receiverParameterDescriptorH != null) {
                arrayList2.add(receiverParameterDescriptorH);
            }
        }
        propertyDescriptorImplC.setType(kotlinTypeSubstitute, arrayList, receiverParameterDescriptor, receiverParameterDescriptorI, arrayList2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f86936x == null ? null : new PropertyGetterDescriptorImpl(propertyDescriptorImplC, this.f86936x.getAnnotations(), copyConfiguration.f86940b, g(this.f86936x.getVisibility(), copyConfiguration.f86944f), this.f86936x.isDefault(), this.f86936x.isExternal(), this.f86936x.isInline(), copyConfiguration.f86944f, copyConfiguration.n(), SourceElement.NO_SOURCE);
        if (propertyGetterDescriptorImpl != null) {
            KotlinType returnType = this.f86936x.getReturnType();
            propertyGetterDescriptorImpl.setInitialSignatureDescriptor(f(typeSubstitutorSubstituteTypeParameters, this.f86936x));
            propertyGetterDescriptorImpl.initialize(returnType != null ? typeSubstitutorSubstituteTypeParameters.substitute(returnType, Variance.OUT_VARIANCE) : null);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = this.f86937y == null ? null : new PropertySetterDescriptorImpl(propertyDescriptorImplC, this.f86937y.getAnnotations(), copyConfiguration.f86940b, g(this.f86937y.getVisibility(), copyConfiguration.f86944f), this.f86937y.isDefault(), this.f86937y.isExternal(), this.f86937y.isInline(), copyConfiguration.f86944f, copyConfiguration.o(), SourceElement.NO_SOURCE);
        if (propertySetterDescriptorImpl != null) {
            List<ValueParameterDescriptor> substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(propertySetterDescriptorImpl, this.f86937y.getValueParameters(), typeSubstitutorSubstituteTypeParameters, false, false, null);
            if (substitutedValueParameters == null) {
                propertyDescriptorImplC.setSetterProjectedOut(true);
                substitutedValueParameters = Collections.singletonList(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, DescriptorUtilsKt.getBuiltIns(copyConfiguration.f86939a).getNothingType(), this.f86937y.getValueParameters().get(0).getAnnotations()));
            }
            if (substitutedValueParameters.size() != 1) {
                throw new IllegalStateException();
            }
            propertySetterDescriptorImpl.setInitialSignatureDescriptor(f(typeSubstitutorSubstituteTypeParameters, this.f86937y));
            propertySetterDescriptorImpl.initialize(substitutedValueParameters.get(0));
        }
        FieldDescriptor fieldDescriptor = this.A;
        FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? null : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), propertyDescriptorImplC);
        FieldDescriptor fieldDescriptor2 = this.B;
        propertyDescriptorImplC.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? null : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), propertyDescriptorImplC));
        if (copyConfiguration.f86946h) {
            SmartSet smartSetCreate = SmartSet.create();
            Iterator<? extends PropertyDescriptor> it2 = getOverriddenDescriptors().iterator();
            while (it2.hasNext()) {
                smartSetCreate.add(it2.next().substitute(typeSubstitutorSubstituteTypeParameters));
            }
            propertyDescriptorImplC.setOverriddenDescriptors(smartSetCreate);
        }
        if (isConst() && (aVar = this.f86973h) != null) {
            propertyDescriptorImplC.setCompileTimeInitializer(this.f86972g, aVar);
        }
        return propertyDescriptorImplC;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public List<PropertyAccessorDescriptor> getAccessors() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f86936x;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f86937y;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor getBackingField() {
        return this.A;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = this.f86932t;
        if (list == null) {
            a(22);
        }
        return list;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor getDelegateField() {
        return this.B;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.f86933u;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.f86934v;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f86925m;
        if (kind == null) {
            a(39);
        }
        return kind;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.f86921i;
        if (modality == null) {
            a(24);
        }
        return modality;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertyDescriptor> getOverriddenDescriptors() {
        Collection<? extends PropertyDescriptor> collection = this.f86923k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            a(41);
        }
        return collection;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        KotlinType type = getType();
        if (type == null) {
            a(23);
        }
        return type;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertySetterDescriptor getSetter() {
        return this.f86937y;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f86935w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f86922j;
        if (descriptorVisibility == null) {
            a(25);
        }
        return descriptorVisibility;
    }

    public void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor) {
        initialize(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.f86929q;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f86927o;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.f86931s;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.f86928p;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f86930r;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.f86926n;
    }

    public boolean isSetterProjectedOut() {
        return this.f86938z;
    }

    public CopyConfiguration newCopyBuilder() {
        return new CopyConfiguration();
    }

    public void setInType(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            a(40);
        }
        this.f86923k = collection;
    }

    public void setSetterProjectedOut(boolean z11) {
        this.f86938z = z11;
    }

    public void setType(KotlinType kotlinType, List<? extends TypeParameterDescriptor> list, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            a(17);
        }
        if (list == null) {
            a(18);
        }
        if (list2 == null) {
            a(19);
        }
        setOutType(kotlinType);
        this.f86935w = new ArrayList(list);
        this.f86934v = receiverParameterDescriptor2;
        this.f86933u = receiverParameterDescriptor;
        this.f86932t = list2;
    }

    public void setVisibility(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            a(20);
        }
        this.f86922j = descriptorVisibility;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public PropertyDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z11) {
        PropertyDescriptor propertyDescriptorBuild = newCopyBuilder().setOwner(declarationDescriptor).setOriginal(null).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z11).build();
        if (propertyDescriptorBuild == null) {
            a(42);
        }
        return propertyDescriptorBuild;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertyGetterDescriptorImpl getGetter() {
        return this.f86936x;
    }

    public void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor, FieldDescriptor fieldDescriptor, FieldDescriptor fieldDescriptor2) {
        this.f86936x = propertyGetterDescriptorImpl;
        this.f86937y = propertySetterDescriptor;
        this.A = fieldDescriptor;
        this.B = fieldDescriptor2;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            a(27);
        }
        return typeSubstitutor.isEmpty() ? this : newCopyBuilder().setSubstitution(typeSubstitutor.getSubstitution()).setOriginal(getOriginal()).build();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PropertyDescriptor getOriginal() {
        PropertyDescriptor propertyDescriptor = this.f86924l;
        PropertyDescriptor original = propertyDescriptor == this ? this : propertyDescriptor.getOriginal();
        if (original == null) {
            a(38);
        }
        return original;
    }
}
