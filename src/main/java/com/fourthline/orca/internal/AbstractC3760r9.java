package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3760r9 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.r9$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3718q9.values().length];
            try {
                iArr[EnumC3718q9.Traditional.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3718q9.Eid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(EnumC3718q9 enumC3718q9, C3257fd eidFlowConfig) {
        p013kotlin.jvm.internal.s.k(enumC3718q9, "<this>");
        p013kotlin.jvm.internal.s.k(eidFlowConfig, "eidFlowConfig");
        int i11 = a.$EnumSwitchMapping$0[enumC3718q9.ordinal()];
        if (i11 == 1) {
            return eidFlowConfig.getDocumentFlowName();
        }
        if (i11 == 2) {
            return eidFlowConfig.getEIdFlowName();
        }
        throw new NoWhenBranchMatchedException();
    }
}
