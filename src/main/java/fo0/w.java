package fo0;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* JADX INFO: loaded from: classes9.dex */
class w implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReceiverParameterDescriptor f66269a;

    public w(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f66269a = receiverParameterDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return a0.r(this.f66269a);
    }
}
