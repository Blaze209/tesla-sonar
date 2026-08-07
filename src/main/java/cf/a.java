package cf;

import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kf.f;
import kf.s;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0003:\u0001%B\u0019\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcf/a;", "Landroidx/lifecycle/c1;", "Lce/a;", "", "Lkf/s;", "Lff/c;", "delegate", "Lce/c;", "actionComponentEventHandler", "<init>", "(Lff/c;Lce/c;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lce/b;", "Ljn0/h0;", "callback", "h", "(Landroidx/lifecycle/LifecycleOwner;Lwn0/l;)V", "onCleared", "()V", "s", "Lff/c;", "g", "()Lff/c;", "t", "Lce/c;", "f", "()Lce/c;", "Lkotlinx/coroutines/flow/Flow;", "Lkf/f;", "u", "Lkotlinx/coroutines/flow/Flow;", DateTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/Flow;", "viewFlow", "v", "a", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends c1 implements ce.a, s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ie.a<a, b, ff.c> f19154w = new ef.a(null, null, null, 7, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ff.c delegate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ce.c actionComponentEventHandler;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Flow<f> viewFlow;

    public a(ff.c delegate, ce.c actionComponentEventHandler) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(actionComponentEventHandler, "actionComponentEventHandler");
        this.delegate = delegate;
        this.actionComponentEventHandler = actionComponentEventHandler;
        this.viewFlow = getDelegate().d();
        getDelegate().g(d1.a(this));
    }

    @Override // kf.s
    public Flow<f> d() {
        return this.viewFlow;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ce.c getActionComponentEventHandler() {
        return this.actionComponentEventHandler;
    }

    @Override // ce.i
    /* JADX INFO: renamed from: g, reason: from getter */
    public ff.c getDelegate() {
        return this.delegate;
    }

    public final void h(LifecycleOwner lifecycleOwner, l<? super ce.b, h0> callback) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        getDelegate().i(lifecycleOwner, d1.a(this), callback);
    }

    @Override // androidx.p003lifecycle.c1
    protected void onCleared() {
        super.onCleared();
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = a.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "onCleared", null);
        }
        getDelegate().b();
    }
}
