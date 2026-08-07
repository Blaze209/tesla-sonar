package pg0;

import a30.ViewEnvironment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import bg0.CameraChoices;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lpg0/i0;", "La30/c0;", "Lpg0/g5$b;", "Lzf0/e0;", "governmentIdFeed", "Lzf0/s;", "cameraPreview", "<init>", "(Lzf0/e0;Lzf0/s;)V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "(Lpg0/g5$b;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lzf0/e0;", "c", "Lzf0/s;", "Lco0/d;", "getType", "()Lco0/d;", "type", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 implements a30.c0<g5.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a30.f<g5.b> f102538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zf0.e0 governmentIdFeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zf0.s cameraPreview;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.p<g5.b, ViewEnvironment, jn0.h0> {
        a(Object obj) {
            super(2, obj, o.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void a(g5.b p11, ViewEnvironment p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            ((o) this.receiver).a(p11, p12);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g5.b bVar, ViewEnvironment viewEnvironment) {
            a(bVar, viewEnvironment);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pg0/i0$b", "Lzf0/x;", "Ljn0/h0;", "a", "()V", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements zf0.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tg0.b f102541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g5.b f102542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zf0.s f102543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zf0.e0 f102544d;

        b(tg0.b bVar, g5.b bVar2, zf0.s sVar, zf0.e0 e0Var) {
            this.f102541a = bVar;
            this.f102542b = bVar2;
            this.f102543c = sVar;
            this.f102544d = e0Var;
        }

        @Override // zf0.x
        public void a() {
            PreviewView previewView = this.f102541a.f113439y;
            p013kotlin.jvm.internal.s.j(previewView, "previewView");
            this.f102543c.f(previewView, zf0.s.a.BACK, this.f102544d, true, this.f102542b.x());
        }
    }

    public i0(final zf0.e0 governmentIdFeed, final zf0.s cameraPreview) {
        p013kotlin.jvm.internal.s.k(governmentIdFeed, "governmentIdFeed");
        p013kotlin.jvm.internal.s.k(cameraPreview, "cameraPreview");
        this.f102538a = new a30.f<>(p013kotlin.jvm.internal.o0.b(g5.b.class), new wn0.r() { // from class: pg0.h0
            @Override // wn0.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.c(governmentIdFeed, cameraPreview, (g5.b) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.governmentIdFeed = governmentIdFeed;
        this.cameraPreview = cameraPreview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View c(zf0.e0 e0Var, zf0.s sVar, g5.b initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        zf0.e0 e0Var2;
        zf0.i aVar;
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        tg0.b bVarC = tg0.b.c(LayoutInflater.from(context2).cloneInContext(context));
        if (initialRendering.getVideoCaptureMethod() == fg0.a.Upload || initialRendering.getVideoCaptureMethod() == fg0.a.Stream) {
            Context applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            CameraChoices jVarB = bg0.h.b(applicationContext, bg0.k.BACK);
            if (jVarB == null) {
                initialRendering.x().invoke(new NoSuitableCameraError());
                Camera2PreviewView camera2Preview = bVarC.f113417c;
                p013kotlin.jvm.internal.s.j(camera2Preview, "camera2Preview");
                e0Var2 = e0Var;
                aVar = new zf0.p0(camera2Preview);
            } else {
                bg0.e.a camera2ManagerFactoryFactory = initialRendering.getCamera2ManagerFactoryFactory();
                Camera2PreviewView camera2Preview2 = bVarC.f113417c;
                p013kotlin.jvm.internal.s.j(camera2Preview2, "camera2Preview");
                e0Var2 = e0Var;
                aVar = new com.withpersona.sdk2.camera.camera2.a(camera2ManagerFactoryFactory.a(jVarB, camera2Preview2, e0Var2, initialRendering.getVideoCaptureMethod(), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired()));
            }
        } else {
            zf0.y.a cameraXControllerFactory = initialRendering.getCameraXControllerFactory();
            PreviewView previewView = bVarC.f113439y;
            p013kotlin.jvm.internal.s.j(previewView, "previewView");
            aVar = cameraXControllerFactory.a(sVar, previewView, new b(bVarC, initialRendering, sVar, e0Var));
            e0Var2 = e0Var;
        }
        FrameLayout frameLayoutB = bVarC.getRoot();
        p013kotlin.jvm.internal.s.j(frameLayoutB, "getRoot(...)");
        p013kotlin.jvm.internal.s.h(bVarC);
        a30.g0.a(frameLayoutB, initialRendering, initialViewEnvironment, new a(new o(bVarC, aVar, e0Var2)));
        FrameLayout frameLayoutB2 = bVarC.getRoot();
        p013kotlin.jvm.internal.s.j(frameLayoutB2, "let(...)");
        return frameLayoutB2;
    }

    @Override // a30.c0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(g5.b initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
        return this.f102538a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // a30.c0
    public co0.d<? super g5.b> getType() {
        return this.f102538a.getType();
    }
}
