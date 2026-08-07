package p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CallableDescriptor f88553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Name f88554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(CallableDescriptor declarationDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        s.k(declarationDescriptor, "declarationDescriptor");
        s.k(receiverType, "receiverType");
        this.f88553c = declarationDescriptor;
        this.f88554d = name;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public Name getCustomLabelName() {
        return this.f88554d;
    }

    public CallableDescriptor getDeclarationDescriptor() {
        return this.f88553c;
    }

    public String toString() {
        return "Cxt { " + getDeclarationDescriptor() + " }";
    }
}
