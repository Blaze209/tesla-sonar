package com.fourthline.orca.internal;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ro, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/internal/Ro;", "", "Lk3/p1;", "light", "dark", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p(with = So.class)
public final /* data */ class OrcaPaletteColor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long light;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long dark;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ro$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<OrcaPaletteColor> serializer() {
            return new So();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OrcaPaletteColor(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDark() {
        return this.dark;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLight() {
        return this.light;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaPaletteColor)) {
            return false;
        }
        OrcaPaletteColor orcaPaletteColor = (OrcaPaletteColor) other;
        return k3.p1.r(this.light, orcaPaletteColor.light) && k3.p1.r(this.dark, orcaPaletteColor.dark);
    }

    public int hashCode() {
        return (k3.p1.x(this.light) * 31) + k3.p1.x(this.dark);
    }

    public String toString() {
        return "OrcaPaletteColor(light=" + k3.p1.y(this.light) + ", dark=" + k3.p1.y(this.dark) + ")";
    }

    private OrcaPaletteColor(long j11, long j12) {
        this.light = j11;
        this.dark = j12;
    }
}
