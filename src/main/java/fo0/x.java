package fo0;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* JADX INFO: loaded from: classes9.dex */
class x implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReceiverParameterDescriptor f66295a;

    public x(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f66295a = receiverParameterDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return a0.s(this.f66295a);
    }
}
