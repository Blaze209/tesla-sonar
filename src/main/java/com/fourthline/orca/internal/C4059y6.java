package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import java.util.Date;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4059y6 implements InterfaceC3375i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Kh f36898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3289g8 f36899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f36900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Z7 f36901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3715q6 f36902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wn0.a f36903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f36904g;

    public C4059y6(Kh analytics, InterfaceC3289g8 repository, InterfaceC3732qh imageServiceLocator, Z7 contentProvider, InterfaceC3715q6 dateFormatter, wn0.a minPersonAgeFactory) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(contentProvider, "contentProvider");
        p013kotlin.jvm.internal.s.k(dateFormatter, "dateFormatter");
        p013kotlin.jvm.internal.s.k(minPersonAgeFactory, "minPersonAgeFactory");
        this.f36898a = analytics;
        this.f36899b = repository;
        this.f36900c = imageServiceLocator;
        this.f36901d = contentProvider;
        this.f36902e = dateFormatter;
        this.f36903f = minPersonAgeFactory;
        this.f36904g = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.mi1
            @Override // wn0.a
            public final Object invoke() {
                return C4059y6.a(this.f33599a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3903uh a(C4059y6 c4059y6) {
        return c4059y6.f36900c.a(EnumC3689ph.C0);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l b() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ni1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.d((C3246f8) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l c() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ui1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.a((C3246f8) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 b(boolean z11, C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        boolean z12 = !z11;
        return C3246f8.a(c3246f8, null, null, null, null, null, null, C3161d8.a(c3246f8.p(), null, null, z12, 3, null), c3246f8.w().a(z12, z11), null, EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 c(C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, Nh.a(c3246f8.s(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, null, null, null, null, 509, null);
    }

    private final InterfaceC3903uh j() {
        return (InterfaceC3903uh) this.f36904g.getValue();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public boolean a() {
        return this.f36899b.q() && this.f36899b.n() && this.f36899b.g();
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ri1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.b(z11, (C3246f8) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.Kh] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.fourthline.orca.internal.Th] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Nh e(boolean z11) {
        InterfaceC3903uh interfaceC3903uh;
        ?? r18;
        ?? cVar;
        Nh nhA;
        Gh gh2;
        QA qaA;
        InterfaceC3903uh interfaceC3903uhJ;
        InterfaceC3903uh interfaceC3903uh2;
        QA qaA2;
        Th.d dVar;
        Mh mh2 = Mh.Date;
        Gh gh3 = Gh.UNFOCUSED;
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_document_details_label_birth, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.shared_placeholder_date, 0, 2, null);
        QA.b bVar = QA.b.f27435b;
        Nh nh2 = new Nh(mh2, "person_birth_date", false, gh3, "", dVarA, dVarA2, bVar, null, null, 0, 1796, null);
        Date dateB = this.f36899b.b();
        if (dateB != null) {
            if (this.f36899b.g()) {
                String strA = this.f36902e.a(dateB);
                if (!z11 || this.f36899b.j()) {
                    interfaceC3903uh2 = null;
                    qaA2 = bVar;
                } else {
                    interfaceC3903uh2 = null;
                    qaA2 = QA.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
                }
                interfaceC3903uh = interfaceC3903uh2;
                nhA = Nh.a(nh2, null, null, false, null, strA, null, null, qaA2, null, null, 0, 1647, null);
                cVar = interfaceC3903uh;
            } else {
                nhA = Nh.a(nh2, null, null, false, Gh.ERROR, this.f36902e.a(dateB), null, null, aVar.a(R.string.shared_validation_date_underage, String.valueOf(((Number) this.f36903f.invoke()).intValue())), j(), null, 0, 1639, null);
                dVar = new Th.d();
                interfaceC3903uh = null;
            }
            if (nhA == null) {
                r18 = cVar;
            }
            if (z11) {
                this.f36898a.a(nhA);
                return nhA;
            }
            this.f36898a.b(nhA);
            if (cVar != 0) {
                this.f36898a.a(nhA, cVar);
            }
            return nhA;
        }
        interfaceC3903uh = null;
        r18 = 0;
        if (!z11) {
            gh2 = Gh.ERROR;
        }
        if (z11) {
            cVar = dVar;
        } else {
            cVar = dVar;
            qaA = aVar.a(R.string.shared_validation_invalid_date_of_birth_accessibility);
        }
        if (z11) {
            cVar = dVar;
            gh2 = gh3;
            cVar = dVar;
            gh2 = gh3;
            qaA = bVar;
            interfaceC3903uhJ = interfaceC3903uh;
        } else {
            cVar = dVar;
            gh2 = gh3;
            cVar = dVar;
            gh2 = gh3;
            qaA = bVar;
            interfaceC3903uhJ = j();
        }
        nhA = Nh.a(nh2, null, null, false, gh2, null, null, null, qaA, interfaceC3903uhJ, null, 0, 1655, null);
        cVar = !z11 ? new Th.c() : r18;
        if (z11) {
            this.f36898a.a(nhA);
            return nhA;
        }
        this.f36898a.b(nhA);
        if (cVar != 0) {
            this.f36898a.a(nhA, cVar);
        }
        return nhA;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.Kh] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.fourthline.orca.internal.Th$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.fourthline.orca.internal.Th] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Nh f(boolean z11) {
        InterfaceC3903uh interfaceC3903uh;
        Gh gh2;
        QA qaB;
        InterfaceC3903uh interfaceC3903uhJ;
        Nh nhA;
        ?? cVar;
        InterfaceC3903uh interfaceC3903uh2;
        QA qaA;
        Object dVar;
        Gh gh3;
        QA qaB2;
        Mh mh2 = Mh.NumberOrIdentifier;
        Gh gh4 = Gh.UNFOCUSED;
        QA qaC = this.f36901d.c();
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null);
        QA.b bVar = QA.b.f27435b;
        Nh nh2 = new Nh(mh2, GovernmentIdNfcScan.documentNumberName, false, gh4, "", qaC, dVarA, bVar, null, null, 0, 1796, null);
        String strS = this.f36899b.s();
        if (strS != null) {
            if (!p013kotlin.text.t.y0(strS)) {
                if (this.f36899b.q()) {
                    if (!z11 || this.f36899b.j()) {
                        interfaceC3903uh2 = null;
                        qaA = bVar;
                    } else {
                        interfaceC3903uh2 = null;
                        qaA = QA.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
                    }
                    interfaceC3903uh = interfaceC3903uh2;
                    nhA = Nh.a(nh2, null, null, false, null, strS, null, null, qaA, null, null, 0, 1647, null);
                    cVar = interfaceC3903uh;
                } else {
                    nhA = Nh.a(nh2, null, null, false, Gh.ERROR, strS, null, null, aVar.a(R.string.shared_validation_invalid_document_number_accessibility), j(), null, 0, 1639, null);
                    dVar = new Th.d();
                }
                if (nhA == null) {
                }
                if (z11) {
                    this.f36898a.a(nhA);
                    return nhA;
                }
                this.f36898a.b(nhA);
                if (cVar != 0) {
                    this.f36898a.a(nhA, cVar);
                }
                return nhA;
            }
            if (!z11) {
                gh3 = Gh.ERROR;
            }
            if (z11) {
                gh3 = gh4;
                qaB2 = bVar;
            } else {
                gh3 = gh4;
                qaB2 = aVar.b(R.string.shared_validation_required_document_number_accessibility);
            }
            nhA = Nh.a(nh2, null, null, false, gh3, null, null, null, qaB2, null, null, 0, 1911, null);
            dVar = !z11 ? new Th.c() : null;
            interfaceC3903uh = null;
            cVar = dVar;
            if (nhA == null) {
            }
            if (z11) {
                this.f36898a.a(nhA);
                return nhA;
            }
            this.f36898a.b(nhA);
            if (cVar != 0) {
                this.f36898a.a(nhA, cVar);
            }
            return nhA;
        }
        interfaceC3903uh = null;
        if (!z11) {
            gh2 = Gh.ERROR;
        }
        if (!z11) {
            qaB = aVar.b(R.string.shared_validation_required_document_number_accessibility);
        }
        if (z11) {
            gh2 = gh4;
            gh2 = gh4;
            qaB = bVar;
            interfaceC3903uhJ = interfaceC3903uh;
        } else {
            gh2 = gh4;
            gh2 = gh4;
            qaB = bVar;
            interfaceC3903uhJ = j();
        }
        nhA = Nh.a(nh2, null, null, false, gh2, null, null, null, qaB, interfaceC3903uhJ, null, 0, 1655, null);
        cVar = new Th.c();
        if (z11) {
            this.f36898a.a(nhA);
            return nhA;
        }
        this.f36898a.b(nhA);
        if (cVar != 0) {
            this.f36898a.a(nhA, cVar);
        }
        return nhA;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.Kh] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.fourthline.orca.internal.Th] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Nh g(boolean z11) {
        InterfaceC3903uh interfaceC3903uh;
        ?? r17;
        ?? cVar;
        Nh nhA;
        Gh gh2;
        QA qaB;
        InterfaceC3903uh interfaceC3903uhJ;
        InterfaceC3903uh interfaceC3903uh2;
        QA qaA;
        Th.a.C0520a c0520a;
        Mh mh2 = Mh.Date;
        Gh ghB = this.f36901d.b();
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_document_details_label_expire, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.shared_placeholder_date, 0, 2, null);
        QA.b bVar = QA.b.f27435b;
        Nh nh2 = new Nh(mh2, "document_expiration_date", false, ghB, "", dVarA, dVarA2, bVar, null, null, 0, 1796, null);
        Date dateL = this.f36899b.l();
        if (dateL != null) {
            if (this.f36899b.n()) {
                String strA = this.f36902e.a(dateL);
                if (!z11 || this.f36899b.j()) {
                    interfaceC3903uh2 = null;
                    qaA = bVar;
                } else {
                    interfaceC3903uh2 = null;
                    qaA = QA.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
                }
                interfaceC3903uh = interfaceC3903uh2;
                nhA = Nh.a(nh2, null, null, false, null, strA, null, null, qaA, null, null, 0, 1647, null);
                cVar = interfaceC3903uh;
            } else {
                nhA = Nh.a(nh2, null, null, false, Gh.ERROR, this.f36902e.a(dateL), null, null, QA.a.a(aVar, R.string.shared_validation_date_future, 0, 2, null), j(), null, 0, 1639, null);
                c0520a = new Th.a.C0520a();
                interfaceC3903uh = null;
            }
            if (nhA == null) {
                r17 = cVar;
            }
            if (z11) {
                this.f36898a.a(nhA);
                return nhA;
            }
            this.f36898a.b(nhA);
            if (cVar != 0) {
                this.f36898a.a(nhA, cVar);
            }
            return nhA;
        }
        interfaceC3903uh = null;
        r17 = 0;
        if (z11) {
            cVar = c0520a;
            gh2 = Gh.UNFOCUSED;
        } else {
            cVar = c0520a;
            gh2 = Gh.ERROR;
        }
        Gh gh3 = gh2;
        if (!z11) {
            qaB = aVar.b(R.string.shared_validation_required_expiry_date_accessibility);
        }
        if (z11) {
            qaB = bVar;
            interfaceC3903uhJ = interfaceC3903uh;
        } else {
            qaB = bVar;
            interfaceC3903uhJ = j();
        }
        nhA = Nh.a(nh2, null, null, false, gh3, null, null, null, qaB, interfaceC3903uhJ, null, 0, 1655, null);
        cVar = !z11 ? new Th.c() : r17;
        if (z11) {
            this.f36898a.a(nhA);
            return nhA;
        }
        this.f36898a.b(nhA);
        if (cVar != 0) {
            this.f36898a.a(nhA, cVar);
        }
        return nhA;
    }

    @Override // com.fourthline.orca.internal.Eh
    public C3246f8 getInitialState() {
        QA.a aVar = QA.f27433a;
        return new C3246f8(QA.a.a(aVar, R.string.step_document_details_header, 0, 2, null), f(true), g(true), e(true), this.f36901d.a(), (!a() || this.f36899b.j()) ? null : QA.a.a(aVar, R.string.shared_hint_confirm_fields, 0, 2, null), new C3161d8(QA.a.a(aVar, R.string.step_document_details_footer_something_wrong, 0, 2, null), QA.a.a(aVar, R.string.shared_button_retake_photos, 0, 2, null), true), new InterfaceC3777rk.b(new E3(QA.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), a(), false)), this.f36900c.a(EnumC3689ph.O0));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l h() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ki1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.c((C3246f8) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l l() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.oi1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.b((C3246f8) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l m() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.hi1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.b(this.f32316a, (C3246f8) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l p() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.pi1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.a(this.f34594a, (C3246f8) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    public static final C3246f8 a(C4059y6 c4059y6, C3246f8 c3246f8) {
        QA qa2;
        Th th2;
        QA qaA;
        Th cVar;
        QA.b bVar;
        Gh gh2;
        Nh nhA;
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        if (c3246f8.q().c().length() == 0) {
            qaA = QA.f27433a.b(R.string.shared_validation_required_date_of_birth_accessibility);
            cVar = new Th.c();
        } else if (c4059y6.f36899b.b() == null) {
            qaA = QA.f27433a.a(R.string.shared_validation_invalid_date_of_birth_accessibility);
            cVar = new Th.d();
        } else {
            if (!c4059y6.f36899b.g()) {
                qaA = QA.f27433a.a(R.string.shared_validation_date_underage, String.valueOf(((Number) c4059y6.f36903f.invoke()).intValue()));
                cVar = new Th.b.c();
            } else {
                qa2 = QA.b.f27435b;
                th2 = null;
            }
            Nh nhQ = c3246f8.q();
            bVar = QA.b.f27435b;
            if (p013kotlin.jvm.internal.s.f(qa2, bVar)) {
                gh2 = Gh.UNFOCUSED;
            } else {
                gh2 = Gh.ERROR;
            }
            nhA = Nh.a(nhQ, null, null, false, gh2, null, null, null, qa2, p013kotlin.jvm.internal.s.f(qa2, bVar) ? null : c4059y6.j(), null, 0, 1655, null);
            c4059y6.f36898a.b(nhA);
            if (th2 != null) {
                c4059y6.f36898a.a(nhA, th2);
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            return C3246f8.a(c3246f8, null, null, null, nhA, null, null, null, null, null, 503, null);
        }
        qa2 = qaA;
        th2 = cVar;
        Nh nhQ2 = c3246f8.q();
        bVar = QA.b.f27435b;
        if (p013kotlin.jvm.internal.s.f(qa2, bVar)) {
            gh2 = Gh.UNFOCUSED;
        } else {
            gh2 = Gh.ERROR;
        }
        nhA = Nh.a(nhQ2, null, null, false, gh2, null, null, null, qa2, p013kotlin.jvm.internal.s.f(qa2, bVar) ? null : c4059y6.j(), null, 0, 1655, null);
        c4059y6.f36898a.b(nhA);
        if (th2 != null) {
            c4059y6.f36898a.a(nhA, th2);
        }
        jn0.h0 h0Var2 = jn0.h0.f84049a;
        return C3246f8.a(c3246f8, null, null, null, nhA, null, null, null, null, null, 503, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 d(C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, null, Nh.a(c3246f8.u(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, null, null, null, 507, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 b(C4059y6 c4059y6, C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, c4059y6.f(false), null, null, null, null, null, null, null, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 b(String str, C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, Nh.a(c3246f8.s(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, null, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    public static final C3246f8 c(C4059y6 c4059y6, C3246f8 c3246f8) {
        QA qa2;
        Th th2;
        QA.d dVarA;
        Th c0520a;
        QA.b bVar;
        Gh gh2;
        Nh nhA;
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        if (c3246f8.u().c().length() == 0) {
            dVarA = QA.f27433a.b(R.string.shared_validation_required_expiry_date_accessibility);
            c0520a = new Th.c();
        } else if (c4059y6.f36899b.l() == null) {
            dVarA = QA.f27433a.a(R.string.shared_validation_invalid_expiry_date_accessibility);
            c0520a = new Th.d();
        } else {
            if (!c4059y6.f36899b.n()) {
                dVarA = QA.f27433a.a(R.string.shared_validation_date_future, R.string.shared_validation_invalid_expiry_date_accessibility);
                c0520a = new Th.a.C0520a();
            } else {
                qa2 = QA.b.f27435b;
                th2 = null;
            }
            Nh nhU = c3246f8.u();
            bVar = QA.b.f27435b;
            if (p013kotlin.jvm.internal.s.f(qa2, bVar)) {
                gh2 = Gh.UNFOCUSED;
            } else {
                gh2 = Gh.ERROR;
            }
            nhA = Nh.a(nhU, null, null, false, gh2, null, null, null, qa2, p013kotlin.jvm.internal.s.f(qa2, bVar) ? null : c4059y6.j(), null, 0, 1655, null);
            c4059y6.f36898a.b(nhA);
            if (th2 != null) {
                c4059y6.f36898a.a(nhA, th2);
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            return C3246f8.a(c3246f8, null, null, nhA, null, null, null, null, null, null, 507, null);
        }
        qa2 = dVarA;
        th2 = c0520a;
        Nh nhU2 = c3246f8.u();
        bVar = QA.b.f27435b;
        if (p013kotlin.jvm.internal.s.f(qa2, bVar)) {
            gh2 = Gh.UNFOCUSED;
        } else {
            gh2 = Gh.ERROR;
        }
        nhA = Nh.a(nhU2, null, null, false, gh2, null, null, null, qa2, p013kotlin.jvm.internal.s.f(qa2, bVar) ? null : c4059y6.j(), null, 0, 1655, null);
        c4059y6.f36898a.b(nhA);
        if (th2 != null) {
            c4059y6.f36898a.a(nhA, th2);
        }
        jn0.h0 h0Var2 = jn0.h0.f84049a;
        return C3246f8.a(c3246f8, null, null, nhA, null, null, null, null, null, null, 507, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 b(C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, null, null, Nh.a(c3246f8.q(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, null, null, 503, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ii1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.c(this.f32550a, (C3246f8) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l b(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.li1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.a(value, (C3246f8) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l b(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.si1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.a(z11, (C3246f8) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 a(String str, C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, null, null, Nh.a(c3246f8.q(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, 503, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 a(boolean z11, C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, null, null, null, null, null, null, c3246f8.w().b(z11), null, 383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 a(C4059y6 c4059y6, boolean z11, C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        Nh nhG = c4059y6.g(false);
        C3033a8 c3033a8T = c3246f8.t();
        return C3246f8.a(c3246f8, null, null, nhG, null, c3033a8T != null ? C3033a8.a(c3033a8T, null, z11, 1, null) : null, null, null, null, null, DownloaderService.STATUS_UNKNOWN_ERROR, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l c(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.ji1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.c(value, (C3246f8) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 c(String str, C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, null, Nh.a(c3246f8.u(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, 507, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 a(C3246f8 c3246f8) {
        p013kotlin.jvm.internal.s.k(c3246f8, "<this>");
        return C3246f8.a(c3246f8, null, null, null, null, null, null, null, null, null, 479, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l e(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.qi1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.b(value, (C3246f8) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.InterfaceC3375i8
    public wn0.l c(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ti1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4059y6.a(this.f35673a, z11, (C3246f8) obj);
            }
        };
    }
}
