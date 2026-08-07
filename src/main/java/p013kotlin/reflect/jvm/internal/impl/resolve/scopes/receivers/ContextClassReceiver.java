package p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClassDescriptor f88551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Name f88552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextClassReceiver(ClassDescriptor classDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        s.k(classDescriptor, "classDescriptor");
        s.k(receiverType, "receiverType");
        this.f88551c = classDescriptor;
        this.f88552d = name;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public Name getCustomLabelName() {
        return this.f88552d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f88551c + " }";
    }
}
