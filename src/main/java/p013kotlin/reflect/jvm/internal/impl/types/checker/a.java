package p013kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NewCapturedTypeConstructor f88973a;

    public a(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f88973a = newCapturedTypeConstructor;
    }

    @Override // wn0.a
    public Object invoke() {
        return NewCapturedTypeConstructor.b(this.f88973a);
    }
}
