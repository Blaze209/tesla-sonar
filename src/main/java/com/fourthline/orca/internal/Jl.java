package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Jl implements CC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3457k6 f26474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceDataCollector f26475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VC f26476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.a f26477d;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26480c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26482e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26480c = obj;
            this.f26482e |= Integer.MIN_VALUE;
            Object objA = Jl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Jl(InterfaceC3457k6 dataUploaderWorker, DeviceDataCollector deviceDataCollector, VC deviceDataRepository, wn0.a uploadTimeoutMsProvider) {
        p013kotlin.jvm.internal.s.k(dataUploaderWorker, "dataUploaderWorker");
        p013kotlin.jvm.internal.s.k(deviceDataCollector, "deviceDataCollector");
        p013kotlin.jvm.internal.s.k(deviceDataRepository, "deviceDataRepository");
        p013kotlin.jvm.internal.s.k(uploadTimeoutMsProvider, "uploadTimeoutMsProvider");
        this.f26474a = dataUploaderWorker;
        this.f26475b = deviceDataCollector;
        this.f26476c = deviceDataRepository;
        this.f26477d = uploadTimeoutMsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        return r1;
     */
    @Override // com.fourthline.orca.internal.CC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.CC.a r10, p013kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.fourthline.orca.internal.Jl.a
            if (r0 == 0) goto L13
            r0 = r11
            com.fourthline.orca.internal.Jl$a r0 = (com.fourthline.orca.internal.Jl.a) r0
            int r1 = r0.f26482e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26482e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.Jl$a r0 = new com.fourthline.orca.internal.Jl$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f26480c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26482e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            jn0.t.b(r11)
            jn0.s r11 = (jn0.s) r11
            java.lang.Object r10 = r11.getValue()
            goto L98
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            java.lang.Object r10 = r0.f26479b
            com.fourthline.orca.internal.CC$a r10 = (com.fourthline.orca.internal.CC.a) r10
            java.lang.Object r2 = r0.f26478a
            com.fourthline.orca.internal.Jl r2 = (com.fourthline.orca.internal.Jl) r2
            jn0.t.b(r11)
            goto L6e
        L46:
            jn0.t.b(r11)
            com.fourthline.core.internal.devicedata.DeviceDataCollector r11 = r9.f26475b
            r11.startDataCollection()
            wn0.a r11 = r9.f26477d
            java.lang.Object r11 = r11.invoke()
            java.lang.Number r11 = (java.lang.Number) r11
            long r5 = r11.longValue()
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L6d
            r0.f26478a = r9
            r0.f26479b = r10
            r0.f26482e = r4
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r11 != r1) goto L6d
            goto L97
        L6d:
            r2 = r9
        L6e:
            com.fourthline.orca.internal.VC r11 = r2.f26476c
            kotlinx.serialization.json.JsonElement r11 = r11.a()
            if (r11 == 0) goto L9b
            com.fourthline.orca.internal.k6 r2 = r2.f26474a
            com.fourthline.orca.internal.k6$a r4 = new com.fourthline.orca.internal.k6$a
            java.lang.String r10 = r10.a()
            com.fourthline.orca.internal.k6$a$a$a r5 = new com.fourthline.orca.internal.k6$a$a$a
            java.lang.String r6 = "DeviceData"
            r5.<init>(r11, r6)
            java.lang.String r11 = "device_data.json"
            r4.<init>(r10, r11, r5)
            r10 = 0
            r0.f26478a = r10
            r0.f26479b = r10
            r0.f26482e = r3
            java.lang.Object r10 = r2.a(r4, r0)
            if (r10 != r1) goto L98
        L97:
            return r1
        L98:
            jn0.s.a(r10)
        L9b:
            jn0.s$a r10 = jn0.s.INSTANCE
            com.fourthline.orca.internal.DC r10 = com.fourthline.orca.internal.DC.f25435a
            java.lang.Object r10 = jn0.s.b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Jl.a(com.fourthline.orca.internal.CC$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
