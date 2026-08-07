package com.plaid.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.plaid.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4401e {

    /* JADX INFO: renamed from: com.plaid.internal.e$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47625a;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.primitives.f.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.UNRECOGNIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47625a = iArr;
        }
    }

    public static final Y6 a(com.plaid.internal.core.protos.link.workflow.primitives.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        int i11 = a.f47625a[fVar.ordinal()];
        if (i11 == 1) {
            return Y6.NO_SMS_AUTOFILL;
        }
        if (i11 == 2) {
            return Y6.NO_SMS_AUTOFILL;
        }
        if (i11 == 3) {
            return Y6.SMS_RECEIVER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
