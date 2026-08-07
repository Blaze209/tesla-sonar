package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3228er implements RC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f31507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4104z8 f31508b;

    public C3228er(wn0.a workflowIdProvider, C4104z8 documentBundle) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(documentBundle, "documentBundle");
        this.f31507a = workflowIdProvider;
        this.f31508b = documentBundle;
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a(Rf rf2) {
        return RC.a.a(this, rf2);
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a() {
        List listE = p013kotlin.collections.v.e(EnumC3038aD.ProofOfAddress);
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            C3347hh c3347hhA = A8.a(this.f31508b, (String) this.f31507a.invoke(), (EnumC3038aD) it.next());
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listE, arrayList);
    }
}
