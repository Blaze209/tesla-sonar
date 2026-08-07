package q4;

import p013kotlin.Metadata;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq4/t;", "Lr2/y3;", "", "value", "<init>", "(Z)V", "a", "Z", "k", "()Ljava/lang/Boolean;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class t implements y3<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean value;

    public t(boolean z11) {
        this.value = z11;
    }

    @Override // p020r2.y3
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
