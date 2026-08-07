package k0;

import c0.r0;
import c0.y0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\rB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lk0/h;", "Lc0/r0$i;", "screenFlash", "<init>", "(Lc0/r0$i;)V", "Ljn0/h0;", "e", "()V", DateTokenConverter.CONVERTER_KEY, "", "expirationTimeMillis", "Lc0/r0$j;", "screenFlashListener", "a", "(JLc0/r0$j;)V", "clear", "h", "()Lc0/r0$i;", "f", "Lc0/r0$i;", "Ljava/lang/Object;", "b", "Ljava/lang/Object;", "lock", "", "c", "Z", "isClearScreenFlashPending", "Lc0/r0$j;", "pendingListener", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements r0.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r0.i screenFlash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isClearScreenFlashPending;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private r0.j pendingListener;

    /* JADX INFO: renamed from: k0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk0/h$a;", "", "<init>", "()V", "Lc0/r0$i;", "screenFlash", "Lk0/h;", "a", "(Lc0/r0$i;)Lk0/h;", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(r0.i screenFlash) {
            return new h(screenFlash, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ h(r0.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(h this$0) {
        s.k(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                if (this$0.pendingListener == null) {
                    y0.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                this$0.e();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        h0 h0Var;
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    r0.i iVar = this.screenFlash;
                    if (iVar != null) {
                        iVar.clear();
                        h0Var = h0.f84049a;
                    } else {
                        h0Var = null;
                    }
                    if (h0Var == null) {
                        y0.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    y0.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                h0 h0Var2 = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e() {
        synchronized (this.lock) {
            try {
                r0.j jVar = this.pendingListener;
                if (jVar != null) {
                    jVar.a();
                }
                this.pendingListener = null;
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final h g(r0.i iVar) {
        return INSTANCE.a(iVar);
    }

    @Override // c0.r0.i
    public void a(long expirationTimeMillis, r0.j screenFlashListener) {
        h0 h0Var;
        s.k(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            h0 h0Var2 = h0.f84049a;
        }
        r0.i iVar = this.screenFlash;
        if (iVar != null) {
            iVar.a(expirationTimeMillis, new r0.j() { // from class: k0.g
                @Override // c0.r0.j
                public final void a() {
                    h.c(this.f84599a);
                }
            });
            h0Var = h0.f84049a;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            y0.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override // c0.r0.i
    public void clear() {
        d();
    }

    public final void f() {
        e();
        d();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final r0.i getScreenFlash() {
        return this.screenFlash;
    }

    private h(r0.i iVar) {
        this.screenFlash = iVar;
        this.lock = new Object();
    }
}
