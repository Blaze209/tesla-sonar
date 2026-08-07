package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3295gE {
    public static final boolean a(QesSettings qesSettings) {
        GeolocationSettings geolocation;
        return (qesSettings == null || (geolocation = qesSettings.getGeolocation()) == null || geolocation.getEnabled()) ? false : true;
    }
}
