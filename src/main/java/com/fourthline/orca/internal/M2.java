package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class M2 implements InterfaceC4022xC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3935vC f26882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f26883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3721qC f26884c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[H2.values().length];
            try {
                iArr[H2.Sepa.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H2.Online.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H2.Manual.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public M2(InterfaceC3935vC repository, InterfaceC3732qh imageServiceLocator) {
        Object next;
        C3721qC.a aVar;
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f26882a = repository;
        this.f26883b = imageServiceLocator;
        List supportedTypes = repository.getSupportedTypes();
        QA.a aVar2 = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar2, R.string.step_bav_type_header, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar2, R.string.step_bav_type_label_payment_method, 0, 2, null);
        QA.d dVarA3 = QA.a.a(aVar2, R.string.step_bav_type_hint_instructions, 0, 2, null);
        Iterator it = supportedTypes.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BavPaymentMethod) next).getName() != H2.Sepa);
        if (((BavPaymentMethod) next) != null) {
            QA.a aVar3 = QA.f27433a;
            aVar = new C3721qC.a(QA.a.a(aVar3, R.string.shared_footer_sepa, 0, 2, null), QA.a.a(aVar3, R.string.shared_button_read_more, 0, 2, null));
        } else {
            aVar = null;
        }
        this.f26884c = new C3721qC(dVarA, dVarA2, a(supportedTypes), dVarA3, aVar, new InterfaceC3777rk.b(false), new InterfaceC3777rk.a.C0608a(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC4022xC
    public wn0.l a(BavPaymentMethod bavPaymentMethod) {
        return InterfaceC4022xC.a.a(this, bavPaymentMethod);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3721qC getInitialState() {
        return this.f26884c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4022xC
    public wn0.l a(boolean z11) {
        return InterfaceC4022xC.a.a(this, z11);
    }

    private final List a(List list) {
        QA.d dVarA;
        QA qaA;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BavPaymentMethod bavPaymentMethod = (BavPaymentMethod) it.next();
            C3721qC.d dVar = C3721qC.d.UNCHECKED;
            C3721qC.c cVar = C3721qC.c.Descriptive;
            H2 name = bavPaymentMethod.getName();
            int[] iArr = a.$EnumSwitchMapping$0;
            int i11 = iArr[name.ordinal()];
            InterfaceC3903uh interfaceC3903uhA = null;
            if (i11 == 1) {
                dVarA = QA.a.a(QA.f27433a, R.string.step_bav_type_payment_method_Sepa, 0, 2, null);
            } else if (i11 == 2) {
                dVarA = QA.a.a(QA.f27433a, R.string.step_bav_type_payment_method_Online, 0, 2, null);
            } else if (i11 == 3) {
                dVarA = QA.a.a(QA.f27433a, R.string.step_bav_type_payment_method_Manual, 0, 2, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i12 = iArr[bavPaymentMethod.getName().ordinal()];
            if (i12 == 1) {
                qaA = QA.f27433a.a(R.string.step_bav_type_payment_method_Sepa_description, "0." + bavPaymentMethod.getAmount());
            } else if (i12 == 2) {
                qaA = QA.f27433a.a(R.string.step_bav_type_payment_method_Online_description, "0." + bavPaymentMethod.getAmount());
            } else if (i12 == 3) {
                qaA = QA.a.a(QA.f27433a, R.string.step_bav_type_payment_method_Manual_description, 0, 2, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            QA qa2 = qaA;
            if (bavPaymentMethod.getFast()) {
                interfaceC3903uhA = this.f26883b.a(EnumC3689ph.W0);
            }
            arrayList.add(new C3721qC.b(dVar, cVar, dVarA, qa2, interfaceC3903uhA, bavPaymentMethod));
        }
        return arrayList;
    }
}
