package p015o1;

import p013kotlin.Metadata;
import p019p1.l1;
import p020r2.p1;
import p020r2.s3;
import w4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lo1/f;", "Lo1/e;", "Lp1/l1;", "Lo1/k;", "transition", "<init>", "(Lp1/l1;)V", "a", "Lp1/l1;", "getTransition", "()Lp1/l1;", "setTransition", "Lr2/p1;", "Lw4/r;", "b", "Lr2/p1;", "()Lr2/p1;", "targetSize", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private l1<k> transition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1<r> targetSize = s3.d(r.b(r.INSTANCE.a()), null, 2, null);

    public f(l1<k> l1Var) {
        this.transition = l1Var;
    }

    public final p1<r> a() {
        return this.targetSize;
    }
}
