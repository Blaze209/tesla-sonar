package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class S3 implements T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4580y<String, Object> f46695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I3 f46696b;

    public S3(WorkflowDatabase database) {
        C4345a4 cache = new C4345a4();
        p013kotlin.jvm.internal.s.k(database, "database");
        p013kotlin.jvm.internal.s.k(cache, "cache");
        this.f46695a = cache;
        this.f46696b = database.a();
    }

    @Override // com.plaid.internal.T3
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        Object objA = this.f46695a.a(str2);
        String str3 = objA instanceof String ? (String) objA : null;
        return str3 == null ? this.f46696b.a(str, str2, continuationImpl) : str3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.T3
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        R3 r11;
        S3 s11;
        if (continuationImpl instanceof R3) {
            r11 = (R3) continuationImpl;
            int i11 = r11.f46655f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r11.f46655f = i11 - Integer.MIN_VALUE;
            } else {
                r11 = new R3(this, continuationImpl);
            }
        } else {
            r11 = new R3(this, continuationImpl);
        }
        Object obj = r11.f46653d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = r11.f46655f;
        if (i12 == 0) {
            jn0.t.b(obj);
            I3 i13 = this.f46696b;
            r11.f46650a = this;
            r11.f46651b = str2;
            r11.f46652c = str3;
            r11.f46655f = 1;
            if (i13.a(str, str2, str3, r11) == coroutine_suspended) {
                return coroutine_suspended;
            }
            s11 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = r11.f46652c;
            str2 = r11.f46651b;
            s11 = r11.f46650a;
            jn0.t.b(obj);
        }
        s11.f46695a.a(str2, str3);
        return jn0.h0.f84049a;
    }

    @Override // com.plaid.internal.T3
    public final Object a(String str, ContinuationImpl continuationImpl) {
        this.f46695a.clear();
        Object objA = this.f46696b.a(str, continuationImpl);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
