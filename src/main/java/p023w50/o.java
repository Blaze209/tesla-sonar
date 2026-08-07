package p023w50;

import android.os.Bundle;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.e0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4670d1;
import p009i2.C4671g;
import p009i2.v2;
import p011ja.n;
import p011ja.r;
import p011ja.w;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.a0;
import p020r2.d4;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import p020r2.y3;
import q1.b0;
import q50.TopAppBarState;
import v1.g0;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aU\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\f*\u00020!H\u0003¢\u0006\u0004\b\"\u0010#\"\u0014\u0010%\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$\"\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$\"\u0014\u0010'\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$\"\u0014\u0010(\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$¨\u0006*²\u0006\f\u0010)\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lq50/b;", "state", "Lkotlin/Function0;", "Ljn0/h0;", "onCloseClick", "c", "(Lq50/b;Lwn0/a;Lr2/l;I)V", "", "hideStripeLogo", "testMode", "Ly50/h;", "theme", "Lr2/y3;", "Lw4/h;", "elevation", "allowBackNavigation", "Landroidx/compose/ui/d;", "modifier", DateTokenConverter.CONVERTER_KEY, "(ZZLy50/h;Lr2/y3;ZLwn0/a;Landroidx/compose/ui/d;Lr2/l;II)V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lz50/j;", "keyboardController", "Landroidx/activity/OnBackPressedDispatcher;", "localBackPressed", "a", "(Lkotlinx/coroutines/CoroutineScope;Lz50/j;Landroidx/activity/OnBackPressedDispatcher;Lr2/l;I)V", "b", "(Lkotlinx/coroutines/CoroutineScope;Lz50/j;Lwn0/a;Lr2/l;I)V", "testmode", "f", "(ZZLy50/h;Lr2/l;I)V", "Lja/w;", "k", "(Lja/w;Lr2/l;I)Lr2/y3;", Gender.FEMALE, "LOGO_WIDTH", "LOGO_HEIGHT", "PILL_HORIZONTAL_PADDING", "PILL_VERTICAL_PADDING", "canShowBackIcon", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f121009a = w4.h.g(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f121010b = w4.h.g(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f121011c = w4.h.g(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f121012d = w4.h.g(2);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f121013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z50.j f121014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f121015e;

        /* JADX INFO: renamed from: w50.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.ui.components.TopAppBarKt$BackButton$1$1", f = "TopAppBar.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        static final class C2590a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f121016n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ z50.j f121017o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ OnBackPressedDispatcher f121018p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2590a(z50.j jVar, OnBackPressedDispatcher onBackPressedDispatcher, Continuation<? super C2590a> continuation) {
                super(2, continuation);
                this.f121017o = jVar;
                this.f121018p = onBackPressedDispatcher;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2590a(this.f121017o, this.f121018p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f121016n;
                if (i11 == 0) {
                    t.b(obj);
                    z50.j jVar = this.f121017o;
                    this.f121016n = 1;
                    if (jVar.c(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                OnBackPressedDispatcher onBackPressedDispatcher = this.f121018p;
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.m();
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C2590a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineScope coroutineScope, z50.j jVar, OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f121013c = coroutineScope;
            this.f121014d = jVar;
            this.f121015e = onBackPressedDispatcher;
        }

        public final void b() {
            BuildersKt__Builders_commonKt.launch$default(this.f121013c, null, null, new C2590a(this.f121014d, this.f121015e, null), 3, null);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f121019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z50.j f121020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f121021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f121022f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CoroutineScope coroutineScope, z50.j jVar, OnBackPressedDispatcher onBackPressedDispatcher, int i11) {
            super(2);
            this.f121019c = coroutineScope;
            this.f121020d = jVar;
            this.f121021e = onBackPressedDispatcher;
            this.f121022f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            o.a(this.f121019c, this.f121020d, this.f121021e, lVar, k2.a(this.f121022f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f121023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z50.j f121024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f121025e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.ui.components.TopAppBarKt$CloseButton$1$1", f = "TopAppBar.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f121026n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ z50.j f121027o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f121028p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z50.j jVar, wn0.a<h0> aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f121027o = jVar;
                this.f121028p = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f121027o, this.f121028p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f121026n;
                if (i11 == 0) {
                    t.b(obj);
                    z50.j jVar = this.f121027o;
                    this.f121026n = 1;
                    if (jVar.c(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                this.f121028p.invoke();
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CoroutineScope coroutineScope, z50.j jVar, wn0.a<h0> aVar) {
            super(0);
            this.f121023c = coroutineScope;
            this.f121024d = jVar;
            this.f121025e = aVar;
        }

        public final void b() {
            BuildersKt__Builders_commonKt.launch$default(this.f121023c, null, null, new a(this.f121024d, this.f121025e, null), 3, null);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f121029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z50.j f121030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f121031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f121032f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CoroutineScope coroutineScope, z50.j jVar, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f121029c = coroutineScope;
            this.f121030d = jVar;
            this.f121031e = aVar;
            this.f121032f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            o.b(this.f121029c, this.f121030d, this.f121031e, lVar, k2.a(this.f121032f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TopAppBarState f121033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f121034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f121035e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(TopAppBarState topAppBarState, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f121033c = topAppBarState;
            this.f121034d = aVar;
            this.f121035e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            o.c(this.f121033c, this.f121034d, lVar, k2.a(this.f121035e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f121036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z50.j f121037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f121038e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CoroutineScope coroutineScope, z50.j jVar, OnBackPressedDispatcher onBackPressedDispatcher) {
            super(2);
            this.f121036c = coroutineScope;
            this.f121037d = jVar;
            this.f121038e = onBackPressedDispatcher;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1218887284, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:108)");
            }
            o.a(this.f121036c, this.f121037d, this.f121038e, lVar, 520);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.l<androidx.compose.ui.graphics.c, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<w4.h> f121039c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(y3<w4.h> y3Var) {
            super(1);
            this.f121039c = y3Var;
        }

        public final void a(androidx.compose.ui.graphics.c graphicsLayer) {
            s.k(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.v(graphicsLayer.O1(this.f121039c.getValue().getValue()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f121040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f121041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p026y50.h f121042e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z11, boolean z12, p026y50.h hVar) {
            super(2);
            this.f121040c = z11;
            this.f121041d = z12;
            this.f121042e = hVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-894934244, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:99)");
            }
            o.f(this.f121040c, this.f121041d, this.f121042e, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements q<g0, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f121043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z50.j f121044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f121045e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(CoroutineScope coroutineScope, z50.j jVar, wn0.a<h0> aVar) {
            super(3);
            this.f121043c = coroutineScope;
            this.f121044d = jVar;
            this.f121045e = aVar;
        }

        public final void a(g0 TopAppBar, p020r2.l lVar, int i11) {
            s.k(TopAppBar, "$this$TopAppBar");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(802859473, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:118)");
            }
            o.b(this.f121043c, this.f121044d, this.f121045e, lVar, 8);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f121046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f121047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p026y50.h f121048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y3<w4.h> f121049f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f121050g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f121051h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f121052i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f121053j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f121054k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z11, boolean z12, p026y50.h hVar, y3<w4.h> y3Var, boolean z13, wn0.a<h0> aVar, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f121046c = z11;
            this.f121047d = z12;
            this.f121048e = hVar;
            this.f121049f = y3Var;
            this.f121050g = z13;
            this.f121051h = aVar;
            this.f121052i = dVar;
            this.f121053j = i11;
            this.f121054k = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            o.d(this.f121046c, this.f121047d, this.f121048e, this.f121049f, this.f121050g, this.f121051h, this.f121052i, lVar, k2.a(this.f121053j | 1), this.f121054k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements wn0.l<m3.f, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f121055c = new k();

        k() {
            super(1);
        }

        public final void a(m3.f drawBehind) {
            s.k(drawBehind, "$this$drawBehind");
            m3.f.D1(drawBehind, p026y50.a.a(), 0L, 0L, j3.b.b(8.0f, BitmapDescriptorFactory.HUE_RED, 2, null), null, BitmapDescriptorFactory.HUE_RED, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f121056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f121057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p026y50.h f121058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f121059f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z11, boolean z12, p026y50.h hVar, int i11) {
            super(2);
            this.f121056c = z11;
            this.f121057d = z12;
            this.f121058e = hVar;
            this.f121059f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            o.f(this.f121056c, this.f121057d, this.f121058e, lVar, k2.a(this.f121059f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "b", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 9, 0})
    static final class m extends u implements wn0.l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f121060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f121061d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"w50/o$m$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f121062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n.c f121063b;

            public a(w wVar, n.c cVar) {
                this.f121062a = wVar;
                this.f121063b = cVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f121062a.k0(this.f121063b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(w wVar, p1<Boolean> p1Var) {
            super(1);
            this.f121060c = wVar;
            this.f121061d = p1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(p1 canShowBackIcon, n controller, r destination, Bundle bundle) {
            s.k(canShowBackIcon, "$canShowBackIcon");
            s.k(controller, "controller");
            s.k(destination, "destination");
            if (s.f(destination.getNavigatorName(), p50.b.class.getSimpleName())) {
                return;
            }
            canShowBackIcon.setValue(Boolean.valueOf(controller.K() != null));
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 DisposableEffect) {
            s.k(DisposableEffect, "$this$DisposableEffect");
            final p1<Boolean> p1Var = this.f121061d;
            n.c cVar = new n.c() { // from class: w50.p
                @Override // ja.n.c
                public final void a(n nVar, r rVar, Bundle bundle) {
                    o.m.c(p1Var, nVar, rVar, bundle);
                }
            };
            this.f121060c.r(cVar);
            return new a(this.f121060c, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CoroutineScope coroutineScope, z50.j jVar, OnBackPressedDispatcher onBackPressedDispatcher, p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(-1797009785);
        if (p020r2.o.J()) {
            p020r2.o.S(-1797009785, i11, -1, "com.stripe.android.financialconnections.ui.components.BackButton (TopAppBar.kt:138)");
        }
        C4670d1.a(new a(coroutineScope, jVar, onBackPressedDispatcher), null, false, null, p023w50.c.f120900a.a(), lVarV, 24576, 14);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(coroutineScope, jVar, onBackPressedDispatcher, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CoroutineScope coroutineScope, z50.j jVar, wn0.a<h0> aVar, p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(771534685);
        if (p020r2.o.J()) {
            p020r2.o.S(771534685, i11, -1, "com.stripe.android.financialconnections.ui.components.CloseButton (TopAppBar.kt:163)");
        }
        C4670d1.a(new c(coroutineScope, jVar, aVar), null, false, null, p023w50.c.f120900a.b(), lVarV, 24576, 14);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(coroutineScope, jVar, aVar, i11));
        }
    }

    public static final void c(TopAppBarState state, wn0.a<h0> onCloseClick, p020r2.l lVar, int i11) {
        s.k(state, "state");
        s.k(onCloseClick, "onCloseClick");
        p020r2.l lVarV = lVar.v(-1366845633);
        if (p020r2.o.J()) {
            p020r2.o.S(-1366845633, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:62)");
        }
        d(state.getHideStripeLogo() || state.getForceHideStripeLogo(), state.getIsTestMode(), state.getTheme(), p019p1.c.c(state.i() ? p009i2.f.f74335a.b() : w4.h.g(0), null, "TopAppBarElevation", null, lVarV, KyberEngine.KyberPolyBytes, 10), state.getAllowBackNavigation(), onCloseClick, null, lVarV, (i11 << 12) & 458752, 64);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(state, onCloseClick, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x017e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0180  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187  */
    /* JADX WARN: Code duplicated, block: B:106:0x018d  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0129  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x015e  */
    public static final void d(boolean z11, boolean z12, p026y50.h hVar, y3<w4.h> y3Var, boolean z13, wn0.a<h0> aVar, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        androidx.compose.ui.d dVar2;
        int i16;
        androidx.compose.ui.d dVar3;
        e0 e0VarA;
        OnBackPressedDispatcher onBackPressedDispatcher;
        y3<Boolean> y3VarK;
        Object objI;
        p020r2.l.Companion companion;
        z2.a aVarB;
        boolean z14;
        Object objI2;
        p020r2.l lVar2;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(1272084064);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.p(z12) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            i13 |= lVarV.n(hVar) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= lVarV.n(y3Var) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            i13 |= lVarV.p(z13) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i12 & 32) == 0) {
            if ((458752 & i11) == 0) {
                i14 = lVarV.K(aVar) ? 131072 : 65536;
            }
            i15 = i12 & 64;
            if (i15 != 0) {
                if ((3670016 & i11) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i16 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i16 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i16;
                }
                if ((2995931 & i13) == 599186 || !lVarV.b()) {
                    if (i15 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1272084064, i13, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:87)");
                    }
                    e0VarA = f.g.f63718a.a(lVarV, f.g.f63720c);
                    if (e0VarA != null) {
                        onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
                    } else {
                        onBackPressedDispatcher = null;
                    }
                    y3VarK = k((w) lVarV.U(v50.b.e()), lVarV, 8);
                    z50.j jVarB = z50.l.b(lVarV, 0);
                    lVarV.H(773894976);
                    lVarV.H(-492369756);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    CoroutineScope coroutineScope = ((a0) objI).getCoroutineScope();
                    lVarV.T();
                    float fG = w4.h.g(0);
                    if (e(y3VarK) || !z13) {
                        aVarB = null;
                    } else {
                        aVarB = z2.c.b(lVarV, 1218887284, true, new f(coroutineScope, jVarB, onBackPressedDispatcher));
                    }
                    p026y50.d dVar5 = p026y50.d.f125064a;
                    long textWhite = dVar5.a(lVarV, 6).getTextWhite();
                    long textBrand = dVar5.a(lVarV, 6).getTextBrand();
                    lVarV.H(-697750418);
                    if ((i13 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI2 = lVarV.I();
                    if (z14 || objI2 == companion.a()) {
                        objI2 = new g(y3Var);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    androidx.compose.ui.d dVar6 = dVar3;
                    lVar2 = lVarV;
                    C4671g.d(z2.c.b(lVarV, -894934244, true, new h(z11, z12, hVar)), androidx.compose.ui.graphics.b.a(dVar3, (wn0.l) objI2), aVarB, z2.c.b(lVarV, 802859473, true, new i(coroutineScope, jVarB, aVar)), textWhite, textBrand, fG, lVar2, 1575942, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar6;
                } else {
                    lVarV.j();
                    lVar2 = lVarV;
                    dVar4 = dVar2;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new j(z11, z12, hVar, y3Var, z13, aVar, dVar4, i11, i12));
                }
            }
            i13 |= 1572864;
            dVar2 = dVar;
            if ((2995931 & i13) == 599186) {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1272084064, i13, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:87)");
                }
                e0VarA = f.g.f63718a.a(lVarV, f.g.f63720c);
                if (e0VarA != null) {
                    onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
                } else {
                    onBackPressedDispatcher = null;
                }
                y3VarK = k((w) lVarV.U(v50.b.e()), lVarV, 8);
                z50.j jVarB2 = z50.l.b(lVarV, 0);
                lVarV.H(773894976);
                lVarV.H(-492369756);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                    lVarV.B(objI);
                }
                lVarV.T();
                CoroutineScope coroutineScope2 = ((a0) objI).getCoroutineScope();
                lVarV.T();
                float fG2 = w4.h.g(0);
                if (e(y3VarK)) {
                    aVarB = null;
                } else {
                    aVarB = null;
                }
                p026y50.d dVar7 = p026y50.d.f125064a;
                long textWhite2 = dVar7.a(lVarV, 6).getTextWhite();
                long textBrand2 = dVar7.a(lVarV, 6).getTextBrand();
                lVarV.H(-697750418);
                if ((i13 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI2 = lVarV.I();
                if (z14) {
                    objI2 = new g(y3Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new g(y3Var);
                    lVarV.B(objI2);
                }
                lVarV.T();
                androidx.compose.ui.d dVar8 = dVar3;
                lVar2 = lVarV;
                C4671g.d(z2.c.b(lVarV, -894934244, true, new h(z11, z12, hVar)), androidx.compose.ui.graphics.b.a(dVar3, (wn0.l) objI2), aVarB, z2.c.b(lVarV, 802859473, true, new i(coroutineScope2, jVarB2, aVar)), textWhite2, textBrand2, fG2, lVar2, 1575942, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar8;
            } else {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1272084064, i13, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:87)");
                }
                e0VarA = f.g.f63718a.a(lVarV, f.g.f63720c);
                if (e0VarA != null) {
                    onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
                } else {
                    onBackPressedDispatcher = null;
                }
                y3VarK = k((w) lVarV.U(v50.b.e()), lVarV, 8);
                z50.j jVarB3 = z50.l.b(lVarV, 0);
                lVarV.H(773894976);
                lVarV.H(-492369756);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                    lVarV.B(objI);
                }
                lVarV.T();
                CoroutineScope coroutineScope3 = ((a0) objI).getCoroutineScope();
                lVarV.T();
                float fG3 = w4.h.g(0);
                if (e(y3VarK)) {
                    aVarB = null;
                } else {
                    aVarB = null;
                }
                p026y50.d dVar9 = p026y50.d.f125064a;
                long textWhite3 = dVar9.a(lVarV, 6).getTextWhite();
                long textBrand3 = dVar9.a(lVarV, 6).getTextBrand();
                lVarV.H(-697750418);
                if ((i13 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI2 = lVarV.I();
                if (z14) {
                    objI2 = new g(y3Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new g(y3Var);
                    lVarV.B(objI2);
                }
                lVarV.T();
                androidx.compose.ui.d dVar10 = dVar3;
                lVar2 = lVarV;
                C4671g.d(z2.c.b(lVarV, -894934244, true, new h(z11, z12, hVar)), androidx.compose.ui.graphics.b.a(dVar3, (wn0.l) objI2), aVarB, z2.c.b(lVarV, 802859473, true, new i(coroutineScope3, jVarB3, aVar)), textWhite3, textBrand3, fG3, lVar2, 1575942, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar10;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new j(z11, z12, hVar, y3Var, z13, aVar, dVar4, i11, i12));
            }
        }
        i14 = 196608;
        i13 |= i14;
        i15 = i12 & 64;
        if (i15 != 0) {
            if ((3670016 & i11) == 0) {
                dVar2 = dVar;
                if (lVarV.n(dVar2)) {
                    i16 = PKIFailureInfo.badCertTemplate;
                } else {
                    i16 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i16;
            }
            if ((2995931 & i13) == 599186) {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1272084064, i13, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:87)");
                }
                e0VarA = f.g.f63718a.a(lVarV, f.g.f63720c);
                if (e0VarA != null) {
                    onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
                } else {
                    onBackPressedDispatcher = null;
                }
                y3VarK = k((w) lVarV.U(v50.b.e()), lVarV, 8);
                z50.j jVarB4 = z50.l.b(lVarV, 0);
                lVarV.H(773894976);
                lVarV.H(-492369756);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                    lVarV.B(objI);
                }
                lVarV.T();
                CoroutineScope coroutineScope4 = ((a0) objI).getCoroutineScope();
                lVarV.T();
                float fG4 = w4.h.g(0);
                if (e(y3VarK)) {
                    aVarB = null;
                } else {
                    aVarB = null;
                }
                p026y50.d dVar11 = p026y50.d.f125064a;
                long textWhite4 = dVar11.a(lVarV, 6).getTextWhite();
                long textBrand4 = dVar11.a(lVarV, 6).getTextBrand();
                lVarV.H(-697750418);
                if ((i13 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI2 = lVarV.I();
                if (z14) {
                    objI2 = new g(y3Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new g(y3Var);
                    lVarV.B(objI2);
                }
                lVarV.T();
                androidx.compose.ui.d dVar12 = dVar3;
                lVar2 = lVarV;
                C4671g.d(z2.c.b(lVarV, -894934244, true, new h(z11, z12, hVar)), androidx.compose.ui.graphics.b.a(dVar3, (wn0.l) objI2), aVarB, z2.c.b(lVarV, 802859473, true, new i(coroutineScope4, jVarB4, aVar)), textWhite4, textBrand4, fG4, lVar2, 1575942, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar12;
            } else {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1272084064, i13, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:87)");
                }
                e0VarA = f.g.f63718a.a(lVarV, f.g.f63720c);
                if (e0VarA != null) {
                    onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
                } else {
                    onBackPressedDispatcher = null;
                }
                y3VarK = k((w) lVarV.U(v50.b.e()), lVarV, 8);
                z50.j jVarB5 = z50.l.b(lVarV, 0);
                lVarV.H(773894976);
                lVarV.H(-492369756);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                    lVarV.B(objI);
                }
                lVarV.T();
                CoroutineScope coroutineScope5 = ((a0) objI).getCoroutineScope();
                lVarV.T();
                float fG5 = w4.h.g(0);
                if (e(y3VarK)) {
                    aVarB = null;
                } else {
                    aVarB = null;
                }
                p026y50.d dVar13 = p026y50.d.f125064a;
                long textWhite5 = dVar13.a(lVarV, 6).getTextWhite();
                long textBrand5 = dVar13.a(lVarV, 6).getTextBrand();
                lVarV.H(-697750418);
                if ((i13 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI2 = lVarV.I();
                if (z14) {
                    objI2 = new g(y3Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new g(y3Var);
                    lVarV.B(objI2);
                }
                lVarV.T();
                androidx.compose.ui.d dVar14 = dVar3;
                lVar2 = lVarV;
                C4671g.d(z2.c.b(lVarV, -894934244, true, new h(z11, z12, hVar)), androidx.compose.ui.graphics.b.a(dVar3, (wn0.l) objI2), aVarB, z2.c.b(lVarV, 802859473, true, new i(coroutineScope5, jVarB5, aVar)), textWhite5, textBrand5, fG5, lVar2, 1575942, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar14;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new j(z11, z12, hVar, y3Var, z13, aVar, dVar4, i11, i12));
            }
        }
        i13 |= 1572864;
        dVar2 = dVar;
        if ((2995931 & i13) == 599186) {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1272084064, i13, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:87)");
            }
            e0VarA = f.g.f63718a.a(lVarV, f.g.f63720c);
            if (e0VarA != null) {
                onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
            } else {
                onBackPressedDispatcher = null;
            }
            y3VarK = k((w) lVarV.U(v50.b.e()), lVarV, 8);
            z50.j jVarB6 = z50.l.b(lVarV, 0);
            lVarV.H(773894976);
            lVarV.H(-492369756);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                lVarV.B(objI);
            }
            lVarV.T();
            CoroutineScope coroutineScope6 = ((a0) objI).getCoroutineScope();
            lVarV.T();
            float fG6 = w4.h.g(0);
            if (e(y3VarK)) {
                aVarB = null;
            } else {
                aVarB = null;
            }
            p026y50.d dVar15 = p026y50.d.f125064a;
            long textWhite6 = dVar15.a(lVarV, 6).getTextWhite();
            long textBrand6 = dVar15.a(lVarV, 6).getTextBrand();
            lVarV.H(-697750418);
            if ((i13 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objI2 = lVarV.I();
            if (z14) {
                objI2 = new g(y3Var);
                lVarV.B(objI2);
            } else {
                objI2 = new g(y3Var);
                lVarV.B(objI2);
            }
            lVarV.T();
            androidx.compose.ui.d dVar16 = dVar3;
            lVar2 = lVarV;
            C4671g.d(z2.c.b(lVarV, -894934244, true, new h(z11, z12, hVar)), androidx.compose.ui.graphics.b.a(dVar3, (wn0.l) objI2), aVarB, z2.c.b(lVarV, 802859473, true, new i(coroutineScope6, jVarB6, aVar)), textWhite6, textBrand6, fG6, lVar2, 1575942, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar16;
        } else {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1272084064, i13, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:87)");
            }
            e0VarA = f.g.f63718a.a(lVarV, f.g.f63720c);
            if (e0VarA != null) {
                onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
            } else {
                onBackPressedDispatcher = null;
            }
            y3VarK = k((w) lVarV.U(v50.b.e()), lVarV, 8);
            z50.j jVarB7 = z50.l.b(lVarV, 0);
            lVarV.H(773894976);
            lVarV.H(-492369756);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                lVarV.B(objI);
            }
            lVarV.T();
            CoroutineScope coroutineScope7 = ((a0) objI).getCoroutineScope();
            lVarV.T();
            float fG7 = w4.h.g(0);
            if (e(y3VarK)) {
                aVarB = null;
            } else {
                aVarB = null;
            }
            p026y50.d dVar17 = p026y50.d.f125064a;
            long textWhite7 = dVar17.a(lVarV, 6).getTextWhite();
            long textBrand7 = dVar17.a(lVarV, 6).getTextBrand();
            lVarV.H(-697750418);
            if ((i13 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objI2 = lVarV.I();
            if (z14) {
                objI2 = new g(y3Var);
                lVarV.B(objI2);
            } else {
                objI2 = new g(y3Var);
                lVarV.B(objI2);
            }
            lVarV.T();
            androidx.compose.ui.d dVar18 = dVar3;
            lVar2 = lVarV;
            C4671g.d(z2.c.b(lVarV, -894934244, true, new h(z11, z12, hVar)), androidx.compose.ui.graphics.b.a(dVar3, (wn0.l) objI2), aVarB, z2.c.b(lVarV, 802859473, true, new i(coroutineScope7, jVarB7, aVar)), textWhite7, textBrand7, fG7, lVar2, 1575942, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar18;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new j(z11, z12, hVar, y3Var, z13, aVar, dVar4, i11, i12));
        }
    }

    private static final boolean e(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z11, boolean z12, p026y50.h hVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(501404909);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.p(z12) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.n(hVar) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(501404909, i12, -1, "com.stripe.android.financialconnections.ui.components.Title (TopAppBar.kt:185)");
            }
            d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(8));
            lVarV.H(693286680);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarB = v1.e0.b(fVarN, interfaceC1212cI, lVarV, 54);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = z3.a0.a(companion);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            lVarV.H(-1951475712);
            if (!z11) {
                b0.a(e4.e.c(hVar.getIcon(), lVarV, 0), null, androidx.compose.foundation.layout.x.s(companion, f121009a, f121010b), null, null, BitmapDescriptorFactory.HUE_RED, null, lVarV, 440, 120);
            }
            lVarV.T();
            lVarV.H(-1951464621);
            if (z12) {
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.t.j(androidx.compose.ui.draw.b.b(companion, k.f121055c), f121011c, f121012d);
                p026y50.d dVar = p026y50.d.f125064a;
                v2.b("Test", dVarJ, dVar.a(lVarV, 6).getTextWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar.b(lVarV, 6).getLabelMediumEmphasized(), lVarV, 6, 0, 65528);
                lVarV = lVarV;
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new l(z11, z12, hVar, i11));
        }
    }

    private static final y3<Boolean> k(w wVar, p020r2.l lVar, int i11) {
        lVar.H(-756540468);
        if (p020r2.o.J()) {
            p020r2.o.S(-756540468, i11, -1, "com.stripe.android.financialconnections.ui.components.collectCanShowBackIconAsState (TopAppBar.kt:217)");
        }
        lVar.H(-1135372047);
        Object objI = lVar.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = s3.d(Boolean.FALSE, null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        lVar.T();
        Function0.c(h0.f84049a, new m(wVar, p1Var), lVar, 6);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return p1Var;
    }
}
