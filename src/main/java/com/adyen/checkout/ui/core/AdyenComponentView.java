package com.adyen.checkout.ui.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.s0;
import androidx.fragment.app.d1;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.l;
import androidx.p003lifecycle.x;
import ce.i;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.ui.core.AdyenComponentView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import jn0.h0;
import jn0.t;
import kf.d;
import kf.e;
import kf.f;
import kf.j;
import kf.r;
import kf.s;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u0012*\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010&\u001a\u00020\u0012\"\f\b\u0000\u0010\"*\u00020 *\u00020!2\u0006\u0010#\u001a\u00028\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/adyen/checkout/ui/core/AdyenComponentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkf/f;", "viewType", "Lje/b;", "delegate", "Lke/i;", "componentParams", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ljn0/h0;", "g", "(Lkf/f;Lje/b;Lke/i;Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "Lmf/c;", "localizedContext", IntegerTokenConverter.CONVERTER_KEY, "(Lmf/c;Lkf/f;Lke/i;Landroid/content/Context;)V", "Lkf/s;", "Lce/i;", "T", "component", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "e", "(Lkf/s;Landroidx/lifecycle/LifecycleOwner;)V", "f", "()V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lhf/a;", "a", "Lhf/a;", "binding", "b", "Z", "Lkf/e;", "c", "Lkf/e;", "componentView", "Ljava/lang/ref/WeakReference;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/ref/WeakReference;", "attachedComponent", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AdyenComponentView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hf.a binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isInteractionBlocked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private e componentView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private WeakReference<i> attachedComponent;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf/s;", "Lce/i;", "T", "Lkf/f;", "componentViewType", "Ljn0/h0;", "<anonymous>", "(Lkf/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.AdyenComponentView$attach$1", f = "AdyenComponentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<f, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f19770n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f19771o;

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ s f19773q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f19774r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lcom/adyen/checkout/ui/core/AdyenComponentView;TT;Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/Continuation<-Lcom/adyen/checkout/ui/core/AdyenComponentView$a;>;)V */
        a(s sVar, LifecycleOwner lifecycleOwner, Continuation continuation) {
            super(2, continuation);
            this.f19773q = sVar;
            this.f19774r = lifecycleOwner;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Continuation<? super h0> continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = AdyenComponentView.this.new a(this.f19773q, this.f19774r, continuation);
            aVar.f19771o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19770n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            f fVar = (f) this.f19771o;
            AdyenComponentView.this.binding.f72633c.removeAllViews();
            if (fVar == null) {
                AdyenComponentView adyenComponentView = AdyenComponentView.this;
                me.a aVar = me.a.INFO;
                me.b.Companion companion = me.b.INSTANCE;
                if (companion.a().a(aVar)) {
                    String name = adyenComponentView.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name);
                    String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU1.length() != 0) {
                        name = p013kotlin.text.t.W0(strU1, "Kt");
                    }
                    companion.a().b(aVar, "CO." + name, "Component view type is null, ignoring.", null);
                }
                return h0.f84049a;
            }
            je.b delegate = ((i) this.f19773q).getDelegate();
            if (delegate instanceof r) {
                AdyenComponentView.this.g(fVar, delegate, delegate.getComponentParams(), x.a(this.f19774r));
                return h0.f84049a;
            }
            AdyenComponentView adyenComponentView2 = AdyenComponentView.this;
            me.a aVar2 = me.a.INFO;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (companion2.a().a(aVar2)) {
                String name2 = adyenComponentView2.getClass().getName();
                p013kotlin.jvm.internal.s.h(name2);
                String strU2 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU2.length() != 0) {
                    name2 = p013kotlin.text.t.W0(strU2, "Kt");
                }
                companion2.a().b(aVar2, "CO." + name2, "View attached to non viewable component, ignoring.", null);
            }
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkf/j;", "it", "Ljn0/h0;", "<anonymous>", "(Lkf/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.AdyenComponentView$loadView$1", f = "AdyenComponentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<j, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f19775n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f19776o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j jVar, Continuation<? super h0> continuation) {
            return ((b) create(jVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = AdyenComponentView.this.new b(continuation);
            bVar.f19776o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19775n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AdyenComponentView.this.setInteractionBlocked(((j) this.f19776o).a());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkf/i;", "it", "Ljn0/h0;", "<anonymous>", "(Lkf/i;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.AdyenComponentView$loadView$2", f = "AdyenComponentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<kf.i, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f19778n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f19779o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kf.i iVar, Continuation<? super h0> continuation) {
            return ((c) create(iVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = AdyenComponentView.this.new c(continuation);
            cVar.f19779o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19778n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (p013kotlin.jvm.internal.s.f((kf.i) this.f19779o, kf.i.a.f86012a)) {
                AdyenComponentView.this.f();
            }
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenComponentView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(f viewType, je.b delegate, ke.i componentParams, CoroutineScope coroutineScope) {
        Flow<kf.i> flowF;
        Flow flowOnEach;
        Flow<j> flowK;
        Flow flowOnEach2;
        e eVarB = viewType.getViewProvider().b(viewType, getLayoutInflater());
        this.componentView = eVarB;
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Context contextB = le.c.b(context, componentParams.getShopperLocale());
        this.binding.f72633c.addView(eVarB.getView());
        eVarB.b(delegate, coroutineScope, contextB);
        final kf.c cVar = delegate instanceof kf.c ? (kf.c) delegate : null;
        if (cVar == null || !cVar.p()) {
            FrameLayout frameLayoutButtonContainer = this.binding.f72632b;
            p013kotlin.jvm.internal.s.j(frameLayoutButtonContainer, "frameLayoutButtonContainer");
            frameLayoutButtonContainer.setVisibility(8);
            return;
        }
        kf.p pVar = delegate instanceof kf.p ? (kf.p) delegate : null;
        if (pVar != null && (flowK = pVar.k()) != null && (flowOnEach2 = FlowKt.onEach(flowK, new b(null))) != null) {
            FlowKt.launchIn(flowOnEach2, coroutineScope);
        }
        if (pVar != null && (flowF = pVar.f()) != null && (flowOnEach = FlowKt.onEach(flowF, new c(null))) != null) {
            FlowKt.launchIn(flowOnEach, coroutineScope);
        }
        FrameLayout frameLayoutButtonContainer2 = this.binding.f72632b;
        p013kotlin.jvm.internal.s.j(frameLayoutButtonContainer2, "frameLayoutButtonContainer");
        frameLayoutButtonContainer2.setVisibility(cVar.u() ? 0 : 8);
        p013kotlin.jvm.internal.s.i(viewType, "null cannot be cast to non-null type com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType");
        d buttonViewProvider = ((kf.b) viewType).getButtonViewProvider();
        Context context2 = getContext();
        p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
        mf.c cVarA = buttonViewProvider.a(context2);
        i(cVarA, viewType, componentParams, contextB);
        cVarA.setOnClickListener(new View.OnClickListener() { // from class: gf.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdyenComponentView.h(cVar, view);
            }
        });
        this.binding.f72632b.addView(cVarA);
    }

    private final LayoutInflater getLayoutInflater() {
        try {
            LayoutInflater layoutInflater = d1.a(this).getLayoutInflater();
            p013kotlin.jvm.internal.s.h(layoutInflater);
            return layoutInflater;
        } catch (IllegalStateException unused) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            p013kotlin.jvm.internal.s.h(layoutInflaterFrom);
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(kf.c cVar, View view) {
        cVar.l();
    }

    private final void i(mf.c cVar, f fVar, ke.i iVar, Context context) {
        String string;
        if (fVar instanceof kf.a) {
            string = nf.e.b(nf.e.f94911a, iVar.getAmount(), iVar.getShopperLocale(), context, ((kf.a) fVar).getButtonTextResId(), 0, 0, 48, null);
        } else {
            string = fVar instanceof kf.b ? context.getString(((kf.b) fVar).getButtonTextResId()) : null;
        }
        cVar.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInteractionBlocked(boolean isInteractionBlocked) {
        this.isInteractionBlocked = isInteractionBlocked;
        FrameLayout frameLayoutButtonContainer = this.binding.f72632b;
        p013kotlin.jvm.internal.s.j(frameLayoutButtonContainer, "frameLayoutButtonContainer");
        Iterator<View> it = s0.a(frameLayoutButtonContainer).iterator();
        while (it.hasNext()) {
            it.next().setEnabled(!isInteractionBlocked);
        }
        if (isInteractionBlocked) {
            nf.j.f(this);
            nf.j.e(this);
        }
    }

    public final <T extends s & i> void e(T component, LifecycleOwner lifecycleOwner) {
        p013kotlin.jvm.internal.s.k(component, "component");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        if (p013kotlin.jvm.internal.s.f(component, this.attachedComponent.get())) {
            return;
        }
        this.attachedComponent = new WeakReference<>(component);
        FlowKt.launchIn(l.b(FlowKt.onEach(component.d(), new a(component, lifecycleOwner, null)), lifecycleOwner.getLifecycle(), null, 2, null), x.a(lifecycleOwner));
        setVisibility(0);
    }

    public final void f() {
        e eVar = this.componentView;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        if (this.isInteractionBlocked) {
            return true;
        }
        return super.onInterceptTouchEvent(ev2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenComponentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ AdyenComponentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdyenComponentView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        hf.a aVarB = hf.a.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(aVarB, "inflate(...)");
        this.binding = aVarB;
        this.attachedComponent = new WeakReference<>(null);
        setVisibility(isInEditMode() ? 0 : 8);
        setOrientation(1);
    }
}
