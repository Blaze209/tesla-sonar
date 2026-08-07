package androidx.p003lifecycle.viewmodel;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J,\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/viewmodel/a;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initialExtras", "<init>", "(Landroidx/lifecycle/viewmodel/CreationExtras;)V", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", Action.KEY_ATTRIBUTE, "t", "Ljn0/h0;", "c", "(Landroidx/lifecycle/viewmodel/CreationExtras$b;Ljava/lang/Object;)V", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras$b;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends CreationExtras {
    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.p003lifecycle.viewmodel.CreationExtras
    public <T> T a(CreationExtras.b<T> key) {
        s.k(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(CreationExtras.b<T> key, T t11) {
        s.k(key, "key");
        b().put(key, t11);
    }

    public a(CreationExtras initialExtras) {
        s.k(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ a(CreationExtras creationExtras, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CreationExtras.a.f8924b : creationExtras);
    }
}
