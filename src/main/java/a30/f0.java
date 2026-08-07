package a30;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "La30/c0;", "bindings", "La30/e0;", "b", "([La30/c0;)La30/e0;", "a", "()La30/e0;", "", "RenderingT", "rendering", "e", "(La30/e0;Ljava/lang/Object;)La30/c0;", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "La30/h0;", "viewStarter", "Landroid/view/View;", "c", "(La30/e0;Ljava/lang/Object;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;La30/h0;)Landroid/view/View;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class f0 {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "RenderingT", "Landroid/view/View;", "newView", "Ljn0/h0;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<View, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<View, jn0.h0> f136d;

        /* JADX INFO: renamed from: a30.f0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "RenderingT", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
        static final class C0010a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.l<View, jn0.h0> f137c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ View f138d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0010a(wn0.l<? super View, jn0.h0> lVar, View view) {
                super(0);
                this.f137c = lVar;
                this.f138d = view;
            }

            public final void b() {
                this.f137c.invoke(this.f138d);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h0 h0Var, wn0.l<? super View, jn0.h0> lVar) {
            super(1);
            this.f135c = h0Var;
            this.f136d = lVar;
        }

        public final void a(View newView) {
            p013kotlin.jvm.internal.s.k(newView, "newView");
            this.f135c.a(newView, new C0010a(this.f136d, newView));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(View view) {
            a(view);
            return jn0.h0.f84049a;
        }
    }

    public static final e0 a() {
        return new y((c0<?>[]) new c0[0]);
    }

    public static final e0 b(c0<?>... bindings) {
        p013kotlin.jvm.internal.s.k(bindings, "bindings");
        return new y((c0<?>[]) Arrays.copyOf(bindings, bindings.length));
    }

    public static final <RenderingT> View c(e0 e0Var, RenderingT initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup, h0 h0Var) {
        p013kotlin.jvm.internal.s.k(e0Var, "<this>");
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
        View viewA = e(e0Var, initialRendering).a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        if (k0.d(viewA) != null) {
            if (h0Var == null) {
                return viewA;
            }
            g0.f(viewA, new a(h0Var, g0.e(viewA)));
            return viewA;
        }
        throw new IllegalStateException(("View.bindShowRendering should have been called for " + viewA + ", typically by the " + ((Object) c0.class.getName()) + " that created it.").toString());
    }

    public static /* synthetic */ View d(e0 e0Var, Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup, h0 h0Var, int i11, Object obj2) {
        if ((i11 & 8) != 0) {
            viewGroup = null;
        }
        if ((i11 & 16) != 0) {
            h0Var = null;
        }
        return c(e0Var, obj, viewEnvironment, context, viewGroup, h0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <RenderingT> c0<RenderingT> e(e0 e0Var, RenderingT rendering) {
        p013kotlin.jvm.internal.s.k(e0Var, "<this>");
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        c0<RenderingT> c0VarA = e0Var.a(o0.b(rendering.getClass()));
        if (c0VarA == null) {
            b bVar = rendering instanceof b ? (b) rendering : null;
            c0VarA = bVar == null ? null : bVar.a();
            if (c0VarA == null) {
                c0VarA = null;
            }
            if (c0VarA == null) {
                o oVar = (rendering instanceof n ? (n) rendering : null) != null ? o.f186b : null;
                if (oVar != null) {
                    return oVar;
                }
                throw new IllegalArgumentException("A " + ((Object) o0.b(c0.class).c()) + " should have been registered to display " + ((Object) o0.b(rendering.getClass()).c()) + " instances, or that class should implement " + ((Object) o0.b(b.class).l()) + '<' + ((Object) o0.b(rendering.getClass()).l()) + ">.");
            }
        }
        return c0VarA;
    }
}
