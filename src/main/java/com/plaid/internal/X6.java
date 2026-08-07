package com.plaid.internal;

import androidx.p003lifecycle.LifecycleOwner;
import com.plaid.internal.X6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class X6<T> extends androidx.p003lifecycle.i0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f46814a = new AtomicBoolean(false);

    public static final void a(X6 this$0, androidx.p003lifecycle.j0 observer, Object obj) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(observer, "$observer");
        if (this$0.f46814a.get()) {
            observer.onChanged(obj);
        }
    }

    @Override // androidx.p003lifecycle.d0
    public final void observe(LifecycleOwner owner, final androidx.p003lifecycle.j0<? super T> observer) throws B2 {
        p013kotlin.jvm.internal.s.k(owner, "owner");
        p013kotlin.jvm.internal.s.k(observer, "observer");
        if (hasActiveObservers()) {
            throw new B2("Only one observer supported");
        }
        super.observe(owner, new androidx.p003lifecycle.j0() { // from class: g00.j
            @Override // androidx.p003lifecycle.j0
            public final void onChanged(Object obj) {
                X6.a(this.f66824a, observer, obj);
            }
        });
    }

    @Override // androidx.p003lifecycle.i0, androidx.p003lifecycle.d0
    public final void setValue(T t11) {
        this.f46814a.set(true);
        super.setValue(t11);
    }
}
