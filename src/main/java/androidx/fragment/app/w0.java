package androidx.fragment.app;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/fragment/app/Fragment;", "Lco0/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lkotlin/Lazy;", "b", "(Landroidx/fragment/app/Fragment;Lco0/d;Lwn0/a;Lwn0/a;Lwn0/a;)Lkotlin/Lazy;", "Landroidx/lifecycle/f1;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f8698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f8698c = fragment;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f8698c.getDefaultViewModelProviderFactory();
        }
    }

    public static final <VM extends androidx.p003lifecycle.c1> Lazy<VM> b(Fragment fragment, co0.d<VM> dVar, wn0.a<? extends ViewModelStore> aVar, wn0.a<? extends CreationExtras> aVar2, wn0.a<? extends ViewModelProvider.Factory> aVar3) {
        if (aVar3 == null) {
            aVar3 = new a(fragment);
        }
        return new e1(dVar, aVar, aVar3, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1 c(Lazy<? extends f1> lazy) {
        return lazy.getValue();
    }
}
