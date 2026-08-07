package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class Cj implements RC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f25226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceMetadata f25227b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3038aD.values().length];
            try {
                iArr[EnumC3038aD.Geolocation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Cj(wn0.a workflowIdProvider, DeviceMetadata deviceMetadata) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(deviceMetadata, "deviceMetadata");
        this.f25226a = workflowIdProvider;
        this.f25227b = deviceMetadata;
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a(Rf rf2) {
        return RC.a.a(this, rf2);
    }

    @Override // com.fourthline.orca.internal.RC
    public C3304gh a() {
        List listE = p013kotlin.collections.v.e(EnumC3038aD.Geolocation);
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            C3347hh c3347hhA = a((String) this.f25226a.invoke(), (EnumC3038aD) it.next());
            if (c3347hhA != null) {
                arrayList.add(c3347hhA);
            }
        }
        return new C3304gh(listE, arrayList);
    }

    private final C3347hh a(String str, EnumC3038aD enumC3038aD) {
        Pair pairA;
        if (a.$EnumSwitchMapping$0[enumC3038aD.ordinal()] != 1 || (pairA = YC.a(this.f25227b)) == null) {
            return null;
        }
        WorkflowResults.IDV.Geolocation geolocation = (WorkflowResults.IDV.Geolocation) pairA.a();
        JSONObject jSONObject = (JSONObject) pairA.b();
        p013kotlin.jvm.internal.s.h(jSONObject);
        return new C3347hh(enumC3038aD, new Bg(str, jSONObject), geolocation);
    }
}
