package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class C4 implements InterfaceC3022Zd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25173d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2891Je f25174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4073ye f25175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2889Jc f25176c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f25177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f25178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25179c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25181e;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f25179c = obj;
            this.f25181e |= Integer.MIN_VALUE;
            Object objA = C4.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25182a;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f25182a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC4073ye interfaceC4073ye = C4.this.f25175b;
                this.f25182a = 1;
                objA = interfaceC4073ye.a(this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objA);
        }
    }

    public C4(InterfaceC2891Je eidWorkflowTokenUrlWorker, InterfaceC4073ye eidSdkConnectedWorker, InterfaceC2889Jc eidAccessRightsWorker) {
        p013kotlin.jvm.internal.s.k(eidWorkflowTokenUrlWorker, "eidWorkflowTokenUrlWorker");
        p013kotlin.jvm.internal.s.k(eidSdkConnectedWorker, "eidSdkConnectedWorker");
        p013kotlin.jvm.internal.s.k(eidAccessRightsWorker, "eidAccessRightsWorker");
        this.f25174a = eidWorkflowTokenUrlWorker;
        this.f25175b = eidSdkConnectedWorker;
        this.f25176c = eidAccessRightsWorker;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x002c, B:41:0x00c8, B:43:0x00d1, B:44:0x00e1, B:45:0x00e6, B:20:0x004a, B:33:0x0094, B:36:0x00aa, B:38:0x00ae, B:46:0x00e7, B:47:0x00ec, B:35:0x009a, B:29:0x007d, B:30:0x0080), top: B:52:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x002c, B:41:0x00c8, B:43:0x00d1, B:44:0x00e1, B:45:0x00e6, B:20:0x004a, B:33:0x0094, B:36:0x00aa, B:38:0x00ae, B:46:0x00e7, B:47:0x00ec, B:35:0x009a, B:29:0x007d, B:30:0x0080), top: B:52:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.fourthline.orca.internal.C4] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.fourthline.orca.internal.Zd$a] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // com.fourthline.orca.internal.InterfaceC3022Zd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.InterfaceC3022Zd.a r8, p013kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C4.a(com.fourthline.orca.internal.Zd$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
