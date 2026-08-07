package fo0;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes9.dex */
class y implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CallableMemberDescriptor f66304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66305b;

    public y(CallableMemberDescriptor callableMemberDescriptor, int i11) {
        this.f66304a = callableMemberDescriptor;
        this.f66305b = i11;
    }

    @Override // wn0.a
    public Object invoke() {
        return a0.t(this.f66304a, this.f66305b);
    }
}
