package com.fourthline.orca.internal;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kz, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\rBE\u0012*\b\u0002\u0010\u0007\u001a$0\u0002j\u0011`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002*\b\u0002\u0010\u0007\u001a$0\u0002j\u0011`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R9\u0010\u0007\u001a$0\u0002j\u0011`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\r\u0010\u001cR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/fourthline/orca/internal/kz;", "", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "Lcom/fourthline/orca/internal/D3;", "default", "disabled", "<init>", "(ILcom/fourthline/orca/internal/D3;Lcom/fourthline/orca/internal/D3;)V", "a", "(ILcom/fourthline/orca/internal/D3;Lcom/fourthline/orca/internal/D3;)Lcom/fourthline/orca/internal/kz;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "Lcom/fourthline/orca/internal/D3;", "()Lcom/fourthline/orca/internal/D3;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p(with = C3535lz.class)
public final /* data */ class StatefulButtonElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int radius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ButtonElement default;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonElement disabled;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kz$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<StatefulButtonElement> serializer() {
            return new C3535lz();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StatefulButtonElement(int i11, ButtonElement buttonElement, ButtonElement disabled) {
        p013kotlin.jvm.internal.s.k(buttonElement, "default");
        p013kotlin.jvm.internal.s.k(disabled, "disabled");
        this.radius = i11;
        this.default = buttonElement;
        this.disabled = disabled;
    }

    public final StatefulButtonElement a(int radius, ButtonElement buttonElement, ButtonElement disabled) {
        p013kotlin.jvm.internal.s.k(buttonElement, "default");
        p013kotlin.jvm.internal.s.k(disabled, "disabled");
        return new StatefulButtonElement(radius, buttonElement, disabled);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ButtonElement getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatefulButtonElement)) {
            return false;
        }
        StatefulButtonElement statefulButtonElement = (StatefulButtonElement) other;
        return this.radius == statefulButtonElement.radius && p013kotlin.jvm.internal.s.f(this.default, statefulButtonElement.default) && p013kotlin.jvm.internal.s.f(this.disabled, statefulButtonElement.disabled);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.radius) * 31) + this.default.hashCode()) * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulButtonElement(radius=" + this.radius + ", default=" + this.default + ", disabled=" + this.disabled + ")";
    }

    public static /* synthetic */ StatefulButtonElement a(StatefulButtonElement statefulButtonElement, int i11, ButtonElement buttonElement, ButtonElement buttonElement2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = statefulButtonElement.radius;
        }
        if ((i12 & 2) != 0) {
            buttonElement = statefulButtonElement.default;
        }
        if ((i12 & 4) != 0) {
            buttonElement2 = statefulButtonElement.disabled;
        }
        return statefulButtonElement.a(i11, buttonElement, buttonElement2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonElement getDefault() {
        return this.default;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StatefulButtonElement(int i11, ButtonElement buttonElement, ButtonElement buttonElement2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        ButtonElement buttonElement3;
        i11 = (i12 & 1) != 0 ? 0 : i11;
        if ((i12 & 4) != 0) {
            buttonElement3 = buttonElement;
            buttonElement2 = ButtonElement.a(buttonElement3, null, null, null, null, 0.5f, 15, null);
        } else {
            buttonElement3 = buttonElement;
        }
        this(i11, buttonElement3, buttonElement2);
    }
}
