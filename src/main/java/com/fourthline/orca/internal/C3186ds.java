package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.google.android.gms.wallet.WalletConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3186ds implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3059as f31233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f31234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f31235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rq f31236d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ds$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tr.values().length];
            try {
                iArr[Tr.UtilityBill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tr.TaxInvoice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tr.Insurance.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Tr.ProofOfHousing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Tr.BankStatement.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Tr.Other.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3186ds(InterfaceC3059as repository, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f31233a = repository;
        this.f31234b = imageServiceLocator;
        this.f31235c = a(repository.a());
        QA.a aVar = QA.f27433a;
        this.f31236d = new Rq(QA.a.a(aVar, R.string.step_poa_type_header, 0, 2, null), QA.a.a(aVar, R.string.step_poa_type_label_type, 0, 2, null), QA.a.a(aVar, R.string.step_poa_type_hint_instructions, 0, 2, null), QA.a.a(aVar, R.string.shared_button_continue, 0, 2, null), new QA.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), p013kotlin.collections.v.m(), false, new Rq.e(QA.a.a(aVar, R.string.step_poa_type_footer_no_poa, 0, 2, null), QA.a.a(aVar, R.string.shared_button_exit, 0, 2, null)), null, 320, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rq a(C3186ds c3186ds, Rq rq2) {
        p013kotlin.jvm.internal.s.k(rq2, "<this>");
        QA.a aVar = QA.f27433a;
        return Rq.a(rq2, null, null, null, null, null, null, false, null, new Sq(p013kotlin.collections.v.p(jn0.x.a(QA.a.a(aVar, R.string.step_poa_type_sheet_upload_photo, 0, 2, null), c3186ds.f31234b.a(EnumC3689ph.P0)), jn0.x.a(QA.a.a(aVar, R.string.step_poa_type_sheet_take_photo, 0, 2, null), c3186ds.f31234b.a(EnumC3689ph.Q0)))), 255, null);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Rq getInitialState() {
        return this.f31236d;
    }

    public final wn0.l o() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.x01
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3186ds.a((Rq) obj);
            }
        };
    }

    public final wn0.l r() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.y01
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3186ds.a(this.f36876a, (Rq) obj);
            }
        };
    }

    public final wn0.l a(final Tr tr2) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.z01
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3186ds.a(this.f37169a, tr2, (Rq) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rq a(C3186ds c3186ds, Tr tr2, Rq rq2) {
        Rq.f fVar;
        p013kotlin.jvm.internal.s.k(rq2, "<this>");
        List<Rq.a> list = c3186ds.f31235c;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (Rq.a aVar : list) {
            if (aVar.d() == tr2) {
                fVar = Rq.f.CHECKED;
            } else {
                fVar = Rq.f.UNCHECKED;
            }
            arrayList.add(Rq.a.a(aVar, fVar, null, null, null, 14, null));
        }
        return Rq.a(rq2, null, null, null, null, null, arrayList, tr2 != null, null, null, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rq a(Rq rq2) {
        p013kotlin.jvm.internal.s.k(rq2, "<this>");
        return Rq.a(rq2, null, null, null, null, null, null, false, null, null, 255, null);
    }

    private final List a(List list) {
        QA.d dVarA;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tr tr2 = (Tr) it.next();
            Rq.f fVar = Rq.f.UNCHECKED;
            int[] iArr = a.$EnumSwitchMapping$0;
            QA.d dVarA2 = null;
            switch (iArr[tr2.ordinal()]) {
                case 1:
                    dVarA = QA.a.a(QA.f27433a, R.string.step_poa_type_document_type_UtilityBill, 0, 2, null);
                    break;
                case 2:
                    dVarA = QA.a.a(QA.f27433a, R.string.step_poa_type_document_type_TaxInvoice, 0, 2, null);
                    break;
                case 3:
                    dVarA = QA.a.a(QA.f27433a, R.string.step_poa_type_document_type_benefit_statement, 0, 2, null);
                    break;
                case 4:
                    dVarA = QA.a.a(QA.f27433a, R.string.step_poa_type_document_type_proof_of_housing, 0, 2, null);
                    break;
                case 5:
                    dVarA = QA.a.a(QA.f27433a, R.string.step_poa_type_document_type_Bankstatement, 0, 2, null);
                    break;
                case 6:
                    dVarA = QA.a.a(QA.f27433a, R.string.step_poa_type_document_type_other, 0, 2, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[tr2.ordinal()]) {
                case 1:
                    dVarA2 = QA.f27433a.a(R.string.step_poa_type_document_type_UtilityBill_description, R.string.shared_radio_document_type_utility_bill_accessibility);
                    break;
                case 2:
                    dVarA2 = QA.f27433a.a(R.string.step_poa_type_document_type_TaxInvoice_description, R.string.shared_radio_document_type_tax_invoice_accessibility);
                    break;
                case 3:
                    dVarA2 = QA.f27433a.a(R.string.step_poa_type_document_type_benefit_statement_description, R.string.shared_radio_document_type_benefit_statement_accessibility);
                    break;
                case 4:
                    dVarA2 = QA.f27433a.a(R.string.step_poa_type_document_type_proof_of_housing_description, R.string.shared_radio_document_type_proof_of_housing_accessibility);
                    break;
                case 5:
                case 6:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new Rq.a(fVar, dVarA, dVarA2, tr2));
        }
        return arrayList;
    }
}
