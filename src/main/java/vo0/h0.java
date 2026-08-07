package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lvo0/h0;", "Lvo0/p1;", "", "bufferWithData", "<init>", "([I)V", "", "requiredCapacity", "Ljn0/h0;", "b", "(I)V", "c", "e", "f", "()[I", "a", "[I", "buffer", "value", "I", DateTokenConverter.CONVERTER_KEY, "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 extends p1<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] buffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int position;

    public h0(int[] bufferWithData) {
        p013kotlin.jvm.internal.s.k(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        b(10);
    }

    @Override // vo0.p1
    public void b(int requiredCapacity) {
        int[] iArr = this.buffer;
        if (iArr.length < requiredCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, bo0.n.f(requiredCapacity, iArr.length * 2));
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(...)");
            this.buffer = iArrCopyOf;
        }
    }

    @Override // vo0.p1
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    public final void e(int c11) {
        p1.c(this, 0, 1, null);
        int[] iArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        iArr[position] = c11;
    }

    @Override // vo0.p1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
