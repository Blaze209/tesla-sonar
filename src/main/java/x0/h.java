package x0;

import android.content.Context;
import androidx.p003lifecycle.LifecycleOwner;
import c0.a2;
import c0.b2;
import c0.i;
import c0.o;
import c0.p;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import j0.n;
import java.util.Arrays;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#¨\u0006&"}, d2 = {"Lx0/h;", "", "Lx0/e;", "lifecycleCameraProvider", "<init>", "(Lx0/e;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/common/util/concurrent/s;", "Ljava/lang/Void;", "f", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/s;", "", "Lc0/a2;", "useCases", "Ljn0/h0;", "g", "([Lc0/a2;)V", "h", "()V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lc0/p;", "cameraSelector", "Lc0/i;", "e", "(Landroidx/lifecycle/LifecycleOwner;Lc0/p;[Lc0/a2;)Lc0/i;", "Lc0/b2;", "useCaseGroup", DateTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Lc0/p;Lc0/b2;)Lc0/i;", "a", "Lx0/e;", "", "Lc0/n;", "()Ljava/util/List;", "availableCameraInfos", "b", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f122511c = new h(new e());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e lifecycleCameraProvider;

    /* JADX INFO: renamed from: x0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx0/h$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/common/util/concurrent/s;", "Lx0/h;", "b", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/s;", "sAppInstance", "Lx0/h;", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: x0.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Lx0/h;", "a", "(Ljava/lang/Void;)Lx0/h;"}, k = 3, mv = {1, 8, 0})
        static final class C2632a extends u implements l<Void, h> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2632a f122513c = new C2632a();

            C2632a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h invoke(Void r11) {
                return h.f122511c;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h c(l tmp0, Object obj) {
            s.k(tmp0, "$tmp0");
            return (h) tmp0.invoke(obj);
        }

        public final com.google.common.util.concurrent.s<h> b(Context context) {
            s.k(context, "context");
            u5.h.g(context);
            com.google.common.util.concurrent.s sVarF = h.f122511c.f(context);
            final C2632a c2632a = C2632a.f122513c;
            com.google.common.util.concurrent.s<h> sVarX = n.x(sVarF, new r.a() { // from class: x0.g
                @Override // r.a
                public final Object apply(Object obj) {
                    return h.Companion.c(c2632a, obj);
                }
            }, i0.c.b());
            s.j(sVarX, "transform(\n             …tExecutor()\n            )");
            return sVarX;
        }

        private Companion() {
        }
    }

    private h(e eVar) {
        this.lifecycleCameraProvider = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.common.util.concurrent.s<Void> f(Context context) {
        return this.lifecycleCameraProvider.w(context, null);
    }

    @Override // c0.o
    public List<c0.n> a() {
        return this.lifecycleCameraProvider.a();
    }

    public i d(LifecycleOwner lifecycleOwner, p cameraSelector, b2 useCaseGroup) {
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(cameraSelector, "cameraSelector");
        s.k(useCaseGroup, "useCaseGroup");
        return this.lifecycleCameraProvider.q(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    public i e(LifecycleOwner lifecycleOwner, p cameraSelector, a2... useCases) {
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(cameraSelector, "cameraSelector");
        s.k(useCases, "useCases");
        return this.lifecycleCameraProvider.r(lifecycleOwner, cameraSelector, (a2[]) Arrays.copyOf(useCases, useCases.length));
    }

    public void g(a2... useCases) {
        s.k(useCases, "useCases");
        this.lifecycleCameraProvider.B((a2[]) Arrays.copyOf(useCases, useCases.length));
    }

    public void h() {
        this.lifecycleCameraProvider.C();
    }
}
