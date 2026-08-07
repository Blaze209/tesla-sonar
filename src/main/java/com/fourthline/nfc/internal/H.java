package com.fourthline.nfc.internal;

import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
public enum H implements InterfaceC2828s {
    DG1(257),
    DG2(258),
    DG3(259),
    DG4(260),
    DG5(261),
    DG6(262),
    DG7(263),
    DG8(264),
    DG9(265),
    DG10(266),
    DG11(267),
    DG12(268),
    DG13(269),
    DG14(270),
    DG15(271),
    DG16(272),
    SOD(285),
    CARD_ACCESS(284);


    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f24551u = on0.a.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f24552a;

    H(short s11) {
        this.f24552a = s11;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2828s
    public short a() {
        return this.f24552a;
    }
}
