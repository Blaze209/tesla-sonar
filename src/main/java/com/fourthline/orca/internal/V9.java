package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class V9 implements Eh, Xs, Qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gi f29050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3411j3 f29051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S9 f29052c;

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

    public V9(Gi nationalityViewStateProvider, C3411j3 birthPlaceInputViewStateHandler) {
        p013kotlin.jvm.internal.s.k(nationalityViewStateProvider, "nationalityViewStateProvider");
        p013kotlin.jvm.internal.s.k(birthPlaceInputViewStateHandler, "birthPlaceInputViewStateHandler");
        this.f29050a = nationalityViewStateProvider;
        this.f29051b = birthPlaceInputViewStateHandler;
        this.f29052c = new S9(QA.a.a(QA.f27433a, R.string.step_personal_details_header, 0, 2, null), nationalityViewStateProvider.getState(), a(Q9.Birthplace), new InterfaceC3777rk.b(a()), new InterfaceC3777rk.a.c(null, 1, null));
    }

    public Nh a(S9 s11, Q9 type, boolean z11) {
        p013kotlin.jvm.internal.s.k(s11, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        return this.f29051b.a((QD) s11, (Sh) type, z11);
    }

    @Override // com.fourthline.orca.internal.Qh
    public InterfaceC3732qh j() {
        return this.f29051b.j();
    }

    @Override // com.fourthline.orca.internal.Qh
    public Kh o() {
        return this.f29051b.o();
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public S9 getInitialState() {
        return this.f29052c;
    }

    public final wn0.l s() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.or0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return V9.a(this.f34372a, (S9) obj);
            }
        };
    }

    public Nh a(S9 s11, Q9 type) {
        p013kotlin.jvm.internal.s.k(s11, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        return this.f29051b.b((QD) s11, (Sh) type);
    }

    @Override // com.fourthline.orca.internal.Qh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Nh a(S9 s11, Q9 type) {
        p013kotlin.jvm.internal.s.k(s11, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        return this.f29051b.a(s11, type);
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.pr0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return V9.a(z11, this, (S9) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Qh
    public QA a(Q9 type, Th error) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(error, "error");
        return this.f29051b.a(type, error);
    }

    @Override // com.fourthline.orca.internal.Qh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uh a(Q9 type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        return this.f29051b.a(type);
    }

    public Nh a(Q9 type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        return this.f29051b.a(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S9 a(boolean z11, V9 v11, S9 s11) {
        p013kotlin.jvm.internal.s.k(s11, "<this>");
        return S9.a(s11, null, null, null, s11.r().a(!z11 && v11.a(), z11), s11.s().a(!z11), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S9 a(V9 v11, S9 s11) {
        p013kotlin.jvm.internal.s.k(s11, "<this>");
        return S9.a(s11, null, v11.a(v11.f29050a.getState()), null, s11.r().b(v11.a()), null, 21, null);
    }

    private final K0 a(K0 k11) {
        Uh uhB = this.f29050a.b();
        Uh.a aVar = uhB instanceof Uh.a ? (Uh.a) uhB : null;
        Th thA = aVar != null ? aVar.a() : null;
        return ((thA instanceof Th.b.C0521b) || (thA instanceof Th.b.a)) ? K0.a(k11, null, null, false, null, null, null, Gh.UNFOCUSED, QA.b.f27435b, null, null, null, null, 3647, null) : k11;
    }

    public final wn0.l a(final String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        return new wn0.l() { // from class: com.fourthline.orca.internal.qr0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return V9.a(input, this, (S9) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S9 a(String str, V9 v11, S9 s11) {
        p013kotlin.jvm.internal.s.k(s11, "<this>");
        Nh nhA = Nh.a(s11.p(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null);
        v11.o().b(nhA);
        jn0.h0 h0Var = jn0.h0.f84049a;
        return S9.a(s11, null, null, nhA, s11.r().b(v11.a()), null, 19, null);
    }

    public final wn0.l a(final Q9 fieldType, final boolean z11) {
        p013kotlin.jvm.internal.s.k(fieldType, "fieldType");
        return new wn0.l() { // from class: com.fourthline.orca.internal.rr0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return V9.a(z11, this, fieldType, (S9) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S9 a(boolean z11, V9 v11, Q9 q11, S9 s11) {
        Nh nhA;
        p013kotlin.jvm.internal.s.k(s11, "<this>");
        if (z11) {
            nhA = v11.a(s11, q11);
        } else if (a.$EnumSwitchMapping$0[q11.ordinal()] == 1) {
            nhA = v11.a(s11, q11, s11.p().getState() != Gh.UNFOCUSED);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Nh nh2 = nhA;
        if (a.$EnumSwitchMapping$0[q11.ordinal()] == 1) {
            return S9.a(s11, null, null, nh2, null, null, 27, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean a() {
        return this.f29050a.a() && (a(Q9.Birthplace) instanceof Uh.b);
    }
}
