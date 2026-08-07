package a30;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R4\u0010\u000b\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"La30/f;", "", "RenderingT", "La30/c0;", "Lco0/d;", "type", "Lkotlin/Function4;", "La30/a0;", "Landroid/content/Context;", "Landroid/view/ViewGroup;", "Landroid/view/View;", "viewConstructor", "<init>", "(Lco0/d;Lwn0/r;)V", "initialRendering", "initialViewEnvironment", "contextForNewView", "container", "a", "(Ljava/lang/Object;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "b", "Lwn0/r;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class f<RenderingT> implements c0<RenderingT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<RenderingT> type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.r<RenderingT, ViewEnvironment, Context, ViewGroup, View> viewConstructor;

    /* JADX WARN: Multi-variable type inference failed */
    public f(co0.d<RenderingT> type, wn0.r<? super RenderingT, ? super ViewEnvironment, ? super Context, ? super ViewGroup, ? extends View> viewConstructor) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(viewConstructor, "viewConstructor");
        this.type = type;
        this.viewConstructor = viewConstructor;
    }

    @Override // a30.c0
    public View a(RenderingT initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
        return this.viewConstructor.invoke(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // a30.c0
    public co0.d<RenderingT> getType() {
        return this.type;
    }
}
