package io.ktor.utils.io.jvm.javaio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/g;", "Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/lang/Thread;", "<init>", "()V", "", "c", "()Ljava/lang/Void;", "", "timeNanos", "Ljn0/h0;", "a", "(J)V", "token", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Thread;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g implements e<Thread> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f78820a = new g();

    private g() {
    }

    private final Void c() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long timeNanos) {
        c();
        throw new KotlinNothingValueException();
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(Thread token) {
        s.k(token, "token");
        c.f78808a.b(token);
    }
}
