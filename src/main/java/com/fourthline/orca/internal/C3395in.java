package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.in, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3395in implements RC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f32563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4104z8 f32564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Jp f32565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final XA f32566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3208eD f32567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3208eD f32568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3208eD f32569g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.in$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3038aD.values().length];
            try {
                iArr[EnumC3038aD.Person.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3038aD.TaxInfo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3395in(wn0.a workflowIdProvider, C4104z8 dataBundle, Jp personBundle, XA tinBundle, C3208eD skipNationalityUseCase, C3208eD skipPersonDetailsUseCase, C3208eD tinBundleIsValidUseCase) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        p013kotlin.jvm.internal.s.k(skipNationalityUseCase, "skipNationalityUseCase");
        p013kotlin.jvm.internal.s.k(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        p013kotlin.jvm.internal.s.k(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        this.f32563a = workflowIdProvider;
        this.f32564b = dataBundle;
        this.f32565c = personBundle;
        this.f32566d = tinBundle;
        this.f32567e = skipNationalityUseCase;
        this.f32568f = skipPersonDetailsUseCase;
        this.f32569g = tinBundleIsValidUseCase;
    }

    private final boolean b() {
        return this.f32564b.j() != null;
    }

    private final boolean c() {
        return this.f32567e.a(true) && this.f32568f.a(true);
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a() {
        List listR = p013kotlin.collections.v.r(EnumC3038aD.Document, EnumC3038aD.DocumentVideo, b() ? EnumC3038aD.NfcPicture : null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            C3347hh c3347hhA = A8.a(this.f32564b, (String) this.f32563a.invoke(), (EnumC3038aD) it.next());
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listR, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    @Override // com.fourthline.orca.internal.RC
    public C3304gh a(Rf rf2) {
        EnumC3038aD enumC3038aD;
        C3347hh c3347hhA;
        if (rf2 instanceof Qp) {
            if (c()) {
                enumC3038aD = EnumC3038aD.Person;
            } else {
                enumC3038aD = null;
            }
        } else if ((rf2 instanceof C3848tB) && a((C3848tB) rf2)) {
            enumC3038aD = EnumC3038aD.TaxInfo;
        } else {
            enumC3038aD = null;
        }
        List<EnumC3038aD> listQ = p013kotlin.collections.v.q(enumC3038aD);
        if (listQ.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (EnumC3038aD enumC3038aD2 : listQ) {
            int i11 = a.$EnumSwitchMapping$0[enumC3038aD2.ordinal()];
            if (i11 != 1) {
                c3347hhA = i11 != 2 ? null : AbstractC3669p3.a(this.f32566d, (String) this.f32563a.invoke(), enumC3038aD2);
            } else {
                c3347hhA = AbstractC3669p3.a(this.f32565c, (String) this.f32563a.invoke(), enumC3038aD2);
            }
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listQ, arrayList);
    }

    private final boolean a(C3848tB c3848tB) {
        return p013kotlin.jvm.internal.s.f(c3848tB.getIsTinCaptureRequired(), Boolean.FALSE) && this.f32569g.a(true);
    }
}
