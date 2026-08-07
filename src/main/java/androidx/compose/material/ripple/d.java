package androidx.compose.material.ripple;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.CoroutineScope;
import m3.f;
import n2.RippleAlpha;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.y3;
import q1.d0;
import u1.i;
import u1.n;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u001a\u001a\u00020\r*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/material/ripple/d;", "Lq1/d0;", "", "bounded", "Lr2/y3;", "Ln2/d;", "rippleAlpha", "<init>", "(ZLr2/y3;)V", "Lu1/n$b;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Ljn0/h0;", "b", "(Lu1/n$b;Lkotlinx/coroutines/CoroutineScope;)V", DateTokenConverter.CONVERTER_KEY, "(Lu1/n$b;)V", "Lu1/i;", "e", "(Lu1/i;Lkotlinx/coroutines/CoroutineScope;)V", "Lm3/f;", "Lw4/h;", "radius", "Lk3/p1;", "color", "c", "(Lm3/f;FJ)V", "a", "Z", "Landroidx/compose/material/ripple/e;", "Landroidx/compose/material/ripple/e;", "stateLayer", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e stateLayer;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln2/d;", "b", "()Ln2/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<RippleAlpha> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<RippleAlpha> f5109c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y3<RippleAlpha> y3Var) {
            super(0);
            this.f5109c = y3Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RippleAlpha invoke() {
            return this.f5109c.getValue();
        }
    }

    public d(boolean z11, y3<RippleAlpha> y3Var) {
        this.bounded = z11;
        this.stateLayer = new e(z11, new a(y3Var));
    }

    public abstract void b(n.b interaction, CoroutineScope scope);

    public final void c(f fVar, float f11, long j11) {
        this.stateLayer.b(fVar, Float.isNaN(f11) ? n2.f.a(fVar, this.bounded, fVar.b()) : fVar.O1(f11), j11);
    }

    public abstract void d(n.b interaction);

    public final void e(i interaction, CoroutineScope scope) {
        this.stateLayer.c(interaction, scope);
    }
}
