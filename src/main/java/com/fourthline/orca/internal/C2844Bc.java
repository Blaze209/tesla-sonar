package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.sdk.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2844Bc implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4071yc f25086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3715q6 f25087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f25088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3898uc f25089d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Bc$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C2844Bc(InterfaceC4071yc repository, InterfaceC3715q6 dateFormatter, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(dateFormatter, "dateFormatter");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f25086a = repository;
        this.f25087b = dateFormatter;
        this.f25088c = imageServiceLocator;
        QA.a aVar = QA.f27433a;
        this.f25089d = new C3898uc(QA.a.a(aVar, R.string.step_document_version_header, 0, 2, null), QA.a.a(aVar, R.string.step_document_version_label_version, 0, 2, null), QA.a.a(aVar, R.string.shared_button_continue, 0, 2, null), new QA.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), p013kotlin.collections.v.m(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3898uc a(C2844Bc c2844Bc, C3684pc c3684pc, C3898uc c3898uc) {
        boolean z11;
        p013kotlin.jvm.internal.s.k(c3898uc, "<this>");
        List<C3684pc> listA = c2844Bc.f25086a.a();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listA, 10));
        Date dateC = null;
        for (C3684pc c3684pc2 : listA) {
            DocumentType documentTypeC = c3684pc2.b().c();
            QA qaA = c2844Bc.a(c3684pc2, dateC);
            EnumC3689ph enumC3689phA = c2844Bc.a(c3684pc2);
            C3898uc.a aVar = new C3898uc.a(documentTypeC, qaA, enumC3689phA != null ? c2844Bc.f25088c.a(enumC3689phA) : null, p013kotlin.jvm.internal.s.f(c3684pc2, c3684pc));
            dateC = c3684pc2.c();
            arrayList.add(aVar);
        }
        if (arrayList.isEmpty()) {
            z11 = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C3898uc.a) it.next()).d()) {
                    z11 = true;
                }
            }
            z11 = false;
        }
        return C3898uc.a(c3898uc, null, null, null, null, arrayList, z11, 15, null);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3898uc getInitialState() {
        return this.f25089d;
    }

    public final wn0.l b(final C3684pc c3684pc) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.z00
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C2844Bc.a(this.f37167a, c3684pc, (C3898uc) obj);
            }
        };
    }

    private final QA a(C3684pc c3684pc, Date date) {
        if (c3684pc.c() != null) {
            return QA.f27433a.a(R.string.step_document_version_radio_id_issued_after, this.f25087b.a(c3684pc.c()));
        }
        if (date == null) {
            return null;
        }
        return QA.f27433a.a(R.string.step_document_version_radio_id_issued_before, this.f25087b.a(date));
    }

    private final EnumC3689ph a(C3684pc c3684pc) {
        String strC = c3684pc.a().c();
        if (p013kotlin.jvm.internal.s.f(strC, "FRA")) {
            int i11 = a.$EnumSwitchMapping$0[c3684pc.b().c().ordinal()];
            if (i11 == 1) {
                return EnumC3689ph.f34558o;
            }
            if (i11 != 2) {
                return null;
            }
            return EnumC3689ph.f34560p;
        }
        if (!p013kotlin.jvm.internal.s.f(strC, "ROU")) {
            return null;
        }
        int i12 = a.$EnumSwitchMapping$0[c3684pc.b().c().ordinal()];
        if (i12 == 1) {
            return EnumC3689ph.f34562q;
        }
        if (i12 != 2) {
            return null;
        }
        return EnumC3689ph.f34564r;
    }
}
