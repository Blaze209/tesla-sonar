package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.sdk.R;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class Si implements InterfaceC3791ry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yj f27776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f27777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TD f27778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TD.a.C0517a f27779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3491ky.b.c f27780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3491ky.b.a f27781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3491ky.b.a f27782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3491ky.b.d f27783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3491ky.b.c f27784i;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelfieScannerWarning.values().length];
            try {
                iArr[SelfieScannerWarning.FACE_NOT_IN_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieScannerWarning.FACE_NOT_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerWarning.FACE_TOO_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieScannerWarning.FACE_TOO_FAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieScannerWarning.FACE_YAW_TOO_BIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieScannerWarning.DEVICE_NOT_STEADY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Si(Yj loadingSpinnerLottieSource, Yj livenessLeftLottieSource, Yj livenessRightLottieSource, Yj livenessLottieSource, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
        p013kotlin.jvm.internal.s.k(livenessLeftLottieSource, "livenessLeftLottieSource");
        p013kotlin.jvm.internal.s.k(livenessRightLottieSource, "livenessRightLottieSource");
        p013kotlin.jvm.internal.s.k(livenessLottieSource, "livenessLottieSource");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27776a = livenessLottieSource;
        this.f27777b = imageServiceLocator;
        TD td2 = new TD(imageServiceLocator.a(EnumC3689ph.f34557n0), EnumC3136ck.PORTRAIT, null);
        this.f27778c = td2;
        TD.a.C0517a c0517a = new TD.a.C0517a(imageServiceLocator.a(EnumC3689ph.f34559o0), false, false, 2, null);
        this.f27779d = c0517a;
        QA.a aVar = QA.f27433a;
        QA.d dVarA = aVar.a(R.string.step_selfie_capture_message_selfie, R.string.shared_selfie_instruction_automatic_accessibility);
        EnumC3689ph enumC3689ph = EnumC3689ph.J0;
        this.f27780e = new InterfaceC3491ky.b.c(dVarA, td2, imageServiceLocator.a(enumC3689ph), loadingSpinnerLottieSource);
        this.f27781f = new InterfaceC3491ky.b.a(aVar.a(R.string.step_selfie_capture_message_liveness_left, R.string.shared_liveness_instruction_left_accessibility), livenessLeftLottieSource, null, imageServiceLocator.a(enumC3689ph));
        this.f27782g = new InterfaceC3491ky.b.a(aVar.a(R.string.step_selfie_capture_message_liveness_right, R.string.shared_liveness_instruction_right_accessibility), livenessRightLottieSource, null, imageServiceLocator.a(enumC3689ph));
        this.f27783h = new InterfaceC3491ky.b.d(QA.b.f27435b, TD.a(td2, null, null, new TD.a.c(c0517a.a()), 3, null), imageServiceLocator.a(enumC3689ph));
        this.f27784i = n();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l a(Bitmap bitmap) {
        return InterfaceC3791ry.a.a(this, bitmap);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.a e() {
        return this.f27782g;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l f() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.cp0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Si.b((InterfaceC3491ky) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l g() {
        return InterfaceC3791ry.a.a(this);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC3491ky.b.c getInitialState() {
        return this.f27784i;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.a k() {
        return this.f27781f;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public InterfaceC3491ky.b.c n() {
        return this.f27780e;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public InterfaceC3491ky.b.d q() {
        return this.f27783h;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC3491ky.b.e i() {
        return new InterfaceC3491ky.b.e(null, null, this.f27777b.a(EnumC3689ph.J0), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky b(InterfaceC3491ky state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (!(state instanceof InterfaceC3491ky.b.InterfaceC0573b.a)) {
            return state;
        }
        InterfaceC3491ky.b.InterfaceC0573b.a aVar = (InterfaceC3491ky.b.InterfaceC0573b.a) state;
        return aVar.a((12287 & 1) != 0 ? aVar.f33133a : null, (12287 & 2) != 0 ? aVar.f33134b : null, (12287 & 4) != 0 ? aVar.f33135c : null, (12287 & 8) != 0 ? aVar.f33136d : null, (12287 & 16) != 0 ? aVar.f33137e : null, (12287 & 32) != 0 ? aVar.f33138f : null, (12287 & 64) != 0 ? aVar.f33139g : null, (12287 & 128) != 0 ? aVar.f33140h : null, (12287 & 256) != 0 ? aVar.f33141i : null, (12287 & 512) != 0 ? aVar.f33142j : null, (12287 & 1024) != 0 ? aVar.f33143k : null, (12287 & 2048) != 0 ? aVar.f33144l : null, (12287 & 4096) != 0 ? aVar.f33145m : null, (12287 & PKIFailureInfo.certRevoked) != 0 ? aVar.f33146n : null);
    }

    private final QA c(SelfieScannerWarning selfieScannerWarning) {
        switch (a.$EnumSwitchMapping$0[selfieScannerWarning.ordinal()]) {
            case 1:
                return QA.a.a(QA.f27433a, R.string.step_selfie_capture_message_face_not_in_frame, 0, 2, null);
            case 2:
                return QA.a.a(QA.f27433a, R.string.step_selfie_capture_message_face_not_detected, 0, 2, null);
            case 3:
                return QA.a.a(QA.f27433a, R.string.step_selfie_capture_message_face_too_close, 0, 2, null);
            case 4:
                return QA.a.a(QA.f27433a, R.string.step_selfie_capture_message_face_too_far, 0, 2, null);
            case 5:
                return QA.a.a(QA.f27433a, R.string.step_selfie_capture_message_face_not_straight, 0, 2, null);
            case 6:
                return QA.b.f27435b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l a(final int i11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.dp0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Si.a(this.f31224a, i11, (InterfaceC3491ky) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.InterfaceC0573b.C0574b b(int i11) {
        QA.d dVarA = QA.a.a(QA.f27433a, R.string.step_selfie_capture_message_liveness_successful, 0, 2, null);
        InterfaceC3903uh interfaceC3903uhA = this.f27777b.a(EnumC3689ph.f34565r0);
        InterfaceC3903uh interfaceC3903uhA2 = this.f27777b.a(EnumC3689ph.f34567s0);
        InterfaceC3903uh interfaceC3903uhA3 = this.f27777b.a(EnumC3689ph.f34569t0);
        return new InterfaceC3491ky.b.InterfaceC0573b.C0574b(dVarA, new TD(this.f27777b.a(EnumC3689ph.f34563q0), EnumC3136ck.PORTRAIT, null), this.f27777b.a(EnumC3689ph.f34561p0), interfaceC3903uhA, interfaceC3903uhA2, interfaceC3903uhA3, null, this.f27777b.a(EnumC3689ph.H0), i11, this.f27777b.a(EnumC3689ph.J0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky a(Si si2, int i11, InterfaceC3491ky state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (!(state instanceof InterfaceC3491ky.b.InterfaceC0573b.a)) {
            return state;
        }
        InterfaceC3491ky.b.InterfaceC0573b.a aVar = (InterfaceC3491ky.b.InterfaceC0573b.a) state;
        return aVar.a((12287 & 1) != 0 ? aVar.f33133a : null, (12287 & 2) != 0 ? aVar.f33134b : null, (12287 & 4) != 0 ? aVar.f33135c : null, (12287 & 8) != 0 ? aVar.f33136d : null, (12287 & 16) != 0 ? aVar.f33137e : null, (12287 & 32) != 0 ? aVar.f33138f : null, (12287 & 64) != 0 ? aVar.f33139g : null, (12287 & 128) != 0 ? aVar.f33140h : null, (12287 & 256) != 0 ? aVar.f33141i : null, (12287 & 512) != 0 ? aVar.f33142j : null, (12287 & 1024) != 0 ? aVar.f33143k : null, (12287 & 2048) != 0 ? aVar.f33144l : null, (12287 & 4096) != 0 ? aVar.f33145m : si2.c(i11), (12287 & PKIFailureInfo.certRevoked) != 0 ? aVar.f33146n : null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.InterfaceC0573b.a a(Pair stepsProgress, int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(stepsProgress, "stepsProgress");
        QA.a aVar = QA.f27433a;
        int i13 = R.string.step_selfie_capture_message_liveness;
        if (i11 == 0) {
            i12 = R.string.shared_liveness_instruction_top_accessibility;
        } else if (i11 == 45) {
            i12 = R.string.shared_liveness_instruction_upward_right_accessibility;
        } else if (i11 == 90) {
            i12 = R.string.shared_liveness_instruction_right_accessibility;
        } else if (i11 == 135) {
            i12 = R.string.shared_liveness_instruction_downward_right_accessibility;
        } else if (i11 == 180) {
            i12 = R.string.shared_liveness_instruction_bottom_accessibility;
        } else if (i11 == 225) {
            i12 = R.string.shared_liveness_instruction_downward_left_accessibility;
        } else if (i11 != 270) {
            i12 = i11 != 315 ? i13 : R.string.shared_liveness_instruction_upward_left_accessibility;
        } else {
            i12 = R.string.shared_liveness_instruction_left_accessibility;
        }
        QA.d dVarA = aVar.a(i13, i12);
        InterfaceC3903uh interfaceC3903uhA = this.f27777b.a(EnumC3689ph.f34565r0);
        InterfaceC3903uh interfaceC3903uhA2 = this.f27777b.a(EnumC3689ph.f34567s0);
        InterfaceC3903uh interfaceC3903uhA3 = this.f27777b.a(EnumC3689ph.f34569t0);
        return new InterfaceC3491ky.b.InterfaceC0573b.a(dVarA, new TD(this.f27777b.a(EnumC3689ph.f34563q0), EnumC3136ck.PORTRAIT, null), this.f27777b.a(EnumC3689ph.f34561p0), interfaceC3903uhA, interfaceC3903uhA2, interfaceC3903uhA3, Integer.valueOf(i11), null, null, null, stepsProgress, this.f27776a, c(i11), this.f27777b.a(EnumC3689ph.J0), 896, null);
    }

    private final Pair c(int i11) {
        int i12 = ((i11 % 360) / 45) * 100;
        return jn0.x.a(Integer.valueOf(i12), Integer.valueOf(i12 + 75));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3491ky.b.c a(SelfieScannerWarning warning) {
        p013kotlin.jvm.internal.s.k(warning, "warning");
        return InterfaceC3491ky.b.c.a(n(), c(warning), TD.a(this.f27778c, null, null, new TD.a.C0517a(this.f27779d.a(), true, false), 3, null), null, null, 12, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3491ky.a.C0572a a(ScannerImage image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        QA.a aVar = QA.f27433a;
        return new InterfaceC3491ky.a.C0572a(QA.a.a(aVar, R.string.step_selfie_capture_header_confirm, 0, 2, null), QA.a.a(aVar, R.string.step_selfie_capture_message_confirm, 0, 2, null), image.getCropped(), QA.a.a(aVar, R.string.shared_button_retake, 0, 2, null), QA.a.a(aVar, R.string.step_selfie_capture_message_confirm_first_mobile, 0, 2, null), QA.a.a(aVar, R.string.step_selfie_capture_message_confirm_second_mobile, 0, 2, null), QA.a.a(aVar, R.string.step_selfie_capture_message_confirm_third_mobile, 0, 2, null), QA.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), null, this.f27777b.a(EnumC3689ph.N0), 256, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public wn0.l a(final Integer num, final Float f11, final Float f12) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ep0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Si.a(num, f11, f12, (InterfaceC3491ky) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky a(Integer num, Float f11, Float f12, InterfaceC3491ky state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (!(state instanceof InterfaceC3491ky.b.InterfaceC0573b.a)) {
            return state;
        }
        InterfaceC3491ky.b.InterfaceC0573b.a aVar = (InterfaceC3491ky.b.InterfaceC0573b.a) state;
        return aVar.a((12287 & 1) != 0 ? aVar.f33133a : null, (12287 & 2) != 0 ? aVar.f33134b : null, (12287 & 4) != 0 ? aVar.f33135c : null, (12287 & 8) != 0 ? aVar.f33136d : null, (12287 & 16) != 0 ? aVar.f33137e : null, (12287 & 32) != 0 ? aVar.f33138f : null, (12287 & 64) != 0 ? aVar.f33139g : null, (12287 & 128) != 0 ? aVar.f33140h : num, (12287 & 256) != 0 ? aVar.f33141i : f11, (12287 & 512) != 0 ? aVar.f33142j : f12, (12287 & 1024) != 0 ? aVar.f33143k : null, (12287 & 2048) != 0 ? aVar.f33144l : null, (12287 & 4096) != 0 ? aVar.f33145m : null, (12287 & PKIFailureInfo.certRevoked) != 0 ? aVar.f33146n : null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky.b.InterfaceC0573b.C0574b a(int i11, Pair stepsProgress) {
        p013kotlin.jvm.internal.s.k(stepsProgress, "stepsProgress");
        return new InterfaceC3491ky.b.InterfaceC0573b.C0574b(QA.a.a(QA.f27433a, R.string.step_selfie_capture_message_liveness, 0, 2, null), new TD(this.f27777b.a(EnumC3689ph.f34563q0), EnumC3136ck.PORTRAIT, null), this.f27777b.a(EnumC3689ph.f34561p0), this.f27777b.a(EnumC3689ph.f34565r0), this.f27777b.a(EnumC3689ph.f34567s0), this.f27777b.a(EnumC3689ph.f34569t0), stepsProgress, null, i11, this.f27777b.a(EnumC3689ph.J0));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3791ry
    public InterfaceC3491ky a(InterfaceC3491ky interfaceC3491ky) {
        p013kotlin.jvm.internal.s.k(interfaceC3491ky, "<this>");
        if (!(interfaceC3491ky instanceof InterfaceC3491ky.b.c)) {
            return interfaceC3491ky;
        }
        InterfaceC3491ky.b.c cVar = (InterfaceC3491ky.b.c) interfaceC3491ky;
        return InterfaceC3491ky.b.c.a(cVar, QA.b.f27435b, TD.a(cVar.getMask(), null, null, null, 3, null), null, null, 12, null);
    }
}
