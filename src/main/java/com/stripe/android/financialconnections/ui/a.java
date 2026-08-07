package com.stripe.android.financialconnections.ui;

import androidx.appcompat.app.c;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/ui/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlin/Function0;", "Ljn0/h0;", "onBackgrounded", "onForegrounded", "<init>", "(Lwn0/a;Lwn0/a;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "a", "Lwn0/a;", "getOnBackgrounded", "()Lwn0/a;", "b", "getOnForegrounded", "", "c", "Z", "isFirstStart", DateTokenConverter.CONVERTER_KEY, "isInBackground", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onBackgrounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onForegrounded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isFirstStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isInBackground;

    public a(wn0.a<h0> onBackgrounded, wn0.a<h0> onForegrounded) {
        s.k(onBackgrounded, "onBackgrounded");
        s.k(onForegrounded, "onForegrounded");
        this.onBackgrounded = onBackgrounded;
        this.onForegrounded = onForegrounded;
        this.isFirstStart = true;
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onStart(owner);
        if (!this.isFirstStart && this.isInBackground) {
            this.onForegrounded.invoke();
        }
        this.isFirstStart = false;
        this.isInBackground = false;
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onStop(owner);
        c cVar = owner instanceof c ? (c) owner : null;
        if (cVar != null ? cVar.isChangingConfigurations() : false) {
            return;
        }
        this.isInBackground = true;
        this.onBackgrounded.invoke();
    }
}
