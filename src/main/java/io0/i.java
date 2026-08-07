package io0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio0/i;", "", "<init>", "()V", "", "e", "()J", "", "toString", "()Ljava/lang/String;", "Lio0/k$a$a;", DateTokenConverter.CONVERTER_KEY, "timeMark", "Lio0/b;", "c", "(J)J", "one", "another", "b", "(JJ)J", "J", "zero", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f81654a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long zero = System.nanoTime();

    private i() {
    }

    private final long e() {
        return System.nanoTime() - zero;
    }

    @Override // io0.k
    public /* bridge */ /* synthetic */ j a() {
        return k.a.C1711a.b(d());
    }

    public final long b(long one, long another) {
        return h.d(one, another, e.NANOSECONDS);
    }

    public final long c(long timeMark) {
        return h.b(e(), timeMark, e.NANOSECONDS);
    }

    public long d() {
        return k.a.C1711a.d(e());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
