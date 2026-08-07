package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3534ly implements InterfaceC3216ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f33460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f33461b;

    public C3534ly(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f33460a = imageServiceLocator;
        this.f33461b = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.u61
            @Override // wn0.a
            public final Object invoke() {
                return C3534ly.a(this.f35814a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws buildStateFor(AbstractC3397ip error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        if (error instanceof AbstractC3397ip.c) {
            return a();
        }
        if (!(error instanceof AbstractC3397ip.d)) {
            throw new IllegalStateException("FL developer error. Unique error cases must be handled elsewhere");
        }
        return new InterfaceC4001ws.e(this.f33460a.a(EnumC3689ph.B0), AbstractC3577my.b(((AbstractC3397ip.d) error).a()), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.a(null, 1, null), true);
    }

    private final InterfaceC4001ws a() {
        return (InterfaceC4001ws) this.f33461b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3534ly c3534ly) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3534ly.f33460a.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_camera_permission_blocked_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new InterfaceC3807sD.a(null, 1, null), true);
    }
}
