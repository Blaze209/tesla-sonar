package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.Collection;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3430jg implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f32762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3346hg f32763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3175dg.a f32764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3175dg f32765d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jg$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3718q9.values().length];
            try {
                iArr[EnumC3718q9.Traditional.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3718q9.Eid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3430jg(InterfaceC3732qh imageServiceLocator, InterfaceC3346hg repository) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.f32762a = imageServiceLocator;
        this.f32763b = repository;
        EnumC3718q9 enumC3718q9 = EnumC3718q9.Traditional;
        QA.a aVar = QA.f27433a;
        C3175dg.a aVar2 = new C3175dg.a(enumC3718q9, QA.a.a(aVar, R.string.step_document_verification_type_verification_type_id_document, 0, 2, null), QA.a.a(aVar, R.string.step_document_verification_type_verification_type_id_document_description, 0, 2, null), null, false, false, 32, null);
        this.f32764c = aVar2;
        this.f32765d = new C3175dg(QA.a.a(aVar, R.string.step_document_verification_type_header, 0, 2, null), QA.a.a(aVar, R.string.step_document_verification_type_label_type, 0, 2, null), new InterfaceC3777rk.b(false, false), new QA.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), p013kotlin.collections.v.p(j(), aVar2));
    }

    private final C3175dg.a j() {
        EnumC3718q9 enumC3718q9 = EnumC3718q9.Eid;
        QA.a aVar = QA.f27433a;
        return new C3175dg.a(enumC3718q9, QA.a.a(aVar, R.string.step_document_verification_type_verification_type_eid, 0, 2, null), QA.a.a(aVar, R.string.step_document_verification_type_verification_type_eid_description_germany, 0, 2, null), this.f32762a.a(EnumC3689ph.W0), false, this.f32763b.b());
    }

    public final wn0.l a(final EnumC3718q9 enumC3718q9, final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.q51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3430jg.a(enumC3718q9, this, z11, (C3175dg) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3175dg getInitialState() {
        return this.f32765d;
    }

    public static /* synthetic */ wn0.l a(C3430jg c3430jg, EnumC3718q9 enumC3718q9, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enumC3718q9 = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c3430jg.a(enumC3718q9, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3175dg a(EnumC3718q9 enumC3718q9, C3430jg c3430jg, boolean z11, C3175dg c3175dg) {
        List listP;
        p013kotlin.jvm.internal.s.k(c3175dg, "<this>");
        int i11 = enumC3718q9 == null ? -1 : a.$EnumSwitchMapping$0[enumC3718q9.ordinal()];
        boolean z12 = true;
        if (i11 == -1) {
            listP = p013kotlin.collections.v.p(c3430jg.j(), c3430jg.f32764c);
        } else if (i11 == 1) {
            listP = p013kotlin.collections.v.p(c3430jg.j(), C3175dg.a.a(c3430jg.f32764c, null, null, null, null, true, false, 47, null));
        } else if (i11 == 2) {
            if (!c3430jg.f32763b.b()) {
                listP = p013kotlin.collections.v.p(c3430jg.j(), C3175dg.a.a(c3430jg.f32764c, null, null, null, null, true, false, 47, null));
            } else {
                listP = p013kotlin.collections.v.p(C3175dg.a.a(c3430jg.j(), null, null, null, null, true, false, 47, null), c3430jg.f32764c);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        List<C3175dg.a> list = listP;
        InterfaceC3777rk.b bVarQ = c3175dg.q();
        if ((list instanceof Collection) && list.isEmpty()) {
            z12 = false;
        } else {
            for (C3175dg.a aVar : list) {
                if (aVar.f() && aVar.e()) {
                    if (z11) {
                        break;
                    }
                }
            }
            z12 = false;
        }
        return C3175dg.a(c3175dg, null, null, bVarQ.a(z12, z11), null, list, 11, null);
    }
}
