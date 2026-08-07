package p016o2;

import a2.a;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: o2.e0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001b"}, d2 = {"Lo2/e0;", "", "La2/a;", "extraSmall", "small", "medium", "large", "extraLarge", "<init>", "(La2/a;La2/a;La2/a;La2/a;La2/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "La2/a;", "b", "()La2/a;", "e", "c", DateTokenConverter.CONVERTER_KEY, "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Shapes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a extraSmall;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a small;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a medium;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a large;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a extraLarge;

    public Shapes() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getExtraLarge() {
        return this.extraLarge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getExtraSmall() {
        return this.extraSmall;
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
        return s.f(this.extraSmall, shapes.extraSmall) && s.f(this.small, shapes.small) && s.f(this.medium, shapes.medium) && s.f(this.large, shapes.large) && s.f(this.extraLarge, shapes.extraLarge);
    }

    public int hashCode() {
        return (((((((this.extraSmall.hashCode() * 31) + this.small.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.large.hashCode()) * 31) + this.extraLarge.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Shapes(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.extraSmall = aVar;
        this.small = aVar2;
        this.medium = aVar3;
        this.large = aVar4;
        this.extraLarge = aVar5;
    }

    public /* synthetic */ Shapes(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? d0.f95835a.b() : aVar, (i11 & 2) != 0 ? d0.f95835a.e() : aVar2, (i11 & 4) != 0 ? d0.f95835a.d() : aVar3, (i11 & 8) != 0 ? d0.f95835a.c() : aVar4, (i11 & 16) != 0 ? d0.f95835a.a() : aVar5);
    }
}
