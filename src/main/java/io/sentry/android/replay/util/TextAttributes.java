package io.sentry.android.replay.util;

import ch.qos.logback.core.CoreConstants;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: io.sentry.android.replay.util.o, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/util/o;", "", "Lk3/p1;", "color", "", "hasFillModifier", "<init>", "(Lk3/p1;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "()Lk3/p1;", "b", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lk3/p1;", "getColor-QN2ZGVo", "Z", "getHasFillModifier", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TextAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p1 color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasFillModifier;

    public /* synthetic */ TextAttributes(p1 p1Var, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(p1Var, z11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p1 getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAttributes)) {
            return false;
        }
        TextAttributes textAttributes = (TextAttributes) other;
        return s.f(this.color, textAttributes.color) && this.hasFillModifier == textAttributes.hasFillModifier;
    }

    public int hashCode() {
        p1 p1Var = this.color;
        return ((p1Var == null ? 0 : p1.x(p1Var.getValue())) * 31) + Boolean.hashCode(this.hasFillModifier);
    }

    public String toString() {
        return "TextAttributes(color=" + this.color + ", hasFillModifier=" + this.hasFillModifier + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private TextAttributes(p1 p1Var, boolean z11) {
        this.color = p1Var;
        this.hasFillModifier = z11;
    }
}
