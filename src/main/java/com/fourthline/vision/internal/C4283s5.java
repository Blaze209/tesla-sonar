package com.fourthline.vision.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.vision.selfie.LivenessCheckType;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.vision.internal.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4283s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerConfig f38851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f38852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f38854d;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s5$a */
    private enum a {
        TOP,
        TOP_RIGHT,
        RIGHT,
        BOTTOM_RIGHT,
        BOTTOM,
        BOTTOM_LEFT,
        LEFT,
        TOP_LEFT,
        OTHER;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f38865k = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return f38865k;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s5$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SelfieScannerStep.values().length];
            try {
                iArr[SelfieScannerStep.SELFIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[t6.values().length];
            try {
                iArr2[t6.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[t6.RECORD_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public C4283s5(SelfieScannerConfig config, wn0.a<? extends List<Integer>> randomnessLivenessStepsProvider) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(randomnessLivenessStepsProvider, "randomnessLivenessStepsProvider");
        this.f38851a = config;
        this.f38852b = randomnessLivenessStepsProvider;
        prepareRandomnessLivenessConfig();
        v6 v6Var = new v6("vision_x", this.f38853c ? "randomness" : config.getLivenessCheckType() == LivenessCheckType.HEAD_TURN ? "head_turn" : "none", config.getRecordingType());
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.registerContext(v6Var);
        }
    }

    private final void clearScannerContext() {
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.clearContext(AnalyticsContext.Scanner);
        }
    }

    private final String getNameLowerCased(Enum<?> r11) {
        String strName = r11.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String getStepType(SelfieScannerStep selfieScannerStep) {
        return b.$EnumSwitchMapping$0[selfieScannerStep.ordinal()] == 1 ? "automatic_capture" : "liveness";
    }

    private final void prepareRandomnessLivenessConfig() {
        a aVar;
        List list = (List) this.f38852b.invoke();
        if (list == null) {
            new wn0.a() { // from class: com.fourthline.vision.internal.jb
                @Override // wn0.a
                public final Object invoke() {
                    return C4283s5.prepareRandomnessLivenessConfig$lambda$2(this.f38486a);
                }
            };
            return;
        }
        this.f38853c = true;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue == 0) {
                aVar = a.TOP;
            } else if (iIntValue == 45) {
                aVar = a.TOP_RIGHT;
            } else if (iIntValue == 90) {
                aVar = a.RIGHT;
            } else if (iIntValue == 135) {
                aVar = a.BOTTOM_RIGHT;
            } else if (iIntValue == 180) {
                aVar = a.BOTTOM;
            } else if (iIntValue == 225) {
                aVar = a.BOTTOM_LEFT;
            } else if (iIntValue != 270) {
                aVar = iIntValue != 315 ? a.OTHER : a.TOP_LEFT;
            } else {
                aVar = a.LEFT;
            }
            arrayList.add(aVar);
        }
        this.f38854d = p013kotlin.collections.v.p1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 prepareRandomnessLivenessConfig$lambda$2(C4283s5 c4283s5) {
        c4283s5.f38853c = false;
        c4283s5.f38854d = null;
        return jn0.h0.f84049a;
    }

    public final void onFail(SelfieScannerStep scannerStep, SelfieScannerError scannerError, Throwable th2) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(scannerError, "scannerError");
        y6 y6Var = new y6(scannerError, th2, getStepType(scannerStep));
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(y6Var);
        }
        clearScannerContext();
    }

    public final void onMoveToNextStep() {
    }

    public final void onPermissionNotGranted(t6 permission) {
        SelfieScannerError selfieScannerError;
        p013kotlin.jvm.internal.s.k(permission, "permission");
        int i11 = b.$EnumSwitchMapping$1[permission.ordinal()];
        if (i11 == 1) {
            selfieScannerError = SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            selfieScannerError = SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        w6 w6Var = new w6(selfieScannerError);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(w6Var);
        }
        clearScannerContext();
    }

    public final void onReset() {
        z6 z6Var = z6.f39157a;
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(z6Var);
        }
    }

    public final void onResetCurrentStep(SelfieScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
    }

    public final void onStart() {
        A6 a11 = A6.f37626a;
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(a11);
        }
    }

    public final void onStepSuccess(SelfieScannerStep scannerStep, K5 stepResult) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
    }

    public final void onStepUpdate(SelfieScannerStep scannerStep) {
        String nameLowerCased;
        a aVar;
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        String stepType = getStepType(scannerStep);
        if (b.$EnumSwitchMapping$0[scannerStep.ordinal()] == 1) {
            nameLowerCased = null;
        } else if (this.f38853c) {
            List list = this.f38854d;
            if (list == null || (aVar = (a) p013kotlin.collections.v.N(list)) == null) {
                aVar = a.OTHER;
            }
            nameLowerCased = getNameLowerCased(aVar);
        } else {
            nameLowerCased = getNameLowerCased(scannerStep);
        }
        B6 b11 = new B6(stepType, nameLowerCased);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(b11);
        }
    }

    public final void onSuccess(SelfieScannerResult result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        x6 x6Var = x6.f39096a;
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(x6Var);
        }
        clearScannerContext();
    }

    public final void onTakeSnapshot(SelfieScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
    }
}
