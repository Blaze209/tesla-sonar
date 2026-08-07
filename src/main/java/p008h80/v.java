package p008h80;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.p1;
import androidx.compose.ui.platform.s2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import o90.f;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import q1.m;
import t60.SupportedPaymentMethod;
import v1.e;
import v1.y;
import w1.a0;
import w1.b0;
import w1.x;
import w4.h;
import wn0.p;
import wn0.q;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a]\u0010\u0010\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"", "Lt60/g;", "paymentMethods", "", "selectedIndex", "", "isEnabled", "Lkotlin/Function1;", "Ljn0/h0;", "onItemSelectedListener", "Lo90/f;", "imageLoader", "Landroidx/compose/ui/d;", "modifier", "Lw1/a0;", "state", "a", "(Ljava/util/List;IZLwn0/l;Lo90/f;Landroidx/compose/ui/d;Lw1/a0;Lr2/l;II)V", "Lw4/h;", "maxWidth", "numberOfPaymentMethods", "e", "(FILr2/l;I)F", "c", "(FI)F", "availableWidth", "minItemWidth", "spacing", "", "lastCardPeekAmount", DateTokenConverter.CONVERTER_KEY, "(FFFF)F", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class v {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1", f = "NewPaymentMethodTabLayoutUI.kt", i = {}, l = {52, 54}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71590n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f71591o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ a0 f71592p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f71593q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, a0 a0Var, int i11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f71591o = z11;
            this.f71592p = a0Var;
            this.f71593q = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f71591o, this.f71592p, this.f71593q, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (w1.a0.L(r4, r5, 0, r10, 2, null) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (w1.a0.m(r1, r2, 0, r10, 2, null) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            return r0;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f71590n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r11)
                goto L4a
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                jn0.t.b(r11)
                r4 = r10
                goto L4a
            L1f:
                jn0.t.b(r11)
                boolean r11 = r10.f71591o
                if (r11 == 0) goto L38
                w1.a0 r4 = r10.f71592p
                int r5 = r10.f71593q
                r10.f71590n = r3
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r10
                java.lang.Object r11 = w1.a0.L(r4, r5, r6, r7, r8, r9)
                r4 = r7
                if (r11 != r0) goto L4a
                goto L49
            L38:
                r4 = r10
                w1.a0 r1 = r4.f71592p
                r11 = r2
                int r2 = r4.f71593q
                r4.f71590n = r11
                r3 = 0
                r5 = 2
                r6 = 0
                java.lang.Object r11 = w1.a0.m(r1, r2, r3, r4, r5, r6)
                if (r11 != r0) goto L4a
            L49:
                return r0
            L4a:
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: h80.v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<SupportedPaymentMethod> f71594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a0 f71595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f71596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f71598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.l<SupportedPaymentMethod, h0> f71599h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/x;", "Ljn0/h0;", "a", "(Lw1/x;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<x, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<SupportedPaymentMethod> f71600c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f71601d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f71602e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f71603f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f71604g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ wn0.l<SupportedPaymentMethod, h0> f71605h;

            /* JADX INFO: renamed from: h80.v$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class C1503a extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.l<SupportedPaymentMethod, h0> f71606c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<SupportedPaymentMethod> f71607d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f71608e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1503a(wn0.l<? super SupportedPaymentMethod, h0> lVar, List<SupportedPaymentMethod> list, int i11) {
                    super(0);
                    this.f71606c = lVar;
                    this.f71607d = list;
                    this.f71608e = i11;
                }

                public final void b() {
                    this.f71606c.invoke(this.f71607d.get(this.f71608e));
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: h80.v$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            public static final class C1504b extends u implements wn0.l<Integer, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ List f71609c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1504b(List list) {
                    super(1);
                    this.f71609c = list;
                }

                public final Object a(int i11) {
                    this.f71609c.get(i11);
                    return null;
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return a(num.intValue());
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lw1/c;", "", "it", "Ljn0/h0;", "a", "(Lw1/c;ILr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            public static final class c extends u implements r<w1.c, Integer, l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ List f71610c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f71611d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f71612e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ f f71613f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f71614g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ wn0.l f71615h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ List f71616i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(List list, int i11, float f11, f fVar, boolean z11, wn0.l lVar, List list2) {
                    super(4);
                    this.f71610c = list;
                    this.f71611d = i11;
                    this.f71612e = f11;
                    this.f71613f = fVar;
                    this.f71614g = z11;
                    this.f71615h = lVar;
                    this.f71616i = list2;
                }

                public final void a(w1.c items, int i11, l lVar, int i12) {
                    int i13;
                    s.k(items, "$this$items");
                    if ((i12 & 14) == 0) {
                        i13 = i12 | (lVar.n(items) ? 4 : 2);
                    } else {
                        i13 = i12;
                    }
                    if ((i12 & 112) == 0) {
                        i13 |= lVar.r(i11) ? 32 : 16;
                    }
                    if ((i13 & 731) == 146 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(-1091073711, i13, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    SupportedPaymentMethod supportedPaymentMethod = (SupportedPaymentMethod) this.f71610c.get(i11);
                    lVar.H(1249436630);
                    String lightThemeIconUrl = (!m.a(lVar, 0) || supportedPaymentMethod.getDarkThemeIconUrl() == null) ? supportedPaymentMethod.getLightThemeIconUrl() : supportedPaymentMethod.getDarkThemeIconUrl();
                    d dVarA = s2.a(d.INSTANCE, "PaymentMethodsUITestTag" + supportedPaymentMethod.getCode());
                    u.a(this.f71612e, supportedPaymentMethod.getIconResource(), lightThemeIconUrl, this.f71613f, p90.a.a(supportedPaymentMethod.getDisplayName(), lVar, 8), i11 == this.f71611d, this.f71614g, supportedPaymentMethod.getIconRequiresTinting(), dVarA, new C1503a(this.f71615h, this.f71616i, i11), lVar, f.f96995g << 9, 0);
                    lVar.T();
                    if (o.J()) {
                        o.R();
                    }
                }

                @Override // wn0.r
                public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, Integer num, l lVar, Integer num2) {
                    a(cVar, num.intValue(), lVar, num2.intValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<SupportedPaymentMethod> list, int i11, float f11, f fVar, boolean z11, wn0.l<? super SupportedPaymentMethod, h0> lVar) {
                super(1);
                this.f71600c = list;
                this.f71601d = i11;
                this.f71602e = f11;
                this.f71603f = fVar;
                this.f71604g = z11;
                this.f71605h = lVar;
            }

            public final void a(x LazyRow) {
                s.k(LazyRow, "$this$LazyRow");
                List<SupportedPaymentMethod> list = this.f71600c;
                LazyRow.d(list.size(), null, new C1504b(list), z2.c.c(-1091073711, true, new c(list, this.f71601d, this.f71602e, this.f71603f, this.f71604g, this.f71605h, list)));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(x xVar) {
                a(xVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<SupportedPaymentMethod> list, a0 a0Var, boolean z11, int i11, f fVar, wn0.l<? super SupportedPaymentMethod, h0> lVar) {
            super(3);
            this.f71594c = list;
            this.f71595d = a0Var;
            this.f71596e = z11;
            this.f71597f = i11;
            this.f71598g = fVar;
            this.f71599h = lVar;
        }

        public final void a(e BoxWithConstraints, l lVar, int i11) {
            int i12;
            s.k(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i11 & 14) == 0) {
                i12 = i11 | (lVar.n(BoxWithConstraints) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(782109993, i12, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI.<anonymous> (NewPaymentMethodTabLayoutUI.kt:60)");
            }
            float fE = v.e(BoxWithConstraints.c(), this.f71594c.size(), lVar, 0);
            a0 a0Var = a0.f70988a;
            y yVarC = t.c(a0Var.b(), BitmapDescriptorFactory.HUE_RED, 2, null);
            v1.b.f fVarN = v1.b.f117444a.n(a0Var.a());
            d dVarA = s2.a(d.INSTANCE, "PaymentMethodsUITestTag");
            a0 a0Var2 = this.f71595d;
            boolean z11 = this.f71596e;
            w1.b.b(dVarA, a0Var2, yVarC, false, fVarN, null, null, z11, new a(this.f71594c, this.f71597f, fE, this.f71598g, z11, this.f71599h), lVar, 24966, 104);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<SupportedPaymentMethod> f71617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f71618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f71619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<SupportedPaymentMethod, h0> f71620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f71621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d f71622h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ a0 f71623i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f71624j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f71625k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<SupportedPaymentMethod> list, int i11, boolean z11, wn0.l<? super SupportedPaymentMethod, h0> lVar, f fVar, d dVar, a0 a0Var, int i12, int i13) {
            super(2);
            this.f71617c = list;
            this.f71618d = i11;
            this.f71619e = z11;
            this.f71620f = lVar;
            this.f71621g = fVar;
            this.f71622h = dVar;
            this.f71623i = a0Var;
            this.f71624j = i12;
            this.f71625k = i13;
        }

        public final void a(l lVar, int i11) {
            v.a(this.f71617c, this.f71618d, this.f71619e, this.f71620f, this.f71621g, this.f71622h, this.f71623i, lVar, k2.a(this.f71624j | 1), this.f71625k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(List<SupportedPaymentMethod> paymentMethods, int i11, boolean z11, wn0.l<? super SupportedPaymentMethod, h0> onItemSelectedListener, f imageLoader, d dVar, a0 a0Var, l lVar, int i12, int i13) {
        a0 a0VarC;
        int i14;
        s.k(paymentMethods, "paymentMethods");
        s.k(onItemSelectedListener, "onItemSelectedListener");
        s.k(imageLoader, "imageLoader");
        l lVarV = lVar.v(994479443);
        d dVar2 = (i13 & 32) != 0 ? d.INSTANCE : dVar;
        if ((i13 & 64) != 0) {
            a0VarC = b0.c(0, 0, lVarV, 0, 3);
            i14 = i12 & (-3670017);
        } else {
            a0VarC = a0Var;
            i14 = i12;
        }
        if (o.J()) {
            o.S(994479443, i14, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI (NewPaymentMethodTabLayoutUI.kt:43)");
        }
        boolean zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
        Integer numValueOf = Integer.valueOf(i11);
        lVarV.H(-132451049);
        boolean zP = lVarV.p(zBooleanValue) | ((((i12 & 3670016) ^ 1572864) > 1048576 && lVarV.n(a0VarC)) || (i12 & 1572864) == 1048576) | ((((i12 & 112) ^ 48) > 32 && lVarV.r(i11)) || (i12 & 48) == 32);
        Object objI = lVarV.I();
        if (zP || objI == l.INSTANCE.a()) {
            objI = new a(zBooleanValue, a0VarC, i11, null);
            lVarV.B(objI);
        }
        lVarV.T();
        Function0.g(numValueOf, (p) objI, lVarV, ((i14 >> 3) & 14) | 64);
        a0 a0Var2 = a0VarC;
        v1.d.a(s2.a(dVar2, "PaymentMethodsUITestTag1"), null, false, z2.c.b(lVarV, 782109993, true, new b(paymentMethods, a0Var2, z11, i11, imageLoader, onItemSelectedListener)), lVarV, 3072, 6);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(paymentMethods, i11, z11, onItemSelectedListener, imageLoader, dVar2, a0Var2, i12, i13));
        }
    }

    public static final float c(float f11, int i11) {
        a0 a0Var = a0.f70988a;
        float fG = h.g(f11 - h.g(a0Var.b() * 2));
        float fG2 = h.g(90);
        float f12 = i11;
        float fG3 = h.g(fG2 * f12);
        float fG4 = h.g(a0Var.a() * (i11 - 1));
        if (h.f(h.g(fG3 + fG4), fG) <= 0) {
            return h.g(h.g(fG - fG4) / f12);
        }
        Iterator it = p013kotlin.collections.v.p(Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        h hVarD = h.d(d(fG, fG2, a0Var.a(), ((Number) it.next()).floatValue()));
        while (it.hasNext()) {
            h hVarD2 = h.d(d(fG, fG2, a0.f70988a.a(), ((Number) it.next()).floatValue()));
            if (hVarD.compareTo(hVarD2) > 0) {
                hVarD = hVarD2;
            }
        }
        return hVarD.getValue();
    }

    private static final float d(float f11, float f12, float f13, float f14) {
        int iG = (int) (h.g(h.g(f11 - f12) - h.g(f12 * f14)) / h.g(f12 + f13));
        return h.g(h.g(f11 - h.g(f13 * iG)) / ((iG + 1) + f14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(float f11, int i11, l lVar, int i12) {
        lVar.H(-709663121);
        if (o.J()) {
            o.S(-709663121, i12, -1, "com.stripe.android.paymentsheet.ui.rememberViewWidth (NewPaymentMethodTabLayoutUI.kt:103)");
        }
        lVar.H(1221348739);
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && lVar.q(f11)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && lVar.r(i11)) || (i12 & 48) == 32);
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            objI = h.d(c(f11, i11));
            lVar.B(objI);
        }
        float value = ((h) objI).getValue();
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return value;
    }
}
