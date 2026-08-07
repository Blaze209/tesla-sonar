package androidx.compose.ui.draw;

import b4.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import k3.BlockGraphicsLayerModifier;
import k3.g4;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w4.h;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u000b\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Lb4/s0;", "Lk3/g1;", "Lw4/h;", "elevation", "Lk3/g4;", "shape", "", "clip", "Lk3/p1;", "ambientColor", "spotColor", "<init>", "(FLk3/g4;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "p", "()Lwn0/l;", "o", "()Lk3/g1;", "node", "w", "(Lk3/g1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", Gender.FEMALE, "t", "()F", "c", "Lk3/g4;", "u", "()Lk3/g4;", DateTokenConverter.CONVERTER_KEY, "Z", "s", "()Z", "e", "J", "r", "()J", "f", "v", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends s0<BlockGraphicsLayerModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float elevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g4 shape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotColor;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<androidx.compose.ui.graphics.c, h0> {
        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.v(cVar.O1(ShadowGraphicsLayerElement.this.getElevation()));
            cVar.T(ShadowGraphicsLayerElement.this.getShape());
            cVar.u(ShadowGraphicsLayerElement.this.getClip());
            cVar.L(ShadowGraphicsLayerElement.this.getAmbientColor());
            cVar.N(ShadowGraphicsLayerElement.this.getSpotColor());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f11, g4 g4Var, boolean z11, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, g4Var, z11, j11, j12);
    }

    private final l<androidx.compose.ui.graphics.c, h0> p() {
        return new a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return h.i(this.elevation, shadowGraphicsLayerElement.elevation) && s.f(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && p1.r(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && p1.r(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    public int hashCode() {
        return (((((((h.j(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + p1.x(this.ambientColor)) * 31) + p1.x(this.spotColor);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BlockGraphicsLayerModifier i() {
        return new BlockGraphicsLayerModifier(p());
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) h.k(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) p1.y(this.ambientColor)) + ", spotColor=" + ((Object) p1.y(this.spotColor)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final g4 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m(BlockGraphicsLayerModifier node) {
        node.z2(p());
        node.y2();
    }

    private ShadowGraphicsLayerElement(float f11, g4 g4Var, boolean z11, long j11, long j12) {
        this.elevation = f11;
        this.shape = g4Var;
        this.clip = z11;
        this.ambientColor = j11;
        this.spotColor = j12;
    }
}
