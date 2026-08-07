package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lvo0/n2;", "Lvo0/p1;", "Ljn0/g0;", "bufferWithData", "<init>", "([SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "Ljn0/h0;", "b", "(I)V", "Ljn0/f0;", "c", "e", "(S)V", "f", "()[S", "a", "[S", "buffer", "value", "I", DateTokenConverter.CONVERTER_KEY, "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n2 extends p1<jn0.g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private short[] buffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int position;

    public /* synthetic */ n2(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // vo0.p1
    public /* bridge */ /* synthetic */ jn0.g0 a() {
        return jn0.g0.b(f());
    }

    @Override // vo0.p1
    public void b(int requiredCapacity) {
        if (jn0.g0.n(this.buffer) < requiredCapacity) {
            short[] sArr = this.buffer;
            short[] sArrCopyOf = Arrays.copyOf(sArr, bo0.n.f(requiredCapacity, jn0.g0.n(sArr) * 2));
            p013kotlin.jvm.internal.s.j(sArrCopyOf, "copyOf(...)");
            this.buffer = jn0.g0.e(sArrCopyOf);
        }
    }

    @Override // vo0.p1
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    public final void e(short c11) {
        p1.c(this, 0, 1, null);
        short[] sArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        jn0.g0.r(sArr, position, c11);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        p013kotlin.jvm.internal.s.j(sArrCopyOf, "copyOf(...)");
        return jn0.g0.e(sArrCopyOf);
    }

    private n2(short[] bufferWithData) {
        p013kotlin.jvm.internal.s.k(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = jn0.g0.n(bufferWithData);
        b(10);
    }
}
