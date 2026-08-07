package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4064yB implements RC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f36954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final XA f36955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4104z8 f36956c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yB$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3038aD.values().length];
            try {
                iArr[EnumC3038aD.TaxInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3038aD.TinDocument.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4064yB(wn0.a workflowIdProvider, XA dataBundle, C4104z8 documentBundle) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(documentBundle, "documentBundle");
        this.f36954a = workflowIdProvider;
        this.f36955b = dataBundle;
        this.f36956c = documentBundle;
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a(Rf rf2) {
        return RC.a.a(this, rf2);
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a() {
        List listP = p013kotlin.collections.v.p(EnumC3038aD.TinDocument, EnumC3038aD.TaxInfo);
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            C3347hh c3347hhA = a((String) this.f36954a.invoke(), (EnumC3038aD) it.next());
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listP, arrayList);
    }

    private final C3347hh a(String str, EnumC3038aD enumC3038aD) {
        int i11 = a.$EnumSwitchMapping$0[enumC3038aD.ordinal()];
        if (i11 == 1) {
            return AbstractC3669p3.a(this.f36955b, str, enumC3038aD);
        }
        if (i11 != 2) {
            return null;
        }
        return A8.a(this.f36956c, str, enumC3038aD);
    }
}
