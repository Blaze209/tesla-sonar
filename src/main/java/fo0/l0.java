package fo0;

import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
class l0 implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinType f66179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0.a f66180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f66181c;

    public l0(KotlinType kotlinType, w0.a aVar, w0 w0Var) {
        this.f66179a = kotlinType;
        this.f66180b = aVar;
        this.f66181c = w0Var;
    }

    @Override // wn0.a
    public Object invoke() {
        return w0.a.c0(this.f66179a, this.f66180b, this.f66181c);
    }
}
