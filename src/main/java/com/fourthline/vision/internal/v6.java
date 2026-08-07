package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.vision.RecordingType;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class v6 extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(String visionFramework, String livenessType, RecordingType videoRecordingType) {
        super("selfie");
        p013kotlin.jvm.internal.s.k(visionFramework, "visionFramework");
        p013kotlin.jvm.internal.s.k(livenessType, "livenessType");
        p013kotlin.jvm.internal.s.k(videoRecordingType, "videoRecordingType");
        this.f39045a = AnalyticsContext.Scanner;
        this.f39046b = "iglu:com.fourthline.sdk/scanner/jsonschema/1-0-0";
        set("vision", visionFramework);
        set("video_recording", getNameLowerCased(videoRecordingType));
        set("liveness_type", livenessType);
    }

    private final String getNameLowerCased(Enum<?> r11) {
        String strName = r11.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f39045a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f39046b;
    }
}
