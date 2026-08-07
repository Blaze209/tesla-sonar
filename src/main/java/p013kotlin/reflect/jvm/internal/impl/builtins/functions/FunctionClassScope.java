package p013kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(StorageManager storageManager, FunctionClassDescriptor containingClass) {
        super(storageManager, containingClass);
        s.k(storageManager, "storageManager");
        s.k(containingClass, "containingClass");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    protected List<FunctionDescriptor> c() {
        ClassDescriptor classDescriptorF = f();
        s.i(classDescriptorF, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        FunctionTypeKind functionTypeKind = ((FunctionClassDescriptor) classDescriptorF).getFunctionTypeKind();
        if (s.f(functionTypeKind, FunctionTypeKind.Function.INSTANCE)) {
            return v.e(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) f(), false));
        }
        return s.f(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE) ? v.e(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) f(), true)) : v.m();
    }
}
