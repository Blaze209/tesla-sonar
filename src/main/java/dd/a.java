package dd;

import android.app.Activity;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import jn0.h0;
import kf.f;
import kf.s;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0004:\u0001+B\u0019\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Ldd/a;", "Landroidx/lifecycle/c1;", "Lce/a;", "Lkf/s;", "", "Lgd/c;", "genericActionDelegate", "Lce/c;", "actionComponentEventHandler", "<init>", "(Lgd/c;Lce/c;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lce/b;", "Ljn0/h0;", "callback", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Lwn0/l;)V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Landroid/app/Activity;", "activity", "h", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "onCleared", "()V", "s", "Lgd/c;", "t", "Lce/c;", "f", "()Lce/c;", "Lje/a;", "g", "()Lje/a;", "delegate", "Lkotlinx/coroutines/flow/Flow;", "Lkf/f;", DateTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/Flow;", "viewFlow", "u", "a", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends c1 implements ce.a, s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ie.a<a, b, gd.c> f60449v = new fd.a(null, null, null, 7, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final gd.c genericActionDelegate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ce.c actionComponentEventHandler;

    public a(gd.c genericActionDelegate, ce.c actionComponentEventHandler) {
        p013kotlin.jvm.internal.s.k(genericActionDelegate, "genericActionDelegate");
        p013kotlin.jvm.internal.s.k(actionComponentEventHandler, "actionComponentEventHandler");
        this.genericActionDelegate = genericActionDelegate;
        this.actionComponentEventHandler = actionComponentEventHandler;
        genericActionDelegate.g(d1.a(this));
    }

    @Override // kf.s
    public Flow<f> d() {
        return this.genericActionDelegate.d();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ce.c getActionComponentEventHandler() {
        return this.actionComponentEventHandler;
    }

    @Override // ce.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public je.a getDelegate() {
        return this.genericActionDelegate.getDelegate();
    }

    public void h(Action action, Activity activity) {
        p013kotlin.jvm.internal.s.k(action, "action");
        p013kotlin.jvm.internal.s.k(activity, "activity");
        this.genericActionDelegate.v(action, activity);
    }

    public final void i(LifecycleOwner lifecycleOwner, l<? super ce.b, h0> callback) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.genericActionDelegate.i(lifecycleOwner, d1.a(this), callback);
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
        this.genericActionDelegate.b();
    }
}
