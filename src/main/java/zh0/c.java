package zh0;

import android.os.Bundle;
import android.os.Parcelable;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lzh0/c;", "Landroid/os/Parcelable;", "Args", "Lkotlin/Lazy;", "Lco0/d;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "<init>", "(Lco0/d;Lwn0/a;)V", "", "isInitialized", "()Z", "a", "Lco0/d;", "b", "Lwn0/a;", "c", "Landroid/os/Parcelable;", "cached", "()Landroid/os/Parcelable;", "value", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c<Args extends Parcelable> implements Lazy<Args> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<Args> navArgsClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Bundle> argumentProducer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Args cached;

    public c(co0.d<Args> navArgsClass, wn0.a<Bundle> argumentProducer) {
        s.k(navArgsClass, "navArgsClass");
        s.k(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // p013kotlin.Lazy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Object objA = q5.c.a(this.argumentProducer.invoke(), "ARGUMENT_ARGS", vn0.a.b(this.navArgsClass));
        s.i(objA, "null cannot be cast to non-null type Args of com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy");
        Args args2 = (Args) objA;
        this.cached = args2;
        return args2;
    }

    @Override // p013kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }
}
