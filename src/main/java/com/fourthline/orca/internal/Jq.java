package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.sdk.R;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Jq implements Eh, Xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Kh f26495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gq f26496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f26497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3715q6 f26498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.a f26499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f26500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f26501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Fq f26502h;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mn0.a.d(Integer.valueOf(((Gender) obj).name().length()), Integer.valueOf(((Gender) obj2).name().length()));
        }
    }

    public Jq(Kh analytics, Gq repository, InterfaceC3732qh imageServiceLocator, boolean z11, InterfaceC3715q6 dateFormatter, wn0.a minPersonAgeFactory) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(dateFormatter, "dateFormatter");
        p013kotlin.jvm.internal.s.k(minPersonAgeFactory, "minPersonAgeFactory");
        this.f26495a = analytics;
        this.f26496b = repository;
        this.f26497c = imageServiceLocator;
        this.f26498d = dateFormatter;
        this.f26499e = minPersonAgeFactory;
        this.f26500f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.fg0
            @Override // wn0.a
            public final Object invoke() {
                return Jq.a(this.f31752a);
            }
        });
        List listK1 = p013kotlin.collections.n.k1(Gender.values(), new b());
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(listK1, 10)), 16));
        for (Object obj : listK1) {
            linkedHashMap.put(obj, a((Gender) obj));
        }
        this.f26501g = linkedHashMap;
        QA.a aVar = QA.f27433a;
        this.f26502h = new Fq(QA.a.a(aVar, R.string.step_personal_details_header, 0, 2, null), f(true), h(true), e(true), g(true), null, (!a() || this.f26496b.j()) ? null : QA.a.a(aVar, R.string.shared_hint_confirm_fields, 0, 2, null), new InterfaceC3777rk.b(a()), z11 ? new InterfaceC3777rk.a.c(null, 1, null) : new InterfaceC3777rk.a.C0608a(null, 1, null), this.f26497c.a(EnumC3689ph.L0), this.f26497c.a(EnumC3689ph.O0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3903uh a(Jq jq2) {
        return jq2.f26497c.a(EnumC3689ph.C0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq c(Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, null, Nh.a(fq2.x(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, null, fq2.y().b(false), null, null, null, 1851, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.fourthline.orca.internal.Kh] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.fourthline.orca.internal.Th] */
    /* JADX WARN: Type inference failed for: r8v6 */
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
    private final Nh e(boolean z11) {
        ?? r11;
        InterfaceC3903uh interfaceC3903uh;
        Object obj;
        Gh gh2;
        QA qaA;
        InterfaceC3903uh interfaceC3903uhJ;
        Th.c cVar;
        InterfaceC3903uh interfaceC3903uh2;
        QA qaA2;
        Nh nhA;
        Object obj2;
        Th.d dVar;
        Mh mh2 = Mh.Date;
        boolean z12 = !this.f26496b.i();
        Gh gh3 = Gh.UNFOCUSED;
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_document_details_label_birth, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.shared_placeholder_date, 0, 2, null);
        QA.b bVar = QA.b.f27435b;
        Nh nh2 = new Nh(mh2, "person_birth_date", z12, gh3, "", dVarA, dVarA2, bVar, null, null, 0, 1792, null);
        if (nh2.j()) {
            Date dateB = this.f26496b.b();
            if (dateB != null) {
                if (this.f26496b.g()) {
                    String strA = this.f26498d.a(dateB);
                    if (!z11 || this.f26496b.j()) {
                        interfaceC3903uh2 = null;
                        qaA2 = bVar;
                    } else {
                        interfaceC3903uh2 = null;
                        qaA2 = QA.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
                    }
                    interfaceC3903uh = interfaceC3903uh2;
                    nhA = Nh.a(nh2, null, null, false, null, strA, null, null, qaA2, j(), null, 0, 1647, null);
                    obj2 = interfaceC3903uh;
                } else {
                    nhA = Nh.a(nh2, null, null, false, Gh.ERROR, this.f26498d.a(dateB), null, null, aVar.a(R.string.shared_validation_date_underage, String.valueOf(((Number) this.f26499e.invoke()).intValue())), j(), null, 0, 1639, null);
                    dVar = new Th.d();
                    interfaceC3903uh = null;
                }
                if (nhA == null) {
                    obj = obj2;
                } else {
                    nh2 = nhA;
                }
            } else {
                interfaceC3903uh = null;
                obj = null;
            }
            if (!z11) {
                gh2 = Gh.ERROR;
            }
            if (z11) {
                obj2 = dVar;
            } else {
                obj2 = dVar;
                qaA = aVar.a(R.string.shared_validation_invalid_date_of_birth_accessibility);
            }
            if (z11) {
                obj2 = dVar;
                gh2 = gh3;
                obj2 = dVar;
                gh2 = gh3;
                qaA = bVar;
                interfaceC3903uhJ = interfaceC3903uh;
            } else {
                obj2 = dVar;
                gh2 = gh3;
                obj2 = dVar;
                gh2 = gh3;
                qaA = bVar;
                interfaceC3903uhJ = j();
            }
            nh2 = Nh.a(nh2, null, null, false, gh2, null, null, null, qaA, interfaceC3903uhJ, null, 0, 1655, null);
            if (z11) {
                r11 = obj;
            } else {
                cVar = new Th.c();
            }
        } else {
            r11 = 0;
        }
        if (z11) {
            obj2 = dVar;
            r11 = obj2;
            r11 = cVar;
            this.f26495a.a(nh2);
            return nh2;
        }
        obj2 = dVar;
        r11 = obj2;
        this.f26495a.b(nh2);
        if (r11 != 0) {
            r11 = cVar;
            this.f26495a.a(nh2, r11);
        }
        r11 = cVar;
        return nh2;
    }

    public final wn0.l r() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.pg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.b((Fq) obj);
            }
        };
    }

    public final wn0.l s() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ig0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.b(this.f32535a, (Fq) obj);
            }
        };
    }

    public final wn0.l t() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.sg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.c(this.f35311a, (Fq) obj);
            }
        };
    }

    public final wn0.l u() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.mg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.d(this.f33585a, (Fq) obj);
            }
        };
    }

    public final wn0.l v() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.jg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.c((Fq) obj);
            }
        };
    }

    public final wn0.l w() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ng0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.e(this.f33940a, (Fq) obj);
            }
        };
    }

    private final QA a(Gender gender) {
        int i11 = a.$EnumSwitchMapping$0[gender.ordinal()];
        if (i11 == 1) {
            return QA.a.a(QA.f27433a, R.string.step_personal_details_gender_male, 0, 2, null);
        }
        if (i11 == 2) {
            return QA.a.a(QA.f27433a, R.string.step_personal_details_gender_female, 0, 2, null);
        }
        if (i11 == 3) {
            return QA.a.a(QA.f27433a, R.string.step_personal_details_gender_unspecified, 0, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq b(Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, Nh.a(fq2.t(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, null, null, fq2.y().b(false), null, null, null, 1853, null);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.Kh] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.fourthline.orca.internal.Th$c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.fourthline.orca.internal.Th] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    private final Nh f(boolean z11) {
        InterfaceC3903uh interfaceC3903uh;
        QA qaB;
        InterfaceC3903uh interfaceC3903uhJ;
        Nh nhA;
        ?? cVar;
        InterfaceC3903uh interfaceC3903uh2;
        QA qaA;
        Object dVar;
        QA qaB2;
        InterfaceC3903uh interfaceC3903uhJ2;
        Gh gh2 = this.f26496b.f() ? Gh.DISABLED : Gh.UNFOCUSED;
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_personal_details_label_first_name, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null);
        QA.b bVar = QA.b.f27435b;
        Nh nh2 = new Nh(null, "person_first_name", false, gh2, "", dVarA, dVarA2, bVar, null, null, 0, 1797, null);
        String strA = this.f26496b.a();
        if (strA != null) {
            if (!p013kotlin.text.t.y0(strA)) {
                if (this.f26496b.l()) {
                    if (!z11 || this.f26496b.j()) {
                        interfaceC3903uh2 = null;
                        qaA = bVar;
                    } else {
                        interfaceC3903uh2 = null;
                        qaA = QA.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
                    }
                    interfaceC3903uh = interfaceC3903uh2;
                    nhA = Nh.a(nh2, null, null, false, null, strA, null, null, qaA, null, null, 0, 1903, null);
                    cVar = interfaceC3903uh;
                } else {
                    nhA = Nh.a(nh2, null, null, false, Gh.ERROR, strA, null, null, QA.a.a(aVar, 0, 1, null), j(), null, 0, 1639, null);
                    dVar = new Th.d();
                }
                if (nhA == null) {
                }
                if (z11) {
                    this.f26495a.a(nhA);
                    return nhA;
                }
                this.f26495a.b(nhA);
                if (cVar != 0) {
                    this.f26495a.a(nhA, cVar);
                }
                return nhA;
            }
            Gh gh3 = z11 ? Gh.UNFOCUSED : Gh.ERROR;
            if (!z11) {
                qaB2 = aVar.b(R.string.shared_validation_required_first_name_accessibility);
            }
            if (z11) {
                qaB2 = bVar;
                interfaceC3903uhJ2 = null;
            } else {
                qaB2 = bVar;
                interfaceC3903uhJ2 = j();
            }
            nhA = Nh.a(nh2, null, null, false, gh3, null, null, null, qaB2, interfaceC3903uhJ2, null, 0, 1655, null);
            dVar = !z11 ? new Th.c() : null;
            interfaceC3903uh = null;
            cVar = dVar;
            if (nhA == null) {
            }
            if (z11) {
                this.f26495a.a(nhA);
                return nhA;
            }
            this.f26495a.b(nhA);
            if (cVar != 0) {
                this.f26495a.a(nhA, cVar);
            }
            return nhA;
        }
        interfaceC3903uh = null;
        Gh gh4 = z11 ? Gh.UNFOCUSED : Gh.ERROR;
        if (!z11) {
            qaB = aVar.b(R.string.shared_validation_required_first_name_accessibility);
        }
        if (z11) {
            qaB = bVar;
            interfaceC3903uhJ = interfaceC3903uh;
        } else {
            qaB = bVar;
            interfaceC3903uhJ = j();
        }
        nhA = Nh.a(nh2, null, null, false, gh4, null, null, null, qaB, interfaceC3903uhJ, null, 0, 1655, null);
        cVar = new Th.c();
        if (z11) {
            this.f26495a.a(nhA);
            return nhA;
        }
        this.f26495a.b(nhA);
        if (cVar != 0) {
            this.f26495a.a(nhA, cVar);
        }
        return nhA;
    }

    private final Fq.a g(boolean z11) {
        Mh mh2 = Mh.DropDown;
        Gh gh2 = Gh.UNFOCUSED;
        QA qaA = QA.b.f27435b;
        QA.a aVar = QA.f27433a;
        Fq.a aVar2 = new Fq.a(mh2, qaA, gh2, QA.a.a(aVar, R.string.step_personal_details_label_gender, 0, 2, null), QA.a.a(aVar, R.string.step_personal_details_placeholder_gender, 0, 2, null), qaA, null, 64, null);
        Gender genderD = this.f26496b.d();
        if (genderD == null) {
            if (!z11) {
                gh2 = Gh.ERROR;
            }
            Gh gh3 = gh2;
            if (!z11) {
                qaA = aVar.b(R.string.shared_validation_required_sex_accessibility);
            }
            return Fq.a.a(aVar2, null, null, gh3, null, null, qaA, z11 ? null : j(), 27, null);
        }
        if (!this.f26496b.e()) {
            return Fq.a.a(aVar2, null, a(genderD), Gh.ERROR, null, null, QA.a.a(aVar, 0, 1, null), j(), 25, null);
        }
        QA qaA2 = a(genderD);
        if (z11 && !this.f26496b.j()) {
            qaA = QA.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
        }
        return Fq.a.a(aVar2, null, qaA2, null, null, null, qaA, null, 93, null);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.Kh] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.fourthline.orca.internal.Th$c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.fourthline.orca.internal.Th] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    private final Nh h(boolean z11) {
        InterfaceC3903uh interfaceC3903uh;
        QA qaB;
        InterfaceC3903uh interfaceC3903uhJ;
        Nh nhA;
        ?? cVar;
        InterfaceC3903uh interfaceC3903uh2;
        QA qaA;
        Object dVar;
        QA qaB2;
        InterfaceC3903uh interfaceC3903uhJ2;
        Gh gh2 = this.f26496b.m() ? Gh.DISABLED : Gh.UNFOCUSED;
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_personal_details_label_last_name, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null);
        QA.b bVar = QA.b.f27435b;
        Nh nh2 = new Nh(null, "person_last_name", false, gh2, "", dVarA, dVarA2, bVar, null, null, 0, 1797, null);
        String strC = this.f26496b.c();
        if (strC != null) {
            if (!p013kotlin.text.t.y0(strC)) {
                if (this.f26496b.k()) {
                    if (!z11 || this.f26496b.j()) {
                        interfaceC3903uh2 = null;
                        qaA = bVar;
                    } else {
                        interfaceC3903uh2 = null;
                        qaA = QA.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
                    }
                    interfaceC3903uh = interfaceC3903uh2;
                    nhA = Nh.a(nh2, null, null, false, null, strC, null, null, qaA, null, null, 0, 1903, null);
                    cVar = interfaceC3903uh;
                } else {
                    nhA = Nh.a(nh2, null, null, false, Gh.ERROR, strC, null, null, QA.a.a(aVar, 0, 1, null), null, null, 0, 1895, null);
                    dVar = new Th.d();
                }
                if (nhA == null) {
                }
                if (z11) {
                    this.f26495a.a(nhA);
                    return nhA;
                }
                this.f26495a.b(nhA);
                if (cVar != 0) {
                    this.f26495a.a(nhA, cVar);
                }
                return nhA;
            }
            Gh gh3 = z11 ? Gh.UNFOCUSED : Gh.ERROR;
            if (!z11) {
                qaB2 = aVar.b(R.string.shared_validation_required_last_name_accessibility);
            }
            if (z11) {
                qaB2 = bVar;
                interfaceC3903uhJ2 = null;
            } else {
                qaB2 = bVar;
                interfaceC3903uhJ2 = j();
            }
            nhA = Nh.a(nh2, null, null, false, gh3, null, null, null, qaB2, interfaceC3903uhJ2, null, 0, 1655, null);
            dVar = !z11 ? new Th.c() : null;
            interfaceC3903uh = null;
            cVar = dVar;
            if (nhA == null) {
            }
            if (z11) {
                this.f26495a.a(nhA);
                return nhA;
            }
            this.f26495a.b(nhA);
            if (cVar != 0) {
                this.f26495a.a(nhA, cVar);
            }
            return nhA;
        }
        interfaceC3903uh = null;
        Gh gh4 = z11 ? Gh.UNFOCUSED : Gh.ERROR;
        if (!z11) {
            qaB = aVar.b(R.string.shared_validation_required_last_name_accessibility);
        }
        if (z11) {
            qaB = bVar;
            interfaceC3903uhJ = interfaceC3903uh;
        } else {
            qaB = bVar;
            interfaceC3903uhJ = j();
        }
        nhA = Nh.a(nh2, null, null, false, gh4, null, null, null, qaB, interfaceC3903uhJ, null, 0, 1655, null);
        cVar = new Th.c();
        if (z11) {
            this.f26495a.a(nhA);
            return nhA;
        }
        this.f26495a.b(nhA);
        if (cVar != 0) {
            this.f26495a.a(nhA, cVar);
        }
        return nhA;
    }

    private final InterfaceC3903uh j() {
        return (InterfaceC3903uh) this.f26500f.getValue();
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.rg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.a(z11, (Fq) obj);
            }
        };
    }

    public final wn0.l l() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.kg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.a((Fq) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Fq getInitialState() {
        return this.f26502h;
    }

    public final wn0.l p() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.gg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.a(this.f32016a, (Fq) obj);
            }
        };
    }

    public final wn0.l d(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.hg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.c(value, (Fq) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq d(Jq jq2, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, null, null, null, jq2.g(false), null, null, fq2.y().b(jq2.a()), null, null, null, 1871, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq a(boolean z11, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        boolean z12 = !z11;
        return Fq.a(fq2, null, null, null, null, null, null, null, fq2.y().a(z12, z11), fq2.q().a(z12), null, null, 1663, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq c(String str, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, null, Nh.a(fq2.x(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, null, null, 2043, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq b(Jq jq2, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, jq2.f(false), null, null, null, null, null, fq2.y().b(jq2.a()), null, null, null, 1917, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq c(Jq jq2, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, null, null, null, Fq.a.a(fq2.u(), null, null, Gh.FOCUSED, null, null, QA.b.f27435b, null, 27, null), jq2.f26501g, null, fq2.y().b(false), null, null, null, 1807, null);
    }

    public final wn0.l a(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.lg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.b(value, (Fq) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq a(Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, null, null, Nh.a(fq2.r(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, fq2.y().b(false), null, null, null, 1911, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq b(String str, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, Nh.a(fq2.t(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, null, null, null, 2045, null);
    }

    public final wn0.l b(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.og0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.a(value, (Fq) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    public static final Fq a(Jq jq2, Fq fq2) {
        QA qa2;
        Th th2;
        QA qaA;
        Th cVar;
        QA.b bVar;
        Gh gh2;
        Nh nhA;
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        if (fq2.r().c().length() == 0) {
            qaA = QA.f27433a.b(R.string.shared_validation_required_date_of_birth_accessibility);
            cVar = new Th.c();
        } else if (jq2.f26496b.b() == null) {
            qaA = QA.f27433a.a(R.string.shared_validation_invalid_date_of_birth_accessibility);
            cVar = new Th.d();
        } else {
            if (!jq2.f26496b.g()) {
                qaA = QA.f27433a.a(R.string.shared_validation_date_underage, String.valueOf(((Number) jq2.f26499e.invoke()).intValue()));
                cVar = new Th.b.c();
            } else {
                qa2 = QA.b.f27435b;
                th2 = null;
            }
            Nh nhR = fq2.r();
            bVar = QA.b.f27435b;
            if (p013kotlin.jvm.internal.s.f(qa2, bVar)) {
                gh2 = Gh.UNFOCUSED;
            } else {
                gh2 = Gh.ERROR;
            }
            nhA = Nh.a(nhR, null, null, false, gh2, null, null, null, qa2, p013kotlin.jvm.internal.s.f(qa2, bVar) ? null : jq2.j(), null, 0, 1655, null);
            jq2.f26495a.b(nhA);
            if (th2 != null) {
                jq2.f26495a.a(nhA, th2);
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            return Fq.a(fq2, null, null, null, nhA, null, null, null, fq2.y().b(jq2.a()), null, null, null, 1911, null);
        }
        qa2 = qaA;
        th2 = cVar;
        Nh nhR2 = fq2.r();
        bVar = QA.b.f27435b;
        if (p013kotlin.jvm.internal.s.f(qa2, bVar)) {
            gh2 = Gh.UNFOCUSED;
        } else {
            gh2 = Gh.ERROR;
        }
        nhA = Nh.a(nhR2, null, null, false, gh2, null, null, null, qa2, p013kotlin.jvm.internal.s.f(qa2, bVar) ? null : jq2.j(), null, 0, 1655, null);
        jq2.f26495a.b(nhA);
        if (th2 != null) {
            jq2.f26495a.a(nhA, th2);
        }
        jn0.h0 h0Var2 = jn0.h0.f84049a;
        return Fq.a(fq2, null, null, null, nhA, null, null, null, fq2.y().b(jq2.a()), null, null, null, 1911, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq e(Jq jq2, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, null, jq2.h(false), null, null, null, null, fq2.y().b(jq2.a()), null, null, null, 1915, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq a(String str, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, null, null, Nh.a(fq2.r(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, null, 2039, null);
    }

    public final wn0.l a(final QA value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.qg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Jq.a(value, (Fq) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fq a(QA qa2, Fq fq2) {
        p013kotlin.jvm.internal.s.k(fq2, "<this>");
        return Fq.a(fq2, null, null, null, null, Fq.a.a(fq2.u(), null, qa2, null, null, null, null, null, 125, null), null, null, null, null, null, null, 2031, null);
    }

    private final boolean a() {
        return this.f26496b.l() && this.f26496b.k() && this.f26496b.g() && this.f26496b.e();
    }
}
