package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class R6 {
    public static final String a(AbstractC3641oc abstractC3641oc) {
        p013kotlin.jvm.internal.s.k(abstractC3641oc, "<this>");
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.a.f34194a)) {
            return "document_expired";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.e.f34198a)) {
            return "document_type_not_supported";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.c.f34196a)) {
            return "document_not_detected";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.d.f34197a)) {
            return "document_type_not_matching";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.g.f34200a)) {
            return "issuing_country_not_supported";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.f.f34199a)) {
            return "issuing_country_not_matching";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.i.f34202a)) {
            return "nationality_not_supported";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.j.f34203a)) {
            return "person_underage";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.b.f34195a)) {
            return "document_side_not_matching";
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.h.f34201a)) {
            return "document_type_not_detected";
        }
        throw new NoWhenBranchMatchedException();
    }
}
