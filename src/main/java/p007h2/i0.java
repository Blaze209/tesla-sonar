package p007h2;

import bo0.n;
import i4.TextLayoutResult;
import i4.p0;
import j3.g;
import j3.h;
import jn0.h0;
import jn0.t;
import kotlin.b0;
import kotlin.c1;
import kotlin.e0;
import kotlin.l0;
import kotlin.m;
import kotlin.n0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import t4.i;
import v3.f0;
import v3.o0;
import w4.r;
import wn0.p;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"", "isStartHandle", "Lt4/i;", "direction", "Lh2/h0;", "manager", "Ljn0/h0;", "a", "(ZLt4/i;Lh2/h0;Lr2/l;I)V", "c", "(Lh2/h0;Z)Z", "Lw4/r;", "magnifierSize", "Lj3/g;", "b", "(Lh2/h0;J)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj3/g;", "<anonymous>", "()Lj3/g;"}, k = 3, mv = {1, 8, 0})
    static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f70303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f70304b;

        a(h0 h0Var, boolean z11) {
            this.f70303a = h0Var;
            this.f70304b = z11;
        }

        @Override // p007h2.j
        public final long a() {
            return this.f70303a.G(this.f70304b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1", f = "TextFieldSelectionManager.kt", i = {}, l = {1012}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70305n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f70306o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ n0 f70307p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0 n0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f70307p = n0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f70307p, continuation);
            bVar.f70306o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70305n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f70306o;
                n0 n0Var = this.f70307p;
                this.f70305n = 1;
                if (e0.c(f0Var, n0Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
            return ((b) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f70308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f70309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0 f70310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f70311f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, i iVar, h0 h0Var, int i11) {
            super(2);
            this.f70308c = z11;
            this.f70309d = iVar;
            this.f70310e = h0Var;
            this.f70311f = i11;
        }

        public final void a(l lVar, int i11) {
            i0.a(this.f70308c, this.f70309d, this.f70310e, lVar, k2.a(this.f70311f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70312a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70312a = iArr;
        }
    }

    public static final void a(boolean z11, i iVar, h0 h0Var, l lVar, int i11) {
        int i12;
        boolean z12;
        i iVar2;
        l lVarV = lVar.v(-1344558920);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(iVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(h0Var) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            z12 = z11;
            iVar2 = iVar;
        } else {
            if (o.J()) {
                o.S(-1344558920, i12, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            int i13 = i12 & 14;
            boolean zN = (i13 == 4) | lVarV.n(h0Var);
            Object objI = lVarV.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = h0Var.Q(z11);
                lVarV.B(objI);
            }
            n0 n0Var = (n0) objI;
            boolean zK = lVarV.K(h0Var) | (i13 == 4);
            Object objI2 = lVarV.I();
            if (zK || objI2 == l.INSTANCE.a()) {
                objI2 = new a(h0Var, z11);
                lVarV.B(objI2);
            }
            j jVar = (j) objI2;
            boolean zM = p0.m(h0Var.O().getSelection());
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            boolean zK2 = lVarV.K(n0Var);
            Object objI3 = lVarV.I();
            if (zK2 || objI3 == l.INSTANCE.a()) {
                objI3 = new b(n0Var, null);
                lVarV.B(objI3);
            }
            z12 = z11;
            iVar2 = iVar;
            p007h2.a.b(jVar, z12, iVar2, zM, 0L, o0.d(companion, n0Var, (p) objI3), lVarV, (i12 << 3) & 1008, 16);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(z12, iVar2, h0Var, i11));
        }
    }

    public static final long b(h0 h0Var, long j11) {
        int iN;
        c1 c1VarJ;
        l0 textDelegate;
        i4.d text;
        g gVarA = h0Var.A();
        if (gVarA == null) {
            return g.INSTANCE.b();
        }
        long packedValue = gVarA.getPackedValue();
        i4.d dVarN = h0Var.N();
        if (dVarN == null || dVarN.length() == 0) {
            return g.INSTANCE.b();
        }
        m mVarC = h0Var.C();
        int i11 = mVarC == null ? -1 : d.f70312a[mVarC.ordinal()];
        if (i11 == -1) {
            return g.INSTANCE.b();
        }
        if (i11 == 1 || i11 == 2) {
            iN = p0.n(h0Var.O().getSelection());
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iN = p0.i(h0Var.O().getSelection());
        }
        b0 state = h0Var.getState();
        if (state == null || (c1VarJ = state.j()) == null) {
            return g.INSTANCE.b();
        }
        b0 state2 = h0Var.getState();
        if (state2 == null || (textDelegate = state2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return g.INSTANCE.b();
        }
        int iN2 = n.n(h0Var.getOffsetMapping().originalToTransformed(iN), 0, text.length());
        float fM = g.m(c1VarJ.j(packedValue));
        TextLayoutResult value = c1VarJ.getValue();
        int iQ = value.q(iN2);
        float fS = value.s(iQ);
        float fT = value.t(iQ);
        float fM2 = n.m(fM, Math.min(fS, fT), Math.max(fS, fT));
        if (!r.e(j11, r.INSTANCE.a()) && Math.abs(fM - fM2) > r.g(j11) / 2) {
            return g.INSTANCE.b();
        }
        float fV = value.v(iQ);
        return h.a(fM2, ((value.m(iQ) - fV) / 2) + fV);
    }

    public static final boolean c(h0 h0Var, boolean z11) {
        v vVarI;
        j3.i iVarB;
        b0 state = h0Var.getState();
        if (state == null || (vVarI = state.i()) == null || (iVarB = b0.b(vVarI)) == null) {
            return false;
        }
        return b0.a(iVarB, h0Var.G(z11));
    }
}
