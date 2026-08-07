package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import java.util.Objects;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements Qh, Eh, Xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rh f25685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f25686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f25687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Kh f25688d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[A.values().length];
            try {
                iArr[A.POSTAL_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[A.HOUSE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[A.HOUSE_NUMBER_SUFFIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[A.STREET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[A.CITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public F(Rh residencyViewStateProvider, G repository, InterfaceC3732qh imageServiceLocator, Kh analytics) {
        p013kotlin.jvm.internal.s.k(residencyViewStateProvider, "residencyViewStateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f25685a = residencyViewStateProvider;
        this.f25686b = repository;
        this.f25687c = imageServiceLocator;
        this.f25688d = analytics;
    }

    public Nh a(E e11, A a11, boolean z11) {
        return Qh.a.a(this, e11, a11, z11);
    }

    @Override // com.fourthline.orca.internal.Qh
    public InterfaceC3732qh j() {
        return this.f25687c;
    }

    @Override // com.fourthline.orca.internal.Qh
    public Kh o() {
        return this.f25688d;
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public E getInitialState() {
        return new E(QA.a.a(QA.f27433a, R.string.step_address_details_header, 0, 2, null), this.f25685a.getState(), a(A.POSTAL_CODE), a(A.HOUSE_NUMBER), a(A.HOUSE_NUMBER_SUFFIX), a(A.STREET), a(A.CITY), new InterfaceC3777rk.b(a()), new InterfaceC3777rk.a.c(null, 1, null));
    }

    public final wn0.l s() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.s20
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return F.a(this.f35194a, (E) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Qh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uh a(A type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        G g11 = this.f25686b;
        int i11 = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            return a(g11.i(), g11.g());
        }
        if (i11 == 2) {
            return a(g11.f(), g11.h());
        }
        if (i11 == 3) {
            return g11.k() ? Uh.b.f28796a : new Uh.a(new Th.d());
        }
        if (i11 == 4) {
            return a(g11.l(), g11.j());
        }
        if (i11 == 5) {
            return a(g11.m(), g11.n());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.q20
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return F.a(z11, (E) obj);
            }
        };
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nh b(E e11, A a11) {
        return Qh.a.a(this, e11, a11);
    }

    @Override // com.fourthline.orca.internal.Qh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Nh a(E e11, A type) {
        p013kotlin.jvm.internal.s.k(e11, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        int i11 = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            return e11.s();
        }
        if (i11 == 2) {
            return e11.v();
        }
        if (i11 == 3) {
            return e11.w();
        }
        if (i11 == 4) {
            return e11.u();
        }
        if (i11 == 5) {
            return e11.q();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E a(boolean z11, E e11) {
        p013kotlin.jvm.internal.s.k(e11, "<this>");
        boolean z12 = !z11;
        return E.a(e11, null, null, null, null, null, null, null, e11.r().a(z12, z11), e11.p().a(z12), 127, null);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    public Nh a(A type) {
        F f11;
        QA qaA;
        Nh nhA;
        p013kotlin.jvm.internal.s.k(type, "type");
        String strB = b(type);
        if (strB == null || strB.length() == 0) {
            f11 = this;
            qaA = null;
        } else {
            Uh uhA = a(type);
            if (uhA instanceof Uh.a) {
                f11 = this;
                qaA = f11.a(type, ((Uh.a) uhA).a());
            } else {
                f11 = this;
                qaA = null;
            }
        }
        Gh gh2 = qaA == null ? Gh.UNFOCUSED : Gh.ERROR;
        if (strB == null) {
            strB = "";
        }
        String str = strB;
        QA.b bVar = QA.b.f27435b;
        Nh nh2 = new Nh(null, null, false, gh2, str, bVar, bVar, qaA == null ? bVar : qaA, qaA != null ? f11.j().a(EnumC3689ph.C0) : null, null, 0, 1543, null);
        int i11 = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            QA.a aVar = QA.f27433a;
            nhA = Nh.a(nh2, null, "address_postal_code", false, null, null, QA.a.a(aVar, R.string.step_address_details_label_postal_code, 0, 2, null), QA.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null), null, null, null, 0, 1949, null);
        } else if (i11 == 2) {
            nhA = Nh.a(nh2, null, "address_street_number", false, null, null, QA.a.a(QA.f27433a, R.string.step_address_details_label_house_number, 0, 2, null), bVar, null, null, null, 0, 1949, null);
        } else if (i11 == 3) {
            nhA = Nh.a(nh2, null, "address_street_number_suffix", false, null, null, QA.a.a(QA.f27433a, R.string.step_address_details_label_suffix, 0, 2, null), bVar, null, null, null, 0, 1949, null);
        } else if (i11 == 4) {
            QA.a aVar2 = QA.f27433a;
            nhA = Nh.a(nh2, null, "address_street", false, null, null, QA.a.a(aVar2, R.string.step_address_details_label_street, 0, 2, null), QA.a.a(aVar2, R.string.shared_placeholder_add, 0, 2, null), null, null, null, 0, 1949, null);
        } else if (i11 == 5) {
            QA.a aVar3 = QA.f27433a;
            nhA = Nh.a(nh2, null, "address_city", false, null, null, QA.a.a(aVar3, R.string.step_address_details_label_city, 0, 2, null), QA.a.a(aVar3, R.string.shared_placeholder_add, 0, 2, null), null, null, null, 0, 1949, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (nhA.c().length() > 0) {
            f11.o().a(nhA);
        }
        return nhA;
    }

    public String b(A type) {
        String string;
        p013kotlin.jvm.internal.s.k(type, "type");
        G g11 = this.f25686b;
        int i11 = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            return g11.i();
        }
        if (i11 == 2) {
            Integer numF = g11.f();
            return (numF == null || (string = numF.toString()) == null) ? "" : string;
        }
        if (i11 == 3) {
            return g11.o();
        }
        if (i11 == 4) {
            return g11.l();
        }
        if (i11 == 5) {
            return g11.m();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Uh a(Object obj, boolean z11) {
        if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
            return new Uh.a(new Th.c());
        }
        if (obj == null) {
            Objects.toString(obj);
            return new Uh.a(new Th.c());
        }
        if (!z11) {
            obj.toString();
            return new Uh.a(new Th.d());
        }
        obj.toString();
        return Uh.b.f28796a;
    }

    @Override // com.fourthline.orca.internal.Qh
    public QA a(A type, Th error) {
        int i11;
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(error, "error");
        if (error instanceof Th.c) {
            QA.a aVar = QA.f27433a;
            int i12 = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i12 == 1) {
                i11 = R.string.shared_validation_required_postal_code_accessibility;
            } else if (i12 == 2) {
                i11 = R.string.shared_validation_required_house_number_accessibility;
            } else if (i12 == 3) {
                i11 = R.string.shared_validation_required;
            } else if (i12 == 4) {
                i11 = R.string.shared_validation_required_street_accessibility;
            } else if (i12 == 5) {
                i11 = R.string.shared_validation_required_city_accessibility;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return aVar.b(i11);
        }
        return QA.a.a(QA.f27433a, 0, 1, null);
    }

    public final wn0.l a(final A fieldType, final String value) {
        p013kotlin.jvm.internal.s.k(fieldType, "fieldType");
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.r20
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return F.a(this.f34965a, fieldType, value, (E) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E a(F f11, A a11, String str, E e11) {
        p013kotlin.jvm.internal.s.k(e11, "<this>");
        Nh nhA = Nh.a(f11.a(e11, a11), null, null, false, null, str, null, null, null, null, null, 0, 2031, null);
        int i11 = a.$EnumSwitchMapping$0[a11.ordinal()];
        if (i11 == 1) {
            return E.a(e11, null, null, nhA, null, null, null, null, e11.r().b(f11.a()), null, 379, null);
        }
        if (i11 == 2) {
            return E.a(e11, null, null, null, nhA, null, null, null, e11.r().b(f11.a()), null, 375, null);
        }
        if (i11 == 3) {
            return E.a(e11, null, null, null, null, nhA, null, null, e11.r().b(f11.a()), null, 367, null);
        }
        if (i11 == 4) {
            return E.a(e11, null, null, null, null, null, nhA, null, e11.r().b(f11.a()), null, 351, null);
        }
        if (i11 == 5) {
            return E.a(e11, null, null, null, null, null, null, nhA, e11.r().b(f11.a()), null, EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final wn0.l a(final A fieldType, final boolean z11) {
        p013kotlin.jvm.internal.s.k(fieldType, "fieldType");
        return new wn0.l() { // from class: com.fourthline.orca.internal.t20
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return F.a(z11, this, fieldType, (E) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    public static final E a(boolean z11, F f11, A a11, E e11) {
        boolean z12;
        Nh nhA;
        p013kotlin.jvm.internal.s.k(e11, "<this>");
        if (z11) {
            nhA = f11.b((QD) e11, (Sh) a11);
        } else {
            int i11 = a.$EnumSwitchMapping$0[a11.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                if (e11.q().getState() != Gh.UNFOCUSED) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (e11.u().getState() != Gh.UNFOCUSED) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else if (e11.w().getState() != Gh.UNFOCUSED) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else if (e11.v().getState() != Gh.UNFOCUSED) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else if (e11.s().getState() != Gh.UNFOCUSED) {
                z12 = true;
            } else {
                z12 = false;
            }
            nhA = f11.a((QD) e11, (Sh) a11, z12);
        }
        int i12 = a.$EnumSwitchMapping$0[a11.ordinal()];
        if (i12 == 1) {
            return E.a(e11, null, null, nhA, null, null, null, null, null, null, 507, null);
        }
        if (i12 == 2) {
            return E.a(e11, null, null, null, nhA, null, null, null, null, null, 503, null);
        }
        if (i12 == 3) {
            return E.a(e11, null, null, null, null, nhA, null, null, null, null, DownloaderService.STATUS_HTTP_DATA_ERROR, null);
        }
        if (i12 == 4) {
            return E.a(e11, null, null, null, null, null, nhA, null, null, null, 479, null);
        }
        if (i12 == 5) {
            return E.a(e11, null, null, null, null, null, null, nhA, null, null, 447, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E a(F f11, E e11) {
        p013kotlin.jvm.internal.s.k(e11, "<this>");
        return E.a(e11, null, f11.f25685a.getState(), null, null, null, null, null, e11.r().b(f11.a()), null, 381, null);
    }

    private final boolean a() {
        return this.f25685a.a() && this.f25686b.a();
    }
}
