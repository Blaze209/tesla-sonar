package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/j;", "Landroidx/fragment/app/y;", "Lq80/m;", "uiCustomization", "Lt80/v;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/k;", "errorRequestExecutor", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/b;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lq80/m;Lt80/v;Lcom/stripe/android/stripe3ds2/transaction/k;Lr80/c;Lcom/stripe/android/stripe3ds2/transaction/b;Lcom/stripe/android/stripe3ds2/transactions/d;Lcom/stripe/android/stripe3ds2/transaction/n;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/ClassLoader;", "classLoader", "", "className", "Landroidx/fragment/app/Fragment;", "instantiate", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "a", "Lq80/m;", "b", "Lt80/v;", "c", "Lcom/stripe/android/stripe3ds2/transaction/k;", DateTokenConverter.CONVERTER_KEY, "Lr80/c;", "e", "Lcom/stripe/android/stripe3ds2/transaction/b;", "f", "Lcom/stripe/android/stripe3ds2/transactions/d;", "g", "Lcom/stripe/android/stripe3ds2/transaction/n;", "h", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q80.m uiCustomization;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t80.v transactionTimer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transaction.b challengeActionHandler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transactions.d initialUiType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final IntentData intentData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    public j(q80.m uiCustomization, t80.v transactionTimer, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, r80.c errorReporter, com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, com.stripe.android.stripe3ds2.transactions.d dVar, IntentData intentData, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
        p013kotlin.jvm.internal.s.k(transactionTimer, "transactionTimer");
        p013kotlin.jvm.internal.s.k(errorRequestExecutor, "errorRequestExecutor");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(challengeActionHandler, "challengeActionHandler");
        p013kotlin.jvm.internal.s.k(intentData, "intentData");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.uiCustomization = uiCustomization;
        this.transactionTimer = transactionTimer;
        this.errorRequestExecutor = errorRequestExecutor;
        this.errorReporter = errorReporter;
        this.challengeActionHandler = challengeActionHandler;
        this.initialUiType = dVar;
        this.intentData = intentData;
        this.workContext = workContext;
    }

    @Override // androidx.fragment.app.y
    public Fragment instantiate(ClassLoader classLoader, String className) {
        p013kotlin.jvm.internal.s.k(classLoader, "classLoader");
        p013kotlin.jvm.internal.s.k(className, "className");
        if (p013kotlin.jvm.internal.s.f(className, i.class.getName())) {
            return new i(this.uiCustomization, this.transactionTimer, this.errorRequestExecutor, this.errorReporter, this.challengeActionHandler, this.initialUiType, this.intentData, this.workContext);
        }
        Fragment fragmentInstantiate = super.instantiate(classLoader, className);
        p013kotlin.jvm.internal.s.h(fragmentInstantiate);
        return fragmentInstantiate;
    }
}
