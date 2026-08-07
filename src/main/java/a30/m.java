package a30;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"La30/m;", "", "RenderingT", "La30/c0;", "Lco0/d;", "type", "", "layoutId", "Lkotlin/Function1;", "Landroid/view/View;", "La30/k;", "runnerConstructor", "<init>", "(Lco0/d;ILwn0/l;)V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "a", "(Ljava/lang/Object;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "b", "I", "c", "Lwn0/l;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class m<RenderingT> implements c0<RenderingT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<RenderingT> type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int layoutId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<View, k<RenderingT>> runnerConstructor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "RenderingT", "rendering", "La30/a0;", AnalyticsAttribute.Environment, "Ljn0/h0;", "a", "(Ljava/lang/Object;La30/a0;)V"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<RenderingT, ViewEnvironment, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k<RenderingT> f182c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k<RenderingT> kVar) {
            super(2);
            this.f182c = kVar;
        }

        public final void a(RenderingT rendering, ViewEnvironment environment) {
            p013kotlin.jvm.internal.s.k(rendering, "rendering");
            p013kotlin.jvm.internal.s.k(environment, "environment");
            this.f182c.a(rendering, environment);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Object obj, ViewEnvironment viewEnvironment) {
            a(obj, viewEnvironment);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(co0.d<RenderingT> type, int i11, wn0.l<? super View, ? extends k<RenderingT>> runnerConstructor) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(runnerConstructor, "runnerConstructor");
        this.type = type;
        this.layoutId = i11;
        this.runnerConstructor = runnerConstructor;
    }

    @Override // a30.c0
    public View a(RenderingT initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
        View view = l.a(contextForNewView, container).inflate(this.layoutId, container, false);
        wn0.l<View, k<RenderingT>> lVar = this.runnerConstructor;
        p013kotlin.jvm.internal.s.j(view, "view");
        g0.a(view, initialRendering, initialViewEnvironment, new a(lVar.invoke(view)));
        p013kotlin.jvm.internal.s.j(view, "contextForNewView.viewBi…onment)\n        }\n      }");
        return view;
    }

    @Override // a30.c0
    public co0.d<RenderingT> getType() {
        return this.type;
    }
}
