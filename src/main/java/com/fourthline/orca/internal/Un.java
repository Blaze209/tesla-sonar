package com.fourthline.orca.internal;

import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
public enum Un {
    Passport("nfc-video-passport-light.mp4"),
    PassportDark("nfc-video-passport-dark.mp4"),
    IdCard("nfc-video-id-card-light.mp4"),
    IdCardDark("nfc-video-id-card-dark.mp4"),
    DriversLicence("nfc-video-drivers-license-light.mp4"),
    DriversLicenceDark("nfc-video-drivers-license-dark.mp4"),
    ResidencePermit("nfc-video-residence-permit-light.mp4"),
    ResidencePermitDark("nfc-video-residence-permit-dark.mp4");


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f28823l = on0.a.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28825b;

    Un(String str) {
        this.f28824a = str;
        this.f28825b = str;
    }

    public static EnumEntries c() {
        return f28823l;
    }

    public final String b() {
        return this.f28824a;
    }

    public final String d() {
        return this.f28825b;
    }
}
