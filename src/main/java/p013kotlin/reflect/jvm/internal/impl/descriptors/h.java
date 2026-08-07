package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScopesHolderForClass f86758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KotlinTypeRefiner f86759b;

    public h(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f86758a = scopesHolderForClass;
        this.f86759b = kotlinTypeRefiner;
    }

    @Override // wn0.a
    public Object invoke() {
        return ScopesHolderForClass.c(this.f86758a, this.f86759b);
    }
}
