package p025y1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.b;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p021s1.p;
import p024x1.f0;
import w4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly1/c0;", "state", "", "isVertical", "Lx1/f0;", "a", "(Ly1/c0;Z)Lx1/f0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"y1/d$a", "Lx1/f0;", "", "index", "Ljn0/h0;", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg4/b;", "e", "()Lg4/b;", "", "c", "()F", "scrollOffset", DateTokenConverter.CONVERTER_KEY, "maxScrollOffset", "f", "()I", "viewport", "a", "contentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f124485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f124486b;

        a(c0 c0Var, boolean z11) {
            this.f124485a = c0Var;
            this.f124486b = z11;
        }

        @Override // p024x1.f0
        public int a() {
            return this.f124485a.C().f() + this.f124485a.C().getAfterContentPadding();
        }

        @Override // p024x1.f0
        public Object b(int i11, Continuation<? super h0> continuation) {
            Object objA0 = c0.a0(this.f124485a, i11, BitmapDescriptorFactory.HUE_RED, continuation, 2, null);
            return objA0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA0 : h0.f84049a;
        }

        @Override // p024x1.f0
        public float c() {
            return y.a(this.f124485a);
        }

        @Override // p024x1.f0
        public float d() {
            return d0.g(this.f124485a.C(), this.f124485a.F());
        }

        @Override // p024x1.f0
        public b e() {
            return this.f124486b ? new b(this.f124485a.F(), 1) : new b(1, this.f124485a.F());
        }

        @Override // p024x1.f0
        public int f() {
            return this.f124485a.C().getOrientation() == p.Vertical ? r.f(this.f124485a.C().a()) : r.g(this.f124485a.C().a());
        }
    }

    public static final f0 a(c0 c0Var, boolean z11) {
        return new a(c0Var, z11);
    }
}
