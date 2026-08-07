package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2", f = "SentryCrashApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class R6 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<Crash> f46667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S6 f46669d;

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2$1$1", f = "SentryCrashApi.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f46670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f46672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ S6 f46673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Crash f46674e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, S6 s11, Crash crash, Continuation continuation) {
            super(2, continuation);
            this.f46672c = arrayList;
            this.f46673d = s11;
            this.f46674e = crash;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f46672c, this.f46673d, this.f46674e, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46671b;
            if (i11 == 0) {
                jn0.t.b(obj);
                ArrayList arrayList2 = this.f46672c;
                Object value = this.f46673d.f46700b.getValue();
                p013kotlin.jvm.internal.s.j(value, "getValue(...)");
                U6 u11 = (U6) value;
                String strA = this.f46673d.a();
                CrashApiOptions crashApiOptions = this.f46673d.f46701c;
                if (crashApiOptions == null) {
                    p013kotlin.jvm.internal.s.B("crashApiOptions");
                    crashApiOptions = null;
                }
                String apiKey = crashApiOptions.getApiKey();
                Crash crash = this.f46674e;
                this.f46670a = arrayList2;
                this.f46671b = 1;
                Object objA = u11.a(strA, apiKey, crash, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList = arrayList2;
                obj = objA;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.f46670a;
                jn0.t.b(obj);
            }
            arrayList.add(obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(List list, ArrayList arrayList, S6 s11, Continuation continuation) {
        super(2, continuation);
        this.f46667b = list;
        this.f46668c = arrayList;
        this.f46669d = s11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        R6 r11 = new R6(this.f46667b, this.f46668c, this.f46669d, continuation);
        r11.f46666a = obj;
        return r11;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((R6) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f46666a;
        List<Crash> list = this.f46667b;
        ArrayList arrayList = this.f46668c;
        S6 s11 = this.f46669d;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(arrayList, s11, (Crash) it.next(), null), 3, null);
        }
        return jn0.h0.f84049a;
    }
}
