package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g4, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/fourthline/orca/internal/g4;", "", "Lk3/p1;", "light", "dark", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", DateTokenConverter.CONVERTER_KEY, "()J", "b", "c", "(Lr2/l;I)J", "value", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p(with = C3328h4.class)
public final /* data */ class ColorElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ColorElement f31933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ColorElement f31934d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long light;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long dark;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.g4$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ColorElement a() {
            return ColorElement.f31933c;
        }

        public final ColorElement b() {
            return ColorElement.f31934d;
        }

        public final ro0.d<ColorElement> serializer() {
            return new C3328h4();
        }

        private Companion() {
        }

        public final ColorElement a(long j11) {
            return new ColorElement(j11, j11, null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        k3.p1.Companion companion2 = k3.p1.INSTANCE;
        f31933c = new ColorElement(companion2.a(), companion2.k(), null);
        f31934d = companion.a(companion2.i());
    }

    public /* synthetic */ ColorElement(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDark() {
        return this.dark;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLight() {
        return this.light;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorElement)) {
            return false;
        }
        ColorElement colorElement = (ColorElement) other;
        return k3.p1.r(this.light, colorElement.light) && k3.p1.r(this.dark, colorElement.dark);
    }

    public int hashCode() {
        return (k3.p1.x(this.light) * 31) + k3.p1.x(this.dark);
    }

    public String toString() {
        return "ColorElement(light=" + k3.p1.y(this.light) + ", dark=" + k3.p1.y(this.dark) + ")";
    }

    private ColorElement(long j11, long j12) {
        this.light = j11;
        this.dark = j12;
    }

    public final long a(p020r2.l lVar, int i11) {
        lVar.o(1310995438);
        if (p020r2.o.J()) {
            p020r2.o.S(1310995438, i11, -1, "com.fourthline.orca.core.internal.styling.common.ColorElement.<get-value> (StylingElement.kt:23)");
        }
        long j11 = q1.m.a(lVar, 0) ? this.dark : this.light;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return j11;
    }
}
