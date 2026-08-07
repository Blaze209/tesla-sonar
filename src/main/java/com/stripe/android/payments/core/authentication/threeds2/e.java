package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/e;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lkotlin/Function0;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "argsSupplier", "<init>", "(Lwn0/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lwn0/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Stripe3ds2TransactionContract.Args> argsSupplier;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "T", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Stripe3ds2TransactionContract.Args f52150c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Stripe3ds2TransactionContract.Args args) {
            super(0);
            this.f52150c = args;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f52150c.getPublishableKey();
        }
    }

    public e(wn0.a<Stripe3ds2TransactionContract.Args> argsSupplier) {
        s.k(argsSupplier, "argsSupplier");
        this.argsSupplier = argsSupplier;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
        s.k(modelClass, "modelClass");
        s.k(extras, "extras");
        Stripe3ds2TransactionContract.Args argsInvoke = this.argsSupplier.invoke();
        Application applicationA = z30.b.a(extras);
        d dVarA = k70.e.a().a(applicationA).c(argsInvoke.getEnableLogging()).d(new a(argsInvoke)).b(argsInvoke.e()).e(xs.a.c(applicationA)).build().a().c(argsInvoke).b(v0.a(extras)).a(applicationA).build().a();
        s.i(dVarA, "null cannot be cast to non-null type T of com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.create");
        return dVarA;
    }
}
