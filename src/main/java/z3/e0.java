package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lz3/e0;", "Lz3/w0$a;", "Lb4/p0;", "within", "<init>", "(Lb4/p0;)V", "b", "Lb4/p0;", "", "e", "()I", "parentWidth", "Lw4/t;", DateTokenConverter.CONVERTER_KEY, "()Lw4/t;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e0 extends w0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b4.p0 within;

    public e0(b4.p0 p0Var) {
        this.within = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0.a
    /* JADX INFO: renamed from: d */
    public w4.t getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0.a
    /* JADX INFO: renamed from: e */
    public int getParentWidth() {
        return this.within.P0();
    }
}
