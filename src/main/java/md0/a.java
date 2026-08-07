package md0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.logging.g;
import ie0.r;
import io.sentry.ILogger;
import io.sentry.b7;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Lmd0/a;", "Lio/sentry/ILogger;", "<init>", "()V", "Lio/sentry/b7;", "level", "", "message", "", "", "args", "Ljn0/h0;", "c", "(Lio/sentry/b7;Ljava/lang/String;[Ljava/lang/Object;)V", "", "throwable", "a", "(Lio/sentry/b7;Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "(Lio/sentry/b7;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "", DateTokenConverter.CONVERTER_KEY, "(Lio/sentry/b7;)Z", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f91829a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("Sentry");

    /* JADX INFO: renamed from: md0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C1962a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91831a;

        static {
            int[] iArr = new int[b7.values().length];
            try {
                iArr[b7.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b7.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b7.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b7.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b7.FATAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f91831a = iArr;
        }
    }

    private a() {
    }

    @Override // io.sentry.ILogger
    public void a(b7 level, String message, Throwable throwable) {
        s.k(level, "level");
        s.k(message, "message");
        int i11 = C1962a.f91831a[level.ordinal()];
        if (i11 == 1) {
            if (r.b()) {
                logger.b(message, false);
            }
        } else {
            if (i11 == 2) {
                g.l(logger, message, false, false, 4, null);
                return;
            }
            if (i11 == 3) {
                logger.n(message);
            } else if (i11 == 4) {
                logger.d(message, throwable);
            } else {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                logger.q(message);
            }
        }
    }

    @Override // io.sentry.ILogger
    public void b(b7 level, Throwable throwable, String message, Object... args) {
        s.k(level, "level");
        s.k(message, "message");
        s.k(args, "args");
        t0 t0Var = t0.f86535a;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        s.j(str, "format(...)");
        a(level, str, throwable);
    }

    @Override // io.sentry.ILogger
    public void c(b7 level, String message, Object... args) {
        s.k(level, "level");
        s.k(message, "message");
        s.k(args, "args");
        t0 t0Var = t0.f86535a;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        s.j(str, "format(...)");
        a(level, str, null);
    }

    @Override // io.sentry.ILogger
    public boolean d(b7 level) {
        return (level == null ? -1 : C1962a.f91831a[level.ordinal()]) == 1 ? r.b() : r.c();
    }
}
