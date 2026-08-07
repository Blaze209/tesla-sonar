package com.fourthline.vision.internal.camera.recording;

import com.fourthline.vision.RecordingType;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"requiredPermissions", "", "", "Lcom/fourthline/vision/RecordingType;", "getRequiredPermissions", "(Lcom/fourthline/vision/RecordingType;)Ljava/util/List;", "fourthline-vision_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecordingExtensionsKt {
    public static final List<String> getRequiredPermissions(RecordingType recordingType) {
        s.k(recordingType, "<this>");
        return v.r("android.permission.CAMERA", recordingType == RecordingType.VIDEO_WITH_AUDIO ? "android.permission.RECORD_AUDIO" : null);
    }
}
