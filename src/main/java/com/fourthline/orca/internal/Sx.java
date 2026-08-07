package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Sx implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uj f27815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3732qh f27816d;

    public Sx(int i11, int i12, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27813a = i11;
        this.f27814b = i12;
        this.f27815c = lottieServiceLocator;
        this.f27816d = imageServiceLocator;
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Px getInitialState() {
        QA.a aVar = QA.f27433a;
        return new Px(QA.a.a(aVar, this.f27813a, 0, 2, null), QA.a.a(aVar, this.f27814b, 0, 2, null), QA.a.a(aVar, R.string.step_selfie_intro_message, 0, 2, null), p013kotlin.collections.v.p(new Px.a(QA.a.a(aVar, R.string.step_selfie_intro_message_light, 0, 2, null), this.f27816d.a(EnumC3689ph.G0)), new Px.a(QA.a.a(aVar, R.string.step_selfie_intro_message_face, 0, 2, null), this.f27816d.a(EnumC3689ph.F0)), new Px.a(QA.a.a(aVar, R.string.step_selfie_intro_message_eyes, 0, 2, null), this.f27816d.a(EnumC3689ph.E0))), this.f27815c.a(Tj.SelfieIntro), new InterfaceC3777rk.b(null, 1, null), new InterfaceC3777rk.a.c(null, 1, null));
    }

    public /* synthetic */ Sx(int i11, int i12, Uj uj2, InterfaceC3732qh interfaceC3732qh, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R.string.step_selfie_capture_header_selfie : i11, (i13 & 2) != 0 ? R.string.step_selfie_intro_title : i12, uj2, interfaceC3732qh);
    }
}
