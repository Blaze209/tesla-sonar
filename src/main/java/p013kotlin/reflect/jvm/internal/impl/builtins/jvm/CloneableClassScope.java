package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Name f86615d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Name getCLONE_NAME() {
            return CloneableClassScope.f86615d;
        }

        private Companion() {
        }
    }

    static {
        Name nameIdentifier = Name.identifier("clone");
        s.j(nameIdentifier, "identifier(...)");
        f86615d = nameIdentifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(StorageManager storageManager, ClassDescriptor containingClass) {
        super(storageManager, containingClass);
        s.k(storageManager, "storageManager");
        s.k(containingClass, "containingClass");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    protected List<FunctionDescriptor> c() {
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = SimpleFunctionDescriptorImpl.create(f(), Annotations.Companion.getEMPTY(), f86615d, CallableMemberDescriptor.Kind.DECLARATION, SourceElement.NO_SOURCE);
        simpleFunctionDescriptorImplCreate.initialize((ReceiverParameterDescriptor) null, f().getThisAsReceiverParameter(), v.m(), v.m(), v.m(), (KotlinType) DescriptorUtilsKt.getBuiltIns(f()).getAnyType(), Modality.OPEN, DescriptorVisibilities.PROTECTED);
        return v.e(simpleFunctionDescriptorImplCreate);
    }
}
