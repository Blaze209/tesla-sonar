package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VE {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[EnumC3431jh.values().length];
            try {
                iArr[EnumC3431jh.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3431jh.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3431jh.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3431jh.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3431jh.INCONSISTENT_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3431jh.INVALID_DATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3431jh.REJECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3431jh.FRAUD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC3319gw.values().length];
            try {
                iArr2[EnumC3319gw.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC3319gw.SELFIE_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC3319gw.USER_CONSENT_REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC3319gw.CONFIRMATION_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC3319gw.PENDING_VERIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC3319gw.INVALID_SIGNATURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EnumC3319gw.SIGNED.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EnumC3319gw.KYC_REQUIRED.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC3319gw.NEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC3319gw.REJECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[EnumC3319gw.ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[O2.values().length];
            try {
                iArr3[O2.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[O2.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[O2.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[O2.PENDING_VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[O2.COMPILING_MANDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[O2.KYC_REQUIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[O2.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[EnumC4118zg.values().length];
            try {
                iArr4[EnumC4118zg.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[EnumC4118zg.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[EnumC4118zg.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[EnumC4118zg.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final boolean a(EnumC3431jh enumC3431jh, boolean z11) throws AbstractC3594nE.e, AbstractC3594nE.g {
        p013kotlin.jvm.internal.s.k(enumC3431jh, "<this>");
        switch (a.$EnumSwitchMapping$0[enumC3431jh.ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
                if (z11) {
                    throw new AbstractC3594nE.g("IdentityVerification");
                }
                return false;
            case 5:
            case 6:
            case 7:
            case 8:
                throw AbstractC3594nE.e.f33884c;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean a(EnumC3319gw enumC3319gw, boolean z11) throws AbstractC3594nE.e, AbstractC3594nE.g, AbstractC3594nE.f {
        p013kotlin.jvm.internal.s.k(enumC3319gw, "<this>");
        switch (a.$EnumSwitchMapping$1[enumC3319gw.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
                if (z11) {
                    throw new AbstractC3594nE.g("QualifiedElectronicSignature");
                }
                return false;
            case 6:
            case 7:
                return false;
            case 8:
                throw new AbstractC3594nE.f("QualifiedElectronicSignature");
            case 9:
            case 10:
            case 11:
                throw AbstractC3594nE.e.f33884c;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean a(O2 o11, boolean z11) throws AbstractC3594nE.e, AbstractC3594nE.g, AbstractC3594nE.f {
        p013kotlin.jvm.internal.s.k(o11, "<this>");
        switch (a.$EnumSwitchMapping$2[o11.ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 5:
                return false;
            case 4:
                if (z11) {
                    throw new AbstractC3594nE.g("BankAccountVerification");
                }
                return false;
            case 6:
                throw new AbstractC3594nE.f("BankAccountVerification");
            case 7:
                throw AbstractC3594nE.e.f33884c;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean a(EnumC4118zg enumC4118zg, boolean z11) throws AbstractC3594nE.e, AbstractC3594nE.g {
        p013kotlin.jvm.internal.s.k(enumC4118zg, "<this>");
        int i11 = a.$EnumSwitchMapping$3[enumC4118zg.ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw AbstractC3594nE.e.f33884c;
        }
        if (z11) {
            throw new AbstractC3594nE.g("Workflow");
        }
        return false;
    }
}
