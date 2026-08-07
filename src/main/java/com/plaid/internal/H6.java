package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.remotelog.RemoteLogSender$sendEvents$2", f = "RemoteLogSender.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class H6 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I6 f46339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f46341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H6(I6 i11, ArrayList arrayList, String str, Continuation continuation) {
        super(2, continuation);
        this.f46339b = i11;
        this.f46340c = arrayList;
        this.f46341d = str;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new H6(this.f46339b, this.f46340c, this.f46341d, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((H6) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46338a;
        try {
            if (i11 == 0) {
                jn0.t.b(obj);
                Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequestA = I6.a(this.f46339b, this.f46340c, this.f46341d);
                d8 d8Var = this.f46339b.f46354a;
                this.f46338a = 1;
                obj = d8Var.a(workflow$LinkWorkflowEventRequestA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            AbstractC4442i4 abstractC4442i4 = (AbstractC4442i4) obj;
            if (abstractC4442i4 instanceof AbstractC4442i4.c) {
                X5.a.a(X5.f46812a, "Successfully sent " + this.f46340c.size() + " remote log events for session: " + this.f46341d);
            } else {
                X5.a.b(X5.f46812a, "Failed to send remote log events: " + abstractC4442i4);
            }
        } catch (IOException e11) {
            X5.a.b(X5.f46812a, "IOException while sending remote log events", new Object[]{e11});
        } catch (RuntimeException e12) {
            if (e12 instanceof CancellationException) {
                throw e12;
            }
            X5.a.b(X5.f46812a, "RuntimeException while sending remote log events", new Object[]{e12});
        }
        return jn0.h0.f84049a;
    }
}
