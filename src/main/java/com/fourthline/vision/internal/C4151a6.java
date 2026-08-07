package com.fourthline.vision.internal;

import android.net.Uri;
import com.fourthline.vision.RecordingType;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.vision.internal.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4151a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4264q f38147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RecordingType f38148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f38149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f38150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.a f38151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Z5 f38152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f38153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Job f38154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f38155i;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.a6$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38157b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4151a6.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C4151a6 c4151a6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38157b;
            if (i11 == 0) {
                jn0.t.b(obj);
                long j11 = C4151a6.this.f38150d;
                this.f38157b = 1;
                if (DelayKt.delay(j11, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                jn0.t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4151a6 = (C4151a6) this.f38156a;
                jn0.t.b(obj);
            }
            c4151a6.f38153g = (Uri) obj;
            return jn0.h0.f84049a;
            C4151a6 c4151a7 = C4151a6.this;
            this.f38156a = c4151a7;
            this.f38157b = 2;
            Object objStopRecordingInternal = c4151a7.stopRecordingInternal(this);
            if (objStopRecordingInternal != coroutine_suspended) {
                c4151a6 = c4151a7;
                obj = objStopRecordingInternal;
                c4151a6.f38153g = (Uri) obj;
                return jn0.h0.f84049a;
            }
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.a6$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38160b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38162d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38160b = obj;
            this.f38162d |= Integer.MIN_VALUE;
            return C4151a6.this.stopRecordingInternal(this);
        }
    }

    public C4151a6(InterfaceC4264q cameraEngine, RecordingType recordingType, CoroutineScope scope, long j11, wn0.a<jn0.h0> onRecordingFailed) {
        p013kotlin.jvm.internal.s.k(cameraEngine, "cameraEngine");
        p013kotlin.jvm.internal.s.k(recordingType, "recordingType");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(onRecordingFailed, "onRecordingFailed");
        this.f38147a = cameraEngine;
        this.f38148b = recordingType;
        this.f38149c = scope;
        this.f38150d = j11;
        this.f38151e = onRecordingFailed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object stopRecordingInternal(Continuation<? super Uri> continuation) {
        b bVar;
        C4151a6 c4151a6;
        Throwable cause;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f38162d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f38162d = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objStop = bVar.f38160b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f38162d;
        if (i12 == 0) {
            jn0.t.b(objStop);
            Z5 z11 = this.f38152f;
            if (z11 != null) {
                try {
                    bVar.f38159a = this;
                    bVar.f38162d = 1;
                    objStop = z11.stop(bVar);
                    if (objStop == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c4151a6 = this;
                } catch (Z5.a e11) {
                    e = e11;
                    c4151a6 = this;
                    c4151a6.f38152f = null;
                    cause = e.getCause();
                    if (cause != null) {
                        cause.printStackTrace();
                    }
                    c4151a6.f38151e.invoke();
                    return null;
                }
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4151a6 = (C4151a6) bVar.f38159a;
        try {
            jn0.t.b(objStop);
        } catch (Z5.a e12) {
            e = e12;
            c4151a6.f38152f = null;
            cause = e.getCause();
            if (cause != null) {
                cause.printStackTrace();
            }
            c4151a6.f38151e.invoke();
            return null;
        }
        Uri uri = (Uri) objStop;
        c4151a6.f38155i = uri;
        c4151a6.f38152f = null;
        return uri;
    }

    public final Uri getRecordedVideoUri() {
        return this.f38155i;
    }

    public final boolean getShouldRecord() {
        return this.f38148b != RecordingType.NONE;
    }

    public final boolean isRecording() {
        return this.f38152f != null;
    }

    public final void startRecording() {
        if (getShouldRecord() && !isRecording()) {
            this.f38152f = this.f38147a.recordVideo();
            this.f38154h = BuildersKt__Builders_commonKt.launch$default(this.f38149c, null, null, new a(null), 3, null);
        }
    }

    public final Object stopRecording(Continuation<? super Uri> continuation) {
        Job job = this.f38154h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f38154h = null;
        Uri uri = this.f38153g;
        return uri == null ? stopRecordingInternal(continuation) : uri;
    }
}
