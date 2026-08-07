package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/d;", "Landroidx/compose/ui/platform/b;", "<init>", "()V", "", "lineNumber", "Lt4/i;", "direction", IntegerTokenConverter.CONVERTER_KEY, "(ILt4/i;)I", "", "text", "Li4/m0;", "layoutResult", "Ljn0/h0;", "j", "(Ljava/lang/String;Li4/m0;)V", "current", "", "a", "(I)[I", "b", "c", "Li4/m0;", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static d f5673f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f5672e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final t4.i f5674g = t4.i.Rtl;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final t4.i f5675h = t4.i.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/d;", "a", "()Landroidx/compose/ui/platform/d;", "Lt4/i;", "DirectionEnd", "Lt4/i;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            if (d.f5673f == null) {
                d.f5673f = new d(null);
            }
            d dVar = d.f5673f;
            p013kotlin.jvm.internal.s.i(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return dVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int lineNumber, t4.i direction) {
        TextLayoutResult textLayoutResult = this.layoutResult;
        TextLayoutResult textLayoutResult2 = null;
        if (textLayoutResult == null) {
            p013kotlin.jvm.internal.s.B("layoutResult");
            textLayoutResult = null;
        }
        int iU = textLayoutResult.u(lineNumber);
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            p013kotlin.jvm.internal.s.B("layoutResult");
            textLayoutResult3 = null;
        }
        if (direction != textLayoutResult3.y(iU)) {
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
            } else {
                textLayoutResult2 = textLayoutResult4;
            }
            return textLayoutResult2.u(lineNumber);
        }
        TextLayoutResult textLayoutResult5 = this.layoutResult;
        if (textLayoutResult5 == null) {
            p013kotlin.jvm.internal.s.B("layoutResult");
            textLayoutResult5 = null;
        }
        return TextLayoutResult.p(textLayoutResult5, lineNumber, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int current) {
        int iQ;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        if (current < 0) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult = null;
            }
            iQ = textLayoutResult.q(0);
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ2 = textLayoutResult2.q(current);
            iQ = i(iQ2, f5674g) == current ? iQ2 : iQ2 + 1;
        }
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            p013kotlin.jvm.internal.s.B("layoutResult");
            textLayoutResult3 = null;
        }
        if (iQ >= textLayoutResult3.n()) {
            return null;
        }
        return c(i(iQ, f5674g), i(iQ, f5675h) + 1);
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int current) {
        int iQ;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        if (current > d().length()) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult = null;
            }
            iQ = textLayoutResult.q(d().length());
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ2 = textLayoutResult2.q(current);
            iQ = i(iQ2, f5675h) + 1 == current ? iQ2 : iQ2 - 1;
        }
        if (iQ < 0) {
            return null;
        }
        return c(i(iQ, f5674g), i(iQ, f5675h) + 1);
    }

    public final void j(String text, TextLayoutResult layoutResult) {
        f(text);
        this.layoutResult = layoutResult;
    }

    private d() {
    }
}
