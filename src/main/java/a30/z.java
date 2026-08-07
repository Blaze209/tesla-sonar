package a30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import gb.a;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B[\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012*\u0010\r\u001a&\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\f\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR8\u0010\r\u001a&\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"La30/z;", "Lgb/a;", "BindingT", "", "RenderingT", "La30/c0;", "Lco0/d;", "type", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/squareup/workflow1/ui/ViewBindingInflater;", "bindingInflater", "Lkotlin/Function1;", "La30/k;", "runnerConstructor", "<init>", "(Lco0/d;Lwn0/q;Lwn0/l;)V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "container", "Landroid/view/View;", "a", "(Ljava/lang/Object;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "b", "Lwn0/q;", "c", "Lwn0/l;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class z<BindingT extends gb.a, RenderingT> implements c0<RenderingT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<RenderingT> type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.q<LayoutInflater, ViewGroup, Boolean, BindingT> bindingInflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<BindingT, k<RenderingT>> runnerConstructor;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lgb/a;", "BindingT", "", "RenderingT", "rendering", "La30/a0;", AnalyticsAttribute.Environment, "Ljn0/h0;", "a", "(Ljava/lang/Object;La30/a0;)V"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<RenderingT, ViewEnvironment, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k<RenderingT> f245c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k<RenderingT> kVar) {
            super(2);
            this.f245c = kVar;
        }

        public final void a(RenderingT rendering, ViewEnvironment environment) {
            p013kotlin.jvm.internal.s.k(rendering, "rendering");
            p013kotlin.jvm.internal.s.k(environment, "environment");
            this.f245c.a(rendering, environment);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Object obj, ViewEnvironment viewEnvironment) {
            a(obj, viewEnvironment);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(co0.d<RenderingT> type, wn0.q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends BindingT> bindingInflater, wn0.l<? super BindingT, ? extends k<RenderingT>> runnerConstructor) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(bindingInflater, "bindingInflater");
        p013kotlin.jvm.internal.s.k(runnerConstructor, "runnerConstructor");
        this.type = type;
        this.bindingInflater = bindingInflater;
        this.runnerConstructor = runnerConstructor;
    }

    @Override // a30.c0
    public View a(RenderingT initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
        wn0.q<LayoutInflater, ViewGroup, Boolean, BindingT> qVar = this.bindingInflater;
        LayoutInflater layoutInflaterA = l.a(contextForNewView, container);
        p013kotlin.jvm.internal.s.j(layoutInflaterA, "contextForNewView.viewBi…LayoutInflater(container)");
        BindingT bindingtInvoke = qVar.invoke(layoutInflaterA, container, Boolean.FALSE);
        k<RenderingT> kVarInvoke = this.runnerConstructor.invoke(bindingtInvoke);
        View root = bindingtInvoke.getRoot();
        p013kotlin.jvm.internal.s.j(root, "binding.root");
        g0.a(root, initialRendering, initialViewEnvironment, new a(kVarInvoke));
        View root2 = bindingtInvoke.getRoot();
        p013kotlin.jvm.internal.s.j(root2, "bindingInflater(contextF…    }\n      }\n      .root");
        return root2;
    }

    @Override // a30.c0
    public co0.d<RenderingT> getType() {
        return this.type;
    }
}
