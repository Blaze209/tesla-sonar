package com.plaid.internal;

import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
public final class P5<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f46585a;

    @DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$notifyWebViewShown$$inlined$filter$1$2", f = "PlaidWebview.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f46586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46587b;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46586a = obj;
            this.f46587b |= Integer.MIN_VALUE;
            return P5.this.emit(null, this);
        }
    }

    public P5(FlowCollector flowCollector) {
        this.f46585a = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f46587b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f46587b = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj2 = aVar.f46586a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f46587b;
        if (i12 == 0) {
            jn0.t.b(obj2);
            FlowCollector flowCollector = this.f46585a;
            if (((Boolean) obj).booleanValue()) {
                aVar.f46587b = 1;
                if (flowCollector.emit(obj, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj2);
        }
        return jn0.h0.f84049a;
    }
}
