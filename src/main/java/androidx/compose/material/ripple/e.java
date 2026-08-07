package androidx.compose.material.ripple;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.t;
import k3.o1;
import k3.p1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m3.f;
import n2.RippleAlpha;
import n2.l;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p019p1.m;
import u1.g;
import u1.h;
import u1.i;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/material/ripple/e;", "", "", "bounded", "Lkotlin/Function0;", "Ln2/d;", "rippleAlpha", "<init>", "(ZLwn0/a;)V", "Lu1/i;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Ljn0/h0;", "c", "(Lu1/i;Lkotlinx/coroutines/CoroutineScope;)V", "Lm3/f;", "", "radius", "Lk3/p1;", "color", "b", "(Lm3/f;FJ)V", "a", "Z", "Lwn0/a;", "Lp1/a;", "Lp1/m;", "Lp1/a;", "animatedAlpha", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "interactions", "e", "Lu1/i;", "currentInteraction", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p019p1.a<Float, m> animatedAlpha = p019p1.b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<i> interactions = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private i currentInteraction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", i = {}, l = {DownloaderService.STATUS_TOO_MANY_REDIRECTS}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5115n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ float f5117p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p019p1.i<Float> f5118q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, p019p1.i<Float> iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5117p = f11;
            this.f5118q = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new a(this.f5117p, this.f5118q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5115n;
            if (i11 == 0) {
                t.b(obj);
                p019p1.a aVar = e.this.animatedAlpha;
                Float fBoxFloat = Boxing.boxFloat(this.f5117p);
                p019p1.i<Float> iVar = this.f5118q;
                this.f5115n = 1;
                if (p019p1.a.f(aVar, fBoxFloat, iVar, null, null, this, 12, null) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", i = {}, l = {503}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5119n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p019p1.i<Float> f5121p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p019p1.i<Float> iVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5121p = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new b(this.f5121p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5119n;
            if (i11 == 0) {
                t.b(obj);
                p019p1.a aVar = e.this.animatedAlpha;
                Float fBoxFloat = Boxing.boxFloat(BitmapDescriptorFactory.HUE_RED);
                p019p1.i<Float> iVar = this.f5121p;
                this.f5119n = 1;
                if (p019p1.a.f(aVar, fBoxFloat, iVar, null, null, this, 12, null) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public e(boolean z11, wn0.a<RippleAlpha> aVar) {
        this.bounded = z11;
        this.rippleAlpha = aVar;
    }

    public final void b(f fVar, float f11, long j11) {
        long j12;
        float fFloatValue = this.animatedAlpha.m().floatValue();
        if (fFloatValue <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        long jP = p1.p(j11, fFloatValue, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        if (!this.bounded) {
            f.Z(fVar, jP, f11, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 124, null);
            return;
        }
        float fK = j3.m.k(fVar.b());
        float fI = j3.m.i(fVar.b());
        int iB = o1.INSTANCE.b();
        m3.d drawContext = fVar.getDrawContext();
        long jB = drawContext.b();
        drawContext.a().u();
        try {
            drawContext.getTransform().a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fK, fI, iB);
            j12 = jB;
            try {
                f.Z(fVar, jP, f11, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 124, null);
                drawContext.a().o();
                drawContext.f(j12);
            } catch (Throwable th2) {
                th = th2;
                drawContext.a().o();
                drawContext.f(j12);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j12 = jB;
        }
    }

    public final void c(i interaction, CoroutineScope scope) {
        float draggedAlpha;
        boolean z11 = interaction instanceof g;
        if (z11) {
            this.interactions.add(interaction);
        } else if (interaction instanceof h) {
            this.interactions.remove(((h) interaction).getEnter());
        } else if (interaction instanceof u1.d) {
            this.interactions.add(interaction);
        } else if (interaction instanceof u1.e) {
            this.interactions.remove(((u1.e) interaction).getFocus());
        } else if (interaction instanceof u1.b) {
            this.interactions.add(interaction);
        } else if (interaction instanceof u1.c) {
            this.interactions.remove(((u1.c) interaction).getStart());
        } else if (!(interaction instanceof u1.a)) {
            return;
        } else {
            this.interactions.remove(((u1.a) interaction).getStart());
        }
        i iVar = (i) v.C0(this.interactions);
        if (s.f(this.currentInteraction, iVar)) {
            return;
        }
        if (iVar != null) {
            RippleAlpha rippleAlphaInvoke = this.rippleAlpha.invoke();
            if (z11) {
                draggedAlpha = rippleAlphaInvoke.getHoveredAlpha();
            } else if (interaction instanceof u1.d) {
                draggedAlpha = rippleAlphaInvoke.getFocusedAlpha();
            } else {
                draggedAlpha = interaction instanceof u1.b ? rippleAlphaInvoke.getDraggedAlpha() : BitmapDescriptorFactory.HUE_RED;
            }
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(draggedAlpha, l.d(iVar), null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(l.e(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = iVar;
    }
}
