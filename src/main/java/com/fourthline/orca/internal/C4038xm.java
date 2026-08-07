package com.fourthline.orca.internal;

import android.text.TextUtils;
import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4038xm implements Qh, Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O3 f36767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f36768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kh f36769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3952vm f36770d;

    public C4038xm(O3 repository, InterfaceC3732qh imageServiceLocator, Kh analytics, InterfaceC3903uh canHintImageSource) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(canHintImageSource, "canHintImageSource");
        this.f36767a = repository;
        this.f36768b = imageServiceLocator;
        this.f36769c = analytics;
        QA.a aVar = QA.f27433a;
        this.f36770d = new C3952vm(QA.a.a(aVar, R.string.step_document_can_header, 0, 2, null), a(EnumC3865tm.Can), QA.a.a(aVar, R.string.step_document_can_hint_can, 0, 2, null), canHintImageSource, new C3952vm.a(QA.a.a(aVar, R.string.step_document_can_footer_can_not_found, 0, 2, null), QA.a.a(aVar, R.string.shared_button_take_photos, 0, 2, null)), new C3952vm.b(QA.a.a(aVar, R.string.shared_button_continue, 0, 2, null), false), new QA.d(R.string.shared_button_back, R.string.shared_button_back_accessibility));
    }

    public Nh a(C3952vm c3952vm, EnumC3865tm enumC3865tm, boolean z11) {
        return Qh.a.a(this, c3952vm, enumC3865tm, z11);
    }

    @Override // com.fourthline.orca.internal.Qh
    public InterfaceC3732qh j() {
        return this.f36768b;
    }

    @Override // com.fourthline.orca.internal.Qh
    public Kh o() {
        return this.f36769c;
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C3952vm getInitialState() {
        return this.f36770d;
    }

    @Override // com.fourthline.orca.internal.Qh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uh a(EnumC3865tm type) {
        String strA;
        p013kotlin.jvm.internal.s.k(type, "type");
        String strA2 = this.f36767a.a();
        return (strA2 == null || strA2.length() != 6 || (strA = this.f36767a.a()) == null || !TextUtils.isDigitsOnly(strA)) ? new Uh.a(new Th.d()) : Uh.b.f28796a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nh b(C3952vm c3952vm, EnumC3865tm enumC3865tm) {
        return Qh.a.a(this, c3952vm, enumC3865tm);
    }

    @Override // com.fourthline.orca.internal.Qh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Nh a(C3952vm c3952vm, EnumC3865tm type) {
        p013kotlin.jvm.internal.s.k(c3952vm, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        return c3952vm.r();
    }

    public String b(EnumC3865tm type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        return this.f36767a.a();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    public Nh a(EnumC3865tm type) {
        C4038xm c4038xm;
        QA qaA;
        p013kotlin.jvm.internal.s.k(type, "type");
        String strB = b(type);
        if (strB == null || strB.length() == 0) {
            c4038xm = this;
            qaA = null;
        } else {
            Uh uhA = a(type);
            if (uhA instanceof Uh.a) {
                c4038xm = this;
                qaA = c4038xm.a(type, ((Uh.a) uhA).a());
            } else {
                c4038xm = this;
                qaA = null;
            }
        }
        Gh gh2 = qaA == null ? Gh.UNFOCUSED : Gh.ERROR;
        Mh mh2 = Mh.NumberOrIdentifier;
        if (strB == null) {
            strB = "";
        }
        String str = strB;
        QA.a aVar = QA.f27433a;
        Nh nh2 = new Nh(mh2, "document_can_number", false, gh2, str, QA.a.a(aVar, R.string.step_document_can_label_can, 0, 2, null), QA.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null), qaA == null ? QA.b.f27435b : qaA, qaA != null ? c4038xm.j().a(EnumC3689ph.C0) : null, null, 0, 1540, null);
        if (nh2.c().length() > 0) {
            c4038xm.o().a(nh2);
        }
        return nh2;
    }

    @Override // com.fourthline.orca.internal.Qh
    public QA a(EnumC3865tm type, Th value) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(value, "value");
        return QA.a.a(QA.f27433a, R.string.step_document_can_validation_invalid_can, 0, 2, null);
    }

    public final wn0.l a(final String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        return new wn0.l() { // from class: com.fourthline.orca.internal.di1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4038xm.a(input, this, (C3952vm) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3952vm a(String str, C4038xm c4038xm, C3952vm c3952vm) {
        p013kotlin.jvm.internal.s.k(c3952vm, "<this>");
        return C3952vm.a(c3952vm, null, Nh.a(c3952vm.r(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, C3952vm.b.a(c3952vm.t(), null, c4038xm.a(EnumC3865tm.Can) instanceof Uh.b, 1, null), null, 93, null);
    }

    public final wn0.l a(final EnumC3865tm fieldType, final boolean z11) {
        p013kotlin.jvm.internal.s.k(fieldType, "fieldType");
        return new wn0.l() { // from class: com.fourthline.orca.internal.ei1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4038xm.a(z11, this, fieldType, (C3952vm) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3952vm a(boolean z11, C4038xm c4038xm, EnumC3865tm enumC3865tm, C3952vm c3952vm) {
        Nh nhA;
        p013kotlin.jvm.internal.s.k(c3952vm, "<this>");
        if (z11) {
            nhA = c4038xm.b((QD) c3952vm, (Sh) enumC3865tm);
        } else {
            nhA = c4038xm.a((QD) c3952vm, (Sh) enumC3865tm, c3952vm.r().getState() != Gh.UNFOCUSED);
        }
        return C3952vm.a(c3952vm, null, nhA, null, null, null, null, null, 125, null);
    }
}
