package com.fourthline.vision.selfie;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/vision/selfie/LivenessCheckType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "HEAD_TURN", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum LivenessCheckType {
    NONE,
    HEAD_TURN;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39165b = on0.a.a(values());

    public static EnumEntries<LivenessCheckType> getEntries() {
        return f39165b;
    }
}
