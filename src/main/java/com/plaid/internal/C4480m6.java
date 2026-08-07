package com.plaid.internal;

import android.content.Context;
import com.plaid.internal.C4480m6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.plaid.internal.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4480m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f47874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4463k7 f47875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4507p6 f47876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4489n6 f47877d;

    public C4480m6(Context context, InterfaceC4357b7 snaApi) {
        p013kotlin.jvm.internal.s.k(snaApi, "snaApi");
        this.f47874a = Executors.newSingleThreadExecutor();
        C4507p6 c4507p6 = new C4507p6(snaApi);
        this.f47876c = c4507p6;
        C4489n6 c4489n6 = new C4489n6(snaApi);
        this.f47877d = c4489n6;
        C4469l4 c4469l4 = new C4469l4(context);
        E0 e11 = new E0(context);
        C4563w0 c4563w0 = new C4563w0(new C4554v0(c4469l4, EnumC4451j4.CELLULAR, new C4454j7(), new C4536t0()));
        C4527s0 c4527s0 = new C4527s0();
        C4463k7 c4463k7 = new C4463k7(new C4491o(new C4561v7(), c4563w0, new C4545u0(), c4507p6, c4527s0, c4489n6), e11);
        p013kotlin.jvm.internal.s.j(c4463k7, "build(...)");
        this.f47875b = c4463k7;
    }

    public final void a(final C4498o6 proveSnaSessionInfo) {
        p013kotlin.jvm.internal.s.k(proveSnaSessionInfo, "proveSnaSessionInfo");
        this.f47874a.submit(new Runnable() { // from class: g00.l
            @Override // java.lang.Runnable
            public final void run() {
                C4480m6.a(this.f66828a, proveSnaSessionInfo);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.plaid.internal.n6] */
    public static final void a(C4480m6 this$0, C4498o6 proveSnaSessionInfo) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(proveSnaSessionInfo, "$proveSnaSessionInfo");
        try {
            A6.a.b(p013kotlin.collections.v0.i(), "ProveSNA - start isAuthenticationPossible");
            this$0.f47875b.b();
            A6.a.b(p013kotlin.collections.v0.i(), "ProveSNA - isAuthenticationPossible success");
            String strA = proveSnaSessionInfo.a();
            this$0.f47876c.f48040b = strA;
            this$0.f47877d.f47938b = strA;
            try {
                A6.a.b(p013kotlin.collections.v0.i(), "ProveSNA - start authenticate");
                this$0.f47875b.a();
                X5.a.a(X5.f46812a, "Prove SNA success");
                A6.a.b(p013kotlin.collections.v0.i(), "ProveSNA - authenticate success");
                this$0.f47876c.f48040b = null;
            } catch (Exception e11) {
                A6.a.a(p013kotlin.collections.v0.f(jn0.x.a("Exception", e11.toString())), "ProveSNA - authenticate failure");
                T6.a.a("Prove SNA failure - exception: " + e11);
                this$0.f47876c.f48040b = null;
            } finally {
                this$0.f47876c.f48040b = null;
                this$0.f47877d.f47938b = null;
            }
        } catch (Exception e12) {
            A6.a.a(p013kotlin.collections.v0.f(jn0.x.a("Exception", e12.toString())), "ProveSNA - isAuthenticationPossible failure");
            T6.a.a("Prove SNA authentication is not possible- exception: " + e12);
        }
    }
}
