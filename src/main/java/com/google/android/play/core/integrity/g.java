package com.google.android.play.core.integrity;

import android.text.TextUtils;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes5.dex */
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f43148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f43149b;

    g(q qVar, w wVar) {
        this.f43148a = qVar;
        this.f43149b = wVar;
    }

    @Override // com.google.android.play.core.integrity.a
    public final Task<a.c> a(final a.AbstractC0673a abstractC0673a) {
        abstractC0673a.d();
        if (TextUtils.isEmpty(null)) {
            return this.f43148a.d(abstractC0673a.b(), abstractC0673a.a()).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.f
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    g gVar = this.f43146a;
                    a.AbstractC0673a abstractC0673a2 = abstractC0673a;
                    return Tasks.forResult(new v(gVar.f43149b, abstractC0673a2.b(), ((Long) obj).longValue(), abstractC0673a2.a()));
                }
            });
        }
        try {
            w wVar = this.f43149b;
            long jB = abstractC0673a.b();
            abstractC0673a.d();
            return Tasks.forResult(new v(wVar, jB, Long.parseLong(null), abstractC0673a.a()));
        } catch (NumberFormatException e11) {
            return Tasks.forException(e11);
        }
    }
}
