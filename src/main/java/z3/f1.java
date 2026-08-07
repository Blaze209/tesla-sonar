package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lz3/f1;", "Lz3/w0$a;", "", "parentWidth", "Lw4/t;", "parentLayoutDirection", "<init>", "(ILw4/t;)V", "b", "I", "e", "()I", "c", "Lw4/t;", DateTokenConverter.CONVERTER_KEY, "()Lw4/t;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f1 extends w0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parentWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w4.t parentLayoutDirection;

    public f1(int i11, w4.t tVar) {
        this.parentWidth = i11;
        this.parentLayoutDirection = tVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public w4.t getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getParentWidth() {
        return this.parentWidth;
    }
}
