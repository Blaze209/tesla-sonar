package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3190dw implements InterfaceC3233ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3233ew f31258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3617nv f31259b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dw$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3319gw.values().length];
            try {
                iArr[EnumC3319gw.SIGNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3319gw.PENDING_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dw$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31262c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f31264e;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31262c = obj;
            this.f31264e |= Integer.MIN_VALUE;
            Object objA = C3190dw.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3190dw(InterfaceC3233ew userConfirmationWorker, InterfaceC3617nv pollStatusWorker) {
        p013kotlin.jvm.internal.s.k(userConfirmationWorker, "userConfirmationWorker");
        p013kotlin.jvm.internal.s.k(pollStatusWorker, "pollStatusWorker");
        this.f31258a = userConfirmationWorker;
        this.f31259b = pollStatusWorker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (r10 == r1) goto L29;
     */
    @Override // com.fourthline.orca.internal.InterfaceC3233ew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.InterfaceC3233ew.a r10, p013kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3190dw.a(com.fourthline.orca.internal.ew$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
