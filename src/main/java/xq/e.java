package xq;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;

/* JADX INFO: loaded from: classes4.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e f123960a = a().f(SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE).d(200).b(10000).c(CoreConstants.MILLIS_IN_ONE_WEEK).e(81920).a();

    static abstract class a {
        a() {
        }

        abstract e a();

        abstract a b(int i11);

        abstract a c(long j11);

        abstract a d(int i11);

        abstract a e(int i11);

        abstract a f(long j11);
    }

    e() {
    }

    static a a() {
        return new xq.a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
