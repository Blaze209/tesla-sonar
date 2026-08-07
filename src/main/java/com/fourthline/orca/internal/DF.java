package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DF {
    public static final InterfaceC4001ws a(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(imageServiceLocator.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_nfc_authentication_failed_title_can, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_dialog_error_shared_button_update_can, 0, 2, null)), null, false, 24, null);
    }
}
