package androidx.compose.material.ripple;

import androidx.collection.k0;
import b4.s;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import jn0.h0;
import jn0.t;
import k3.p1;
import k3.s1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m3.f;
import n2.RippleAlpha;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import u1.j;
import u1.n;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material/ripple/c;", "Landroidx/compose/material/ripple/RippleNode;", "Lu1/j;", "interactionSource", "", "bounded", "Lw4/h;", "radius", "Lk3/s1;", "color", "Lkotlin/Function0;", "Ln2/d;", "rippleAlpha", "<init>", "(Lu1/j;ZFLk3/s1;Lwn0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lu1/n$b;", "interaction", "Lj3/m;", "size", "", "targetRadius", "Ljn0/h0;", "C2", "(Lu1/n$b;JF)V", "J2", "(Lu1/n$b;)V", "Lm3/f;", "D2", "(Lm3/f;)V", "i2", "()V", "Landroidx/collection/k0;", "Ln2/e;", "x", "Landroidx/collection/k0;", "ripples", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends RippleNode {

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k0<n.b, n2.e> ripples;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5103n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ n2.e f5104o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c f5105p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n.b f5106q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n2.e eVar, c cVar, n.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5104o = eVar;
            this.f5105p = cVar;
            this.f5106q = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f5104o, this.f5105p, this.f5106q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5103n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    n2.e eVar = this.f5104o;
                    this.f5103n = 1;
                    if (eVar.d(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                this.f5105p.ripples.p(this.f5106q);
                s.a(this.f5105p);
                return h0.f84049a;
            } catch (Throwable th2) {
                this.f5105p.ripples.p(this.f5106q);
                s.a(this.f5105p);
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ c(j jVar, boolean z11, float f11, s1 s1Var, wn0.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z11, f11, s1Var, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004e A[LOOP:0: B:5:0x0013->B:15:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[EDGE_INSN: B:23:0x0051->B:16:0x0051 BREAK  A[LOOP:0: B:5:0x0013->B:15:0x004e], SYNTHETIC] */
    @Override // androidx.compose.material.ripple.RippleNode
    public void C2(n.b interaction, long size, float targetRadius) {
        k0<n.b, n2.e> k0Var = this.ripples;
        Object[] objArr = k0Var.keys;
        Object[] objArr2 = k0Var.values;
        long[] jArr = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            ((n2.e) objArr2[i14]).h();
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        n2.e eVar = new n2.e(getBounded() ? g.d(interaction.getPressPosition()) : null, targetRadius, getBounded(), null);
        this.ripples.s(interaction, eVar);
        BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new a(eVar, this, interaction, null), 3, null);
        s.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void D2(f fVar) {
        float f11;
        int i11;
        int i12;
        float pressedAlpha = F2().invoke().getPressedAlpha();
        if (pressedAlpha == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        k0<n.b, n2.e> k0Var = this.ripples;
        Object[] objArr = k0Var.keys;
        Object[] objArr2 = k0Var.values;
        long[] jArr = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j11 = jArr[i13];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                long j12 = j11;
                int i16 = 0;
                while (i16 < i15) {
                    if ((j12 & 255) < 128) {
                        int i17 = (i13 << 3) + i16;
                        i11 = i16;
                        i12 = i15;
                        ((n2.e) objArr2[i17]).e(fVar, p1.p(G2(), pressedAlpha, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    j12 >>= i14;
                    i16 = i11 + 1;
                    pressedAlpha = pressedAlpha;
                    i15 = i12;
                    i14 = i14;
                }
                int i18 = i15;
                f11 = pressedAlpha;
                if (i18 != i14) {
                    return;
                }
            } else {
                f11 = pressedAlpha;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            pressedAlpha = f11;
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void J2(n.b interaction) {
        n2.e eVarC = this.ripples.c(interaction);
        if (eVarC != null) {
            eVarC.h();
        }
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        this.ripples.i();
    }

    private c(j jVar, boolean z11, float f11, s1 s1Var, wn0.a<RippleAlpha> aVar) {
        super(jVar, z11, f11, s1Var, aVar, null);
        this.ripples = new k0<>(0, 1, null);
    }
}
