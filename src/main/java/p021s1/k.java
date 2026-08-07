package p021s1;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.d;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import u1.l;
import w4.y;
import w4.z;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a¥\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052*\b\u0002\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n2*\b\u0002\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u0011*\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u0016\u0010\u001a\u001a\u00020\u0018*\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"6\u0010\u001e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"6\u0010 \u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/d;", "Ls1/l;", "state", "Ls1/p;", "orientation", "", "enabled", "Lu1/l;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lj3/g;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "f", "(Landroidx/compose/ui/d;Ls1/l;Ls1/p;ZLu1/l;ZLwn0/q;Lwn0/q;Z)Landroidx/compose/ui/d;", "h", "(JLs1/p;)F", "Lw4/y;", IntegerTokenConverter.CONVERTER_KEY, "j", "(J)J", "a", "Lwn0/q;", "NoOpOnDragStarted", "b", "NoOpOnDragStopped", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q<CoroutineScope, g, Continuation<? super h0>, Object> f109583a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q<CoroutineScope, Float, Continuation<? super h0>, Object> f109584b = new b(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lj3/g;", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;Lj3/g;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements q<CoroutineScope, g, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109585n;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(CoroutineScope coroutineScope, long j11, Continuation<? super h0> continuation) {
            return new a(continuation).invokeSuspend(h0.f84049a);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, g gVar, Continuation<? super h0> continuation) {
            return a(coroutineScope, gVar.getPackedValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f109585n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;F)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements q<CoroutineScope, Float, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109586n;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        public final Object a(CoroutineScope coroutineScope, float f11, Continuation<? super h0> continuation) {
            return new b(continuation).invokeSuspend(h0.f84049a);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f11, Continuation<? super h0> continuation) {
            return a(coroutineScope, f11.floatValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f109586n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return h0.f84049a;
        }
    }

    public static final d f(d dVar, l lVar, p pVar, boolean z11, l lVar2, boolean z12, q<? super CoroutineScope, ? super g, ? super Continuation<? super h0>, ? extends Object> qVar, q<? super CoroutineScope, ? super Float, ? super Continuation<? super h0>, ? extends Object> qVar2, boolean z13) {
        return dVar.g(new DraggableElement(lVar, pVar, z11, lVar2, z12, qVar, qVar2, z13));
    }

    public static /* synthetic */ d g(d dVar, l lVar, p pVar, boolean z11, l lVar2, boolean z12, q qVar, q qVar2, boolean z13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z14 = z11;
        if ((i11 & 8) != 0) {
            lVar2 = null;
        }
        return f(dVar, lVar, pVar, z14, lVar2, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? f109583a : qVar, (i11 & 64) != 0 ? f109584b : qVar2, (i11 & 128) != 0 ? false : z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(long j11, p pVar) {
        return pVar == p.Vertical ? g.n(j11) : g.m(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(long j11, p pVar) {
        return pVar == p.Vertical ? y.i(j11) : y.h(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j11) {
        boolean zIsNaN = Float.isNaN(y.h(j11));
        float fI = BitmapDescriptorFactory.HUE_RED;
        float fH = zIsNaN ? 0.0f : y.h(j11);
        if (!Float.isNaN(y.i(j11))) {
            fI = y.i(j11);
        }
        return z.a(fH, fI);
    }
}
