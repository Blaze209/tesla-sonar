package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qz, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/fourthline/orca/internal/qz;", "", "Lcom/fourthline/orca/internal/PA;", "default", "focused", AnalyticsAttribute.Error, "disabled", "<init>", "(Lcom/fourthline/orca/internal/PA;Lcom/fourthline/orca/internal/PA;Lcom/fourthline/orca/internal/PA;Lcom/fourthline/orca/internal/PA;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/internal/PA;", "()Lcom/fourthline/orca/internal/PA;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p(with = C3792rz.class)
public final /* data */ class StatefulTextInputElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextInputElement default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextInputElement focused;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextInputElement error;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextInputElement disabled;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qz$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<StatefulTextInputElement> serializer() {
            return new C3792rz();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StatefulTextInputElement(TextInputElement textInputElement, TextInputElement focused, TextInputElement error, TextInputElement disabled) {
        p013kotlin.jvm.internal.s.k(textInputElement, "default");
        p013kotlin.jvm.internal.s.k(focused, "focused");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(disabled, "disabled");
        this.default = textInputElement;
        this.focused = focused;
        this.error = error;
        this.disabled = disabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextInputElement getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextInputElement getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextInputElement getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextInputElement getFocused() {
        return this.focused;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatefulTextInputElement)) {
            return false;
        }
        StatefulTextInputElement statefulTextInputElement = (StatefulTextInputElement) other;
        return p013kotlin.jvm.internal.s.f(this.default, statefulTextInputElement.default) && p013kotlin.jvm.internal.s.f(this.focused, statefulTextInputElement.focused) && p013kotlin.jvm.internal.s.f(this.error, statefulTextInputElement.error) && p013kotlin.jvm.internal.s.f(this.disabled, statefulTextInputElement.disabled);
    }

    public int hashCode() {
        return (((((this.default.hashCode() * 31) + this.focused.hashCode()) * 31) + this.error.hashCode()) * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulTextInputElement(default=" + this.default + ", focused=" + this.focused + ", error=" + this.error + ", disabled=" + this.disabled + ")";
    }
}
