package com.fourthline.orca.internal;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pg, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/pg;", "", "Ln4/q;", "family", "Lw4/v;", "size", "lineHeight", "<init>", "(Ln4/q;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "maxSize", "Lkotlin/Pair;", "a", "(Lw4/v;Lr2/l;II)Lkotlin/Pair;", "(Ln4/q;JJ)Lcom/fourthline/orca/internal/pg;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln4/q;", "b", "()Ln4/q;", "J", "getSize-XSAIIZE", "()J", "c", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p(with = C3731qg.class)
public final /* data */ class FontElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FontElement f34523d = new FontElement(p014n4.q.INSTANCE.a(), w4.w.h(12), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p014n4.q family;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lineHeight;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pg$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontElement a() {
            return FontElement.f34523d;
        }

        public final ro0.d<FontElement> serializer() {
            return new C3731qg();
        }

        private Companion() {
        }
    }

    public /* synthetic */ FontElement(p014n4.q qVar, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, j11, j12);
    }

    public final FontElement a(p014n4.q family, long size, long lineHeight) {
        p013kotlin.jvm.internal.s.k(family, "family");
        return new FontElement(family, size, lineHeight, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p014n4.q getFamily() {
        return this.family;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FontElement)) {
            return false;
        }
        FontElement fontElement = (FontElement) other;
        return p013kotlin.jvm.internal.s.f(this.family, fontElement.family) && w4.v.e(this.size, fontElement.size) && w4.v.e(this.lineHeight, fontElement.lineHeight);
    }

    public int hashCode() {
        return (((this.family.hashCode() * 31) + w4.v.i(this.size)) * 31) + w4.v.i(this.lineHeight);
    }

    public String toString() {
        return "FontElement(family=" + this.family + ", size=" + w4.v.k(this.size) + ", lineHeight=" + w4.v.k(this.lineHeight) + ")";
    }

    private FontElement(p014n4.q family, long j11, long j12) {
        p013kotlin.jvm.internal.s.k(family, "family");
        this.family = family;
        this.size = j11;
        this.lineHeight = j12;
    }

    public static /* synthetic */ FontElement a(FontElement fontElement, p014n4.q qVar, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qVar = fontElement.family;
        }
        if ((i11 & 2) != 0) {
            j11 = fontElement.size;
        }
        if ((i11 & 4) != 0) {
            j12 = fontElement.lineHeight;
        }
        return fontElement.a(qVar, j11, j12);
    }

    public final Pair a(w4.v vVar, p020r2.l lVar, int i11, int i12) {
        long jK;
        long jK2;
        lVar.o(-1236946033);
        if ((i12 & 1) != 0) {
            vVar = null;
        }
        if (p020r2.o.J()) {
            p020r2.o.S(-1236946033, i11, -1, "com.fourthline.orca.core.internal.styling.common.FontElement.getTextSizeToLineHeight (StylingElement.kt:46)");
        }
        if (vVar != null) {
            float f11 = ((Configuration) lVar.U(AndroidCompositionLocals_androidKt.f())).fontScale;
            long j11 = this.size;
            w4.w.b(j11);
            jK = w4.w.k(w4.v.f(j11), w4.v.h(j11) * f11);
            long packedValue = vVar.getPackedValue();
            w4.w.c(jK, packedValue);
            if (Float.compare(w4.v.h(jK), w4.v.h(packedValue)) > 0) {
                float fH = w4.v.h(vVar.getPackedValue()) / w4.v.h(this.size);
                jK = vVar.getPackedValue();
                long j12 = this.lineHeight;
                w4.w.b(j12);
                jK2 = w4.w.k(w4.v.f(j12), w4.v.h(j12) * fH);
            } else {
                long j13 = this.lineHeight;
                w4.w.b(j13);
                jK2 = w4.w.k(w4.v.f(j13), w4.v.h(j13) * f11);
            }
        } else {
            jK = this.size;
            jK2 = this.lineHeight;
        }
        Pair pairA = jn0.x.a(w4.v.b(jK), w4.v.b(jK2));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return pairA;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FontElement(p014n4.q qVar, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            w4.w.b(j11);
            j12 = w4.w.k(w4.v.f(j11), (float) (((double) w4.v.h(j11)) * 1.5d));
        }
        this(qVar, j11, j12, null);
    }
}
