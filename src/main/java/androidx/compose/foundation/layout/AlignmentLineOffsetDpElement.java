package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.q1;
import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Lb4/s0;", "Landroidx/compose/foundation/layout/b;", "Lz3/a;", "alignmentLine", "Lw4/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "inspectorInfo", "<init>", "(Lz3/a;FFLwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "()Landroidx/compose/foundation/layout/b;", "node", "p", "(Landroidx/compose/foundation/layout/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lz3/a;", "getAlignmentLine", "()Lz3/a;", "c", Gender.FEMALE, "getBefore-D9Ej5fM", "()F", DateTokenConverter.CONVERTER_KEY, "getAfter-D9Ej5fM", "e", "Lwn0/l;", "getInspectorInfo", "()Lwn0/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AlignmentLineOffsetDpElement extends s0<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z3.a alignmentLine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float before;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float after;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<q1, h0> inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(z3.a aVar, float f11, float f12, wn0.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f11, f12, lVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = other instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) other : null;
        return alignmentLineOffsetDpElement != null && p013kotlin.jvm.internal.s.f(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && w4.h.i(this.before, alignmentLineOffsetDpElement.before) && w4.h.i(this.after, alignmentLineOffsetDpElement.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + w4.h.j(this.before)) * 31) + w4.h.j(this.after);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b i() {
        return new b(this.alignmentLine, this.before, this.after, null);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(b node) {
        node.y2(this.alignmentLine);
        node.z2(this.before);
        node.x2(this.after);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(z3.a aVar, float f11, float f12, wn0.l<? super q1, h0> lVar) {
        this.alignmentLine = aVar;
        this.before = f11;
        this.after = f12;
        this.inspectorInfo = lVar;
        if ((f11 < BitmapDescriptorFactory.HUE_RED && !w4.h.i(f11, w4.h.INSTANCE.c())) || (f12 < BitmapDescriptorFactory.HUE_RED && !w4.h.i(f12, w4.h.INSTANCE.c()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
