package com.stripe.android.link;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import jn0.h0;
import p011ja.w;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/c;", "Landroidx/lifecycle/c1;", "<init>", "()V", "Ljn0/h0;", "f", "Lja/w;", "s", "Lja/w;", "getNavController", "()Lja/w;", "c", "(Lja/w;)V", "navController", "Lkotlin/Function1;", "Lcom/stripe/android/link/a;", "t", "Lwn0/l;", "getDismissWithResult", "()Lwn0/l;", "a", "(Lwn0/l;)V", "dismissWithResult", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private w navController;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private l<? super com.stripe.android.link.a, h0> dismissWithResult;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/c$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass) {
            s.k(modelClass, "modelClass");
            return new c();
        }
    }

    public final void a(l<? super com.stripe.android.link.a, h0> lVar) {
        this.dismissWithResult = lVar;
    }

    public final void c(w wVar) {
        this.navController = wVar;
    }

    public final void f() {
        this.navController = null;
        this.dismissWithResult = null;
    }
}
