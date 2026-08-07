package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsContext;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3692pk extends InterfaceC3350hk, InterfaceC3107bx {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pk$a */
    public static final class a {
        public static boolean a(InterfaceC3692pk interfaceC3692pk, String currentDestination, String targetDestination) {
            p013kotlin.jvm.internal.s.k(currentDestination, "currentDestination");
            p013kotlin.jvm.internal.s.k(targetDestination, "targetDestination");
            return !p013kotlin.jvm.internal.s.f(targetDestination, "qes_document_viewer");
        }

        public static boolean a(InterfaceC3692pk interfaceC3692pk, C3392ik targetContext) {
            p013kotlin.jvm.internal.s.k(targetContext, "targetContext");
            AnalyticsContext analyticsContextB = interfaceC3692pk.a().b(AnalyticsContext.Flow);
            return (p013kotlin.jvm.internal.s.f(analyticsContextB != null ? analyticsContextB.getName() : null, targetContext.getName()) || p013kotlin.jvm.internal.s.f(targetContext.getName(), "workflow_loading") || p013kotlin.jvm.internal.s.f(targetContext.getName(), "workflow_uploading")) ? false : true;
        }

        public static boolean a(InterfaceC3692pk interfaceC3692pk, C3392ik currentContext, Sf currentFlow, Rf rf2) {
            p013kotlin.jvm.internal.s.k(currentContext, "currentContext");
            p013kotlin.jvm.internal.s.k(currentFlow, "currentFlow");
            return ((currentFlow instanceof C3768rb) || (currentFlow instanceof Ul) || p013kotlin.jvm.internal.s.f(currentContext.getName(), "workflow_loading") || p013kotlin.jvm.internal.s.f(currentContext.getName(), "workflow_uploading") || (rf2 instanceof Km)) ? false : true;
        }

        public static boolean a(InterfaceC3692pk interfaceC3692pk, C3392ik currentContext, Sf currentFlow) {
            p013kotlin.jvm.internal.s.k(currentContext, "currentContext");
            p013kotlin.jvm.internal.s.k(currentFlow, "currentFlow");
            return ((currentFlow instanceof C4061y8) || (currentFlow instanceof Ul) || (currentFlow instanceof Lm) || p013kotlin.jvm.internal.s.f(currentContext.getName(), "workflow_loading") || p013kotlin.jvm.internal.s.f(currentContext.getName(), "workflow_uploading")) ? false : true;
        }
    }

    C3438jo a();

    boolean a(C3392ik c3392ik);

    boolean a(C3392ik c3392ik, Sf sf2);

    boolean a(C3392ik c3392ik, Sf sf2, Rf rf2);

    boolean a(String str, String str2);
}
