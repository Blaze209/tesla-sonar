package ud;

import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import ce.j;
import ce.o;
import ce.p;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod;
import java.util.List;
import jn0.h0;
import kf.s;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0004:\u00018B/\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0014¢\u0006\u0004\b!\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lud/a;", "Landroidx/lifecycle/c1;", "Lce/o;", "Lkf/s;", "", "Lxd/b;", "bacsDelegate", "Lgd/c;", "genericActionDelegate", "Led/b;", "actionHandlingComponent", "Lce/j;", "Lud/b;", "componentEventHandler", "<init>", "(Lxd/b;Lgd/c;Led/b;Lce/j;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lce/p;", "Ljn0/h0;", "callback", "g", "(Landroidx/lifecycle/LifecycleOwner;Lwn0/l;)V", "", "h", "()Z", IntegerTokenConverter.CONVERTER_KEY, "k", "()V", "isInteractionBlocked", "j", "(Z)V", "onCleared", "s", "Lxd/b;", "t", "Lgd/c;", "u", "Led/b;", "v", "Lce/j;", "f", "()Lce/j;", "Lkotlinx/coroutines/flow/Flow;", "Lkf/f;", "w", "Lkotlinx/coroutines/flow/Flow;", DateTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/Flow;", "viewFlow", "Lje/b;", "getDelegate", "()Lje/b;", "delegate", "x", "a", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends c1 implements o, s {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final wd.a f116106y = new wd.a(null, null, null, 7, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final List<String> f116107z = v.e(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xd.b bacsDelegate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final gd.c genericActionDelegate;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final ed.b actionHandlingComponent;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final j<BacsDirectDebitComponentState> componentEventHandler;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Flow<kf.f> viewFlow;

    public a(xd.b bacsDelegate, gd.c genericActionDelegate, ed.b actionHandlingComponent, j<BacsDirectDebitComponentState> componentEventHandler) {
        p013kotlin.jvm.internal.s.k(bacsDelegate, "bacsDelegate");
        p013kotlin.jvm.internal.s.k(genericActionDelegate, "genericActionDelegate");
        p013kotlin.jvm.internal.s.k(actionHandlingComponent, "actionHandlingComponent");
        p013kotlin.jvm.internal.s.k(componentEventHandler, "componentEventHandler");
        this.bacsDelegate = bacsDelegate;
        this.genericActionDelegate = genericActionDelegate;
        this.actionHandlingComponent = actionHandlingComponent;
        this.componentEventHandler = componentEventHandler;
        this.viewFlow = nf.b.b(d1.a(this), bacsDelegate.d(), genericActionDelegate.d(), null, null, 24, null);
        bacsDelegate.g(d1.a(this));
        genericActionDelegate.g(d1.a(this));
        componentEventHandler.g(d1.a(this));
    }

    @Override // kf.s
    public Flow<kf.f> d() {
        return this.viewFlow;
    }

    public final j<BacsDirectDebitComponentState> f() {
        return this.componentEventHandler;
    }

    public final void g(LifecycleOwner lifecycleOwner, l<? super p<BacsDirectDebitComponentState>, h0> callback) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.bacsDelegate.i(lifecycleOwner, d1.a(this), callback);
        this.genericActionDelegate.i(lifecycleOwner, d1.a(this), ce.d.a(callback));
    }

    @Override // ce.i
    public je.b getDelegate() {
        return this.actionHandlingComponent.a();
    }

    public final boolean h() {
        je.b delegate = getDelegate();
        xd.b bVar = delegate instanceof xd.b ? (xd.b) delegate : null;
        if (bVar != null) {
            return bVar.s(e.CONFIRMATION);
        }
        return false;
    }

    public final boolean i() {
        je.b delegate = getDelegate();
        xd.b bVar = delegate instanceof xd.b ? (xd.b) delegate : null;
        if (bVar != null) {
            return bVar.s(e.INPUT);
        }
        return false;
    }

    public void j(boolean isInteractionBlocked) {
        h0 h0Var;
        je.b delegate = getDelegate();
        xd.b bVar = delegate instanceof xd.b ? (xd.b) delegate : null;
        if (bVar != null) {
            bVar.m(isInteractionBlocked);
            h0Var = h0.f84049a;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            me.a aVar = me.a.ERROR;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = a.class.getName();
                p013kotlin.jvm.internal.s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Payment component is not interactable, ignoring.", null);
            }
        }
    }

    public void k() {
        h0 h0Var;
        je.b delegate = getDelegate();
        kf.c cVar = delegate instanceof kf.c ? (kf.c) delegate : null;
        if (cVar != null) {
            cVar.l();
            h0Var = h0.f84049a;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            me.a aVar = me.a.ERROR;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = a.class.getName();
                p013kotlin.jvm.internal.s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Component is currently not submittable, ignoring.", null);
            }
        }
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
        this.bacsDelegate.b();
        this.genericActionDelegate.b();
        this.componentEventHandler.b();
    }
}
