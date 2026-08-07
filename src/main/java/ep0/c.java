package ep0;

import net.time4j.engine.p;
import net.time4j.format.d;

/* JADX INFO: loaded from: classes9.dex */
public class c extends d<Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p<Integer> f63122e = new c("YEAR_OF_DISPLAY", 0, 1, 9999);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient char f63123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient Integer f63124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Integer f63125d;

    protected c(String str, char c11, int i11, int i12) {
        super(str);
        this.f63123b = c11;
        this.f63124c = Integer.valueOf(i11);
        this.f63125d = Integer.valueOf(i12);
    }

    private Object readResolve() {
        return f63122e;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f63123b;
    }

    @Override // net.time4j.engine.p
    public final Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean n() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMaximum() {
        return this.f63125d;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMinimum() {
        return this.f63124c;
    }
}
