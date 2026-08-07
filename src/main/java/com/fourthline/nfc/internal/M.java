package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.nfc.NfcDataGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class M implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f24608a;

    public M(List dataGroups) {
        p013kotlin.jvm.internal.s.k(dataGroups, "dataGroups");
        this.f24608a = dataGroups;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M) && p013kotlin.jvm.internal.s.f(this.f24608a, ((M) obj).f24608a);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        List list = this.f24608a;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strName = ((NfcDataGroup) it.next()).getType().name();
            Locale ROOT = Locale.ROOT;
            p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        return p013kotlin.collections.v0.f(jn0.x.a("data_groups", arrayList));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "nfc_scan_completed";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/nfc_scan_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return this.f24608a.hashCode();
    }

    public String toString() {
        return "ScanCompleted(dataGroups=" + this.f24608a + ")";
    }
}
