package a30;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0003B+\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R$\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\u001a"}, d2 = {"La30/d;", "", "W", "La30/b;", "wrapped", "", "shadow", "Lkotlin/Function0;", "Ljn0/h0;", "onBackPressed", "<init>", "(Ljava/lang/Object;ZLwn0/a;)V", "a", "Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "b", "Z", "c", "()Z", "Lwn0/a;", "()Lwn0/a;", "La30/c0;", "La30/c0;", "()La30/c0;", "viewFactory", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class d<W> implements a30.b<d<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W wrapped;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean shadow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onBackPressed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c0<d<?>> viewFactory;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "W", "La30/d;", "outer", "a", "(La30/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<d<?>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f126c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d<?> outer) {
            p013kotlin.jvm.internal.s.k(outer, "outer");
            return outer.d();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0000`\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00020\u0005H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "W", "Landroid/view/View;", "view", "Lkotlin/Function2;", "La30/a0;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "innerShowRendering", "La30/d;", "outerRendering", "viewEnvironment", "a", "(Landroid/view/View;Lwn0/p;La30/d;La30/a0;)V"}, k = 3, mv = {1, 6, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.r<View, wn0.p<? super Object, ? super ViewEnvironment, ? extends jn0.h0>, d<?>, ViewEnvironment, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f127c = new b();

        b() {
            super(4);
        }

        public final void a(View view, wn0.p<Object, ? super ViewEnvironment, jn0.h0> innerShowRendering, d<?> outerRendering, ViewEnvironment viewEnvironment) {
            p013kotlin.jvm.internal.s.k(view, "view");
            p013kotlin.jvm.internal.s.k(innerShowRendering, "innerShowRendering");
            p013kotlin.jvm.internal.s.k(outerRendering, "outerRendering");
            p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
            if (!outerRendering.getShadow()) {
                e.c(view, outerRendering.b());
            }
            innerShowRendering.invoke(outerRendering.d(), viewEnvironment);
            if (outerRendering.getShadow()) {
                e.c(view, outerRendering.b());
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ jn0.h0 invoke(View view, wn0.p<? super Object, ? super ViewEnvironment, ? extends jn0.h0> pVar, d<?> dVar, ViewEnvironment viewEnvironment) {
            a(view, pVar, dVar, viewEnvironment);
            return jn0.h0.f84049a;
        }
    }

    public d(W wrapped, boolean z11, wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(wrapped, "wrapped");
        this.wrapped = wrapped;
        this.shadow = z11;
        this.onBackPressed = aVar;
        this.viewFactory = new i(o0.b(d.class), a.f126c, null, b.f127c, 4, null);
    }

    @Override // a30.b
    public c0<d<?>> a() {
        return this.viewFactory;
    }

    public final wn0.a<jn0.h0> b() {
        return this.onBackPressed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShadow() {
        return this.shadow;
    }

    public final W d() {
        return this.wrapped;
    }

    public /* synthetic */ d(Object obj, boolean z11, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : aVar);
    }
}
