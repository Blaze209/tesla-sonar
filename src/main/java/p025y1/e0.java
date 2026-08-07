package p025y1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.u;
import p021s1.b0;
import p021s1.m;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly1/e0;", "Ls1/m;", "Ls1/b0;", "originalFlingBehavior", "Ly1/c0;", "pagerState", "<init>", "(Ls1/b0;Ly1/c0;)V", "Ls1/u;", "", "initialVelocity", "a", "(Ls1/u;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls1/b0;", "getOriginalFlingBehavior", "()Ls1/b0;", "b", "Ly1/c0;", DateTokenConverter.CONVERTER_KEY, "()Ly1/c0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 originalFlingBehavior;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 pagerState;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", i = {}, l = {383}, m = "performFling", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f124523n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f124525p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f124523n = obj;
            this.f124525p |= Integer.MIN_VALUE;
            return e0.this.a(null, BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "remainingScrollOffset", "Ljn0/h0;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<Float, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p021s1.u f124527d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p021s1.u uVar) {
            super(1);
            this.f124527d = uVar;
        }

        public final void a(float f11) {
            e0.this.getPagerState().l0(this.f124527d, yn0.a.d(e0.this.getPagerState().H() != 0 ? f11 / e0.this.getPagerState().H() : BitmapDescriptorFactory.HUE_RED) + e0.this.getPagerState().v());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Float f11) {
            a(f11.floatValue());
            return h0.f84049a;
        }
    }

    public e0(b0 b0Var, c0 c0Var) {
        this.originalFlingBehavior = b0Var;
        this.pagerState = c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p021s1.m
    public Object a(p021s1.u uVar, float f11, Continuation<? super Float> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f124525p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f124525p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objB = aVar.f124523n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f124525p;
        if (i12 == 0) {
            t.b(objB);
            b0 b0Var = this.originalFlingBehavior;
            b bVar = new b(uVar);
            aVar.f124525p = 1;
            objB = b0Var.b(uVar, f11, bVar, aVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objB);
        }
        return Boxing.boxFloat(((Number) objB).floatValue());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c0 getPagerState() {
        return this.pagerState;
    }
}
