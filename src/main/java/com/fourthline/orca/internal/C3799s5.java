package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3799s5 implements RC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f35203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F4 f35204b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.s5$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3038aD.values().length];
            try {
                iArr[EnumC3038aD.Contacts.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3799s5(wn0.a workflowIdProvider, F4 dataBundle) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        this.f35203a = workflowIdProvider;
        this.f35204b = dataBundle;
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a(Rf rf2) {
        return RC.a.a(this, rf2);
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a() {
        List listE = p013kotlin.collections.v.e(EnumC3038aD.Contacts);
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            C3347hh c3347hhA = a((String) this.f35203a.invoke(), (EnumC3038aD) it.next());
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listE, arrayList);
    }

    private final C3347hh a(String str, EnumC3038aD enumC3038aD) {
        Pair pairA;
        if (a.$EnumSwitchMapping$0[enumC3038aD.ordinal()] != 1 || (pairA = YC.a(this.f35204b)) == null) {
            return null;
        }
        WorkflowResults.IDV.Contacts contacts = (WorkflowResults.IDV.Contacts) pairA.a();
        JSONObject jSONObject = (JSONObject) pairA.b();
        p013kotlin.jvm.internal.s.h(jSONObject);
        return new C3347hh(enumC3038aD, new I4(str, jSONObject), contacts);
    }
}
