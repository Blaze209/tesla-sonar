package f4;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Lf4/f;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "scrollBy", "<init>", "(ILwn0/p;)V", "delta", "Ljn0/h0;", "e", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()V", "min", "max", "f", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offset", "c", "(I)I", "g", "a", "I", "b", "Lwn0/p;", "<set-?>", Gender.FEMALE, "()F", "scrollAmount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int viewportSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<Float, Continuation<? super Float>, Object> scrollBy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scrollAmount;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m = "scrollBy", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f64330n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f64331o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f64333q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64331o = obj;
            this.f64333q |= Integer.MIN_VALUE;
            return f.this.e(BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(int i11, p<? super Float, ? super Continuation<? super Float>, ? extends Object> pVar) {
        this.viewportSize = i11;
        this.scrollBy = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(float f11, Continuation<? super h0> continuation) {
        a aVar;
        f fVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f64333q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f64333q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f64331o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f64333q;
        if (i12 == 0) {
            t.b(objInvoke);
            p<Float, Continuation<? super Float>, Object> pVar = this.scrollBy;
            Float fBoxFloat = Boxing.boxFloat(f11);
            aVar.f64330n = this;
            aVar.f64333q = 1;
            objInvoke = pVar.invoke(fBoxFloat, aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            fVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) aVar.f64330n;
            t.b(objInvoke);
        }
        fVar.scrollAmount += ((Number) objInvoke).floatValue();
        return h0.f84049a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int c(int offset) {
        return n.n(offset - yn0.a.d(this.scrollAmount), 0, this.viewportSize);
    }

    public final void d() {
        this.scrollAmount = BitmapDescriptorFactory.HUE_RED;
    }

    public final Object f(int i11, int i12, Continuation<? super h0> continuation) {
        if (i11 > i12) {
            throw new IllegalArgumentException(("Expected min=" + i11 + " ≤ max=" + i12).toString());
        }
        int i13 = i12 - i11;
        int i14 = this.viewportSize;
        if (i13 > i14) {
            throw new IllegalArgumentException(("Expected range (" + i13 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
        }
        float f11 = i11;
        float f12 = this.scrollAmount;
        if (f11 >= f12 && i12 <= i14 + f12) {
            return h0.f84049a;
        }
        if (f11 >= f12) {
            i11 = i12 - i14;
        }
        Object objG = g(i11, continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : h0.f84049a;
    }

    public final Object g(float f11, Continuation<? super h0> continuation) {
        Object objE = e(f11 - this.scrollAmount, continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }
}
