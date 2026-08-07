package com.fourthline.vision.internal;

import com.fourthline.vision.RecordingType;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.vision.internal.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4220j4 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.j4$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecordingType.values().length];
            try {
                iArr[RecordingType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecordingType.VIDEO_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecordingType.VIDEO_WITH_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InterfaceC4240m3.a toInternalType(RecordingType recordingType) {
        p013kotlin.jvm.internal.s.k(recordingType, "<this>");
        int i11 = a.$EnumSwitchMapping$0[recordingType.ordinal()];
        if (i11 == 1) {
            return InterfaceC4240m3.a.NONE;
        }
        if (i11 == 2) {
            return InterfaceC4240m3.a.VIDEO;
        }
        if (i11 == 3) {
            return InterfaceC4240m3.a.VIDEO_AUDIO;
        }
        throw new NoWhenBranchMatchedException();
    }
}
