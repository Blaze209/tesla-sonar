package androidx.compose.foundation;

import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import q1.f0;
import q1.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010)R\u001a\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Lb4/s0;", "Lq1/f0;", "Lkotlin/Function1;", "Lw4/d;", "Lj3/g;", "sourceCenter", "magnifierCenter", "Lw4/k;", "Ljn0/h0;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lw4/h;", "cornerRadius", "elevation", "clippingEnabled", "Lq1/q0;", "platformMagnifierFactory", "<init>", "(Lwn0/l;Lwn0/l;Lwn0/l;FZJFFZLq1/q0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "()Lq1/f0;", "node", "p", "(Lq1/f0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lwn0/l;", "c", DateTokenConverter.CONVERTER_KEY, "e", Gender.FEMALE, "f", "Z", "g", "J", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "Lq1/q0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MagnifierElement extends s0<f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<w4.d, j3.g> sourceCenter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<w4.d, j3.g> magnifierCenter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<w4.k, h0> onSizeChanged;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float zoom;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean useTextDefault;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float cornerRadius;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean clippingEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final q0 platformMagnifierFactory;

    public /* synthetic */ MagnifierElement(wn0.l lVar, wn0.l lVar2, wn0.l lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, q0 q0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, lVar2, lVar3, f11, z11, j11, f12, f13, z12, q0Var);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) other;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && w4.k.f(this.size, magnifierElement.size) && w4.h.i(this.cornerRadius, magnifierElement.cornerRadius) && w4.h.i(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && s.f(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        wn0.l<w4.d, j3.g> lVar = this.magnifierCenter;
        int iHashCode2 = (((((((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + w4.k.i(this.size)) * 31) + w4.h.j(this.cornerRadius)) * 31) + w4.h.j(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        wn0.l<w4.k, h0> lVar2 = this.onSizeChanged;
        return ((iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f0 i() {
        return new f0(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(f0 node) {
        node.F2(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(wn0.l<? super w4.d, j3.g> lVar, wn0.l<? super w4.d, j3.g> lVar2, wn0.l<? super w4.k, h0> lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, q0 q0Var) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f11;
        this.useTextDefault = z11;
        this.size = j11;
        this.cornerRadius = f12;
        this.elevation = f13;
        this.clippingEnabled = z12;
        this.platformMagnifierFactory = q0Var;
    }
}
