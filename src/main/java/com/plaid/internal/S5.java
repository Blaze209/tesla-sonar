package com.plaid.internal;

import androidx.core.view.ViewCompat;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class S5<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U5 f46698a;

    public S5(U5 u11) {
        this.f46698a = u11;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ((Boolean) obj).getClass();
        U5 u11 = this.f46698a;
        if (ViewCompat.S(u11)) {
            u11.post(new Q5(u11));
        } else {
            u11.addOnAttachStateChangeListener(new R5(u11, u11));
        }
        return jn0.h0.f84049a;
    }
}
