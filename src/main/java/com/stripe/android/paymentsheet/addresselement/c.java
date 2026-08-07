package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import javax.inject.Provider;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B-\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/c;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/paymentsheet/addresselement/a;", "navigator", "Ljavax/inject/Provider;", "Lv70/l$a;", "inputAddressViewModelSubcomponentBuilderProvider", "Lv70/e$a;", "autoCompleteViewModelSubcomponentBuilderProvider", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "s", "Lcom/stripe/android/paymentsheet/addresselement/a;", "h", "()Lcom/stripe/android/paymentsheet/addresselement/a;", "t", "Ljavax/inject/Provider;", "g", "()Ljavax/inject/Provider;", "u", "f", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.addresselement.a navigator;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Provider<v70.l.a> inputAddressViewModelSubcomponentBuilderProvider;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Provider<v70.e.a> autoCompleteViewModelSubcomponentBuilderProvider;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/c$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lkotlin/Function0;", "Landroid/app/Application;", "applicationSupplier", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "starterArgsSupplier", "<init>", "(Lwn0/a;Lwn0/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Lwn0/a;", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<Application> applicationSupplier;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<AddressElementActivityContract.Args> starterArgsSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wn0.a<? extends Application> applicationSupplier, wn0.a<AddressElementActivityContract.Args> starterArgsSupplier) {
            s.k(applicationSupplier, "applicationSupplier");
            s.k(starterArgsSupplier, "starterArgsSupplier");
            this.applicationSupplier = applicationSupplier;
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass) {
            s.k(modelClass, "modelClass");
            c cVarA = v70.f.a().a(this.applicationSupplier.invoke()).b(this.starterArgsSupplier.invoke()).build().a();
            s.i(cVarA, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AddressElementViewModel.Factory.create");
            return cVarA;
        }
    }

    public c(com.stripe.android.paymentsheet.addresselement.a navigator, Provider<v70.l.a> inputAddressViewModelSubcomponentBuilderProvider, Provider<v70.e.a> autoCompleteViewModelSubcomponentBuilderProvider) {
        s.k(navigator, "navigator");
        s.k(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        s.k(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        this.navigator = navigator;
        this.inputAddressViewModelSubcomponentBuilderProvider = inputAddressViewModelSubcomponentBuilderProvider;
        this.autoCompleteViewModelSubcomponentBuilderProvider = autoCompleteViewModelSubcomponentBuilderProvider;
    }

    public final Provider<v70.e.a> f() {
        return this.autoCompleteViewModelSubcomponentBuilderProvider;
    }

    public final Provider<v70.l.a> g() {
        return this.inputAddressViewModelSubcomponentBuilderProvider;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.stripe.android.paymentsheet.addresselement.a getNavigator() {
        return this.navigator;
    }
}
