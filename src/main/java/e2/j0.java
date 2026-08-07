package e2;

import android.graphics.PointF;
import androidx.compose.ui.platform.e3;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import i4.TextLayoutResult;
import kotlin.c1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0017\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a6\u0010\u001b\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a.\u0010\u001e\u001a\u00020\u0000*\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a6\u0010 \u001a\u00020\u0000*\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$\u001a(\u0010(\u001a\u00020\u0005*\u00020\u00102\u0006\u0010%\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a&\u0010*\u001a\u00020\u0005*\u00020\u001d2\u0006\u0010%\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010-\u001a\u00020\u0006*\u00020,2\u0006\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010.\u001a:\u00102\u001a\u00020\u0000*\u0004\u0018\u00010/2\u0006\u0010\u0012\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a2\u00104\u001a\u00020\u0005*\u00020/2\u0006\u0010%\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u0001002\b\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a<\u00108\u001a\u00020\u0000*\u0004\u0018\u00010,2\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u0001002\b\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a(\u0010;\u001a\u00020\u0005*\u00020/2\u0006\u0010:\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a#\u0010@\u001a\u00020>2\u0012\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0=\"\u00020>H\u0002¢\u0006\u0004\b@\u0010A\u001a\"\u0010D\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Li4/p0;", "", "text", "m", "(JLjava/lang/CharSequence;)J", "", "", "A", "(I)Z", "C", "D", "B", "Landroid/graphics/PointF;", "Lj3/g;", Gender.FEMALE, "(Landroid/graphics/PointF;)J", "Le2/w0;", "Lj3/i;", "rectInScreen", "Li4/g0;", "granularity", "Li4/k0;", "inclusionStrategy", "w", "(Le2/w0;Lj3/i;ILi4/k0;)J", "startRectInScreen", "endRectInScreen", "y", "(Le2/w0;Lj3/i;Lj3/i;ILi4/k0;)J", "Lb2/b0;", "v", "(Lb2/b0;Lj3/i;ILi4/k0;)J", "x", "(Lb2/b0;Lj3/i;Lj3/i;ILi4/k0;)J", "offset", "E", "(Ljava/lang/CharSequence;I)J", "pointInScreen", "Landroidx/compose/ui/platform/e3;", "viewConfiguration", "r", "(Le2/w0;JLandroidx/compose/ui/platform/e3;)I", "q", "(Lb2/b0;JLandroidx/compose/ui/platform/e3;)I", "Li4/m0;", "z", "(Li4/m0;I)Z", "Li4/j;", "Lz3/v;", "layoutCoordinates", "u", "(Li4/j;Lj3/i;Lz3/v;ILi4/k0;)J", "s", "(Li4/j;JLz3/v;Landroidx/compose/ui/platform/e3;)I", "startPointInScreen", "endPointerInScreen", "t", "(Li4/m0;JJLz3/v;Landroidx/compose/ui/platform/e3;)J", "localPoint", "p", "(Li4/j;JLandroidx/compose/ui/platform/e3;)I", "", "Lo4/i;", "editCommands", "n", "([Lo4/i;)Lo4/i;", "a", "b", "o", "(JJ)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j0 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"e2/j0$a", "Lo4/i;", "Lo4/l;", "buffer", "Ljn0/h0;", "a", "(Lo4/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements o4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o4.i[] f61495a;

        a(o4.i[] iVarArr) {
            this.f61495a = iVarArr;
        }

        @Override // o4.i
        public void a(o4.l buffer) {
            for (o4.i iVar : this.f61495a) {
                iVar.a(buffer);
            }
        }
    }

    private static final boolean A(int i11) {
        int type = Character.getType(i11);
        return type == 14 || type == 13 || i11 == 10;
    }

    private static final boolean B(int i11) {
        int type = Character.getType(i11);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean C(int i11) {
        return Character.isWhitespace(i11) || i11 == 160;
    }

    private static final boolean D(int i11) {
        return C(i11) && !A(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long E(CharSequence charSequence, int i11) {
        int iCharCount = i11;
        while (iCharCount > 0) {
            int iC = e.c(charSequence, iCharCount);
            if (!C(iC)) {
                break;
            }
            iCharCount -= Character.charCount(iC);
        }
        while (i11 < charSequence.length()) {
            int iB = e.b(charSequence, i11);
            if (!C(iB)) {
                break;
            }
            i11 += e.a(iB);
        }
        return i4.q0.b(iCharCount, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long F(PointF pointF) {
        return j3.h.a(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j11, CharSequence charSequence) {
        int iN = i4.p0.n(j11);
        int i11 = i4.p0.i(j11);
        int iCodePointBefore = iN > 0 ? Character.codePointBefore(charSequence, iN) : 10;
        int iCodePointAt = i11 < charSequence.length() ? Character.codePointAt(charSequence, i11) : 10;
        if (D(iCodePointBefore) && (C(iCodePointAt) || B(iCodePointAt))) {
            do {
                iN -= Character.charCount(iCodePointBefore);
                if (iN == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iN);
            } while (D(iCodePointBefore));
            return i4.q0.b(iN, i11);
        }
        if (!D(iCodePointAt)) {
            return j11;
        }
        if (!C(iCodePointBefore) && !B(iCodePointBefore)) {
            return j11;
        }
        do {
            i11 += Character.charCount(iCodePointAt);
            if (i11 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, i11);
        } while (D(iCodePointAt));
        return i4.q0.b(iN, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o4.i n(o4.i... iVarArr) {
        return new a(iVarArr);
    }

    private static final long o(long j11, long j12) {
        return i4.q0.b(Math.min(i4.p0.n(j11), i4.p0.n(j11)), Math.max(i4.p0.i(j12), i4.p0.i(j12)));
    }

    private static final int p(i4.j jVar, long j11, e3 e3Var) {
        float fD = e3Var != null ? e3Var.d() : BitmapDescriptorFactory.HUE_RED;
        int iP = jVar.p(j3.g.n(j11));
        if (j3.g.n(j11) < jVar.t(iP) - fD || j3.g.n(j11) > jVar.l(iP) + fD || j3.g.m(j11) < (-fD) || j3.g.m(j11) > jVar.getWidth() + fD) {
            return -1;
        }
        return iP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(kotlin.b0 b0Var, long j11, e3 e3Var) {
        TextLayoutResult value;
        i4.j multiParagraph;
        c1 c1VarJ = b0Var.j();
        if (c1VarJ == null || (value = c1VarJ.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return s(multiParagraph, j11, b0Var.i(), e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(w0 w0Var, long j11, e3 e3Var) {
        throw null;
    }

    private static final int s(i4.j jVar, long j11, z3.v vVar, e3 e3Var) {
        long jN;
        int iP;
        if (vVar == null || (iP = p(jVar, (jN = vVar.n(j11)), e3Var)) == -1) {
            return -1;
        }
        return jVar.u(j3.g.g(jN, BitmapDescriptorFactory.HUE_RED, (jVar.t(iP) + jVar.l(iP)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long t(TextLayoutResult textLayoutResult, long j11, long j12, z3.v vVar, e3 e3Var) {
        if (textLayoutResult == null || vVar == null) {
            return i4.p0.INSTANCE.a();
        }
        long jN = vVar.n(j11);
        long jN2 = vVar.n(j12);
        int iP = p(textLayoutResult.getMultiParagraph(), jN, e3Var);
        int iP2 = p(textLayoutResult.getMultiParagraph(), jN2, e3Var);
        if (iP != -1) {
            if (iP2 != -1) {
                iP = Math.min(iP, iP2);
            }
            iP2 = iP;
        } else if (iP2 == -1) {
            return i4.p0.INSTANCE.a();
        }
        float fV = (textLayoutResult.v(iP2) + textLayoutResult.m(iP2)) / 2;
        return textLayoutResult.getMultiParagraph().z(new j3.i(Math.min(j3.g.m(jN), j3.g.m(jN2)), fV - 0.1f, Math.max(j3.g.m(jN), j3.g.m(jN2)), fV + 0.1f), i4.g0.INSTANCE.a(), i4.k0.INSTANCE.g());
    }

    private static final long u(i4.j jVar, j3.i iVar, z3.v vVar, int i11, i4.k0 k0Var) {
        return (jVar == null || vVar == null) ? i4.p0.INSTANCE.a() : jVar.z(iVar.u(vVar.n(j3.g.INSTANCE.c())), i11, k0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(kotlin.b0 b0Var, j3.i iVar, int i11, i4.k0 k0Var) {
        TextLayoutResult value;
        c1 c1VarJ = b0Var.j();
        return u((c1VarJ == null || (value = c1VarJ.getValue()) == null) ? null : value.getMultiParagraph(), iVar, b0Var.i(), i11, k0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(w0 w0Var, j3.i iVar, int i11, i4.k0 k0Var) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long x(kotlin.b0 b0Var, j3.i iVar, j3.i iVar2, int i11, i4.k0 k0Var) {
        long jV = v(b0Var, iVar, i11, k0Var);
        if (i4.p0.h(jV)) {
            return i4.p0.INSTANCE.a();
        }
        long jV2 = v(b0Var, iVar2, i11, k0Var);
        return i4.p0.h(jV2) ? i4.p0.INSTANCE.a() : o(jV, jV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(w0 w0Var, j3.i iVar, j3.i iVar2, int i11, i4.k0 k0Var) {
        long jW = w(w0Var, iVar, i11, k0Var);
        if (i4.p0.h(jW)) {
            return i4.p0.INSTANCE.a();
        }
        long jW2 = w(w0Var, iVar2, i11, k0Var);
        return i4.p0.h(jW2) ? i4.p0.INSTANCE.a() : o(jW, jW2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(TextLayoutResult textLayoutResult, int i11) {
        int iQ = textLayoutResult.q(i11);
        if (i11 == textLayoutResult.u(iQ) || i11 == TextLayoutResult.p(textLayoutResult, iQ, false, 2, null)) {
            return textLayoutResult.y(i11) != textLayoutResult.c(i11);
        }
        return textLayoutResult.c(i11) != textLayoutResult.c(i11 - 1);
    }
}
