package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lb4/h0;", "Lb4/a;", "Lb4/b;", "alignmentLinesOwner", "<init>", "(Lb4/b;)V", "Lb4/z0;", "Lz3/a;", "alignmentLine", "", IntegerTokenConverter.CONVERTER_KEY, "(Lb4/z0;Lz3/a;)I", "Lj3/g;", "position", DateTokenConverter.CONVERTER_KEY, "(Lb4/z0;J)J", "", "e", "(Lb4/z0;)Ljava/util/Map;", "alignmentLinesMap", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0 extends a {
    public h0(b bVar) {
        super(bVar, null);
    }

    @Override // b4.a
    protected long d(z0 z0Var, long j11) {
        return z0.t3(z0Var, j11, false, 2, null);
    }

    @Override // b4.a
    protected Map<z3.a, Integer> e(z0 z0Var) {
        return z0Var.x1().q();
    }

    @Override // b4.a
    protected int i(z0 z0Var, z3.a aVar) {
        return z0Var.g0(aVar);
    }
}
