package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StaticScopeForKotlinEnum f88543a;

    public e(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        this.f88543a = staticScopeForKotlinEnum;
    }

    @Override // wn0.a
    public Object invoke() {
        return StaticScopeForKotlinEnum.f(this.f88543a);
    }
}
