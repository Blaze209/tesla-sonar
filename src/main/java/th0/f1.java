package th0;

import a30.ViewEnvironment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lth0/f1;", "La30/c0;", "Lth0/d6$d$a;", "Lzf0/s;", "cameraPreview", "Lzf0/r0;", "selfieDirectionFeed", "<init>", "(Lzf0/s;Lzf0/r0;)V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "(Lth0/d6$d$a;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lzf0/s;", "c", "Lzf0/r0;", "Lco0/d;", "getType", "()Lco0/d;", "type", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 implements a30.c0<d6.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a30.f<d6.d.a> f113884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zf0.s cameraPreview;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zf0.r0 selfieDirectionFeed;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.p<d6.d.a, ViewEnvironment, jn0.h0> {
        a(Object obj) {
            super(2, obj, w.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void a(d6.d.a p11, ViewEnvironment p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            ((w) this.receiver).a(p11, p12);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(d6.d.a aVar, ViewEnvironment viewEnvironment) {
            a(aVar, viewEnvironment);
            return jn0.h0.f84049a;
        }
    }

    public f1(final zf0.s cameraPreview, final zf0.r0 selfieDirectionFeed) {
        p013kotlin.jvm.internal.s.k(cameraPreview, "cameraPreview");
        p013kotlin.jvm.internal.s.k(selfieDirectionFeed, "selfieDirectionFeed");
        this.f113884a = new a30.f<>(p013kotlin.jvm.internal.o0.b(d6.d.a.class), new wn0.r() { // from class: th0.e1
            @Override // wn0.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return f1.c(cameraPreview, selfieDirectionFeed, (d6.d.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View c(zf0.s sVar, zf0.r0 r0Var, d6.d.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        uh0.c cVarC = uh0.c.c(LayoutInflater.from(context2).cloneInContext(context));
        ji0.c.a(initialViewEnvironment, androidx.core.content.b.getColor(cVarC.getRoot().getContext(), t0.f114147a));
        ConstraintLayout constraintLayoutB = cVarC.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        p013kotlin.jvm.internal.s.h(cVarC);
        a30.g0.a(constraintLayoutB, initialRendering, initialViewEnvironment, new a(new w(cVarC, sVar, r0Var)));
        ConstraintLayout constraintLayoutB2 = cVarC.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB2, "let(...)");
        return constraintLayoutB2;
    }

    @Override // a30.c0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(d6.d.a initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
        return this.f113884a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // a30.c0
    public co0.d<? super d6.d.a> getType() {
        return this.f113884a.getType();
    }
}
