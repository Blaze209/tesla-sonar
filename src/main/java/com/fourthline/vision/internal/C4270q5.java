package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.LivenessCheckType;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4270q5 implements InterfaceC4306w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J5 f38783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f38784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J5 f38785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LivenessCheckType f38786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.a f38787e;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.q5$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LivenessCheckType.values().length];
            try {
                iArr[LivenessCheckType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivenessCheckType.HEAD_TURN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4270q5(J5 mandatoryStepInteractor, List<? extends J5> legacyLivenessSteps, J5 randomnessLivenessStep, LivenessCheckType livenessCheckType, wn0.a<Boolean> randomnessLivenessEnabled) {
        p013kotlin.jvm.internal.s.k(mandatoryStepInteractor, "mandatoryStepInteractor");
        p013kotlin.jvm.internal.s.k(legacyLivenessSteps, "legacyLivenessSteps");
        p013kotlin.jvm.internal.s.k(randomnessLivenessStep, "randomnessLivenessStep");
        p013kotlin.jvm.internal.s.k(livenessCheckType, "livenessCheckType");
        p013kotlin.jvm.internal.s.k(randomnessLivenessEnabled, "randomnessLivenessEnabled");
        this.f38783a = mandatoryStepInteractor;
        this.f38784b = legacyLivenessSteps;
        this.f38785c = randomnessLivenessStep;
        this.f38786d = livenessCheckType;
        this.f38787e = randomnessLivenessEnabled;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super List<? extends J5>, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        InterfaceC4306w0.a.subscribe(this, pVar);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public List<J5> get() {
        int i11 = a.$EnumSwitchMapping$0[this.f38786d.ordinal()];
        if (i11 == 1) {
            return p013kotlin.collections.v.e(this.f38783a);
        }
        if (i11 == 2) {
            return p013kotlin.collections.v.P0(p013kotlin.collections.v.e(this.f38783a), ((Boolean) this.f38787e.invoke()).booleanValue() ? p013kotlin.collections.v.e(this.f38785c) : this.f38784b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
