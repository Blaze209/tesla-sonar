package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3744qt implements InterfaceC3216ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f34892a;

    public C3744qt(final InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f34892a = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ea1
            @Override // wn0.a
            public final Object invoke() {
                return C3744qt.a(imageServiceLocator);
            }
        });
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws buildStateFor(AbstractC3658ot error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        if (error instanceof AbstractC3658ot.a) {
            return a();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC4001ws a() {
        return (InterfaceC4001ws) this.f34892a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(InterfaceC3732qh interfaceC3732qh) {
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_download_failed, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), null, true, 8, null);
    }
}
