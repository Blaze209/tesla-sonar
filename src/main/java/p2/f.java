package p2;

import i4.TextStyle;
import jn0.h0;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p016o2.r0;
import p020r2.h2;
import p020r2.k2;
import p020r2.w;
import p020r2.w2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Lk3/p1;", "contentColor", "Li4/r0;", "textStyle", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(JLi4/r0;Lwn0/p;Lr2/l;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f100773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextStyle f100774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f100775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f100776f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j11, TextStyle textStyle, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f100773c = j11;
            this.f100774d = textStyle;
            this.f100775e = pVar;
            this.f100776f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.a(this.f100773c, this.f100774d, this.f100775e, lVar, k2.a(this.f100776f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(long j11, TextStyle textStyle, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-716124955);
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
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-716124955, i12, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            w.b(new h2[]{p016o2.m.a().d(p1.l(j11)), r0.c().d(((TextStyle) lVarV.U(r0.c())).K(textStyle))}, pVar, lVarV, ((i12 >> 3) & 112) | h2.f106566i);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(j11, textStyle, pVar, i11));
        }
    }
}
