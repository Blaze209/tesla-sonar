package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4554v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4469l4 f48162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC4451j4 f48163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4536t0 f48164c;

    public C4554v0(C4469l4 c4469l4, EnumC4451j4 enumC4451j4, C4454j7 c4454j7, C4536t0 c4536t0) {
        this.f48162a = c4469l4;
        this.f48163b = enumC4451j4;
        this.f48164c = c4536t0;
    }

    public final C4349b a() throws C4509q {
        if (this.f48162a.a()) {
            throw new C4509q(T0.PRE_CHECK_AIRPLANE_MODE_ENABLED);
        }
        C4424g4 c4424g4A = this.f48162a.a(this.f48163b);
        if (c4424g4A == null) {
            throw new C4509q(T0.PRE_CHECK_NO_CELLULAR_RADIO);
        }
        try {
            C4349b c4349b = new C4349b(c4424g4A);
            c4349b.f46874a.f47609c = 10000;
            c4349b.f46875b.f47624c = 10000;
            if (this.f48164c.a(c4349b)) {
                return c4349b;
            }
            throw new C4509q(T0.PRE_CHECK_NO_CELLULAR_CONNECTION);
        } catch (C4509q | RuntimeException e11) {
            if (!c4424g4A.f47683d) {
                c4424g4A.f47683d = true;
                c4424g4A.f47681b.run();
            }
            throw e11;
        }
    }
}
