package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.sdk.R;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.plaid.internal.EnumC4419g;
import java.util.LinkedHashMap;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3425jb implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3212eb f32719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3554mb f32720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3511lb f32721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uj f32722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3732qh f32723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f32725g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jb$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DocumentScannerStepWarning.values().length];
            try {
                iArr2[DocumentScannerStepWarning.DEVICE_NOT_STEADY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DocumentScannerStepWarning.DOCUMENT_TOO_DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DocumentScannerStepWarning.RECOGNITION_MODELS_NOT_DOWNLOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DocumentScannerStepWarning.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public C3425jb(InterfaceC3212eb repository, InterfaceC3554mb documentScannerStepGraphicsProvider, InterfaceC3511lb textProvider, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator, boolean z11) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(documentScannerStepGraphicsProvider, "documentScannerStepGraphicsProvider");
        p013kotlin.jvm.internal.s.k(textProvider, "textProvider");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f32719a = repository;
        this.f32720b = documentScannerStepGraphicsProvider;
        this.f32721c = textProvider;
        this.f32722d = lottieServiceLocator;
        this.f32723e = imageServiceLocator;
        this.f32724f = z11;
        this.f32725g = new LinkedHashMap();
    }

    private final DocumentType o() {
        return this.f32719a.t().getType();
    }

    public final wn0.l a(final DocumentScannerStep step, final DocumentScannerStepWarning documentScannerStepWarning) {
        p013kotlin.jvm.internal.s.k(step, "step");
        return new wn0.l() { // from class: com.fourthline.orca.internal.e51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3425jb.a(this.f31336a, step, documentScannerStepWarning, (InterfaceC3004Wa) obj);
            }
        };
    }

    public final void j() {
        this.f32725g.clear();
    }

    public final DocumentScannerStep r() {
        switch (a.$EnumSwitchMapping$0[o().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new DocumentScannerStep(0, DocumentFileSide.FRONT, false, true);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new DocumentScannerStep(0, DocumentFileSide.FRONT, false, false);
            case 9:
                return new DocumentScannerStep(0, DocumentFileSide.INSIDE_LEFT, false, false);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC3004Wa getInitialState() {
        return a(this, r(), jn0.x.a(0, Integer.valueOf(a(o(), this.f32719a.t().getIncludeAngledSteps()))), false, false, false, 20, null);
    }

    public final wn0.l t() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.c51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3425jb.a(this.f30789a, (InterfaceC3004Wa) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(C3425jb c3425jb, DocumentScannerStep documentScannerStep, DocumentScannerStepWarning documentScannerStepWarning, InterfaceC3004Wa interfaceC3004Wa) {
        QA qaA;
        p013kotlin.jvm.internal.s.k(interfaceC3004Wa, "<this>");
        TD tdA = a(c3425jb, documentScannerStep, false, documentScannerStep.isAutoDetectAvailable(), 2, (Object) null);
        if (documentScannerStepWarning == null || (qaA = c3425jb.a(documentScannerStepWarning)) == null) {
            qaA = QA.b.f27435b;
        }
        QA qa2 = qaA;
        if (!(interfaceC3004Wa instanceof InterfaceC3004Wa.c.a)) {
            return interfaceC3004Wa;
        }
        InterfaceC3004Wa.c.a aVar = (InterfaceC3004Wa.c.a) interfaceC3004Wa;
        return aVar.a((15871 & 1) != 0 ? aVar.f29510a : null, (15871 & 2) != 0 ? aVar.f29511b : tdA, (15871 & 4) != 0 ? aVar.f29512c : null, (15871 & 8) != 0 ? aVar.f29513d : false, (15871 & 16) != 0 ? aVar.f29514e : qa2, (15871 & 32) != 0 ? aVar.f29515f : null, (15871 & 64) != 0 ? aVar.f29516g : null, (15871 & 128) != 0 ? aVar.f29517h : null, (15871 & 256) != 0 ? aVar.f29518i : null, (15871 & 512) != 0 ? aVar.f29519j : null, (15871 & 1024) != 0 ? aVar.f29520k : null, (15871 & 2048) != 0 ? aVar.f29521l : false, (15871 & 4096) != 0 ? aVar.f29522m : false, (15871 & PKIFailureInfo.certRevoked) != 0 ? aVar.f29523n : null);
    }

    public static /* synthetic */ wn0.l b(C3425jb c3425jb, DocumentScannerStep documentScannerStep, Pair pair, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pair = null;
        }
        Pair pair2 = pair;
        boolean z14 = (i11 & 4) != 0 ? false : z11;
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return c3425jb.b(documentScannerStep, pair2, z14, z12, (i11 & 16) != 0 ? false : z13);
    }

    public final wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.i51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3425jb.a(z11, (InterfaceC3004Wa) obj);
            }
        };
    }

    public final wn0.l e(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.d51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3425jb.a(z11, this, (InterfaceC3004Wa) obj);
            }
        };
    }

    public final wn0.l g() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.f51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3425jb.a((InterfaceC3004Wa) obj);
            }
        };
    }

    public final wn0.l b(final DocumentScannerStep step, final Pair pair, final boolean z11, final boolean z12, final boolean z13) {
        p013kotlin.jvm.internal.s.k(step, "step");
        return new wn0.l() { // from class: com.fourthline.orca.internal.h51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3425jb.a(this.f32197a, step, pair, z11, z12, z13, (InterfaceC3004Wa) obj);
            }
        };
    }

    public final Yj b(DocumentScannerStep documentScannerStep) {
        Tj tjA;
        p013kotlin.jvm.internal.s.k(documentScannerStep, "<this>");
        if ((this.f32719a.c() && documentScannerStep.getIndex() == 0) || (tjA = this.f32720b.a(o(), documentScannerStep)) == null) {
            return null;
        }
        return this.f32722d.a(tjA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(C3425jb c3425jb, DocumentScannerStep documentScannerStep, Pair pair, boolean z11, boolean z12, boolean z13, InterfaceC3004Wa interfaceC3004Wa) {
        p013kotlin.jvm.internal.s.k(interfaceC3004Wa, "<this>");
        return c3425jb.a(documentScannerStep, pair, z11, z12, z13);
    }

    static /* synthetic */ InterfaceC3004Wa a(C3425jb c3425jb, DocumentScannerStep documentScannerStep, Pair pair, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pair = null;
        }
        Pair pair2 = pair;
        boolean z14 = (i11 & 4) != 0 ? false : z11;
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return c3425jb.a(documentScannerStep, pair2, z14, z12, (i11 & 16) != 0 ? false : z13);
    }

    private final InterfaceC3004Wa a(DocumentScannerStep documentScannerStep, Pair pair, boolean z11, boolean z12, boolean z13) {
        Yj yjB = p013kotlin.jvm.internal.s.f(this.f32725g.get(b(documentScannerStep)), Boolean.TRUE) ? null : b(documentScannerStep);
        QA qaA = a(documentScannerStep, yjB != null);
        Pair pair2 = (pair == null || p013kotlin.jvm.internal.s.m(((Number) pair.f()).intValue(), 1) > 0) ? pair : null;
        if (z11) {
            return a(documentScannerStep, pair2);
        }
        return a(documentScannerStep, qaA, z12, yjB, pair2, z13);
    }

    public final InterfaceC3004Wa.b b(Bitmap image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        QA.a aVar = QA.f27433a;
        InterfaceC3004Wa.b bVar = new InterfaceC3004Wa.b(null, QA.a.a(aVar, R.string.step_document_capture_header_confirm, 0, 2, null), QA.a.a(aVar, R.string.step_document_capture_title_capture_ok, 0, 2, null), image, QA.a.a(aVar, R.string.step_document_capture_message_confirm_first, 0, 2, null), QA.a.a(aVar, R.string.step_document_capture_message_confirm_second, 0, 2, null), QA.a.a(aVar, R.string.step_document_capture_message_confirm_third, 0, 2, null), QA.a.a(aVar, R.string.shared_button_retake, 0, 2, null), QA.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), false, false, this.f32723e.a(EnumC3689ph.N0), null, 5633, null);
        return o() == DocumentType.PROOF_OF_ADDRESS ? InterfaceC3004Wa.b.a(bVar, null, null, null, null, QA.a.a(aVar, R.string.step_poa_capture_message_confirm_first, 0, 2, null), QA.a.a(aVar, R.string.step_poa_capture_message_confirm_second, 0, 2, null), QA.a.a(aVar, R.string.step_poa_capture_message_confirm_third, 0, 2, null), null, null, false, false, null, null, 8079, null) : bVar;
    }

    private final InterfaceC3004Wa.c.a a(DocumentScannerStep documentScannerStep, QA qa2, boolean z11, Yj yj2, Pair pair, boolean z12) {
        QA qaA = a(documentScannerStep);
        boolean z13 = false;
        TD tdA = a(this, documentScannerStep, false, false, 6, (Object) null);
        QA.d dVarA = QA.a.a(QA.f27433a, R.string.shared_button_take_picture, 0, 2, null);
        Pair pair2 = this.f32719a.c() ? null : pair;
        if (this.f32719a.c() && documentScannerStep.getIndex() == 0) {
            z13 = true;
        }
        return new InterfaceC3004Wa.c.a(qaA, tdA, qa2, z12, null, dVarA, this.f32723e.a(EnumC3689ph.J0), this.f32723e.a(EnumC3689ph.f34553l0), this.f32723e.a(EnumC3689ph.f34555m0), yj2, null, z11, z13, pair2);
    }

    private final InterfaceC3004Wa.c.b a(DocumentScannerStep documentScannerStep, Pair pair) {
        return new InterfaceC3004Wa.c.b(QA.a.a(QA.f27433a, R.string.step_document_capture_message_successful, 0, 2, null), a(this, documentScannerStep, true, false, 4, (Object) null), QA.b.f27435b, this.f32723e.a(EnumC3689ph.J0), false, this.f32719a.c(), null, null, pair, this.f32723e.a(EnumC3689ph.H0), this.f32719a.c() ? false : this.f32724f, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(boolean z11, C3425jb c3425jb, InterfaceC3004Wa interfaceC3004Wa) {
        p013kotlin.jvm.internal.s.k(interfaceC3004Wa, "<this>");
        if (interfaceC3004Wa instanceof InterfaceC3004Wa.b) {
            return InterfaceC3004Wa.b.a((InterfaceC3004Wa.b) interfaceC3004Wa, null, null, null, null, null, null, null, null, QA.a.a(QA.f27433a, z11 ? R.string.step_document_processing_header_processing : R.string.shared_button_confirm, 0, 2, null), z11, false, null, null, 7423, null);
        }
        if (!(interfaceC3004Wa instanceof InterfaceC3004Wa.c.a)) {
            return interfaceC3004Wa;
        }
        InterfaceC3004Wa.c.a aVar = (InterfaceC3004Wa.c.a) interfaceC3004Wa;
        return aVar.a((15871 & 1) != 0 ? aVar.f29510a : QA.a.a(QA.f27433a, R.string.step_document_processing_header_processing, 0, 2, null), (15871 & 2) != 0 ? aVar.f29511b : null, (15871 & 4) != 0 ? aVar.f29512c : QA.b.f27435b, (15871 & 8) != 0 ? aVar.f29513d : false, (15871 & 16) != 0 ? aVar.f29514e : null, (15871 & 32) != 0 ? aVar.f29515f : null, (15871 & 64) != 0 ? aVar.f29516g : null, (15871 & 128) != 0 ? aVar.f29517h : null, (15871 & 256) != 0 ? aVar.f29518i : null, (15871 & 512) != 0 ? aVar.f29519j : null, (15871 & 1024) != 0 ? aVar.f29520k : z11 ? c3425jb.f32722d.a(Tj.LoadingSpinner) : null, (15871 & 2048) != 0 ? aVar.f29521l : false, (15871 & 4096) != 0 ? aVar.f29522m : false, (15871 & PKIFailureInfo.certRevoked) != 0 ? aVar.f29523n : null);
    }

    private final QA a(DocumentScannerStep documentScannerStep) {
        if (this.f32719a.c() && o() == DocumentType.PAPER_ID) {
            documentScannerStep = Fy.a(documentScannerStep);
        }
        return this.f32721c.a(documentScannerStep, o());
    }

    private final QA a(DocumentScannerStep documentScannerStep, boolean z11) {
        if (this.f32719a.c() && o() == DocumentType.PAPER_ID) {
            documentScannerStep = Fy.a(documentScannerStep);
        }
        return this.f32721c.a(documentScannerStep, o(), z11);
    }

    private final QA.d a(DocumentScannerStepWarning documentScannerStepWarning) {
        int i11 = a.$EnumSwitchMapping$1[documentScannerStepWarning.ordinal()];
        if (i11 == 1) {
            return QA.a.a(QA.f27433a, R.string.step_document_capture_message_steady, 0, 2, null);
        }
        if (i11 == 2) {
            return QA.a.a(QA.f27433a, R.string.step_document_capture_message_too_dark, 0, 2, null);
        }
        if (i11 == 3 || i11 == 4) {
            throw new RuntimeException("Scanner should have switched to manual mode!");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final wn0.l a(final Bitmap image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        return new wn0.l() { // from class: com.fourthline.orca.internal.g51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3425jb.a(image, (InterfaceC3004Wa) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(Bitmap bitmap, InterfaceC3004Wa interfaceC3004Wa) {
        p013kotlin.jvm.internal.s.k(interfaceC3004Wa, "<this>");
        if (interfaceC3004Wa instanceof InterfaceC3004Wa.b) {
            return InterfaceC3004Wa.b.a((InterfaceC3004Wa.b) interfaceC3004Wa, null, null, null, null, null, null, null, null, null, false, false, null, new C2916Oe(k3.n0.c(bitmap)), 4095, null);
        }
        throw new IllegalStateException("Only ResultState supports enlarge functionality");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(InterfaceC3004Wa interfaceC3004Wa) {
        p013kotlin.jvm.internal.s.k(interfaceC3004Wa, "<this>");
        if (interfaceC3004Wa instanceof InterfaceC3004Wa.b) {
            return InterfaceC3004Wa.b.a((InterfaceC3004Wa.b) interfaceC3004Wa, null, null, null, null, null, null, null, null, null, false, false, null, null, 4095, null);
        }
        throw new IllegalStateException("Only ResultState supports enlarge functionality");
    }

    static /* synthetic */ TD a(C3425jb c3425jb, DocumentScannerStep documentScannerStep, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return c3425jb.a(documentScannerStep, z11, z12);
    }

    private final TD a(DocumentScannerStep documentScannerStep, boolean z11, boolean z12) {
        TD.a bVar;
        if (this.f32719a.c() && o() == DocumentType.PAPER_ID) {
            documentScannerStep = Fy.a(documentScannerStep);
        }
        Fz fzB = this.f32720b.b(o(), documentScannerStep);
        InterfaceC3903uh interfaceC3903uhA = this.f32723e.a(fzB.a());
        InterfaceC3903uh interfaceC3903uhA2 = this.f32723e.a(fzB.b());
        InterfaceC3903uh interfaceC3903uhA3 = this.f32723e.a(fzB.c());
        EnumC3136ck enumC3136ckB = AbstractC3468kb.b(o());
        if (z11) {
            bVar = new TD.a.c(interfaceC3903uhA3);
        } else {
            bVar = new TD.a.b(interfaceC3903uhA2, false, 2, null);
        }
        return new TD(interfaceC3903uhA, enumC3136ckB, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(boolean z11, InterfaceC3004Wa interfaceC3004Wa) {
        InterfaceC3004Wa.c.a aVarA;
        p013kotlin.jvm.internal.s.k(interfaceC3004Wa, "<this>");
        InterfaceC3004Wa.c.a aVar = interfaceC3004Wa instanceof InterfaceC3004Wa.c.a ? (InterfaceC3004Wa.c.a) interfaceC3004Wa : null;
        return (aVar == null || (aVarA = aVar.a((15871 & 1) != 0 ? aVar.f29510a : null, (15871 & 2) != 0 ? aVar.f29511b : null, (15871 & 4) != 0 ? aVar.f29512c : null, (15871 & 8) != 0 ? aVar.f29513d : false, (15871 & 16) != 0 ? aVar.f29514e : null, (15871 & 32) != 0 ? aVar.f29515f : null, (15871 & 64) != 0 ? aVar.f29516g : null, (15871 & 128) != 0 ? aVar.f29517h : null, (15871 & 256) != 0 ? aVar.f29518i : null, (15871 & 512) != 0 ? aVar.f29519j : null, (15871 & 1024) != 0 ? aVar.f29520k : null, (15871 & 2048) != 0 ? aVar.f29521l : z11, (15871 & 4096) != 0 ? aVar.f29522m : false, (15871 & PKIFailureInfo.certRevoked) != 0 ? aVar.f29523n : null)) == null) ? interfaceC3004Wa : aVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(C3425jb c3425jb, InterfaceC3004Wa interfaceC3004Wa) {
        p013kotlin.jvm.internal.s.k(interfaceC3004Wa, "<this>");
        if (!(interfaceC3004Wa instanceof InterfaceC3004Wa.c.a)) {
            return interfaceC3004Wa;
        }
        InterfaceC3004Wa.c.a aVar = (InterfaceC3004Wa.c.a) interfaceC3004Wa;
        Yj yjN = aVar.n();
        if (yjN != null) {
            c3425jb.f32725g.put(yjN, Boolean.TRUE);
        }
        return aVar.a((15871 & 1) != 0 ? aVar.f29510a : null, (15871 & 2) != 0 ? aVar.f29511b : null, (15871 & 4) != 0 ? aVar.f29512c : null, (15871 & 8) != 0 ? aVar.f29513d : false, (15871 & 16) != 0 ? aVar.f29514e : null, (15871 & 32) != 0 ? aVar.f29515f : null, (15871 & 64) != 0 ? aVar.f29516g : null, (15871 & 128) != 0 ? aVar.f29517h : null, (15871 & 256) != 0 ? aVar.f29518i : null, (15871 & 512) != 0 ? aVar.f29519j : null, (15871 & 1024) != 0 ? aVar.f29520k : null, (15871 & 2048) != 0 ? aVar.f29521l : false, (15871 & 4096) != 0 ? aVar.f29522m : false, (15871 & PKIFailureInfo.certRevoked) != 0 ? aVar.f29523n : null);
    }

    private final int a(DocumentType documentType, boolean z11) {
        int i11;
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
            case 7:
            case 8:
                i11 = 1;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i11 = 2;
                break;
            case 9:
                return z11 ? 4 : 3;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return z11 ? i11 * 2 : i11;
    }
}
