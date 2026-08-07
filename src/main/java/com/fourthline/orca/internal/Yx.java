package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class Yx {
    public final InterfaceC3663oy a(Xx mainRepository, E6 deviceDataBundle, boolean z11) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        return new C3278fy(deviceDataBundle, new SelfieScannerConfig(false, mainRepository.h().a().f(), mainRepository.h().a().d(), z11), mainRepository.h().a().getRandomnessConfig(), mainRepository.h().a().getCameraX().getEnabled(), mainRepository.h().a().getVideo().getBitrate());
    }

    public final Oy a(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        return new Oy(navigationChannel);
    }

    public final ED a() {
        return new C3878tz(new InterfaceC3919ux.b(null, 1, null));
    }
}
