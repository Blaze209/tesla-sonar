package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class L3 implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uj f26700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ds.a f26701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f26702c;

    public L3(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        this.f26700a = lottieServiceLocator;
        this.f26701b = Ds.a.f25497a;
        this.f26702c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.oh0
            @Override // wn0.a
            public final Object invoke() {
                return L3.a(this.f34289a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ds.a b() {
        return this.f26701b;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        Cs.b.a.a(this);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f26702c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.a a(L3 l11) {
        Yj yjA = l11.f26700a.a(Tj.CameraPermission);
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.a(QA.a.a(aVar, R.string.shared_dialog_permission_camera_header, 0, 2, null), yjA, QA.a.a(aVar, R.string.shared_dialog_permission_camera_message, 0, 2, null), new InterfaceC3807sD.d(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 32, null);
    }
}
