package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.core.VideoDuration;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.document.MrzValidationPolicy;
import java.util.Locale;

/* JADX INFO: renamed from: com.fourthline.vision.internal.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4175d6 extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38242b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4175d6(String visionFramework, DocumentType documentType, boolean z11, MrzValidationPolicy mrzValidationPolicy, RecordingType videoRecordingType, VideoDuration videoDuration) {
        super("document");
        p013kotlin.jvm.internal.s.k(visionFramework, "visionFramework");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        p013kotlin.jvm.internal.s.k(mrzValidationPolicy, "mrzValidationPolicy");
        p013kotlin.jvm.internal.s.k(videoRecordingType, "videoRecordingType");
        p013kotlin.jvm.internal.s.k(videoDuration, "videoDuration");
        this.f38241a = AnalyticsContext.Scanner;
        this.f38242b = "iglu:com.fourthline.sdk/scanner/jsonschema/1-0-0";
        set("vision", visionFramework);
        set("mrz_policy", getNameLowerCased(mrzValidationPolicy));
        set("video_recording", getNameLowerCased(videoRecordingType));
        set("video_duration", videoDuration.getAlias());
        set(AnalyticsAttribute.Vision.VideoDurationTarget, Long.valueOf(videoDuration.getDuration()));
        set(AnalyticsAttribute.DocumentType, DocumentTypeKt.toFourthlineValue(documentType));
        set("tilted_steps_enabled", Boolean.valueOf(z11));
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
        return this.f38241a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f38242b;
    }
}
