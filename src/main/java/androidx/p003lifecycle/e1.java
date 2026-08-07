package androidx.p003lifecycle;

import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/e1;", "Landroidx/lifecycle/c1;", "VM", "Lkotlin/Lazy;", "Lco0/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "<init>", "(Lco0/d;Lwn0/a;Lwn0/a;Lwn0/a;)V", "", "isInitialized", "()Z", "a", "Lco0/d;", "b", "Lwn0/a;", "c", DateTokenConverter.CONVERTER_KEY, "e", "Landroidx/lifecycle/c1;", "cached", "()Landroidx/lifecycle/c1;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e1<VM extends c1> implements Lazy<VM> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d<VM> viewModelClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a<ViewModelStore> storeProducer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a<ViewModelProvider.Factory> factoryProducer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a<CreationExtras> extrasProducer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private VM cached;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(d<VM> viewModelClass, a<? extends ViewModelStore> storeProducer, a<? extends ViewModelProvider.Factory> factoryProducer, a<? extends CreationExtras> extrasProducer) {
        s.k(viewModelClass, "viewModelClass");
        s.k(storeProducer, "storeProducer");
        s.k(factoryProducer, "factoryProducer");
        s.k(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // p013kotlin.Lazy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm2 = this.cached;
        if (vm2 != null) {
            return vm2;
        }
        VM vm3 = (VM) ViewModelProvider.INSTANCE.a(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).a(this.viewModelClass);
        this.cached = vm3;
        return vm3;
    }

    @Override // p013kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }
}
