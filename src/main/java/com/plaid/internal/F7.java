package com.plaid.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class F7 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46319a;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f46319a = iArr;
        }
    }

    public static final boolean a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Z z11) {
        p013kotlin.jvm.internal.s.k(z11, "<this>");
        int i11 = a.f46319a[z11.ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
