package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3884u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3884u4 f35803a = new C3884u4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static wn0.p f35804b = z2.c.c(1406248865, false, a.f35805a);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.u4$a */
    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35805a = new a();

        a() {
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1406248865, i11, -1, "com.fourthline.orca.core.internal.composable.ComposableSingletons$InputViewsKt.lambda-1.<anonymous> (InputViews.kt:93)");
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    public final wn0.p a() {
        return f35804b;
    }
}
