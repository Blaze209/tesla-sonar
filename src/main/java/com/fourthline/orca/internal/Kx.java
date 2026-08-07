package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class Kx implements RC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f26688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4135zx f26689b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3038aD.values().length];
            try {
                iArr[EnumC3038aD.Selfie.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3038aD.Liveness.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Kx(wn0.a workflowIdProvider, C4135zx dataBundle) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        this.f26688a = workflowIdProvider;
        this.f26689b = dataBundle;
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a(Rf rf2) {
        return RC.a.a(this, rf2);
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a() {
        List listR = p013kotlin.collections.v.r(EnumC3038aD.Selfie, EnumC3038aD.Liveness);
        ArrayList arrayList = new ArrayList();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            C3347hh c3347hhA = a(this.f26689b, (String) this.f26688a.invoke(), (EnumC3038aD) it.next());
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listR, arrayList);
    }

    private final C3347hh a(C4135zx c4135zx, String str, EnumC3038aD enumC3038aD) {
        int i11 = a.$EnumSwitchMapping$0[enumC3038aD.ordinal()];
        if (i11 == 1) {
            Pair pairA = ZC.a(c4135zx.b());
            if (pairA == null) {
                return null;
            }
            return new C3347hh(enumC3038aD, new Lx(str, (List) pairA.b()), (WorkflowResults.IDV.Selfie) pairA.a());
        }
        if (i11 != 2) {
            return null;
        }
        C3490kx c3490kxB = c4135zx.b();
        byte[] bArrA = c4135zx.a();
        if (bArrA == null) {
            bArrA = new byte[0];
        }
        Pair pairA2 = ZC.a(c3490kxB, bArrA);
        if (pairA2 == null) {
            return null;
        }
        return new C3347hh(enumC3038aD, new Wx(str, (List) pairA2.b()), (WorkflowResults.IDV.SelfieVideo) pairA2.a());
    }
}
