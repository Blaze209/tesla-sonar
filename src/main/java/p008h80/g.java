package p008h80;

import androidx.compose.foundation.layout.x;
import com.plaid.internal.EnumC4419g;
import e4.e;
import e4.f;
import g80.m;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import p009i2.e1;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p015o1.b;
import p020r2.Function0;
import p020r2.l;
import p020r2.o;
import w4.h;
import w80.d;
import wn0.p;
import wn0.r;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f71069a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static r<b, m, l, Integer, h0> f71070b = c.c(2125430138, false, a.f71071c);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo1/b;", "Lg80/m;", "processingState", "Ljn0/h0;", "a", "(Lo1/b;Lg80/m;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements r<b, m, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71071c = new a();

        /* JADX INFO: renamed from: h80.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetScreenKt$lambda-1$1$1", f = "PaymentSheetScreen.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class C1493a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f71072n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ m f71073o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1493a(m mVar, Continuation<? super C1493a> continuation) {
                super(2, continuation);
                this.f71073o = mVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C1493a(this.f71073o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f71072n;
                if (i11 == 0) {
                    t.b(obj);
                    this.f71072n = 1;
                    if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                ((m.a) this.f71073o).a().invoke();
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C1493a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        a() {
            super(4);
        }

        public final void a(b AnimatedContent, m mVar, l lVar, int i11) {
            s.k(AnimatedContent, "$this$AnimatedContent");
            if (o.J()) {
                o.S(2125430138, i11, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetScreenKt.lambda-1.<anonymous> (PaymentSheetScreen.kt:241)");
            }
            if (mVar instanceof m.c) {
                lVar.H(1403879241);
                d.a(x.m(androidx.compose.ui.d.INSTANCE, h.g(48)), j1.f74525a.a(lVar, j1.f74526b).i(), f.a(n70.t.f93464d, lVar, 0), 0L, 0, lVar, 6, 24);
                lVar.T();
            } else if (mVar instanceof m.a) {
                lVar.H(1404198479);
                Function0.g(mVar, new C1493a(mVar, null), lVar, ((i11 >> 3) & 14) | 64);
                e1.a(e.c(n70.u.f93487s, lVar, 0), null, x.m(androidx.compose.ui.d.INSTANCE, h.g(48)), j1.f74525a.a(lVar, j1.f74526b).i(), lVar, 440, 0);
                lVar.T();
            } else {
                if (mVar == null ? true : mVar instanceof m.Idle) {
                    lVar.H(2123524663);
                    lVar.T();
                } else {
                    lVar.H(1404768879);
                    lVar.T();
                }
            }
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ h0 invoke(b bVar, m mVar, l lVar, Integer num) {
            a(bVar, mVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final r<b, m, l, Integer, h0> a() {
        return f71070b;
    }
}
