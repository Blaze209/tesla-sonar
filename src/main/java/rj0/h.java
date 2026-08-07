package rj0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p019p1.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001e"}, d2 = {"Lrj0/h;", "", "<init>", "()V", "", "velocity", "Lp1/z;", "decayAnimationSpec", "maximumFlingDistance", "", "c", "(FLp1/z;F)I", "index", DateTokenConverter.CONVERTER_KEY, "(I)I", "", "b", "()Z", "a", "g", "()I", "startScrollOffset", "f", "endScrollOffset", "Lrj0/i;", "e", "()Lrj0/i;", "currentItem", "h", "totalItemsCount", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class h {
    public abstract boolean a();

    public abstract boolean b();

    public abstract int c(float velocity, z<Float> decayAnimationSpec, float maximumFlingDistance);

    public abstract int d(int index);

    public abstract SnapperLayoutItemInfo e();

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
