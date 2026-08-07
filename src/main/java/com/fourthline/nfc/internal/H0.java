package com.fourthline.nfc.internal;

import android.nfc.Tag;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.nfc.NfcScannerError;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.NfcScannerStep;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class H0 implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0 f24553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f24554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimestampProvider f24555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LocationProvider f24556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2830u f24557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CoroutineContext f24558f;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24559a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f24561c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Throwable th2, Continuation continuation) {
            super(2, continuation);
            this.f24561c = th2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return H0.this.new a(this.f24561c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NfcScannerError nfcScannerError;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f24559a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            v0 v0Var = H0.this.f24554b;
            Throwable th2 = this.f24561c;
            if (th2 instanceof NfcException.b) {
                nfcScannerError = NfcScannerError.AUTHENTICATION_FAILED;
            } else {
                nfcScannerError = th2 instanceof NfcException.d ? NfcScannerError.CONNECTION_LOST : NfcScannerError.UNKNOWN;
            }
            v0Var.a(nfcScannerError, th2);
            return jn0.h0.f84049a;
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24562a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NfcScannerStep f24564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(NfcScannerStep nfcScannerStep, Continuation continuation) {
            super(2, continuation);
            this.f24564c = nfcScannerStep;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return H0.this.new b(this.f24564c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f24562a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            H0.this.f24554b.onStepUpdate(this.f24564c);
            return jn0.h0.f84049a;
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f24565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f24566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24567c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Tag f24569e;

        static final class a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H0 f24571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I0 f24572c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Tag f24573d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(H0 h11, I0 i11, Tag tag, Continuation continuation) {
                super(2, continuation);
                this.f24571b = h11;
                this.f24572c = i11;
                this.f24573d = tag;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f24571b, this.f24572c, this.f24573d, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
            
                if (r6.a(r1, r5) == r0) goto L20;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f24570a
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r4) goto L21
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    jn0.t.b(r6)
                    goto L5b
                L15:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1d:
                    jn0.t.b(r6)
                    goto L49
                L21:
                    jn0.t.b(r6)
                    goto L35
                L25:
                    jn0.t.b(r6)
                    com.fourthline.nfc.internal.H0 r6 = r5.f24571b
                    com.fourthline.nfc.NfcScannerStep r1 = com.fourthline.nfc.NfcScannerStep.CONNECTING_TO_DOCUMENT
                    r5.f24570a = r4
                    java.lang.Object r6 = com.fourthline.nfc.internal.H0.a(r6, r1, r5)
                    if (r6 != r0) goto L35
                    goto L5a
                L35:
                    com.fourthline.nfc.internal.I0 r6 = r5.f24572c
                    android.nfc.Tag r1 = r5.f24573d
                    r6.a(r1)
                    com.fourthline.nfc.internal.H0 r6 = r5.f24571b
                    com.fourthline.nfc.NfcScannerStep r1 = com.fourthline.nfc.NfcScannerStep.AUTHENTICATING
                    r5.f24570a = r3
                    java.lang.Object r6 = com.fourthline.nfc.internal.H0.a(r6, r1, r5)
                    if (r6 != r0) goto L49
                    goto L5a
                L49:
                    com.fourthline.nfc.internal.I0 r6 = r5.f24572c
                    r6.b()
                    com.fourthline.nfc.internal.H0 r6 = r5.f24571b
                    com.fourthline.nfc.NfcScannerStep r1 = com.fourthline.nfc.NfcScannerStep.READING_DATA
                    r5.f24570a = r2
                    java.lang.Object r6 = com.fourthline.nfc.internal.H0.a(r6, r1, r5)
                    if (r6 != r0) goto L5b
                L5a:
                    return r0
                L5b:
                    com.fourthline.nfc.internal.I0 r6 = r5.f24572c
                    java.util.List r6 = r6.c()
                    com.fourthline.nfc.internal.I0 r0 = r5.f24572c
                    com.fourthline.nfc.NfcSecurityCheck r0 = r0.a()
                    com.fourthline.nfc.NfcScannerResult r1 = new com.fourthline.nfc.NfcScannerResult
                    com.fourthline.nfc.NfcScannerMetadata r2 = new com.fourthline.nfc.NfcScannerMetadata
                    com.fourthline.nfc.internal.H0 r3 = r5.f24571b
                    com.fourthline.core.internal.TimestampProvider r3 = com.fourthline.nfc.internal.H0.d(r3)
                    java.util.Date r3 = r3.getCurrentTime()
                    com.fourthline.nfc.internal.H0 r4 = r5.f24571b
                    com.fourthline.core.location.LocationProvider r4 = r4.a()
                    com.fourthline.core.location.Coordinate r4 = r4.getLocation()
                    r2.<init>(r3, r4)
                    r1.<init>(r6, r2, r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.nfc.internal.H0.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Tag tag, Continuation continuation) {
            super(2, continuation);
            this.f24569e = tag;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return H0.this.new c(this.f24569e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
        
            if (r4.a(r11, r10) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
        
            if (r4.a(r11, r10) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
        
            r0 = r1;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f24567c
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L32
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r0 = r10.f24565a
                com.fourthline.nfc.internal.I0 r0 = (com.fourthline.nfc.internal.I0) r0
                jn0.t.b(r11)
                goto Lb0
            L24:
                java.lang.Object r1 = r10.f24566b
                com.fourthline.nfc.internal.I0 r1 = (com.fourthline.nfc.internal.I0) r1
                java.lang.Object r4 = r10.f24565a
                com.fourthline.nfc.internal.H0 r4 = (com.fourthline.nfc.internal.H0) r4
                jn0.t.b(r11)     // Catch: java.lang.Throwable -> L30
                goto L5e
            L30:
                r11 = move-exception
                goto L6a
            L32:
                jn0.t.b(r11)
                com.fourthline.nfc.internal.H0 r11 = com.fourthline.nfc.internal.H0.this
                com.fourthline.nfc.internal.I0 r1 = com.fourthline.nfc.internal.H0.c(r11)
                com.fourthline.nfc.internal.H0 r11 = com.fourthline.nfc.internal.H0.this
                android.nfc.Tag r6 = r10.f24569e
                com.fourthline.core.internal.Try$Companion r7 = com.fourthline.core.internal.Try.INSTANCE
                com.fourthline.nfc.internal.u r7 = com.fourthline.nfc.internal.H0.a(r11)     // Catch: java.lang.Throwable -> L66
                kotlinx.coroutines.CoroutineDispatcher r7 = r7.b()     // Catch: java.lang.Throwable -> L66
                com.fourthline.nfc.internal.H0$c$a r8 = new com.fourthline.nfc.internal.H0$c$a     // Catch: java.lang.Throwable -> L66
                r8.<init>(r11, r1, r6, r5)     // Catch: java.lang.Throwable -> L66
                r10.f24565a = r11     // Catch: java.lang.Throwable -> L66
                r10.f24566b = r1     // Catch: java.lang.Throwable -> L66
                r10.f24567c = r4     // Catch: java.lang.Throwable -> L66
                java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r7, r8, r10)     // Catch: java.lang.Throwable -> L66
                if (r4 != r0) goto L5b
                goto Lae
            L5b:
                r9 = r4
                r4 = r11
                r11 = r9
            L5e:
                com.fourthline.nfc.NfcScannerResult r11 = (com.fourthline.nfc.NfcScannerResult) r11     // Catch: java.lang.Throwable -> L30
                com.fourthline.core.internal.Try$Success r6 = new com.fourthline.core.internal.Try$Success     // Catch: java.lang.Throwable -> L30
                r6.<init>(r11)     // Catch: java.lang.Throwable -> L30
                goto L7f
            L66:
                r4 = move-exception
                r9 = r4
                r4 = r11
                r11 = r9
            L6a:
                boolean r6 = r11 instanceof java.lang.VirtualMachineError
                if (r6 != 0) goto Lbc
                boolean r6 = r11 instanceof java.lang.ThreadDeath
                if (r6 != 0) goto Lbc
                boolean r6 = r11 instanceof java.lang.InterruptedException
                if (r6 != 0) goto Lbc
                boolean r6 = r11 instanceof java.lang.LinkageError
                if (r6 != 0) goto Lbc
                com.fourthline.core.internal.Try$Failure r6 = new com.fourthline.core.internal.Try$Failure
                r6.<init>(r11)
            L7f:
                boolean r11 = r6 instanceof com.fourthline.core.internal.Try.Failure
                if (r11 == 0) goto L96
                com.fourthline.core.internal.Try$Failure r6 = (com.fourthline.core.internal.Try.Failure) r6
                java.lang.Throwable r11 = r6.getException()
                r10.f24565a = r1
                r10.f24566b = r5
                r10.f24567c = r3
                java.lang.Object r11 = com.fourthline.nfc.internal.H0.a(r4, r11, r10)
                if (r11 != r0) goto Laf
                goto Lae
            L96:
                boolean r11 = r6 instanceof com.fourthline.core.internal.Try.Success
                if (r11 == 0) goto Lb6
                com.fourthline.core.internal.Try$Success r6 = (com.fourthline.core.internal.Try.Success) r6
                java.lang.Object r11 = r6.getValue()
                com.fourthline.nfc.NfcScannerResult r11 = (com.fourthline.nfc.NfcScannerResult) r11
                r10.f24565a = r1
                r10.f24566b = r5
                r10.f24567c = r2
                java.lang.Object r11 = com.fourthline.nfc.internal.H0.a(r4, r11, r10)
                if (r11 != r0) goto Laf
            Lae:
                return r0
            Laf:
                r0 = r1
            Lb0:
                r0.close()
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            Lb6:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            Lbc:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.nfc.internal.H0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24574a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NfcScannerResult f24576c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NfcScannerResult nfcScannerResult, Continuation continuation) {
            super(2, continuation);
            this.f24576c = nfcScannerResult;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return H0.this.new d(this.f24576c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f24574a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            H0.this.f24554b.onSuccess(this.f24576c);
            return jn0.h0.f84049a;
        }
    }

    public H0(I0 tagReaderService, v0 nfcScannerCallback, TimestampProvider timestampProvider, LocationProvider locationProvider, InterfaceC2830u dispatchersProvider, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(tagReaderService, "tagReaderService");
        p013kotlin.jvm.internal.s.k(nfcScannerCallback, "nfcScannerCallback");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(dispatchersProvider, "dispatchersProvider");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        this.f24553a = tagReaderService;
        this.f24554b = nfcScannerCallback;
        this.f24555c = timestampProvider;
        this.f24556d = locationProvider;
        this.f24557e = dispatchersProvider;
        this.f24558f = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f24558f;
    }

    @Override // android.nfc.NfcAdapter.ReaderCallback
    public void onTagDiscovered(Tag tag) {
        String[] techList;
        if (tag == null || (techList = tag.getTechList()) == null || !p013kotlin.collections.n.e0(techList, "android.nfc.tech.IsoDep")) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(tag, null), 3, null);
    }

    @Override // com.fourthline.nfc.internal.G0
    public LocationProvider a() {
        return this.f24556d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(NfcScannerStep nfcScannerStep, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(this.f24557e.a(), new b(nfcScannerStep, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Throwable th2, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(this.f24557e.a(), new a(th2, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(NfcScannerResult nfcScannerResult, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(this.f24557e.a(), new d(nfcScannerResult, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }
}
