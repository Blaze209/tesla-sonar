package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3496l2 implements InterfaceC3947vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3475ki f33202b;

    public C3496l2(List paymentMethods, Yj introLottieSource) {
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        p013kotlin.jvm.internal.s.k(introLottieSource, "introLottieSource");
        this.f33201a = paymentMethods;
        QA.a aVar = QA.f27433a;
        this.f33202b = new C3475ki("bav_intro", QA.a.a(aVar, R.string.step_bav_intro_header, 0, 2, null), QA.a.a(aVar, R.string.step_bav_intro_message, 0, 2, null), introLottieSource, new InterfaceC3777rk.b((paymentMethods.size() == 1 && ((BavPaymentMethod) p013kotlin.collections.v.o0(paymentMethods)).getName() == H2.Online) ? QA.a.a(aVar, R.string.shared_button_continue_to_browser, 0, 2, null) : QA.a.a(aVar, R.string.shared_button_continue, 0, 2, null)), new InterfaceC3777rk.a.c(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3947vi
    public wn0.l a(boolean z11) {
        return InterfaceC3947vi.a.a(this, z11);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3475ki getInitialState() {
        return this.f33202b;
    }
}
