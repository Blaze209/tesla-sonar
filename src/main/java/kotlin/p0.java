package kotlin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.SpanStyle;
import i4.TextLayoutResult;
import i4.d;
import i4.o0;
import j3.g;
import j3.h;
import j3.j;
import j3.n;
import java.util.List;
import jn0.h0;
import k3.j1;
import k3.n3;
import k3.p1;
import k3.r3;
import o4.ImeOptions;
import o4.TextFieldValue;
import o4.TransformedText;
import o4.f0;
import o4.i;
import o4.k;
import o4.q0;
import o4.w0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p007h2.b0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.u;
import w4.r;
import w4.t;
import wn0.l;
import z3.v;
import z3.w;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lb2/p0;", "", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b2.p0$a, reason: from kotlin metadata */
    @p013kotlin.Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JH\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010#\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$JG\u0010+\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b+\u0010,J/\u0010/\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020.H\u0001¢\u0006\u0004\b/\u00100JC\u00109\u001a\u00020\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\b\u00108\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b9\u0010:JF\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020.2\u0006\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\b2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>JW\u0010E\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bE\u0010FJW\u0010G\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bG\u0010FJ3\u0010H\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bH\u0010IJ \u0010M\u001a\u00020K2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010L\u001a\u00020Kø\u0001\u0000¢\u0006\u0004\bM\u0010N\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"Lb2/p0$a;", "", "<init>", "()V", "Lk3/j1;", "canvas", "Li4/p0;", "range", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "Lk3/r3;", "paint", "Ljn0/h0;", "c", "(Lk3/j1;JLo4/f0;Li4/m0;Lk3/r3;)V", "Lb2/l0;", "textDelegate", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lw4/t;", "layoutDirection", "prevResultText", "Ljn0/w;", "", DateTokenConverter.CONVERTER_KEY, "(Lb2/l0;JLw4/t;Li4/m0;)Ljn0/w;", "Lo4/o0;", "value", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "highlightPaint", "Lk3/p1;", "selectionBackgroundColor", "b", "(Lk3/j1;Lo4/o0;JJLo4/f0;Li4/m0;Lk3/r3;J)V", "Lz3/v;", "layoutCoordinates", "Lo4/w0;", "textInputSession", "", "hasFocus", "e", "(Lo4/o0;Lb2/l0;Li4/m0;Lz3/v;Lo4/w0;ZLo4/f0;)V", "textFieldValue", "Lb2/c1;", "k", "(Lo4/w0;Lo4/o0;Lo4/f0;Lb2/c1;)V", "", "Lo4/i;", "ops", "Lo4/k;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "g", "(Ljava/util/List;Lo4/k;Lwn0/l;Lo4/w0;)V", "Lj3/g;", "position", "j", "(JLb2/c1;Lo4/k;Lo4/f0;Lwn0/l;)V", "Lo4/q0;", "textInputService", "Lo4/s;", "imeOptions", "Lo4/r;", "onImeActionPerformed", IntegerTokenConverter.CONVERTER_KEY, "(Lo4/q0;Lo4/o0;Lo4/k;Lo4/s;Lwn0/l;Lwn0/l;)Lo4/w0;", "h", "f", "(Lo4/w0;Lo4/k;Lwn0/l;)V", "compositionRange", "Lo4/x0;", "transformed", "a", "(JLo4/x0;)Lo4/x0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: b2.p0$a$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo4/i;", "it", "Ljn0/h0;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
        static final class C0293a extends u implements l<List<? extends i>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f15848c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l<TextFieldValue, h0> f15849d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ n0<w0> f15850e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0293a(k kVar, l<? super TextFieldValue, h0> lVar, n0<w0> n0Var) {
                super(1);
                this.f15848c = kVar;
                this.f15849d = lVar;
                this.f15850e = n0Var;
            }

            public final void a(List<? extends i> list) {
                p0.INSTANCE.g(list, this.f15848c, this.f15849d, this.f15850e.f86529a);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(List<? extends i> list) {
                a(list);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b2.p0$a$b */
        @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/n3;", "matrix", "Ljn0/h0;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements l<n3, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v f15851c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(v vVar) {
                super(1);
                this.f15851c = vVar;
            }

            public final void a(float[] fArr) {
                if (this.f15851c.b0()) {
                    w.d(this.f15851c).G(this.f15851c, fArr);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(n3 n3Var) {
                a(n3Var.getValues());
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c(j1 canvas, long range, f0 offsetMapping, TextLayoutResult textLayoutResult, r3 paint) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(i4.p0.l(range));
            int iOriginalToTransformed2 = offsetMapping.originalToTransformed(i4.p0.k(range));
            if (iOriginalToTransformed != iOriginalToTransformed2) {
                canvas.f(textLayoutResult.z(iOriginalToTransformed, iOriginalToTransformed2), paint);
            }
        }

        public final TransformedText a(long compositionRange, TransformedText transformed) {
            int iOriginalToTransformed = transformed.getOffsetMapping().originalToTransformed(i4.p0.n(compositionRange));
            int iOriginalToTransformed2 = transformed.getOffsetMapping().originalToTransformed(i4.p0.i(compositionRange));
            int iMin = Math.min(iOriginalToTransformed, iOriginalToTransformed2);
            int iMax = Math.max(iOriginalToTransformed, iOriginalToTransformed2);
            d.a aVar = new d.a(transformed.getText());
            aVar.c(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null), iMin, iMax);
            return new TransformedText(aVar.o(), transformed.getOffsetMapping());
        }

        public final void b(j1 canvas, TextFieldValue value, long selectionPreviewHighlightRange, long deletionPreviewHighlightRange, f0 offsetMapping, TextLayoutResult textLayoutResult, r3 highlightPaint, long selectionBackgroundColor) throws Throwable {
            if (!i4.p0.h(selectionPreviewHighlightRange)) {
                highlightPaint.s(selectionBackgroundColor);
                c(canvas, selectionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!i4.p0.h(deletionPreviewHighlightRange)) {
                p1 p1VarL = p1.l(textLayoutResult.getLayoutInput().getStyle().j());
                if (p1VarL.getValue() == 16) {
                    p1VarL = null;
                }
                long value2 = p1VarL != null ? p1VarL.getValue() : p1.INSTANCE.a();
                highlightPaint.s(p1.p(value2, p1.s(value2) * 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
                c(canvas, deletionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!i4.p0.h(value.getSelection())) {
                highlightPaint.s(selectionBackgroundColor);
                c(canvas, value.getSelection(), offsetMapping, textLayoutResult, highlightPaint);
            }
            o0.f75773a.a(canvas, textLayoutResult);
        }

        public final jn0.w<Integer, Integer, TextLayoutResult> d(l0 textDelegate, long constraints, t layoutDirection, TextLayoutResult prevResultText) {
            TextLayoutResult textLayoutResultL = textDelegate.l(constraints, layoutDirection, prevResultText);
            return new jn0.w<>(Integer.valueOf(r.g(textLayoutResultL.getSize())), Integer.valueOf(r.f(textLayoutResultL.getSize())), textLayoutResultL);
        }

        public final void e(TextFieldValue value, l0 textDelegate, TextLayoutResult textLayoutResult, v layoutCoordinates, w0 textInputSession, boolean hasFocus, f0 offsetMapping) {
            j3.i iVarD;
            if (hasFocus) {
                int iOriginalToTransformed = offsetMapping.originalToTransformed(i4.p0.k(value.getSelection()));
                if (iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                    iVarD = textLayoutResult.d(iOriginalToTransformed);
                } else {
                    iVarD = iOriginalToTransformed != 0 ? textLayoutResult.d(iOriginalToTransformed - 1) : new j3.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, r.f(q0.b(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
                }
                long jP = layoutCoordinates.P(h.a(iVarD.getLeft(), iVarD.getTop()));
                textInputSession.c(j.b(h.a(g.m(jP), g.n(jP)), n.a(iVarD.o(), iVarD.h())));
            }
        }

        public final void f(w0 textInputSession, k editProcessor, l<? super TextFieldValue, h0> onValueChange) {
            onValueChange.invoke(TextFieldValue.c(editProcessor.getMBufferState(), null, 0L, null, 3, null));
            textInputSession.a();
        }

        public final void g(List<? extends i> ops, k editProcessor, l<? super TextFieldValue, h0> onValueChange, w0 session) {
            TextFieldValue textFieldValueB = editProcessor.b(ops);
            if (session != null) {
                session.d(null, textFieldValueB);
            }
            onValueChange.invoke(textFieldValueB);
        }

        public final w0 h(q0 textInputService, TextFieldValue value, k editProcessor, ImeOptions imeOptions, l<? super TextFieldValue, h0> onValueChange, l<? super o4.r, h0> onImeActionPerformed) {
            return i(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, o4.w0] */
        public final w0 i(q0 textInputService, TextFieldValue value, k editProcessor, ImeOptions imeOptions, l<? super TextFieldValue, h0> onValueChange, l<? super o4.r, h0> onImeActionPerformed) {
            n0 n0Var = new n0();
            ?? D = textInputService.d(value, imeOptions, new C0293a(editProcessor, onValueChange, n0Var), onImeActionPerformed);
            n0Var.f86529a = D;
            return D;
        }

        public final void j(long position, c1 textLayoutResult, k editProcessor, f0 offsetMapping, l<? super TextFieldValue, h0> onValueChange) {
            onValueChange.invoke(TextFieldValue.c(editProcessor.getMBufferState(), null, i4.q0.a(offsetMapping.transformedToOriginal(c1.e(textLayoutResult, position, false, 2, null))), null, 5, null));
        }

        public final void k(w0 textInputSession, TextFieldValue textFieldValue, f0 offsetMapping, c1 textLayoutResult) {
            v decorationBoxCoordinates;
            v innerTextFieldCoordinates = textLayoutResult.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.b0() || (decorationBoxCoordinates = textLayoutResult.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.e(textFieldValue, offsetMapping, textLayoutResult.getValue(), new b(innerTextFieldCoordinates), b0.b(innerTextFieldCoordinates), innerTextFieldCoordinates.F(decorationBoxCoordinates, false));
        }

        private Companion() {
        }
    }
}
