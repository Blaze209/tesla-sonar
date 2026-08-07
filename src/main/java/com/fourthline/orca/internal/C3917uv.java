package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3917uv implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f35959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3397ip.b f35960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f35961c;

    public C3917uv(ND viewNavigator, final InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f35959a = viewNavigator;
        this.f35960b = AbstractC3397ip.b.f32574a;
        this.f35961c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.rf1
            @Override // wn0.a
            public final Object invoke() {
                return C3917uv.a(imageServiceLocator);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f35961c.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3397ip.b e() {
        return this.f35960b;
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f35959a.a(new InterfaceC3364hy.a.b(QesError.Canceled.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(InterfaceC3732qh interfaceC3732qh) {
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_insufficient_face_similarities, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }
}
