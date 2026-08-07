package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashContextTypeAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Lazy;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class S6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E5 f46699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f46700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CrashApiOptions f46701c;

    public static final class a extends p013kotlin.jvm.internal.u implements wn0.a<U6> {
        public a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U6 invoke() {
            E5 e11 = S6.this.f46699a;
            CrashApiOptions crashApiOptions = S6.this.f46701c;
            if (crashApiOptions == null) {
                p013kotlin.jvm.internal.s.B("crashApiOptions");
                crashApiOptions = null;
            }
            return (U6) e11.a("https://analytics.plaid.com/sentry/api/" + crashApiOptions.getProjectId() + "/", new G5(new com.google.gson.g().e("yyyy-MM-dd'T'HH:mm:ss").d(CrashContext.class, new CrashContextTypeAdapter()).b(), 2)).b(U6.class);
        }
    }

    public S6(E5 retrofitFactory) {
        p013kotlin.jvm.internal.s.k(retrofitFactory, "retrofitFactory");
        this.f46699a = retrofitFactory;
        this.f46700b = jn0.m.b(new a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Crash crash, ContinuationImpl continuationImpl) {
        P6 p11;
        if (continuationImpl instanceof P6) {
            p11 = (P6) continuationImpl;
            int i11 = p11.f46591c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p11.f46591c = i11 - Integer.MIN_VALUE;
            } else {
                p11 = new P6(this, continuationImpl);
            }
        } else {
            p11 = new P6(this, continuationImpl);
        }
        Object objA = p11.f46589a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = p11.f46591c;
        if (i12 == 0) {
            jn0.t.b(objA);
            Object value = this.f46700b.getValue();
            p013kotlin.jvm.internal.s.j(value, "getValue(...)");
            U6 u11 = (U6) value;
            String strA = a();
            CrashApiOptions crashApiOptions = this.f46701c;
            if (crashApiOptions == null) {
                p013kotlin.jvm.internal.s.B("crashApiOptions");
                crashApiOptions = null;
            }
            String apiKey = crashApiOptions.getApiKey();
            p11.f46591c = 1;
            objA = u11.a(strA, apiKey, crash, p11);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
        }
        return Boxing.boxBoolean(!((AbstractC4442i4) objA).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        Q6 q11;
        ArrayList arrayList;
        if (continuationImpl instanceof Q6) {
            q11 = (Q6) continuationImpl;
            int i11 = q11.f46637d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q11.f46637d = i11 - Integer.MIN_VALUE;
            } else {
                q11 = new Q6(this, continuationImpl);
            }
        } else {
            q11 = new Q6(this, continuationImpl);
        }
        Object obj = q11.f46635b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = q11.f46637d;
        if (i12 == 0) {
            jn0.t.b(obj);
            ArrayList arrayList2 = new ArrayList();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            R6 r11 = new R6(list, arrayList2, this, null);
            q11.f46634a = arrayList2;
            q11.f46637d = 1;
            if (BuildersKt.withContext(io2, r11, q11) == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayList2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = q11.f46634a;
            jn0.t.b(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((AbstractC4442i4) obj2).a()) {
                arrayList3.add(obj2);
            }
        }
        return Boxing.boxBoolean(!p013kotlin.collections.v.d0(arrayList3));
    }

    public final String a() {
        CrashApiOptions crashApiOptions = this.f46701c;
        if (crashApiOptions == null) {
            p013kotlin.jvm.internal.s.B("crashApiOptions");
            crashApiOptions = null;
        }
        return "Sentry sentry_version=6,sentry_key=" + crashApiOptions.getApiKey();
    }
}
