package k3;

import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Lk3/m3;", "Lk3/c4;", "", "Lk3/p1;", "colors", "", "stops", "Lj3/g;", "start", "end", "Lk3/l4;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lj3/m;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Ljava/util/List;", "f", "g", "J", "h", IntegerTokenConverter.CONVERTER_KEY, "I", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m3 extends c4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<p1> colors;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Float> stops;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long start;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long end;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int tileMode;

    public /* synthetic */ m3(List list, List list2, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j11, j12, i11);
    }

    @Override // k3.c4
    public Shader b(long size) {
        return d4.a(j3.h.a(j3.g.m(this.start) == Float.POSITIVE_INFINITY ? j3.m.k(size) : j3.g.m(this.start), j3.g.n(this.start) == Float.POSITIVE_INFINITY ? j3.m.i(size) : j3.g.n(this.start)), j3.h.a(j3.g.m(this.end) == Float.POSITIVE_INFINITY ? j3.m.k(size) : j3.g.m(this.end), j3.g.n(this.end) == Float.POSITIVE_INFINITY ? j3.m.i(size) : j3.g.n(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) other;
        return p013kotlin.jvm.internal.s.f(this.colors, m3Var.colors) && p013kotlin.jvm.internal.s.f(this.stops, m3Var.stops) && j3.g.j(this.start, m3Var.start) && j3.g.j(this.end, m3Var.end) && l4.f(this.tileMode, m3Var.tileMode);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + j3.g.o(this.start)) * 31) + j3.g.o(this.end)) * 31) + l4.g(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (j3.h.b(this.start)) {
            str = "start=" + ((Object) j3.g.t(this.start)) + ", ";
        } else {
            str = "";
        }
        if (j3.h.b(this.end)) {
            str2 = "end=" + ((Object) j3.g.t(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) l4.h(this.tileMode)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private m3(List<p1> list, List<Float> list2, long j11, long j12, int i11) {
        this.colors = list;
        this.stops = list2;
        this.start = j11;
        this.end = j12;
        this.tileMode = i11;
    }
}
