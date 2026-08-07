package p2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import g4.v;
import i4.TextStyle;
import i4.s0;
import jn0.h0;
import k3.g4;
import k3.p3;
import k3.q3;
import k3.s1;
import o4.TransformedText;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.x;
import p015o1.Function1;
import p016o2.Typography;
import p016o2.n0;
import p016o2.p0;
import p016o2.t;
import p016o2.w;
import p019p1.l1;
import p019p1.m1;
import p019p1.r1;
import p020r2.d4;
import p020r2.h2;
import p020r2.k2;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y3;
import q1.BorderStroke;
import v1.y;
import z3.i0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aõ\u0001\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a0\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a(\u0010$\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010(\u001a\u00020&*\u00020&2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b(\u0010)\u001a#\u0010.\u001a\u00020&*\u00020&2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/\u001a\u0019\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b3\u00104\u001a\u0019\u00105\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b5\u00104\u001aH\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u000207H\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u001a\u0010B\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\b@\u0010A\"\u001a\u0010G\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u001a\u0010J\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010F\"\u001a\u0010L\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010D\u001a\u0004\bK\u0010F\"\u001a\u0010N\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010D\u001a\u0004\bM\u0010F\"\u001a\u0010Q\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010D\u001a\u0004\bP\u0010F\"\u001a\u0010T\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010D\u001a\u0004\bS\u0010F\"\u001a\u0010V\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010D\u001a\u0004\bU\u0010F\"\u001a\u0010Z\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010W\u001a\u0004\bX\u0010Y\"\u001a\u0010_\u001a\u0004\u0018\u00010\\*\u00020[8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006b²\u0006\f\u0010`\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010a\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lp2/p;", "type", "", "value", "Lkotlin/Function0;", "Ljn0/h0;", "innerTextField", "Lo4/z0;", "visualTransformation", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Lu1/j;", "interactionSource", "Lv1/y;", "contentPadding", "Lo2/n0;", "colors", "container", "a", "(Lp2/p;Ljava/lang/String;Lwn0/p;Lo4/z0;Lwn0/p;Lwn0/p;Lwn0/p;Lwn0/p;Lwn0/p;Lwn0/p;Lwn0/p;ZZZLu1/j;Lv1/y;Lo2/n0;Lwn0/p;Lr2/l;III)V", "Lk3/p1;", "contentColor", "Li4/r0;", "textStyle", "content", DateTokenConverter.CONVERTER_KEY, "(JLi4/r0;Lwn0/p;Lr2/l;I)V", "e", "(JLwn0/p;Lr2/l;I)V", "Landroidx/compose/ui/d;", "defaultErrorMessage", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;ZLjava/lang/String;)Landroidx/compose/ui/d;", "Lk3/s1;", "color", "Lk3/g4;", "shape", "u", "(Landroidx/compose/ui/d;Lk3/s1;Lk3/g4;)Landroidx/compose/ui/d;", "Lz3/w0;", "placeable", "", "v", "(Lz3/w0;)I", "t", "focused", "Lw4/h;", "focusedBorderThickness", "unfocusedBorderThickness", "Lr2/y3;", "Lq1/g;", "h", "(ZZZLo2/n0;FFLr2/l;I)Lr2/y3;", "Lw4/b;", "J", "s", "()J", "ZeroConstraints", "b", Gender.FEMALE, "r", "()F", "TextFieldPadding", "c", "j", "HorizontalIconPadding", "q", "SupportingTopPadding", "p", "PrefixSuffixTextPadding", "f", "o", "MinTextLineHeight", "g", "m", "MinFocusedLabelLineHeight", "n", "MinSupportingTextLineHeight", "Landroidx/compose/ui/d;", "k", "()Landroidx/compose/ui/d;", "IconDefaultSizeModifier", "Lz3/q;", "", "l", "(Lz3/q;)Ljava/lang/Object;", "layoutId", "showPlaceholder", "showPrefixSuffix", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f100779b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f100784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f100785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final androidx.compose.ui.d f100786i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f100778a = w4.c.a(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f100780c = w4.h.g(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f100781d = w4.h.g(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f100782e = w4.h.g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f100783f = w4.h.g(24);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/m;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<j3.m, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f100787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<j3.m> f100788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, p1<j3.m> p1Var) {
            super(1);
            this.f100787c = f11;
            this.f100788d = p1Var;
        }

        public final void a(long j11) {
            float fK = j3.m.k(j11) * this.f100787c;
            float fI = j3.m.i(j11) * this.f100787c;
            if (j3.m.k(this.f100788d.getValue().getPackedValue()) == fK && j3.m.i(this.f100788d.getValue().getPackedValue()) == fI) {
                return;
            }
            this.f100788d.setValue(j3.m.c(j3.n.a(fK, fI)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j3.m mVar) {
            a(mVar.getPackedValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<j3.m> f100789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y f100790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100791e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p1<j3.m> p1Var, y yVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f100789c = p1Var;
            this.f100790d = yVar;
            this.f100791e = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(157291737, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
            }
            androidx.compose.ui.d dVarK = w.k(androidx.compose.ui.layout.a.b(androidx.compose.ui.d.INSTANCE, "Container"), new x(this.f100789c) { // from class: p2.j.b.a
                @Override // p013kotlin.jvm.internal.x, co0.n
                public Object get() {
                    return ((p1) this.receiver).getValue();
                }
            }, this.f100790d);
            wn0.p<p020r2.l, Integer, h0> pVar = this.f100791e;
            i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarK);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVar, 0);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f100792c = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1750327932, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
            }
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.INSTANCE, "Container");
            wn0.p<p020r2.l, Integer, h0> pVar = this.f100792c;
            i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarB);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVar, 0);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f100793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextStyle f100794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f100795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y3<k3.p1> f100796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f100798h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ y3<k3.p1> f100799i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(TextStyle textStyle, TextStyle textStyle2, float f11, y3<k3.p1> y3Var, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, boolean z11, y3<k3.p1> y3Var2) {
            super(2);
            this.f100793c = textStyle;
            this.f100794d = textStyle2;
            this.f100795e = f11;
            this.f100796f = y3Var;
            this.f100797g = pVar;
            this.f100798h = z11;
            this.f100799i = y3Var2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1236585568, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
            }
            TextStyle textStyleC = s0.c(this.f100793c, this.f100794d, this.f100795e);
            boolean z11 = this.f100798h;
            y3<k3.p1> y3Var = this.f100799i;
            if (z11) {
                textStyleC = TextStyle.c(textStyleC, y3Var.getValue().getValue(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            }
            j.d(this.f100796f.getValue().getValue(), textStyleC, this.f100797g, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f100800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100801d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j11, wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f100800c = j11;
            this.f100801d = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-130107406, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
            }
            j.e(this.f100800c, this.f100801d, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.q<androidx.compose.ui.d, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<Float> f100802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f100803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f100804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100805f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<androidx.compose.ui.graphics.c, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<Float> f100806c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y3<Float> y3Var) {
                super(1);
                this.f100806c = y3Var;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.a(this.f100806c.getValue().floatValue());
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(y3<Float> y3Var, long j11, TextStyle textStyle, wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(3);
            this.f100802c = y3Var;
            this.f100803d = j11;
            this.f100804e = textStyle;
            this.f100805f = pVar;
        }

        public final void a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= lVar.n(dVar) ? 4 : 2;
            }
            if ((i11 & 19) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-660524084, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
            }
            boolean zN = lVar.n(this.f100802c);
            y3<Float> y3Var = this.f100802c;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(y3Var);
                lVar.B(objI);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.b.a(dVar, (wn0.l) objI);
            long j11 = this.f100803d;
            TextStyle textStyle = this.f100804e;
            wn0.p<p020r2.l, Integer, h0> pVar = this.f100805f;
            i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarA);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            j.d(j11, textStyle, pVar, lVar, 0);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.d dVar, p020r2.l lVar, Integer num) {
            a(dVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<Float> f100807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f100808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f100809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100810f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<androidx.compose.ui.graphics.c, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<Float> f100811c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y3<Float> y3Var) {
                super(1);
                this.f100811c = y3Var;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.a(this.f100811c.getValue().floatValue());
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(y3<Float> y3Var, long j11, TextStyle textStyle, wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f100807c = y3Var;
            this.f100808d = j11;
            this.f100809e = textStyle;
            this.f100810f = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(274398694, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            boolean zN = lVar.n(this.f100807c);
            y3<Float> y3Var = this.f100807c;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(y3Var);
                lVar.B(objI);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.b.a(companion, (wn0.l) objI);
            long j11 = this.f100808d;
            TextStyle textStyle = this.f100809e;
            wn0.p<p020r2.l, Integer, h0> pVar = this.f100810f;
            i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarA);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            j.d(j11, textStyle, pVar, lVar, 0);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<Float> f100812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f100813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f100814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100815f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<androidx.compose.ui.graphics.c, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<Float> f100816c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y3<Float> y3Var) {
                super(1);
                this.f100816c = y3Var;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.a(this.f100816c.getValue().floatValue());
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(y3<Float> y3Var, long j11, TextStyle textStyle, wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f100812c = y3Var;
            this.f100813d = j11;
            this.f100814e = textStyle;
            this.f100815f = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1526229403, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            boolean zN = lVar.n(this.f100812c);
            y3<Float> y3Var = this.f100812c;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(y3Var);
                lVar.B(objI);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.b.a(companion, (wn0.l) objI);
            long j11 = this.f100813d;
            TextStyle textStyle = this.f100814e;
            wn0.p<p020r2.l, Integer, h0> pVar = this.f100815f;
            i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarA);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            j.d(j11, textStyle, pVar, lVar, 0);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f100817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextStyle f100818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100819e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(long j11, TextStyle textStyle, wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f100817c = j11;
            this.f100818d = textStyle;
            this.f100819e = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1263707005, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
            }
            j.d(this.f100817c, this.f100818d, this.f100819e, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: p2.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class C2135j extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f100820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100821d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2135j(long j11, wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f100820c = j11;
            this.f100821d = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2079816678, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
            }
            j.e(this.f100820c, this.f100821d, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class k extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<Float> f100822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(y3<Float> y3Var) {
            super(0);
            this.f100822c = y3Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f100822c.getValue().floatValue() > BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class l extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<Float> f100823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(y3<Float> y3Var) {
            super(0);
            this.f100823c = y3Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f100823c.getValue().floatValue() > BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p2.p f100824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f100825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ z0 f100827f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100828g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100829h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100830i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100831j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100832k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100833l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100834m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f100835n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f100836o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f100837p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ u1.j f100838q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ y f100839r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ n0 f100840s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100841t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f100842u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f100843v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f100844w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(p2.p pVar, String str, wn0.p<? super p020r2.l, ? super Integer, h0> pVar2, z0 z0Var, wn0.p<? super p020r2.l, ? super Integer, h0> pVar3, wn0.p<? super p020r2.l, ? super Integer, h0> pVar4, wn0.p<? super p020r2.l, ? super Integer, h0> pVar5, wn0.p<? super p020r2.l, ? super Integer, h0> pVar6, wn0.p<? super p020r2.l, ? super Integer, h0> pVar7, wn0.p<? super p020r2.l, ? super Integer, h0> pVar8, wn0.p<? super p020r2.l, ? super Integer, h0> pVar9, boolean z11, boolean z12, boolean z13, u1.j jVar, y yVar, n0 n0Var, wn0.p<? super p020r2.l, ? super Integer, h0> pVar10, int i11, int i12, int i13) {
            super(2);
            this.f100824c = pVar;
            this.f100825d = str;
            this.f100826e = pVar2;
            this.f100827f = z0Var;
            this.f100828g = pVar3;
            this.f100829h = pVar4;
            this.f100830i = pVar5;
            this.f100831j = pVar6;
            this.f100832k = pVar7;
            this.f100833l = pVar8;
            this.f100834m = pVar9;
            this.f100835n = z11;
            this.f100836o = z12;
            this.f100837p = z13;
            this.f100838q = jVar;
            this.f100839r = yVar;
            this.f100840s = n0Var;
            this.f100841t = pVar10;
            this.f100842u = i11;
            this.f100843v = i12;
            this.f100844w = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            j.a(this.f100824c, this.f100825d, this.f100826e, this.f100827f, this.f100828g, this.f100829h, this.f100830i, this.f100831j, this.f100832k, this.f100833l, this.f100834m, this.f100835n, this.f100836o, this.f100837p, this.f100838q, this.f100839r, this.f100840s, this.f100841t, lVar, k2.a(this.f100842u | 1), k2.a(this.f100843v), this.f100844w);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f100845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextStyle f100846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f100848f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(long j11, TextStyle textStyle, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f100845c = j11;
            this.f100846d = textStyle;
            this.f100847e = pVar;
            this.f100848f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            j.d(this.f100845c, this.f100846d, this.f100847e, lVar, k2.a(this.f100848f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f100849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f100851e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(long j11, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f100849c = j11;
            this.f100850d = pVar;
            this.f100851e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            j.e(this.f100849c, this.f100850d, lVar, k2.a(this.f100851e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100853b;

        static {
            int[] iArr = new int[p2.p.values().length];
            try {
                iArr[p2.p.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p2.p.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100852a = iArr;
            int[] iArr2 = new int[p2.d.values().length];
            try {
                iArr2[p2.d.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[p2.d.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p2.d.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f100853b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends u implements wn0.l<g4.y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f100854c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f100854c = str;
        }

        public final void a(g4.y yVar) {
            v.o(yVar, this.f100854c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(g4.y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh3/d;", "Lh3/i;", "a", "(Lh3/d;)Lh3/i;"}, k = 3, mv = {1, 8, 0})
    static final class r extends u implements wn0.l<h3.d, h3.i> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g4 f100855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s1 f100856d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<m3.f, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p3 f100857c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ s1 f100858d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p3 p3Var, s1 s1Var) {
                super(1);
                this.f100857c = p3Var;
                this.f100858d = s1Var;
            }

            public final void a(m3.f fVar) {
                q3.d(fVar, this.f100857c, this.f100858d.a(), BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
                a(fVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(g4 g4Var, s1 s1Var) {
            super(1);
            this.f100855c = g4Var;
            this.f100856d = s1Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h3.i invoke(h3.d dVar) {
            return dVar.n(new a(this.f100855c.a(dVar.b(), dVar.getLayoutDirection(), dVar), this.f100856d));
        }
    }

    static {
        float f11 = 16;
        f100779b = w4.h.g(f11);
        f100784g = w4.h.g(f11);
        f100785h = w4.h.g(f11);
        float f12 = 48;
        f100786i = androidx.compose.foundation.layout.x.a(androidx.compose.ui.d.INSTANCE, w4.h.g(f12), w4.h.g(f12));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0151  */
    /* JADX WARN: Code duplicated, block: B:103:0x0155  */
    /* JADX WARN: Code duplicated, block: B:105:0x015f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:113:0x0177  */
    /* JADX WARN: Code duplicated, block: B:115:0x0181  */
    /* JADX WARN: Code duplicated, block: B:116:0x0184  */
    /* JADX WARN: Code duplicated, block: B:118:0x0189  */
    /* JADX WARN: Code duplicated, block: B:121:0x0193  */
    /* JADX WARN: Code duplicated, block: B:123:0x019a  */
    /* JADX WARN: Code duplicated, block: B:125:0x019e  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01da  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:159:0x0205  */
    /* JADX WARN: Code duplicated, block: B:163:0x020f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0212  */
    /* JADX WARN: Code duplicated, block: B:166:0x0216  */
    /* JADX WARN: Code duplicated, block: B:168:0x021c  */
    /* JADX WARN: Code duplicated, block: B:169:0x021f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0226  */
    /* JADX WARN: Code duplicated, block: B:174:0x0229  */
    /* JADX WARN: Code duplicated, block: B:176:0x022d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0233  */
    /* JADX WARN: Code duplicated, block: B:182:0x023b  */
    /* JADX WARN: Code duplicated, block: B:183:0x023e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0242  */
    /* JADX WARN: Code duplicated, block: B:187:0x0248  */
    /* JADX WARN: Code duplicated, block: B:191:0x0255  */
    /* JADX WARN: Code duplicated, block: B:197:0x027d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x027f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0281  */
    /* JADX WARN: Code duplicated, block: B:201:0x0285  */
    /* JADX WARN: Code duplicated, block: B:202:0x0287  */
    /* JADX WARN: Code duplicated, block: B:204:0x028b  */
    /* JADX WARN: Code duplicated, block: B:205:0x028d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0291  */
    /* JADX WARN: Code duplicated, block: B:208:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:211:0x029b  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:218:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:221:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:223:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:227:0x02be  */
    /* JADX WARN: Code duplicated, block: B:230:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:231:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:234:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:235:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:238:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:240:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:243:0x0325  */
    /* JADX WARN: Code duplicated, block: B:244:0x0328  */
    /* JADX WARN: Code duplicated, block: B:246:0x032e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0331  */
    /* JADX WARN: Code duplicated, block: B:250:0x035e  */
    /* JADX WARN: Code duplicated, block: B:252:0x036c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0391  */
    /* JADX WARN: Code duplicated, block: B:266:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:271:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:273:0x03af  */
    /* JADX WARN: Code duplicated, block: B:276:0x03db  */
    /* JADX WARN: Code duplicated, block: B:277:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:280:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:282:0x03fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:283:0x0400  */
    /* JADX WARN: Code duplicated, block: B:284:0x0403  */
    /* JADX WARN: Code duplicated, block: B:286:0x0409  */
    /* JADX WARN: Code duplicated, block: B:289:0x0410  */
    /* JADX WARN: Code duplicated, block: B:292:0x042c  */
    /* JADX WARN: Code duplicated, block: B:293:0x043a  */
    /* JADX WARN: Code duplicated, block: B:296:0x0449  */
    /* JADX WARN: Code duplicated, block: B:298:0x044c  */
    /* JADX WARN: Code duplicated, block: B:300:0x044f  */
    /* JADX WARN: Code duplicated, block: B:301:0x0452  */
    /* JADX WARN: Code duplicated, block: B:303:0x0458  */
    /* JADX WARN: Code duplicated, block: B:306:0x045f  */
    /* JADX WARN: Code duplicated, block: B:309:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:310:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:313:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:315:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:318:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:320:0x04d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:322:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:325:0x04df  */
    /* JADX WARN: Code duplicated, block: B:328:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:329:0x0504  */
    /* JADX WARN: Code duplicated, block: B:332:0x0511  */
    /* JADX WARN: Code duplicated, block: B:334:0x0514  */
    /* JADX WARN: Code duplicated, block: B:337:0x0519  */
    /* JADX WARN: Code duplicated, block: B:339:0x051f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:341:0x0522  */
    /* JADX WARN: Code duplicated, block: B:344:0x052a  */
    /* JADX WARN: Code duplicated, block: B:347:0x0572  */
    /* JADX WARN: Code duplicated, block: B:348:0x057e  */
    /* JADX WARN: Code duplicated, block: B:351:0x058b  */
    /* JADX WARN: Code duplicated, block: B:353:0x058e  */
    /* JADX WARN: Code duplicated, block: B:355:0x0591  */
    /* JADX WARN: Code duplicated, block: B:356:0x0594  */
    /* JADX WARN: Code duplicated, block: B:358:0x059a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:359:0x059c  */
    /* JADX WARN: Code duplicated, block: B:362:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:365:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:366:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:369:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:371:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:374:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:376:0x05e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:377:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:380:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:383:0x0636  */
    /* JADX WARN: Code duplicated, block: B:386:0x0644  */
    /* JADX WARN: Code duplicated, block: B:387:0x0647  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:390:0x064f  */
    /* JADX WARN: Code duplicated, block: B:393:0x0663  */
    /* JADX WARN: Code duplicated, block: B:395:0x066b  */
    /* JADX WARN: Code duplicated, block: B:398:0x0690  */
    /* JADX WARN: Code duplicated, block: B:401:0x069e  */
    /* JADX WARN: Code duplicated, block: B:402:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:405:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:408:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:411:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:414:0x06df  */
    /* JADX WARN: Code duplicated, block: B:417:0x0725  */
    /* JADX WARN: Code duplicated, block: B:418:0x072f  */
    /* JADX WARN: Code duplicated, block: B:421:0x0739  */
    /* JADX WARN: Code duplicated, block: B:424:0x074d  */
    /* JADX WARN: Code duplicated, block: B:426:0x0755  */
    /* JADX WARN: Code duplicated, block: B:429:0x0779  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:432:0x0784  */
    /* JADX WARN: Code duplicated, block: B:435:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:438:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:441:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:442:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:445:0x082d  */
    /* JADX WARN: Code duplicated, block: B:448:0x0847  */
    /* JADX WARN: Code duplicated, block: B:453:0x0875  */
    /* JADX WARN: Code duplicated, block: B:456:0x088d  */
    /* JADX WARN: Code duplicated, block: B:459:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:462:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:465:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:468:0x0912  */
    /* JADX WARN: Code duplicated, block: B:471:0x0927  */
    /* JADX WARN: Code duplicated, block: B:472:0x092c  */
    /* JADX WARN: Code duplicated, block: B:475:0x094a  */
    /* JADX WARN: Code duplicated, block: B:476:0x0952  */
    /* JADX WARN: Code duplicated, block: B:479:0x0976  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:480:0x0979  */
    /* JADX WARN: Code duplicated, block: B:483:0x0994  */
    /* JADX WARN: Code duplicated, block: B:485:0x0997  */
    /* JADX WARN: Code duplicated, block: B:486:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:488:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:491:0x09ec  */
    /* JADX WARN: Code duplicated, block: B:493:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:502:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:504:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0106  */
    /* JADX WARN: Code duplicated, block: B:79:0x010d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0111  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0128  */
    /* JADX WARN: Code duplicated, block: B:90:0x012f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:99:0x014a  */
    public static final void a(p2.p pVar, String str, wn0.p<? super p020r2.l, ? super Integer, h0> pVar2, z0 z0Var, wn0.p<? super p020r2.l, ? super Integer, h0> pVar3, wn0.p<? super p020r2.l, ? super Integer, h0> pVar4, wn0.p<? super p020r2.l, ? super Integer, h0> pVar5, wn0.p<? super p020r2.l, ? super Integer, h0> pVar6, wn0.p<? super p020r2.l, ? super Integer, h0> pVar7, wn0.p<? super p020r2.l, ? super Integer, h0> pVar8, wn0.p<? super p020r2.l, ? super Integer, h0> pVar9, boolean z11, boolean z12, boolean z13, u1.j jVar, y yVar, n0 n0Var, wn0.p<? super p020r2.l, ? super Integer, h0> pVar10, p020r2.l lVar, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i41;
        int i42;
        int i43;
        int i44;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar11;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar12;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar13;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar14;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar15;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar16;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar17;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i45;
        boolean z18;
        boolean z19;
        Object objI;
        String text;
        boolean zBooleanValue;
        p2.d dVar;
        long jG;
        TextStyle bodyLarge;
        TextStyle bodySmall;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar18;
        k3.p1.Companion companion;
        boolean z21;
        long j11;
        long j12;
        boolean z22;
        boolean z23;
        long j13;
        int[] iArr;
        int i46;
        float f11;
        float f12;
        int i47;
        float f13;
        int i48;
        float f14;
        int i49;
        float f15;
        y3 y3VarD;
        int i51;
        float f16;
        int i52;
        y3 y3VarD2;
        p2.d dVar2;
        long j14;
        l3.c cVarU;
        boolean zN;
        Object objI2;
        p2.d dVar3;
        long j15;
        p2.d dVar4;
        y3 y3VarD3;
        p020r2.l lVar2;
        l3.c cVarU2;
        boolean zN2;
        Object objI3;
        y3 y3VarD4;
        float fFloatValue;
        TextStyle textStyle;
        TextStyle textStyle2;
        float f17;
        z2.a aVarE;
        Object objI4;
        p020r2.l.Companion companion2;
        TextStyle textStyle3;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar19;
        z2.a aVarE2;
        Object objI5;
        y3 y3Var;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar20;
        z2.a aVarE3;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar21;
        z2.a aVarE4;
        long jH;
        z2.a aVarE5;
        long jO;
        boolean z24;
        int i53;
        z2.a aVarE6;
        long jL;
        z2.a aVarE7;
        int i54;
        boolean z25;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar22;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar23;
        boolean z26;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar24;
        boolean z27;
        boolean z28;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar25;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar26;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar27;
        Object objI6;
        p1 p1Var;
        boolean zQ;
        Object objI7;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(1514469103);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = i11 | (lVarV.n(pVar) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= lVarV.n(str) ? 32 : 16;
        }
        int i55 = i14;
        if ((i13 & 4) == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                i55 |= lVarV.K(pVar2) ? 256 : 128;
            }
            if ((i13 & 8) != 0) {
                i55 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (lVarV.n(z0Var)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i55 |= i15;
            }
            i16 = i13 & 16;
            i17 = PKIFailureInfo.certRevoked;
            if (i16 != 0) {
                i55 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(pVar3)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i55 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i55 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(pVar4)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i55 |= i21;
            }
            i22 = i13 & 64;
            i23 = PKIFailureInfo.signerNotTrusted;
            if (i22 != 0) {
                i55 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(pVar5)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i55 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                if ((i11 & 12582912) == 0) {
                    if (lVarV.K(pVar6)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i55 |= i26;
                }
                i27 = i13 & 256;
                if (i27 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.K(pVar7)) {
                            i28 = 67108864;
                        } else {
                            i28 = 33554432;
                        }
                        i55 |= i28;
                    }
                    i29 = i13 & 512;
                    if (i29 != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar8)) {
                                i31 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i31 = 268435456;
                            }
                            i55 |= i31;
                        }
                        i32 = i13 & 1024;
                        if (i32 != 0) {
                            i33 = i12 | 6;
                        } else if ((i12 & 6) == 0) {
                            if (lVarV.K(pVar9)) {
                                i34 = 4;
                            } else {
                                i34 = 2;
                            }
                            i33 = i12 | i34;
                        } else {
                            i33 = i12;
                        }
                        i35 = i13 & 2048;
                        if (i35 != 0) {
                            i33 |= 48;
                        } else if ((i12 & 48) != 0) {
                            i33 |= lVarV.p(z11) ? 32 : 16;
                        }
                        i36 = i33;
                        i37 = i13 & 4096;
                        if (i37 != 0) {
                            i39 = i36 | KyberEngine.KyberPolyBytes;
                        } else {
                            i38 = i36;
                            if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                                i38 |= lVarV.p(z12) ? 256 : 128;
                            }
                            i39 = i38;
                        }
                        i41 = i13 & PKIFailureInfo.certRevoked;
                        if (i41 != 0) {
                            i43 = i39 | 3072;
                        } else {
                            i42 = i39;
                            if ((i12 & 3072) != 0) {
                                i42 |= lVarV.p(z13) ? 2048 : 1024;
                            }
                            i43 = i42;
                        }
                        if ((i13 & 16384) != 0) {
                            i43 |= 24576;
                        } else if ((i12 & 24576) == 0) {
                            if (lVarV.n(jVar)) {
                                i17 = 16384;
                            }
                            i43 |= i17;
                        }
                        if ((32768 & i13) != 0) {
                            i43 |= 196608;
                        } else if ((i12 & 196608) == 0) {
                            if (lVarV.n(yVar)) {
                                i44 = 131072;
                            } else {
                                i44 = 65536;
                            }
                            i43 |= i44;
                        }
                        if ((i13 & 65536) != 0) {
                            i43 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (lVarV.n(n0Var)) {
                                i23 = 1048576;
                            }
                            i43 |= i23;
                        }
                        if ((i13 & 131072) != 0) {
                            i43 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                        }
                        if ((306783379 & i55) != 306783378 && (4793491 & i43) == 4793490 && lVarV.b()) {
                            lVarV.j();
                            pVar26 = pVar4;
                            pVar24 = pVar5;
                            pVar25 = pVar6;
                            pVar22 = pVar7;
                            pVar27 = pVar8;
                            z28 = z11;
                            z26 = z12;
                            z27 = z13;
                            lVar2 = lVarV;
                            pVar23 = pVar9;
                        } else {
                            if (i19 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i22 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i27 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i29 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar8;
                            }
                            pVar16 = pVar11;
                            if (i32 != 0) {
                                pVar17 = null;
                            } else {
                                pVar17 = pVar9;
                            }
                            if (i35 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = true;
                            } else {
                                z15 = z12;
                            }
                            if (i41 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                            }
                            if ((i55 & 112) == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            i45 = i43;
                            if ((i55 & 7168) == 2048) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objI = lVarV.I();
                            if (z19 || objI == p020r2.l.INSTANCE.a()) {
                                objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                                lVarV.B(objI);
                            }
                            text = ((TransformedText) objI).getText().getText();
                            zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                            if (zBooleanValue) {
                                dVar = p2.d.Focused;
                            } else if (text.length() == 0) {
                                dVar = p2.d.UnfocusedEmpty;
                            } else {
                                dVar = p2.d.UnfocusedNotEmpty;
                            }
                            jG = n0Var.g(z15, z16, zBooleanValue);
                            Typography typographyC = t.f96158a.c(lVarV, 6);
                            bodyLarge = typographyC.getBodyLarge();
                            bodySmall = typographyC.getBodySmall();
                            pVar18 = pVar13;
                            long j16 = bodyLarge.j();
                            companion = k3.p1.INSTANCE;
                            z21 = !(k3.p1.r(j16, companion.j()) || k3.p1.r(bodySmall.j(), companion.j())) || (!k3.p1.r(bodyLarge.j(), companion.j()) && k3.p1.r(bodySmall.j(), companion.j()));
                            j11 = bodySmall.j();
                            if (z21 && j11 == 16) {
                                j11 = jG;
                            }
                            j12 = bodyLarge.j();
                            if (z21 && j12 == 16) {
                                j12 = jG;
                            }
                            if (pVar3 != null) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            z23 = z21;
                            j13 = j11;
                            l1 l1VarG = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                            p2.l lVar3 = p2.l.f100860c;
                            p013kotlin.jvm.internal.l lVar4 = p013kotlin.jvm.internal.l.f86526a;
                            p019p1.p1<Float, p019p1.m> p1VarE = r1.e(lVar4);
                            p2.d dVar5 = (p2.d) l1VarG.i();
                            lVarV.o(-2036730335);
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                            }
                            iArr = p.f100853b;
                            i46 = iArr[dVar5.ordinal()];
                            f11 = 1.0f;
                            if (i46 == 1) {
                                f12 = 1.0f;
                            } else if (i46 != 2) {
                                if (i46 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f12 = 1.0f;
                            } else {
                                f12 = BitmapDescriptorFactory.HUE_RED;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            Float fValueOf = Float.valueOf(f12);
                            p2.d dVar6 = (p2.d) l1VarG.p();
                            lVarV.o(-2036730335);
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                            }
                            i47 = iArr[dVar6.ordinal()];
                            if (i47 == 1) {
                                f13 = 1.0f;
                            } else if (i47 != 2) {
                                if (i47 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f13 = 1.0f;
                            } else {
                                f13 = BitmapDescriptorFactory.HUE_RED;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            y3 y3VarD5 = m1.d(l1VarG, fValueOf, Float.valueOf(f13), lVar3.invoke(l1VarG.n(), lVarV, 0), p1VarE, "LabelProgress", lVarV, 196608);
                            p2.n nVar = p2.n.f100862c;
                            p019p1.p1<Float, p019p1.m> p1VarE2 = r1.e(lVar4);
                            p2.d dVar7 = (p2.d) l1VarG.i();
                            lVarV.o(1435837472);
                            if (p020r2.o.J()) {
                                p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                            }
                            i48 = iArr[dVar7.ordinal()];
                            if (i48 == 1) {
                                f14 = 1.0f;
                            } else {
                                if (i48 != 2) {
                                    if (i48 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else if (!z22) {
                                    f14 = 1.0f;
                                }
                                f14 = BitmapDescriptorFactory.HUE_RED;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            Float fValueOf2 = Float.valueOf(f14);
                            p2.d dVar8 = (p2.d) r4.p();
                            lVarV.o(1435837472);
                            if (p020r2.o.J()) {
                                p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                            }
                            i49 = iArr[dVar8.ordinal()];
                            if (i49 == 1) {
                                f15 = 1.0f;
                            } else {
                                if (i49 != 2) {
                                    if (i49 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else if (z22 == 0) {
                                    f15 = 1.0f;
                                }
                                f15 = BitmapDescriptorFactory.HUE_RED;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            y3VarD = m1.d(l1VarG, fValueOf2, Float.valueOf(f15), nVar.invoke(r4.n(), lVarV, 0), p1VarE2, "PlaceholderOpacity", lVarV, 196608);
                            p2.o oVar = p2.o.f100863c;
                            p019p1.p1<Float, p019p1.m> p1VarE3 = r1.e(lVar4);
                            p2.d dVar9 = (p2.d) l1VarG.i();
                            lVarV.o(1128033978);
                            if (p020r2.o.J()) {
                                p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                            }
                            i51 = iArr[dVar9.ordinal()];
                            if (i51 == 1) {
                                f16 = 1.0f;
                            } else {
                                if (i51 != 2) {
                                    if (i51 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else if (z22 != 0) {
                                    f16 = BitmapDescriptorFactory.HUE_RED;
                                }
                                f16 = 1.0f;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            Float fValueOf3 = Float.valueOf(f16);
                            p2.d dVar10 = (p2.d) l1VarG.p();
                            lVarV.o(1128033978);
                            if (p020r2.o.J()) {
                                p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                            }
                            i52 = iArr[dVar10.ordinal()];
                            if (i52 != 1) {
                                if (i52 != 2) {
                                    if (i52 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else if (z22 != 0) {
                                    f11 = BitmapDescriptorFactory.HUE_RED;
                                }
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            y3VarD2 = m1.d(l1VarG, fValueOf3, Float.valueOf(f11), oVar.invoke(l1VarG.n(), lVarV, 0), p1VarE3, "PrefixSuffixOpacity", lVarV, 196608);
                            p2.m mVar = p2.m.f100861c;
                            dVar2 = (p2.d) l1VarG.p();
                            lVarV.o(-107432127);
                            if (p020r2.o.J()) {
                                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                            }
                            if (iArr[dVar2.ordinal()] == 1) {
                                j14 = j13;
                            } else {
                                j14 = j12;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            cVarU = k3.p1.u(j14);
                            zN = lVarV.n(cVarU);
                            objI2 = lVarV.I();
                            if (zN || objI2 == p020r2.l.INSTANCE.a()) {
                                objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                                lVarV.B(objI2);
                            }
                            p019p1.p1 p1Var2 = (p019p1.p1) objI2;
                            dVar3 = (p2.d) l1VarG.i();
                            lVarV.o(-107432127);
                            if (p020r2.o.J()) {
                                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                            }
                            if (iArr[dVar3.ordinal()] == 1) {
                                j15 = j13;
                            } else {
                                j15 = j12;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            k3.p1 p1VarL = k3.p1.l(j15);
                            dVar4 = (p2.d) l1VarG.p();
                            lVarV.o(-107432127);
                            if (p020r2.o.J()) {
                                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                            }
                            if (iArr[dVar4.ordinal()] == 1) {
                                j12 = j13;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVarV.l();
                            y3VarD3 = m1.d(l1VarG, p1VarL, k3.p1.l(j12), mVar.invoke(l1VarG.n(), lVarV, 0), p1Var2, "LabelTextStyleColor", lVarV, 196608);
                            lVar2 = lVarV;
                            p2.k kVar = p2.k.f100859c;
                            lVar2.o(1023351670);
                            if (p020r2.o.J()) {
                                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVar2.l();
                            cVarU2 = k3.p1.u(jG);
                            zN2 = lVar2.n(cVarU2);
                            objI3 = lVar2.I();
                            if (zN2 || objI3 == p020r2.l.INSTANCE.a()) {
                                objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                                lVar2.B(objI3);
                            }
                            p019p1.p1 p1Var3 = (p019p1.p1) objI3;
                            lVar2.o(1023351670);
                            if (p020r2.o.J()) {
                                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVar2.l();
                            k3.p1 p1VarL2 = k3.p1.l(jG);
                            lVar2.o(1023351670);
                            if (p020r2.o.J()) {
                                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            lVar2.l();
                            y3VarD4 = m1.d(l1VarG, p1VarL2, k3.p1.l(jG), kVar.invoke(r8.n(), lVar2, 0), p1Var3, "LabelContentColor", lVar2, 196608);
                            fFloatValue = ((Number) y3VarD5.getValue()).floatValue();
                            lVar2.o(-156998101);
                            if (pVar3 == null) {
                                f17 = fFloatValue;
                                textStyle = bodyLarge;
                                textStyle2 = bodySmall;
                                aVarE = null;
                            } else {
                                textStyle = bodyLarge;
                                d dVar11 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                                textStyle2 = bodySmall;
                                f17 = fFloatValue;
                                aVarE = z2.c.e(-1236585568, true, dVar11, lVar2, 54);
                            }
                            lVar2.l();
                            long jI = n0Var.i(z15, z16, zBooleanValue);
                            objI4 = lVar2.I();
                            companion2 = p020r2.l.INSTANCE;
                            if (objI4 == companion2.a()) {
                                objI4 = n3.d(n3.q(), new k(y3VarD));
                                lVar2.B(objI4);
                            }
                            y3 y3Var2 = (y3) objI4;
                            lVar2.o(-156965270);
                            if (pVar16 == null && text.length() == 0 && b(y3Var2)) {
                                TextStyle textStyle4 = textStyle;
                                textStyle3 = textStyle4;
                                pVar19 = pVar16;
                                aVarE2 = z2.c.e(-660524084, true, new f(y3VarD, jI, textStyle4, pVar16), lVar2, 54);
                            } else {
                                textStyle3 = textStyle;
                                pVar19 = pVar16;
                                aVarE2 = null;
                            }
                            lVar2.l();
                            long j17 = n0Var.j(z15, z16, zBooleanValue);
                            objI5 = lVar2.I();
                            TextStyle textStyle5 = textStyle3;
                            if (objI5 == companion2.a()) {
                                objI5 = n3.d(n3.q(), new l(y3VarD2));
                                lVar2.B(objI5);
                            }
                            y3 y3Var3 = (y3) objI5;
                            lVar2.o(-156940524);
                            if (pVar14 == null && c(y3Var3)) {
                                wn0.p<? super p020r2.l, ? super Integer, h0> pVar28 = pVar14;
                                g gVar = new g(y3VarD2, j17, textStyle5, pVar28);
                                y3Var = y3VarD2;
                                pVar20 = pVar28;
                                textStyle5 = textStyle5;
                                aVarE3 = z2.c.e(274398694, true, gVar, lVar2, 54);
                            } else {
                                y3Var = y3VarD2;
                                pVar20 = pVar14;
                                aVarE3 = null;
                            }
                            lVar2.l();
                            long jK = n0Var.k(z15, z16, zBooleanValue);
                            lVar2.o(-156921964);
                            if (pVar15 == null && c(y3Var3)) {
                                wn0.p<? super p020r2.l, ? super Integer, h0> pVar29 = pVar15;
                                h hVar = new h(y3Var, jK, textStyle5, pVar29);
                                pVar21 = pVar29;
                                aVarE4 = z2.c.e(-1526229403, true, hVar, lVar2, 54);
                            } else {
                                pVar21 = pVar15;
                                aVarE4 = null;
                            }
                            lVar2.l();
                            jH = n0Var.h(z15, z16, zBooleanValue);
                            lVar2.o(-156902962);
                            if (pVar12 == null) {
                                aVarE5 = null;
                            } else {
                                aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                            }
                            lVar2.l();
                            jO = n0Var.o(z15, z16, zBooleanValue);
                            lVar2.o(-156893937);
                            if (pVar18 == null) {
                                z24 = true;
                                i53 = 54;
                                aVarE6 = null;
                            } else {
                                z24 = true;
                                i53 = 54;
                                aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                            }
                            lVar2.l();
                            jL = n0Var.l(z15, z16, zBooleanValue);
                            lVar2.o(-156884470);
                            if (pVar17 == null) {
                                aVarE7 = null;
                            } else {
                                aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                            }
                            lVar2.l();
                            i54 = p.f100852a[pVar.ordinal()];
                            if (i54 == z24) {
                                z25 = z14;
                                lVar2.o(-568105095);
                                p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                                lVar2.l();
                                h0 h0Var = h0.f84049a;
                            } else if (i54 != 2) {
                                lVar2.o(-565271199);
                                lVar2.l();
                                h0 h0Var2 = h0.f84049a;
                                z25 = z14;
                            } else {
                                lVar2.o(-567018607);
                                objI6 = lVar2.I();
                                if (objI6 == companion2.a()) {
                                    objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                    lVar2.B(objI6);
                                }
                                p1Var = (p1) objI6;
                                z2.a aVarE8 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                                androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                                zQ = lVar2.q(f17);
                                objI7 = lVar2.I();
                                if (zQ || objI7 == companion2.a()) {
                                    objI7 = new a(f17, p1Var);
                                    lVar2.B(objI7);
                                }
                                z25 = z14;
                                w.b(companion3, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE8, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                                lVar2.l();
                                h0 h0Var3 = h0.f84049a;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            pVar22 = pVar20;
                            pVar23 = pVar17;
                            z26 = z15;
                            pVar24 = pVar12;
                            z27 = z16;
                            z28 = z25;
                            pVar25 = pVar18;
                            pVar26 = pVar19;
                            pVar27 = pVar21;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                        }
                    }
                    i55 |= 805306368;
                    i32 = i13 & 1024;
                    if (i32 != 0) {
                        i33 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        if (lVarV.K(pVar9)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i12 | i34;
                    } else {
                        i33 = i12;
                    }
                    i35 = i13 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i12 & 48) != 0) {
                        i33 |= lVarV.p(z11) ? 32 : 16;
                    }
                    i36 = i33;
                    i37 = i13 & 4096;
                    if (i37 != 0) {
                        i39 = i36 | KyberEngine.KyberPolyBytes;
                    } else {
                        i38 = i36;
                        if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                            i38 |= lVarV.p(z12) ? 256 : 128;
                        }
                        i39 = i38;
                    }
                    i41 = i13 & PKIFailureInfo.certRevoked;
                    if (i41 != 0) {
                        i43 = i39 | 3072;
                    } else {
                        i42 = i39;
                        if ((i12 & 3072) != 0) {
                            i42 |= lVarV.p(z13) ? 2048 : 1024;
                        }
                        i43 = i42;
                    }
                    if ((i13 & 16384) != 0) {
                        i43 |= 24576;
                    } else if ((i12 & 24576) == 0) {
                        if (lVarV.n(jVar)) {
                            i17 = 16384;
                        }
                        i43 |= i17;
                    }
                    if ((32768 & i13) != 0) {
                        i43 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (lVarV.n(yVar)) {
                            i44 = 131072;
                        } else {
                            i44 = 65536;
                        }
                        i43 |= i44;
                    }
                    if ((i13 & 65536) != 0) {
                        i43 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (lVarV.n(n0Var)) {
                            i23 = 1048576;
                        }
                        i43 |= i23;
                    }
                    if ((i13 & 131072) != 0) {
                        i43 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                    }
                    if ((306783379 & i55) != 306783378) {
                        if (i19 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i22 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i27 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i29 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar8;
                        }
                        pVar16 = pVar11;
                        if (i32 != 0) {
                            pVar17 = null;
                        } else {
                            pVar17 = pVar9;
                        }
                        if (i35 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i41 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                        }
                        if ((i55 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i45 = i43;
                        if ((i55 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI = lVarV.I();
                        if (z19) {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        } else {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        }
                        text = ((TransformedText) objI).getText().getText();
                        zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                        if (zBooleanValue) {
                            dVar = p2.d.Focused;
                        } else if (text.length() == 0) {
                            dVar = p2.d.UnfocusedEmpty;
                        } else {
                            dVar = p2.d.UnfocusedNotEmpty;
                        }
                        jG = n0Var.g(z15, z16, zBooleanValue);
                        Typography typographyC2 = t.f96158a.c(lVarV, 6);
                        bodyLarge = typographyC2.getBodyLarge();
                        bodySmall = typographyC2.getBodySmall();
                        pVar18 = pVar13;
                        long j18 = bodyLarge.j();
                        companion = k3.p1.INSTANCE;
                        if (k3.p1.r(j18, companion.j())) {
                        }
                        j11 = bodySmall.j();
                        if (z21) {
                            j11 = jG;
                        }
                        j12 = bodyLarge.j();
                        if (z21) {
                            j12 = jG;
                        }
                        if (pVar3 != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z21;
                        j13 = j11;
                        l1 l1VarG2 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                        p2.l lVar5 = p2.l.f100860c;
                        p013kotlin.jvm.internal.l lVar6 = p013kotlin.jvm.internal.l.f86526a;
                        p019p1.p1<Float, p019p1.m> p1VarE4 = r1.e(lVar6);
                        p2.d dVar12 = (p2.d) l1VarG2.i();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        iArr = p.f100853b;
                        i46 = iArr[dVar12.ordinal()];
                        f11 = 1.0f;
                        if (i46 == 1) {
                            f12 = 1.0f;
                        } else if (i46 != 2) {
                            if (i46 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf4 = Float.valueOf(f12);
                        p2.d dVar13 = (p2.d) l1VarG2.p();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        i47 = iArr[dVar13.ordinal()];
                        if (i47 == 1) {
                            f13 = 1.0f;
                        } else if (i47 != 2) {
                            if (i47 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3 y3VarD6 = m1.d(l1VarG2, fValueOf4, Float.valueOf(f13), lVar5.invoke(l1VarG2.n(), lVarV, 0), p1VarE4, "LabelProgress", lVarV, 196608);
                        p2.n nVar2 = p2.n.f100862c;
                        p019p1.p1<Float, p019p1.m> p1VarE5 = r1.e(lVar6);
                        p2.d dVar14 = (p2.d) l1VarG2.i();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i48 = iArr[dVar14.ordinal()];
                        if (i48 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i48 != 2) {
                                if (i48 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z22) {
                                f14 = 1.0f;
                            }
                            f14 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf5 = Float.valueOf(f14);
                        p2.d dVar15 = (p2.d) r4.p();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i49 = iArr[dVar15.ordinal()];
                        if (i49 == 1) {
                            f15 = 1.0f;
                        } else {
                            if (i49 != 2) {
                                if (i49 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 == 0) {
                                f15 = 1.0f;
                            }
                            f15 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD = m1.d(l1VarG2, fValueOf5, Float.valueOf(f15), nVar2.invoke(r4.n(), lVarV, 0), p1VarE5, "PlaceholderOpacity", lVarV, 196608);
                        p2.o oVar2 = p2.o.f100863c;
                        p019p1.p1<Float, p019p1.m> p1VarE6 = r1.e(lVar6);
                        p2.d dVar16 = (p2.d) l1VarG2.i();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i51 = iArr[dVar16.ordinal()];
                        if (i51 == 1) {
                            f16 = 1.0f;
                        } else {
                            if (i51 != 2) {
                                if (i51 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f16 = BitmapDescriptorFactory.HUE_RED;
                            }
                            f16 = 1.0f;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf6 = Float.valueOf(f16);
                        p2.d dVar17 = (p2.d) l1VarG2.p();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i52 = iArr[dVar17.ordinal()];
                        if (i52 != 1) {
                            if (i52 != 2) {
                                if (i52 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f11 = BitmapDescriptorFactory.HUE_RED;
                            }
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD2 = m1.d(l1VarG2, fValueOf6, Float.valueOf(f11), oVar2.invoke(l1VarG2.n(), lVarV, 0), p1VarE6, "PrefixSuffixOpacity", lVarV, 196608);
                        p2.m mVar2 = p2.m.f100861c;
                        dVar2 = (p2.d) l1VarG2.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar2.ordinal()] == 1) {
                            j14 = j13;
                        } else {
                            j14 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        cVarU = k3.p1.u(j14);
                        zN = lVarV.n(cVarU);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        } else {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        }
                        p019p1.p1 p1Var4 = (p019p1.p1) objI2;
                        dVar3 = (p2.d) l1VarG2.i();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar3.ordinal()] == 1) {
                            j15 = j13;
                        } else {
                            j15 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        k3.p1 p1VarL3 = k3.p1.l(j15);
                        dVar4 = (p2.d) l1VarG2.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar4.ordinal()] == 1) {
                            j12 = j13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD3 = m1.d(l1VarG2, p1VarL3, k3.p1.l(j12), mVar2.invoke(l1VarG2.n(), lVarV, 0), p1Var4, "LabelTextStyleColor", lVarV, 196608);
                        lVar2 = lVarV;
                        p2.k kVar2 = p2.k.f100859c;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        cVarU2 = k3.p1.u(jG);
                        zN2 = lVar2.n(cVarU2);
                        objI3 = lVar2.I();
                        if (zN2) {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        } else {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        }
                        p019p1.p1 p1Var5 = (p019p1.p1) objI3;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        k3.p1 p1VarL4 = k3.p1.l(jG);
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        y3VarD4 = m1.d(l1VarG2, p1VarL4, k3.p1.l(jG), kVar2.invoke(r8.n(), lVar2, 0), p1Var5, "LabelContentColor", lVar2, 196608);
                        fFloatValue = ((Number) y3VarD6.getValue()).floatValue();
                        lVar2.o(-156998101);
                        if (pVar3 == null) {
                            f17 = fFloatValue;
                            textStyle = bodyLarge;
                            textStyle2 = bodySmall;
                            aVarE = null;
                        } else {
                            textStyle = bodyLarge;
                            d dVar18 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                            textStyle2 = bodySmall;
                            f17 = fFloatValue;
                            aVarE = z2.c.e(-1236585568, true, dVar18, lVar2, 54);
                        }
                        lVar2.l();
                        long jI2 = n0Var.i(z15, z16, zBooleanValue);
                        objI4 = lVar2.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI4 == companion2.a()) {
                            objI4 = n3.d(n3.q(), new k(y3VarD));
                            lVar2.B(objI4);
                        }
                        y3 y3Var4 = (y3) objI4;
                        lVar2.o(-156965270);
                        if (pVar16 == null) {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        } else {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        }
                        lVar2.l();
                        long j19 = n0Var.j(z15, z16, zBooleanValue);
                        objI5 = lVar2.I();
                        TextStyle textStyle6 = textStyle3;
                        if (objI5 == companion2.a()) {
                            objI5 = n3.d(n3.q(), new l(y3VarD2));
                            lVar2.B(objI5);
                        }
                        y3 y3Var5 = (y3) objI5;
                        lVar2.o(-156940524);
                        if (pVar14 == null) {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        } else {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        }
                        lVar2.l();
                        long jK2 = n0Var.k(z15, z16, zBooleanValue);
                        lVar2.o(-156921964);
                        if (pVar15 == null) {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        } else {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        }
                        lVar2.l();
                        jH = n0Var.h(z15, z16, zBooleanValue);
                        lVar2.o(-156902962);
                        if (pVar12 == null) {
                            aVarE5 = null;
                        } else {
                            aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                        }
                        lVar2.l();
                        jO = n0Var.o(z15, z16, zBooleanValue);
                        lVar2.o(-156893937);
                        if (pVar18 == null) {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = null;
                        } else {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                        }
                        lVar2.l();
                        jL = n0Var.l(z15, z16, zBooleanValue);
                        lVar2.o(-156884470);
                        if (pVar17 == null) {
                            aVarE7 = null;
                        } else {
                            aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                        }
                        lVar2.l();
                        i54 = p.f100852a[pVar.ordinal()];
                        if (i54 == z24) {
                            z25 = z14;
                            lVar2.o(-568105095);
                            p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                            lVar2.l();
                            h0 h0Var4 = h0.f84049a;
                        } else if (i54 != 2) {
                            lVar2.o(-565271199);
                            lVar2.l();
                            h0 h0Var5 = h0.f84049a;
                            z25 = z14;
                        } else {
                            lVar2.o(-567018607);
                            objI6 = lVar2.I();
                            if (objI6 == companion2.a()) {
                                objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                lVar2.B(objI6);
                            }
                            p1Var = (p1) objI6;
                            z2.a aVarE9 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                            androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
                            zQ = lVar2.q(f17);
                            objI7 = lVar2.I();
                            if (zQ) {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            } else {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            }
                            z25 = z14;
                            w.b(companion4, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE9, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                            lVar2.l();
                            h0 h0Var6 = h0.f84049a;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar22 = pVar20;
                        pVar23 = pVar17;
                        z26 = z15;
                        pVar24 = pVar12;
                        z27 = z16;
                        z28 = z25;
                        pVar25 = pVar18;
                        pVar26 = pVar19;
                        pVar27 = pVar21;
                    } else {
                        if (i19 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i22 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i27 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i29 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar8;
                        }
                        pVar16 = pVar11;
                        if (i32 != 0) {
                            pVar17 = null;
                        } else {
                            pVar17 = pVar9;
                        }
                        if (i35 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i41 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                        }
                        if ((i55 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i45 = i43;
                        if ((i55 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI = lVarV.I();
                        if (z19) {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        } else {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        }
                        text = ((TransformedText) objI).getText().getText();
                        zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                        if (zBooleanValue) {
                            dVar = p2.d.Focused;
                        } else if (text.length() == 0) {
                            dVar = p2.d.UnfocusedEmpty;
                        } else {
                            dVar = p2.d.UnfocusedNotEmpty;
                        }
                        jG = n0Var.g(z15, z16, zBooleanValue);
                        Typography typographyC3 = t.f96158a.c(lVarV, 6);
                        bodyLarge = typographyC3.getBodyLarge();
                        bodySmall = typographyC3.getBodySmall();
                        pVar18 = pVar13;
                        long j110 = bodyLarge.j();
                        companion = k3.p1.INSTANCE;
                        if (k3.p1.r(j110, companion.j())) {
                        }
                        j11 = bodySmall.j();
                        if (z21) {
                            j11 = jG;
                        }
                        j12 = bodyLarge.j();
                        if (z21) {
                            j12 = jG;
                        }
                        if (pVar3 != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z21;
                        j13 = j11;
                        l1 l1VarG3 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                        p2.l lVar7 = p2.l.f100860c;
                        p013kotlin.jvm.internal.l lVar8 = p013kotlin.jvm.internal.l.f86526a;
                        p019p1.p1<Float, p019p1.m> p1VarE7 = r1.e(lVar8);
                        p2.d dVar19 = (p2.d) l1VarG3.i();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        iArr = p.f100853b;
                        i46 = iArr[dVar19.ordinal()];
                        f11 = 1.0f;
                        if (i46 == 1) {
                            f12 = 1.0f;
                        } else if (i46 != 2) {
                            if (i46 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf7 = Float.valueOf(f12);
                        p2.d dVar110 = (p2.d) l1VarG3.p();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        i47 = iArr[dVar110.ordinal()];
                        if (i47 == 1) {
                            f13 = 1.0f;
                        } else if (i47 != 2) {
                            if (i47 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3 y3VarD7 = m1.d(l1VarG3, fValueOf7, Float.valueOf(f13), lVar7.invoke(l1VarG3.n(), lVarV, 0), p1VarE7, "LabelProgress", lVarV, 196608);
                        p2.n nVar3 = p2.n.f100862c;
                        p019p1.p1<Float, p019p1.m> p1VarE8 = r1.e(lVar8);
                        p2.d dVar111 = (p2.d) l1VarG3.i();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i48 = iArr[dVar111.ordinal()];
                        if (i48 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i48 != 2) {
                                if (i48 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z22) {
                                f14 = 1.0f;
                            }
                            f14 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf8 = Float.valueOf(f14);
                        p2.d dVar112 = (p2.d) r4.p();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i49 = iArr[dVar112.ordinal()];
                        if (i49 == 1) {
                            f15 = 1.0f;
                        } else {
                            if (i49 != 2) {
                                if (i49 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 == 0) {
                                f15 = 1.0f;
                            }
                            f15 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD = m1.d(l1VarG3, fValueOf8, Float.valueOf(f15), nVar3.invoke(r4.n(), lVarV, 0), p1VarE8, "PlaceholderOpacity", lVarV, 196608);
                        p2.o oVar3 = p2.o.f100863c;
                        p019p1.p1<Float, p019p1.m> p1VarE9 = r1.e(lVar8);
                        p2.d dVar113 = (p2.d) l1VarG3.i();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i51 = iArr[dVar113.ordinal()];
                        if (i51 == 1) {
                            f16 = 1.0f;
                        } else {
                            if (i51 != 2) {
                                if (i51 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f16 = BitmapDescriptorFactory.HUE_RED;
                            }
                            f16 = 1.0f;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf9 = Float.valueOf(f16);
                        p2.d dVar114 = (p2.d) l1VarG3.p();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i52 = iArr[dVar114.ordinal()];
                        if (i52 != 1) {
                            if (i52 != 2) {
                                if (i52 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f11 = BitmapDescriptorFactory.HUE_RED;
                            }
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD2 = m1.d(l1VarG3, fValueOf9, Float.valueOf(f11), oVar3.invoke(l1VarG3.n(), lVarV, 0), p1VarE9, "PrefixSuffixOpacity", lVarV, 196608);
                        p2.m mVar3 = p2.m.f100861c;
                        dVar2 = (p2.d) l1VarG3.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar2.ordinal()] == 1) {
                            j14 = j13;
                        } else {
                            j14 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        cVarU = k3.p1.u(j14);
                        zN = lVarV.n(cVarU);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        } else {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        }
                        p019p1.p1 p1Var6 = (p019p1.p1) objI2;
                        dVar3 = (p2.d) l1VarG3.i();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar3.ordinal()] == 1) {
                            j15 = j13;
                        } else {
                            j15 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        k3.p1 p1VarL5 = k3.p1.l(j15);
                        dVar4 = (p2.d) l1VarG3.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar4.ordinal()] == 1) {
                            j12 = j13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD3 = m1.d(l1VarG3, p1VarL5, k3.p1.l(j12), mVar3.invoke(l1VarG3.n(), lVarV, 0), p1Var6, "LabelTextStyleColor", lVarV, 196608);
                        lVar2 = lVarV;
                        p2.k kVar3 = p2.k.f100859c;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        cVarU2 = k3.p1.u(jG);
                        zN2 = lVar2.n(cVarU2);
                        objI3 = lVar2.I();
                        if (zN2) {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        } else {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        }
                        p019p1.p1 p1Var7 = (p019p1.p1) objI3;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        k3.p1 p1VarL6 = k3.p1.l(jG);
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        y3VarD4 = m1.d(l1VarG3, p1VarL6, k3.p1.l(jG), kVar3.invoke(r8.n(), lVar2, 0), p1Var7, "LabelContentColor", lVar2, 196608);
                        fFloatValue = ((Number) y3VarD7.getValue()).floatValue();
                        lVar2.o(-156998101);
                        if (pVar3 == null) {
                            f17 = fFloatValue;
                            textStyle = bodyLarge;
                            textStyle2 = bodySmall;
                            aVarE = null;
                        } else {
                            textStyle = bodyLarge;
                            d dVar115 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                            textStyle2 = bodySmall;
                            f17 = fFloatValue;
                            aVarE = z2.c.e(-1236585568, true, dVar115, lVar2, 54);
                        }
                        lVar2.l();
                        long jI3 = n0Var.i(z15, z16, zBooleanValue);
                        objI4 = lVar2.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI4 == companion2.a()) {
                            objI4 = n3.d(n3.q(), new k(y3VarD));
                            lVar2.B(objI4);
                        }
                        y3 y3Var6 = (y3) objI4;
                        lVar2.o(-156965270);
                        if (pVar16 == null) {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        } else {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        }
                        lVar2.l();
                        long j111 = n0Var.j(z15, z16, zBooleanValue);
                        objI5 = lVar2.I();
                        TextStyle textStyle7 = textStyle3;
                        if (objI5 == companion2.a()) {
                            objI5 = n3.d(n3.q(), new l(y3VarD2));
                            lVar2.B(objI5);
                        }
                        y3 y3Var7 = (y3) objI5;
                        lVar2.o(-156940524);
                        if (pVar14 == null) {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        } else {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        }
                        lVar2.l();
                        long jK3 = n0Var.k(z15, z16, zBooleanValue);
                        lVar2.o(-156921964);
                        if (pVar15 == null) {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        } else {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        }
                        lVar2.l();
                        jH = n0Var.h(z15, z16, zBooleanValue);
                        lVar2.o(-156902962);
                        if (pVar12 == null) {
                            aVarE5 = null;
                        } else {
                            aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                        }
                        lVar2.l();
                        jO = n0Var.o(z15, z16, zBooleanValue);
                        lVar2.o(-156893937);
                        if (pVar18 == null) {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = null;
                        } else {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                        }
                        lVar2.l();
                        jL = n0Var.l(z15, z16, zBooleanValue);
                        lVar2.o(-156884470);
                        if (pVar17 == null) {
                            aVarE7 = null;
                        } else {
                            aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                        }
                        lVar2.l();
                        i54 = p.f100852a[pVar.ordinal()];
                        if (i54 == z24) {
                            z25 = z14;
                            lVar2.o(-568105095);
                            p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                            lVar2.l();
                            h0 h0Var7 = h0.f84049a;
                        } else if (i54 != 2) {
                            lVar2.o(-565271199);
                            lVar2.l();
                            h0 h0Var8 = h0.f84049a;
                            z25 = z14;
                        } else {
                            lVar2.o(-567018607);
                            objI6 = lVar2.I();
                            if (objI6 == companion2.a()) {
                                objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                lVar2.B(objI6);
                            }
                            p1Var = (p1) objI6;
                            z2.a aVarE10 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                            androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
                            zQ = lVar2.q(f17);
                            objI7 = lVar2.I();
                            if (zQ) {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            } else {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            }
                            z25 = z14;
                            w.b(companion5, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE10, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                            lVar2.l();
                            h0 h0Var9 = h0.f84049a;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar22 = pVar20;
                        pVar23 = pVar17;
                        z26 = z15;
                        pVar24 = pVar12;
                        z27 = z16;
                        z28 = z25;
                        pVar25 = pVar18;
                        pVar26 = pVar19;
                        pVar27 = pVar21;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                    }
                }
                i55 |= 100663296;
                i29 = i13 & 512;
                if (i29 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar8)) {
                            i31 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i31 = 268435456;
                        }
                        i55 |= i31;
                    }
                    i32 = i13 & 1024;
                    if (i32 != 0) {
                        i33 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        if (lVarV.K(pVar9)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i12 | i34;
                    } else {
                        i33 = i12;
                    }
                    i35 = i13 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i12 & 48) != 0) {
                        i33 |= lVarV.p(z11) ? 32 : 16;
                    }
                    i36 = i33;
                    i37 = i13 & 4096;
                    if (i37 != 0) {
                        i39 = i36 | KyberEngine.KyberPolyBytes;
                    } else {
                        i38 = i36;
                        if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                            i38 |= lVarV.p(z12) ? 256 : 128;
                        }
                        i39 = i38;
                    }
                    i41 = i13 & PKIFailureInfo.certRevoked;
                    if (i41 != 0) {
                        i43 = i39 | 3072;
                    } else {
                        i42 = i39;
                        if ((i12 & 3072) != 0) {
                            i42 |= lVarV.p(z13) ? 2048 : 1024;
                        }
                        i43 = i42;
                    }
                    if ((i13 & 16384) != 0) {
                        i43 |= 24576;
                    } else if ((i12 & 24576) == 0) {
                        if (lVarV.n(jVar)) {
                            i17 = 16384;
                        }
                        i43 |= i17;
                    }
                    if ((32768 & i13) != 0) {
                        i43 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (lVarV.n(yVar)) {
                            i44 = 131072;
                        } else {
                            i44 = 65536;
                        }
                        i43 |= i44;
                    }
                    if ((i13 & 65536) != 0) {
                        i43 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (lVarV.n(n0Var)) {
                            i23 = 1048576;
                        }
                        i43 |= i23;
                    }
                    if ((i13 & 131072) != 0) {
                        i43 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                    }
                    if ((306783379 & i55) != 306783378) {
                        if (i19 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i22 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i27 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i29 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar8;
                        }
                        pVar16 = pVar11;
                        if (i32 != 0) {
                            pVar17 = null;
                        } else {
                            pVar17 = pVar9;
                        }
                        if (i35 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i41 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                        }
                        if ((i55 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i45 = i43;
                        if ((i55 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI = lVarV.I();
                        if (z19) {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        } else {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        }
                        text = ((TransformedText) objI).getText().getText();
                        zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                        if (zBooleanValue) {
                            dVar = p2.d.Focused;
                        } else if (text.length() == 0) {
                            dVar = p2.d.UnfocusedEmpty;
                        } else {
                            dVar = p2.d.UnfocusedNotEmpty;
                        }
                        jG = n0Var.g(z15, z16, zBooleanValue);
                        Typography typographyC4 = t.f96158a.c(lVarV, 6);
                        bodyLarge = typographyC4.getBodyLarge();
                        bodySmall = typographyC4.getBodySmall();
                        pVar18 = pVar13;
                        long j112 = bodyLarge.j();
                        companion = k3.p1.INSTANCE;
                        if (k3.p1.r(j112, companion.j())) {
                        }
                        j11 = bodySmall.j();
                        if (z21) {
                            j11 = jG;
                        }
                        j12 = bodyLarge.j();
                        if (z21) {
                            j12 = jG;
                        }
                        if (pVar3 != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z21;
                        j13 = j11;
                        l1 l1VarG4 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                        p2.l lVar9 = p2.l.f100860c;
                        p013kotlin.jvm.internal.l lVar10 = p013kotlin.jvm.internal.l.f86526a;
                        p019p1.p1<Float, p019p1.m> p1VarE10 = r1.e(lVar10);
                        p2.d dVar116 = (p2.d) l1VarG4.i();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        iArr = p.f100853b;
                        i46 = iArr[dVar116.ordinal()];
                        f11 = 1.0f;
                        if (i46 == 1) {
                            f12 = 1.0f;
                        } else if (i46 != 2) {
                            if (i46 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf10 = Float.valueOf(f12);
                        p2.d dVar117 = (p2.d) l1VarG4.p();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        i47 = iArr[dVar117.ordinal()];
                        if (i47 == 1) {
                            f13 = 1.0f;
                        } else if (i47 != 2) {
                            if (i47 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3 y3VarD8 = m1.d(l1VarG4, fValueOf10, Float.valueOf(f13), lVar9.invoke(l1VarG4.n(), lVarV, 0), p1VarE10, "LabelProgress", lVarV, 196608);
                        p2.n nVar4 = p2.n.f100862c;
                        p019p1.p1<Float, p019p1.m> p1VarE11 = r1.e(lVar10);
                        p2.d dVar118 = (p2.d) l1VarG4.i();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i48 = iArr[dVar118.ordinal()];
                        if (i48 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i48 != 2) {
                                if (i48 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z22) {
                                f14 = 1.0f;
                            }
                            f14 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf11 = Float.valueOf(f14);
                        p2.d dVar119 = (p2.d) r4.p();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i49 = iArr[dVar119.ordinal()];
                        if (i49 == 1) {
                            f15 = 1.0f;
                        } else {
                            if (i49 != 2) {
                                if (i49 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 == 0) {
                                f15 = 1.0f;
                            }
                            f15 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD = m1.d(l1VarG4, fValueOf11, Float.valueOf(f15), nVar4.invoke(r4.n(), lVarV, 0), p1VarE11, "PlaceholderOpacity", lVarV, 196608);
                        p2.o oVar4 = p2.o.f100863c;
                        p019p1.p1<Float, p019p1.m> p1VarE12 = r1.e(lVar10);
                        p2.d dVar1110 = (p2.d) l1VarG4.i();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i51 = iArr[dVar1110.ordinal()];
                        if (i51 == 1) {
                            f16 = 1.0f;
                        } else {
                            if (i51 != 2) {
                                if (i51 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f16 = BitmapDescriptorFactory.HUE_RED;
                            }
                            f16 = 1.0f;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf12 = Float.valueOf(f16);
                        p2.d dVar1111 = (p2.d) l1VarG4.p();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i52 = iArr[dVar1111.ordinal()];
                        if (i52 != 1) {
                            if (i52 != 2) {
                                if (i52 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f11 = BitmapDescriptorFactory.HUE_RED;
                            }
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD2 = m1.d(l1VarG4, fValueOf12, Float.valueOf(f11), oVar4.invoke(l1VarG4.n(), lVarV, 0), p1VarE12, "PrefixSuffixOpacity", lVarV, 196608);
                        p2.m mVar4 = p2.m.f100861c;
                        dVar2 = (p2.d) l1VarG4.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar2.ordinal()] == 1) {
                            j14 = j13;
                        } else {
                            j14 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        cVarU = k3.p1.u(j14);
                        zN = lVarV.n(cVarU);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        } else {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        }
                        p019p1.p1 p1Var8 = (p019p1.p1) objI2;
                        dVar3 = (p2.d) l1VarG4.i();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar3.ordinal()] == 1) {
                            j15 = j13;
                        } else {
                            j15 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        k3.p1 p1VarL7 = k3.p1.l(j15);
                        dVar4 = (p2.d) l1VarG4.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar4.ordinal()] == 1) {
                            j12 = j13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD3 = m1.d(l1VarG4, p1VarL7, k3.p1.l(j12), mVar4.invoke(l1VarG4.n(), lVarV, 0), p1Var8, "LabelTextStyleColor", lVarV, 196608);
                        lVar2 = lVarV;
                        p2.k kVar4 = p2.k.f100859c;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        cVarU2 = k3.p1.u(jG);
                        zN2 = lVar2.n(cVarU2);
                        objI3 = lVar2.I();
                        if (zN2) {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        } else {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        }
                        p019p1.p1 p1Var9 = (p019p1.p1) objI3;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        k3.p1 p1VarL8 = k3.p1.l(jG);
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        y3VarD4 = m1.d(l1VarG4, p1VarL8, k3.p1.l(jG), kVar4.invoke(r8.n(), lVar2, 0), p1Var9, "LabelContentColor", lVar2, 196608);
                        fFloatValue = ((Number) y3VarD8.getValue()).floatValue();
                        lVar2.o(-156998101);
                        if (pVar3 == null) {
                            f17 = fFloatValue;
                            textStyle = bodyLarge;
                            textStyle2 = bodySmall;
                            aVarE = null;
                        } else {
                            textStyle = bodyLarge;
                            d dVar1112 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                            textStyle2 = bodySmall;
                            f17 = fFloatValue;
                            aVarE = z2.c.e(-1236585568, true, dVar1112, lVar2, 54);
                        }
                        lVar2.l();
                        long jI4 = n0Var.i(z15, z16, zBooleanValue);
                        objI4 = lVar2.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI4 == companion2.a()) {
                            objI4 = n3.d(n3.q(), new k(y3VarD));
                            lVar2.B(objI4);
                        }
                        y3 y3Var8 = (y3) objI4;
                        lVar2.o(-156965270);
                        if (pVar16 == null) {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        } else {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        }
                        lVar2.l();
                        long j113 = n0Var.j(z15, z16, zBooleanValue);
                        objI5 = lVar2.I();
                        TextStyle textStyle8 = textStyle3;
                        if (objI5 == companion2.a()) {
                            objI5 = n3.d(n3.q(), new l(y3VarD2));
                            lVar2.B(objI5);
                        }
                        y3 y3Var9 = (y3) objI5;
                        lVar2.o(-156940524);
                        if (pVar14 == null) {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        } else {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        }
                        lVar2.l();
                        long jK4 = n0Var.k(z15, z16, zBooleanValue);
                        lVar2.o(-156921964);
                        if (pVar15 == null) {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        } else {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        }
                        lVar2.l();
                        jH = n0Var.h(z15, z16, zBooleanValue);
                        lVar2.o(-156902962);
                        if (pVar12 == null) {
                            aVarE5 = null;
                        } else {
                            aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                        }
                        lVar2.l();
                        jO = n0Var.o(z15, z16, zBooleanValue);
                        lVar2.o(-156893937);
                        if (pVar18 == null) {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = null;
                        } else {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                        }
                        lVar2.l();
                        jL = n0Var.l(z15, z16, zBooleanValue);
                        lVar2.o(-156884470);
                        if (pVar17 == null) {
                            aVarE7 = null;
                        } else {
                            aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                        }
                        lVar2.l();
                        i54 = p.f100852a[pVar.ordinal()];
                        if (i54 == z24) {
                            z25 = z14;
                            lVar2.o(-568105095);
                            p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                            lVar2.l();
                            h0 h0Var10 = h0.f84049a;
                        } else if (i54 != 2) {
                            lVar2.o(-565271199);
                            lVar2.l();
                            h0 h0Var11 = h0.f84049a;
                            z25 = z14;
                        } else {
                            lVar2.o(-567018607);
                            objI6 = lVar2.I();
                            if (objI6 == companion2.a()) {
                                objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                lVar2.B(objI6);
                            }
                            p1Var = (p1) objI6;
                            z2.a aVarE11 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                            androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
                            zQ = lVar2.q(f17);
                            objI7 = lVar2.I();
                            if (zQ) {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            } else {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            }
                            z25 = z14;
                            w.b(companion6, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE11, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                            lVar2.l();
                            h0 h0Var12 = h0.f84049a;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar22 = pVar20;
                        pVar23 = pVar17;
                        z26 = z15;
                        pVar24 = pVar12;
                        z27 = z16;
                        z28 = z25;
                        pVar25 = pVar18;
                        pVar26 = pVar19;
                        pVar27 = pVar21;
                    } else {
                        if (i19 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i22 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i27 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i29 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar8;
                        }
                        pVar16 = pVar11;
                        if (i32 != 0) {
                            pVar17 = null;
                        } else {
                            pVar17 = pVar9;
                        }
                        if (i35 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i41 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                        }
                        if ((i55 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i45 = i43;
                        if ((i55 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI = lVarV.I();
                        if (z19) {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        } else {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        }
                        text = ((TransformedText) objI).getText().getText();
                        zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                        if (zBooleanValue) {
                            dVar = p2.d.Focused;
                        } else if (text.length() == 0) {
                            dVar = p2.d.UnfocusedEmpty;
                        } else {
                            dVar = p2.d.UnfocusedNotEmpty;
                        }
                        jG = n0Var.g(z15, z16, zBooleanValue);
                        Typography typographyC5 = t.f96158a.c(lVarV, 6);
                        bodyLarge = typographyC5.getBodyLarge();
                        bodySmall = typographyC5.getBodySmall();
                        pVar18 = pVar13;
                        long j114 = bodyLarge.j();
                        companion = k3.p1.INSTANCE;
                        if (k3.p1.r(j114, companion.j())) {
                        }
                        j11 = bodySmall.j();
                        if (z21) {
                            j11 = jG;
                        }
                        j12 = bodyLarge.j();
                        if (z21) {
                            j12 = jG;
                        }
                        if (pVar3 != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z21;
                        j13 = j11;
                        l1 l1VarG5 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                        p2.l lVar11 = p2.l.f100860c;
                        p013kotlin.jvm.internal.l lVar12 = p013kotlin.jvm.internal.l.f86526a;
                        p019p1.p1<Float, p019p1.m> p1VarE13 = r1.e(lVar12);
                        p2.d dVar1113 = (p2.d) l1VarG5.i();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        iArr = p.f100853b;
                        i46 = iArr[dVar1113.ordinal()];
                        f11 = 1.0f;
                        if (i46 == 1) {
                            f12 = 1.0f;
                        } else if (i46 != 2) {
                            if (i46 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf13 = Float.valueOf(f12);
                        p2.d dVar1114 = (p2.d) l1VarG5.p();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        i47 = iArr[dVar1114.ordinal()];
                        if (i47 == 1) {
                            f13 = 1.0f;
                        } else if (i47 != 2) {
                            if (i47 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3 y3VarD9 = m1.d(l1VarG5, fValueOf13, Float.valueOf(f13), lVar11.invoke(l1VarG5.n(), lVarV, 0), p1VarE13, "LabelProgress", lVarV, 196608);
                        p2.n nVar5 = p2.n.f100862c;
                        p019p1.p1<Float, p019p1.m> p1VarE14 = r1.e(lVar12);
                        p2.d dVar1115 = (p2.d) l1VarG5.i();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i48 = iArr[dVar1115.ordinal()];
                        if (i48 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i48 != 2) {
                                if (i48 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z22) {
                                f14 = 1.0f;
                            }
                            f14 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf14 = Float.valueOf(f14);
                        p2.d dVar1116 = (p2.d) r4.p();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i49 = iArr[dVar1116.ordinal()];
                        if (i49 == 1) {
                            f15 = 1.0f;
                        } else {
                            if (i49 != 2) {
                                if (i49 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 == 0) {
                                f15 = 1.0f;
                            }
                            f15 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD = m1.d(l1VarG5, fValueOf14, Float.valueOf(f15), nVar5.invoke(r4.n(), lVarV, 0), p1VarE14, "PlaceholderOpacity", lVarV, 196608);
                        p2.o oVar5 = p2.o.f100863c;
                        p019p1.p1<Float, p019p1.m> p1VarE15 = r1.e(lVar12);
                        p2.d dVar1117 = (p2.d) l1VarG5.i();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i51 = iArr[dVar1117.ordinal()];
                        if (i51 == 1) {
                            f16 = 1.0f;
                        } else {
                            if (i51 != 2) {
                                if (i51 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f16 = BitmapDescriptorFactory.HUE_RED;
                            }
                            f16 = 1.0f;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf15 = Float.valueOf(f16);
                        p2.d dVar1118 = (p2.d) l1VarG5.p();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i52 = iArr[dVar1118.ordinal()];
                        if (i52 != 1) {
                            if (i52 != 2) {
                                if (i52 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f11 = BitmapDescriptorFactory.HUE_RED;
                            }
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD2 = m1.d(l1VarG5, fValueOf15, Float.valueOf(f11), oVar5.invoke(l1VarG5.n(), lVarV, 0), p1VarE15, "PrefixSuffixOpacity", lVarV, 196608);
                        p2.m mVar5 = p2.m.f100861c;
                        dVar2 = (p2.d) l1VarG5.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar2.ordinal()] == 1) {
                            j14 = j13;
                        } else {
                            j14 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        cVarU = k3.p1.u(j14);
                        zN = lVarV.n(cVarU);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        } else {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        }
                        p019p1.p1 p1Var10 = (p019p1.p1) objI2;
                        dVar3 = (p2.d) l1VarG5.i();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar3.ordinal()] == 1) {
                            j15 = j13;
                        } else {
                            j15 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        k3.p1 p1VarL9 = k3.p1.l(j15);
                        dVar4 = (p2.d) l1VarG5.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar4.ordinal()] == 1) {
                            j12 = j13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD3 = m1.d(l1VarG5, p1VarL9, k3.p1.l(j12), mVar5.invoke(l1VarG5.n(), lVarV, 0), p1Var10, "LabelTextStyleColor", lVarV, 196608);
                        lVar2 = lVarV;
                        p2.k kVar5 = p2.k.f100859c;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        cVarU2 = k3.p1.u(jG);
                        zN2 = lVar2.n(cVarU2);
                        objI3 = lVar2.I();
                        if (zN2) {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        } else {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        }
                        p019p1.p1 p1Var11 = (p019p1.p1) objI3;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        k3.p1 p1VarL10 = k3.p1.l(jG);
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        y3VarD4 = m1.d(l1VarG5, p1VarL10, k3.p1.l(jG), kVar5.invoke(r8.n(), lVar2, 0), p1Var11, "LabelContentColor", lVar2, 196608);
                        fFloatValue = ((Number) y3VarD9.getValue()).floatValue();
                        lVar2.o(-156998101);
                        if (pVar3 == null) {
                            f17 = fFloatValue;
                            textStyle = bodyLarge;
                            textStyle2 = bodySmall;
                            aVarE = null;
                        } else {
                            textStyle = bodyLarge;
                            d dVar1119 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                            textStyle2 = bodySmall;
                            f17 = fFloatValue;
                            aVarE = z2.c.e(-1236585568, true, dVar1119, lVar2, 54);
                        }
                        lVar2.l();
                        long jI5 = n0Var.i(z15, z16, zBooleanValue);
                        objI4 = lVar2.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI4 == companion2.a()) {
                            objI4 = n3.d(n3.q(), new k(y3VarD));
                            lVar2.B(objI4);
                        }
                        y3 y3Var10 = (y3) objI4;
                        lVar2.o(-156965270);
                        if (pVar16 == null) {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        } else {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        }
                        lVar2.l();
                        long j115 = n0Var.j(z15, z16, zBooleanValue);
                        objI5 = lVar2.I();
                        TextStyle textStyle9 = textStyle3;
                        if (objI5 == companion2.a()) {
                            objI5 = n3.d(n3.q(), new l(y3VarD2));
                            lVar2.B(objI5);
                        }
                        y3 y3Var11 = (y3) objI5;
                        lVar2.o(-156940524);
                        if (pVar14 == null) {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        } else {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        }
                        lVar2.l();
                        long jK5 = n0Var.k(z15, z16, zBooleanValue);
                        lVar2.o(-156921964);
                        if (pVar15 == null) {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        } else {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        }
                        lVar2.l();
                        jH = n0Var.h(z15, z16, zBooleanValue);
                        lVar2.o(-156902962);
                        if (pVar12 == null) {
                            aVarE5 = null;
                        } else {
                            aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                        }
                        lVar2.l();
                        jO = n0Var.o(z15, z16, zBooleanValue);
                        lVar2.o(-156893937);
                        if (pVar18 == null) {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = null;
                        } else {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                        }
                        lVar2.l();
                        jL = n0Var.l(z15, z16, zBooleanValue);
                        lVar2.o(-156884470);
                        if (pVar17 == null) {
                            aVarE7 = null;
                        } else {
                            aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                        }
                        lVar2.l();
                        i54 = p.f100852a[pVar.ordinal()];
                        if (i54 == z24) {
                            z25 = z14;
                            lVar2.o(-568105095);
                            p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                            lVar2.l();
                            h0 h0Var13 = h0.f84049a;
                        } else if (i54 != 2) {
                            lVar2.o(-565271199);
                            lVar2.l();
                            h0 h0Var14 = h0.f84049a;
                            z25 = z14;
                        } else {
                            lVar2.o(-567018607);
                            objI6 = lVar2.I();
                            if (objI6 == companion2.a()) {
                                objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                lVar2.B(objI6);
                            }
                            p1Var = (p1) objI6;
                            z2.a aVarE12 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                            androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
                            zQ = lVar2.q(f17);
                            objI7 = lVar2.I();
                            if (zQ) {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            } else {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            }
                            z25 = z14;
                            w.b(companion7, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE12, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                            lVar2.l();
                            h0 h0Var15 = h0.f84049a;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar22 = pVar20;
                        pVar23 = pVar17;
                        z26 = z15;
                        pVar24 = pVar12;
                        z27 = z16;
                        z28 = z25;
                        pVar25 = pVar18;
                        pVar26 = pVar19;
                        pVar27 = pVar21;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                    }
                }
                i55 |= 805306368;
                i32 = i13 & 1024;
                if (i32 != 0) {
                    i33 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (lVarV.K(pVar9)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i12 | i34;
                } else {
                    i33 = i12;
                }
                i35 = i13 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i12 & 48) != 0) {
                    i33 |= lVarV.p(z11) ? 32 : 16;
                }
                i36 = i33;
                i37 = i13 & 4096;
                if (i37 != 0) {
                    i39 = i36 | KyberEngine.KyberPolyBytes;
                } else {
                    i38 = i36;
                    if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                        i38 |= lVarV.p(z12) ? 256 : 128;
                    }
                    i39 = i38;
                }
                i41 = i13 & PKIFailureInfo.certRevoked;
                if (i41 != 0) {
                    i43 = i39 | 3072;
                } else {
                    i42 = i39;
                    if ((i12 & 3072) != 0) {
                        i42 |= lVarV.p(z13) ? 2048 : 1024;
                    }
                    i43 = i42;
                }
                if ((i13 & 16384) != 0) {
                    i43 |= 24576;
                } else if ((i12 & 24576) == 0) {
                    if (lVarV.n(jVar)) {
                        i17 = 16384;
                    }
                    i43 |= i17;
                }
                if ((32768 & i13) != 0) {
                    i43 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.n(yVar)) {
                        i44 = 131072;
                    } else {
                        i44 = 65536;
                    }
                    i43 |= i44;
                }
                if ((i13 & 65536) != 0) {
                    i43 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (lVarV.n(n0Var)) {
                        i23 = 1048576;
                    }
                    i43 |= i23;
                }
                if ((i13 & 131072) != 0) {
                    i43 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                }
                if ((306783379 & i55) != 306783378) {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC6 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC6.getBodyLarge();
                    bodySmall = typographyC6.getBodySmall();
                    pVar18 = pVar13;
                    long j116 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j116, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG6 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar13 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar14 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE16 = r1.e(lVar14);
                    p2.d dVar11110 = (p2.d) l1VarG6.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar11110.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf16 = Float.valueOf(f12);
                    p2.d dVar11111 = (p2.d) l1VarG6.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar11111.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD10 = m1.d(l1VarG6, fValueOf16, Float.valueOf(f13), lVar13.invoke(l1VarG6.n(), lVarV, 0), p1VarE16, "LabelProgress", lVarV, 196608);
                    p2.n nVar6 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE17 = r1.e(lVar14);
                    p2.d dVar11112 = (p2.d) l1VarG6.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar11112.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf17 = Float.valueOf(f14);
                    p2.d dVar11113 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar11113.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG6, fValueOf17, Float.valueOf(f15), nVar6.invoke(r4.n(), lVarV, 0), p1VarE17, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar6 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE18 = r1.e(lVar14);
                    p2.d dVar11114 = (p2.d) l1VarG6.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar11114.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf18 = Float.valueOf(f16);
                    p2.d dVar11115 = (p2.d) l1VarG6.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar11115.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG6, fValueOf18, Float.valueOf(f11), oVar6.invoke(l1VarG6.n(), lVarV, 0), p1VarE18, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar6 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG6.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var12 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG6.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL11 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG6.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG6, p1VarL11, k3.p1.l(j12), mVar6.invoke(l1VarG6.n(), lVarV, 0), p1Var12, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar6 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var13 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL12 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG6, p1VarL12, k3.p1.l(jG), kVar6.invoke(r8.n(), lVar2, 0), p1Var13, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD10.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar11116 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar11116, lVar2, 54);
                    }
                    lVar2.l();
                    long jI6 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var12 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j117 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle10 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var13 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK6 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var16 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var17 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE13 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion8 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion8, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE13, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var18 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                } else {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC7 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC7.getBodyLarge();
                    bodySmall = typographyC7.getBodySmall();
                    pVar18 = pVar13;
                    long j118 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j118, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG7 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar15 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar16 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE19 = r1.e(lVar16);
                    p2.d dVar11117 = (p2.d) l1VarG7.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar11117.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf19 = Float.valueOf(f12);
                    p2.d dVar11118 = (p2.d) l1VarG7.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar11118.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD11 = m1.d(l1VarG7, fValueOf19, Float.valueOf(f13), lVar15.invoke(l1VarG7.n(), lVarV, 0), p1VarE19, "LabelProgress", lVarV, 196608);
                    p2.n nVar7 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE110 = r1.e(lVar16);
                    p2.d dVar11119 = (p2.d) l1VarG7.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar11119.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf110 = Float.valueOf(f14);
                    p2.d dVar111110 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar111110.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG7, fValueOf110, Float.valueOf(f15), nVar7.invoke(r4.n(), lVarV, 0), p1VarE110, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar7 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE111 = r1.e(lVar16);
                    p2.d dVar111111 = (p2.d) l1VarG7.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar111111.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111 = Float.valueOf(f16);
                    p2.d dVar111112 = (p2.d) l1VarG7.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar111112.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG7, fValueOf111, Float.valueOf(f11), oVar7.invoke(l1VarG7.n(), lVarV, 0), p1VarE111, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar7 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG7.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var14 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG7.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL13 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG7.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG7, p1VarL13, k3.p1.l(j12), mVar7.invoke(l1VarG7.n(), lVarV, 0), p1Var14, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar7 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var15 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL14 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG7, p1VarL14, k3.p1.l(jG), kVar7.invoke(r8.n(), lVar2, 0), p1Var15, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD11.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar111113 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar111113, lVar2, 54);
                    }
                    lVar2.l();
                    long jI7 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var14 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j119 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle11 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var15 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK7 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var19 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var110 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE14 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion9 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion9, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE14, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var111 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                }
            }
            i55 |= 12582912;
            i27 = i13 & 256;
            if (i27 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.K(pVar7)) {
                        i28 = 67108864;
                    } else {
                        i28 = 33554432;
                    }
                    i55 |= i28;
                }
                i29 = i13 & 512;
                if (i29 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar8)) {
                            i31 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i31 = 268435456;
                        }
                        i55 |= i31;
                    }
                    i32 = i13 & 1024;
                    if (i32 != 0) {
                        i33 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        if (lVarV.K(pVar9)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i12 | i34;
                    } else {
                        i33 = i12;
                    }
                    i35 = i13 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i12 & 48) != 0) {
                        i33 |= lVarV.p(z11) ? 32 : 16;
                    }
                    i36 = i33;
                    i37 = i13 & 4096;
                    if (i37 != 0) {
                        i39 = i36 | KyberEngine.KyberPolyBytes;
                    } else {
                        i38 = i36;
                        if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                            i38 |= lVarV.p(z12) ? 256 : 128;
                        }
                        i39 = i38;
                    }
                    i41 = i13 & PKIFailureInfo.certRevoked;
                    if (i41 != 0) {
                        i43 = i39 | 3072;
                    } else {
                        i42 = i39;
                        if ((i12 & 3072) != 0) {
                            i42 |= lVarV.p(z13) ? 2048 : 1024;
                        }
                        i43 = i42;
                    }
                    if ((i13 & 16384) != 0) {
                        i43 |= 24576;
                    } else if ((i12 & 24576) == 0) {
                        if (lVarV.n(jVar)) {
                            i17 = 16384;
                        }
                        i43 |= i17;
                    }
                    if ((32768 & i13) != 0) {
                        i43 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (lVarV.n(yVar)) {
                            i44 = 131072;
                        } else {
                            i44 = 65536;
                        }
                        i43 |= i44;
                    }
                    if ((i13 & 65536) != 0) {
                        i43 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (lVarV.n(n0Var)) {
                            i23 = 1048576;
                        }
                        i43 |= i23;
                    }
                    if ((i13 & 131072) != 0) {
                        i43 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                    }
                    if ((306783379 & i55) != 306783378) {
                        if (i19 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i22 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i27 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i29 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar8;
                        }
                        pVar16 = pVar11;
                        if (i32 != 0) {
                            pVar17 = null;
                        } else {
                            pVar17 = pVar9;
                        }
                        if (i35 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i41 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                        }
                        if ((i55 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i45 = i43;
                        if ((i55 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI = lVarV.I();
                        if (z19) {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        } else {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        }
                        text = ((TransformedText) objI).getText().getText();
                        zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                        if (zBooleanValue) {
                            dVar = p2.d.Focused;
                        } else if (text.length() == 0) {
                            dVar = p2.d.UnfocusedEmpty;
                        } else {
                            dVar = p2.d.UnfocusedNotEmpty;
                        }
                        jG = n0Var.g(z15, z16, zBooleanValue);
                        Typography typographyC8 = t.f96158a.c(lVarV, 6);
                        bodyLarge = typographyC8.getBodyLarge();
                        bodySmall = typographyC8.getBodySmall();
                        pVar18 = pVar13;
                        long j1110 = bodyLarge.j();
                        companion = k3.p1.INSTANCE;
                        if (k3.p1.r(j1110, companion.j())) {
                        }
                        j11 = bodySmall.j();
                        if (z21) {
                            j11 = jG;
                        }
                        j12 = bodyLarge.j();
                        if (z21) {
                            j12 = jG;
                        }
                        if (pVar3 != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z21;
                        j13 = j11;
                        l1 l1VarG8 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                        p2.l lVar17 = p2.l.f100860c;
                        p013kotlin.jvm.internal.l lVar18 = p013kotlin.jvm.internal.l.f86526a;
                        p019p1.p1<Float, p019p1.m> p1VarE112 = r1.e(lVar18);
                        p2.d dVar111114 = (p2.d) l1VarG8.i();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        iArr = p.f100853b;
                        i46 = iArr[dVar111114.ordinal()];
                        f11 = 1.0f;
                        if (i46 == 1) {
                            f12 = 1.0f;
                        } else if (i46 != 2) {
                            if (i46 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf112 = Float.valueOf(f12);
                        p2.d dVar111115 = (p2.d) l1VarG8.p();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        i47 = iArr[dVar111115.ordinal()];
                        if (i47 == 1) {
                            f13 = 1.0f;
                        } else if (i47 != 2) {
                            if (i47 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3 y3VarD12 = m1.d(l1VarG8, fValueOf112, Float.valueOf(f13), lVar17.invoke(l1VarG8.n(), lVarV, 0), p1VarE112, "LabelProgress", lVarV, 196608);
                        p2.n nVar8 = p2.n.f100862c;
                        p019p1.p1<Float, p019p1.m> p1VarE113 = r1.e(lVar18);
                        p2.d dVar111116 = (p2.d) l1VarG8.i();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i48 = iArr[dVar111116.ordinal()];
                        if (i48 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i48 != 2) {
                                if (i48 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z22) {
                                f14 = 1.0f;
                            }
                            f14 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf113 = Float.valueOf(f14);
                        p2.d dVar111117 = (p2.d) r4.p();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i49 = iArr[dVar111117.ordinal()];
                        if (i49 == 1) {
                            f15 = 1.0f;
                        } else {
                            if (i49 != 2) {
                                if (i49 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 == 0) {
                                f15 = 1.0f;
                            }
                            f15 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD = m1.d(l1VarG8, fValueOf113, Float.valueOf(f15), nVar8.invoke(r4.n(), lVarV, 0), p1VarE113, "PlaceholderOpacity", lVarV, 196608);
                        p2.o oVar8 = p2.o.f100863c;
                        p019p1.p1<Float, p019p1.m> p1VarE114 = r1.e(lVar18);
                        p2.d dVar111118 = (p2.d) l1VarG8.i();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i51 = iArr[dVar111118.ordinal()];
                        if (i51 == 1) {
                            f16 = 1.0f;
                        } else {
                            if (i51 != 2) {
                                if (i51 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f16 = BitmapDescriptorFactory.HUE_RED;
                            }
                            f16 = 1.0f;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf114 = Float.valueOf(f16);
                        p2.d dVar111119 = (p2.d) l1VarG8.p();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i52 = iArr[dVar111119.ordinal()];
                        if (i52 != 1) {
                            if (i52 != 2) {
                                if (i52 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f11 = BitmapDescriptorFactory.HUE_RED;
                            }
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD2 = m1.d(l1VarG8, fValueOf114, Float.valueOf(f11), oVar8.invoke(l1VarG8.n(), lVarV, 0), p1VarE114, "PrefixSuffixOpacity", lVarV, 196608);
                        p2.m mVar8 = p2.m.f100861c;
                        dVar2 = (p2.d) l1VarG8.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar2.ordinal()] == 1) {
                            j14 = j13;
                        } else {
                            j14 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        cVarU = k3.p1.u(j14);
                        zN = lVarV.n(cVarU);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        } else {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        }
                        p019p1.p1 p1Var16 = (p019p1.p1) objI2;
                        dVar3 = (p2.d) l1VarG8.i();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar3.ordinal()] == 1) {
                            j15 = j13;
                        } else {
                            j15 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        k3.p1 p1VarL15 = k3.p1.l(j15);
                        dVar4 = (p2.d) l1VarG8.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar4.ordinal()] == 1) {
                            j12 = j13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD3 = m1.d(l1VarG8, p1VarL15, k3.p1.l(j12), mVar8.invoke(l1VarG8.n(), lVarV, 0), p1Var16, "LabelTextStyleColor", lVarV, 196608);
                        lVar2 = lVarV;
                        p2.k kVar8 = p2.k.f100859c;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        cVarU2 = k3.p1.u(jG);
                        zN2 = lVar2.n(cVarU2);
                        objI3 = lVar2.I();
                        if (zN2) {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        } else {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        }
                        p019p1.p1 p1Var17 = (p019p1.p1) objI3;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        k3.p1 p1VarL16 = k3.p1.l(jG);
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        y3VarD4 = m1.d(l1VarG8, p1VarL16, k3.p1.l(jG), kVar8.invoke(r8.n(), lVar2, 0), p1Var17, "LabelContentColor", lVar2, 196608);
                        fFloatValue = ((Number) y3VarD12.getValue()).floatValue();
                        lVar2.o(-156998101);
                        if (pVar3 == null) {
                            f17 = fFloatValue;
                            textStyle = bodyLarge;
                            textStyle2 = bodySmall;
                            aVarE = null;
                        } else {
                            textStyle = bodyLarge;
                            d dVar1111110 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                            textStyle2 = bodySmall;
                            f17 = fFloatValue;
                            aVarE = z2.c.e(-1236585568, true, dVar1111110, lVar2, 54);
                        }
                        lVar2.l();
                        long jI8 = n0Var.i(z15, z16, zBooleanValue);
                        objI4 = lVar2.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI4 == companion2.a()) {
                            objI4 = n3.d(n3.q(), new k(y3VarD));
                            lVar2.B(objI4);
                        }
                        y3 y3Var16 = (y3) objI4;
                        lVar2.o(-156965270);
                        if (pVar16 == null) {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        } else {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        }
                        lVar2.l();
                        long j1111 = n0Var.j(z15, z16, zBooleanValue);
                        objI5 = lVar2.I();
                        TextStyle textStyle12 = textStyle3;
                        if (objI5 == companion2.a()) {
                            objI5 = n3.d(n3.q(), new l(y3VarD2));
                            lVar2.B(objI5);
                        }
                        y3 y3Var17 = (y3) objI5;
                        lVar2.o(-156940524);
                        if (pVar14 == null) {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        } else {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        }
                        lVar2.l();
                        long jK8 = n0Var.k(z15, z16, zBooleanValue);
                        lVar2.o(-156921964);
                        if (pVar15 == null) {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        } else {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        }
                        lVar2.l();
                        jH = n0Var.h(z15, z16, zBooleanValue);
                        lVar2.o(-156902962);
                        if (pVar12 == null) {
                            aVarE5 = null;
                        } else {
                            aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                        }
                        lVar2.l();
                        jO = n0Var.o(z15, z16, zBooleanValue);
                        lVar2.o(-156893937);
                        if (pVar18 == null) {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = null;
                        } else {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                        }
                        lVar2.l();
                        jL = n0Var.l(z15, z16, zBooleanValue);
                        lVar2.o(-156884470);
                        if (pVar17 == null) {
                            aVarE7 = null;
                        } else {
                            aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                        }
                        lVar2.l();
                        i54 = p.f100852a[pVar.ordinal()];
                        if (i54 == z24) {
                            z25 = z14;
                            lVar2.o(-568105095);
                            p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                            lVar2.l();
                            h0 h0Var112 = h0.f84049a;
                        } else if (i54 != 2) {
                            lVar2.o(-565271199);
                            lVar2.l();
                            h0 h0Var113 = h0.f84049a;
                            z25 = z14;
                        } else {
                            lVar2.o(-567018607);
                            objI6 = lVar2.I();
                            if (objI6 == companion2.a()) {
                                objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                lVar2.B(objI6);
                            }
                            p1Var = (p1) objI6;
                            z2.a aVarE15 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                            androidx.compose.ui.d.Companion companion10 = androidx.compose.ui.d.INSTANCE;
                            zQ = lVar2.q(f17);
                            objI7 = lVar2.I();
                            if (zQ) {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            } else {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            }
                            z25 = z14;
                            w.b(companion10, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE15, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                            lVar2.l();
                            h0 h0Var114 = h0.f84049a;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar22 = pVar20;
                        pVar23 = pVar17;
                        z26 = z15;
                        pVar24 = pVar12;
                        z27 = z16;
                        z28 = z25;
                        pVar25 = pVar18;
                        pVar26 = pVar19;
                        pVar27 = pVar21;
                    } else {
                        if (i19 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i22 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i27 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i29 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar8;
                        }
                        pVar16 = pVar11;
                        if (i32 != 0) {
                            pVar17 = null;
                        } else {
                            pVar17 = pVar9;
                        }
                        if (i35 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i41 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                        }
                        if ((i55 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i45 = i43;
                        if ((i55 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI = lVarV.I();
                        if (z19) {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        } else {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        }
                        text = ((TransformedText) objI).getText().getText();
                        zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                        if (zBooleanValue) {
                            dVar = p2.d.Focused;
                        } else if (text.length() == 0) {
                            dVar = p2.d.UnfocusedEmpty;
                        } else {
                            dVar = p2.d.UnfocusedNotEmpty;
                        }
                        jG = n0Var.g(z15, z16, zBooleanValue);
                        Typography typographyC9 = t.f96158a.c(lVarV, 6);
                        bodyLarge = typographyC9.getBodyLarge();
                        bodySmall = typographyC9.getBodySmall();
                        pVar18 = pVar13;
                        long j1112 = bodyLarge.j();
                        companion = k3.p1.INSTANCE;
                        if (k3.p1.r(j1112, companion.j())) {
                        }
                        j11 = bodySmall.j();
                        if (z21) {
                            j11 = jG;
                        }
                        j12 = bodyLarge.j();
                        if (z21) {
                            j12 = jG;
                        }
                        if (pVar3 != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z21;
                        j13 = j11;
                        l1 l1VarG9 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                        p2.l lVar19 = p2.l.f100860c;
                        p013kotlin.jvm.internal.l lVar110 = p013kotlin.jvm.internal.l.f86526a;
                        p019p1.p1<Float, p019p1.m> p1VarE115 = r1.e(lVar110);
                        p2.d dVar1111111 = (p2.d) l1VarG9.i();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        iArr = p.f100853b;
                        i46 = iArr[dVar1111111.ordinal()];
                        f11 = 1.0f;
                        if (i46 == 1) {
                            f12 = 1.0f;
                        } else if (i46 != 2) {
                            if (i46 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf115 = Float.valueOf(f12);
                        p2.d dVar1111112 = (p2.d) l1VarG9.p();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        i47 = iArr[dVar1111112.ordinal()];
                        if (i47 == 1) {
                            f13 = 1.0f;
                        } else if (i47 != 2) {
                            if (i47 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3 y3VarD13 = m1.d(l1VarG9, fValueOf115, Float.valueOf(f13), lVar19.invoke(l1VarG9.n(), lVarV, 0), p1VarE115, "LabelProgress", lVarV, 196608);
                        p2.n nVar9 = p2.n.f100862c;
                        p019p1.p1<Float, p019p1.m> p1VarE116 = r1.e(lVar110);
                        p2.d dVar1111113 = (p2.d) l1VarG9.i();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i48 = iArr[dVar1111113.ordinal()];
                        if (i48 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i48 != 2) {
                                if (i48 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z22) {
                                f14 = 1.0f;
                            }
                            f14 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf116 = Float.valueOf(f14);
                        p2.d dVar1111114 = (p2.d) r4.p();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i49 = iArr[dVar1111114.ordinal()];
                        if (i49 == 1) {
                            f15 = 1.0f;
                        } else {
                            if (i49 != 2) {
                                if (i49 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 == 0) {
                                f15 = 1.0f;
                            }
                            f15 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD = m1.d(l1VarG9, fValueOf116, Float.valueOf(f15), nVar9.invoke(r4.n(), lVarV, 0), p1VarE116, "PlaceholderOpacity", lVarV, 196608);
                        p2.o oVar9 = p2.o.f100863c;
                        p019p1.p1<Float, p019p1.m> p1VarE117 = r1.e(lVar110);
                        p2.d dVar1111115 = (p2.d) l1VarG9.i();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i51 = iArr[dVar1111115.ordinal()];
                        if (i51 == 1) {
                            f16 = 1.0f;
                        } else {
                            if (i51 != 2) {
                                if (i51 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f16 = BitmapDescriptorFactory.HUE_RED;
                            }
                            f16 = 1.0f;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf117 = Float.valueOf(f16);
                        p2.d dVar1111116 = (p2.d) l1VarG9.p();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i52 = iArr[dVar1111116.ordinal()];
                        if (i52 != 1) {
                            if (i52 != 2) {
                                if (i52 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f11 = BitmapDescriptorFactory.HUE_RED;
                            }
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD2 = m1.d(l1VarG9, fValueOf117, Float.valueOf(f11), oVar9.invoke(l1VarG9.n(), lVarV, 0), p1VarE117, "PrefixSuffixOpacity", lVarV, 196608);
                        p2.m mVar9 = p2.m.f100861c;
                        dVar2 = (p2.d) l1VarG9.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar2.ordinal()] == 1) {
                            j14 = j13;
                        } else {
                            j14 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        cVarU = k3.p1.u(j14);
                        zN = lVarV.n(cVarU);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        } else {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        }
                        p019p1.p1 p1Var18 = (p019p1.p1) objI2;
                        dVar3 = (p2.d) l1VarG9.i();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar3.ordinal()] == 1) {
                            j15 = j13;
                        } else {
                            j15 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        k3.p1 p1VarL17 = k3.p1.l(j15);
                        dVar4 = (p2.d) l1VarG9.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar4.ordinal()] == 1) {
                            j12 = j13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD3 = m1.d(l1VarG9, p1VarL17, k3.p1.l(j12), mVar9.invoke(l1VarG9.n(), lVarV, 0), p1Var18, "LabelTextStyleColor", lVarV, 196608);
                        lVar2 = lVarV;
                        p2.k kVar9 = p2.k.f100859c;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        cVarU2 = k3.p1.u(jG);
                        zN2 = lVar2.n(cVarU2);
                        objI3 = lVar2.I();
                        if (zN2) {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        } else {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        }
                        p019p1.p1 p1Var19 = (p019p1.p1) objI3;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        k3.p1 p1VarL18 = k3.p1.l(jG);
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        y3VarD4 = m1.d(l1VarG9, p1VarL18, k3.p1.l(jG), kVar9.invoke(r8.n(), lVar2, 0), p1Var19, "LabelContentColor", lVar2, 196608);
                        fFloatValue = ((Number) y3VarD13.getValue()).floatValue();
                        lVar2.o(-156998101);
                        if (pVar3 == null) {
                            f17 = fFloatValue;
                            textStyle = bodyLarge;
                            textStyle2 = bodySmall;
                            aVarE = null;
                        } else {
                            textStyle = bodyLarge;
                            d dVar1111117 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                            textStyle2 = bodySmall;
                            f17 = fFloatValue;
                            aVarE = z2.c.e(-1236585568, true, dVar1111117, lVar2, 54);
                        }
                        lVar2.l();
                        long jI9 = n0Var.i(z15, z16, zBooleanValue);
                        objI4 = lVar2.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI4 == companion2.a()) {
                            objI4 = n3.d(n3.q(), new k(y3VarD));
                            lVar2.B(objI4);
                        }
                        y3 y3Var18 = (y3) objI4;
                        lVar2.o(-156965270);
                        if (pVar16 == null) {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        } else {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        }
                        lVar2.l();
                        long j1113 = n0Var.j(z15, z16, zBooleanValue);
                        objI5 = lVar2.I();
                        TextStyle textStyle13 = textStyle3;
                        if (objI5 == companion2.a()) {
                            objI5 = n3.d(n3.q(), new l(y3VarD2));
                            lVar2.B(objI5);
                        }
                        y3 y3Var19 = (y3) objI5;
                        lVar2.o(-156940524);
                        if (pVar14 == null) {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        } else {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        }
                        lVar2.l();
                        long jK9 = n0Var.k(z15, z16, zBooleanValue);
                        lVar2.o(-156921964);
                        if (pVar15 == null) {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        } else {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        }
                        lVar2.l();
                        jH = n0Var.h(z15, z16, zBooleanValue);
                        lVar2.o(-156902962);
                        if (pVar12 == null) {
                            aVarE5 = null;
                        } else {
                            aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                        }
                        lVar2.l();
                        jO = n0Var.o(z15, z16, zBooleanValue);
                        lVar2.o(-156893937);
                        if (pVar18 == null) {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = null;
                        } else {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                        }
                        lVar2.l();
                        jL = n0Var.l(z15, z16, zBooleanValue);
                        lVar2.o(-156884470);
                        if (pVar17 == null) {
                            aVarE7 = null;
                        } else {
                            aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                        }
                        lVar2.l();
                        i54 = p.f100852a[pVar.ordinal()];
                        if (i54 == z24) {
                            z25 = z14;
                            lVar2.o(-568105095);
                            p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                            lVar2.l();
                            h0 h0Var115 = h0.f84049a;
                        } else if (i54 != 2) {
                            lVar2.o(-565271199);
                            lVar2.l();
                            h0 h0Var116 = h0.f84049a;
                            z25 = z14;
                        } else {
                            lVar2.o(-567018607);
                            objI6 = lVar2.I();
                            if (objI6 == companion2.a()) {
                                objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                lVar2.B(objI6);
                            }
                            p1Var = (p1) objI6;
                            z2.a aVarE16 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                            androidx.compose.ui.d.Companion companion11 = androidx.compose.ui.d.INSTANCE;
                            zQ = lVar2.q(f17);
                            objI7 = lVar2.I();
                            if (zQ) {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            } else {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            }
                            z25 = z14;
                            w.b(companion11, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE16, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                            lVar2.l();
                            h0 h0Var117 = h0.f84049a;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar22 = pVar20;
                        pVar23 = pVar17;
                        z26 = z15;
                        pVar24 = pVar12;
                        z27 = z16;
                        z28 = z25;
                        pVar25 = pVar18;
                        pVar26 = pVar19;
                        pVar27 = pVar21;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                    }
                }
                i55 |= 805306368;
                i32 = i13 & 1024;
                if (i32 != 0) {
                    i33 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (lVarV.K(pVar9)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i12 | i34;
                } else {
                    i33 = i12;
                }
                i35 = i13 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i12 & 48) != 0) {
                    i33 |= lVarV.p(z11) ? 32 : 16;
                }
                i36 = i33;
                i37 = i13 & 4096;
                if (i37 != 0) {
                    i39 = i36 | KyberEngine.KyberPolyBytes;
                } else {
                    i38 = i36;
                    if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                        i38 |= lVarV.p(z12) ? 256 : 128;
                    }
                    i39 = i38;
                }
                i41 = i13 & PKIFailureInfo.certRevoked;
                if (i41 != 0) {
                    i43 = i39 | 3072;
                } else {
                    i42 = i39;
                    if ((i12 & 3072) != 0) {
                        i42 |= lVarV.p(z13) ? 2048 : 1024;
                    }
                    i43 = i42;
                }
                if ((i13 & 16384) != 0) {
                    i43 |= 24576;
                } else if ((i12 & 24576) == 0) {
                    if (lVarV.n(jVar)) {
                        i17 = 16384;
                    }
                    i43 |= i17;
                }
                if ((32768 & i13) != 0) {
                    i43 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.n(yVar)) {
                        i44 = 131072;
                    } else {
                        i44 = 65536;
                    }
                    i43 |= i44;
                }
                if ((i13 & 65536) != 0) {
                    i43 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (lVarV.n(n0Var)) {
                        i23 = 1048576;
                    }
                    i43 |= i23;
                }
                if ((i13 & 131072) != 0) {
                    i43 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                }
                if ((306783379 & i55) != 306783378) {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC10 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC10.getBodyLarge();
                    bodySmall = typographyC10.getBodySmall();
                    pVar18 = pVar13;
                    long j1114 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j1114, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG10 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar111 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar112 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE118 = r1.e(lVar112);
                    p2.d dVar1111118 = (p2.d) l1VarG10.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar1111118.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf118 = Float.valueOf(f12);
                    p2.d dVar1111119 = (p2.d) l1VarG10.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar1111119.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD14 = m1.d(l1VarG10, fValueOf118, Float.valueOf(f13), lVar111.invoke(l1VarG10.n(), lVarV, 0), p1VarE118, "LabelProgress", lVarV, 196608);
                    p2.n nVar10 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE119 = r1.e(lVar112);
                    p2.d dVar11111110 = (p2.d) l1VarG10.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar11111110.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf119 = Float.valueOf(f14);
                    p2.d dVar11111111 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar11111111.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG10, fValueOf119, Float.valueOf(f15), nVar10.invoke(r4.n(), lVarV, 0), p1VarE119, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar10 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE1110 = r1.e(lVar112);
                    p2.d dVar11111112 = (p2.d) l1VarG10.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar11111112.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1110 = Float.valueOf(f16);
                    p2.d dVar11111113 = (p2.d) l1VarG10.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar11111113.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG10, fValueOf1110, Float.valueOf(f11), oVar10.invoke(l1VarG10.n(), lVarV, 0), p1VarE1110, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar10 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG10.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var110 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG10.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL19 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG10.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG10, p1VarL19, k3.p1.l(j12), mVar10.invoke(l1VarG10.n(), lVarV, 0), p1Var110, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar10 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var111 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL110 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG10, p1VarL110, k3.p1.l(jG), kVar10.invoke(r8.n(), lVar2, 0), p1Var111, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD14.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar11111114 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar11111114, lVar2, 54);
                    }
                    lVar2.l();
                    long jI10 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var110 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j1115 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle14 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var111 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK10 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var118 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var119 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE17 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion12 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion12, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE17, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var1110 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                } else {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC11 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC11.getBodyLarge();
                    bodySmall = typographyC11.getBodySmall();
                    pVar18 = pVar13;
                    long j1116 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j1116, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG11 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar113 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar114 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE1111 = r1.e(lVar114);
                    p2.d dVar11111115 = (p2.d) l1VarG11.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar11111115.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1111 = Float.valueOf(f12);
                    p2.d dVar11111116 = (p2.d) l1VarG11.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar11111116.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD15 = m1.d(l1VarG11, fValueOf1111, Float.valueOf(f13), lVar113.invoke(l1VarG11.n(), lVarV, 0), p1VarE1111, "LabelProgress", lVarV, 196608);
                    p2.n nVar11 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE1112 = r1.e(lVar114);
                    p2.d dVar11111117 = (p2.d) l1VarG11.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar11111117.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1112 = Float.valueOf(f14);
                    p2.d dVar11111118 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar11111118.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG11, fValueOf1112, Float.valueOf(f15), nVar11.invoke(r4.n(), lVarV, 0), p1VarE1112, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar11 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE1113 = r1.e(lVar114);
                    p2.d dVar11111119 = (p2.d) l1VarG11.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar11111119.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1113 = Float.valueOf(f16);
                    p2.d dVar111111110 = (p2.d) l1VarG11.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar111111110.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG11, fValueOf1113, Float.valueOf(f11), oVar11.invoke(l1VarG11.n(), lVarV, 0), p1VarE1113, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar11 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG11.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var112 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG11.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL111 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG11.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG11, p1VarL111, k3.p1.l(j12), mVar11.invoke(l1VarG11.n(), lVarV, 0), p1Var112, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar11 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var113 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL112 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG11, p1VarL112, k3.p1.l(jG), kVar11.invoke(r8.n(), lVar2, 0), p1Var113, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD15.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar111111111 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar111111111, lVar2, 54);
                    }
                    lVar2.l();
                    long jI11 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var112 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j1117 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle15 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var113 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK11 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var1111 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var1112 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE18 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion13 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion13, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE18, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var1113 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                }
            }
            i55 |= 100663296;
            i29 = i13 & 512;
            if (i29 != 0) {
                if ((i11 & 805306368) == 0) {
                    if (lVarV.K(pVar8)) {
                        i31 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i31 = 268435456;
                    }
                    i55 |= i31;
                }
                i32 = i13 & 1024;
                if (i32 != 0) {
                    i33 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (lVarV.K(pVar9)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i12 | i34;
                } else {
                    i33 = i12;
                }
                i35 = i13 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i12 & 48) != 0) {
                    i33 |= lVarV.p(z11) ? 32 : 16;
                }
                i36 = i33;
                i37 = i13 & 4096;
                if (i37 != 0) {
                    i39 = i36 | KyberEngine.KyberPolyBytes;
                } else {
                    i38 = i36;
                    if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                        i38 |= lVarV.p(z12) ? 256 : 128;
                    }
                    i39 = i38;
                }
                i41 = i13 & PKIFailureInfo.certRevoked;
                if (i41 != 0) {
                    i43 = i39 | 3072;
                } else {
                    i42 = i39;
                    if ((i12 & 3072) != 0) {
                        i42 |= lVarV.p(z13) ? 2048 : 1024;
                    }
                    i43 = i42;
                }
                if ((i13 & 16384) != 0) {
                    i43 |= 24576;
                } else if ((i12 & 24576) == 0) {
                    if (lVarV.n(jVar)) {
                        i17 = 16384;
                    }
                    i43 |= i17;
                }
                if ((32768 & i13) != 0) {
                    i43 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.n(yVar)) {
                        i44 = 131072;
                    } else {
                        i44 = 65536;
                    }
                    i43 |= i44;
                }
                if ((i13 & 65536) != 0) {
                    i43 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (lVarV.n(n0Var)) {
                        i23 = 1048576;
                    }
                    i43 |= i23;
                }
                if ((i13 & 131072) != 0) {
                    i43 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                }
                if ((306783379 & i55) != 306783378) {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC12 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC12.getBodyLarge();
                    bodySmall = typographyC12.getBodySmall();
                    pVar18 = pVar13;
                    long j1118 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j1118, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG12 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar115 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar116 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE1114 = r1.e(lVar116);
                    p2.d dVar111111112 = (p2.d) l1VarG12.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar111111112.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1114 = Float.valueOf(f12);
                    p2.d dVar111111113 = (p2.d) l1VarG12.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar111111113.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD16 = m1.d(l1VarG12, fValueOf1114, Float.valueOf(f13), lVar115.invoke(l1VarG12.n(), lVarV, 0), p1VarE1114, "LabelProgress", lVarV, 196608);
                    p2.n nVar12 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE1115 = r1.e(lVar116);
                    p2.d dVar111111114 = (p2.d) l1VarG12.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar111111114.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1115 = Float.valueOf(f14);
                    p2.d dVar111111115 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar111111115.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG12, fValueOf1115, Float.valueOf(f15), nVar12.invoke(r4.n(), lVarV, 0), p1VarE1115, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar12 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE1116 = r1.e(lVar116);
                    p2.d dVar111111116 = (p2.d) l1VarG12.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar111111116.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1116 = Float.valueOf(f16);
                    p2.d dVar111111117 = (p2.d) l1VarG12.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar111111117.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG12, fValueOf1116, Float.valueOf(f11), oVar12.invoke(l1VarG12.n(), lVarV, 0), p1VarE1116, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar12 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG12.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var114 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG12.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL113 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG12.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG12, p1VarL113, k3.p1.l(j12), mVar12.invoke(l1VarG12.n(), lVarV, 0), p1Var114, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar12 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var115 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL114 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG12, p1VarL114, k3.p1.l(jG), kVar12.invoke(r8.n(), lVar2, 0), p1Var115, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD16.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar111111118 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar111111118, lVar2, 54);
                    }
                    lVar2.l();
                    long jI12 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var114 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j1119 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle16 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var115 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK12 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var1114 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var1115 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE19 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion14 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion14, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE19, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var1116 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                } else {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC13 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC13.getBodyLarge();
                    bodySmall = typographyC13.getBodySmall();
                    pVar18 = pVar13;
                    long j11110 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j11110, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG13 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar117 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar118 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE1117 = r1.e(lVar118);
                    p2.d dVar111111119 = (p2.d) l1VarG13.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar111111119.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1117 = Float.valueOf(f12);
                    p2.d dVar1111111110 = (p2.d) l1VarG13.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar1111111110.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD17 = m1.d(l1VarG13, fValueOf1117, Float.valueOf(f13), lVar117.invoke(l1VarG13.n(), lVarV, 0), p1VarE1117, "LabelProgress", lVarV, 196608);
                    p2.n nVar13 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE1118 = r1.e(lVar118);
                    p2.d dVar1111111111 = (p2.d) l1VarG13.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar1111111111.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1118 = Float.valueOf(f14);
                    p2.d dVar1111111112 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar1111111112.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG13, fValueOf1118, Float.valueOf(f15), nVar13.invoke(r4.n(), lVarV, 0), p1VarE1118, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar13 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE1119 = r1.e(lVar118);
                    p2.d dVar1111111113 = (p2.d) l1VarG13.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar1111111113.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1119 = Float.valueOf(f16);
                    p2.d dVar1111111114 = (p2.d) l1VarG13.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar1111111114.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG13, fValueOf1119, Float.valueOf(f11), oVar13.invoke(l1VarG13.n(), lVarV, 0), p1VarE1119, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar13 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG13.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var116 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG13.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL115 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG13.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG13, p1VarL115, k3.p1.l(j12), mVar13.invoke(l1VarG13.n(), lVarV, 0), p1Var116, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar13 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var117 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL116 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG13, p1VarL116, k3.p1.l(jG), kVar13.invoke(r8.n(), lVar2, 0), p1Var117, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD17.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar1111111115 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar1111111115, lVar2, 54);
                    }
                    lVar2.l();
                    long jI13 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var116 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j11111 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle17 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var117 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK13 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var1117 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var1118 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE110 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion15 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion15, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE110, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var1119 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                }
            }
            i55 |= 805306368;
            i32 = i13 & 1024;
            if (i32 != 0) {
                i33 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (lVarV.K(pVar9)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i12 | i34;
            } else {
                i33 = i12;
            }
            i35 = i13 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i12 & 48) != 0) {
                i33 |= lVarV.p(z11) ? 32 : 16;
            }
            i36 = i33;
            i37 = i13 & 4096;
            if (i37 != 0) {
                i39 = i36 | KyberEngine.KyberPolyBytes;
            } else {
                i38 = i36;
                if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                    i38 |= lVarV.p(z12) ? 256 : 128;
                }
                i39 = i38;
            }
            i41 = i13 & PKIFailureInfo.certRevoked;
            if (i41 != 0) {
                i43 = i39 | 3072;
            } else {
                i42 = i39;
                if ((i12 & 3072) != 0) {
                    i42 |= lVarV.p(z13) ? 2048 : 1024;
                }
                i43 = i42;
            }
            if ((i13 & 16384) != 0) {
                i43 |= 24576;
            } else if ((i12 & 24576) == 0) {
                if (lVarV.n(jVar)) {
                    i17 = 16384;
                }
                i43 |= i17;
            }
            if ((32768 & i13) != 0) {
                i43 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (lVarV.n(yVar)) {
                    i44 = 131072;
                } else {
                    i44 = 65536;
                }
                i43 |= i44;
            }
            if ((i13 & 65536) != 0) {
                i43 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (lVarV.n(n0Var)) {
                    i23 = 1048576;
                }
                i43 |= i23;
            }
            if ((i13 & 131072) != 0) {
                i43 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
            }
            if ((306783379 & i55) != 306783378) {
                if (i19 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i22 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i27 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i29 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                pVar16 = pVar11;
                if (i32 != 0) {
                    pVar17 = null;
                } else {
                    pVar17 = pVar9;
                }
                if (i35 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i41 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i55 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i45 = i43;
                if ((i55 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI = lVarV.I();
                if (z19) {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                } else {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                }
                text = ((TransformedText) objI).getText().getText();
                zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                if (zBooleanValue) {
                    dVar = p2.d.Focused;
                } else if (text.length() == 0) {
                    dVar = p2.d.UnfocusedEmpty;
                } else {
                    dVar = p2.d.UnfocusedNotEmpty;
                }
                jG = n0Var.g(z15, z16, zBooleanValue);
                Typography typographyC14 = t.f96158a.c(lVarV, 6);
                bodyLarge = typographyC14.getBodyLarge();
                bodySmall = typographyC14.getBodySmall();
                pVar18 = pVar13;
                long j11112 = bodyLarge.j();
                companion = k3.p1.INSTANCE;
                if (k3.p1.r(j11112, companion.j())) {
                }
                j11 = bodySmall.j();
                if (z21) {
                    j11 = jG;
                }
                j12 = bodyLarge.j();
                if (z21) {
                    j12 = jG;
                }
                if (pVar3 != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z21;
                j13 = j11;
                l1 l1VarG14 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                p2.l lVar119 = p2.l.f100860c;
                p013kotlin.jvm.internal.l lVar1110 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE11110 = r1.e(lVar1110);
                p2.d dVar1111111116 = (p2.d) l1VarG14.i();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = p.f100853b;
                i46 = iArr[dVar1111111116.ordinal()];
                f11 = 1.0f;
                if (i46 == 1) {
                    f12 = 1.0f;
                } else if (i46 != 2) {
                    if (i46 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11110 = Float.valueOf(f12);
                p2.d dVar1111111117 = (p2.d) l1VarG14.p();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i47 = iArr[dVar1111111117.ordinal()];
                if (i47 == 1) {
                    f13 = 1.0f;
                } else if (i47 != 2) {
                    if (i47 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3 y3VarD18 = m1.d(l1VarG14, fValueOf11110, Float.valueOf(f13), lVar119.invoke(l1VarG14.n(), lVarV, 0), p1VarE11110, "LabelProgress", lVarV, 196608);
                p2.n nVar14 = p2.n.f100862c;
                p019p1.p1<Float, p019p1.m> p1VarE11111 = r1.e(lVar1110);
                p2.d dVar1111111118 = (p2.d) l1VarG14.i();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i48 = iArr[dVar1111111118.ordinal()];
                if (i48 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i48 != 2) {
                        if (i48 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z22) {
                        f14 = 1.0f;
                    }
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11111 = Float.valueOf(f14);
                p2.d dVar1111111119 = (p2.d) r4.p();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i49 = iArr[dVar1111111119.ordinal()];
                if (i49 == 1) {
                    f15 = 1.0f;
                } else {
                    if (i49 != 2) {
                        if (i49 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 == 0) {
                        f15 = 1.0f;
                    }
                    f15 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD = m1.d(l1VarG14, fValueOf11111, Float.valueOf(f15), nVar14.invoke(r4.n(), lVarV, 0), p1VarE11111, "PlaceholderOpacity", lVarV, 196608);
                p2.o oVar14 = p2.o.f100863c;
                p019p1.p1<Float, p019p1.m> p1VarE11112 = r1.e(lVar1110);
                p2.d dVar11111111110 = (p2.d) l1VarG14.i();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i51 = iArr[dVar11111111110.ordinal()];
                if (i51 == 1) {
                    f16 = 1.0f;
                } else {
                    if (i51 != 2) {
                        if (i51 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f16 = BitmapDescriptorFactory.HUE_RED;
                    }
                    f16 = 1.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11112 = Float.valueOf(f16);
                p2.d dVar11111111111 = (p2.d) l1VarG14.p();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i52 = iArr[dVar11111111111.ordinal()];
                if (i52 != 1) {
                    if (i52 != 2) {
                        if (i52 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = m1.d(l1VarG14, fValueOf11112, Float.valueOf(f11), oVar14.invoke(l1VarG14.n(), lVarV, 0), p1VarE11112, "PrefixSuffixOpacity", lVarV, 196608);
                p2.m mVar14 = p2.m.f100861c;
                dVar2 = (p2.d) l1VarG14.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar2.ordinal()] == 1) {
                    j14 = j13;
                } else {
                    j14 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                cVarU = k3.p1.u(j14);
                zN = lVarV.n(cVarU);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                } else {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                }
                p019p1.p1 p1Var118 = (p019p1.p1) objI2;
                dVar3 = (p2.d) l1VarG14.i();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar3.ordinal()] == 1) {
                    j15 = j13;
                } else {
                    j15 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                k3.p1 p1VarL117 = k3.p1.l(j15);
                dVar4 = (p2.d) l1VarG14.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar4.ordinal()] == 1) {
                    j12 = j13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD3 = m1.d(l1VarG14, p1VarL117, k3.p1.l(j12), mVar14.invoke(l1VarG14.n(), lVarV, 0), p1Var118, "LabelTextStyleColor", lVarV, 196608);
                lVar2 = lVarV;
                p2.k kVar14 = p2.k.f100859c;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                cVarU2 = k3.p1.u(jG);
                zN2 = lVar2.n(cVarU2);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                } else {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                }
                p019p1.p1 p1Var119 = (p019p1.p1) objI3;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                k3.p1 p1VarL118 = k3.p1.l(jG);
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                y3VarD4 = m1.d(l1VarG14, p1VarL118, k3.p1.l(jG), kVar14.invoke(r8.n(), lVar2, 0), p1Var119, "LabelContentColor", lVar2, 196608);
                fFloatValue = ((Number) y3VarD18.getValue()).floatValue();
                lVar2.o(-156998101);
                if (pVar3 == null) {
                    f17 = fFloatValue;
                    textStyle = bodyLarge;
                    textStyle2 = bodySmall;
                    aVarE = null;
                } else {
                    textStyle = bodyLarge;
                    d dVar11111111112 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                    textStyle2 = bodySmall;
                    f17 = fFloatValue;
                    aVarE = z2.c.e(-1236585568, true, dVar11111111112, lVar2, 54);
                }
                lVar2.l();
                long jI14 = n0Var.i(z15, z16, zBooleanValue);
                objI4 = lVar2.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI4 == companion2.a()) {
                    objI4 = n3.d(n3.q(), new k(y3VarD));
                    lVar2.B(objI4);
                }
                y3 y3Var118 = (y3) objI4;
                lVar2.o(-156965270);
                if (pVar16 == null) {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                } else {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                }
                lVar2.l();
                long j11113 = n0Var.j(z15, z16, zBooleanValue);
                objI5 = lVar2.I();
                TextStyle textStyle18 = textStyle3;
                if (objI5 == companion2.a()) {
                    objI5 = n3.d(n3.q(), new l(y3VarD2));
                    lVar2.B(objI5);
                }
                y3 y3Var119 = (y3) objI5;
                lVar2.o(-156940524);
                if (pVar14 == null) {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                } else {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                }
                lVar2.l();
                long jK14 = n0Var.k(z15, z16, zBooleanValue);
                lVar2.o(-156921964);
                if (pVar15 == null) {
                    pVar21 = pVar15;
                    aVarE4 = null;
                } else {
                    pVar21 = pVar15;
                    aVarE4 = null;
                }
                lVar2.l();
                jH = n0Var.h(z15, z16, zBooleanValue);
                lVar2.o(-156902962);
                if (pVar12 == null) {
                    aVarE5 = null;
                } else {
                    aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                }
                lVar2.l();
                jO = n0Var.o(z15, z16, zBooleanValue);
                lVar2.o(-156893937);
                if (pVar18 == null) {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = null;
                } else {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                }
                lVar2.l();
                jL = n0Var.l(z15, z16, zBooleanValue);
                lVar2.o(-156884470);
                if (pVar17 == null) {
                    aVarE7 = null;
                } else {
                    aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                }
                lVar2.l();
                i54 = p.f100852a[pVar.ordinal()];
                if (i54 == z24) {
                    z25 = z14;
                    lVar2.o(-568105095);
                    p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                    lVar2.l();
                    h0 h0Var11110 = h0.f84049a;
                } else if (i54 != 2) {
                    lVar2.o(-565271199);
                    lVar2.l();
                    h0 h0Var11111 = h0.f84049a;
                    z25 = z14;
                } else {
                    lVar2.o(-567018607);
                    objI6 = lVar2.I();
                    if (objI6 == companion2.a()) {
                        objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                        lVar2.B(objI6);
                    }
                    p1Var = (p1) objI6;
                    z2.a aVarE111 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                    androidx.compose.ui.d.Companion companion16 = androidx.compose.ui.d.INSTANCE;
                    zQ = lVar2.q(f17);
                    objI7 = lVar2.I();
                    if (zQ) {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    } else {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    }
                    z25 = z14;
                    w.b(companion16, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE111, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                    lVar2.l();
                    h0 h0Var11112 = h0.f84049a;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar22 = pVar20;
                pVar23 = pVar17;
                z26 = z15;
                pVar24 = pVar12;
                z27 = z16;
                z28 = z25;
                pVar25 = pVar18;
                pVar26 = pVar19;
                pVar27 = pVar21;
            } else {
                if (i19 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i22 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i27 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i29 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                pVar16 = pVar11;
                if (i32 != 0) {
                    pVar17 = null;
                } else {
                    pVar17 = pVar9;
                }
                if (i35 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i41 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i55 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i45 = i43;
                if ((i55 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI = lVarV.I();
                if (z19) {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                } else {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                }
                text = ((TransformedText) objI).getText().getText();
                zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                if (zBooleanValue) {
                    dVar = p2.d.Focused;
                } else if (text.length() == 0) {
                    dVar = p2.d.UnfocusedEmpty;
                } else {
                    dVar = p2.d.UnfocusedNotEmpty;
                }
                jG = n0Var.g(z15, z16, zBooleanValue);
                Typography typographyC15 = t.f96158a.c(lVarV, 6);
                bodyLarge = typographyC15.getBodyLarge();
                bodySmall = typographyC15.getBodySmall();
                pVar18 = pVar13;
                long j11114 = bodyLarge.j();
                companion = k3.p1.INSTANCE;
                if (k3.p1.r(j11114, companion.j())) {
                }
                j11 = bodySmall.j();
                if (z21) {
                    j11 = jG;
                }
                j12 = bodyLarge.j();
                if (z21) {
                    j12 = jG;
                }
                if (pVar3 != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z21;
                j13 = j11;
                l1 l1VarG15 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                p2.l lVar1111 = p2.l.f100860c;
                p013kotlin.jvm.internal.l lVar1112 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE11113 = r1.e(lVar1112);
                p2.d dVar11111111113 = (p2.d) l1VarG15.i();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = p.f100853b;
                i46 = iArr[dVar11111111113.ordinal()];
                f11 = 1.0f;
                if (i46 == 1) {
                    f12 = 1.0f;
                } else if (i46 != 2) {
                    if (i46 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11113 = Float.valueOf(f12);
                p2.d dVar11111111114 = (p2.d) l1VarG15.p();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i47 = iArr[dVar11111111114.ordinal()];
                if (i47 == 1) {
                    f13 = 1.0f;
                } else if (i47 != 2) {
                    if (i47 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3 y3VarD19 = m1.d(l1VarG15, fValueOf11113, Float.valueOf(f13), lVar1111.invoke(l1VarG15.n(), lVarV, 0), p1VarE11113, "LabelProgress", lVarV, 196608);
                p2.n nVar15 = p2.n.f100862c;
                p019p1.p1<Float, p019p1.m> p1VarE11114 = r1.e(lVar1112);
                p2.d dVar11111111115 = (p2.d) l1VarG15.i();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i48 = iArr[dVar11111111115.ordinal()];
                if (i48 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i48 != 2) {
                        if (i48 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z22) {
                        f14 = 1.0f;
                    }
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11114 = Float.valueOf(f14);
                p2.d dVar11111111116 = (p2.d) r4.p();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i49 = iArr[dVar11111111116.ordinal()];
                if (i49 == 1) {
                    f15 = 1.0f;
                } else {
                    if (i49 != 2) {
                        if (i49 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 == 0) {
                        f15 = 1.0f;
                    }
                    f15 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD = m1.d(l1VarG15, fValueOf11114, Float.valueOf(f15), nVar15.invoke(r4.n(), lVarV, 0), p1VarE11114, "PlaceholderOpacity", lVarV, 196608);
                p2.o oVar15 = p2.o.f100863c;
                p019p1.p1<Float, p019p1.m> p1VarE11115 = r1.e(lVar1112);
                p2.d dVar11111111117 = (p2.d) l1VarG15.i();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i51 = iArr[dVar11111111117.ordinal()];
                if (i51 == 1) {
                    f16 = 1.0f;
                } else {
                    if (i51 != 2) {
                        if (i51 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f16 = BitmapDescriptorFactory.HUE_RED;
                    }
                    f16 = 1.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11115 = Float.valueOf(f16);
                p2.d dVar11111111118 = (p2.d) l1VarG15.p();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i52 = iArr[dVar11111111118.ordinal()];
                if (i52 != 1) {
                    if (i52 != 2) {
                        if (i52 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = m1.d(l1VarG15, fValueOf11115, Float.valueOf(f11), oVar15.invoke(l1VarG15.n(), lVarV, 0), p1VarE11115, "PrefixSuffixOpacity", lVarV, 196608);
                p2.m mVar15 = p2.m.f100861c;
                dVar2 = (p2.d) l1VarG15.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar2.ordinal()] == 1) {
                    j14 = j13;
                } else {
                    j14 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                cVarU = k3.p1.u(j14);
                zN = lVarV.n(cVarU);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                } else {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                }
                p019p1.p1 p1Var1110 = (p019p1.p1) objI2;
                dVar3 = (p2.d) l1VarG15.i();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar3.ordinal()] == 1) {
                    j15 = j13;
                } else {
                    j15 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                k3.p1 p1VarL119 = k3.p1.l(j15);
                dVar4 = (p2.d) l1VarG15.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar4.ordinal()] == 1) {
                    j12 = j13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD3 = m1.d(l1VarG15, p1VarL119, k3.p1.l(j12), mVar15.invoke(l1VarG15.n(), lVarV, 0), p1Var1110, "LabelTextStyleColor", lVarV, 196608);
                lVar2 = lVarV;
                p2.k kVar15 = p2.k.f100859c;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                cVarU2 = k3.p1.u(jG);
                zN2 = lVar2.n(cVarU2);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                } else {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                }
                p019p1.p1 p1Var1111 = (p019p1.p1) objI3;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                k3.p1 p1VarL1110 = k3.p1.l(jG);
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                y3VarD4 = m1.d(l1VarG15, p1VarL1110, k3.p1.l(jG), kVar15.invoke(r8.n(), lVar2, 0), p1Var1111, "LabelContentColor", lVar2, 196608);
                fFloatValue = ((Number) y3VarD19.getValue()).floatValue();
                lVar2.o(-156998101);
                if (pVar3 == null) {
                    f17 = fFloatValue;
                    textStyle = bodyLarge;
                    textStyle2 = bodySmall;
                    aVarE = null;
                } else {
                    textStyle = bodyLarge;
                    d dVar11111111119 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                    textStyle2 = bodySmall;
                    f17 = fFloatValue;
                    aVarE = z2.c.e(-1236585568, true, dVar11111111119, lVar2, 54);
                }
                lVar2.l();
                long jI15 = n0Var.i(z15, z16, zBooleanValue);
                objI4 = lVar2.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI4 == companion2.a()) {
                    objI4 = n3.d(n3.q(), new k(y3VarD));
                    lVar2.B(objI4);
                }
                y3 y3Var1110 = (y3) objI4;
                lVar2.o(-156965270);
                if (pVar16 == null) {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                } else {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                }
                lVar2.l();
                long j11115 = n0Var.j(z15, z16, zBooleanValue);
                objI5 = lVar2.I();
                TextStyle textStyle19 = textStyle3;
                if (objI5 == companion2.a()) {
                    objI5 = n3.d(n3.q(), new l(y3VarD2));
                    lVar2.B(objI5);
                }
                y3 y3Var1111 = (y3) objI5;
                lVar2.o(-156940524);
                if (pVar14 == null) {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                } else {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                }
                lVar2.l();
                long jK15 = n0Var.k(z15, z16, zBooleanValue);
                lVar2.o(-156921964);
                if (pVar15 == null) {
                    pVar21 = pVar15;
                    aVarE4 = null;
                } else {
                    pVar21 = pVar15;
                    aVarE4 = null;
                }
                lVar2.l();
                jH = n0Var.h(z15, z16, zBooleanValue);
                lVar2.o(-156902962);
                if (pVar12 == null) {
                    aVarE5 = null;
                } else {
                    aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                }
                lVar2.l();
                jO = n0Var.o(z15, z16, zBooleanValue);
                lVar2.o(-156893937);
                if (pVar18 == null) {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = null;
                } else {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                }
                lVar2.l();
                jL = n0Var.l(z15, z16, zBooleanValue);
                lVar2.o(-156884470);
                if (pVar17 == null) {
                    aVarE7 = null;
                } else {
                    aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                }
                lVar2.l();
                i54 = p.f100852a[pVar.ordinal()];
                if (i54 == z24) {
                    z25 = z14;
                    lVar2.o(-568105095);
                    p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                    lVar2.l();
                    h0 h0Var11113 = h0.f84049a;
                } else if (i54 != 2) {
                    lVar2.o(-565271199);
                    lVar2.l();
                    h0 h0Var11114 = h0.f84049a;
                    z25 = z14;
                } else {
                    lVar2.o(-567018607);
                    objI6 = lVar2.I();
                    if (objI6 == companion2.a()) {
                        objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                        lVar2.B(objI6);
                    }
                    p1Var = (p1) objI6;
                    z2.a aVarE112 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                    androidx.compose.ui.d.Companion companion17 = androidx.compose.ui.d.INSTANCE;
                    zQ = lVar2.q(f17);
                    objI7 = lVar2.I();
                    if (zQ) {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    } else {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    }
                    z25 = z14;
                    w.b(companion17, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE112, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                    lVar2.l();
                    h0 h0Var11115 = h0.f84049a;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar22 = pVar20;
                pVar23 = pVar17;
                z26 = z15;
                pVar24 = pVar12;
                z27 = z16;
                z28 = z25;
                pVar25 = pVar18;
                pVar26 = pVar19;
                pVar27 = pVar21;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
            }
        }
        i55 |= KyberEngine.KyberPolyBytes;
        if ((i13 & 8) != 0) {
            i55 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (lVarV.n(z0Var)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i55 |= i15;
        }
        i16 = i13 & 16;
        i17 = PKIFailureInfo.certRevoked;
        if (i16 != 0) {
            i55 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (lVarV.K(pVar3)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i55 |= i18;
        }
        i19 = i13 & 32;
        if (i19 != 0) {
            i55 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(pVar4)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i55 |= i21;
        }
        i22 = i13 & 64;
        i23 = PKIFailureInfo.signerNotTrusted;
        if (i22 != 0) {
            i55 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.K(pVar5)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i55 |= i24;
        }
        i25 = i13 & 128;
        if (i25 != 0) {
            if ((i11 & 12582912) == 0) {
                if (lVarV.K(pVar6)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i55 |= i26;
            }
            i27 = i13 & 256;
            if (i27 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.K(pVar7)) {
                        i28 = 67108864;
                    } else {
                        i28 = 33554432;
                    }
                    i55 |= i28;
                }
                i29 = i13 & 512;
                if (i29 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar8)) {
                            i31 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i31 = 268435456;
                        }
                        i55 |= i31;
                    }
                    i32 = i13 & 1024;
                    if (i32 != 0) {
                        i33 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        if (lVarV.K(pVar9)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i12 | i34;
                    } else {
                        i33 = i12;
                    }
                    i35 = i13 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i12 & 48) != 0) {
                        i33 |= lVarV.p(z11) ? 32 : 16;
                    }
                    i36 = i33;
                    i37 = i13 & 4096;
                    if (i37 != 0) {
                        i39 = i36 | KyberEngine.KyberPolyBytes;
                    } else {
                        i38 = i36;
                        if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                            i38 |= lVarV.p(z12) ? 256 : 128;
                        }
                        i39 = i38;
                    }
                    i41 = i13 & PKIFailureInfo.certRevoked;
                    if (i41 != 0) {
                        i43 = i39 | 3072;
                    } else {
                        i42 = i39;
                        if ((i12 & 3072) != 0) {
                            i42 |= lVarV.p(z13) ? 2048 : 1024;
                        }
                        i43 = i42;
                    }
                    if ((i13 & 16384) != 0) {
                        i43 |= 24576;
                    } else if ((i12 & 24576) == 0) {
                        if (lVarV.n(jVar)) {
                            i17 = 16384;
                        }
                        i43 |= i17;
                    }
                    if ((32768 & i13) != 0) {
                        i43 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (lVarV.n(yVar)) {
                            i44 = 131072;
                        } else {
                            i44 = 65536;
                        }
                        i43 |= i44;
                    }
                    if ((i13 & 65536) != 0) {
                        i43 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (lVarV.n(n0Var)) {
                            i23 = 1048576;
                        }
                        i43 |= i23;
                    }
                    if ((i13 & 131072) != 0) {
                        i43 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                    }
                    if ((306783379 & i55) != 306783378) {
                        if (i19 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i22 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i27 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i29 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar8;
                        }
                        pVar16 = pVar11;
                        if (i32 != 0) {
                            pVar17 = null;
                        } else {
                            pVar17 = pVar9;
                        }
                        if (i35 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i41 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                        }
                        if ((i55 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i45 = i43;
                        if ((i55 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI = lVarV.I();
                        if (z19) {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        } else {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        }
                        text = ((TransformedText) objI).getText().getText();
                        zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                        if (zBooleanValue) {
                            dVar = p2.d.Focused;
                        } else if (text.length() == 0) {
                            dVar = p2.d.UnfocusedEmpty;
                        } else {
                            dVar = p2.d.UnfocusedNotEmpty;
                        }
                        jG = n0Var.g(z15, z16, zBooleanValue);
                        Typography typographyC16 = t.f96158a.c(lVarV, 6);
                        bodyLarge = typographyC16.getBodyLarge();
                        bodySmall = typographyC16.getBodySmall();
                        pVar18 = pVar13;
                        long j11116 = bodyLarge.j();
                        companion = k3.p1.INSTANCE;
                        if (k3.p1.r(j11116, companion.j())) {
                        }
                        j11 = bodySmall.j();
                        if (z21) {
                            j11 = jG;
                        }
                        j12 = bodyLarge.j();
                        if (z21) {
                            j12 = jG;
                        }
                        if (pVar3 != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z21;
                        j13 = j11;
                        l1 l1VarG16 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                        p2.l lVar1113 = p2.l.f100860c;
                        p013kotlin.jvm.internal.l lVar1114 = p013kotlin.jvm.internal.l.f86526a;
                        p019p1.p1<Float, p019p1.m> p1VarE11116 = r1.e(lVar1114);
                        p2.d dVar111111111110 = (p2.d) l1VarG16.i();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        iArr = p.f100853b;
                        i46 = iArr[dVar111111111110.ordinal()];
                        f11 = 1.0f;
                        if (i46 == 1) {
                            f12 = 1.0f;
                        } else if (i46 != 2) {
                            if (i46 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf11116 = Float.valueOf(f12);
                        p2.d dVar111111111111 = (p2.d) l1VarG16.p();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        i47 = iArr[dVar111111111111.ordinal()];
                        if (i47 == 1) {
                            f13 = 1.0f;
                        } else if (i47 != 2) {
                            if (i47 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3 y3VarD110 = m1.d(l1VarG16, fValueOf11116, Float.valueOf(f13), lVar1113.invoke(l1VarG16.n(), lVarV, 0), p1VarE11116, "LabelProgress", lVarV, 196608);
                        p2.n nVar16 = p2.n.f100862c;
                        p019p1.p1<Float, p019p1.m> p1VarE11117 = r1.e(lVar1114);
                        p2.d dVar111111111112 = (p2.d) l1VarG16.i();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i48 = iArr[dVar111111111112.ordinal()];
                        if (i48 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i48 != 2) {
                                if (i48 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z22) {
                                f14 = 1.0f;
                            }
                            f14 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf11117 = Float.valueOf(f14);
                        p2.d dVar111111111113 = (p2.d) r4.p();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i49 = iArr[dVar111111111113.ordinal()];
                        if (i49 == 1) {
                            f15 = 1.0f;
                        } else {
                            if (i49 != 2) {
                                if (i49 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 == 0) {
                                f15 = 1.0f;
                            }
                            f15 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD = m1.d(l1VarG16, fValueOf11117, Float.valueOf(f15), nVar16.invoke(r4.n(), lVarV, 0), p1VarE11117, "PlaceholderOpacity", lVarV, 196608);
                        p2.o oVar16 = p2.o.f100863c;
                        p019p1.p1<Float, p019p1.m> p1VarE11118 = r1.e(lVar1114);
                        p2.d dVar111111111114 = (p2.d) l1VarG16.i();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i51 = iArr[dVar111111111114.ordinal()];
                        if (i51 == 1) {
                            f16 = 1.0f;
                        } else {
                            if (i51 != 2) {
                                if (i51 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f16 = BitmapDescriptorFactory.HUE_RED;
                            }
                            f16 = 1.0f;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf11118 = Float.valueOf(f16);
                        p2.d dVar111111111115 = (p2.d) l1VarG16.p();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i52 = iArr[dVar111111111115.ordinal()];
                        if (i52 != 1) {
                            if (i52 != 2) {
                                if (i52 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f11 = BitmapDescriptorFactory.HUE_RED;
                            }
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD2 = m1.d(l1VarG16, fValueOf11118, Float.valueOf(f11), oVar16.invoke(l1VarG16.n(), lVarV, 0), p1VarE11118, "PrefixSuffixOpacity", lVarV, 196608);
                        p2.m mVar16 = p2.m.f100861c;
                        dVar2 = (p2.d) l1VarG16.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar2.ordinal()] == 1) {
                            j14 = j13;
                        } else {
                            j14 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        cVarU = k3.p1.u(j14);
                        zN = lVarV.n(cVarU);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        } else {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        }
                        p019p1.p1 p1Var1112 = (p019p1.p1) objI2;
                        dVar3 = (p2.d) l1VarG16.i();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar3.ordinal()] == 1) {
                            j15 = j13;
                        } else {
                            j15 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        k3.p1 p1VarL1111 = k3.p1.l(j15);
                        dVar4 = (p2.d) l1VarG16.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar4.ordinal()] == 1) {
                            j12 = j13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD3 = m1.d(l1VarG16, p1VarL1111, k3.p1.l(j12), mVar16.invoke(l1VarG16.n(), lVarV, 0), p1Var1112, "LabelTextStyleColor", lVarV, 196608);
                        lVar2 = lVarV;
                        p2.k kVar16 = p2.k.f100859c;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        cVarU2 = k3.p1.u(jG);
                        zN2 = lVar2.n(cVarU2);
                        objI3 = lVar2.I();
                        if (zN2) {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        } else {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        }
                        p019p1.p1 p1Var1113 = (p019p1.p1) objI3;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        k3.p1 p1VarL1112 = k3.p1.l(jG);
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        y3VarD4 = m1.d(l1VarG16, p1VarL1112, k3.p1.l(jG), kVar16.invoke(r8.n(), lVar2, 0), p1Var1113, "LabelContentColor", lVar2, 196608);
                        fFloatValue = ((Number) y3VarD110.getValue()).floatValue();
                        lVar2.o(-156998101);
                        if (pVar3 == null) {
                            f17 = fFloatValue;
                            textStyle = bodyLarge;
                            textStyle2 = bodySmall;
                            aVarE = null;
                        } else {
                            textStyle = bodyLarge;
                            d dVar111111111116 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                            textStyle2 = bodySmall;
                            f17 = fFloatValue;
                            aVarE = z2.c.e(-1236585568, true, dVar111111111116, lVar2, 54);
                        }
                        lVar2.l();
                        long jI16 = n0Var.i(z15, z16, zBooleanValue);
                        objI4 = lVar2.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI4 == companion2.a()) {
                            objI4 = n3.d(n3.q(), new k(y3VarD));
                            lVar2.B(objI4);
                        }
                        y3 y3Var1112 = (y3) objI4;
                        lVar2.o(-156965270);
                        if (pVar16 == null) {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        } else {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        }
                        lVar2.l();
                        long j11117 = n0Var.j(z15, z16, zBooleanValue);
                        objI5 = lVar2.I();
                        TextStyle textStyle110 = textStyle3;
                        if (objI5 == companion2.a()) {
                            objI5 = n3.d(n3.q(), new l(y3VarD2));
                            lVar2.B(objI5);
                        }
                        y3 y3Var1113 = (y3) objI5;
                        lVar2.o(-156940524);
                        if (pVar14 == null) {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        } else {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        }
                        lVar2.l();
                        long jK16 = n0Var.k(z15, z16, zBooleanValue);
                        lVar2.o(-156921964);
                        if (pVar15 == null) {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        } else {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        }
                        lVar2.l();
                        jH = n0Var.h(z15, z16, zBooleanValue);
                        lVar2.o(-156902962);
                        if (pVar12 == null) {
                            aVarE5 = null;
                        } else {
                            aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                        }
                        lVar2.l();
                        jO = n0Var.o(z15, z16, zBooleanValue);
                        lVar2.o(-156893937);
                        if (pVar18 == null) {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = null;
                        } else {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                        }
                        lVar2.l();
                        jL = n0Var.l(z15, z16, zBooleanValue);
                        lVar2.o(-156884470);
                        if (pVar17 == null) {
                            aVarE7 = null;
                        } else {
                            aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                        }
                        lVar2.l();
                        i54 = p.f100852a[pVar.ordinal()];
                        if (i54 == z24) {
                            z25 = z14;
                            lVar2.o(-568105095);
                            p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                            lVar2.l();
                            h0 h0Var11116 = h0.f84049a;
                        } else if (i54 != 2) {
                            lVar2.o(-565271199);
                            lVar2.l();
                            h0 h0Var11117 = h0.f84049a;
                            z25 = z14;
                        } else {
                            lVar2.o(-567018607);
                            objI6 = lVar2.I();
                            if (objI6 == companion2.a()) {
                                objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                lVar2.B(objI6);
                            }
                            p1Var = (p1) objI6;
                            z2.a aVarE113 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                            androidx.compose.ui.d.Companion companion18 = androidx.compose.ui.d.INSTANCE;
                            zQ = lVar2.q(f17);
                            objI7 = lVar2.I();
                            if (zQ) {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            } else {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            }
                            z25 = z14;
                            w.b(companion18, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE113, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                            lVar2.l();
                            h0 h0Var11118 = h0.f84049a;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar22 = pVar20;
                        pVar23 = pVar17;
                        z26 = z15;
                        pVar24 = pVar12;
                        z27 = z16;
                        z28 = z25;
                        pVar25 = pVar18;
                        pVar26 = pVar19;
                        pVar27 = pVar21;
                    } else {
                        if (i19 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i22 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i27 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i29 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar8;
                        }
                        pVar16 = pVar11;
                        if (i32 != 0) {
                            pVar17 = null;
                        } else {
                            pVar17 = pVar9;
                        }
                        if (i35 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i41 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                        }
                        if ((i55 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i45 = i43;
                        if ((i55 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI = lVarV.I();
                        if (z19) {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        } else {
                            objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                            lVarV.B(objI);
                        }
                        text = ((TransformedText) objI).getText().getText();
                        zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                        if (zBooleanValue) {
                            dVar = p2.d.Focused;
                        } else if (text.length() == 0) {
                            dVar = p2.d.UnfocusedEmpty;
                        } else {
                            dVar = p2.d.UnfocusedNotEmpty;
                        }
                        jG = n0Var.g(z15, z16, zBooleanValue);
                        Typography typographyC17 = t.f96158a.c(lVarV, 6);
                        bodyLarge = typographyC17.getBodyLarge();
                        bodySmall = typographyC17.getBodySmall();
                        pVar18 = pVar13;
                        long j11118 = bodyLarge.j();
                        companion = k3.p1.INSTANCE;
                        if (k3.p1.r(j11118, companion.j())) {
                        }
                        j11 = bodySmall.j();
                        if (z21) {
                            j11 = jG;
                        }
                        j12 = bodyLarge.j();
                        if (z21) {
                            j12 = jG;
                        }
                        if (pVar3 != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z21;
                        j13 = j11;
                        l1 l1VarG17 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                        p2.l lVar1115 = p2.l.f100860c;
                        p013kotlin.jvm.internal.l lVar1116 = p013kotlin.jvm.internal.l.f86526a;
                        p019p1.p1<Float, p019p1.m> p1VarE11119 = r1.e(lVar1116);
                        p2.d dVar111111111117 = (p2.d) l1VarG17.i();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        iArr = p.f100853b;
                        i46 = iArr[dVar111111111117.ordinal()];
                        f11 = 1.0f;
                        if (i46 == 1) {
                            f12 = 1.0f;
                        } else if (i46 != 2) {
                            if (i46 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf11119 = Float.valueOf(f12);
                        p2.d dVar111111111118 = (p2.d) l1VarG17.p();
                        lVarV.o(-2036730335);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                        }
                        i47 = iArr[dVar111111111118.ordinal()];
                        if (i47 == 1) {
                            f13 = 1.0f;
                        } else if (i47 != 2) {
                            if (i47 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3 y3VarD111 = m1.d(l1VarG17, fValueOf11119, Float.valueOf(f13), lVar1115.invoke(l1VarG17.n(), lVarV, 0), p1VarE11119, "LabelProgress", lVarV, 196608);
                        p2.n nVar17 = p2.n.f100862c;
                        p019p1.p1<Float, p019p1.m> p1VarE111110 = r1.e(lVar1116);
                        p2.d dVar111111111119 = (p2.d) l1VarG17.i();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i48 = iArr[dVar111111111119.ordinal()];
                        if (i48 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i48 != 2) {
                                if (i48 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z22) {
                                f14 = 1.0f;
                            }
                            f14 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf111110 = Float.valueOf(f14);
                        p2.d dVar1111111111110 = (p2.d) r4.p();
                        lVarV.o(1435837472);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i49 = iArr[dVar1111111111110.ordinal()];
                        if (i49 == 1) {
                            f15 = 1.0f;
                        } else {
                            if (i49 != 2) {
                                if (i49 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 == 0) {
                                f15 = 1.0f;
                            }
                            f15 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD = m1.d(l1VarG17, fValueOf111110, Float.valueOf(f15), nVar17.invoke(r4.n(), lVarV, 0), p1VarE111110, "PlaceholderOpacity", lVarV, 196608);
                        p2.o oVar17 = p2.o.f100863c;
                        p019p1.p1<Float, p019p1.m> p1VarE111111 = r1.e(lVar1116);
                        p2.d dVar1111111111111 = (p2.d) l1VarG17.i();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i51 = iArr[dVar1111111111111.ordinal()];
                        if (i51 == 1) {
                            f16 = 1.0f;
                        } else {
                            if (i51 != 2) {
                                if (i51 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f16 = BitmapDescriptorFactory.HUE_RED;
                            }
                            f16 = 1.0f;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        Float fValueOf111111 = Float.valueOf(f16);
                        p2.d dVar1111111111112 = (p2.d) l1VarG17.p();
                        lVarV.o(1128033978);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i52 = iArr[dVar1111111111112.ordinal()];
                        if (i52 != 1) {
                            if (i52 != 2) {
                                if (i52 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z22 != 0) {
                                f11 = BitmapDescriptorFactory.HUE_RED;
                            }
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD2 = m1.d(l1VarG17, fValueOf111111, Float.valueOf(f11), oVar17.invoke(l1VarG17.n(), lVarV, 0), p1VarE111111, "PrefixSuffixOpacity", lVarV, 196608);
                        p2.m mVar17 = p2.m.f100861c;
                        dVar2 = (p2.d) l1VarG17.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar2.ordinal()] == 1) {
                            j14 = j13;
                        } else {
                            j14 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        cVarU = k3.p1.u(j14);
                        zN = lVarV.n(cVarU);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        } else {
                            objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                            lVarV.B(objI2);
                        }
                        p019p1.p1 p1Var1114 = (p019p1.p1) objI2;
                        dVar3 = (p2.d) l1VarG17.i();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar3.ordinal()] == 1) {
                            j15 = j13;
                        } else {
                            j15 = j12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        k3.p1 p1VarL1113 = k3.p1.l(j15);
                        dVar4 = (p2.d) l1VarG17.p();
                        lVarV.o(-107432127);
                        if (p020r2.o.J()) {
                            p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        if (iArr[dVar4.ordinal()] == 1) {
                            j12 = j13;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVarV.l();
                        y3VarD3 = m1.d(l1VarG17, p1VarL1113, k3.p1.l(j12), mVar17.invoke(l1VarG17.n(), lVarV, 0), p1Var1114, "LabelTextStyleColor", lVarV, 196608);
                        lVar2 = lVarV;
                        p2.k kVar17 = p2.k.f100859c;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        cVarU2 = k3.p1.u(jG);
                        zN2 = lVar2.n(cVarU2);
                        objI3 = lVar2.I();
                        if (zN2) {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        } else {
                            objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                            lVar2.B(objI3);
                        }
                        p019p1.p1 p1Var1115 = (p019p1.p1) objI3;
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        k3.p1 p1VarL1114 = k3.p1.l(jG);
                        lVar2.o(1023351670);
                        if (p020r2.o.J()) {
                            p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        lVar2.l();
                        y3VarD4 = m1.d(l1VarG17, p1VarL1114, k3.p1.l(jG), kVar17.invoke(r8.n(), lVar2, 0), p1Var1115, "LabelContentColor", lVar2, 196608);
                        fFloatValue = ((Number) y3VarD111.getValue()).floatValue();
                        lVar2.o(-156998101);
                        if (pVar3 == null) {
                            f17 = fFloatValue;
                            textStyle = bodyLarge;
                            textStyle2 = bodySmall;
                            aVarE = null;
                        } else {
                            textStyle = bodyLarge;
                            d dVar1111111111113 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                            textStyle2 = bodySmall;
                            f17 = fFloatValue;
                            aVarE = z2.c.e(-1236585568, true, dVar1111111111113, lVar2, 54);
                        }
                        lVar2.l();
                        long jI17 = n0Var.i(z15, z16, zBooleanValue);
                        objI4 = lVar2.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI4 == companion2.a()) {
                            objI4 = n3.d(n3.q(), new k(y3VarD));
                            lVar2.B(objI4);
                        }
                        y3 y3Var1114 = (y3) objI4;
                        lVar2.o(-156965270);
                        if (pVar16 == null) {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        } else {
                            textStyle3 = textStyle;
                            pVar19 = pVar16;
                            aVarE2 = null;
                        }
                        lVar2.l();
                        long j11119 = n0Var.j(z15, z16, zBooleanValue);
                        objI5 = lVar2.I();
                        TextStyle textStyle111 = textStyle3;
                        if (objI5 == companion2.a()) {
                            objI5 = n3.d(n3.q(), new l(y3VarD2));
                            lVar2.B(objI5);
                        }
                        y3 y3Var1115 = (y3) objI5;
                        lVar2.o(-156940524);
                        if (pVar14 == null) {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        } else {
                            y3Var = y3VarD2;
                            pVar20 = pVar14;
                            aVarE3 = null;
                        }
                        lVar2.l();
                        long jK17 = n0Var.k(z15, z16, zBooleanValue);
                        lVar2.o(-156921964);
                        if (pVar15 == null) {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        } else {
                            pVar21 = pVar15;
                            aVarE4 = null;
                        }
                        lVar2.l();
                        jH = n0Var.h(z15, z16, zBooleanValue);
                        lVar2.o(-156902962);
                        if (pVar12 == null) {
                            aVarE5 = null;
                        } else {
                            aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                        }
                        lVar2.l();
                        jO = n0Var.o(z15, z16, zBooleanValue);
                        lVar2.o(-156893937);
                        if (pVar18 == null) {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = null;
                        } else {
                            z24 = true;
                            i53 = 54;
                            aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                        }
                        lVar2.l();
                        jL = n0Var.l(z15, z16, zBooleanValue);
                        lVar2.o(-156884470);
                        if (pVar17 == null) {
                            aVarE7 = null;
                        } else {
                            aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                        }
                        lVar2.l();
                        i54 = p.f100852a[pVar.ordinal()];
                        if (i54 == z24) {
                            z25 = z14;
                            lVar2.o(-568105095);
                            p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                            lVar2.l();
                            h0 h0Var11119 = h0.f84049a;
                        } else if (i54 != 2) {
                            lVar2.o(-565271199);
                            lVar2.l();
                            h0 h0Var111110 = h0.f84049a;
                            z25 = z14;
                        } else {
                            lVar2.o(-567018607);
                            objI6 = lVar2.I();
                            if (objI6 == companion2.a()) {
                                objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                                lVar2.B(objI6);
                            }
                            p1Var = (p1) objI6;
                            z2.a aVarE114 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                            androidx.compose.ui.d.Companion companion19 = androidx.compose.ui.d.INSTANCE;
                            zQ = lVar2.q(f17);
                            objI7 = lVar2.I();
                            if (zQ) {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            } else {
                                objI7 = new a(f17, p1Var);
                                lVar2.B(objI7);
                            }
                            z25 = z14;
                            w.b(companion19, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE114, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                            lVar2.l();
                            h0 h0Var111111 = h0.f84049a;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar22 = pVar20;
                        pVar23 = pVar17;
                        z26 = z15;
                        pVar24 = pVar12;
                        z27 = z16;
                        z28 = z25;
                        pVar25 = pVar18;
                        pVar26 = pVar19;
                        pVar27 = pVar21;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                    }
                }
                i55 |= 805306368;
                i32 = i13 & 1024;
                if (i32 != 0) {
                    i33 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (lVarV.K(pVar9)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i12 | i34;
                } else {
                    i33 = i12;
                }
                i35 = i13 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i12 & 48) != 0) {
                    i33 |= lVarV.p(z11) ? 32 : 16;
                }
                i36 = i33;
                i37 = i13 & 4096;
                if (i37 != 0) {
                    i39 = i36 | KyberEngine.KyberPolyBytes;
                } else {
                    i38 = i36;
                    if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                        i38 |= lVarV.p(z12) ? 256 : 128;
                    }
                    i39 = i38;
                }
                i41 = i13 & PKIFailureInfo.certRevoked;
                if (i41 != 0) {
                    i43 = i39 | 3072;
                } else {
                    i42 = i39;
                    if ((i12 & 3072) != 0) {
                        i42 |= lVarV.p(z13) ? 2048 : 1024;
                    }
                    i43 = i42;
                }
                if ((i13 & 16384) != 0) {
                    i43 |= 24576;
                } else if ((i12 & 24576) == 0) {
                    if (lVarV.n(jVar)) {
                        i17 = 16384;
                    }
                    i43 |= i17;
                }
                if ((32768 & i13) != 0) {
                    i43 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.n(yVar)) {
                        i44 = 131072;
                    } else {
                        i44 = 65536;
                    }
                    i43 |= i44;
                }
                if ((i13 & 65536) != 0) {
                    i43 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (lVarV.n(n0Var)) {
                        i23 = 1048576;
                    }
                    i43 |= i23;
                }
                if ((i13 & 131072) != 0) {
                    i43 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                }
                if ((306783379 & i55) != 306783378) {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC18 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC18.getBodyLarge();
                    bodySmall = typographyC18.getBodySmall();
                    pVar18 = pVar13;
                    long j111110 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j111110, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG18 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar1117 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar1118 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE111112 = r1.e(lVar1118);
                    p2.d dVar1111111111114 = (p2.d) l1VarG18.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar1111111111114.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111112 = Float.valueOf(f12);
                    p2.d dVar1111111111115 = (p2.d) l1VarG18.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar1111111111115.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD112 = m1.d(l1VarG18, fValueOf111112, Float.valueOf(f13), lVar1117.invoke(l1VarG18.n(), lVarV, 0), p1VarE111112, "LabelProgress", lVarV, 196608);
                    p2.n nVar18 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE111113 = r1.e(lVar1118);
                    p2.d dVar1111111111116 = (p2.d) l1VarG18.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar1111111111116.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111113 = Float.valueOf(f14);
                    p2.d dVar1111111111117 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar1111111111117.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG18, fValueOf111113, Float.valueOf(f15), nVar18.invoke(r4.n(), lVarV, 0), p1VarE111113, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar18 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE111114 = r1.e(lVar1118);
                    p2.d dVar1111111111118 = (p2.d) l1VarG18.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar1111111111118.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111114 = Float.valueOf(f16);
                    p2.d dVar1111111111119 = (p2.d) l1VarG18.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar1111111111119.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG18, fValueOf111114, Float.valueOf(f11), oVar18.invoke(l1VarG18.n(), lVarV, 0), p1VarE111114, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar18 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG18.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var1116 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG18.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL1115 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG18.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG18, p1VarL1115, k3.p1.l(j12), mVar18.invoke(l1VarG18.n(), lVarV, 0), p1Var1116, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar18 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var1117 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL1116 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG18, p1VarL1116, k3.p1.l(jG), kVar18.invoke(r8.n(), lVar2, 0), p1Var1117, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD112.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar11111111111110 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar11111111111110, lVar2, 54);
                    }
                    lVar2.l();
                    long jI18 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var1116 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j111111 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle112 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var1117 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK18 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var111112 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var111113 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE115 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion110 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion110, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE115, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var111114 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                } else {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC19 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC19.getBodyLarge();
                    bodySmall = typographyC19.getBodySmall();
                    pVar18 = pVar13;
                    long j111112 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j111112, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG19 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar1119 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar11110 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE111115 = r1.e(lVar11110);
                    p2.d dVar11111111111111 = (p2.d) l1VarG19.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar11111111111111.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111115 = Float.valueOf(f12);
                    p2.d dVar11111111111112 = (p2.d) l1VarG19.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar11111111111112.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD113 = m1.d(l1VarG19, fValueOf111115, Float.valueOf(f13), lVar1119.invoke(l1VarG19.n(), lVarV, 0), p1VarE111115, "LabelProgress", lVarV, 196608);
                    p2.n nVar19 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE111116 = r1.e(lVar11110);
                    p2.d dVar11111111111113 = (p2.d) l1VarG19.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar11111111111113.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111116 = Float.valueOf(f14);
                    p2.d dVar11111111111114 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar11111111111114.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG19, fValueOf111116, Float.valueOf(f15), nVar19.invoke(r4.n(), lVarV, 0), p1VarE111116, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar19 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE111117 = r1.e(lVar11110);
                    p2.d dVar11111111111115 = (p2.d) l1VarG19.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar11111111111115.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111117 = Float.valueOf(f16);
                    p2.d dVar11111111111116 = (p2.d) l1VarG19.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar11111111111116.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG19, fValueOf111117, Float.valueOf(f11), oVar19.invoke(l1VarG19.n(), lVarV, 0), p1VarE111117, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar19 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG19.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var1118 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG19.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL1117 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG19.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG19, p1VarL1117, k3.p1.l(j12), mVar19.invoke(l1VarG19.n(), lVarV, 0), p1Var1118, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar19 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var1119 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL1118 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG19, p1VarL1118, k3.p1.l(jG), kVar19.invoke(r8.n(), lVar2, 0), p1Var1119, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD113.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar11111111111117 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar11111111111117, lVar2, 54);
                    }
                    lVar2.l();
                    long jI19 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var1118 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j111113 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle113 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var1119 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK19 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var111115 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var111116 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE116 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion111 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion111, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE116, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var111117 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                }
            }
            i55 |= 100663296;
            i29 = i13 & 512;
            if (i29 != 0) {
                if ((i11 & 805306368) == 0) {
                    if (lVarV.K(pVar8)) {
                        i31 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i31 = 268435456;
                    }
                    i55 |= i31;
                }
                i32 = i13 & 1024;
                if (i32 != 0) {
                    i33 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (lVarV.K(pVar9)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i12 | i34;
                } else {
                    i33 = i12;
                }
                i35 = i13 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i12 & 48) != 0) {
                    i33 |= lVarV.p(z11) ? 32 : 16;
                }
                i36 = i33;
                i37 = i13 & 4096;
                if (i37 != 0) {
                    i39 = i36 | KyberEngine.KyberPolyBytes;
                } else {
                    i38 = i36;
                    if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                        i38 |= lVarV.p(z12) ? 256 : 128;
                    }
                    i39 = i38;
                }
                i41 = i13 & PKIFailureInfo.certRevoked;
                if (i41 != 0) {
                    i43 = i39 | 3072;
                } else {
                    i42 = i39;
                    if ((i12 & 3072) != 0) {
                        i42 |= lVarV.p(z13) ? 2048 : 1024;
                    }
                    i43 = i42;
                }
                if ((i13 & 16384) != 0) {
                    i43 |= 24576;
                } else if ((i12 & 24576) == 0) {
                    if (lVarV.n(jVar)) {
                        i17 = 16384;
                    }
                    i43 |= i17;
                }
                if ((32768 & i13) != 0) {
                    i43 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.n(yVar)) {
                        i44 = 131072;
                    } else {
                        i44 = 65536;
                    }
                    i43 |= i44;
                }
                if ((i13 & 65536) != 0) {
                    i43 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (lVarV.n(n0Var)) {
                        i23 = 1048576;
                    }
                    i43 |= i23;
                }
                if ((i13 & 131072) != 0) {
                    i43 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                }
                if ((306783379 & i55) != 306783378) {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC110 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC110.getBodyLarge();
                    bodySmall = typographyC110.getBodySmall();
                    pVar18 = pVar13;
                    long j111114 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j111114, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG110 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar11111 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar11112 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE111118 = r1.e(lVar11112);
                    p2.d dVar11111111111118 = (p2.d) l1VarG110.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar11111111111118.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111118 = Float.valueOf(f12);
                    p2.d dVar11111111111119 = (p2.d) l1VarG110.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar11111111111119.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD114 = m1.d(l1VarG110, fValueOf111118, Float.valueOf(f13), lVar11111.invoke(l1VarG110.n(), lVarV, 0), p1VarE111118, "LabelProgress", lVarV, 196608);
                    p2.n nVar110 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE111119 = r1.e(lVar11112);
                    p2.d dVar111111111111110 = (p2.d) l1VarG110.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar111111111111110.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf111119 = Float.valueOf(f14);
                    p2.d dVar111111111111111 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar111111111111111.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG110, fValueOf111119, Float.valueOf(f15), nVar110.invoke(r4.n(), lVarV, 0), p1VarE111119, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar110 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE1111110 = r1.e(lVar11112);
                    p2.d dVar111111111111112 = (p2.d) l1VarG110.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar111111111111112.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1111110 = Float.valueOf(f16);
                    p2.d dVar111111111111113 = (p2.d) l1VarG110.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar111111111111113.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG110, fValueOf1111110, Float.valueOf(f11), oVar110.invoke(l1VarG110.n(), lVarV, 0), p1VarE1111110, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar110 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG110.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var11110 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG110.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL1119 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG110.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG110, p1VarL1119, k3.p1.l(j12), mVar110.invoke(l1VarG110.n(), lVarV, 0), p1Var11110, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar110 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var11111 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL11110 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG110, p1VarL11110, k3.p1.l(jG), kVar110.invoke(r8.n(), lVar2, 0), p1Var11111, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD114.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar111111111111114 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar111111111111114, lVar2, 54);
                    }
                    lVar2.l();
                    long jI110 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var11110 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j111115 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle114 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var11111 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK110 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var111118 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var111119 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE117 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion112 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion112, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE117, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var1111110 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                } else {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC111 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC111.getBodyLarge();
                    bodySmall = typographyC111.getBodySmall();
                    pVar18 = pVar13;
                    long j111116 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j111116, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG111 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar11113 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar11114 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE1111111 = r1.e(lVar11114);
                    p2.d dVar111111111111115 = (p2.d) l1VarG111.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar111111111111115.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1111111 = Float.valueOf(f12);
                    p2.d dVar111111111111116 = (p2.d) l1VarG111.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar111111111111116.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD115 = m1.d(l1VarG111, fValueOf1111111, Float.valueOf(f13), lVar11113.invoke(l1VarG111.n(), lVarV, 0), p1VarE1111111, "LabelProgress", lVarV, 196608);
                    p2.n nVar111 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE1111112 = r1.e(lVar11114);
                    p2.d dVar111111111111117 = (p2.d) l1VarG111.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar111111111111117.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1111112 = Float.valueOf(f14);
                    p2.d dVar111111111111118 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar111111111111118.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG111, fValueOf1111112, Float.valueOf(f15), nVar111.invoke(r4.n(), lVarV, 0), p1VarE1111112, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar111 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE1111113 = r1.e(lVar11114);
                    p2.d dVar111111111111119 = (p2.d) l1VarG111.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar111111111111119.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf1111113 = Float.valueOf(f16);
                    p2.d dVar1111111111111110 = (p2.d) l1VarG111.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar1111111111111110.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG111, fValueOf1111113, Float.valueOf(f11), oVar111.invoke(l1VarG111.n(), lVarV, 0), p1VarE1111113, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar111 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG111.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var11112 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG111.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL11111 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG111.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG111, p1VarL11111, k3.p1.l(j12), mVar111.invoke(l1VarG111.n(), lVarV, 0), p1Var11112, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar111 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var11113 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL11112 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG111, p1VarL11112, k3.p1.l(jG), kVar111.invoke(r8.n(), lVar2, 0), p1Var11113, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD115.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar1111111111111111 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar1111111111111111, lVar2, 54);
                    }
                    lVar2.l();
                    long jI111 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var11112 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j111117 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle115 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var11113 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK111 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var1111111 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var1111112 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE118 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion113 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion113, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE118, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var1111113 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                }
            }
            i55 |= 805306368;
            i32 = i13 & 1024;
            if (i32 != 0) {
                i33 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (lVarV.K(pVar9)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i12 | i34;
            } else {
                i33 = i12;
            }
            i35 = i13 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i12 & 48) != 0) {
                i33 |= lVarV.p(z11) ? 32 : 16;
            }
            i36 = i33;
            i37 = i13 & 4096;
            if (i37 != 0) {
                i39 = i36 | KyberEngine.KyberPolyBytes;
            } else {
                i38 = i36;
                if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                    i38 |= lVarV.p(z12) ? 256 : 128;
                }
                i39 = i38;
            }
            i41 = i13 & PKIFailureInfo.certRevoked;
            if (i41 != 0) {
                i43 = i39 | 3072;
            } else {
                i42 = i39;
                if ((i12 & 3072) != 0) {
                    i42 |= lVarV.p(z13) ? 2048 : 1024;
                }
                i43 = i42;
            }
            if ((i13 & 16384) != 0) {
                i43 |= 24576;
            } else if ((i12 & 24576) == 0) {
                if (lVarV.n(jVar)) {
                    i17 = 16384;
                }
                i43 |= i17;
            }
            if ((32768 & i13) != 0) {
                i43 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (lVarV.n(yVar)) {
                    i44 = 131072;
                } else {
                    i44 = 65536;
                }
                i43 |= i44;
            }
            if ((i13 & 65536) != 0) {
                i43 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (lVarV.n(n0Var)) {
                    i23 = 1048576;
                }
                i43 |= i23;
            }
            if ((i13 & 131072) != 0) {
                i43 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
            }
            if ((306783379 & i55) != 306783378) {
                if (i19 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i22 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i27 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i29 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                pVar16 = pVar11;
                if (i32 != 0) {
                    pVar17 = null;
                } else {
                    pVar17 = pVar9;
                }
                if (i35 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i41 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i55 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i45 = i43;
                if ((i55 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI = lVarV.I();
                if (z19) {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                } else {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                }
                text = ((TransformedText) objI).getText().getText();
                zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                if (zBooleanValue) {
                    dVar = p2.d.Focused;
                } else if (text.length() == 0) {
                    dVar = p2.d.UnfocusedEmpty;
                } else {
                    dVar = p2.d.UnfocusedNotEmpty;
                }
                jG = n0Var.g(z15, z16, zBooleanValue);
                Typography typographyC112 = t.f96158a.c(lVarV, 6);
                bodyLarge = typographyC112.getBodyLarge();
                bodySmall = typographyC112.getBodySmall();
                pVar18 = pVar13;
                long j111118 = bodyLarge.j();
                companion = k3.p1.INSTANCE;
                if (k3.p1.r(j111118, companion.j())) {
                }
                j11 = bodySmall.j();
                if (z21) {
                    j11 = jG;
                }
                j12 = bodyLarge.j();
                if (z21) {
                    j12 = jG;
                }
                if (pVar3 != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z21;
                j13 = j11;
                l1 l1VarG112 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                p2.l lVar11115 = p2.l.f100860c;
                p013kotlin.jvm.internal.l lVar11116 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE1111114 = r1.e(lVar11116);
                p2.d dVar1111111111111112 = (p2.d) l1VarG112.i();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = p.f100853b;
                i46 = iArr[dVar1111111111111112.ordinal()];
                f11 = 1.0f;
                if (i46 == 1) {
                    f12 = 1.0f;
                } else if (i46 != 2) {
                    if (i46 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf1111114 = Float.valueOf(f12);
                p2.d dVar1111111111111113 = (p2.d) l1VarG112.p();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i47 = iArr[dVar1111111111111113.ordinal()];
                if (i47 == 1) {
                    f13 = 1.0f;
                } else if (i47 != 2) {
                    if (i47 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3 y3VarD116 = m1.d(l1VarG112, fValueOf1111114, Float.valueOf(f13), lVar11115.invoke(l1VarG112.n(), lVarV, 0), p1VarE1111114, "LabelProgress", lVarV, 196608);
                p2.n nVar112 = p2.n.f100862c;
                p019p1.p1<Float, p019p1.m> p1VarE1111115 = r1.e(lVar11116);
                p2.d dVar1111111111111114 = (p2.d) l1VarG112.i();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i48 = iArr[dVar1111111111111114.ordinal()];
                if (i48 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i48 != 2) {
                        if (i48 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z22) {
                        f14 = 1.0f;
                    }
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf1111115 = Float.valueOf(f14);
                p2.d dVar1111111111111115 = (p2.d) r4.p();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i49 = iArr[dVar1111111111111115.ordinal()];
                if (i49 == 1) {
                    f15 = 1.0f;
                } else {
                    if (i49 != 2) {
                        if (i49 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 == 0) {
                        f15 = 1.0f;
                    }
                    f15 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD = m1.d(l1VarG112, fValueOf1111115, Float.valueOf(f15), nVar112.invoke(r4.n(), lVarV, 0), p1VarE1111115, "PlaceholderOpacity", lVarV, 196608);
                p2.o oVar112 = p2.o.f100863c;
                p019p1.p1<Float, p019p1.m> p1VarE1111116 = r1.e(lVar11116);
                p2.d dVar1111111111111116 = (p2.d) l1VarG112.i();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i51 = iArr[dVar1111111111111116.ordinal()];
                if (i51 == 1) {
                    f16 = 1.0f;
                } else {
                    if (i51 != 2) {
                        if (i51 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f16 = BitmapDescriptorFactory.HUE_RED;
                    }
                    f16 = 1.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf1111116 = Float.valueOf(f16);
                p2.d dVar1111111111111117 = (p2.d) l1VarG112.p();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i52 = iArr[dVar1111111111111117.ordinal()];
                if (i52 != 1) {
                    if (i52 != 2) {
                        if (i52 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = m1.d(l1VarG112, fValueOf1111116, Float.valueOf(f11), oVar112.invoke(l1VarG112.n(), lVarV, 0), p1VarE1111116, "PrefixSuffixOpacity", lVarV, 196608);
                p2.m mVar112 = p2.m.f100861c;
                dVar2 = (p2.d) l1VarG112.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar2.ordinal()] == 1) {
                    j14 = j13;
                } else {
                    j14 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                cVarU = k3.p1.u(j14);
                zN = lVarV.n(cVarU);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                } else {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                }
                p019p1.p1 p1Var11114 = (p019p1.p1) objI2;
                dVar3 = (p2.d) l1VarG112.i();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar3.ordinal()] == 1) {
                    j15 = j13;
                } else {
                    j15 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                k3.p1 p1VarL11113 = k3.p1.l(j15);
                dVar4 = (p2.d) l1VarG112.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar4.ordinal()] == 1) {
                    j12 = j13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD3 = m1.d(l1VarG112, p1VarL11113, k3.p1.l(j12), mVar112.invoke(l1VarG112.n(), lVarV, 0), p1Var11114, "LabelTextStyleColor", lVarV, 196608);
                lVar2 = lVarV;
                p2.k kVar112 = p2.k.f100859c;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                cVarU2 = k3.p1.u(jG);
                zN2 = lVar2.n(cVarU2);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                } else {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                }
                p019p1.p1 p1Var11115 = (p019p1.p1) objI3;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                k3.p1 p1VarL11114 = k3.p1.l(jG);
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                y3VarD4 = m1.d(l1VarG112, p1VarL11114, k3.p1.l(jG), kVar112.invoke(r8.n(), lVar2, 0), p1Var11115, "LabelContentColor", lVar2, 196608);
                fFloatValue = ((Number) y3VarD116.getValue()).floatValue();
                lVar2.o(-156998101);
                if (pVar3 == null) {
                    f17 = fFloatValue;
                    textStyle = bodyLarge;
                    textStyle2 = bodySmall;
                    aVarE = null;
                } else {
                    textStyle = bodyLarge;
                    d dVar1111111111111118 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                    textStyle2 = bodySmall;
                    f17 = fFloatValue;
                    aVarE = z2.c.e(-1236585568, true, dVar1111111111111118, lVar2, 54);
                }
                lVar2.l();
                long jI112 = n0Var.i(z15, z16, zBooleanValue);
                objI4 = lVar2.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI4 == companion2.a()) {
                    objI4 = n3.d(n3.q(), new k(y3VarD));
                    lVar2.B(objI4);
                }
                y3 y3Var11114 = (y3) objI4;
                lVar2.o(-156965270);
                if (pVar16 == null) {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                } else {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                }
                lVar2.l();
                long j111119 = n0Var.j(z15, z16, zBooleanValue);
                objI5 = lVar2.I();
                TextStyle textStyle116 = textStyle3;
                if (objI5 == companion2.a()) {
                    objI5 = n3.d(n3.q(), new l(y3VarD2));
                    lVar2.B(objI5);
                }
                y3 y3Var11115 = (y3) objI5;
                lVar2.o(-156940524);
                if (pVar14 == null) {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                } else {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                }
                lVar2.l();
                long jK112 = n0Var.k(z15, z16, zBooleanValue);
                lVar2.o(-156921964);
                if (pVar15 == null) {
                    pVar21 = pVar15;
                    aVarE4 = null;
                } else {
                    pVar21 = pVar15;
                    aVarE4 = null;
                }
                lVar2.l();
                jH = n0Var.h(z15, z16, zBooleanValue);
                lVar2.o(-156902962);
                if (pVar12 == null) {
                    aVarE5 = null;
                } else {
                    aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                }
                lVar2.l();
                jO = n0Var.o(z15, z16, zBooleanValue);
                lVar2.o(-156893937);
                if (pVar18 == null) {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = null;
                } else {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                }
                lVar2.l();
                jL = n0Var.l(z15, z16, zBooleanValue);
                lVar2.o(-156884470);
                if (pVar17 == null) {
                    aVarE7 = null;
                } else {
                    aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                }
                lVar2.l();
                i54 = p.f100852a[pVar.ordinal()];
                if (i54 == z24) {
                    z25 = z14;
                    lVar2.o(-568105095);
                    p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                    lVar2.l();
                    h0 h0Var1111114 = h0.f84049a;
                } else if (i54 != 2) {
                    lVar2.o(-565271199);
                    lVar2.l();
                    h0 h0Var1111115 = h0.f84049a;
                    z25 = z14;
                } else {
                    lVar2.o(-567018607);
                    objI6 = lVar2.I();
                    if (objI6 == companion2.a()) {
                        objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                        lVar2.B(objI6);
                    }
                    p1Var = (p1) objI6;
                    z2.a aVarE119 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                    androidx.compose.ui.d.Companion companion114 = androidx.compose.ui.d.INSTANCE;
                    zQ = lVar2.q(f17);
                    objI7 = lVar2.I();
                    if (zQ) {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    } else {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    }
                    z25 = z14;
                    w.b(companion114, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE119, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                    lVar2.l();
                    h0 h0Var1111116 = h0.f84049a;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar22 = pVar20;
                pVar23 = pVar17;
                z26 = z15;
                pVar24 = pVar12;
                z27 = z16;
                z28 = z25;
                pVar25 = pVar18;
                pVar26 = pVar19;
                pVar27 = pVar21;
            } else {
                if (i19 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i22 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i27 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i29 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                pVar16 = pVar11;
                if (i32 != 0) {
                    pVar17 = null;
                } else {
                    pVar17 = pVar9;
                }
                if (i35 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i41 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i55 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i45 = i43;
                if ((i55 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI = lVarV.I();
                if (z19) {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                } else {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                }
                text = ((TransformedText) objI).getText().getText();
                zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                if (zBooleanValue) {
                    dVar = p2.d.Focused;
                } else if (text.length() == 0) {
                    dVar = p2.d.UnfocusedEmpty;
                } else {
                    dVar = p2.d.UnfocusedNotEmpty;
                }
                jG = n0Var.g(z15, z16, zBooleanValue);
                Typography typographyC113 = t.f96158a.c(lVarV, 6);
                bodyLarge = typographyC113.getBodyLarge();
                bodySmall = typographyC113.getBodySmall();
                pVar18 = pVar13;
                long j1111110 = bodyLarge.j();
                companion = k3.p1.INSTANCE;
                if (k3.p1.r(j1111110, companion.j())) {
                }
                j11 = bodySmall.j();
                if (z21) {
                    j11 = jG;
                }
                j12 = bodyLarge.j();
                if (z21) {
                    j12 = jG;
                }
                if (pVar3 != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z21;
                j13 = j11;
                l1 l1VarG113 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                p2.l lVar11117 = p2.l.f100860c;
                p013kotlin.jvm.internal.l lVar11118 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE1111117 = r1.e(lVar11118);
                p2.d dVar1111111111111119 = (p2.d) l1VarG113.i();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = p.f100853b;
                i46 = iArr[dVar1111111111111119.ordinal()];
                f11 = 1.0f;
                if (i46 == 1) {
                    f12 = 1.0f;
                } else if (i46 != 2) {
                    if (i46 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf1111117 = Float.valueOf(f12);
                p2.d dVar11111111111111110 = (p2.d) l1VarG113.p();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i47 = iArr[dVar11111111111111110.ordinal()];
                if (i47 == 1) {
                    f13 = 1.0f;
                } else if (i47 != 2) {
                    if (i47 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3 y3VarD117 = m1.d(l1VarG113, fValueOf1111117, Float.valueOf(f13), lVar11117.invoke(l1VarG113.n(), lVarV, 0), p1VarE1111117, "LabelProgress", lVarV, 196608);
                p2.n nVar113 = p2.n.f100862c;
                p019p1.p1<Float, p019p1.m> p1VarE1111118 = r1.e(lVar11118);
                p2.d dVar11111111111111111 = (p2.d) l1VarG113.i();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i48 = iArr[dVar11111111111111111.ordinal()];
                if (i48 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i48 != 2) {
                        if (i48 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z22) {
                        f14 = 1.0f;
                    }
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf1111118 = Float.valueOf(f14);
                p2.d dVar11111111111111112 = (p2.d) r4.p();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i49 = iArr[dVar11111111111111112.ordinal()];
                if (i49 == 1) {
                    f15 = 1.0f;
                } else {
                    if (i49 != 2) {
                        if (i49 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 == 0) {
                        f15 = 1.0f;
                    }
                    f15 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD = m1.d(l1VarG113, fValueOf1111118, Float.valueOf(f15), nVar113.invoke(r4.n(), lVarV, 0), p1VarE1111118, "PlaceholderOpacity", lVarV, 196608);
                p2.o oVar113 = p2.o.f100863c;
                p019p1.p1<Float, p019p1.m> p1VarE1111119 = r1.e(lVar11118);
                p2.d dVar11111111111111113 = (p2.d) l1VarG113.i();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i51 = iArr[dVar11111111111111113.ordinal()];
                if (i51 == 1) {
                    f16 = 1.0f;
                } else {
                    if (i51 != 2) {
                        if (i51 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f16 = BitmapDescriptorFactory.HUE_RED;
                    }
                    f16 = 1.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf1111119 = Float.valueOf(f16);
                p2.d dVar11111111111111114 = (p2.d) l1VarG113.p();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i52 = iArr[dVar11111111111111114.ordinal()];
                if (i52 != 1) {
                    if (i52 != 2) {
                        if (i52 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = m1.d(l1VarG113, fValueOf1111119, Float.valueOf(f11), oVar113.invoke(l1VarG113.n(), lVarV, 0), p1VarE1111119, "PrefixSuffixOpacity", lVarV, 196608);
                p2.m mVar113 = p2.m.f100861c;
                dVar2 = (p2.d) l1VarG113.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar2.ordinal()] == 1) {
                    j14 = j13;
                } else {
                    j14 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                cVarU = k3.p1.u(j14);
                zN = lVarV.n(cVarU);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                } else {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                }
                p019p1.p1 p1Var11116 = (p019p1.p1) objI2;
                dVar3 = (p2.d) l1VarG113.i();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar3.ordinal()] == 1) {
                    j15 = j13;
                } else {
                    j15 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                k3.p1 p1VarL11115 = k3.p1.l(j15);
                dVar4 = (p2.d) l1VarG113.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar4.ordinal()] == 1) {
                    j12 = j13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD3 = m1.d(l1VarG113, p1VarL11115, k3.p1.l(j12), mVar113.invoke(l1VarG113.n(), lVarV, 0), p1Var11116, "LabelTextStyleColor", lVarV, 196608);
                lVar2 = lVarV;
                p2.k kVar113 = p2.k.f100859c;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                cVarU2 = k3.p1.u(jG);
                zN2 = lVar2.n(cVarU2);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                } else {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                }
                p019p1.p1 p1Var11117 = (p019p1.p1) objI3;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                k3.p1 p1VarL11116 = k3.p1.l(jG);
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                y3VarD4 = m1.d(l1VarG113, p1VarL11116, k3.p1.l(jG), kVar113.invoke(r8.n(), lVar2, 0), p1Var11117, "LabelContentColor", lVar2, 196608);
                fFloatValue = ((Number) y3VarD117.getValue()).floatValue();
                lVar2.o(-156998101);
                if (pVar3 == null) {
                    f17 = fFloatValue;
                    textStyle = bodyLarge;
                    textStyle2 = bodySmall;
                    aVarE = null;
                } else {
                    textStyle = bodyLarge;
                    d dVar11111111111111115 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                    textStyle2 = bodySmall;
                    f17 = fFloatValue;
                    aVarE = z2.c.e(-1236585568, true, dVar11111111111111115, lVar2, 54);
                }
                lVar2.l();
                long jI113 = n0Var.i(z15, z16, zBooleanValue);
                objI4 = lVar2.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI4 == companion2.a()) {
                    objI4 = n3.d(n3.q(), new k(y3VarD));
                    lVar2.B(objI4);
                }
                y3 y3Var11116 = (y3) objI4;
                lVar2.o(-156965270);
                if (pVar16 == null) {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                } else {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                }
                lVar2.l();
                long j1111111 = n0Var.j(z15, z16, zBooleanValue);
                objI5 = lVar2.I();
                TextStyle textStyle117 = textStyle3;
                if (objI5 == companion2.a()) {
                    objI5 = n3.d(n3.q(), new l(y3VarD2));
                    lVar2.B(objI5);
                }
                y3 y3Var11117 = (y3) objI5;
                lVar2.o(-156940524);
                if (pVar14 == null) {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                } else {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                }
                lVar2.l();
                long jK113 = n0Var.k(z15, z16, zBooleanValue);
                lVar2.o(-156921964);
                if (pVar15 == null) {
                    pVar21 = pVar15;
                    aVarE4 = null;
                } else {
                    pVar21 = pVar15;
                    aVarE4 = null;
                }
                lVar2.l();
                jH = n0Var.h(z15, z16, zBooleanValue);
                lVar2.o(-156902962);
                if (pVar12 == null) {
                    aVarE5 = null;
                } else {
                    aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                }
                lVar2.l();
                jO = n0Var.o(z15, z16, zBooleanValue);
                lVar2.o(-156893937);
                if (pVar18 == null) {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = null;
                } else {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                }
                lVar2.l();
                jL = n0Var.l(z15, z16, zBooleanValue);
                lVar2.o(-156884470);
                if (pVar17 == null) {
                    aVarE7 = null;
                } else {
                    aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                }
                lVar2.l();
                i54 = p.f100852a[pVar.ordinal()];
                if (i54 == z24) {
                    z25 = z14;
                    lVar2.o(-568105095);
                    p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                    lVar2.l();
                    h0 h0Var1111117 = h0.f84049a;
                } else if (i54 != 2) {
                    lVar2.o(-565271199);
                    lVar2.l();
                    h0 h0Var1111118 = h0.f84049a;
                    z25 = z14;
                } else {
                    lVar2.o(-567018607);
                    objI6 = lVar2.I();
                    if (objI6 == companion2.a()) {
                        objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                        lVar2.B(objI6);
                    }
                    p1Var = (p1) objI6;
                    z2.a aVarE1110 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                    androidx.compose.ui.d.Companion companion115 = androidx.compose.ui.d.INSTANCE;
                    zQ = lVar2.q(f17);
                    objI7 = lVar2.I();
                    if (zQ) {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    } else {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    }
                    z25 = z14;
                    w.b(companion115, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1110, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                    lVar2.l();
                    h0 h0Var1111119 = h0.f84049a;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar22 = pVar20;
                pVar23 = pVar17;
                z26 = z15;
                pVar24 = pVar12;
                z27 = z16;
                z28 = z25;
                pVar25 = pVar18;
                pVar26 = pVar19;
                pVar27 = pVar21;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
            }
        }
        i55 |= 12582912;
        i27 = i13 & 256;
        if (i27 != 0) {
            if ((i11 & 100663296) == 0) {
                if (lVarV.K(pVar7)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i55 |= i28;
            }
            i29 = i13 & 512;
            if (i29 != 0) {
                if ((i11 & 805306368) == 0) {
                    if (lVarV.K(pVar8)) {
                        i31 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i31 = 268435456;
                    }
                    i55 |= i31;
                }
                i32 = i13 & 1024;
                if (i32 != 0) {
                    i33 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (lVarV.K(pVar9)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i12 | i34;
                } else {
                    i33 = i12;
                }
                i35 = i13 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i12 & 48) != 0) {
                    i33 |= lVarV.p(z11) ? 32 : 16;
                }
                i36 = i33;
                i37 = i13 & 4096;
                if (i37 != 0) {
                    i39 = i36 | KyberEngine.KyberPolyBytes;
                } else {
                    i38 = i36;
                    if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                        i38 |= lVarV.p(z12) ? 256 : 128;
                    }
                    i39 = i38;
                }
                i41 = i13 & PKIFailureInfo.certRevoked;
                if (i41 != 0) {
                    i43 = i39 | 3072;
                } else {
                    i42 = i39;
                    if ((i12 & 3072) != 0) {
                        i42 |= lVarV.p(z13) ? 2048 : 1024;
                    }
                    i43 = i42;
                }
                if ((i13 & 16384) != 0) {
                    i43 |= 24576;
                } else if ((i12 & 24576) == 0) {
                    if (lVarV.n(jVar)) {
                        i17 = 16384;
                    }
                    i43 |= i17;
                }
                if ((32768 & i13) != 0) {
                    i43 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.n(yVar)) {
                        i44 = 131072;
                    } else {
                        i44 = 65536;
                    }
                    i43 |= i44;
                }
                if ((i13 & 65536) != 0) {
                    i43 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (lVarV.n(n0Var)) {
                        i23 = 1048576;
                    }
                    i43 |= i23;
                }
                if ((i13 & 131072) != 0) {
                    i43 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
                }
                if ((306783379 & i55) != 306783378) {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC114 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC114.getBodyLarge();
                    bodySmall = typographyC114.getBodySmall();
                    pVar18 = pVar13;
                    long j1111112 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j1111112, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG114 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar11119 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar111110 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE11111110 = r1.e(lVar111110);
                    p2.d dVar11111111111111116 = (p2.d) l1VarG114.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar11111111111111116.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf11111110 = Float.valueOf(f12);
                    p2.d dVar11111111111111117 = (p2.d) l1VarG114.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar11111111111111117.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD118 = m1.d(l1VarG114, fValueOf11111110, Float.valueOf(f13), lVar11119.invoke(l1VarG114.n(), lVarV, 0), p1VarE11111110, "LabelProgress", lVarV, 196608);
                    p2.n nVar114 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE11111111 = r1.e(lVar111110);
                    p2.d dVar11111111111111118 = (p2.d) l1VarG114.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar11111111111111118.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf11111111 = Float.valueOf(f14);
                    p2.d dVar11111111111111119 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar11111111111111119.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG114, fValueOf11111111, Float.valueOf(f15), nVar114.invoke(r4.n(), lVarV, 0), p1VarE11111111, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar114 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE11111112 = r1.e(lVar111110);
                    p2.d dVar111111111111111110 = (p2.d) l1VarG114.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar111111111111111110.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf11111112 = Float.valueOf(f16);
                    p2.d dVar111111111111111111 = (p2.d) l1VarG114.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar111111111111111111.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG114, fValueOf11111112, Float.valueOf(f11), oVar114.invoke(l1VarG114.n(), lVarV, 0), p1VarE11111112, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar114 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG114.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var11118 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG114.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL11117 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG114.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG114, p1VarL11117, k3.p1.l(j12), mVar114.invoke(l1VarG114.n(), lVarV, 0), p1Var11118, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar114 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var11119 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL11118 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG114, p1VarL11118, k3.p1.l(jG), kVar114.invoke(r8.n(), lVar2, 0), p1Var11119, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD118.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar111111111111111112 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar111111111111111112, lVar2, 54);
                    }
                    lVar2.l();
                    long jI114 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var11118 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j1111113 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle118 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var11119 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK114 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var11111110 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var11111111 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE1111 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion116 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion116, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1111, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var11111112 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                } else {
                    if (i19 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i22 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i27 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i29 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar8;
                    }
                    pVar16 = pVar11;
                    if (i32 != 0) {
                        pVar17 = null;
                    } else {
                        pVar17 = pVar9;
                    }
                    if (i35 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i41 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                    }
                    if ((i55 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i45 = i43;
                    if ((i55 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI = lVarV.I();
                    if (z19) {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    } else {
                        objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                        lVarV.B(objI);
                    }
                    text = ((TransformedText) objI).getText().getText();
                    zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                    if (zBooleanValue) {
                        dVar = p2.d.Focused;
                    } else if (text.length() == 0) {
                        dVar = p2.d.UnfocusedEmpty;
                    } else {
                        dVar = p2.d.UnfocusedNotEmpty;
                    }
                    jG = n0Var.g(z15, z16, zBooleanValue);
                    Typography typographyC115 = t.f96158a.c(lVarV, 6);
                    bodyLarge = typographyC115.getBodyLarge();
                    bodySmall = typographyC115.getBodySmall();
                    pVar18 = pVar13;
                    long j1111114 = bodyLarge.j();
                    companion = k3.p1.INSTANCE;
                    if (k3.p1.r(j1111114, companion.j())) {
                    }
                    j11 = bodySmall.j();
                    if (z21) {
                        j11 = jG;
                    }
                    j12 = bodyLarge.j();
                    if (z21) {
                        j12 = jG;
                    }
                    if (pVar3 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z21;
                    j13 = j11;
                    l1 l1VarG115 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                    p2.l lVar111111 = p2.l.f100860c;
                    p013kotlin.jvm.internal.l lVar111112 = p013kotlin.jvm.internal.l.f86526a;
                    p019p1.p1<Float, p019p1.m> p1VarE11111113 = r1.e(lVar111112);
                    p2.d dVar111111111111111113 = (p2.d) l1VarG115.i();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    iArr = p.f100853b;
                    i46 = iArr[dVar111111111111111113.ordinal()];
                    f11 = 1.0f;
                    if (i46 == 1) {
                        f12 = 1.0f;
                    } else if (i46 != 2) {
                        if (i46 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf11111113 = Float.valueOf(f12);
                    p2.d dVar111111111111111114 = (p2.d) l1VarG115.p();
                    lVarV.o(-2036730335);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    i47 = iArr[dVar111111111111111114.ordinal()];
                    if (i47 == 1) {
                        f13 = 1.0f;
                    } else if (i47 != 2) {
                        if (i47 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3 y3VarD119 = m1.d(l1VarG115, fValueOf11111113, Float.valueOf(f13), lVar111111.invoke(l1VarG115.n(), lVarV, 0), p1VarE11111113, "LabelProgress", lVarV, 196608);
                    p2.n nVar115 = p2.n.f100862c;
                    p019p1.p1<Float, p019p1.m> p1VarE11111114 = r1.e(lVar111112);
                    p2.d dVar111111111111111115 = (p2.d) l1VarG115.i();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i48 = iArr[dVar111111111111111115.ordinal()];
                    if (i48 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i48 != 2) {
                            if (i48 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z22) {
                            f14 = 1.0f;
                        }
                        f14 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf11111114 = Float.valueOf(f14);
                    p2.d dVar111111111111111116 = (p2.d) r4.p();
                    lVarV.o(1435837472);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                    }
                    i49 = iArr[dVar111111111111111116.ordinal()];
                    if (i49 == 1) {
                        f15 = 1.0f;
                    } else {
                        if (i49 != 2) {
                            if (i49 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 == 0) {
                            f15 = 1.0f;
                        }
                        f15 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD = m1.d(l1VarG115, fValueOf11111114, Float.valueOf(f15), nVar115.invoke(r4.n(), lVarV, 0), p1VarE11111114, "PlaceholderOpacity", lVarV, 196608);
                    p2.o oVar115 = p2.o.f100863c;
                    p019p1.p1<Float, p019p1.m> p1VarE11111115 = r1.e(lVar111112);
                    p2.d dVar111111111111111117 = (p2.d) l1VarG115.i();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i51 = iArr[dVar111111111111111117.ordinal()];
                    if (i51 == 1) {
                        f16 = 1.0f;
                    } else {
                        if (i51 != 2) {
                            if (i51 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f16 = BitmapDescriptorFactory.HUE_RED;
                        }
                        f16 = 1.0f;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    Float fValueOf11111115 = Float.valueOf(f16);
                    p2.d dVar111111111111111118 = (p2.d) l1VarG115.p();
                    lVarV.o(1128033978);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                    }
                    i52 = iArr[dVar111111111111111118.ordinal()];
                    if (i52 != 1) {
                        if (i52 != 2) {
                            if (i52 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z22 != 0) {
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD2 = m1.d(l1VarG115, fValueOf11111115, Float.valueOf(f11), oVar115.invoke(l1VarG115.n(), lVarV, 0), p1VarE11111115, "PrefixSuffixOpacity", lVarV, 196608);
                    p2.m mVar115 = p2.m.f100861c;
                    dVar2 = (p2.d) l1VarG115.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar2.ordinal()] == 1) {
                        j14 = j13;
                    } else {
                        j14 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    cVarU = k3.p1.u(j14);
                    zN = lVarV.n(cVarU);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    } else {
                        objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                        lVarV.B(objI2);
                    }
                    p019p1.p1 p1Var111110 = (p019p1.p1) objI2;
                    dVar3 = (p2.d) l1VarG115.i();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar3.ordinal()] == 1) {
                        j15 = j13;
                    } else {
                        j15 = j12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    k3.p1 p1VarL11119 = k3.p1.l(j15);
                    dVar4 = (p2.d) l1VarG115.p();
                    lVarV.o(-107432127);
                    if (p020r2.o.J()) {
                        p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                    }
                    if (iArr[dVar4.ordinal()] == 1) {
                        j12 = j13;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVarV.l();
                    y3VarD3 = m1.d(l1VarG115, p1VarL11119, k3.p1.l(j12), mVar115.invoke(l1VarG115.n(), lVarV, 0), p1Var111110, "LabelTextStyleColor", lVarV, 196608);
                    lVar2 = lVarV;
                    p2.k kVar115 = p2.k.f100859c;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    cVarU2 = k3.p1.u(jG);
                    zN2 = lVar2.n(cVarU2);
                    objI3 = lVar2.I();
                    if (zN2) {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    } else {
                        objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                        lVar2.B(objI3);
                    }
                    p019p1.p1 p1Var111111 = (p019p1.p1) objI3;
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    k3.p1 p1VarL111110 = k3.p1.l(jG);
                    lVar2.o(1023351670);
                    if (p020r2.o.J()) {
                        p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    lVar2.l();
                    y3VarD4 = m1.d(l1VarG115, p1VarL111110, k3.p1.l(jG), kVar115.invoke(r8.n(), lVar2, 0), p1Var111111, "LabelContentColor", lVar2, 196608);
                    fFloatValue = ((Number) y3VarD119.getValue()).floatValue();
                    lVar2.o(-156998101);
                    if (pVar3 == null) {
                        f17 = fFloatValue;
                        textStyle = bodyLarge;
                        textStyle2 = bodySmall;
                        aVarE = null;
                    } else {
                        textStyle = bodyLarge;
                        d dVar111111111111111119 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                        textStyle2 = bodySmall;
                        f17 = fFloatValue;
                        aVarE = z2.c.e(-1236585568, true, dVar111111111111111119, lVar2, 54);
                    }
                    lVar2.l();
                    long jI115 = n0Var.i(z15, z16, zBooleanValue);
                    objI4 = lVar2.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI4 == companion2.a()) {
                        objI4 = n3.d(n3.q(), new k(y3VarD));
                        lVar2.B(objI4);
                    }
                    y3 y3Var111110 = (y3) objI4;
                    lVar2.o(-156965270);
                    if (pVar16 == null) {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    } else {
                        textStyle3 = textStyle;
                        pVar19 = pVar16;
                        aVarE2 = null;
                    }
                    lVar2.l();
                    long j1111115 = n0Var.j(z15, z16, zBooleanValue);
                    objI5 = lVar2.I();
                    TextStyle textStyle119 = textStyle3;
                    if (objI5 == companion2.a()) {
                        objI5 = n3.d(n3.q(), new l(y3VarD2));
                        lVar2.B(objI5);
                    }
                    y3 y3Var111111 = (y3) objI5;
                    lVar2.o(-156940524);
                    if (pVar14 == null) {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    } else {
                        y3Var = y3VarD2;
                        pVar20 = pVar14;
                        aVarE3 = null;
                    }
                    lVar2.l();
                    long jK115 = n0Var.k(z15, z16, zBooleanValue);
                    lVar2.o(-156921964);
                    if (pVar15 == null) {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    } else {
                        pVar21 = pVar15;
                        aVarE4 = null;
                    }
                    lVar2.l();
                    jH = n0Var.h(z15, z16, zBooleanValue);
                    lVar2.o(-156902962);
                    if (pVar12 == null) {
                        aVarE5 = null;
                    } else {
                        aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                    }
                    lVar2.l();
                    jO = n0Var.o(z15, z16, zBooleanValue);
                    lVar2.o(-156893937);
                    if (pVar18 == null) {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = null;
                    } else {
                        z24 = true;
                        i53 = 54;
                        aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                    }
                    lVar2.l();
                    jL = n0Var.l(z15, z16, zBooleanValue);
                    lVar2.o(-156884470);
                    if (pVar17 == null) {
                        aVarE7 = null;
                    } else {
                        aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                    }
                    lVar2.l();
                    i54 = p.f100852a[pVar.ordinal()];
                    if (i54 == z24) {
                        z25 = z14;
                        lVar2.o(-568105095);
                        p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                        lVar2.l();
                        h0 h0Var11111113 = h0.f84049a;
                    } else if (i54 != 2) {
                        lVar2.o(-565271199);
                        lVar2.l();
                        h0 h0Var11111114 = h0.f84049a;
                        z25 = z14;
                    } else {
                        lVar2.o(-567018607);
                        objI6 = lVar2.I();
                        if (objI6 == companion2.a()) {
                            objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                            lVar2.B(objI6);
                        }
                        p1Var = (p1) objI6;
                        z2.a aVarE1112 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                        androidx.compose.ui.d.Companion companion117 = androidx.compose.ui.d.INSTANCE;
                        zQ = lVar2.q(f17);
                        objI7 = lVar2.I();
                        if (zQ) {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        } else {
                            objI7 = new a(f17, p1Var);
                            lVar2.B(objI7);
                        }
                        z25 = z14;
                        w.b(companion117, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1112, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                        lVar2.l();
                        h0 h0Var11111115 = h0.f84049a;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar22 = pVar20;
                    pVar23 = pVar17;
                    z26 = z15;
                    pVar24 = pVar12;
                    z27 = z16;
                    z28 = z25;
                    pVar25 = pVar18;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
                }
            }
            i55 |= 805306368;
            i32 = i13 & 1024;
            if (i32 != 0) {
                i33 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (lVarV.K(pVar9)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i12 | i34;
            } else {
                i33 = i12;
            }
            i35 = i13 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i12 & 48) != 0) {
                i33 |= lVarV.p(z11) ? 32 : 16;
            }
            i36 = i33;
            i37 = i13 & 4096;
            if (i37 != 0) {
                i39 = i36 | KyberEngine.KyberPolyBytes;
            } else {
                i38 = i36;
                if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                    i38 |= lVarV.p(z12) ? 256 : 128;
                }
                i39 = i38;
            }
            i41 = i13 & PKIFailureInfo.certRevoked;
            if (i41 != 0) {
                i43 = i39 | 3072;
            } else {
                i42 = i39;
                if ((i12 & 3072) != 0) {
                    i42 |= lVarV.p(z13) ? 2048 : 1024;
                }
                i43 = i42;
            }
            if ((i13 & 16384) != 0) {
                i43 |= 24576;
            } else if ((i12 & 24576) == 0) {
                if (lVarV.n(jVar)) {
                    i17 = 16384;
                }
                i43 |= i17;
            }
            if ((32768 & i13) != 0) {
                i43 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (lVarV.n(yVar)) {
                    i44 = 131072;
                } else {
                    i44 = 65536;
                }
                i43 |= i44;
            }
            if ((i13 & 65536) != 0) {
                i43 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (lVarV.n(n0Var)) {
                    i23 = 1048576;
                }
                i43 |= i23;
            }
            if ((i13 & 131072) != 0) {
                i43 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
            }
            if ((306783379 & i55) != 306783378) {
                if (i19 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i22 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i27 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i29 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                pVar16 = pVar11;
                if (i32 != 0) {
                    pVar17 = null;
                } else {
                    pVar17 = pVar9;
                }
                if (i35 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i41 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i55 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i45 = i43;
                if ((i55 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI = lVarV.I();
                if (z19) {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                } else {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                }
                text = ((TransformedText) objI).getText().getText();
                zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                if (zBooleanValue) {
                    dVar = p2.d.Focused;
                } else if (text.length() == 0) {
                    dVar = p2.d.UnfocusedEmpty;
                } else {
                    dVar = p2.d.UnfocusedNotEmpty;
                }
                jG = n0Var.g(z15, z16, zBooleanValue);
                Typography typographyC116 = t.f96158a.c(lVarV, 6);
                bodyLarge = typographyC116.getBodyLarge();
                bodySmall = typographyC116.getBodySmall();
                pVar18 = pVar13;
                long j1111116 = bodyLarge.j();
                companion = k3.p1.INSTANCE;
                if (k3.p1.r(j1111116, companion.j())) {
                }
                j11 = bodySmall.j();
                if (z21) {
                    j11 = jG;
                }
                j12 = bodyLarge.j();
                if (z21) {
                    j12 = jG;
                }
                if (pVar3 != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z21;
                j13 = j11;
                l1 l1VarG116 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                p2.l lVar111113 = p2.l.f100860c;
                p013kotlin.jvm.internal.l lVar111114 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE11111116 = r1.e(lVar111114);
                p2.d dVar1111111111111111110 = (p2.d) l1VarG116.i();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = p.f100853b;
                i46 = iArr[dVar1111111111111111110.ordinal()];
                f11 = 1.0f;
                if (i46 == 1) {
                    f12 = 1.0f;
                } else if (i46 != 2) {
                    if (i46 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11111116 = Float.valueOf(f12);
                p2.d dVar1111111111111111111 = (p2.d) l1VarG116.p();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i47 = iArr[dVar1111111111111111111.ordinal()];
                if (i47 == 1) {
                    f13 = 1.0f;
                } else if (i47 != 2) {
                    if (i47 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3 y3VarD1110 = m1.d(l1VarG116, fValueOf11111116, Float.valueOf(f13), lVar111113.invoke(l1VarG116.n(), lVarV, 0), p1VarE11111116, "LabelProgress", lVarV, 196608);
                p2.n nVar116 = p2.n.f100862c;
                p019p1.p1<Float, p019p1.m> p1VarE11111117 = r1.e(lVar111114);
                p2.d dVar1111111111111111112 = (p2.d) l1VarG116.i();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i48 = iArr[dVar1111111111111111112.ordinal()];
                if (i48 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i48 != 2) {
                        if (i48 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z22) {
                        f14 = 1.0f;
                    }
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11111117 = Float.valueOf(f14);
                p2.d dVar1111111111111111113 = (p2.d) r4.p();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i49 = iArr[dVar1111111111111111113.ordinal()];
                if (i49 == 1) {
                    f15 = 1.0f;
                } else {
                    if (i49 != 2) {
                        if (i49 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 == 0) {
                        f15 = 1.0f;
                    }
                    f15 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD = m1.d(l1VarG116, fValueOf11111117, Float.valueOf(f15), nVar116.invoke(r4.n(), lVarV, 0), p1VarE11111117, "PlaceholderOpacity", lVarV, 196608);
                p2.o oVar116 = p2.o.f100863c;
                p019p1.p1<Float, p019p1.m> p1VarE11111118 = r1.e(lVar111114);
                p2.d dVar1111111111111111114 = (p2.d) l1VarG116.i();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i51 = iArr[dVar1111111111111111114.ordinal()];
                if (i51 == 1) {
                    f16 = 1.0f;
                } else {
                    if (i51 != 2) {
                        if (i51 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f16 = BitmapDescriptorFactory.HUE_RED;
                    }
                    f16 = 1.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11111118 = Float.valueOf(f16);
                p2.d dVar1111111111111111115 = (p2.d) l1VarG116.p();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i52 = iArr[dVar1111111111111111115.ordinal()];
                if (i52 != 1) {
                    if (i52 != 2) {
                        if (i52 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = m1.d(l1VarG116, fValueOf11111118, Float.valueOf(f11), oVar116.invoke(l1VarG116.n(), lVarV, 0), p1VarE11111118, "PrefixSuffixOpacity", lVarV, 196608);
                p2.m mVar116 = p2.m.f100861c;
                dVar2 = (p2.d) l1VarG116.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar2.ordinal()] == 1) {
                    j14 = j13;
                } else {
                    j14 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                cVarU = k3.p1.u(j14);
                zN = lVarV.n(cVarU);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                } else {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                }
                p019p1.p1 p1Var111112 = (p019p1.p1) objI2;
                dVar3 = (p2.d) l1VarG116.i();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar3.ordinal()] == 1) {
                    j15 = j13;
                } else {
                    j15 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                k3.p1 p1VarL111111 = k3.p1.l(j15);
                dVar4 = (p2.d) l1VarG116.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar4.ordinal()] == 1) {
                    j12 = j13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD3 = m1.d(l1VarG116, p1VarL111111, k3.p1.l(j12), mVar116.invoke(l1VarG116.n(), lVarV, 0), p1Var111112, "LabelTextStyleColor", lVarV, 196608);
                lVar2 = lVarV;
                p2.k kVar116 = p2.k.f100859c;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                cVarU2 = k3.p1.u(jG);
                zN2 = lVar2.n(cVarU2);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                } else {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                }
                p019p1.p1 p1Var111113 = (p019p1.p1) objI3;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                k3.p1 p1VarL111112 = k3.p1.l(jG);
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                y3VarD4 = m1.d(l1VarG116, p1VarL111112, k3.p1.l(jG), kVar116.invoke(r8.n(), lVar2, 0), p1Var111113, "LabelContentColor", lVar2, 196608);
                fFloatValue = ((Number) y3VarD1110.getValue()).floatValue();
                lVar2.o(-156998101);
                if (pVar3 == null) {
                    f17 = fFloatValue;
                    textStyle = bodyLarge;
                    textStyle2 = bodySmall;
                    aVarE = null;
                } else {
                    textStyle = bodyLarge;
                    d dVar1111111111111111116 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                    textStyle2 = bodySmall;
                    f17 = fFloatValue;
                    aVarE = z2.c.e(-1236585568, true, dVar1111111111111111116, lVar2, 54);
                }
                lVar2.l();
                long jI116 = n0Var.i(z15, z16, zBooleanValue);
                objI4 = lVar2.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI4 == companion2.a()) {
                    objI4 = n3.d(n3.q(), new k(y3VarD));
                    lVar2.B(objI4);
                }
                y3 y3Var111112 = (y3) objI4;
                lVar2.o(-156965270);
                if (pVar16 == null) {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                } else {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                }
                lVar2.l();
                long j1111117 = n0Var.j(z15, z16, zBooleanValue);
                objI5 = lVar2.I();
                TextStyle textStyle1110 = textStyle3;
                if (objI5 == companion2.a()) {
                    objI5 = n3.d(n3.q(), new l(y3VarD2));
                    lVar2.B(objI5);
                }
                y3 y3Var111113 = (y3) objI5;
                lVar2.o(-156940524);
                if (pVar14 == null) {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                } else {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                }
                lVar2.l();
                long jK116 = n0Var.k(z15, z16, zBooleanValue);
                lVar2.o(-156921964);
                if (pVar15 == null) {
                    pVar21 = pVar15;
                    aVarE4 = null;
                } else {
                    pVar21 = pVar15;
                    aVarE4 = null;
                }
                lVar2.l();
                jH = n0Var.h(z15, z16, zBooleanValue);
                lVar2.o(-156902962);
                if (pVar12 == null) {
                    aVarE5 = null;
                } else {
                    aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                }
                lVar2.l();
                jO = n0Var.o(z15, z16, zBooleanValue);
                lVar2.o(-156893937);
                if (pVar18 == null) {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = null;
                } else {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                }
                lVar2.l();
                jL = n0Var.l(z15, z16, zBooleanValue);
                lVar2.o(-156884470);
                if (pVar17 == null) {
                    aVarE7 = null;
                } else {
                    aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                }
                lVar2.l();
                i54 = p.f100852a[pVar.ordinal()];
                if (i54 == z24) {
                    z25 = z14;
                    lVar2.o(-568105095);
                    p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                    lVar2.l();
                    h0 h0Var11111116 = h0.f84049a;
                } else if (i54 != 2) {
                    lVar2.o(-565271199);
                    lVar2.l();
                    h0 h0Var11111117 = h0.f84049a;
                    z25 = z14;
                } else {
                    lVar2.o(-567018607);
                    objI6 = lVar2.I();
                    if (objI6 == companion2.a()) {
                        objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                        lVar2.B(objI6);
                    }
                    p1Var = (p1) objI6;
                    z2.a aVarE1113 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                    androidx.compose.ui.d.Companion companion118 = androidx.compose.ui.d.INSTANCE;
                    zQ = lVar2.q(f17);
                    objI7 = lVar2.I();
                    if (zQ) {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    } else {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    }
                    z25 = z14;
                    w.b(companion118, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1113, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                    lVar2.l();
                    h0 h0Var11111118 = h0.f84049a;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar22 = pVar20;
                pVar23 = pVar17;
                z26 = z15;
                pVar24 = pVar12;
                z27 = z16;
                z28 = z25;
                pVar25 = pVar18;
                pVar26 = pVar19;
                pVar27 = pVar21;
            } else {
                if (i19 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i22 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i27 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i29 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                pVar16 = pVar11;
                if (i32 != 0) {
                    pVar17 = null;
                } else {
                    pVar17 = pVar9;
                }
                if (i35 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i41 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i55 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i45 = i43;
                if ((i55 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI = lVarV.I();
                if (z19) {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                } else {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                }
                text = ((TransformedText) objI).getText().getText();
                zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                if (zBooleanValue) {
                    dVar = p2.d.Focused;
                } else if (text.length() == 0) {
                    dVar = p2.d.UnfocusedEmpty;
                } else {
                    dVar = p2.d.UnfocusedNotEmpty;
                }
                jG = n0Var.g(z15, z16, zBooleanValue);
                Typography typographyC117 = t.f96158a.c(lVarV, 6);
                bodyLarge = typographyC117.getBodyLarge();
                bodySmall = typographyC117.getBodySmall();
                pVar18 = pVar13;
                long j1111118 = bodyLarge.j();
                companion = k3.p1.INSTANCE;
                if (k3.p1.r(j1111118, companion.j())) {
                }
                j11 = bodySmall.j();
                if (z21) {
                    j11 = jG;
                }
                j12 = bodyLarge.j();
                if (z21) {
                    j12 = jG;
                }
                if (pVar3 != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z21;
                j13 = j11;
                l1 l1VarG117 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                p2.l lVar111115 = p2.l.f100860c;
                p013kotlin.jvm.internal.l lVar111116 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE11111119 = r1.e(lVar111116);
                p2.d dVar1111111111111111117 = (p2.d) l1VarG117.i();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = p.f100853b;
                i46 = iArr[dVar1111111111111111117.ordinal()];
                f11 = 1.0f;
                if (i46 == 1) {
                    f12 = 1.0f;
                } else if (i46 != 2) {
                    if (i46 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf11111119 = Float.valueOf(f12);
                p2.d dVar1111111111111111118 = (p2.d) l1VarG117.p();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i47 = iArr[dVar1111111111111111118.ordinal()];
                if (i47 == 1) {
                    f13 = 1.0f;
                } else if (i47 != 2) {
                    if (i47 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3 y3VarD1111 = m1.d(l1VarG117, fValueOf11111119, Float.valueOf(f13), lVar111115.invoke(l1VarG117.n(), lVarV, 0), p1VarE11111119, "LabelProgress", lVarV, 196608);
                p2.n nVar117 = p2.n.f100862c;
                p019p1.p1<Float, p019p1.m> p1VarE111111110 = r1.e(lVar111116);
                p2.d dVar1111111111111111119 = (p2.d) l1VarG117.i();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i48 = iArr[dVar1111111111111111119.ordinal()];
                if (i48 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i48 != 2) {
                        if (i48 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z22) {
                        f14 = 1.0f;
                    }
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf111111110 = Float.valueOf(f14);
                p2.d dVar11111111111111111110 = (p2.d) r4.p();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i49 = iArr[dVar11111111111111111110.ordinal()];
                if (i49 == 1) {
                    f15 = 1.0f;
                } else {
                    if (i49 != 2) {
                        if (i49 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 == 0) {
                        f15 = 1.0f;
                    }
                    f15 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD = m1.d(l1VarG117, fValueOf111111110, Float.valueOf(f15), nVar117.invoke(r4.n(), lVarV, 0), p1VarE111111110, "PlaceholderOpacity", lVarV, 196608);
                p2.o oVar117 = p2.o.f100863c;
                p019p1.p1<Float, p019p1.m> p1VarE111111111 = r1.e(lVar111116);
                p2.d dVar11111111111111111111 = (p2.d) l1VarG117.i();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i51 = iArr[dVar11111111111111111111.ordinal()];
                if (i51 == 1) {
                    f16 = 1.0f;
                } else {
                    if (i51 != 2) {
                        if (i51 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f16 = BitmapDescriptorFactory.HUE_RED;
                    }
                    f16 = 1.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf111111111 = Float.valueOf(f16);
                p2.d dVar11111111111111111112 = (p2.d) l1VarG117.p();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i52 = iArr[dVar11111111111111111112.ordinal()];
                if (i52 != 1) {
                    if (i52 != 2) {
                        if (i52 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = m1.d(l1VarG117, fValueOf111111111, Float.valueOf(f11), oVar117.invoke(l1VarG117.n(), lVarV, 0), p1VarE111111111, "PrefixSuffixOpacity", lVarV, 196608);
                p2.m mVar117 = p2.m.f100861c;
                dVar2 = (p2.d) l1VarG117.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar2.ordinal()] == 1) {
                    j14 = j13;
                } else {
                    j14 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                cVarU = k3.p1.u(j14);
                zN = lVarV.n(cVarU);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                } else {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                }
                p019p1.p1 p1Var111114 = (p019p1.p1) objI2;
                dVar3 = (p2.d) l1VarG117.i();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar3.ordinal()] == 1) {
                    j15 = j13;
                } else {
                    j15 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                k3.p1 p1VarL111113 = k3.p1.l(j15);
                dVar4 = (p2.d) l1VarG117.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar4.ordinal()] == 1) {
                    j12 = j13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD3 = m1.d(l1VarG117, p1VarL111113, k3.p1.l(j12), mVar117.invoke(l1VarG117.n(), lVarV, 0), p1Var111114, "LabelTextStyleColor", lVarV, 196608);
                lVar2 = lVarV;
                p2.k kVar117 = p2.k.f100859c;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                cVarU2 = k3.p1.u(jG);
                zN2 = lVar2.n(cVarU2);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                } else {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                }
                p019p1.p1 p1Var111115 = (p019p1.p1) objI3;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                k3.p1 p1VarL111114 = k3.p1.l(jG);
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                y3VarD4 = m1.d(l1VarG117, p1VarL111114, k3.p1.l(jG), kVar117.invoke(r8.n(), lVar2, 0), p1Var111115, "LabelContentColor", lVar2, 196608);
                fFloatValue = ((Number) y3VarD1111.getValue()).floatValue();
                lVar2.o(-156998101);
                if (pVar3 == null) {
                    f17 = fFloatValue;
                    textStyle = bodyLarge;
                    textStyle2 = bodySmall;
                    aVarE = null;
                } else {
                    textStyle = bodyLarge;
                    d dVar11111111111111111113 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                    textStyle2 = bodySmall;
                    f17 = fFloatValue;
                    aVarE = z2.c.e(-1236585568, true, dVar11111111111111111113, lVar2, 54);
                }
                lVar2.l();
                long jI117 = n0Var.i(z15, z16, zBooleanValue);
                objI4 = lVar2.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI4 == companion2.a()) {
                    objI4 = n3.d(n3.q(), new k(y3VarD));
                    lVar2.B(objI4);
                }
                y3 y3Var111114 = (y3) objI4;
                lVar2.o(-156965270);
                if (pVar16 == null) {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                } else {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                }
                lVar2.l();
                long j1111119 = n0Var.j(z15, z16, zBooleanValue);
                objI5 = lVar2.I();
                TextStyle textStyle1111 = textStyle3;
                if (objI5 == companion2.a()) {
                    objI5 = n3.d(n3.q(), new l(y3VarD2));
                    lVar2.B(objI5);
                }
                y3 y3Var111115 = (y3) objI5;
                lVar2.o(-156940524);
                if (pVar14 == null) {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                } else {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                }
                lVar2.l();
                long jK117 = n0Var.k(z15, z16, zBooleanValue);
                lVar2.o(-156921964);
                if (pVar15 == null) {
                    pVar21 = pVar15;
                    aVarE4 = null;
                } else {
                    pVar21 = pVar15;
                    aVarE4 = null;
                }
                lVar2.l();
                jH = n0Var.h(z15, z16, zBooleanValue);
                lVar2.o(-156902962);
                if (pVar12 == null) {
                    aVarE5 = null;
                } else {
                    aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                }
                lVar2.l();
                jO = n0Var.o(z15, z16, zBooleanValue);
                lVar2.o(-156893937);
                if (pVar18 == null) {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = null;
                } else {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                }
                lVar2.l();
                jL = n0Var.l(z15, z16, zBooleanValue);
                lVar2.o(-156884470);
                if (pVar17 == null) {
                    aVarE7 = null;
                } else {
                    aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                }
                lVar2.l();
                i54 = p.f100852a[pVar.ordinal()];
                if (i54 == z24) {
                    z25 = z14;
                    lVar2.o(-568105095);
                    p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                    lVar2.l();
                    h0 h0Var11111119 = h0.f84049a;
                } else if (i54 != 2) {
                    lVar2.o(-565271199);
                    lVar2.l();
                    h0 h0Var111111110 = h0.f84049a;
                    z25 = z14;
                } else {
                    lVar2.o(-567018607);
                    objI6 = lVar2.I();
                    if (objI6 == companion2.a()) {
                        objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                        lVar2.B(objI6);
                    }
                    p1Var = (p1) objI6;
                    z2.a aVarE1114 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                    androidx.compose.ui.d.Companion companion119 = androidx.compose.ui.d.INSTANCE;
                    zQ = lVar2.q(f17);
                    objI7 = lVar2.I();
                    if (zQ) {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    } else {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    }
                    z25 = z14;
                    w.b(companion119, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1114, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                    lVar2.l();
                    h0 h0Var111111111 = h0.f84049a;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar22 = pVar20;
                pVar23 = pVar17;
                z26 = z15;
                pVar24 = pVar12;
                z27 = z16;
                z28 = z25;
                pVar25 = pVar18;
                pVar26 = pVar19;
                pVar27 = pVar21;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
            }
        }
        i55 |= 100663296;
        i29 = i13 & 512;
        if (i29 != 0) {
            if ((i11 & 805306368) == 0) {
                if (lVarV.K(pVar8)) {
                    i31 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i31 = 268435456;
                }
                i55 |= i31;
            }
            i32 = i13 & 1024;
            if (i32 != 0) {
                i33 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (lVarV.K(pVar9)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i12 | i34;
            } else {
                i33 = i12;
            }
            i35 = i13 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i12 & 48) != 0) {
                i33 |= lVarV.p(z11) ? 32 : 16;
            }
            i36 = i33;
            i37 = i13 & 4096;
            if (i37 != 0) {
                i39 = i36 | KyberEngine.KyberPolyBytes;
            } else {
                i38 = i36;
                if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                    i38 |= lVarV.p(z12) ? 256 : 128;
                }
                i39 = i38;
            }
            i41 = i13 & PKIFailureInfo.certRevoked;
            if (i41 != 0) {
                i43 = i39 | 3072;
            } else {
                i42 = i39;
                if ((i12 & 3072) != 0) {
                    i42 |= lVarV.p(z13) ? 2048 : 1024;
                }
                i43 = i42;
            }
            if ((i13 & 16384) != 0) {
                i43 |= 24576;
            } else if ((i12 & 24576) == 0) {
                if (lVarV.n(jVar)) {
                    i17 = 16384;
                }
                i43 |= i17;
            }
            if ((32768 & i13) != 0) {
                i43 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (lVarV.n(yVar)) {
                    i44 = 131072;
                } else {
                    i44 = 65536;
                }
                i43 |= i44;
            }
            if ((i13 & 65536) != 0) {
                i43 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (lVarV.n(n0Var)) {
                    i23 = 1048576;
                }
                i43 |= i23;
            }
            if ((i13 & 131072) != 0) {
                i43 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
            }
            if ((306783379 & i55) != 306783378) {
                if (i19 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i22 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i27 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i29 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                pVar16 = pVar11;
                if (i32 != 0) {
                    pVar17 = null;
                } else {
                    pVar17 = pVar9;
                }
                if (i35 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i41 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i55 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i45 = i43;
                if ((i55 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI = lVarV.I();
                if (z19) {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                } else {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                }
                text = ((TransformedText) objI).getText().getText();
                zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                if (zBooleanValue) {
                    dVar = p2.d.Focused;
                } else if (text.length() == 0) {
                    dVar = p2.d.UnfocusedEmpty;
                } else {
                    dVar = p2.d.UnfocusedNotEmpty;
                }
                jG = n0Var.g(z15, z16, zBooleanValue);
                Typography typographyC118 = t.f96158a.c(lVarV, 6);
                bodyLarge = typographyC118.getBodyLarge();
                bodySmall = typographyC118.getBodySmall();
                pVar18 = pVar13;
                long j11111110 = bodyLarge.j();
                companion = k3.p1.INSTANCE;
                if (k3.p1.r(j11111110, companion.j())) {
                }
                j11 = bodySmall.j();
                if (z21) {
                    j11 = jG;
                }
                j12 = bodyLarge.j();
                if (z21) {
                    j12 = jG;
                }
                if (pVar3 != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z21;
                j13 = j11;
                l1 l1VarG118 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                p2.l lVar111117 = p2.l.f100860c;
                p013kotlin.jvm.internal.l lVar111118 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE111111112 = r1.e(lVar111118);
                p2.d dVar11111111111111111114 = (p2.d) l1VarG118.i();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = p.f100853b;
                i46 = iArr[dVar11111111111111111114.ordinal()];
                f11 = 1.0f;
                if (i46 == 1) {
                    f12 = 1.0f;
                } else if (i46 != 2) {
                    if (i46 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf111111112 = Float.valueOf(f12);
                p2.d dVar11111111111111111115 = (p2.d) l1VarG118.p();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i47 = iArr[dVar11111111111111111115.ordinal()];
                if (i47 == 1) {
                    f13 = 1.0f;
                } else if (i47 != 2) {
                    if (i47 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3 y3VarD1112 = m1.d(l1VarG118, fValueOf111111112, Float.valueOf(f13), lVar111117.invoke(l1VarG118.n(), lVarV, 0), p1VarE111111112, "LabelProgress", lVarV, 196608);
                p2.n nVar118 = p2.n.f100862c;
                p019p1.p1<Float, p019p1.m> p1VarE111111113 = r1.e(lVar111118);
                p2.d dVar11111111111111111116 = (p2.d) l1VarG118.i();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i48 = iArr[dVar11111111111111111116.ordinal()];
                if (i48 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i48 != 2) {
                        if (i48 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z22) {
                        f14 = 1.0f;
                    }
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf111111113 = Float.valueOf(f14);
                p2.d dVar11111111111111111117 = (p2.d) r4.p();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i49 = iArr[dVar11111111111111111117.ordinal()];
                if (i49 == 1) {
                    f15 = 1.0f;
                } else {
                    if (i49 != 2) {
                        if (i49 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 == 0) {
                        f15 = 1.0f;
                    }
                    f15 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD = m1.d(l1VarG118, fValueOf111111113, Float.valueOf(f15), nVar118.invoke(r4.n(), lVarV, 0), p1VarE111111113, "PlaceholderOpacity", lVarV, 196608);
                p2.o oVar118 = p2.o.f100863c;
                p019p1.p1<Float, p019p1.m> p1VarE111111114 = r1.e(lVar111118);
                p2.d dVar11111111111111111118 = (p2.d) l1VarG118.i();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i51 = iArr[dVar11111111111111111118.ordinal()];
                if (i51 == 1) {
                    f16 = 1.0f;
                } else {
                    if (i51 != 2) {
                        if (i51 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f16 = BitmapDescriptorFactory.HUE_RED;
                    }
                    f16 = 1.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf111111114 = Float.valueOf(f16);
                p2.d dVar11111111111111111119 = (p2.d) l1VarG118.p();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i52 = iArr[dVar11111111111111111119.ordinal()];
                if (i52 != 1) {
                    if (i52 != 2) {
                        if (i52 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = m1.d(l1VarG118, fValueOf111111114, Float.valueOf(f11), oVar118.invoke(l1VarG118.n(), lVarV, 0), p1VarE111111114, "PrefixSuffixOpacity", lVarV, 196608);
                p2.m mVar118 = p2.m.f100861c;
                dVar2 = (p2.d) l1VarG118.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar2.ordinal()] == 1) {
                    j14 = j13;
                } else {
                    j14 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                cVarU = k3.p1.u(j14);
                zN = lVarV.n(cVarU);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                } else {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                }
                p019p1.p1 p1Var111116 = (p019p1.p1) objI2;
                dVar3 = (p2.d) l1VarG118.i();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar3.ordinal()] == 1) {
                    j15 = j13;
                } else {
                    j15 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                k3.p1 p1VarL111115 = k3.p1.l(j15);
                dVar4 = (p2.d) l1VarG118.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar4.ordinal()] == 1) {
                    j12 = j13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD3 = m1.d(l1VarG118, p1VarL111115, k3.p1.l(j12), mVar118.invoke(l1VarG118.n(), lVarV, 0), p1Var111116, "LabelTextStyleColor", lVarV, 196608);
                lVar2 = lVarV;
                p2.k kVar118 = p2.k.f100859c;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                cVarU2 = k3.p1.u(jG);
                zN2 = lVar2.n(cVarU2);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                } else {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                }
                p019p1.p1 p1Var111117 = (p019p1.p1) objI3;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                k3.p1 p1VarL111116 = k3.p1.l(jG);
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                y3VarD4 = m1.d(l1VarG118, p1VarL111116, k3.p1.l(jG), kVar118.invoke(r8.n(), lVar2, 0), p1Var111117, "LabelContentColor", lVar2, 196608);
                fFloatValue = ((Number) y3VarD1112.getValue()).floatValue();
                lVar2.o(-156998101);
                if (pVar3 == null) {
                    f17 = fFloatValue;
                    textStyle = bodyLarge;
                    textStyle2 = bodySmall;
                    aVarE = null;
                } else {
                    textStyle = bodyLarge;
                    d dVar111111111111111111110 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                    textStyle2 = bodySmall;
                    f17 = fFloatValue;
                    aVarE = z2.c.e(-1236585568, true, dVar111111111111111111110, lVar2, 54);
                }
                lVar2.l();
                long jI118 = n0Var.i(z15, z16, zBooleanValue);
                objI4 = lVar2.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI4 == companion2.a()) {
                    objI4 = n3.d(n3.q(), new k(y3VarD));
                    lVar2.B(objI4);
                }
                y3 y3Var111116 = (y3) objI4;
                lVar2.o(-156965270);
                if (pVar16 == null) {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                } else {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                }
                lVar2.l();
                long j11111111 = n0Var.j(z15, z16, zBooleanValue);
                objI5 = lVar2.I();
                TextStyle textStyle1112 = textStyle3;
                if (objI5 == companion2.a()) {
                    objI5 = n3.d(n3.q(), new l(y3VarD2));
                    lVar2.B(objI5);
                }
                y3 y3Var111117 = (y3) objI5;
                lVar2.o(-156940524);
                if (pVar14 == null) {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                } else {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                }
                lVar2.l();
                long jK118 = n0Var.k(z15, z16, zBooleanValue);
                lVar2.o(-156921964);
                if (pVar15 == null) {
                    pVar21 = pVar15;
                    aVarE4 = null;
                } else {
                    pVar21 = pVar15;
                    aVarE4 = null;
                }
                lVar2.l();
                jH = n0Var.h(z15, z16, zBooleanValue);
                lVar2.o(-156902962);
                if (pVar12 == null) {
                    aVarE5 = null;
                } else {
                    aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                }
                lVar2.l();
                jO = n0Var.o(z15, z16, zBooleanValue);
                lVar2.o(-156893937);
                if (pVar18 == null) {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = null;
                } else {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                }
                lVar2.l();
                jL = n0Var.l(z15, z16, zBooleanValue);
                lVar2.o(-156884470);
                if (pVar17 == null) {
                    aVarE7 = null;
                } else {
                    aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                }
                lVar2.l();
                i54 = p.f100852a[pVar.ordinal()];
                if (i54 == z24) {
                    z25 = z14;
                    lVar2.o(-568105095);
                    p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                    lVar2.l();
                    h0 h0Var111111112 = h0.f84049a;
                } else if (i54 != 2) {
                    lVar2.o(-565271199);
                    lVar2.l();
                    h0 h0Var111111113 = h0.f84049a;
                    z25 = z14;
                } else {
                    lVar2.o(-567018607);
                    objI6 = lVar2.I();
                    if (objI6 == companion2.a()) {
                        objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                        lVar2.B(objI6);
                    }
                    p1Var = (p1) objI6;
                    z2.a aVarE1115 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                    androidx.compose.ui.d.Companion companion1110 = androidx.compose.ui.d.INSTANCE;
                    zQ = lVar2.q(f17);
                    objI7 = lVar2.I();
                    if (zQ) {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    } else {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    }
                    z25 = z14;
                    w.b(companion1110, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1115, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                    lVar2.l();
                    h0 h0Var111111114 = h0.f84049a;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar22 = pVar20;
                pVar23 = pVar17;
                z26 = z15;
                pVar24 = pVar12;
                z27 = z16;
                z28 = z25;
                pVar25 = pVar18;
                pVar26 = pVar19;
                pVar27 = pVar21;
            } else {
                if (i19 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i22 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i27 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i29 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                pVar16 = pVar11;
                if (i32 != 0) {
                    pVar17 = null;
                } else {
                    pVar17 = pVar9;
                }
                if (i35 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i41 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i55 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i45 = i43;
                if ((i55 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI = lVarV.I();
                if (z19) {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                } else {
                    objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                    lVarV.B(objI);
                }
                text = ((TransformedText) objI).getText().getText();
                zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
                if (zBooleanValue) {
                    dVar = p2.d.Focused;
                } else if (text.length() == 0) {
                    dVar = p2.d.UnfocusedEmpty;
                } else {
                    dVar = p2.d.UnfocusedNotEmpty;
                }
                jG = n0Var.g(z15, z16, zBooleanValue);
                Typography typographyC119 = t.f96158a.c(lVarV, 6);
                bodyLarge = typographyC119.getBodyLarge();
                bodySmall = typographyC119.getBodySmall();
                pVar18 = pVar13;
                long j11111112 = bodyLarge.j();
                companion = k3.p1.INSTANCE;
                if (k3.p1.r(j11111112, companion.j())) {
                }
                j11 = bodySmall.j();
                if (z21) {
                    j11 = jG;
                }
                j12 = bodyLarge.j();
                if (z21) {
                    j12 = jG;
                }
                if (pVar3 != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z21;
                j13 = j11;
                l1 l1VarG119 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
                p2.l lVar111119 = p2.l.f100860c;
                p013kotlin.jvm.internal.l lVar1111110 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE111111115 = r1.e(lVar1111110);
                p2.d dVar111111111111111111111 = (p2.d) l1VarG119.i();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = p.f100853b;
                i46 = iArr[dVar111111111111111111111.ordinal()];
                f11 = 1.0f;
                if (i46 == 1) {
                    f12 = 1.0f;
                } else if (i46 != 2) {
                    if (i46 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf111111115 = Float.valueOf(f12);
                p2.d dVar111111111111111111112 = (p2.d) l1VarG119.p();
                lVarV.o(-2036730335);
                if (p020r2.o.J()) {
                    p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i47 = iArr[dVar111111111111111111112.ordinal()];
                if (i47 == 1) {
                    f13 = 1.0f;
                } else if (i47 != 2) {
                    if (i47 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3 y3VarD1113 = m1.d(l1VarG119, fValueOf111111115, Float.valueOf(f13), lVar111119.invoke(l1VarG119.n(), lVarV, 0), p1VarE111111115, "LabelProgress", lVarV, 196608);
                p2.n nVar119 = p2.n.f100862c;
                p019p1.p1<Float, p019p1.m> p1VarE111111116 = r1.e(lVar1111110);
                p2.d dVar111111111111111111113 = (p2.d) l1VarG119.i();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i48 = iArr[dVar111111111111111111113.ordinal()];
                if (i48 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i48 != 2) {
                        if (i48 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z22) {
                        f14 = 1.0f;
                    }
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf111111116 = Float.valueOf(f14);
                p2.d dVar111111111111111111114 = (p2.d) r4.p();
                lVarV.o(1435837472);
                if (p020r2.o.J()) {
                    p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i49 = iArr[dVar111111111111111111114.ordinal()];
                if (i49 == 1) {
                    f15 = 1.0f;
                } else {
                    if (i49 != 2) {
                        if (i49 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 == 0) {
                        f15 = 1.0f;
                    }
                    f15 = BitmapDescriptorFactory.HUE_RED;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD = m1.d(l1VarG119, fValueOf111111116, Float.valueOf(f15), nVar119.invoke(r4.n(), lVarV, 0), p1VarE111111116, "PlaceholderOpacity", lVarV, 196608);
                p2.o oVar119 = p2.o.f100863c;
                p019p1.p1<Float, p019p1.m> p1VarE111111117 = r1.e(lVar1111110);
                p2.d dVar111111111111111111115 = (p2.d) l1VarG119.i();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i51 = iArr[dVar111111111111111111115.ordinal()];
                if (i51 == 1) {
                    f16 = 1.0f;
                } else {
                    if (i51 != 2) {
                        if (i51 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f16 = BitmapDescriptorFactory.HUE_RED;
                    }
                    f16 = 1.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf111111117 = Float.valueOf(f16);
                p2.d dVar111111111111111111116 = (p2.d) l1VarG119.p();
                lVarV.o(1128033978);
                if (p020r2.o.J()) {
                    p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i52 = iArr[dVar111111111111111111116.ordinal()];
                if (i52 != 1) {
                    if (i52 != 2) {
                        if (i52 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z22 != 0) {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = m1.d(l1VarG119, fValueOf111111117, Float.valueOf(f11), oVar119.invoke(l1VarG119.n(), lVarV, 0), p1VarE111111117, "PrefixSuffixOpacity", lVarV, 196608);
                p2.m mVar119 = p2.m.f100861c;
                dVar2 = (p2.d) l1VarG119.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar2.ordinal()] == 1) {
                    j14 = j13;
                } else {
                    j14 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                cVarU = k3.p1.u(j14);
                zN = lVarV.n(cVarU);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                } else {
                    objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                    lVarV.B(objI2);
                }
                p019p1.p1 p1Var111118 = (p019p1.p1) objI2;
                dVar3 = (p2.d) l1VarG119.i();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar3.ordinal()] == 1) {
                    j15 = j13;
                } else {
                    j15 = j12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                k3.p1 p1VarL111117 = k3.p1.l(j15);
                dVar4 = (p2.d) l1VarG119.p();
                lVarV.o(-107432127);
                if (p020r2.o.J()) {
                    p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[dVar4.ordinal()] == 1) {
                    j12 = j13;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD3 = m1.d(l1VarG119, p1VarL111117, k3.p1.l(j12), mVar119.invoke(l1VarG119.n(), lVarV, 0), p1Var111118, "LabelTextStyleColor", lVarV, 196608);
                lVar2 = lVarV;
                p2.k kVar119 = p2.k.f100859c;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                cVarU2 = k3.p1.u(jG);
                zN2 = lVar2.n(cVarU2);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                } else {
                    objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                    lVar2.B(objI3);
                }
                p019p1.p1 p1Var111119 = (p019p1.p1) objI3;
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                k3.p1 p1VarL111118 = k3.p1.l(jG);
                lVar2.o(1023351670);
                if (p020r2.o.J()) {
                    p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2.l();
                y3VarD4 = m1.d(l1VarG119, p1VarL111118, k3.p1.l(jG), kVar119.invoke(r8.n(), lVar2, 0), p1Var111119, "LabelContentColor", lVar2, 196608);
                fFloatValue = ((Number) y3VarD1113.getValue()).floatValue();
                lVar2.o(-156998101);
                if (pVar3 == null) {
                    f17 = fFloatValue;
                    textStyle = bodyLarge;
                    textStyle2 = bodySmall;
                    aVarE = null;
                } else {
                    textStyle = bodyLarge;
                    d dVar111111111111111111117 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                    textStyle2 = bodySmall;
                    f17 = fFloatValue;
                    aVarE = z2.c.e(-1236585568, true, dVar111111111111111111117, lVar2, 54);
                }
                lVar2.l();
                long jI119 = n0Var.i(z15, z16, zBooleanValue);
                objI4 = lVar2.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI4 == companion2.a()) {
                    objI4 = n3.d(n3.q(), new k(y3VarD));
                    lVar2.B(objI4);
                }
                y3 y3Var111118 = (y3) objI4;
                lVar2.o(-156965270);
                if (pVar16 == null) {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                } else {
                    textStyle3 = textStyle;
                    pVar19 = pVar16;
                    aVarE2 = null;
                }
                lVar2.l();
                long j11111113 = n0Var.j(z15, z16, zBooleanValue);
                objI5 = lVar2.I();
                TextStyle textStyle1113 = textStyle3;
                if (objI5 == companion2.a()) {
                    objI5 = n3.d(n3.q(), new l(y3VarD2));
                    lVar2.B(objI5);
                }
                y3 y3Var111119 = (y3) objI5;
                lVar2.o(-156940524);
                if (pVar14 == null) {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                } else {
                    y3Var = y3VarD2;
                    pVar20 = pVar14;
                    aVarE3 = null;
                }
                lVar2.l();
                long jK119 = n0Var.k(z15, z16, zBooleanValue);
                lVar2.o(-156921964);
                if (pVar15 == null) {
                    pVar21 = pVar15;
                    aVarE4 = null;
                } else {
                    pVar21 = pVar15;
                    aVarE4 = null;
                }
                lVar2.l();
                jH = n0Var.h(z15, z16, zBooleanValue);
                lVar2.o(-156902962);
                if (pVar12 == null) {
                    aVarE5 = null;
                } else {
                    aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
                }
                lVar2.l();
                jO = n0Var.o(z15, z16, zBooleanValue);
                lVar2.o(-156893937);
                if (pVar18 == null) {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = null;
                } else {
                    z24 = true;
                    i53 = 54;
                    aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
                }
                lVar2.l();
                jL = n0Var.l(z15, z16, zBooleanValue);
                lVar2.o(-156884470);
                if (pVar17 == null) {
                    aVarE7 = null;
                } else {
                    aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
                }
                lVar2.l();
                i54 = p.f100852a[pVar.ordinal()];
                if (i54 == z24) {
                    z25 = z14;
                    lVar2.o(-568105095);
                    p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                    lVar2.l();
                    h0 h0Var111111115 = h0.f84049a;
                } else if (i54 != 2) {
                    lVar2.o(-565271199);
                    lVar2.l();
                    h0 h0Var111111116 = h0.f84049a;
                    z25 = z14;
                } else {
                    lVar2.o(-567018607);
                    objI6 = lVar2.I();
                    if (objI6 == companion2.a()) {
                        objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                        lVar2.B(objI6);
                    }
                    p1Var = (p1) objI6;
                    z2.a aVarE1116 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                    androidx.compose.ui.d.Companion companion1111 = androidx.compose.ui.d.INSTANCE;
                    zQ = lVar2.q(f17);
                    objI7 = lVar2.I();
                    if (zQ) {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    } else {
                        objI7 = new a(f17, p1Var);
                        lVar2.B(objI7);
                    }
                    z25 = z14;
                    w.b(companion1111, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1116, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                    lVar2.l();
                    h0 h0Var111111117 = h0.f84049a;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar22 = pVar20;
                pVar23 = pVar17;
                z26 = z15;
                pVar24 = pVar12;
                z27 = z16;
                z28 = z25;
                pVar25 = pVar18;
                pVar26 = pVar19;
                pVar27 = pVar21;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
            }
        }
        i55 |= 805306368;
        i32 = i13 & 1024;
        if (i32 != 0) {
            i33 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            if (lVarV.K(pVar9)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i33 = i12 | i34;
        } else {
            i33 = i12;
        }
        i35 = i13 & 2048;
        if (i35 != 0) {
            i33 |= 48;
        } else if ((i12 & 48) != 0) {
            i33 |= lVarV.p(z11) ? 32 : 16;
        }
        i36 = i33;
        i37 = i13 & 4096;
        if (i37 != 0) {
            i39 = i36 | KyberEngine.KyberPolyBytes;
        } else {
            i38 = i36;
            if ((i12 & KyberEngine.KyberPolyBytes) != 0) {
                i38 |= lVarV.p(z12) ? 256 : 128;
            }
            i39 = i38;
        }
        i41 = i13 & PKIFailureInfo.certRevoked;
        if (i41 != 0) {
            i43 = i39 | 3072;
        } else {
            i42 = i39;
            if ((i12 & 3072) != 0) {
                i42 |= lVarV.p(z13) ? 2048 : 1024;
            }
            i43 = i42;
        }
        if ((i13 & 16384) != 0) {
            i43 |= 24576;
        } else if ((i12 & 24576) == 0) {
            if (lVarV.n(jVar)) {
                i17 = 16384;
            }
            i43 |= i17;
        }
        if ((32768 & i13) != 0) {
            i43 |= 196608;
        } else if ((i12 & 196608) == 0) {
            if (lVarV.n(yVar)) {
                i44 = 131072;
            } else {
                i44 = 65536;
            }
            i43 |= i44;
        }
        if ((i13 & 65536) != 0) {
            i43 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (lVarV.n(n0Var)) {
                i23 = 1048576;
            }
            i43 |= i23;
        }
        if ((i13 & 131072) != 0) {
            i43 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            i43 |= lVarV.K(pVar10) ? 8388608 : 4194304;
        }
        if ((306783379 & i55) != 306783378) {
            if (i19 != 0) {
                pVar11 = null;
            } else {
                pVar11 = pVar4;
            }
            if (i22 != 0) {
                pVar12 = null;
            } else {
                pVar12 = pVar5;
            }
            if (i25 != 0) {
                pVar13 = null;
            } else {
                pVar13 = pVar6;
            }
            if (i27 != 0) {
                pVar14 = null;
            } else {
                pVar14 = pVar7;
            }
            if (i29 != 0) {
                pVar15 = null;
            } else {
                pVar15 = pVar8;
            }
            pVar16 = pVar11;
            if (i32 != 0) {
                pVar17 = null;
            } else {
                pVar17 = pVar9;
            }
            if (i35 != 0) {
                z14 = false;
            } else {
                z14 = z11;
            }
            if (i37 != 0) {
                z15 = true;
            } else {
                z15 = z12;
            }
            if (i41 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
            }
            if ((i55 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            i45 = i43;
            if ((i55 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | z17;
            objI = lVarV.I();
            if (z19) {
                objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                lVarV.B(objI);
            } else {
                objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                lVarV.B(objI);
            }
            text = ((TransformedText) objI).getText().getText();
            zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
            if (zBooleanValue) {
                dVar = p2.d.Focused;
            } else if (text.length() == 0) {
                dVar = p2.d.UnfocusedEmpty;
            } else {
                dVar = p2.d.UnfocusedNotEmpty;
            }
            jG = n0Var.g(z15, z16, zBooleanValue);
            Typography typographyC1110 = t.f96158a.c(lVarV, 6);
            bodyLarge = typographyC1110.getBodyLarge();
            bodySmall = typographyC1110.getBodySmall();
            pVar18 = pVar13;
            long j11111114 = bodyLarge.j();
            companion = k3.p1.INSTANCE;
            if (k3.p1.r(j11111114, companion.j())) {
            }
            j11 = bodySmall.j();
            if (z21) {
                j11 = jG;
            }
            j12 = bodyLarge.j();
            if (z21) {
                j12 = jG;
            }
            if (pVar3 != null) {
                z22 = true;
            } else {
                z22 = false;
            }
            z23 = z21;
            j13 = j11;
            l1 l1VarG1110 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
            p2.l lVar1111111 = p2.l.f100860c;
            p013kotlin.jvm.internal.l lVar1111112 = p013kotlin.jvm.internal.l.f86526a;
            p019p1.p1<Float, p019p1.m> p1VarE111111118 = r1.e(lVar1111112);
            p2.d dVar111111111111111111118 = (p2.d) l1VarG1110.i();
            lVarV.o(-2036730335);
            if (p020r2.o.J()) {
                p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            iArr = p.f100853b;
            i46 = iArr[dVar111111111111111111118.ordinal()];
            f11 = 1.0f;
            if (i46 == 1) {
                f12 = 1.0f;
            } else if (i46 != 2) {
                if (i46 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 1.0f;
            } else {
                f12 = BitmapDescriptorFactory.HUE_RED;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf111111118 = Float.valueOf(f12);
            p2.d dVar111111111111111111119 = (p2.d) l1VarG1110.p();
            lVarV.o(-2036730335);
            if (p020r2.o.J()) {
                p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            i47 = iArr[dVar111111111111111111119.ordinal()];
            if (i47 == 1) {
                f13 = 1.0f;
            } else if (i47 != 2) {
                if (i47 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 1.0f;
            } else {
                f13 = BitmapDescriptorFactory.HUE_RED;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3 y3VarD1114 = m1.d(l1VarG1110, fValueOf111111118, Float.valueOf(f13), lVar1111111.invoke(l1VarG1110.n(), lVarV, 0), p1VarE111111118, "LabelProgress", lVarV, 196608);
            p2.n nVar1110 = p2.n.f100862c;
            p019p1.p1<Float, p019p1.m> p1VarE111111119 = r1.e(lVar1111112);
            p2.d dVar1111111111111111111110 = (p2.d) l1VarG1110.i();
            lVarV.o(1435837472);
            if (p020r2.o.J()) {
                p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            i48 = iArr[dVar1111111111111111111110.ordinal()];
            if (i48 == 1) {
                f14 = 1.0f;
            } else {
                if (i48 != 2) {
                    if (i48 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z22) {
                    f14 = 1.0f;
                }
                f14 = BitmapDescriptorFactory.HUE_RED;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf111111119 = Float.valueOf(f14);
            p2.d dVar1111111111111111111111 = (p2.d) r4.p();
            lVarV.o(1435837472);
            if (p020r2.o.J()) {
                p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            i49 = iArr[dVar1111111111111111111111.ordinal()];
            if (i49 == 1) {
                f15 = 1.0f;
            } else {
                if (i49 != 2) {
                    if (i49 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z22 == 0) {
                    f15 = 1.0f;
                }
                f15 = BitmapDescriptorFactory.HUE_RED;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3VarD = m1.d(l1VarG1110, fValueOf111111119, Float.valueOf(f15), nVar1110.invoke(r4.n(), lVarV, 0), p1VarE111111119, "PlaceholderOpacity", lVarV, 196608);
            p2.o oVar1110 = p2.o.f100863c;
            p019p1.p1<Float, p019p1.m> p1VarE1111111110 = r1.e(lVar1111112);
            p2.d dVar1111111111111111111112 = (p2.d) l1VarG1110.i();
            lVarV.o(1128033978);
            if (p020r2.o.J()) {
                p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            i51 = iArr[dVar1111111111111111111112.ordinal()];
            if (i51 == 1) {
                f16 = 1.0f;
            } else {
                if (i51 != 2) {
                    if (i51 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z22 != 0) {
                    f16 = BitmapDescriptorFactory.HUE_RED;
                }
                f16 = 1.0f;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf1111111110 = Float.valueOf(f16);
            p2.d dVar1111111111111111111113 = (p2.d) l1VarG1110.p();
            lVarV.o(1128033978);
            if (p020r2.o.J()) {
                p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            i52 = iArr[dVar1111111111111111111113.ordinal()];
            if (i52 != 1) {
                if (i52 != 2) {
                    if (i52 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z22 != 0) {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                }
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3VarD2 = m1.d(l1VarG1110, fValueOf1111111110, Float.valueOf(f11), oVar1110.invoke(l1VarG1110.n(), lVarV, 0), p1VarE1111111110, "PrefixSuffixOpacity", lVarV, 196608);
            p2.m mVar1110 = p2.m.f100861c;
            dVar2 = (p2.d) l1VarG1110.p();
            lVarV.o(-107432127);
            if (p020r2.o.J()) {
                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[dVar2.ordinal()] == 1) {
                j14 = j13;
            } else {
                j14 = j12;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            cVarU = k3.p1.u(j14);
            zN = lVarV.n(cVarU);
            objI2 = lVarV.I();
            if (zN) {
                objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                lVarV.B(objI2);
            } else {
                objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                lVarV.B(objI2);
            }
            p019p1.p1 p1Var1111110 = (p019p1.p1) objI2;
            dVar3 = (p2.d) l1VarG1110.i();
            lVarV.o(-107432127);
            if (p020r2.o.J()) {
                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[dVar3.ordinal()] == 1) {
                j15 = j13;
            } else {
                j15 = j12;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            k3.p1 p1VarL111119 = k3.p1.l(j15);
            dVar4 = (p2.d) l1VarG1110.p();
            lVarV.o(-107432127);
            if (p020r2.o.J()) {
                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[dVar4.ordinal()] == 1) {
                j12 = j13;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3VarD3 = m1.d(l1VarG1110, p1VarL111119, k3.p1.l(j12), mVar1110.invoke(l1VarG1110.n(), lVarV, 0), p1Var1111110, "LabelTextStyleColor", lVarV, 196608);
            lVar2 = lVarV;
            p2.k kVar1110 = p2.k.f100859c;
            lVar2.o(1023351670);
            if (p020r2.o.J()) {
                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar2.l();
            cVarU2 = k3.p1.u(jG);
            zN2 = lVar2.n(cVarU2);
            objI3 = lVar2.I();
            if (zN2) {
                objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                lVar2.B(objI3);
            } else {
                objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                lVar2.B(objI3);
            }
            p019p1.p1 p1Var1111111 = (p019p1.p1) objI3;
            lVar2.o(1023351670);
            if (p020r2.o.J()) {
                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar2.l();
            k3.p1 p1VarL1111110 = k3.p1.l(jG);
            lVar2.o(1023351670);
            if (p020r2.o.J()) {
                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar2.l();
            y3VarD4 = m1.d(l1VarG1110, p1VarL1111110, k3.p1.l(jG), kVar1110.invoke(r8.n(), lVar2, 0), p1Var1111111, "LabelContentColor", lVar2, 196608);
            fFloatValue = ((Number) y3VarD1114.getValue()).floatValue();
            lVar2.o(-156998101);
            if (pVar3 == null) {
                f17 = fFloatValue;
                textStyle = bodyLarge;
                textStyle2 = bodySmall;
                aVarE = null;
            } else {
                textStyle = bodyLarge;
                d dVar1111111111111111111114 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                textStyle2 = bodySmall;
                f17 = fFloatValue;
                aVarE = z2.c.e(-1236585568, true, dVar1111111111111111111114, lVar2, 54);
            }
            lVar2.l();
            long jI1110 = n0Var.i(z15, z16, zBooleanValue);
            objI4 = lVar2.I();
            companion2 = p020r2.l.INSTANCE;
            if (objI4 == companion2.a()) {
                objI4 = n3.d(n3.q(), new k(y3VarD));
                lVar2.B(objI4);
            }
            y3 y3Var1111110 = (y3) objI4;
            lVar2.o(-156965270);
            if (pVar16 == null) {
                textStyle3 = textStyle;
                pVar19 = pVar16;
                aVarE2 = null;
            } else {
                textStyle3 = textStyle;
                pVar19 = pVar16;
                aVarE2 = null;
            }
            lVar2.l();
            long j11111115 = n0Var.j(z15, z16, zBooleanValue);
            objI5 = lVar2.I();
            TextStyle textStyle1114 = textStyle3;
            if (objI5 == companion2.a()) {
                objI5 = n3.d(n3.q(), new l(y3VarD2));
                lVar2.B(objI5);
            }
            y3 y3Var1111111 = (y3) objI5;
            lVar2.o(-156940524);
            if (pVar14 == null) {
                y3Var = y3VarD2;
                pVar20 = pVar14;
                aVarE3 = null;
            } else {
                y3Var = y3VarD2;
                pVar20 = pVar14;
                aVarE3 = null;
            }
            lVar2.l();
            long jK1110 = n0Var.k(z15, z16, zBooleanValue);
            lVar2.o(-156921964);
            if (pVar15 == null) {
                pVar21 = pVar15;
                aVarE4 = null;
            } else {
                pVar21 = pVar15;
                aVarE4 = null;
            }
            lVar2.l();
            jH = n0Var.h(z15, z16, zBooleanValue);
            lVar2.o(-156902962);
            if (pVar12 == null) {
                aVarE5 = null;
            } else {
                aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
            }
            lVar2.l();
            jO = n0Var.o(z15, z16, zBooleanValue);
            lVar2.o(-156893937);
            if (pVar18 == null) {
                z24 = true;
                i53 = 54;
                aVarE6 = null;
            } else {
                z24 = true;
                i53 = 54;
                aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
            }
            lVar2.l();
            jL = n0Var.l(z15, z16, zBooleanValue);
            lVar2.o(-156884470);
            if (pVar17 == null) {
                aVarE7 = null;
            } else {
                aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
            }
            lVar2.l();
            i54 = p.f100852a[pVar.ordinal()];
            if (i54 == z24) {
                z25 = z14;
                lVar2.o(-568105095);
                p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                lVar2.l();
                h0 h0Var111111118 = h0.f84049a;
            } else if (i54 != 2) {
                lVar2.o(-565271199);
                lVar2.l();
                h0 h0Var111111119 = h0.f84049a;
                z25 = z14;
            } else {
                lVar2.o(-567018607);
                objI6 = lVar2.I();
                if (objI6 == companion2.a()) {
                    objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                    lVar2.B(objI6);
                }
                p1Var = (p1) objI6;
                z2.a aVarE1117 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                androidx.compose.ui.d.Companion companion1112 = androidx.compose.ui.d.INSTANCE;
                zQ = lVar2.q(f17);
                objI7 = lVar2.I();
                if (zQ) {
                    objI7 = new a(f17, p1Var);
                    lVar2.B(objI7);
                } else {
                    objI7 = new a(f17, p1Var);
                    lVar2.B(objI7);
                }
                z25 = z14;
                w.b(companion1112, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1117, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                lVar2.l();
                h0 h0Var1111111110 = h0.f84049a;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            pVar22 = pVar20;
            pVar23 = pVar17;
            z26 = z15;
            pVar24 = pVar12;
            z27 = z16;
            z28 = z25;
            pVar25 = pVar18;
            pVar26 = pVar19;
            pVar27 = pVar21;
        } else {
            if (i19 != 0) {
                pVar11 = null;
            } else {
                pVar11 = pVar4;
            }
            if (i22 != 0) {
                pVar12 = null;
            } else {
                pVar12 = pVar5;
            }
            if (i25 != 0) {
                pVar13 = null;
            } else {
                pVar13 = pVar6;
            }
            if (i27 != 0) {
                pVar14 = null;
            } else {
                pVar14 = pVar7;
            }
            if (i29 != 0) {
                pVar15 = null;
            } else {
                pVar15 = pVar8;
            }
            pVar16 = pVar11;
            if (i32 != 0) {
                pVar17 = null;
            } else {
                pVar17 = pVar9;
            }
            if (i35 != 0) {
                z14 = false;
            } else {
                z14 = z11;
            }
            if (i37 != 0) {
                z15 = true;
            } else {
                z15 = z12;
            }
            if (i41 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1514469103, i55, i43, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
            }
            if ((i55 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            i45 = i43;
            if ((i55 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | z17;
            objI = lVarV.I();
            if (z19) {
                objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                lVarV.B(objI);
            } else {
                objI = z0Var.filter(new i4.d(str, null, null, 6, null));
                lVarV.B(objI);
            }
            text = ((TransformedText) objI).getText().getText();
            zBooleanValue = u1.f.a(jVar, lVarV, (i45 >> 12) & 14).getValue().booleanValue();
            if (zBooleanValue) {
                dVar = p2.d.Focused;
            } else if (text.length() == 0) {
                dVar = p2.d.UnfocusedEmpty;
            } else {
                dVar = p2.d.UnfocusedNotEmpty;
            }
            jG = n0Var.g(z15, z16, zBooleanValue);
            Typography typographyC1111 = t.f96158a.c(lVarV, 6);
            bodyLarge = typographyC1111.getBodyLarge();
            bodySmall = typographyC1111.getBodySmall();
            pVar18 = pVar13;
            long j11111116 = bodyLarge.j();
            companion = k3.p1.INSTANCE;
            if (k3.p1.r(j11111116, companion.j())) {
            }
            j11 = bodySmall.j();
            if (z21) {
                j11 = jG;
            }
            j12 = bodyLarge.j();
            if (z21) {
                j12 = jG;
            }
            if (pVar3 != null) {
                z22 = true;
            } else {
                z22 = false;
            }
            z23 = z21;
            j13 = j11;
            l1 l1VarG1111 = m1.g(dVar, "TextFieldInputState", lVarV, 48, 0);
            p2.l lVar1111113 = p2.l.f100860c;
            p013kotlin.jvm.internal.l lVar1111114 = p013kotlin.jvm.internal.l.f86526a;
            p019p1.p1<Float, p019p1.m> p1VarE1111111111 = r1.e(lVar1111114);
            p2.d dVar1111111111111111111115 = (p2.d) l1VarG1111.i();
            lVarV.o(-2036730335);
            if (p020r2.o.J()) {
                p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            iArr = p.f100853b;
            i46 = iArr[dVar1111111111111111111115.ordinal()];
            f11 = 1.0f;
            if (i46 == 1) {
                f12 = 1.0f;
            } else if (i46 != 2) {
                if (i46 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 1.0f;
            } else {
                f12 = BitmapDescriptorFactory.HUE_RED;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf1111111111 = Float.valueOf(f12);
            p2.d dVar1111111111111111111116 = (p2.d) l1VarG1111.p();
            lVarV.o(-2036730335);
            if (p020r2.o.J()) {
                p020r2.o.S(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            i47 = iArr[dVar1111111111111111111116.ordinal()];
            if (i47 == 1) {
                f13 = 1.0f;
            } else if (i47 != 2) {
                if (i47 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 1.0f;
            } else {
                f13 = BitmapDescriptorFactory.HUE_RED;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3 y3VarD1115 = m1.d(l1VarG1111, fValueOf1111111111, Float.valueOf(f13), lVar1111113.invoke(l1VarG1111.n(), lVarV, 0), p1VarE1111111111, "LabelProgress", lVarV, 196608);
            p2.n nVar1111 = p2.n.f100862c;
            p019p1.p1<Float, p019p1.m> p1VarE1111111112 = r1.e(lVar1111114);
            p2.d dVar1111111111111111111117 = (p2.d) l1VarG1111.i();
            lVarV.o(1435837472);
            if (p020r2.o.J()) {
                p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            i48 = iArr[dVar1111111111111111111117.ordinal()];
            if (i48 == 1) {
                f14 = 1.0f;
            } else {
                if (i48 != 2) {
                    if (i48 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z22) {
                    f14 = 1.0f;
                }
                f14 = BitmapDescriptorFactory.HUE_RED;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf1111111112 = Float.valueOf(f14);
            p2.d dVar1111111111111111111118 = (p2.d) r4.p();
            lVarV.o(1435837472);
            if (p020r2.o.J()) {
                p020r2.o.S(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            i49 = iArr[dVar1111111111111111111118.ordinal()];
            if (i49 == 1) {
                f15 = 1.0f;
            } else {
                if (i49 != 2) {
                    if (i49 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z22 == 0) {
                    f15 = 1.0f;
                }
                f15 = BitmapDescriptorFactory.HUE_RED;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3VarD = m1.d(l1VarG1111, fValueOf1111111112, Float.valueOf(f15), nVar1111.invoke(r4.n(), lVarV, 0), p1VarE1111111112, "PlaceholderOpacity", lVarV, 196608);
            p2.o oVar1111 = p2.o.f100863c;
            p019p1.p1<Float, p019p1.m> p1VarE1111111113 = r1.e(lVar1111114);
            p2.d dVar1111111111111111111119 = (p2.d) l1VarG1111.i();
            lVarV.o(1128033978);
            if (p020r2.o.J()) {
                p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            i51 = iArr[dVar1111111111111111111119.ordinal()];
            if (i51 == 1) {
                f16 = 1.0f;
            } else {
                if (i51 != 2) {
                    if (i51 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z22 != 0) {
                    f16 = BitmapDescriptorFactory.HUE_RED;
                }
                f16 = 1.0f;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf1111111113 = Float.valueOf(f16);
            p2.d dVar11111111111111111111110 = (p2.d) l1VarG1111.p();
            lVarV.o(1128033978);
            if (p020r2.o.J()) {
                p020r2.o.S(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            i52 = iArr[dVar11111111111111111111110.ordinal()];
            if (i52 != 1) {
                if (i52 != 2) {
                    if (i52 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z22 != 0) {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                }
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3VarD2 = m1.d(l1VarG1111, fValueOf1111111113, Float.valueOf(f11), oVar1111.invoke(l1VarG1111.n(), lVarV, 0), p1VarE1111111113, "PrefixSuffixOpacity", lVarV, 196608);
            p2.m mVar1111 = p2.m.f100861c;
            dVar2 = (p2.d) l1VarG1111.p();
            lVarV.o(-107432127);
            if (p020r2.o.J()) {
                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[dVar2.ordinal()] == 1) {
                j14 = j13;
            } else {
                j14 = j12;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            cVarU = k3.p1.u(j14);
            zN = lVarV.n(cVarU);
            objI2 = lVarV.I();
            if (zN) {
                objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                lVarV.B(objI2);
            } else {
                objI2 = (p019p1.p1) Function1.a(companion).invoke(cVarU);
                lVarV.B(objI2);
            }
            p019p1.p1 p1Var1111112 = (p019p1.p1) objI2;
            dVar3 = (p2.d) l1VarG1111.i();
            lVarV.o(-107432127);
            if (p020r2.o.J()) {
                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[dVar3.ordinal()] == 1) {
                j15 = j13;
            } else {
                j15 = j12;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            k3.p1 p1VarL1111111 = k3.p1.l(j15);
            dVar4 = (p2.d) l1VarG1111.p();
            lVarV.o(-107432127);
            if (p020r2.o.J()) {
                p020r2.o.S(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[dVar4.ordinal()] == 1) {
                j12 = j13;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3VarD3 = m1.d(l1VarG1111, p1VarL1111111, k3.p1.l(j12), mVar1111.invoke(l1VarG1111.n(), lVarV, 0), p1Var1111112, "LabelTextStyleColor", lVarV, 196608);
            lVar2 = lVarV;
            p2.k kVar1111 = p2.k.f100859c;
            lVar2.o(1023351670);
            if (p020r2.o.J()) {
                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar2.l();
            cVarU2 = k3.p1.u(jG);
            zN2 = lVar2.n(cVarU2);
            objI3 = lVar2.I();
            if (zN2) {
                objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                lVar2.B(objI3);
            } else {
                objI3 = (p019p1.p1) Function1.a(companion).invoke(cVarU2);
                lVar2.B(objI3);
            }
            p019p1.p1 p1Var1111113 = (p019p1.p1) objI3;
            lVar2.o(1023351670);
            if (p020r2.o.J()) {
                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar2.l();
            k3.p1 p1VarL1111112 = k3.p1.l(jG);
            lVar2.o(1023351670);
            if (p020r2.o.J()) {
                p020r2.o.S(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar2.l();
            y3VarD4 = m1.d(l1VarG1111, p1VarL1111112, k3.p1.l(jG), kVar1111.invoke(r8.n(), lVar2, 0), p1Var1111113, "LabelContentColor", lVar2, 196608);
            fFloatValue = ((Number) y3VarD1115.getValue()).floatValue();
            lVar2.o(-156998101);
            if (pVar3 == null) {
                f17 = fFloatValue;
                textStyle = bodyLarge;
                textStyle2 = bodySmall;
                aVarE = null;
            } else {
                textStyle = bodyLarge;
                d dVar11111111111111111111111 = new d(textStyle, bodySmall, fFloatValue, y3VarD4, pVar3, z23, y3VarD3);
                textStyle2 = bodySmall;
                f17 = fFloatValue;
                aVarE = z2.c.e(-1236585568, true, dVar11111111111111111111111, lVar2, 54);
            }
            lVar2.l();
            long jI1111 = n0Var.i(z15, z16, zBooleanValue);
            objI4 = lVar2.I();
            companion2 = p020r2.l.INSTANCE;
            if (objI4 == companion2.a()) {
                objI4 = n3.d(n3.q(), new k(y3VarD));
                lVar2.B(objI4);
            }
            y3 y3Var1111112 = (y3) objI4;
            lVar2.o(-156965270);
            if (pVar16 == null) {
                textStyle3 = textStyle;
                pVar19 = pVar16;
                aVarE2 = null;
            } else {
                textStyle3 = textStyle;
                pVar19 = pVar16;
                aVarE2 = null;
            }
            lVar2.l();
            long j11111117 = n0Var.j(z15, z16, zBooleanValue);
            objI5 = lVar2.I();
            TextStyle textStyle1115 = textStyle3;
            if (objI5 == companion2.a()) {
                objI5 = n3.d(n3.q(), new l(y3VarD2));
                lVar2.B(objI5);
            }
            y3 y3Var1111113 = (y3) objI5;
            lVar2.o(-156940524);
            if (pVar14 == null) {
                y3Var = y3VarD2;
                pVar20 = pVar14;
                aVarE3 = null;
            } else {
                y3Var = y3VarD2;
                pVar20 = pVar14;
                aVarE3 = null;
            }
            lVar2.l();
            long jK1111 = n0Var.k(z15, z16, zBooleanValue);
            lVar2.o(-156921964);
            if (pVar15 == null) {
                pVar21 = pVar15;
                aVarE4 = null;
            } else {
                pVar21 = pVar15;
                aVarE4 = null;
            }
            lVar2.l();
            jH = n0Var.h(z15, z16, zBooleanValue);
            lVar2.o(-156902962);
            if (pVar12 == null) {
                aVarE5 = null;
            } else {
                aVarE5 = z2.c.e(-130107406, true, new e(jH, pVar12), lVar2, 54);
            }
            lVar2.l();
            jO = n0Var.o(z15, z16, zBooleanValue);
            lVar2.o(-156893937);
            if (pVar18 == null) {
                z24 = true;
                i53 = 54;
                aVarE6 = null;
            } else {
                z24 = true;
                i53 = 54;
                aVarE6 = z2.c.e(2079816678, true, new C2135j(jO, pVar18), lVar2, 54);
            }
            lVar2.l();
            jL = n0Var.l(z15, z16, zBooleanValue);
            lVar2.o(-156884470);
            if (pVar17 == null) {
                aVarE7 = null;
            } else {
                aVarE7 = z2.c.e(1263707005, z24, new i(jL, textStyle2, pVar17), lVar2, i53);
            }
            lVar2.l();
            i54 = p.f100852a[pVar.ordinal()];
            if (i54 == z24) {
                z25 = z14;
                lVar2.o(-568105095);
                p0.a(androidx.compose.ui.d.INSTANCE, pVar2, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, z2.c.e(1750327932, true, new c(pVar10), lVar2, 54), aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 9) & 896) | 6);
                lVar2.l();
                h0 h0Var1111111111 = h0.f84049a;
            } else if (i54 != 2) {
                lVar2.o(-565271199);
                lVar2.l();
                h0 h0Var1111111112 = h0.f84049a;
                z25 = z14;
            } else {
                lVar2.o(-567018607);
                objI6 = lVar2.I();
                if (objI6 == companion2.a()) {
                    objI6 = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
                    lVar2.B(objI6);
                }
                p1Var = (p1) objI6;
                z2.a aVarE1118 = z2.c.e(157291737, true, new b(p1Var, yVar, pVar10), lVar2, 54);
                androidx.compose.ui.d.Companion companion1113 = androidx.compose.ui.d.INSTANCE;
                zQ = lVar2.q(f17);
                objI7 = lVar2.I();
                if (zQ) {
                    objI7 = new a(f17, p1Var);
                    lVar2.B(objI7);
                } else {
                    objI7 = new a(f17, p1Var);
                    lVar2.B(objI7);
                }
                z25 = z14;
                w.b(companion1113, pVar2, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z25, f17, (wn0.l) objI7, aVarE1118, aVarE7, yVar, lVar2, ((i55 >> 3) & 112) | 6 | ((i45 << 21) & 234881024), ((i45 >> 6) & 7168) | 48);
                lVar2.l();
                h0 h0Var1111111113 = h0.f84049a;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            pVar22 = pVar20;
            pVar23 = pVar17;
            z26 = z15;
            pVar24 = pVar12;
            z27 = z16;
            z28 = z25;
            pVar25 = pVar18;
            pVar26 = pVar19;
            pVar27 = pVar21;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new m(pVar, str, pVar2, z0Var, pVar3, pVar26, pVar24, pVar25, pVar22, pVar27, pVar23, z28, z26, z27, jVar, yVar, n0Var, pVar10, i11, i12, i13));
        }
    }

    private static final boolean b(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    private static final boolean c(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(long j11, TextStyle textStyle, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        long j12;
        TextStyle textStyle2;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar2;
        p020r2.l lVarV = lVar.v(1208685580);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(textStyle) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(pVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            pVar2 = pVar;
            textStyle2 = textStyle;
            j12 = j11;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1208685580, i12, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            p2.f.a(j11, textStyle, pVar, lVarV, i12 & 1022);
            j12 = j11;
            textStyle2 = textStyle;
            pVar2 = pVar;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new n(j12, textStyle2, pVar2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(long j11, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(660142980);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(660142980, i12, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            p020r2.w.a(p016o2.m.a().d(k3.p1.l(j11)), pVar, lVarV, (i12 & 112) | h2.f106566i);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new o(j11, pVar, i11));
        }
    }

    public static final y3<BorderStroke> h(boolean z11, boolean z12, boolean z13, n0 n0Var, float f11, float f12, p020r2.l lVar, int i11) {
        y3<k3.p1> y3VarO;
        y3<w4.h> y3VarO2;
        p020r2.l lVar2 = lVar;
        if (p020r2.o.J()) {
            p020r2.o.S(2047013045, i11, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long jF = n0Var.f(z11, z12, z13);
        if (z11) {
            lVar2.o(1023053998);
            y3VarO = p015o1.u.a(jF, p019p1.j.l(150, 0, null, 6, null), null, null, lVar, 48, 12);
            lVar2 = lVar;
            lVar2.l();
        } else {
            lVar2.o(1023165505);
            y3VarO = n3.o(k3.p1.l(jF), lVar2, 0);
            lVar2.l();
        }
        y3<k3.p1> y3Var = y3VarO;
        if (z11) {
            lVar2.o(1023269417);
            y3VarO2 = p019p1.c.c(z13 ? f11 : f12, p019p1.j.l(150, 0, null, 6, null), null, null, lVar2, 48, 12);
            lVar2.l();
        } else {
            lVar2.o(1023478388);
            y3VarO2 = n3.o(w4.h.d(f12), lVar2, (i11 >> 15) & 14);
            lVar2.l();
        }
        y3<BorderStroke> y3VarO3 = n3.o(q1.h.a(y3VarO2.getValue().getValue(), y3Var.getValue().getValue()), lVar2, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return y3VarO3;
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, boolean z11, String str) {
        return z11 ? g4.o.d(dVar, false, new q(str), 1, null) : dVar;
    }

    public static final float j() {
        return f100780c;
    }

    public static final androidx.compose.ui.d k() {
        return f100786i;
    }

    public static final Object l(z3.q qVar) {
        Object parentData = qVar.getParentData();
        z3.y yVar = parentData instanceof z3.y ? (z3.y) parentData : null;
        if (yVar != null) {
            return yVar.getLayoutId();
        }
        return null;
    }

    public static final float m() {
        return f100784g;
    }

    public static final float n() {
        return f100785h;
    }

    public static final float o() {
        return f100783f;
    }

    public static final float p() {
        return f100782e;
    }

    public static final float q() {
        return f100781d;
    }

    public static final float r() {
        return f100779b;
    }

    public static final long s() {
        return f100778a;
    }

    public static final int t(w0 w0Var) {
        if (w0Var != null) {
            return w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
        }
        return 0;
    }

    public static final androidx.compose.ui.d u(androidx.compose.ui.d dVar, s1 s1Var, g4 g4Var) {
        return androidx.compose.ui.draw.b.c(dVar, new r(g4Var, s1Var));
    }

    public static final int v(w0 w0Var) {
        if (w0Var != null) {
            return w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
        }
        return 0;
    }
}
