package com.fourthline.orca.internal;

import java.util.Locale;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3989wg {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wg$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.p f36452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.p pVar, Continuation continuation) {
            super(2, continuation);
            this.f36452c = pVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Continuation continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f36452c, continuation);
            aVar.f36451b = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36450a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Object obj2 = this.f36451b;
                wn0.p pVar = this.f36452c;
                this.f36450a = 1;
                if (pVar.invoke(obj2, this) == coroutine_suspended) {
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
    }

    public static final void a(boolean z11, String errorMessage) {
        p013kotlin.jvm.internal.s.k(errorMessage, "errorMessage");
    }

    public static final String a(Enum r11) {
        p013kotlin.jvm.internal.s.k(r11, "<this>");
        String strName = r11.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final Object a(Flow flow, wn0.p pVar, Continuation continuation) {
        Object objCollect = FlowKt.collect(FlowKt.onEach(flow, new a(pVar, null)), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
    }

    public static final Object a(String errorMessage, wn0.a productionFallback) {
        p013kotlin.jvm.internal.s.k(errorMessage, "errorMessage");
        p013kotlin.jvm.internal.s.k(productionFallback, "productionFallback");
        return productionFallback.invoke();
    }

    public static final Void a(String errorMessage) {
        p013kotlin.jvm.internal.s.k(errorMessage, "errorMessage");
        throw new IllegalStateException(("FL Developer error. " + errorMessage).toString());
    }
}
