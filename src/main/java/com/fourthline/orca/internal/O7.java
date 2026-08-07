package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class O7 implements InterfaceC3216ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f27125a;

    public O7(final InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27125a = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.wj0
            @Override // wn0.a
            public final Object invoke() {
                return O7.a(imageServiceLocator);
            }
        });
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws buildStateFor(M0 error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        if (error instanceof M0.a) {
            return a();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC4001ws a() {
        return (InterfaceC4001ws) this.f27125a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(InterfaceC3732qh interfaceC3732qh) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_unsupported_issuing_country_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_issuing_country, 0, 2, null)), new InterfaceC3807sD.g(null, 1, null), true);
    }
}
