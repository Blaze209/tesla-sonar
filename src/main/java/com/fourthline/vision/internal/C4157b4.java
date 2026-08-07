package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4157b4 extends O5 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.b4$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38174a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38176c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38174a = obj;
            this.f38176c |= Integer.MIN_VALUE;
            return C4157b4.this.consume((jn0.h0) null, (Continuation<? super jn0.h0>) this);
        }
    }

    public /* synthetic */ C4157b4(TimestampProvider timestampProvider, long j11, TimeUnit timeUnit, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(timestampProvider, j11, (i11 & 4) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    @Override // com.fourthline.vision.internal.AbstractC4222k, com.fourthline.vision.internal.G5, com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((jn0.h0) obj, (Continuation<? super jn0.h0>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.vision.internal.AbstractC4222k
    public Object consume(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) throws AbstractC4255o4.d {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f38176c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38176c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f38174a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38176c;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                aVar.f38176c = 1;
                if (super.consume(h0Var, (Continuation<? super jn0.h0>) aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        } catch (Throwable unused) {
            throw AbstractC4255o4.d.f38691b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4157b4(TimestampProvider timestampProvider, long j11, TimeUnit timeUnit) {
        super(timestampProvider, j11, timeUnit);
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
    }
}
