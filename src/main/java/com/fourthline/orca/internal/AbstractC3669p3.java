package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3669p3 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.p3$a */
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
            try {
                iArr[EnumC3038aD.TinDocument.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(Coordinate coordinate) {
        if (coordinate == null) {
            return true;
        }
        double latitude = coordinate.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = coordinate.getLongitude();
        return -180.0d <= longitude && longitude <= 180.0d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    private static final boolean b(List list) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            C4103z7 c4103z7 = (C4103z7) obj;
            if (c4103z7.h()) {
                if (i11 > 0) {
                    C4103z7 c4103z8 = (C4103z7) list.get(i11 - 1);
                    if (c4103z8.a() != c4103z7.a() && !c4103z8.h()) {
                        arrayList.add(obj);
                    }
                } else {
                    arrayList.add(obj);
                }
            }
            i11 = i12;
        }
        return arrayList.isEmpty();
    }

    public static final boolean a(Long l11) {
        return l11 == null || l11.longValue() < new Date().getTime();
    }

    public static final boolean a(Date date) {
        if (date != null) {
            return date.before(a());
        }
        return true;
    }

    private static final Date a() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTime();
    }

    public static final boolean a(List list) {
        if (list == null || list.isEmpty() || !b(list)) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C4103z7) it.next()).g()) {
                return false;
            }
        }
        return true;
    }

    public static final C3347hh a(Jp jp2, String workflowId, EnumC3038aD idvPart) {
        Pair pairA;
        p013kotlin.jvm.internal.s.k(jp2, "<this>");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(idvPart, "idvPart");
        if (a.$EnumSwitchMapping$0[idvPart.ordinal()] != 1 || (pairA = YC.a(jp2)) == null) {
            return null;
        }
        WorkflowResults.IDV.Person person = (WorkflowResults.IDV.Person) pairA.a();
        JSONObject jSONObject = (JSONObject) pairA.b();
        p013kotlin.jvm.internal.s.h(jSONObject);
        return new C3347hh(idvPart, new Np(workflowId, jSONObject), person);
    }

    public static final C3347hh a(XA xa2, String workflowId, EnumC3038aD idvPart) {
        Pair pairA;
        p013kotlin.jvm.internal.s.k(xa2, "<this>");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(idvPart, "idvPart");
        if (a.$EnumSwitchMapping$0[idvPart.ordinal()] != 2 || (pairA = YC.a(xa2)) == null) {
            return null;
        }
        WorkflowResults.IDV.TaxInfo taxInfo = (WorkflowResults.IDV.TaxInfo) pairA.a();
        JSONObject jSONObject = (JSONObject) pairA.b();
        p013kotlin.jvm.internal.s.h(jSONObject);
        return new C3347hh(idvPart, new LA(workflowId, jSONObject), taxInfo);
    }
}
