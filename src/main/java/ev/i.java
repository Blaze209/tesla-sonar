package ev;

import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.ExecutorService;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lev/i;", "", "Ljava/util/concurrent/ExecutorService;", "backgroundExecutorService", "blockingExecutorService", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "Lev/e;", "a", "Lev/e;", "common", "b", "diskWrite", "c", "dataCollect", DateTokenConverter.CONVERTER_KEY, "network", "e", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f63229f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final e common;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e diskWrite;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final e dataCollect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final e network;

    /* JADX INFO: renamed from: ev.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lev/i$a;", "", "<init>", "()V", "", "r", "()Z", "q", "p", "Lkotlin/Function0;", "isCorrectThread", "", "failureMessage", "Ljn0/h0;", "m", "(Lwn0/a;Lwn0/a;)V", "k", IntegerTokenConverter.CONVERTER_KEY, "g", "kotlin.jvm.PlatformType", "o", "()Ljava/lang/String;", "threadName", "enforcement", "Z", "n", "s", "(Z)V", "getEnforcement$annotations", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ev.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C1298a extends p implements wn0.a<Boolean> {
            C1298a(Object obj) {
                super(0, obj, Companion.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).p());
            }
        }

        /* JADX INFO: renamed from: ev.i$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p implements wn0.a<Boolean> {
            b(Object obj) {
                super(0, obj, Companion.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).q());
            }
        }

        /* JADX INFO: renamed from: ev.i$a$c */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class c extends p implements wn0.a<Boolean> {
            c(Object obj) {
                super(0, obj, Companion.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).r());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h() {
            return "Must be called on a background thread, was called on " + i.INSTANCE.o() + CoreConstants.DOT;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j() {
            return "Must be called on a blocking thread, was called on " + i.INSTANCE.o() + CoreConstants.DOT;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l() {
            return "Must not be called on a main thread, was called on " + i.INSTANCE.o() + CoreConstants.DOT;
        }

        private final void m(wn0.a<Boolean> isCorrectThread, wn0.a<String> failureMessage) {
            if (isCorrectThread.invoke().booleanValue()) {
                return;
            }
            bv.g.f().b(failureMessage.invoke());
            n();
        }

        private final String o() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p() {
            String strO = o();
            s.j(strO, "<get-threadName>(...)");
            return t.h0(strO, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q() {
            String strO = o();
            s.j(strO, "<get-threadName>(...)");
            return t.h0(strO, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void g() {
            m(new C1298a(this), new wn0.a() { // from class: ev.f
                @Override // wn0.a
                public final Object invoke() {
                    return i.Companion.h();
                }
            });
        }

        public final void i() {
            m(new b(this), new wn0.a() { // from class: ev.h
                @Override // wn0.a
                public final Object invoke() {
                    return i.Companion.j();
                }
            });
        }

        public final void k() {
            m(new c(this), new wn0.a() { // from class: ev.g
                @Override // wn0.a
                public final Object invoke() {
                    return i.Companion.l();
                }
            });
        }

        public final boolean n() {
            return i.f63229f;
        }

        public final void s(boolean z11) {
            i.f63229f = z11;
        }

        private Companion() {
        }
    }

    public i(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        s.k(backgroundExecutorService, "backgroundExecutorService");
        s.k(blockingExecutorService, "blockingExecutorService");
        this.common = new e(backgroundExecutorService);
        this.diskWrite = new e(backgroundExecutorService);
        this.dataCollect = new e(backgroundExecutorService);
        this.network = new e(blockingExecutorService);
    }

    public static final void c() {
        INSTANCE.g();
    }

    public static final void d() {
        INSTANCE.i();
    }

    public static final void e() {
        INSTANCE.k();
    }

    public static final void f(boolean z11) {
        INSTANCE.s(z11);
    }
}
