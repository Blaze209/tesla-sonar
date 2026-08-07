package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.MotionData;
import com.fourthline.vision.ScannerMetadata;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public class u6 implements InterfaceC4197g4, InterfaceC4237m0, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4205h4 f38939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4240m3 f38940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E3 f38941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M5 f38942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4265q0 f38943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4265q0 f38944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimestampProvider f38945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LocationProvider f38946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CoroutineContext f38947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Job f38948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f38950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f38951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38952n;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38954b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u6.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0069  */
        /* JADX WARN: Code duplicated, block: B:21:0x007e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0082  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e0  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Try<jn0.h0> tryStart;
            u6 u6Var;
            InterfaceC4265q0 interfaceC4265q0;
            C4302v3 c4302v3;
            u6 u6Var2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38954b;
            if (i11 == 0) {
                jn0.t.b(obj);
                u6.this.stopProcessingJob();
                InterfaceC4240m3 mediaRecorderManager = u6.this.getMediaRecorderManager();
                this.f38954b = 1;
                if (mediaRecorderManager.cancel(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                jn0.t.b(obj);
            } else {
                if (i11 == 2) {
                    jn0.t.b(obj);
                    u6.this.f38950l.clear();
                    tryStart = u6.this.getMediaRecorderManager().start();
                    u6Var = u6.this;
                    if (!(tryStart instanceof Try.Failure)) {
                        if (tryStart instanceof Try.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u6Var.f38941c.start();
                        interfaceC4265q0 = u6Var.f38943e;
                        c4302v3 = new C4302v3(u6Var.f38945g.getCurrentTimestamp());
                        this.f38953a = u6Var;
                        this.f38954b = 3;
                        if (interfaceC4265q0.consume(c4302v3, this) != coroutine_suspended) {
                            u6Var2 = u6Var;
                        }
                        return coroutine_suspended;
                    }
                    ((Try.Failure) tryStart).getException();
                    u6Var.onScannerResult(TryKt.failure(new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null)));
                    return jn0.h0.f84049a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u6Var2 = (u6) this.f38953a;
                jn0.t.b(obj);
            }
            u6Var2.f38942d.resetAll();
            u6Var2.getScannerCallback().reset();
            u6Var2.f38942d.start();
            u6Var2.getScannerCallback().onStepsSizeUpdate(u6Var2.getStepsCount());
            u6Var2.getScannerCallback().onStepUpdate(u6Var2.getStepConfig().getStepType());
            return jn0.h0.f84049a;
            E3 e11 = u6.this.f38941c;
            this.f38954b = 2;
            if (e11.cancel(this) != coroutine_suspended) {
                u6.this.f38950l.clear();
                tryStart = u6.this.getMediaRecorderManager().start();
                u6Var = u6.this;
                if (!(tryStart instanceof Try.Failure)) {
                    ((Try.Failure) tryStart).getException();
                    u6Var.onScannerResult(TryKt.failure(new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null)));
                } else {
                    if (tryStart instanceof Try.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u6Var.f38941c.start();
                    interfaceC4265q0 = u6Var.f38943e;
                    c4302v3 = new C4302v3(u6Var.f38945g.getCurrentTimestamp());
                    this.f38953a = u6Var;
                    this.f38954b = 3;
                    if (interfaceC4265q0.consume(c4302v3, this) != coroutine_suspended) {
                        u6Var2 = u6Var;
                        u6Var2.f38942d.resetAll();
                        u6Var2.getScannerCallback().reset();
                        u6Var2.f38942d.start();
                        u6Var2.getScannerCallback().onStepsSizeUpdate(u6Var2.getStepsCount());
                        u6Var2.getScannerCallback().onStepUpdate(u6Var2.getStepConfig().getStepType());
                    }
                }
                return jn0.h0.f84049a;
            }
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38956a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u6.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38956a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC4265q0 interfaceC4265q0 = u6.this.f38943e;
                C4288t3 c4288t3 = new C4288t3(u6.this.f38945g.getCurrentTimestamp());
                this.f38956a = 1;
                if (interfaceC4265q0.consume(c4288t3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38958a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u6.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38958a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC4265q0 interfaceC4265q0 = u6.this.f38943e;
                C4281s3 c4281s3 = new C4281s3(u6.this.f38945g.getCurrentTimestamp());
                this.f38958a = 1;
                if (interfaceC4265q0.consume(c4281s3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38960a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ I5 f38962c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(I5 i11, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f38962c = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u6.this.new d(this.f38962c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38960a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC4265q0 interfaceC4265q0 = u6.this.f38943e;
                C4295u3 c4295u3 = new C4295u3(this.f38962c, u6.this.f38945g.getCurrentTimestamp());
                this.f38960a = 1;
                if (interfaceC4265q0.consume(c4295u3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class e extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38963a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u6.this.new e(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0041  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            if (r6.tryReturnResult(r5) == r0) goto L19;
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
                int r1 = r5.f38963a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L41
            L1e:
                jn0.t.b(r6)
                com.fourthline.vision.internal.u6 r6 = com.fourthline.vision.internal.u6.this
                boolean r6 = r6.isCompleted()
                if (r6 != 0) goto L4c
                com.fourthline.vision.internal.u6 r6 = com.fourthline.vision.internal.u6.this
                r6.setCompleted(r3)
                com.fourthline.vision.internal.u6 r6 = com.fourthline.vision.internal.u6.this
                boolean r6 = com.fourthline.vision.internal.u6.access$getShouldDelayVideoStop(r6)
                if (r6 == 0) goto L41
                r5.f38963a = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L41
                goto L4b
            L41:
                com.fourthline.vision.internal.u6 r6 = com.fourthline.vision.internal.u6.this
                r5.f38963a = r2
                java.lang.Object r6 = com.fourthline.vision.internal.u6.access$tryReturnResult(r6, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.u6.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class f extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38966b;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u6.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u6 u6Var;
            u6 u6Var2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38966b;
            if (i11 != 0) {
                if (i11 == 1) {
                    u6Var = (u6) this.f38965a;
                    jn0.t.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u6Var2 = (u6) this.f38965a;
                    jn0.t.b(obj);
                }
                u6Var2.getScannerCallback().onStepsSizeUpdate(u6Var2.getStepsCount());
                u6Var2.f38942d.start();
                return jn0.h0.f84049a;
            }
            jn0.t.b(obj);
            Try<jn0.h0> tryStart = u6.this.getMediaRecorderManager().start();
            u6Var = u6.this;
            if (!(tryStart instanceof Try.Failure)) {
                if (!(tryStart instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                u6Var.f38941c.start();
                InterfaceC4265q0 interfaceC4265q0 = u6Var.f38943e;
                C4302v3 c4302v3 = new C4302v3(u6Var.f38945g.getCurrentTimestamp());
                this.f38965a = u6Var;
                this.f38966b = 1;
                if (interfaceC4265q0.consume(c4302v3, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            ((Try.Failure) tryStart).getException();
            u6Var.onScannerResult(TryKt.failure(new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null)));
            return jn0.h0.f84049a;
            this.f38965a = u6Var;
            this.f38966b = 2;
            if (DelayKt.delay(1000L, this) != coroutine_suspended) {
                u6Var2 = u6Var;
                u6Var2.getScannerCallback().onStepsSizeUpdate(u6Var2.getStepsCount());
                u6Var2.f38942d.start();
                return jn0.h0.f84049a;
            }
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class g extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38968a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u6.this.new g(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r5.cancel(r4) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f38968a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L3f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L30
            L1e:
                jn0.t.b(r5)
                com.fourthline.vision.internal.u6 r5 = com.fourthline.vision.internal.u6.this
                com.fourthline.vision.internal.m3 r5 = r5.getMediaRecorderManager()
                r4.f38968a = r3
                java.lang.Object r5 = r5.cancel(r4)
                if (r5 != r0) goto L30
                goto L3e
            L30:
                com.fourthline.vision.internal.u6 r5 = com.fourthline.vision.internal.u6.this
                com.fourthline.vision.internal.E3 r5 = com.fourthline.vision.internal.u6.access$getMotionDataManager$p(r5)
                r4.f38968a = r2
                java.lang.Object r5 = r5.cancel(r4)
                if (r5 != r0) goto L3f
            L3e:
                return r0
            L3f:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.u6.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class h extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38970a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u6.this.new h(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r8.consume(r1, r7) == r0) goto L20;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f38970a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L20
                if (r1 == r2) goto L1c
                if (r1 != r3) goto L14
                jn0.t.b(r8)     // Catch: java.lang.Throwable -> L12
                goto L74
            L12:
                r8 = move-exception
                goto L58
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                jn0.t.b(r8)     // Catch: java.lang.Throwable -> L12
                goto L47
            L20:
                jn0.t.b(r8)
                com.fourthline.vision.internal.u6 r8 = com.fourthline.vision.internal.u6.this     // Catch: java.lang.Throwable -> L12
                com.fourthline.vision.internal.q0 r8 = com.fourthline.vision.internal.u6.access$getMetadataConsumer$p(r8)     // Catch: java.lang.Throwable -> L12
                com.fourthline.vision.internal.r3 r1 = new com.fourthline.vision.internal.r3     // Catch: java.lang.Throwable -> L12
                com.fourthline.vision.internal.u6 r4 = com.fourthline.vision.internal.u6.this     // Catch: java.lang.Throwable -> L12
                com.fourthline.vision.internal.I5 r4 = r4.getStepConfig()     // Catch: java.lang.Throwable -> L12
                com.fourthline.vision.internal.u6 r5 = com.fourthline.vision.internal.u6.this     // Catch: java.lang.Throwable -> L12
                com.fourthline.core.internal.TimestampProvider r5 = com.fourthline.vision.internal.u6.access$getTimestampProvider$p(r5)     // Catch: java.lang.Throwable -> L12
                long r5 = r5.getCurrentTimestamp()     // Catch: java.lang.Throwable -> L12
                r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L12
                r7.f38970a = r2     // Catch: java.lang.Throwable -> L12
                java.lang.Object r8 = r8.consume(r1, r7)     // Catch: java.lang.Throwable -> L12
                if (r8 != r0) goto L47
                goto L57
            L47:
                com.fourthline.vision.internal.u6 r8 = com.fourthline.vision.internal.u6.this     // Catch: java.lang.Throwable -> L12
                com.fourthline.vision.internal.q0 r8 = com.fourthline.vision.internal.u6.access$getTriggerConsumer$p(r8)     // Catch: java.lang.Throwable -> L12
                jn0.h0 r1 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L12
                r7.f38970a = r3     // Catch: java.lang.Throwable -> L12
                java.lang.Object r8 = r8.consume(r1, r7)     // Catch: java.lang.Throwable -> L12
                if (r8 != r0) goto L74
            L57:
                return r0
            L58:
                com.fourthline.vision.internal.u6 r0 = com.fourthline.vision.internal.u6.this
                com.fourthline.vision.internal.h4 r0 = r0.getScannerCallback()
                boolean r1 = r8 instanceof com.fourthline.vision.internal.AbstractC4255o4
                if (r1 == 0) goto L65
                com.fourthline.vision.internal.o4 r8 = (com.fourthline.vision.internal.AbstractC4255o4) r8
                goto L6d
            L65:
                com.fourthline.vision.internal.o4$a r8 = new com.fourthline.vision.internal.o4$a
                com.fourthline.vision.internal.m4 r1 = com.fourthline.vision.internal.EnumC4241m4.UNKNOWN
                r2 = 0
                r8.<init>(r1, r2, r3, r2)
            L6d:
                com.fourthline.core.internal.Try r8 = com.fourthline.core.internal.TryKt.failure(r8)
                r0.onStepResult(r8)
            L74:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.u6.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38974c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38976e;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38974c = obj;
            this.f38976e |= Integer.MIN_VALUE;
            return u6.this.tryReturnResult(this);
        }
    }

    public u6(InterfaceC4205h4 scannerCallback, InterfaceC4240m3 mediaRecorderManager, E3 motionDataManager, M5 stepsAdapter, InterfaceC4265q0 metadataConsumer, InterfaceC4265q0 triggerConsumer, TimestampProvider timestampProvider, LocationProvider locationProvider, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(scannerCallback, "scannerCallback");
        p013kotlin.jvm.internal.s.k(mediaRecorderManager, "mediaRecorderManager");
        p013kotlin.jvm.internal.s.k(motionDataManager, "motionDataManager");
        p013kotlin.jvm.internal.s.k(stepsAdapter, "stepsAdapter");
        p013kotlin.jvm.internal.s.k(metadataConsumer, "metadataConsumer");
        p013kotlin.jvm.internal.s.k(triggerConsumer, "triggerConsumer");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        this.f38939a = scannerCallback;
        this.f38940b = mediaRecorderManager;
        this.f38941c = motionDataManager;
        this.f38942d = stepsAdapter;
        this.f38943e = metadataConsumer;
        this.f38944f = triggerConsumer;
        this.f38945g = timestampProvider;
        this.f38946h = locationProvider;
        this.f38947i = coroutineContext;
        this.f38950l = new ArrayList();
        setup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDelayVideoStop() {
        return getStepConfig().getShouldDelayVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScannerResult(Try<? extends C4275r4> r11) {
        getScannerCallback().onScannerResult(r11);
    }

    private final void setup() {
        M5 m11 = this.f38942d;
        if (m11.getClass().isAnonymousClass()) {
            String name = m11.getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = m11.getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        m11.setStepResultListener(new wn0.l() { // from class: com.fourthline.vision.internal.pb
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u6.setup$lambda$4$lambda$1(this.f38768a, (Try) obj);
            }
        });
        m11.setStepListener(new wn0.l() { // from class: com.fourthline.vision.internal.qb
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u6.setup$lambda$4$lambda$2(this.f38794a, (I5) obj);
            }
        });
        m11.setOnCompletedListener(new wn0.a() { // from class: com.fourthline.vision.internal.rb
            @Override // wn0.a
            public final Object invoke() {
                return u6.setup$lambda$4$lambda$3(this.f38817a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 setup$lambda$4$lambda$1(final u6 u6Var, Try r11) {
        p013kotlin.jvm.internal.s.k(r11, "<this>");
        TryKt.handleSuccess(r11, new wn0.l() { // from class: com.fourthline.vision.internal.ob
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u6.setup$lambda$4$lambda$1$lambda$0(this.f38703a, (K5) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(u6Var, null, null, u6Var.new c(null), 3, null);
        u6Var.getScannerCallback().onStepResult(r11);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job setup$lambda$4$lambda$1$lambda$0(u6 u6Var, K5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        u6Var.f38950l.add(it);
        return BuildersKt__Builders_commonKt.launch$default(u6Var, null, null, u6Var.new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 setup$lambda$4$lambda$2(u6 u6Var, I5 i11) {
        p013kotlin.jvm.internal.s.k(i11, "<this>");
        BuildersKt__Builders_commonKt.launch$default(u6Var, null, null, u6Var.new d(i11, null), 3, null);
        u6Var.getScannerCallback().onStepUpdate(i11.getStepType());
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 setup$lambda$4$lambda$3(u6 u6Var) {
        BuildersKt__Builders_commonKt.launch$default(u6Var, null, null, u6Var.new e(null), 3, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopProcessingJob() {
        Job job = this.f38948j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object tryReturnResult(Continuation<? super jn0.h0> continuation) {
        i iVar;
        u6 u6Var;
        Try r13;
        URI uri;
        Object objStop;
        URI uri2;
        u6 u6Var2;
        Try r14;
        String simpleName;
        int length;
        String name;
        int length2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f38976e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f38976e = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objStop2 = iVar.f38974c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar.f38976e;
        MotionData motionData = null;
        if (i12 == 0) {
            jn0.t.b(objStop2);
            if (getClass().isAnonymousClass()) {
                String name2 = getClass().getName();
                int length3 = name2.length();
                p013kotlin.jvm.internal.s.h(name2);
                if (length3 > 23) {
                    p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
                }
            } else {
                String simpleName2 = getClass().getSimpleName();
                int length4 = simpleName2.length();
                p013kotlin.jvm.internal.s.h(simpleName2);
                if (length4 > 23) {
                    p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
                }
            }
            InterfaceC4265q0 interfaceC4265q0 = this.f38943e;
            C4309w3 c4309w3 = new C4309w3(this.f38945g.getCurrentTimestamp());
            iVar.f38972a = this;
            iVar.f38976e = 1;
            if (interfaceC4265q0.consume(c4309w3, iVar) != coroutine_suspended) {
                u6Var = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            u6Var = (u6) iVar.f38972a;
            jn0.t.b(objStop2);
        } else {
            if (i12 == 2) {
                u6Var = (u6) iVar.f38972a;
                jn0.t.b(objStop2);
                r13 = (Try) objStop2;
                if (r13 instanceof Try.Failure) {
                    ((Try.Failure) r13).getException();
                    u6Var.onScannerResult(TryKt.failure(new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null)));
                    return jn0.h0.f84049a;
                }
                if (r13 instanceof Try.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                uri = (URI) ((Try.Success) r13).getValue();
                E3 e11 = u6Var.f38941c;
                iVar.f38972a = u6Var;
                iVar.f38973b = uri;
                iVar.f38976e = 3;
                objStop = e11.stop(iVar);
                if (objStop != coroutine_suspended) {
                    uri2 = uri;
                    objStop2 = objStop;
                    u6Var2 = u6Var;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri2 = (URI) iVar.f38973b;
            u6Var2 = (u6) iVar.f38972a;
            jn0.t.b(objStop2);
        }
        r14 = (Try) objStop2;
        if (r14 instanceof Try.Failure) {
            Throwable exception = ((Try.Failure) r14).getException();
            if (u6Var2.getClass().isAnonymousClass()) {
                name = u6Var2.getClass().getName();
                length2 = name.length();
                p013kotlin.jvm.internal.s.h(name);
                if (length2 > 23) {
                    p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                simpleName = u6Var2.getClass().getSimpleName();
                length = simpleName.length();
                p013kotlin.jvm.internal.s.h(simpleName);
                if (length > 23) {
                    p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                }
            }
            Objects.toString(exception);
        } else {
            if (r14 instanceof Try.Success) {
                throw new NoWhenBranchMatchedException();
            }
            motionData = (MotionData) ((Try.Success) r14).getValue();
        }
        u6Var2.onScannerResult(TryKt.success(new C4275r4(u6Var2.f38950l, new ScannerMetadata(u6Var2.f38945g.getCurrentTime(), u6Var2.f38946h.getLocation(), motionData), uri2)));
        return jn0.h0.f84049a;
        InterfaceC4240m3 mediaRecorderManager = u6Var.getMediaRecorderManager();
        iVar.f38972a = u6Var;
        iVar.f38976e = 2;
        objStop2 = mediaRecorderManager.stop(iVar);
        if (objStop2 != coroutine_suspended) {
            r13 = (Try) objStop2;
            if (r13 instanceof Try.Failure) {
                ((Try.Failure) r13).getException();
                u6Var.onScannerResult(TryKt.failure(new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null)));
                return jn0.h0.f84049a;
            }
            if (r13 instanceof Try.Success) {
                throw new NoWhenBranchMatchedException();
            }
            uri = (URI) ((Try.Success) r13).getValue();
            E3 e12 = u6Var.f38941c;
            iVar.f38972a = u6Var;
            iVar.f38973b = uri;
            iVar.f38976e = 3;
            objStop = e12.stop(iVar);
            if (objStop != coroutine_suspended) {
                uri2 = uri;
                objStop2 = objStop;
                u6Var2 = u6Var;
                r14 = (Try) objStop2;
                if (r14 instanceof Try.Failure) {
                    Throwable exception2 = ((Try.Failure) r14).getException();
                    if (u6Var2.getClass().isAnonymousClass()) {
                        name = u6Var2.getClass().getName();
                        length2 = name.length();
                        p013kotlin.jvm.internal.s.h(name);
                        if (length2 > 23) {
                            p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                        }
                    } else {
                        simpleName = u6Var2.getClass().getSimpleName();
                        length = simpleName.length();
                        p013kotlin.jvm.internal.s.h(simpleName);
                        if (length > 23) {
                            p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                        }
                    }
                    Objects.toString(exception2);
                } else {
                    if (r14 instanceof Try.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    motionData = (MotionData) ((Try.Success) r14).getValue();
                }
                u6Var2.onScannerResult(TryKt.success(new C4275r4(u6Var2.f38950l, new ScannerMetadata(u6Var2.f38945g.getCurrentTime(), u6Var2.f38946h.getLocation(), motionData), uri2)));
                return jn0.h0.f84049a;
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f38947i;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public InterfaceC4240m3 getMediaRecorderManager() {
        return this.f38940b;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public InterfaceC4205h4 getScannerCallback() {
        return this.f38939a;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public I5 getStepConfig() {
        return this.f38942d.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public int getStepsCount() {
        return this.f38942d.getStepsCount();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f38951m;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public boolean isRunning() {
        return this.f38952n;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void moveToNextStep() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (!isRunning() || this.f38949k) {
            return;
        }
        getScannerCallback().onMoveToNextStep();
        this.f38942d.moveToNext();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void resetCurrentStep() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (!isRunning() || this.f38949k) {
            return;
        }
        getScannerCallback().onResetCurrentStep(getStepConfig().getStepType());
        this.f38942d.resetCurrentStep();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void resetScanner() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        this.f38949k = false;
        setRunning(true);
        setCompleted(false);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
    }

    public void setCompleted(boolean z11) {
        this.f38951m = z11;
    }

    public void setRunning(boolean z11) {
        this.f38952n = z11;
    }

    public void setScannerCallback(InterfaceC4205h4 interfaceC4205h4) {
        p013kotlin.jvm.internal.s.k(interfaceC4205h4, "<set-?>");
        this.f38939a = interfaceC4205h4;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4, com.fourthline.vision.internal.F5
    public void start() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (isRunning()) {
            return;
        }
        setRunning(true);
        LocationProvider.DefaultImpls.requestLocation$default(this.f38946h, null, null, 3, null);
        if (isCompleted() && this.f38949k) {
            return;
        }
        getScannerCallback().onStart();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new f(null), 3, null);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4, com.fourthline.vision.internal.F5
    public void stop() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (!isCompleted()) {
            this.f38949k = true;
            onScannerResult(TryKt.failure(AbstractC4255o4.e.f38692b));
        }
        setCompleted(true);
        stopProcessingJob();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new g(null), 3, null);
        this.f38942d.stop();
        this.f38946h.cancelLocationRequest();
        setRunning(false);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void takeSnapshot() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (!isRunning() || this.f38949k) {
            return;
        }
        getScannerCallback().onTakeSnapshot();
        stopProcessingJob();
        this.f38948j = BuildersKt__Builders_commonKt.launch$default(this, null, null, new h(null), 3, null);
    }
}
