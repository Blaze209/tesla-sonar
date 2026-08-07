package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.sdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3469kc implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3084ba f32957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f32958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3171dc f32959c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kc$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C3171dc.b.values().length];
            try {
                iArr[C3171dc.b.NOT_ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3171dc.b.CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3171dc.b.UNCHECKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3469kc(InterfaceC3084ba documentOptionsComparator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(documentOptionsComparator, "documentOptionsComparator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f32957a = documentOptionsComparator;
        this.f32958b = imageServiceLocator;
        QA.a aVar = QA.f27433a;
        this.f32959c = new C3171dc(QA.a.a(aVar, R.string.step_document_type_header, 0, 2, null), QA.a.a(aVar, R.string.step_document_type_label_type, 0, 2, null), QA.a.a(aVar, R.string.step_document_type_hint_instructions, 0, 2, null), QA.a.a(aVar, R.string.shared_button_continue, 0, 2, null), new QA.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), p013kotlin.collections.v.m(), false, new C3171dc.c(QA.a.a(aVar, R.string.step_document_type_footer_document_not_accepted, 0, 2, null), QA.a.a(aVar, R.string.shared_button_exit, 0, 2, null)), 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3171dc a(C3469kc c3469kc, List list, String str, C3171dc c3171dc) {
        boolean z11;
        p013kotlin.jvm.internal.s.k(c3171dc, "<this>");
        List listM1 = p013kotlin.collections.v.m1(c3469kc.a(list, str));
        List listR = c3171dc.r();
        if ((listR instanceof Collection) && listR.isEmpty()) {
            z11 = false;
        } else {
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                if (((C3171dc.a) it.next()).b() == C3171dc.b.CHECKED) {
                    z11 = true;
                }
            }
            z11 = false;
        }
        return C3171dc.a(c3171dc, null, null, null, null, null, listM1, z11, null, 159, null);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3171dc getInitialState() {
        return this.f32959c;
    }

    public final wn0.l b(final List supportedDocuments, final String issuingCountryIso3) {
        p013kotlin.jvm.internal.s.k(supportedDocuments, "supportedDocuments");
        p013kotlin.jvm.internal.s.k(issuingCountryIso3, "issuingCountryIso3");
        return new wn0.l() { // from class: com.fourthline.orca.internal.w51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3469kc.a(this.f36341a, supportedDocuments, issuingCountryIso3, (C3171dc) obj);
            }
        };
    }

    public final wn0.l a(final DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        return new wn0.l() { // from class: com.fourthline.orca.internal.v51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3469kc.a(documentType, (C3171dc) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3171dc a(DocumentType documentType, C3171dc c3171dc) {
        p013kotlin.jvm.internal.s.k(c3171dc, "<this>");
        List<C3171dc.a> listR = c3171dc.r();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listR, 10));
        for (C3171dc.a aVarA : listR) {
            int i11 = a.$EnumSwitchMapping$0[aVarA.b().ordinal()];
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVarA = C3171dc.a.a(aVarA, aVarA.d() == documentType ? C3171dc.b.CHECKED : C3171dc.b.UNCHECKED, null, null, null, 14, null);
            }
            arrayList.add(aVarA);
        }
        return C3171dc.a(c3171dc, null, null, null, null, null, arrayList, true, null, 159, null);
    }

    private final List a(List list, String str) {
        C3171dc.b bVar;
        C3171dc.b bVar2;
        C3171dc.b bVar3;
        C3171dc.b bVar4;
        C3171dc.b bVar5;
        ArrayList arrayList = new ArrayList();
        DocumentType documentType = p013kotlin.jvm.internal.s.f(str, "FRA") ? DocumentType.FRENCH_ID_CARD : DocumentType.ID_CARD;
        DocumentType documentType2 = p013kotlin.jvm.internal.s.f(str, "NLD") ? DocumentType.DUTCH_DRIVERS_LICENSE : DocumentType.DRIVERS_LICENSE;
        QA.d dVarA = QA.a.a(QA.f27433a, R.string.step_document_type_document_type_Passport, 0, 2, null);
        InterfaceC3903uh interfaceC3903uhA = this.f32958b.a(EnumC3689ph.f34573v0);
        DocumentType documentType3 = DocumentType.PASSPORT;
        boolean z11 = list instanceof Collection;
        if (!z11 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = C3171dc.b.NOT_ACCEPTED;
                    break;
                }
                if (((X7) it.next()).c() == DocumentType.PASSPORT) {
                    bVar = C3171dc.b.UNCHECKED;
                    break;
                }
            }
        } else {
            bVar = C3171dc.b.NOT_ACCEPTED;
            break;
        }
        a(arrayList, bVar, dVarA, interfaceC3903uhA, documentType3);
        QA.d dVarA2 = QA.a.a(QA.f27433a, R.string.step_document_type_document_type_NationalIDCard, 0, 2, null);
        InterfaceC3903uh interfaceC3903uhA2 = this.f32958b.a(EnumC3689ph.f34575w0);
        if (z11 && list.isEmpty()) {
            bVar2 = C3171dc.b.NOT_ACCEPTED;
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    X7 x11 = (X7) it2.next();
                    if (x11.c() == DocumentType.ID_CARD || x11.c() == DocumentType.FRENCH_ID_CARD) {
                        bVar2 = C3171dc.b.UNCHECKED;
                    }
                } else {
                    bVar2 = C3171dc.b.NOT_ACCEPTED;
                }
            }
        }
        a(arrayList, bVar2, dVarA2, interfaceC3903uhA2, documentType);
        QA.d dVarA3 = QA.a.a(QA.f27433a, R.string.step_document_type_document_type_DrivingLicense, 0, 2, null);
        InterfaceC3903uh interfaceC3903uhA3 = this.f32958b.a(EnumC3689ph.f34577x0);
        if (z11 && list.isEmpty()) {
            bVar3 = C3171dc.b.NOT_ACCEPTED;
        } else {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    X7 x12 = (X7) it3.next();
                    if (x12.c() == DocumentType.DRIVERS_LICENSE || x12.c() == DocumentType.DUTCH_DRIVERS_LICENSE) {
                        bVar3 = C3171dc.b.UNCHECKED;
                    }
                } else {
                    bVar3 = C3171dc.b.NOT_ACCEPTED;
                }
            }
        }
        a(arrayList, bVar3, dVarA3, interfaceC3903uhA3, documentType2);
        QA.d dVarA4 = QA.a.a(QA.f27433a, R.string.step_document_type_document_type_ResidencePermit, 0, 2, null);
        InterfaceC3903uh interfaceC3903uhA4 = this.f32958b.a(EnumC3689ph.f34579y0);
        DocumentType documentType4 = DocumentType.RESIDENCE_PERMIT;
        if (!z11 || !list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    bVar4 = C3171dc.b.NOT_ACCEPTED;
                    break;
                }
                if (((X7) it4.next()).c() == DocumentType.RESIDENCE_PERMIT) {
                    bVar4 = C3171dc.b.UNCHECKED;
                    break;
                }
            }
        } else {
            bVar4 = C3171dc.b.NOT_ACCEPTED;
            break;
        }
        a(arrayList, bVar4, dVarA4, interfaceC3903uhA4, documentType4);
        if (p013kotlin.jvm.internal.s.f(str, "ITA")) {
            QA.d dVarA5 = QA.a.a(QA.f27433a, R.string.step_document_type_document_type_PaperID, 0, 2, null);
            InterfaceC3903uh interfaceC3903uhA5 = this.f32958b.a(EnumC3689ph.f34581z0);
            DocumentType documentType5 = DocumentType.PAPER_ID;
            if (!z11 || !list.isEmpty()) {
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        bVar5 = C3171dc.b.NOT_ACCEPTED;
                        break;
                    }
                    if (((X7) it5.next()).c() == DocumentType.PAPER_ID) {
                        bVar5 = C3171dc.b.UNCHECKED;
                        break;
                    }
                }
            } else {
                bVar5 = C3171dc.b.NOT_ACCEPTED;
                break;
            }
            a(arrayList, bVar5, dVarA5, interfaceC3903uhA5, documentType5);
        }
        p013kotlin.collections.v.C(arrayList, this.f32957a);
        return arrayList;
    }

    private final boolean a(List list, C3171dc.b bVar, QA qa2, InterfaceC3903uh interfaceC3903uh, DocumentType documentType) {
        return list.add(new C3171dc.a(bVar, qa2, interfaceC3903uh, documentType));
    }
}
