package p015o1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import d3.c;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p019p1.g0;
import w4.r;
import wn0.l;

/* JADX INFO: renamed from: o1.g, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Lo1/g;", "", "Ld3/c;", "alignment", "Lkotlin/Function1;", "Lw4/r;", "size", "Lp1/g0;", "animationSpec", "", "clip", "<init>", "(Ld3/c;Lwn0/l;Lp1/g0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld3/c;", "()Ld3/c;", "b", "Lwn0/l;", DateTokenConverter.CONVERTER_KEY, "()Lwn0/l;", "c", "Lp1/g0;", "()Lp1/g0;", "Z", "()Z", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ChangeSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<r, r> size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0<r> animationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(c cVar, l<? super r, r> lVar, g0<r> g0Var, boolean z11) {
        this.alignment = cVar;
        this.size = lVar;
        this.animationSpec = g0Var;
        this.clip = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getAlignment() {
        return this.alignment;
    }

    public final g0<r> b() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final l<r, r> d() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) other;
        return s.f(this.alignment, changeSize.alignment) && s.f(this.size, changeSize.size) && s.f(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + Boolean.hashCode(this.clip);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
