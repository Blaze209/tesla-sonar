package p009i2;

import a2.a;
import a2.g;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w4.h;

/* JADX INFO: renamed from: i2.c2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Li2/c2;", "", "La2/a;", "small", "medium", "large", "<init>", "(La2/a;La2/a;La2/a;)V", "a", "(La2/a;La2/a;La2/a;)Li2/c2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "La2/a;", "e", "()La2/a;", "b", DateTokenConverter.CONVERTER_KEY, "c", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Shapes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a small;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a medium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a large;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Shapes b(Shapes shapes, a aVar, a aVar2, a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = shapes.small;
        }
        if ((i11 & 2) != 0) {
            aVar2 = shapes.medium;
        }
        if ((i11 & 4) != 0) {
            aVar3 = shapes.large;
        }
        return shapes.a(aVar, aVar2, aVar3);
    }

    public final Shapes a(a small, a medium, a large) {
        return new Shapes(small, medium, large);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getLarge() {
        return this.large;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getMedium() {
        return this.medium;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getSmall() {
        return this.small;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) other;
        return s.f(this.small, shapes.small) && s.f(this.medium, shapes.medium) && s.f(this.large, shapes.large);
    }

    public int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Shapes(a aVar, a aVar2, a aVar3) {
        this.small = aVar;
        this.medium = aVar2;
        this.large = aVar3;
    }

    public /* synthetic */ Shapes(a aVar, a aVar2, a aVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? g.c(h.g(4)) : aVar, (i11 & 2) != 0 ? g.c(h.g(4)) : aVar2, (i11 & 4) != 0 ? g.c(h.g(0)) : aVar3);
    }
}
