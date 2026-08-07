package androidx.compose.ui.platform;

import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextLayoutResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/e;", "Landroidx/compose/ui/platform/b;", "<init>", "()V", "", "lineNumber", "Lt4/i;", "direction", IntegerTokenConverter.CONVERTER_KEY, "(ILt4/i;)I", "", "text", "Li4/m0;", "layoutResult", "Lg4/p;", "node", "Ljn0/h0;", "j", "(Ljava/lang/String;Li4/m0;Lg4/p;)V", "current", "", "a", "(I)[I", "b", "c", "Li4/m0;", DateTokenConverter.CONVERTER_KEY, "Lg4/p;", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "tempRect", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static e f5690h;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private g4.p node;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Rect tempRect;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f5689g = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final t4.i f5691i = t4.i.Rtl;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final t4.i f5692j = t4.i.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/e$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/e;", "a", "()Landroidx/compose/ui/platform/e;", "Lt4/i;", "DirectionEnd", "Lt4/i;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/e;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            if (e.f5690h == null) {
                e.f5690h = new e(null);
            }
            e eVar = e.f5690h;
            p013kotlin.jvm.internal.s.i(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return eVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
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
        int iN;
        TextLayoutResult textLayoutResult = null;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        try {
            g4.p pVar = this.node;
            if (pVar == null) {
                p013kotlin.jvm.internal.s.B("node");
                pVar = null;
            }
            int iRound = Math.round(pVar.i().h());
            int iF = bo0.n.f(0, current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ = textLayoutResult2.q(iF);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult3 = null;
            }
            float fV = textLayoutResult3.v(iQ) + iRound;
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult4 = null;
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult5 = null;
            }
            if (fV < textLayoutResult4.v(textLayoutResult5.n() - 1)) {
                TextLayoutResult textLayoutResult6 = this.layoutResult;
                if (textLayoutResult6 == null) {
                    p013kotlin.jvm.internal.s.B("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult6;
                }
                iN = textLayoutResult.r(fV);
            } else {
                TextLayoutResult textLayoutResult7 = this.layoutResult;
                if (textLayoutResult7 == null) {
                    p013kotlin.jvm.internal.s.B("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult7;
                }
                iN = textLayoutResult.n();
            }
            return c(iF, i(iN - 1, f5692j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int current) {
        int iR;
        TextLayoutResult textLayoutResult = null;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        try {
            g4.p pVar = this.node;
            if (pVar == null) {
                p013kotlin.jvm.internal.s.B("node");
                pVar = null;
            }
            int iRound = Math.round(pVar.i().h());
            int iJ = bo0.n.j(d().length(), current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ = textLayoutResult2.q(iJ);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                p013kotlin.jvm.internal.s.B("layoutResult");
                textLayoutResult3 = null;
            }
            float fV = textLayoutResult3.v(iQ) - iRound;
            if (fV > BitmapDescriptorFactory.HUE_RED) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    p013kotlin.jvm.internal.s.B("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult4;
                }
                iR = textLayoutResult.r(fV);
            } else {
                iR = 0;
            }
            if (iJ == d().length() && iR < iQ) {
                iR++;
            }
            return c(i(iR, f5691i), iJ);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String text, TextLayoutResult layoutResult, g4.p node) {
        f(text);
        this.layoutResult = layoutResult;
        this.node = node;
    }

    private e() {
        this.tempRect = new Rect();
    }
}
