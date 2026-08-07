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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lb4/s0;", "Landroidx/compose/foundation/layout/u;", "Lw4/h;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "inspectorInfo", "<init>", "(FFFFZLwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "()Landroidx/compose/foundation/layout/u;", "node", "p", "(Landroidx/compose/foundation/layout/u;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", Gender.FEMALE, "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "c", "getTop-D9Ej5fM", "setTop-0680j_4", DateTokenConverter.CONVERTER_KEY, "getEnd-D9Ej5fM", "setEnd-0680j_4", "e", "getBottom-D9Ej5fM", "setBottom-0680j_4", "f", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "g", "Lwn0/l;", "getInspectorInfo", "()Lwn0/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingElement extends s0<u> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float end;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<q1, h0> inspectorInfo;

    public /* synthetic */ PaddingElement(float f11, float f12, float f13, float f14, boolean z11, wn0.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, z11, lVar);
    }

    public boolean equals(Object other) {
        PaddingElement paddingElement = other instanceof PaddingElement ? (PaddingElement) other : null;
        return paddingElement != null && w4.h.i(this.start, paddingElement.start) && w4.h.i(this.top, paddingElement.top) && w4.h.i(this.end, paddingElement.end) && w4.h.i(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    public int hashCode() {
        return (((((((w4.h.j(this.start) * 31) + w4.h.j(this.top)) * 31) + w4.h.j(this.end)) * 31) + w4.h.j(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public u i() {
        return new u(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(u node) {
        node.D2(this.start);
        node.E2(this.top);
        node.B2(this.end);
        node.A2(this.bottom);
        node.C2(this.rtlAware);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f11, float f12, float f13, float f14, boolean z11, wn0.l<? super q1, h0> lVar) {
        this.start = f11;
        this.top = f12;
        this.end = f13;
        this.bottom = f14;
        this.rtlAware = z11;
        this.inspectorInfo = lVar;
        if (f11 >= BitmapDescriptorFactory.HUE_RED || w4.h.i(f11, w4.h.INSTANCE.c())) {
            float f15 = this.top;
            if (f15 >= BitmapDescriptorFactory.HUE_RED || w4.h.i(f15, w4.h.INSTANCE.c())) {
                float f16 = this.end;
                if (f16 >= BitmapDescriptorFactory.HUE_RED || w4.h.i(f16, w4.h.INSTANCE.c())) {
                    float f17 = this.bottom;
                    if (f17 >= BitmapDescriptorFactory.HUE_RED || w4.h.i(f17, w4.h.INSTANCE.c())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
