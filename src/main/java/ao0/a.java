package ao0;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lao0/a;", "Lzn0/a;", "<init>", "()V", "", "from", "until", "e", "(II)I", "", "g", "(JJ)J", "Ljava/util/Random;", "h", "()Ljava/util/Random;", "impl", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends zn0.a {
    @Override // zn0.c
    public int e(int from, int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }

    @Override // zn0.c
    public long g(long from, long until) {
        return ThreadLocalRandom.current().nextLong(from, until);
    }

    @Override // zn0.a
    public Random h() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        s.j(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
