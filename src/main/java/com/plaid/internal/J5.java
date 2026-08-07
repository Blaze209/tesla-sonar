package com.plaid.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* JADX INFO: loaded from: classes6.dex */
public final class J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4364c5 f46372a;

    public J5(C4364c5 plaidCrashReporter) {
        p013kotlin.jvm.internal.s.k(plaidCrashReporter, "plaidCrashReporter");
        this.f46372a = plaidCrashReporter;
    }

    public final void a(String message) {
        p013kotlin.jvm.internal.s.k(message, "message");
        C4364c5 c4364c5 = this.f46372a;
        c4364c5.getClass();
        p013kotlin.jvm.internal.s.k(message, "message");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4346a5(c4364c5, message, null), 3, null);
    }
}
