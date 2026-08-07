package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3698pq implements RC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f34623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Jp f34624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final XA f34625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3208eD f34626d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pq$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3038aD.values().length];
            try {
                iArr[EnumC3038aD.TaxInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3698pq(wn0.a workflowIdProvider, Jp dataBundle, XA tinBundle, C3208eD tinBundleIsValidUseCase) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        p013kotlin.jvm.internal.s.k(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        this.f34623a = workflowIdProvider;
        this.f34624b = dataBundle;
        this.f34625c = tinBundle;
        this.f34626d = tinBundleIsValidUseCase;
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a() {
        List listE = p013kotlin.collections.v.e(EnumC3038aD.Person);
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            C3347hh c3347hhA = AbstractC3669p3.a(this.f34624b, (String) this.f34623a.invoke(), (EnumC3038aD) it.next());
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listE, arrayList);
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a(Rf rf2) {
        List<EnumC3038aD> listQ = p013kotlin.collections.v.q(((rf2 instanceof C3848tB) && a((C3848tB) rf2)) ? EnumC3038aD.TaxInfo : null);
        if (listQ.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (EnumC3038aD enumC3038aD : listQ) {
            C3347hh c3347hhA = a.$EnumSwitchMapping$0[enumC3038aD.ordinal()] == 1 ? AbstractC3669p3.a(this.f34625c, (String) this.f34623a.invoke(), enumC3038aD) : null;
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listQ, arrayList);
    }

    private final boolean a(C3848tB c3848tB) {
        return p013kotlin.jvm.internal.s.f(c3848tB.getIsTinCaptureRequired(), Boolean.FALSE) && this.f34626d.a(true);
    }
}
