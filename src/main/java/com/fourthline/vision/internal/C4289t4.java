package com.fourthline.vision.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.vision.selfie.LivenessCheckType;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.vision.internal.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4289t4 implements InterfaceC4159b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerConfig f38885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4248n4 f38886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f38887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f38889e;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.t4$a */
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
        private static final /* synthetic */ EnumEntries f38900k = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return f38900k;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.t4$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SelfieScannerStep.values().length];
            try {
                iArr[SelfieScannerStep.SELFIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[t6.values().length];
            try {
                iArr2[t6.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[t6.RECORD_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public C4289t4(SelfieScannerConfig config, InterfaceC4248n4 errorMapper, wn0.a<? extends List<Integer>> randomnessLivenessStepsProvider) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(errorMapper, "errorMapper");
        p013kotlin.jvm.internal.s.k(randomnessLivenessStepsProvider, "randomnessLivenessStepsProvider");
        this.f38885a = config;
        this.f38886b = errorMapper;
        this.f38887c = randomnessLivenessStepsProvider;
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
        List list = (List) this.f38887c.invoke();
        if (list == null) {
            new wn0.a() { // from class: com.fourthline.vision.internal.lb
                @Override // wn0.a
                public final Object invoke() {
                    return C4289t4.prepareRandomnessLivenessConfig$lambda$2(this.f38544a);
                }
            };
            return;
        }
        this.f38888d = true;
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
        this.f38889e = p013kotlin.collections.v.p1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 prepareRandomnessLivenessConfig$lambda$2(C4289t4 c4289t4) {
        c4289t4.f38888d = false;
        c4289t4.f38889e = null;
        return jn0.h0.f84049a;
    }

    private final Pair<String, String> toFatalErrorAttr(SelfieScannerError selfieScannerError) {
        return jn0.x.a("fatal_error", getNameLowerCased(selfieScannerError));
    }

    private final Pair<String, Boolean> toIsVideoAvailableAttr(C4275r4 c4275r4) {
        return jn0.x.a("is_video_url_available", Boolean.valueOf(c4275r4.getVideoUrl() != null));
    }

    private final Pair<String, String> toLivenessCheckTypeAttr(SelfieScannerConfig selfieScannerConfig) {
        return jn0.x.a("liveness_check_type", getNameLowerCased(selfieScannerConfig.getLivenessCheckType()));
    }

    private final Pair<String, String> toRecordVideoAttr(SelfieScannerConfig selfieScannerConfig) {
        return jn0.x.a("record_video", getNameLowerCased(selfieScannerConfig.getRecordingType()));
    }

    private final Pair<String, String> toSelfieFlowAttr(String str) {
        return jn0.x.a("selfie_flow", str);
    }

    private final Pair<String, String> toStepAttr(SelfieScannerStep selfieScannerStep) {
        String str;
        int i11 = b.$EnumSwitchMapping$0[selfieScannerStep.ordinal()];
        if (i11 == 1) {
            str = "automatic_selfie";
        } else if (i11 == 2) {
            str = "turn_head_left";
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "turn_head_right";
        }
        return jn0.x.a("step", str);
    }

    private final Pair<String, String> videoGravity(SelfieScannerConfig selfieScannerConfig) {
        return jn0.x.a("preview_gravity", "resize_aspect_fill");
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onMoveToNextStep() {
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onPermissionNotGranted(t6 permission) {
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
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.e$default(fourthlineAnalytics, "selfie_fail", null, p013kotlin.collections.v0.m(toFatalErrorAttr(selfieScannerError), toSelfieFlowAttr("selfie_fail")), 2, null);
        w6 w6Var = new w6(selfieScannerError);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(w6Var);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onReset() {
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "selfie_reset", null, null, 6, null);
        z6 z6Var = z6.f39157a;
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(z6Var);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onResetCurrentStep(SelfieScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onStart() {
        String str;
        prepareRandomnessLivenessConfig();
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        SelfieScannerConfig selfieScannerConfig = this.f38885a;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "selfie_start", null, p013kotlin.collections.v0.m(toLivenessCheckTypeAttr(selfieScannerConfig), videoGravity(selfieScannerConfig), toRecordVideoAttr(selfieScannerConfig), toSelfieFlowAttr("selfie_start")), 2, null);
        SelfieScannerConfig selfieScannerConfig2 = this.f38885a;
        if (this.f38888d) {
            str = "randomness";
        } else {
            str = this.f38885a.getLivenessCheckType() == LivenessCheckType.HEAD_TURN ? "head_turn" : "none";
        }
        v6 v6Var = new v6("vision", str, selfieScannerConfig2.getRecordingType());
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.registerContext(v6Var);
        }
        A6 a11 = A6.f37626a;
        AnalyticsInterface analytics2 = fourthlineAnalytics.getAnalytics();
        if (analytics2 != null) {
            analytics2.trackNew(a11);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onStepSuccess(SelfieScannerStep scannerStep, K5 stepResult) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onSuccess(C4275r4 result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "selfie_success", null, p013kotlin.collections.v0.m(toIsVideoAvailableAttr(result), toSelfieFlowAttr("selfie_success")), 2, null);
        x6 x6Var = x6.f39096a;
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(x6Var);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onTakeSnapshot(SelfieScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onFail(SelfieScannerStep scannerStep, EnumC4241m4 scannerError, Throwable th2) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(scannerError, "scannerError");
        SelfieScannerError selfieScannerError = (SelfieScannerError) this.f38886b.convertError(scannerError);
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        fourthlineAnalytics.e("selfie_fail", th2, p013kotlin.collections.v0.m(toFatalErrorAttr(selfieScannerError), toStepAttr(scannerStep), toSelfieFlowAttr("selfie_fail")));
        y6 y6Var = new y6(selfieScannerError, th2, getStepType(scannerStep));
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(y6Var);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onStepUpdate(SelfieScannerStep scannerStep) {
        String nameLowerCased;
        a aVar;
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "selfie_step_update", null, p013kotlin.collections.v0.m(toStepAttr(scannerStep), toSelfieFlowAttr("selfie_step_update")), 2, null);
        String stepType = getStepType(scannerStep);
        if (b.$EnumSwitchMapping$0[scannerStep.ordinal()] == 1) {
            nameLowerCased = null;
        } else if (this.f38888d) {
            List list = this.f38889e;
            if (list == null || (aVar = (a) p013kotlin.collections.v.N(list)) == null) {
                aVar = a.OTHER;
            }
            nameLowerCased = getNameLowerCased(aVar);
        } else {
            nameLowerCased = getNameLowerCased(scannerStep);
        }
        B6 b11 = new B6(stepType, nameLowerCased);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(b11);
        }
    }
}
