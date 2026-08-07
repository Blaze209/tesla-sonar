package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4002wt implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f36595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3529lt f36596b;

    public C4002wt(Yj networkSpinnerBoldLottieSource, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(networkSpinnerBoldLottieSource, "networkSpinnerBoldLottieSource");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f36595a = imageServiceLocator;
        QA.a aVar = QA.f27433a;
        this.f36596b = new C3529lt(QA.a.a(aVar, R.string.step_qes_agree_header, 0, 2, null), new C3529lt.a(QA.a.a(aVar, R.string.step_qes_agree_label_contracts, 0, 2, null), p013kotlin.collections.v.m(), p013kotlin.collections.v.m(), new C3529lt.a.b(QA.a.a(aVar, R.string.step_qes_agree_label_loading, 0, 2, null), networkSpinnerBoldLottieSource)), null, QA.a.a(aVar, R.string.shared_button_continue, 0, 2, null), QA.a.a(aVar, R.string.shared_button_exit, 0, 2, null), false, true, false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3529lt a(C3529lt c3529lt) {
        p013kotlin.jvm.internal.s.k(c3529lt, "<this>");
        return C3529lt.a(c3529lt, null, null, null, QA.a.a(QA.f27433a, R.string.shared_button_saving, 0, 2, null), null, false, false, true, false, false, 791, null);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3529lt getInitialState() {
        return this.f36596b;
    }

    public final wn0.l o() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.th1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4002wt.a((C3529lt) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3529lt b(boolean z11, C3529lt c3529lt) {
        p013kotlin.jvm.internal.s.k(c3529lt, "<this>");
        return C3529lt.a(c3529lt, null, null, null, null, null, z11 && (c3529lt.u() || (c3529lt.q() == null)), false, false, z11, false, 735, null);
    }

    public final wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.uh1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4002wt.a(z11, (C3529lt) obj);
            }
        };
    }

    public final wn0.l e(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.vh1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4002wt.b(z11, (C3529lt) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3529lt a(boolean z11, C3529lt c3529lt) {
        p013kotlin.jvm.internal.s.k(c3529lt, "<this>");
        return C3529lt.a(c3529lt, null, null, null, null, null, c3529lt.v() && z11, false, false, false, z11, 479, null);
    }

    public final wn0.l a(final List signDocuments, final List legalDocuments, final List list) {
        p013kotlin.jvm.internal.s.k(signDocuments, "signDocuments");
        p013kotlin.jvm.internal.s.k(legalDocuments, "legalDocuments");
        return new wn0.l() { // from class: com.fourthline.orca.internal.wh1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4002wt.a(signDocuments, legalDocuments, list, this, (C3529lt) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3529lt a(List list, List list2, List list3, C4002wt c4002wt, C3529lt c3529lt) {
        String str;
        p013kotlin.jvm.internal.s.k(c3529lt, "<this>");
        C3529lt.a aVarP = c3529lt.p();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3529lt.a.InterfaceC0579a.b(((InterfaceC3788rv.b.a.C0611b) it.next()).c(), c4002wt.f36595a.a(EnumC3689ph.I0)));
        }
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C3529lt.a.InterfaceC0579a.C0580a(((InterfaceC3788rv.b.a.C0610a) it2.next()).c()));
        }
        C3529lt.a aVarA = C3529lt.a.a(aVarP, null, arrayList, arrayList2, null, 1, null);
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((InterfaceC3746qv.a.C0603a.C0604a) it3.next()).b());
            }
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                Object next = it4.next();
                while (it4.hasNext()) {
                    next = ((String) next) + "\n\n" + ((String) it4.next());
                }
                str = (String) next;
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        } else {
            str = null;
        }
        return C3529lt.a(c3529lt, null, aVarA, str, null, null, false, false, false, false, false, 889, null);
    }
}
