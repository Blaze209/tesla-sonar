package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerStep;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
enum R2 {
    Selfie,
    HeadTurnLeft,
    HeadTurnRight,
    RandomnessLiveness;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37918f = on0.a.a(values());

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[R2.values().length];
            try {
                iArr[R2.Selfie.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R2.HeadTurnLeft.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[R2.HeadTurnRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[R2.RandomnessLiveness.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<R2> getEntries() {
        return f37918f;
    }

    public final SelfieScannerStep toPublicStep() {
        int i11 = a.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return SelfieScannerStep.SELFIE;
        }
        if (i11 == 2) {
            return SelfieScannerStep.TURN_HEAD_LEFT;
        }
        if (i11 == 3) {
            return SelfieScannerStep.TURN_HEAD_RIGHT;
        }
        if (i11 == 4) {
            return C4324y4.f39116h.getLivenessStepType();
        }
        throw new NoWhenBranchMatchedException();
    }
}
