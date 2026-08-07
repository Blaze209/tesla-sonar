package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3597nb {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nb$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DocumentFileSide.values().length];
            try {
                iArr[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentFileSide.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DocumentType.values().length];
            try {
                iArr2[DocumentType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DocumentType.DRIVERS_LICENSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DocumentType.PAPER_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DocumentType.PASSPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fz f(DocumentScannerStep documentScannerStep) {
        int i11 = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i11 == 1) {
            return documentScannerStep.isAngled() ? new Fz(EnumC3689ph.B, EnumC3689ph.C, EnumC3689ph.D) : new Fz(EnumC3689ph.E, EnumC3689ph.F, EnumC3689ph.G);
        }
        if (i11 == 2) {
            return documentScannerStep.isAngled() ? new Fz(EnumC3689ph.H, EnumC3689ph.C, EnumC3689ph.D) : new Fz(EnumC3689ph.I, EnumC3689ph.F, EnumC3689ph.G);
        }
        if (i11 != 3 && i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.DRIVERS_LICENSE + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fz g(DocumentScannerStep documentScannerStep) {
        int i11 = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i11 == 1) {
            return documentScannerStep.isAngled() ? new Fz(EnumC3689ph.J, EnumC3689ph.M, EnumC3689ph.O) : new Fz(EnumC3689ph.K, EnumC3689ph.L, EnumC3689ph.N);
        }
        if (i11 == 2) {
            return documentScannerStep.isAngled() ? new Fz(EnumC3689ph.H, EnumC3689ph.C, EnumC3689ph.D) : new Fz(EnumC3689ph.I, EnumC3689ph.F, EnumC3689ph.G);
        }
        if (i11 != 3 && i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.DUTCH_DRIVERS_LICENSE + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fz h(DocumentScannerStep documentScannerStep) {
        int i11 = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i11 == 1) {
            return documentScannerStep.isAngled() ? new Fz(EnumC3689ph.X, EnumC3689ph.Y, EnumC3689ph.Z) : new Fz(EnumC3689ph.f34531a0, EnumC3689ph.f34533b0, EnumC3689ph.f34535c0);
        }
        if (i11 == 2) {
            return documentScannerStep.isAngled() ? new Fz(EnumC3689ph.f34537d0, EnumC3689ph.Y, EnumC3689ph.Z) : new Fz(EnumC3689ph.f34539e0, EnumC3689ph.f34533b0, EnumC3689ph.f34535c0);
        }
        if (i11 != 3 && i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.FRENCH_ID_CARD + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    private static final Tj i(DocumentScannerStep documentScannerStep) {
        int index = documentScannerStep.getIndex();
        if (index == 0) {
            return Tj.PaperIdInsideLeft;
        }
        if (index == 1) {
            return Tj.PaperIdInsideRight;
        }
        if (index == 2) {
            return Tj.PaperIdInsideRightTilted;
        }
        if (index == 3) {
            return Tj.PaperIdBack;
        }
        throw new IllegalStateException(("Animation for " + documentScannerStep.getIndex() + " is not supported yet!").toString());
    }

    public static final Fz j(DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        int i11 = a.$EnumSwitchMapping$0[step.getFileSide().ordinal()];
        if (i11 == 1) {
            return step.isAngled() ? new Fz(EnumC3689ph.P, EnumC3689ph.Q, EnumC3689ph.R) : new Fz(EnumC3689ph.S, EnumC3689ph.T, EnumC3689ph.U);
        }
        if (i11 == 2) {
            return step.isAngled() ? new Fz(EnumC3689ph.V, EnumC3689ph.Q, EnumC3689ph.R) : new Fz(EnumC3689ph.W, EnumC3689ph.T, EnumC3689ph.U);
        }
        if (i11 != 3 && i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: ID_CARD or RESIDENCE_PERMIT and file side: " + step.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fz k(DocumentScannerStep documentScannerStep) {
        int i11 = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return new Fz(EnumC3689ph.f34541f0, EnumC3689ph.f34543g0, EnumC3689ph.f34545h0);
            }
            if (i11 == 3) {
                return new Fz(EnumC3689ph.f34541f0, EnumC3689ph.f34543g0, EnumC3689ph.f34545h0);
            }
            if (i11 == 4) {
                return documentScannerStep.isAngled() ? new Fz(EnumC3689ph.f34547i0, EnumC3689ph.f34549j0, EnumC3689ph.f34551k0) : new Fz(EnumC3689ph.f34541f0, EnumC3689ph.f34543g0, EnumC3689ph.f34545h0);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.PAPER_ID + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fz l(DocumentScannerStep documentScannerStep) {
        int i11 = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i11 == 1) {
            return documentScannerStep.isAngled() ? new Fz(EnumC3689ph.f34566s, EnumC3689ph.f34568t, EnumC3689ph.f34570u) : new Fz(EnumC3689ph.f34572v, EnumC3689ph.f34574w, EnumC3689ph.f34576x);
        }
        if (i11 != 2 && i11 != 3 && i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.PASSPORT + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tj d(DocumentScannerStep documentScannerStep, DocumentType documentType) {
        switch (a.$EnumSwitchMapping$1[documentType.ordinal()]) {
            case 1:
            case 2:
                return Tj.IdCardBackTilt;
            case 3:
                return Tj.IdCardFrenchBackTilt;
            case 4:
                return Tj.DriverLicenseBackTilt;
            case 5:
                return Tj.DutchDriverLicenseBackTilt;
            case 6:
                return i(documentScannerStep);
            case 7:
            case 8:
                return null;
            case 9:
                throw new IllegalStateException("We do not support scanning the angled back of the passport at this moment");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tj e(DocumentScannerStep documentScannerStep, DocumentType documentType) {
        switch (a.$EnumSwitchMapping$1[documentType.ordinal()]) {
            case 1:
            case 2:
                return Tj.IdCardBack;
            case 3:
                return Tj.IdCardFrenchBack;
            case 4:
                return Tj.DriverLicenseBack;
            case 5:
                return Tj.DutchDriverLicenseBack;
            case 6:
                return i(documentScannerStep);
            case 7:
            case 8:
                return null;
            case 9:
                throw new IllegalStateException("We do not support scanning the back side of the passport at this moment");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tj f(DocumentScannerStep documentScannerStep, DocumentType documentType) {
        switch (a.$EnumSwitchMapping$1[documentType.ordinal()]) {
            case 1:
            case 2:
                return Tj.IdCardTilt;
            case 3:
                return Tj.IdCardFrenchTilt;
            case 4:
                return Tj.DriverLicenseTilt;
            case 5:
                return Tj.DutchDriverLicenseTilt;
            case 6:
                return i(documentScannerStep);
            case 7:
            case 8:
                return null;
            case 9:
                return Tj.PassportTilt;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Tj g(DocumentScannerStep documentScannerStep, DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(documentScannerStep, "<this>");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        switch (a.$EnumSwitchMapping$1[documentType.ordinal()]) {
            case 1:
            case 2:
                return Tj.IdCard;
            case 3:
                return Tj.IdCardFrench;
            case 4:
                return Tj.DriverLicense;
            case 5:
                return Tj.DutchDriverLicense;
            case 6:
                return i(documentScannerStep);
            case 7:
            case 8:
                return null;
            case 9:
                return Tj.Passport;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
