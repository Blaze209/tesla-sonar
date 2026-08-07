package com.fourthline.vision.internal;

import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.vision.internal.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC4241m4 {
    UNKNOWN,
    TIMEOUT,
    INVALID_CONTENT_DETECTION_AREA,
    CONTENT_DISAPPEARED,
    CAMERA_NOT_AVAILABLE,
    NO_CAMERA_PERMISSION,
    NO_AUDIO_PERMISSION,
    MANUAL_MODE_NOT_ALLOWED,
    RECORDING_FAILED,
    SCANNER_INTERRUPTED,
    TAKE_SNAPSHOT_NOT_ALLOWED,
    MOVE_TO_NEXT_STEP_NOT_ALLOWED,
    RESET_CURRENT_STEP_NOT_ALLOWED,
    RECOGNITION_MODELS_NOT_DOWNLOADED,
    MULTIPLE_FACES_DETECTED,
    GOOGLE_PLAY_SERVICES_NOT_AVAILABLE;


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38580r = on0.a.a(values());

    public static EnumEntries<EnumC4241m4> getEntries() {
        return f38580r;
    }
}
