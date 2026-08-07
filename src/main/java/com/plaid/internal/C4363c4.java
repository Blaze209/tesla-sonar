package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;

/* JADX INFO: renamed from: com.plaid.internal.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C4363c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f46901a;

    static {
        int[] iArr = new int[Workflow$LinkWorkflowStartResponse.c.values().length];
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.MOBILE_SDK_LOG_LEVEL_ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.MOBILE_SDK_LOG_LEVEL_ERRORS_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.MOBILE_SDK_LOG_LEVEL_NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.MOBILE_SDK_LOG_LEVEL_UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f46901a = iArr;
    }
}
