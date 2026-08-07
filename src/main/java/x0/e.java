package x0;

import android.content.Context;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.e0;
import androidx.camera.core.impl.f0;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.k1;
import androidx.camera.core.impl.v2;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.p003lifecycle.LifecycleOwner;
import c0.a2;
import c0.b2;
import c0.c2;
import c0.i;
import c0.j;
import c0.m;
import c0.o;
import c0.p;
import c0.w;
import c0.x;
import c0.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.common.util.concurrent.s;
import h0.r;
import j0.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.t0;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 Z2\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0000¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u00020%2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0017¢\u0006\u0004\b,\u0010\u0003J7\u0010-\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010A\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010\"0\"0!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010=R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N0L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010S\u001a\u00020R2\u0006\u0010S\u001a\u00020R8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010X¨\u0006["}, d2 = {"Lx0/e;", "", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lc0/p;", "primaryCameraSelector", "secondaryCameraSelector", "Lc0/z;", "primaryCompositionSettings", "secondaryCompositionSettings", "Lc0/c2;", "viewPort", "", "Lc0/j;", "effects", "", "Lc0/a2;", "useCases", "Lc0/i;", "p", "(Landroidx/lifecycle/LifecycleOwner;Lc0/p;Lc0/p;Lc0/z;Lc0/z;Lc0/c2;Ljava/util/List;[Lc0/a2;)Lc0/i;", "cameraSelector", "Lc0/n;", "cameraInfo", "Landroidx/camera/core/impl/b0;", "t", "(Lc0/p;Lc0/n;)Landroidx/camera/core/impl/b0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lc0/x;", "cameraXConfig", "Lcom/google/common/util/concurrent/s;", "Ljava/lang/Void;", "w", "(Landroid/content/Context;Lc0/x;)Lcom/google/common/util/concurrent/s;", "Ljn0/h0;", "s", "(Lc0/x;)V", "z", "()Lcom/google/common/util/concurrent/s;", "B", "([Lc0/a2;)V", "C", "r", "(Landroidx/lifecycle/LifecycleOwner;Lc0/p;[Lc0/a2;)Lc0/i;", "Lc0/b2;", "useCaseGroup", "q", "(Landroidx/lifecycle/LifecycleOwner;Lc0/p;Lc0/b2;)Lc0/i;", "u", "(Lc0/p;)Lc0/n;", "a", "Ljava/lang/Object;", "lock", "Lc0/x$b;", "b", "Lc0/x$b;", "cameraXConfigProvider", "c", "Lcom/google/common/util/concurrent/s;", "cameraXInitializeFuture", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "cameraXShutdownFuture", "Lx0/f;", "e", "Lx0/f;", "lifecycleCameraRepository", "Lc0/w;", "f", "Lc0/w;", "cameraX", "g", "Landroid/content/Context;", "", "Landroidx/camera/core/internal/CameraUseCaseAdapter$a;", "Landroidx/camera/core/impl/v2;", "h", "Ljava/util/Map;", "cameraInfoMap", "", "cameraOperatingMode", "v", "()I", "y", "(I)V", "()Ljava/util/List;", "availableCameraInfos", IntegerTokenConverter.CONVERTER_KEY, "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private x.b cameraXConfigProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private s<Void> cameraXInitializeFuture;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private s<Void> cameraXShutdownFuture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f lifecycleCameraRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private w cameraX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<CameraUseCaseAdapter.a, v2> cameraInfoMap;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc0/x;", "getCameraXConfig", "()Lc0/x;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f122495a;

        b(x xVar) {
            this.f122495a = xVar;
        }

        @Override // c0.x.b
        public final x getCameraXConfig() {
            return this.f122495a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"x0/e$c", "Lj0/c;", "Ljava/lang/Void;", "void", "Ljn0/h0;", "a", "(Ljava/lang/Void;)V", "", "t", "onFailure", "(Ljava/lang/Throwable;)V", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements j0.c<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f122497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f122498c;

        c(w wVar, Context context) {
            this.f122497b = wVar;
            this.f122498c = context;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            e.this.cameraX = this.f122497b;
            e.this.context = h0.f.a(this.f122498c);
        }

        @Override // j0.c
        public void onFailure(Throwable t11) {
            p013kotlin.jvm.internal.s.k(t11, "t");
            e.this.z();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00000\u00000\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "it", "Lcom/google/common/util/concurrent/s;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Void;)Lcom/google/common/util/concurrent/s;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<Void, s<Void>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f122499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(w wVar) {
            super(1);
            this.f122499c = wVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s<Void> invoke(Void r11) {
            return this.f122499c.l();
        }
    }

    public e() {
        s<Void> sVarP = n.p(null);
        p013kotlin.jvm.internal.s.j(sVarP, "immediateFuture<Void>(null)");
        this.cameraXShutdownFuture = sVarP;
        f fVarD = f.d();
        p013kotlin.jvm.internal.s.j(fVarD, "getInstance()");
        this.lifecycleCameraRepository = fVarD;
        this.cameraInfoMap = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(e this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.C();
        this$0.lifecycleCameraRepository.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i p(LifecycleOwner lifecycleOwner, p primaryCameraSelector, p secondaryCameraSelector, z primaryCompositionSettings, z secondaryCompositionSettings, c2 viewPort, List<? extends j> effects, a2... useCases) {
        j0 j0Var;
        v2 v2Var;
        eb.a.c("CX:bindToLifecycle-internal");
        try {
            r.b();
            w wVar = this.cameraX;
            p013kotlin.jvm.internal.s.h(wVar);
            j0 j0VarE = primaryCameraSelector.e(wVar.i().d());
            p013kotlin.jvm.internal.s.j(j0VarE, "primaryCameraSelector.se…cameraRepository.cameras)");
            j0VarE.i(true);
            c0.n nVarU = u(primaryCameraSelector);
            p013kotlin.jvm.internal.s.i(nVarU, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            v2 v2Var2 = (v2) nVarU;
            if (secondaryCameraSelector != null) {
                w wVar2 = this.cameraX;
                p013kotlin.jvm.internal.s.h(wVar2);
                j0 j0VarE2 = secondaryCameraSelector.e(wVar2.i().d());
                j0VarE2.i(false);
                c0.n nVarU2 = u(secondaryCameraSelector);
                p013kotlin.jvm.internal.s.i(nVarU2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                j0Var = j0VarE2;
                v2Var = (v2) nVarU2;
            } else {
                j0Var = null;
                v2Var = null;
            }
            x0.b bVarE = this.lifecycleCameraRepository.e(lifecycleOwner, CameraUseCaseAdapter.B(v2Var2, v2Var));
            Collection<x0.b> collectionG = this.lifecycleCameraRepository.g();
            for (a2 a2Var : p013kotlin.collections.n.h0(useCases)) {
                for (x0.b lifecycleCameras : collectionG) {
                    p013kotlin.jvm.internal.s.j(lifecycleCameras, "lifecycleCameras");
                    x0.b bVar = lifecycleCameras;
                    if (bVar.s(a2Var) && !p013kotlin.jvm.internal.s.f(bVar, bVarE)) {
                        t0 t0Var = t0.f86535a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{a2Var}, 1));
                        p013kotlin.jvm.internal.s.j(str, "format(format, *args)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (bVarE == null) {
                f fVar = this.lifecycleCameraRepository;
                w wVar3 = this.cameraX;
                p013kotlin.jvm.internal.s.h(wVar3);
                d0.a aVarC = wVar3.h().c();
                w wVar4 = this.cameraX;
                p013kotlin.jvm.internal.s.h(wVar4);
                f0 f0VarG = wVar4.g();
                w wVar5 = this.cameraX;
                p013kotlin.jvm.internal.s.h(wVar5);
                bVarE = fVar.c(lifecycleOwner, new CameraUseCaseAdapter(j0VarE, j0Var, v2Var2, v2Var, primaryCompositionSettings, secondaryCompositionSettings, aVarC, f0VarG, wVar5.k()));
            }
            x0.b bVar2 = bVarE;
            if (useCases.length == 0) {
                p013kotlin.jvm.internal.s.h(bVar2);
            } else {
                f fVar2 = this.lifecycleCameraRepository;
                p013kotlin.jvm.internal.s.h(bVar2);
                List listP = v.p(Arrays.copyOf(useCases, useCases.length));
                w wVar6 = this.cameraX;
                p013kotlin.jvm.internal.s.h(wVar6);
                fVar2.a(bVar2, viewPort, effects, listP, wVar6.h().c());
            }
            eb.a.f();
            return bVar2;
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 t(p cameraSelector, c0.n cameraInfo) {
        b0 b0Var = null;
        for (m mVar : cameraSelector.c()) {
            p013kotlin.jvm.internal.s.j(mVar, "cameraSelector.cameraFilterSet");
            m mVar2 = mVar;
            if (!p013kotlin.jvm.internal.s.f(mVar2.a(), m.f18365a)) {
                d0 d0VarB = k1.b(mVar2.a());
                Context context = this.context;
                p013kotlin.jvm.internal.s.h(context);
                b0 b0VarA = d0VarB.a(cameraInfo, context);
                if (b0VarA == null) {
                    continue;
                } else {
                    if (b0Var != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    b0Var = b0VarA;
                }
            }
        }
        return b0Var == null ? e0.a() : b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v() {
        w wVar = this.cameraX;
        if (wVar == null) {
            return 0;
        }
        p013kotlin.jvm.internal.s.h(wVar);
        return wVar.h().c().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s x(l tmp0, Object obj) {
        p013kotlin.jvm.internal.s.k(tmp0, "$tmp0");
        return (s) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i11) {
        w wVar = this.cameraX;
        if (wVar == null) {
            return;
        }
        p013kotlin.jvm.internal.s.h(wVar);
        wVar.h().c().d(i11);
    }

    public void B(a2... useCases) {
        p013kotlin.jvm.internal.s.k(useCases, "useCases");
        eb.a.c("CX:unbind");
        try {
            r.b();
            if (v() == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.lifecycleCameraRepository.m(v.p(Arrays.copyOf(useCases, useCases.length)));
            h0 h0Var = h0.f84049a;
            eb.a.f();
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public void C() {
        eb.a.c("CX:unbindAll");
        try {
            r.b();
            y(0);
            this.lifecycleCameraRepository.n();
            h0 h0Var = h0.f84049a;
        } finally {
            eb.a.f();
        }
    }

    @Override // c0.o
    public List<c0.n> a() {
        eb.a.c("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            w wVar = this.cameraX;
            p013kotlin.jvm.internal.s.h(wVar);
            LinkedHashSet<j0> linkedHashSetD = wVar.i().d();
            p013kotlin.jvm.internal.s.j(linkedHashSetD, "cameraX!!.cameraRepository.cameras");
            Iterator<j0> it = linkedHashSetD.iterator();
            while (it.hasNext()) {
                c0.n nVarC = it.next().c();
                p013kotlin.jvm.internal.s.j(nVarC, "camera.cameraInfo");
                arrayList.add(nVarC);
            }
            eb.a.f();
            return arrayList;
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public i q(LifecycleOwner lifecycleOwner, p cameraSelector, b2 useCaseGroup) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(cameraSelector, "cameraSelector");
        p013kotlin.jvm.internal.s.k(useCaseGroup, "useCaseGroup");
        eb.a.c("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (v() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            y(1);
            z DEFAULT = z.f18473d;
            p013kotlin.jvm.internal.s.j(DEFAULT, "DEFAULT");
            p013kotlin.jvm.internal.s.j(DEFAULT, "DEFAULT");
            c2 c2VarC = useCaseGroup.c();
            List<j> listA = useCaseGroup.a();
            p013kotlin.jvm.internal.s.j(listA, "useCaseGroup.effects");
            List<a2> listB = useCaseGroup.b();
            p013kotlin.jvm.internal.s.j(listB, "useCaseGroup.useCases");
            a2[] a2VarArr = (a2[]) listB.toArray(new a2[0]);
            i iVarP = p(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, c2VarC, listA, (a2[]) Arrays.copyOf(a2VarArr, a2VarArr.length));
            eb.a.f();
            return iVarP;
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public i r(LifecycleOwner lifecycleOwner, p cameraSelector, a2... useCases) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(cameraSelector, "cameraSelector");
        p013kotlin.jvm.internal.s.k(useCases, "useCases");
        eb.a.c("CX:bindToLifecycle");
        try {
            if (v() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            y(1);
            z DEFAULT = z.f18473d;
            p013kotlin.jvm.internal.s.j(DEFAULT, "DEFAULT");
            p013kotlin.jvm.internal.s.j(DEFAULT, "DEFAULT");
            i iVarP = p(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, null, v.m(), (a2[]) Arrays.copyOf(useCases, useCases.length));
            eb.a.f();
            return iVarP;
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public final void s(x cameraXConfig) {
        p013kotlin.jvm.internal.s.k(cameraXConfig, "cameraXConfig");
        eb.a.c("CX:configureInstanceInternal");
        try {
            synchronized (this.lock) {
                u5.h.g(cameraXConfig);
                u5.h.j(this.cameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                this.cameraXConfigProvider = new b(cameraXConfig);
                h0 h0Var = h0.f84049a;
            }
            eb.a.f();
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public c0.n u(p cameraSelector) {
        Object v2Var;
        p013kotlin.jvm.internal.s.k(cameraSelector, "cameraSelector");
        eb.a.c("CX:getCameraInfo");
        try {
            w wVar = this.cameraX;
            p013kotlin.jvm.internal.s.h(wVar);
            i0 i0VarE = cameraSelector.e(wVar.i().d()).e();
            p013kotlin.jvm.internal.s.j(i0VarE, "cameraSelector.select(ca…meras).cameraInfoInternal");
            b0 b0VarT = t(cameraSelector, i0VarE);
            CameraUseCaseAdapter.a aVarA = CameraUseCaseAdapter.a.a(i0VarE.d(), b0VarT.E());
            p013kotlin.jvm.internal.s.j(aVarA, "create(\n                …ilityId\n                )");
            synchronized (this.lock) {
                try {
                    v2Var = this.cameraInfoMap.get(aVarA);
                    if (v2Var == null) {
                        v2Var = new v2(i0VarE, b0VarT);
                        this.cameraInfoMap.put(aVarA, v2Var);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            v2 v2Var2 = (v2) v2Var;
            eb.a.f();
            return v2Var2;
        } catch (Throwable th3) {
            eb.a.f();
            throw th3;
        }
    }

    public final s<Void> w(Context context, x cameraXConfig) {
        p013kotlin.jvm.internal.s.k(context, "context");
        synchronized (this.lock) {
            s<Void> sVar = this.cameraXInitializeFuture;
            if (sVar != null) {
                p013kotlin.jvm.internal.s.i(sVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>");
                return sVar;
            }
            if (cameraXConfig != null) {
                s(cameraXConfig);
            }
            w wVar = new w(context, this.cameraXConfigProvider);
            j0.d dVarA = j0.d.a(this.cameraXShutdownFuture);
            final d dVar = new d(wVar);
            j0.d dVarF = dVarA.f(new j0.a() { // from class: x0.c
                @Override // j0.a
                public final s apply(Object obj) {
                    return e.x(dVar, obj);
                }
            }, i0.c.b());
            p013kotlin.jvm.internal.s.j(dVarF, "cameraX = CameraX(contex…ecutors.directExecutor())");
            this.cameraXInitializeFuture = dVarF;
            n.j(dVarF, new c(wVar, context), i0.c.b());
            s<Void> sVarS = n.s(dVarF);
            p013kotlin.jvm.internal.s.j(sVarS, "nonCancellationPropagating(initFuture)");
            return sVarS;
        }
    }

    public final s<Void> z() {
        s<Void> sVarP;
        r.f(new Runnable() { // from class: x0.d
            @Override // java.lang.Runnable
            public final void run() {
                e.A(this.f122485a);
            }
        });
        w wVar = this.cameraX;
        if (wVar != null) {
            p013kotlin.jvm.internal.s.h(wVar);
            wVar.h().c().shutdown();
        }
        w wVar2 = this.cameraX;
        if (wVar2 != null) {
            p013kotlin.jvm.internal.s.h(wVar2);
            sVarP = wVar2.q();
        } else {
            sVarP = n.p(null);
        }
        p013kotlin.jvm.internal.s.j(sVarP, "if (cameraX != null) cam…mediateFuture<Void>(null)");
        synchronized (this.lock) {
            this.cameraXConfigProvider = null;
            this.cameraXInitializeFuture = null;
            this.cameraXShutdownFuture = sVarP;
            this.cameraInfoMap.clear();
            h0 h0Var = h0.f84049a;
        }
        this.cameraX = null;
        this.context = null;
        return sVarP;
    }
}
