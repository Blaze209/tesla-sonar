package com.fourthline.orca.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.networking.NetworkEnvironmentKt;
import com.fourthline.orca.Orca;
import com.fourthline.orca.internal.AbstractC3481ko;
import com.fourthline.orca.internal.CC;
import com.fourthline.orca.internal.DeviceDataCollection;
import com.fourthline.orca.internal.E6;
import com.fourthline.orca.internal.G6;
import com.fourthline.orca.internal.H6;
import com.fourthline.orca.internal.Jl;
import com.fourthline.orca.internal.PE;
import com.fourthline.orca.internal.VC;
import com.fourthline.orca.internal.Y5;
import com.fourthline.orca.internal.Zy;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import jn0.h0;
import jn0.s;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/fourthline/orca/Orca;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", WorkflowKeys.VALIDATION_CODE, "Lcom/fourthline/orca/workflow/WorkflowSessionConfiguration;", "workflowSession", "(Lcom/fourthline/orca/Orca;Landroid/content/Context;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowSessionConfiguration;", "Lcom/fourthline/orca/internal/Zy;", "startSessionSubcomponent", "Lcom/fourthline/orca/internal/PE;", "mobileSession", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ljn0/h0;", "tryCollectDeviceData", "(Lcom/fourthline/orca/internal/Zy;Lcom/fourthline/orca/internal/PE;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fourthline-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SessionBuilderKt {

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f37427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37428b;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37427a = obj;
            this.f37428b |= Integer.MIN_VALUE;
            return SessionBuilderKt.tryCollectDeviceData(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a() {
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object tryCollectDeviceData(Zy zy2, PE pe2, Context context, CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f37428b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f37428b = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f37427a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f37428b;
        if (i12 == 0) {
            t.b(obj);
            String strD = pe2.c().d();
            final DeviceDataCollection deviceDataCollection = pe2.e().getTenant().getDeviceDataCollection();
            if (!deviceDataCollection.getEnabled() || NetworkEnvironmentKt.orcaShouldUseStubs(pe2.c().a())) {
                return h0.f84049a;
            }
            Y5 y11 = new Y5();
            E6 e6A = y11.a();
            Pair pairA = x.a(y11.a(new H6(context, null, y11.a(context, coroutineScope), e6A), new wn0.a() { // from class: com.fourthline.orca.workflow.b
                @Override // wn0.a
                public final Object invoke() {
                    return SessionBuilderKt.a(deviceDataCollection);
                }
            }), y11.a(e6A));
            Jl jl2 = new Jl(zy2.a(), (G6) pairA.a(), (VC) pairA.b(), new wn0.a() { // from class: com.fourthline.orca.workflow.c
                @Override // wn0.a
                public final Object invoke() {
                    return Long.valueOf(SessionBuilderKt.a());
                }
            });
            CC.a aVar2 = new CC.a(strD);
            aVar.f37428b = 1;
            if (jl2.a(aVar2, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            ((s) obj).getValue();
        }
        return h0.f84049a;
    }

    public static final WorkflowSessionConfiguration workflowSession(Orca orca, Context context, String validationCode) throws Throwable {
        p013kotlin.jvm.internal.s.k(orca, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
        AbstractC3481ko.a(context);
        return new SessionBuilder(context, validationCode, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDataCollection a(DeviceDataCollection deviceDataCollection) {
        return deviceDataCollection;
    }
}
