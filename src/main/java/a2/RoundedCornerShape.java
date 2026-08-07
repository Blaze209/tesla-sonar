package a2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.i;
import j3.l;
import j3.n;
import k3.p3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import w4.t;

/* JADX INFO: renamed from: a2.f, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"La2/f;", "La2/a;", "La2/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(La2/b;La2/b;La2/b;La2/b;)V", "Lj3/m;", "size", "", "Lw4/t;", "layoutDirection", "Lk3/p3;", "e", "(JFFFFLw4/t;)Lk3/p3;", "j", "(La2/b;La2/b;La2/b;La2/b;)La2/f;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoundedCornerShape extends a {
    public RoundedCornerShape(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // a2.a
    public p3 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, t layoutDirection) {
        if (topStart + topEnd + bottomEnd + bottomStart == BitmapDescriptorFactory.HUE_RED) {
            return new p3.b(n.c(size));
        }
        i iVarC = n.c(size);
        t tVar = t.Ltr;
        return new p3.c(l.b(iVarC, j3.b.b(layoutDirection == tVar ? topStart : topEnd, BitmapDescriptorFactory.HUE_RED, 2, null), j3.b.b(layoutDirection == tVar ? topEnd : topStart, BitmapDescriptorFactory.HUE_RED, 2, null), j3.b.b(layoutDirection == tVar ? bottomEnd : bottomStart, BitmapDescriptorFactory.HUE_RED, 2, null), j3.b.b(layoutDirection == tVar ? bottomStart : bottomEnd, BitmapDescriptorFactory.HUE_RED, 2, null)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) other;
        return s.f(getTopStart(), roundedCornerShape.getTopStart()) && s.f(getTopEnd(), roundedCornerShape.getTopEnd()) && s.f(getBottomEnd(), roundedCornerShape.getBottomEnd()) && s.f(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // a2.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public RoundedCornerShape c(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        return new RoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
