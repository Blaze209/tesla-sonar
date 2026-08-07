package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GivenFunctionsMemberScope f88539a;

    public a(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.f88539a = givenFunctionsMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return GivenFunctionsMemberScope.b(this.f88539a);
    }
}
