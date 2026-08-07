package androidx.compose.ui.platform;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Lb4/s0;", "Landroidx/compose/ui/platform/t2;", "", "tag", "<init>", "(Ljava/lang/String;)V", "o", "()Landroidx/compose/ui/platform/t2;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/ui/platform/t2;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TestTagElement extends b4.s0<t2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    public TestTagElement(String str) {
        this.tag = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TestTagElement) {
            return p013kotlin.jvm.internal.s.f(this.tag, ((TestTagElement) other).tag);
        }
        return false;
    }

    public int hashCode() {
        return this.tag.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public t2 i() {
        return new t2(this.tag);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(t2 node) {
        node.x2(this.tag);
    }
}
