package com.fourthline.vision.document;

import com.google.android.gms.iid.InstanceID;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerError;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA_PERMISSION_NOT_GRANTED", "RECORD_AUDIO_PERMISSION_NOT_GRANTED", "CAMERA_NOT_AVAILABLE", "RECORDING_FAILED", "SCANNER_INTERRUPTED", "UNKNOWN", InstanceID.ERROR_TIMEOUT, "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum DocumentScannerError {
    CAMERA_PERMISSION_NOT_GRANTED,
    RECORD_AUDIO_PERMISSION_NOT_GRANTED,
    CAMERA_NOT_AVAILABLE,
    RECORDING_FAILED,
    SCANNER_INTERRUPTED,
    UNKNOWN,
    TIMEOUT;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37571b = on0.a.a(values());

    public static EnumEntries<DocumentScannerError> getEntries() {
        return f37571b;
    }
}
