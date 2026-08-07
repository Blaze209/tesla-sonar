package androidx.compose.material3;

import b4.j;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import k3.p1;
import k3.s1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import q1.e0;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/b;", "Lq1/e0;", "", "bounded", "Lw4/h;", "radius", "Lk3/s1;", "colorProducer", "Lk3/p1;", "color", "<init>", "(ZFLk3/s1;J)V", "(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lu1/j;", "interactionSource", "Lb4/j;", "a", "(Lu1/j;)Lb4/j;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "b", Gender.FEMALE, "c", "Lk3/s1;", DateTokenConverter.CONVERTER_KEY, "J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s1 colorProducer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long color;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk3/p1;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    static final class a implements s1 {
        a() {
        }

        @Override // k3.s1
        public final long a() {
            return b.this.color;
        }
    }

    public /* synthetic */ b(boolean z11, float f11, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, j11);
    }

    @Override // q1.e0
    public j a(u1.j interactionSource) {
        s1 aVar = this.colorProducer;
        if (aVar == null) {
            aVar = new a();
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, aVar, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        if (this.bounded == bVar.bounded && h.i(this.radius, bVar.radius) && s.f(this.colorProducer, bVar.colorProducer)) {
            return p1.r(this.color, bVar.color);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.bounded) * 31) + h.j(this.radius)) * 31;
        s1 s1Var = this.colorProducer;
        return ((iHashCode + (s1Var != null ? s1Var.hashCode() : 0)) * 31) + p1.x(this.color);
    }

    private b(boolean z11, float f11, s1 s1Var, long j11) {
        this.bounded = z11;
        this.radius = f11;
        this.colorProducer = s1Var;
        this.color = j11;
    }

    private b(boolean z11, float f11, long j11) {
        this(z11, f11, (s1) null, j11);
    }
}
