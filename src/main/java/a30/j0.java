package a30;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\n\u0010B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00028\u00008 X¡\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00028\u0000`\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"La30/j0;", "", "RenderingT", "<init>", "()V", "c", "()Ljava/lang/Object;", "getShowing$annotations", "showing", "La30/a0;", "a", "()La30/a0;", AnalyticsAttribute.Environment, "Lkotlin/Function2;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "b", "()Lwn0/p;", "showRendering", "La30/j0$a;", "La30/j0$b;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class j0<RenderingT> {

    /* JADX INFO: renamed from: a30.j0$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B;\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00028\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"La30/j0$b;", "", "RenderingT", "La30/j0;", "showing", "La30/a0;", AnalyticsAttribute.Environment, "Lkotlin/Function2;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "<init>", "(Ljava/lang/Object;La30/a0;Lwn0/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "b", "La30/a0;", "()La30/a0;", "c", "Lwn0/p;", "()Lwn0/p;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Started<RenderingT> extends j0<RenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final RenderingT showing;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ViewEnvironment environment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final wn0.p<RenderingT, ViewEnvironment, jn0.h0> showRendering;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Started(RenderingT showing, ViewEnvironment environment, wn0.p<? super RenderingT, ? super ViewEnvironment, jn0.h0> showRendering) {
            super(null);
            p013kotlin.jvm.internal.s.k(showing, "showing");
            p013kotlin.jvm.internal.s.k(environment, "environment");
            p013kotlin.jvm.internal.s.k(showRendering, "showRendering");
            this.showing = showing;
            this.environment = environment;
            this.showRendering = showRendering;
        }

        @Override // a30.j0
        /* JADX INFO: renamed from: a, reason: from getter */
        public ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override // a30.j0
        public wn0.p<RenderingT, ViewEnvironment, jn0.h0> b() {
            return this.showRendering;
        }

        @Override // a30.j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public RenderingT c() {
            return this.showing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Started)) {
                return false;
            }
            Started started = (Started) other;
            return p013kotlin.jvm.internal.s.f(c(), started.c()) && p013kotlin.jvm.internal.s.f(getEnvironment(), started.getEnvironment()) && p013kotlin.jvm.internal.s.f(b(), started.b());
        }

        public int hashCode() {
            return (((c().hashCode() * 31) + getEnvironment().hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "Started(showing=" + c() + ", environment=" + getEnvironment() + ", showRendering=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ j0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract ViewEnvironment getEnvironment();

    public abstract wn0.p<RenderingT, ViewEnvironment, jn0.h0> b();

    public abstract RenderingT c();

    /* JADX INFO: renamed from: a30.j0$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003BQ\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00028\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"La30/j0$a;", "", "RenderingT", "La30/j0;", "showing", "La30/a0;", AnalyticsAttribute.Environment, "Lkotlin/Function2;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "Lkotlin/Function1;", "Landroid/view/View;", "starter", "<init>", "(Ljava/lang/Object;La30/a0;Lwn0/p;Lwn0/l;)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;La30/a0;Lwn0/p;Lwn0/l;)La30/j0$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "b", "La30/a0;", "()La30/a0;", "c", "Lwn0/p;", "()Lwn0/p;", "Lwn0/l;", "g", "()Lwn0/l;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class New<RenderingT> extends j0<RenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final RenderingT showing;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ViewEnvironment environment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final wn0.p<RenderingT, ViewEnvironment, jn0.h0> showRendering;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.l<View, jn0.h0> starter;

        /* JADX INFO: renamed from: a30.j0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000\"\n\b\u0001\u0010\u0001 \u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "RenderingT", "Landroid/view/View;", "view", "Ljn0/h0;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 6, 0})
        static final class C0013a extends p013kotlin.jvm.internal.u implements wn0.l<View, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0013a f173c = new C0013a();

            C0013a() {
                super(1);
            }

            public final void a(View view) {
                p013kotlin.jvm.internal.s.k(view, "view");
                j0<?> j0VarD = k0.d(view);
                Object objC = j0VarD == null ? null : j0VarD.c();
                Object obj = objC != null ? objC : null;
                p013kotlin.jvm.internal.s.h(obj);
                ViewEnvironment viewEnvironmentC = g0.c(view);
                p013kotlin.jvm.internal.s.h(viewEnvironmentC);
                g0.g(view, obj, viewEnvironmentC);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(View view) {
                a(view);
                return jn0.h0.f84049a;
            }
        }

        public /* synthetic */ New(Object obj, ViewEnvironment viewEnvironment, wn0.p pVar, wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, pVar, (i11 & 8) != 0 ? C0013a.f173c : lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ New e(New r11, Object obj, ViewEnvironment viewEnvironment, wn0.p pVar, wn0.l lVar, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = r11.c();
            }
            if ((i11 & 2) != 0) {
                viewEnvironment = r11.getEnvironment();
            }
            if ((i11 & 4) != 0) {
                pVar = r11.b();
            }
            if ((i11 & 8) != 0) {
                lVar = r11.starter;
            }
            return r11.d(obj, viewEnvironment, pVar, lVar);
        }

        @Override // a30.j0
        /* JADX INFO: renamed from: a, reason: from getter */
        public ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override // a30.j0
        public wn0.p<RenderingT, ViewEnvironment, jn0.h0> b() {
            return this.showRendering;
        }

        public final New<RenderingT> d(RenderingT showing, ViewEnvironment environment, wn0.p<? super RenderingT, ? super ViewEnvironment, jn0.h0> showRendering, wn0.l<? super View, jn0.h0> starter) {
            p013kotlin.jvm.internal.s.k(showing, "showing");
            p013kotlin.jvm.internal.s.k(environment, "environment");
            p013kotlin.jvm.internal.s.k(showRendering, "showRendering");
            p013kotlin.jvm.internal.s.k(starter, "starter");
            return new New<>(showing, environment, showRendering, starter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r11 = (New) other;
            return p013kotlin.jvm.internal.s.f(c(), r11.c()) && p013kotlin.jvm.internal.s.f(getEnvironment(), r11.getEnvironment()) && p013kotlin.jvm.internal.s.f(b(), r11.b()) && p013kotlin.jvm.internal.s.f(this.starter, r11.starter);
        }

        @Override // a30.j0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public RenderingT c() {
            return this.showing;
        }

        public final wn0.l<View, jn0.h0> g() {
            return this.starter;
        }

        public int hashCode() {
            return (((((c().hashCode() * 31) + getEnvironment().hashCode()) * 31) + b().hashCode()) * 31) + this.starter.hashCode();
        }

        public String toString() {
            return "New(showing=" + c() + ", environment=" + getEnvironment() + ", showRendering=" + b() + ", starter=" + this.starter + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public New(RenderingT showing, ViewEnvironment environment, wn0.p<? super RenderingT, ? super ViewEnvironment, jn0.h0> showRendering, wn0.l<? super View, jn0.h0> starter) {
            super(null);
            p013kotlin.jvm.internal.s.k(showing, "showing");
            p013kotlin.jvm.internal.s.k(environment, "environment");
            p013kotlin.jvm.internal.s.k(showRendering, "showRendering");
            p013kotlin.jvm.internal.s.k(starter, "starter");
            this.showing = showing;
            this.environment = environment;
            this.showRendering = showRendering;
            this.starter = starter;
        }
    }

    private j0() {
    }
}
