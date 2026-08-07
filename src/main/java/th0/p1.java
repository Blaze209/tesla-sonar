package th0;

import a30.ViewEnvironment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"Lth0/p1;", "La30/k;", "Lth0/d6$d$d;", "Luh0/d;", "binding", "<init>", "(Luh0/d;)V", "rendering", "La30/a0;", "viewEnvironment", "Ljn0/h0;", "b", "(Lth0/d6$d$d;La30/a0;)V", "Luh0/d;", "c", "a", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p1 implements a30.k<d6.d.C2432d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uh0.d binding;

    /* JADX INFO: renamed from: th0.p1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lth0/p1$a;", "La30/c0;", "Lth0/d6$d$d;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lth0/d6$d$d;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements a30.c0<d6.d.C2432d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.c0<d6.d.C2432d> f114079a;

        /* JADX INFO: renamed from: th0.p1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C2434a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, uh0.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2434a f114080a = new C2434a();

            C2434a() {
                super(3, uh0.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;", 0);
            }

            public final uh0.d a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return uh0.d.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ uh0.d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: th0.p1$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<uh0.d, p1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f114081a = new b();

            b() {
                super(1, p1.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p1 invoke(uh0.d p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new p1(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(d6.d.C2432d initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f114079a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super d6.d.C2432d> getType() {
            return this.f114079a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f114079a = new a30.z(p013kotlin.jvm.internal.o0.b(d6.d.C2432d.class), C2434a.f114080a, b.f114081a);
        }
    }

    public p1(uh0.d binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
    }

    @Override // a30.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(d6.d.C2432d rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        rendering.a().invoke();
    }
}
