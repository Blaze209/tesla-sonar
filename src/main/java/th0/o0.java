package th0;

import a30.ViewEnvironment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bg0.CameraChoices;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.camera.CameraError;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lth0/o0;", "La30/c0;", "Lth0/d6$d$c;", "Lzf0/s;", "cameraPreview", "Lzf0/r0;", "selfieDirectionFeed", "<init>", "(Lzf0/s;Lzf0/r0;)V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "(Lth0/d6$d$c;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lzf0/s;", "c", "Lzf0/r0;", "Lco0/d;", "getType", "()Lco0/d;", "type", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 implements a30.c0<d6.d.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a30.f<d6.d.c> f114056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zf0.s cameraPreview;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zf0.r0 selfieDirectionFeed;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.p<d6.d.c, ViewEnvironment, jn0.h0> {
        a(Object obj) {
            super(2, obj, m0.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void a(d6.d.c p11, ViewEnvironment p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            ((m0) this.receiver).a(p11, p12);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(d6.d.c cVar, ViewEnvironment viewEnvironment) {
            a(cVar, viewEnvironment);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"th0/o0$b", "Lzf0/x;", "Ljn0/h0;", "a", "()V", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements zf0.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ uh0.a f114059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zf0.s f114060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zf0.r0 f114061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d6.d.c f114062d;

        b(uh0.a aVar, zf0.s sVar, zf0.r0 r0Var, d6.d.c cVar) {
            this.f114059a = aVar;
            this.f114060b = sVar;
            this.f114061c = r0Var;
            this.f114062d = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 c(d6.d.c cVar, CameraError it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            cVar.h().invoke(it);
            return jn0.h0.f84049a;
        }

        @Override // zf0.x
        public void a() {
            PreviewView previewviewSelfieCamera = this.f114059a.f116217k;
            p013kotlin.jvm.internal.s.j(previewviewSelfieCamera, "previewviewSelfieCamera");
            zf0.s.a aVar = zf0.s.a.FRONT;
            zf0.s sVar = this.f114060b;
            zf0.r0 r0Var = this.f114061c;
            final d6.d.c cVar = this.f114062d;
            sVar.f(previewviewSelfieCamera, aVar, r0Var, true, new wn0.l() { // from class: th0.p0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return o0.b.c(cVar, (CameraError) obj);
                }
            });
        }
    }

    public o0(final zf0.s cameraPreview, final zf0.r0 selfieDirectionFeed) {
        p013kotlin.jvm.internal.s.k(cameraPreview, "cameraPreview");
        p013kotlin.jvm.internal.s.k(selfieDirectionFeed, "selfieDirectionFeed");
        this.f114056a = new a30.f<>(p013kotlin.jvm.internal.o0.b(d6.d.c.class), new wn0.r() { // from class: th0.n0
            @Override // wn0.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return o0.c(selfieDirectionFeed, cameraPreview, (d6.d.c) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View c(zf0.r0 r0Var, zf0.s sVar, d6.d.c initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        zf0.r0 r0Var2;
        zf0.i iVarA;
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        uh0.a aVarC = uh0.a.c(LayoutInflater.from(context2).cloneInContext(context));
        if (initialRendering.getVideoCaptureMethod() != fg0.a.None) {
            Context applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            CameraChoices cameraChoicesB = bg0.h.b(applicationContext, bg0.k.FRONT);
            if (cameraChoicesB == null) {
                initialRendering.h().invoke(new NoSuitableCameraError());
                Camera2PreviewView camera2Preview = aVarC.f116209c;
                p013kotlin.jvm.internal.s.j(camera2Preview, "camera2Preview");
                iVarA = new zf0.p0(camera2Preview);
                r0Var2 = r0Var;
            } else {
                bg0.e.a aVarB = initialRendering.getCamera2ManagerFactoryFactory();
                Camera2PreviewView camera2Preview2 = aVarC.f116209c;
                p013kotlin.jvm.internal.s.j(camera2Preview2, "camera2Preview");
                r0Var2 = r0Var;
                iVarA = new com.withpersona.sdk2.camera.camera2.a(aVarB.a(cameraChoicesB, camera2Preview2, r0Var2, fg0.a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired()));
            }
        } else {
            r0Var2 = r0Var;
            zf0.y.a aVarC2 = initialRendering.getCameraXControllerFactory();
            PreviewView previewviewSelfieCamera = aVarC.f116217k;
            p013kotlin.jvm.internal.s.j(previewviewSelfieCamera, "previewviewSelfieCamera");
            iVarA = aVarC2.a(sVar, previewviewSelfieCamera, new b(aVarC, sVar, r0Var2, initialRendering));
        }
        ConstraintLayout constraintLayoutB = aVarC.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        p013kotlin.jvm.internal.s.h(aVarC);
        a30.g0.a(constraintLayoutB, initialRendering, initialViewEnvironment, new a(new m0(aVarC, iVarA, r0Var2)));
        ConstraintLayout constraintLayoutB2 = aVarC.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB2, "let(...)");
        return constraintLayoutB2;
    }

    @Override // a30.c0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(d6.d.c initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
        return this.f114056a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // a30.c0
    public co0.d<? super d6.d.c> getType() {
        return this.f114056a.getType();
    }
}
