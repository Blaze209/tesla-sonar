package androidx.compose.animation;

import p013kotlin.Metadata;
import p015o1.v;
import p019p1.g0;
import w4.r;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/n;", "Lo1/v;", "", "clip", "Lkotlin/Function2;", "Lw4/r;", "Lp1/g0;", "sizeAnimationSpec", "<init>", "(ZLwn0/p;)V", "initialSize", "targetSize", "a", "(JJ)Lp1/g0;", "Z", "k", "()Z", "b", "Lwn0/p;", "getSizeAnimationSpec", "()Lwn0/p;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean clip;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<r, r, g0<r>> sizeAnimationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public n(boolean z11, p<? super r, ? super r, ? extends g0<r>> pVar) {
        this.clip = z11;
        this.sizeAnimationSpec = pVar;
    }

    @Override // p015o1.v
    public g0<r> a(long initialSize, long targetSize) {
        return this.sizeAnimationSpec.invoke(r.b(initialSize), r.b(targetSize));
    }

    @Override // p015o1.v
    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }
}
