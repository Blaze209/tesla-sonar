package androidx.compose.animation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p015o1.TransitionData;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/animation/l;", "Landroidx/compose/animation/k;", "Lo1/a0;", "data", "<init>", "(Lo1/a0;)V", DateTokenConverter.CONVERTER_KEY, "Lo1/a0;", "b", "()Lo1/a0;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class l extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TransitionData data;

    public l(TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }

    @Override // androidx.compose.animation.k
    /* JADX INFO: renamed from: b, reason: from getter */
    public TransitionData getData() {
        return this.data;
    }
}
