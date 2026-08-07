package a30;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u001aQ\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0007*\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0013\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\u0015\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u001a\u001a\u0004\u0018\u00010\u0004*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018\"F\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001b*\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001b8@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\r\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 *6\b\u0007\u0010#\u001a\u0004\b\u0000\u0010\u0001\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006$"}, d2 = {"", "RenderingT", "Landroid/view/View;", "initialRendering", "La30/a0;", "initialViewEnvironment", "Lkotlin/Function2;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "a", "(Landroid/view/View;Ljava/lang/Object;La30/a0;Lwn0/p;)V", "h", "(Landroid/view/View;)V", "rendering", "", "b", "(Landroid/view/View;Ljava/lang/Object;)Z", "viewEnvironment", "g", "(Landroid/view/View;Ljava/lang/Object;La30/a0;)V", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Lwn0/p;", "c", "(Landroid/view/View;)La30/a0;", "getEnvironment$annotations", AnalyticsAttribute.Environment, "Lkotlin/Function1;", "value", "e", "(Landroid/view/View;)Lwn0/l;", "f", "(Landroid/view/View;Lwn0/l;)V", "getStarter$annotations", "starter", "ViewShowRendering", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class g0 {
    public static final <RenderingT> void a(View view, RenderingT initialRendering, ViewEnvironment initialViewEnvironment, wn0.p<? super RenderingT, ? super ViewEnvironment, jn0.h0> showRendering) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(showRendering, "showRendering");
        k0.e(view, k0.d(view) instanceof j0.New ? new j0.New(initialRendering, initialViewEnvironment, showRendering, e(view)) : new j0.New(initialRendering, initialViewEnvironment, showRendering, null, 8, null));
    }

    public static final boolean b(View view, Object rendering) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        j0<?> j0VarD = k0.d(view);
        Object objC = j0VarD == null ? null : j0VarD.c();
        Object obj = objC != null ? objC : null;
        return obj != null && h.a(obj, rendering);
    }

    public static final ViewEnvironment c(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        j0<?> j0VarD = k0.d(view);
        if (j0VarD == null) {
            return null;
        }
        return j0VarD.getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String();
    }

    public static final <RenderingT> wn0.p<RenderingT, ViewEnvironment, jn0.h0> d(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        j0<?> j0VarD = k0.d(view);
        if (j0VarD == null) {
            return null;
        }
        return (wn0.p<RenderingT, ViewEnvironment, jn0.h0>) j0VarD.b();
    }

    public static final wn0.l<View, jn0.h0> e(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        return k0.b(view).g();
    }

    public static final void f(View view, wn0.l<? super View, jn0.h0> value) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(value, "value");
        k0.e(view, j0.New.e(k0.b(view), null, null, null, value, 7, null));
    }

    public static final <RenderingT> void g(View view, RenderingT rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        j0.Started<?> startedC = k0.c(view);
        if (h.a(startedC.c(), rendering)) {
            k0.e(view, new j0.Started(rendering, viewEnvironment, startedC.b()));
            startedC.b().invoke(rendering, viewEnvironment);
            return;
        }
        throw new IllegalStateException(("Expected " + view + " to be able to show rendering " + rendering + ", but that did not match previous rendering " + startedC.c() + ". Consider using WorkflowViewStub to display arbitrary types.").toString());
    }

    public static final void h(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        j0.New<?> newB = k0.b(view);
        k0.e(view, new j0.Started(newB.c(), newB.getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String(), newB.b()));
        newB.g().invoke(view);
    }
}
