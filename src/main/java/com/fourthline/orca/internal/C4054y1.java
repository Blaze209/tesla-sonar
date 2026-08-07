package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;

/* JADX INFO: renamed from: com.fourthline.orca.internal.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4054y1 implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f36877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4044xs f36878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f36879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3949vk f36880d;

    public C4054y1(InterfaceC3863tk navigationChannel, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f36877a = navigationChannel;
        this.f36878b = popupHandler;
        this.f36879c = new C3392ik("bav");
        this.f36880d = InterfaceC3949vk.c.C0623c.f36134b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f36878b, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.gi1
            @Override // wn0.a
            public final Object invoke() {
                return C4054y1.a(this.f32028a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f36879c;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f36880d;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(V1 navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f36877a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof C3240f2) {
            return c();
        }
        if (navigationEffect instanceof C3326h2) {
            InterfaceC3924v1 interfaceC3924v1C = ((C3326h2) navigationEffect).c();
            if (interfaceC3924v1C instanceof InterfaceC3924v1.d) {
                return InterfaceC3949vk.c.e.f36138b;
            }
            return interfaceC3924v1C instanceof InterfaceC3924v1.a ? InterfaceC3949vk.c.a.f36132b : InterfaceC3949vk.c.d.f36136b;
        }
        int i11 = 1;
        C3906uk c3906uk = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (navigationEffect instanceof I2) {
            return new InterfaceC3949vk.b(c3906uk, i11, objArr5 == true ? 1 : 0);
        }
        if (navigationEffect instanceof K2) {
            if (((K2) navigationEffect).c() instanceof InterfaceC3924v1.a) {
                return InterfaceC3949vk.c.a.f36132b;
            }
            return InterfaceC3949vk.c.d.f36136b;
        }
        if (navigationEffect instanceof C3196e1) {
            return new InterfaceC3949vk.b(objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0);
        }
        if (navigationEffect instanceof C3282g1) {
            return InterfaceC3949vk.c.d.f36136b;
        }
        if (navigationEffect instanceof C3969w2) {
            return new InterfaceC3949vk.m(((C3969w2) navigationEffect).c());
        }
        if (navigationEffect instanceof C4012x2) {
            return new InterfaceC3949vk.l(objArr2 == true ? 1 : 0, Pf.a(((C4012x2) navigationEffect).c()), i11, objArr == true ? 1 : 0);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C4054y1 c4054y1) {
        c4054y1.f36877a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(BavError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
