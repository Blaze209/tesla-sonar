package p013kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.Pair;
import p013kotlin.collections.IndexedValue;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

/* JADX INFO: loaded from: classes9.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {
    public static final Factory Factory = new Factory(null);

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ValueParameterDescriptor a(FunctionInvokeDescriptor functionInvokeDescriptor, int i11, TypeParameterDescriptor typeParameterDescriptor) {
            String lowerCase;
            String strAsString = typeParameterDescriptor.getName().asString();
            s.j(strAsString, "asString(...)");
            if (s.f(strAsString, "T")) {
                lowerCase = "instance";
            } else if (s.f(strAsString, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strAsString.toLowerCase(Locale.ROOT);
                s.j(lowerCase, "toLowerCase(...)");
            }
            Annotations empty = Annotations.Companion.getEMPTY();
            Name nameIdentifier = Name.identifier(lowerCase);
            s.j(nameIdentifier, "identifier(...)");
            SimpleType defaultType = typeParameterDescriptor.getDefaultType();
            s.j(defaultType, "getDefaultType(...)");
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            s.j(NO_SOURCE, "NO_SOURCE");
            return new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i11, empty, nameIdentifier, defaultType, false, false, false, null, NO_SOURCE);
        }

        public final FunctionInvokeDescriptor create(FunctionClassDescriptor functionClass, boolean z11) {
            s.k(functionClass, "functionClass");
            List<TypeParameterDescriptor> declaredTypeParameters = functionClass.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z11, null);
            ReceiverParameterDescriptor thisAsReceiverParameter = functionClass.getThisAsReceiverParameter();
            List<ReceiverParameterDescriptor> listM = v.m();
            List<? extends TypeParameterDescriptor> listM2 = v.m();
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredTypeParameters) {
                if (((TypeParameterDescriptor) obj).getVariance() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableT1 = v.t1(arrayList);
            ArrayList arrayList2 = new ArrayList(v.y(iterableT1, 10));
            for (IndexedValue indexedValue : iterableT1) {
                arrayList2.add(FunctionInvokeDescriptor.Factory.a(functionInvokeDescriptor, indexedValue.c(), (TypeParameterDescriptor) indexedValue.d()));
            }
            functionInvokeDescriptor.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, listM, listM2, (List<ValueParameterDescriptor>) arrayList2, (KotlinType) ((TypeParameterDescriptor) v.A0(declaredTypeParameters)).getDefaultType(), Modality.ABSTRACT, DescriptorVisibilities.PUBLIC);
            functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
            return functionInvokeDescriptor;
        }

        private Factory() {
        }
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z11);
    }

    private final FunctionDescriptor i(List<Name> list) {
        Name name;
        int size = getValueParameters().size() - list.size();
        boolean z11 = true;
        if (size == 0) {
            List<ValueParameterDescriptor> valueParameters = getValueParameters();
            s.j(valueParameters, "getValueParameters(...)");
            List<Pair> listV1 = v.v1(list, valueParameters);
            if ((listV1 instanceof Collection) && listV1.isEmpty()) {
                return this;
            }
            for (Pair pair : listV1) {
                if (!s.f((Name) pair.a(), ((ValueParameterDescriptor) pair.b()).getName())) {
                }
            }
            return this;
        }
        List<ValueParameterDescriptor> valueParameters2 = getValueParameters();
        s.j(valueParameters2, "getValueParameters(...)");
        List<ValueParameterDescriptor> list2 = valueParameters2;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : list2) {
            Name name2 = valueParameterDescriptor.getName();
            s.j(name2, "getName(...)");
            int index = valueParameterDescriptor.getIndex();
            int i11 = index - size;
            if (i11 >= 0 && (name = list.get(i11)) != null) {
                name2 = name;
            }
            arrayList.add(valueParameterDescriptor.copy(this, name2, index));
        }
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationE = e(TypeSubstitutor.EMPTY);
        List<Name> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z11 = false;
        } else {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((Name) it.next()) == null) {
                }
            }
            z11 = false;
        }
        FunctionDescriptorImpl.CopyConfiguration original = copyConfigurationE.setHasSynthesizedParameterNames(z11).setValueParameters((List<ValueParameterDescriptor>) arrayList).setOriginal((CallableMemberDescriptor) getOriginal());
        s.j(original, "setOriginal(...)");
        FunctionDescriptor functionDescriptorC = super.c(original);
        s.h(functionDescriptorC);
        return functionDescriptorC;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected FunctionDescriptor c(FunctionDescriptorImpl.CopyConfiguration configuration) {
        s.k(configuration, "configuration");
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.c(configuration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            s.j(type, "getType(...)");
            if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null) {
                List<ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
                s.j(valueParameters2, "getValueParameters(...)");
                List<ValueParameterDescriptor> list2 = valueParameters2;
                ArrayList arrayList = new ArrayList(v.y(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    s.j(type2, "getType(...)");
                    arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
                }
                return functionInvokeDescriptor.i(arrayList);
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        s.k(newOwner, "newOwner");
        s.k(kind, "kind");
        s.k(annotations, "annotations");
        s.k(source, "source");
        return new FunctionInvokeDescriptor(newOwner, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    private FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z11) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, kind, SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z11);
        setHasStableParameterNames(false);
    }
}
