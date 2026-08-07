package w1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p024x1.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw1/a0;", "state", "", "isVertical", "Lx1/f0;", "a", "(Lw1/a0;Z)Lx1/f0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"w1/d$a", "Lx1/f0;", "", "index", "Ljn0/h0;", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg4/b;", "e", "()Lg4/b;", "", "c", "()F", "scrollOffset", DateTokenConverter.CONVERTER_KEY, "maxScrollOffset", "f", "()I", "viewport", "a", "contentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f120341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f120342b;

        a(a0 a0Var, boolean z11) {
            this.f120341a = a0Var;
            this.f120342b = z11;
        }

        @Override // p024x1.f0
        public int a() {
            return this.f120341a.x().f() + this.f120341a.x().getAfterContentPadding();
        }

        @Override // p024x1.f0
        public Object b(int i11, Continuation<? super h0> continuation) {
            Object objL = a0.L(this.f120341a, i11, 0, continuation, 2, null);
            return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : h0.f84049a;
        }

        @Override // p024x1.f0
        public float c() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f120341a.s(), this.f120341a.t());
        }

        @Override // p024x1.f0
        public float d() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f120341a.s(), this.f120341a.t(), this.f120341a.c());
        }

        @Override // p024x1.f0
        public g4.b e() {
            return this.f120342b ? new g4.b(-1, 1) : new g4.b(1, -1);
        }

        @Override // p024x1.f0
        public int f() {
            return this.f120341a.x().getOrientation() == p021s1.p.Vertical ? w4.r.f(this.f120341a.x().a()) : w4.r.g(this.f120341a.x().a());
        }
    }

    public static final f0 a(a0 a0Var, boolean z11) {
        return new a(a0Var, z11);
    }
}
