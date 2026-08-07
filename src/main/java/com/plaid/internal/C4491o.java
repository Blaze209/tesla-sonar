package com.plaid.internal;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.plaid.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4491o<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C4572x0 f47945g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4563w0 f47946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4545u0 f47947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4507p6 f47948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4527s0 f47949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4489n6 f47950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4561v7 f47951f;

    /* JADX INFO: renamed from: com.plaid.internal.o$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC4519r1 f47952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D0 f47953b;

        public a(D0 d11, InterfaceC4519r1 interfaceC4519r1) {
            this.f47952a = interfaceC4519r1;
            this.f47953b = d11;
        }
    }

    static {
        W3 w11 = Z3.f46846a;
        f47945g = new C4572x0("auth");
    }

    public C4491o(C4561v7 c4561v7, C4563w0 c4563w0, C4545u0 c4545u0, C4507p6 c4507p6, C4527s0 c4527s0, C4489n6 c4489n6) {
        this.f47951f = c4561v7;
        this.f47946a = c4563w0;
        this.f47947b = c4545u0;
        this.f47948c = c4507p6;
        this.f47949d = c4527s0;
        this.f47950e = c4489n6;
    }

    public static void a(EnumC4427g7 enumC4427g7, C4500p c4500p) throws C4509q {
        if (enumC4427g7 != EnumC4427g7.FINISH && c4500p.f48000a) {
            throw new C4509q(T0.GENERIC_TIMEOUT);
        }
        c4500p.f48001b = enumC4427g7;
    }

    public static <I, O> O a(EnumC4427g7 enumC4427g7, InterfaceC4418f7<I, O> interfaceC4418f7, I i11, C4500p c4500p) throws r {
        try {
            a(enumC4427g7, c4500p);
            f47945g.a(W3.INFO, "execute step: " + enumC4427g7, new Object[0]);
            return (O) interfaceC4418f7.a(i11, c4500p).a();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw new r(enumC4427g7, e11);
        } catch (ExecutionException e12) {
            throw new r(enumC4427g7, e12.getCause());
        } catch (Exception e13) {
            throw new r(enumC4427g7, e13);
        }
    }
}
