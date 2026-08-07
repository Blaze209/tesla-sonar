package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Gm implements InterfaceC3216ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4001ws f25986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f25987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f25988c;

    public Gm(InterfaceC4001ws wrongUnlockKeyErrorPopupState, final InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(wrongUnlockKeyErrorPopupState, "wrongUnlockKeyErrorPopupState");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f25986a = wrongUnlockKeyErrorPopupState;
        this.f25987b = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.fb0
            @Override // wn0.a
            public final Object invoke() {
                return Gm.a(imageServiceLocator);
            }
        });
        this.f25988c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.gb0
            @Override // wn0.a
            public final Object invoke() {
                return Gm.b(imageServiceLocator);
            }
        });
    }

    private final InterfaceC4001ws b() {
        return (InterfaceC4001ws) this.f25988c.getValue();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws buildStateFor(Em error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        if (error instanceof Em.a) {
            return a();
        }
        if (error instanceof Em.e) {
            return this.f25986a;
        }
        if (error instanceof Em.d) {
            return b();
        }
        if ((error instanceof Em.b) || (error instanceof Em.c)) {
            throw new IllegalStateException("NFC Scanner in document flow should never be started with adapter missing or off!");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e b(InterfaceC3732qh interfaceC3732qh) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_nfc_timeout_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.o(QA.a.a(aVar, R.string.shared_button_skip_nfc, 0, 2, null)), true);
    }

    private final InterfaceC4001ws a() {
        return (InterfaceC4001ws) this.f25987b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(InterfaceC3732qh interfaceC3732qh) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_nfc_connection_lost_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.o(QA.a.a(aVar, R.string.shared_button_skip_nfc, 0, 2, null)), true);
    }
}
