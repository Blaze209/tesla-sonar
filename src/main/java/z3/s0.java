package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lz3/s0;", "Lz3/w0$a;", "Lb4/j1;", "owner", "<init>", "(Lb4/j1;)V", "b", "Lb4/j1;", "getOwner", "()Lb4/j1;", "", "e", "()I", "parentWidth", "Lw4/t;", DateTokenConverter.CONVERTER_KEY, "()Lw4/t;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class s0 extends w0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b4.j1 owner;

    public s0(b4.j1 j1Var) {
        this.owner = j1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0.a
    /* JADX INFO: renamed from: d */
    public w4.t getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0.a
    /* JADX INFO: renamed from: e */
    public int getParentWidth() {
        return this.owner.getRoot().s0();
    }
}
