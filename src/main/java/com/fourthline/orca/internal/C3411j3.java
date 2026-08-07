package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3411j3 implements Qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3454k3 f32658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f32659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kh f32660c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.j3$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Q9.values().length];
            try {
                iArr[Q9.Birthplace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3411j3(InterfaceC3454k3 repository, InterfaceC3732qh imageServiceLocator, Kh analytics) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f32658a = repository;
        this.f32659b = imageServiceLocator;
        this.f32660c = analytics;
    }

    public Nh a(S9 s11, Q9 q11, boolean z11) {
        return Qh.a.a(this, s11, q11, z11);
    }

    @Override // com.fourthline.orca.internal.Qh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uh a(Q9 type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        if (a.$EnumSwitchMapping$0[type.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String strA = this.f32658a.a();
        return (strA == null || p013kotlin.text.t.y0(strA)) ? new Uh.a(new Th.c()) : Uh.b.f28796a;
    }

    @Override // com.fourthline.orca.internal.Qh
    public InterfaceC3732qh j() {
        return this.f32659b;
    }

    @Override // com.fourthline.orca.internal.Qh
    public Kh o() {
        return this.f32660c;
    }

    @Override // com.fourthline.orca.internal.Qh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Nh a(S9 s11, Q9 type) {
        p013kotlin.jvm.internal.s.k(s11, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        if (a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return s11.p();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nh b(S9 s11, Q9 q11) {
        return Qh.a.a(this, s11, q11);
    }

    public String b(Q9 type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        InterfaceC3454k3 interfaceC3454k3 = this.f32658a;
        if (a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return interfaceC3454k3.a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    public Nh a(Q9 type) {
        C3411j3 c3411j3;
        QA qaA;
        p013kotlin.jvm.internal.s.k(type, "type");
        String strB = b(type);
        if (strB == null || strB.length() == 0) {
            c3411j3 = this;
            qaA = null;
        } else {
            Uh uhA = a(type);
            if (uhA instanceof Uh.a) {
                c3411j3 = this;
                qaA = c3411j3.a(type, ((Uh.a) uhA).a());
            } else {
                c3411j3 = this;
                qaA = null;
            }
        }
        Gh gh2 = qaA == null ? Gh.UNFOCUSED : Gh.ERROR;
        if (strB == null) {
            strB = "";
        }
        String str = strB;
        QA.b bVar = QA.b.f27435b;
        Nh nh2 = new Nh(null, null, false, gh2, str, bVar, bVar, qaA == null ? bVar : qaA, null, null, 0, 1799, null);
        if (a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            QA.a aVar = QA.f27433a;
            Nh nhA = Nh.a(nh2, null, "person_birth_place", false, null, null, QA.a.a(aVar, R.string.step_personal_details_label_place_of_birth, 0, 2, null), QA.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null), null, null, null, 0, 1949, null);
            if (nhA.c().length() > 0) {
                c3411j3.o().a(nhA);
            }
            return nhA;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.Qh
    public QA a(Q9 type, Th error) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(error, "error");
        if (error instanceof Th.c) {
            return QA.f27433a.b(R.string.shared_validation_required);
        }
        return QA.f27433a.a(R.string.shared_validation_invalid);
    }
}
