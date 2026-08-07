package p013kotlin.reflect.jvm.internal.impl.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScopesHolderForClass f86757a;

    public g(ScopesHolderForClass scopesHolderForClass) {
        this.f86757a = scopesHolderForClass;
    }

    @Override // wn0.a
    public Object invoke() {
        return ScopesHolderForClass.e(this.f86757a);
    }
}
