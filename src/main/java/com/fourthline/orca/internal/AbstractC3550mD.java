package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3550mD implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3807sD f33537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33538b;

    public AbstractC3550mD(InterfaceC3807sD intent, Map eventAttributes) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(eventAttributes, "eventAttributes");
        this.f33537a = intent;
        this.f33538b = eventAttributes;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return p013kotlin.collections.v0.r(this.f33538b, p013kotlin.collections.v0.f(jn0.x.a(AnalyticsAttribute.Intent, AbstractC3850tD.a(this.f33537a))));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "item_clicked";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/item_clicked/jsonschema/1-0-1";
    }
}
