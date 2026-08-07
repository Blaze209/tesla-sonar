package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3211ea implements InterfaceC3216ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f31368a;

    public C3211ea(final InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f31368a = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.a11
            @Override // wn0.a
            public final Object invoke() {
                return C3211ea.a(imageServiceLocator);
            }
        });
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws buildStateFor(AbstractC3502l8.c error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        return a();
    }

    private final InterfaceC4001ws a() {
        return (InterfaceC4001ws) this.f31368a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(InterfaceC3732qh interfaceC3732qh) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_camera_permission_blocked_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new InterfaceC3807sD.a(null, 1, null), true);
    }
}
