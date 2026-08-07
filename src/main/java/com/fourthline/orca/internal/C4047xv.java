package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.sdk.R;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4047xv implements InterfaceC3791ry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3791ry f36837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Yj f36838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f36839c;

    public C4047xv(InterfaceC3791ry uiStateProvider, Yj spinnerLottieSource, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(uiStateProvider, "uiStateProvider");
        p013kotlin.jvm.internal.s.k(spinnerLottieSource, "spinnerLottieSource");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f36837a = uiStateProvider;
        this.f36838b = spinnerLottieSource;
        this.f36839c = imageServiceLocator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.InterfaceC0573b.C0574b a(int i11, Pair stepsProgress) {
        p013kotlin.jvm.internal.s.k(stepsProgress, "stepsProgress");
        return this.f36837a.a(i11, stepsProgress);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.InterfaceC0573b.C0574b b(int i11) {
        return this.f36837a.b(i11);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.a e() {
        return this.f36837a.e();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l f() {
        return this.f36837a.f();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l g() {
        return this.f36837a.g();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky i() {
        return this.f36837a.i();
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC3491ky getInitialState() {
        return (InterfaceC3491ky) this.f36837a.getInitialState();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.a k() {
        return this.f36837a.k();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky n() {
        return this.f36837a.n();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky q() {
        return this.f36837a.q();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky a(InterfaceC3491ky interfaceC3491ky) {
        p013kotlin.jvm.internal.s.k(interfaceC3491ky, "<this>");
        return this.f36837a.a(interfaceC3491ky);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3491ky.a.b a(ScannerImage image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        QA.a aVar = QA.f27433a;
        return new InterfaceC3491ky.a.b(QA.a.a(aVar, R.string.step_selfie_capture_header_verify, 0, 2, null), QA.a.a(aVar, R.string.step_selfie_capture_message_uploading, 0, 2, null), image.getFull(), 0, this.f36838b, this.f36839c.a(EnumC3689ph.J0));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l a(Integer num, Float f11, Float f12) {
        return this.f36837a.a(num, f11, f12);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l a(Bitmap image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        return this.f36837a.a(image);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l a(int i11) {
        return this.f36837a.a(i11);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky a(SelfieScannerWarning warning) {
        p013kotlin.jvm.internal.s.k(warning, "warning");
        return this.f36837a.a(warning);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.InterfaceC0573b.a a(Pair stepsProgress, int i11) {
        p013kotlin.jvm.internal.s.k(stepsProgress, "stepsProgress");
        return this.f36837a.a(stepsProgress, i11);
    }
}
