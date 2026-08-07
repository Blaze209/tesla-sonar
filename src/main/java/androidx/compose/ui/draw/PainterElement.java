package androidx.compose.ui.draw;

import b4.e0;
import b4.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Gender;
import j3.m;
import k3.q1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lb4/s0;", "Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/graphics/painter/b;", PlaceTypes.PAINTER, "", "sizeToIntrinsics", "Ld3/c;", "alignment", "Lz3/k;", "contentScale", "", "alpha", "Lk3/q1;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/b;ZLd3/c;Lz3/k;FLk3/q1;)V", "o", "()Landroidx/compose/ui/draw/PainterNode;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/ui/draw/PainterNode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/b;", "getPainter", "()Landroidx/compose/ui/graphics/painter/b;", "b", "Z", "getSizeToIntrinsics", "()Z", "c", "Ld3/c;", "getAlignment", "()Ld3/c;", DateTokenConverter.CONVERTER_KEY, "Lz3/k;", "getContentScale", "()Lz3/k;", "e", Gender.FEMALE, "getAlpha", "()F", "f", "Lk3/q1;", "getColorFilter", "()Lk3/q1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class PainterElement extends s0<PainterModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d3.c alignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final k contentScale;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1 colorFilter;
    private final androidx.compose.ui.graphics.painter.b painter;

    public PainterElement(androidx.compose.ui.graphics.painter.b bVar, boolean z11, d3.c cVar, k kVar, float f11, q1 q1Var) {
        this.painter = bVar;
        this.sizeToIntrinsics = z11;
        this.alignment = cVar;
        this.contentScale = kVar;
        this.alpha = f11;
        this.colorFilter = q1Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) other;
        return s.f(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && s.f(this.alignment, painterElement.alignment) && s.f(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && s.f(this.colorFilter, painterElement.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        q1 q1Var = this.colorFilter;
        return iHashCode + (q1Var == null ? 0 : q1Var.hashCode());
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public PainterModifier i() {
        return new PainterModifier(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(PainterModifier node) {
        boolean sizeToIntrinsics = node.getSizeToIntrinsics();
        boolean z11 = this.sizeToIntrinsics;
        boolean z12 = sizeToIntrinsics != z11 || (z11 && !m.h(node.getPainter().mo1getIntrinsicSizeNHjbRc(), this.painter.mo1getIntrinsicSizeNHjbRc()));
        node.H2(this.painter);
        node.I2(this.sizeToIntrinsics);
        node.E2(this.alignment);
        node.G2(this.contentScale);
        node.a(this.alpha);
        node.F2(this.colorFilter);
        if (z12) {
            e0.b(node);
        }
        b4.s.a(node);
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
