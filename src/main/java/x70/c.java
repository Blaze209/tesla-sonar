package x70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentMethod;
import ezvcard.property.Gender;
import f30.d0;
import j80.n;
import java.io.Closeable;
import jn0.h0;
import kotlinx.coroutines.flow.StateFlow;
import n70.x;
import p008h80.PaymentSheetTopBarState;
import p008h80.s0;
import p008h80.t;
import p008h80.t0;
import p008h80.u0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import t60.SupportedPaymentMethod;
import wn0.p;
import z80.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b'(\u0004)*+,-./0J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0018\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010 \u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0017\u0082\u0001\n123456789:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Lx70/c;", "", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "Lx70/a;", "o", "buyButtonState", "H", "()Z", "showsContinueButton", "Lw4/h;", "n", "()F", "topContentPadding", "t", "bottomContentPadding", "B", "walletsDividerSpacing", "Lx70/c$c;", "p", "()Lx70/c$c;", "animationStyle", "I", "showsMandates", "a", "b", DateTokenConverter.CONVERTER_KEY, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "Lx70/c$a;", "Lx70/c$b;", "Lx70/c$d;", "Lx70/c$f;", "Lx70/c$g;", "Lx70/c$h;", "Lx70/c$i;", "Lx70/c$j;", "Lx70/c$k;", "Lx70/c$l;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010$\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010-\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R \u00100\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001a\u00106\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00109\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Lx70/c$a;", "Lx70/c;", "Ljava/io/Closeable;", "Lh80/b;", "interactor", "<init>", "(Lh80/b;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "close", "()V", "a", "Lh80/b;", "Lx70/a;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "n", "()F", "topContentPadding", "e", "t", "bottomContentPadding", "f", "B", "walletsDividerSpacing", "Lx70/c$c;", "g", "Lx70/c$c;", "p", "()Lx70/c$c;", "animationStyle", "h", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p008h80.b interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final EnumC2659c animationStyle;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        /* JADX INFO: renamed from: x70.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class C2657a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f122953d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f122954e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2657a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f122953d = dVar;
                this.f122954e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                a.this.C(this.f122953d, lVar, k2.a(this.f122954e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh80/b$a;", "state", "Lx30/c;", "a", "(Lh80/b$a;)Lx30/c;"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.l<p008h80.b.State, x30.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f122955c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f122956d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z11, boolean z12) {
                super(1);
                this.f122955c = z11;
                this.f122956d = z12;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x30.c invoke(p008h80.b.State state) {
                s.k(state, "state");
                if (this.f122955c || this.f122956d) {
                    return null;
                }
                SupportedPaymentMethod supportedPaymentMethod = (SupportedPaymentMethod) v.W0(state.g());
                return s.f(supportedPaymentMethod != null ? supportedPaymentMethod.getCode() : null, PaymentMethod.p.Card.code) ? x30.d.a(d0.J0) : x30.d.a(x.E);
            }
        }

        public a(p008h80.b interactor) {
            s.k(interactor, "interactor");
            this.interactor = interactor;
            this.buyButtonState = r90.g.n(new BuyButtonState(true, null, 2, null));
            this.showsContinueButton = true;
            this.topContentPadding = w4.h.g(0);
            this.bottomContentPadding = x70.d.a();
            this.walletsDividerSpacing = x70.d.b();
            this.animationStyle = EnumC2659c.PrimaryButtonAnchored;
            this.showsMandates = true;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(-992403751);
            if (o.J()) {
                o.S(-992403751, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddAnotherPaymentMethod.Content (PaymentSheetScreen.kt:224)");
            }
            p008h80.c.a(this.interactor, modifier, lVarV, (i11 << 3) & 112, 0);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new C2657a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.m(this.interactor.getState(), new b(isWalletEnabled, isCompleteFlow));
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.valueOf(isCompleteFlow));
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.n(p008h80.h0.f71089a.a(true, this.interactor.n(), PaymentSheetTopBarState.a.b.f71083a));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.interactor.close();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public EnumC2659c getAnimationStyle() {
            return this.animationStyle;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010$\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010-\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R \u00100\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001a\u00103\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lx70/c$b;", "Lx70/c;", "Ljava/io/Closeable;", "Lh80/b;", "interactor", "<init>", "(Lh80/b;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "close", "()V", "a", "Lh80/b;", "Lx70/a;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "n", "()F", "topContentPadding", "e", "t", "bottomContentPadding", "f", "B", "walletsDividerSpacing", "g", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p008h80.b interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f122965d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f122966e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f122965d = dVar;
                this.f122966e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                b.this.C(this.f122965d, lVar, k2.a(this.f122966e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: x70.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh80/b$a;", "state", "Lx30/c;", "a", "(Lh80/b$a;)Lx30/c;"}, k = 3, mv = {1, 9, 0})
        static final class C2658b extends u implements wn0.l<p008h80.b.State, x30.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f122967c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f122968d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2658b(boolean z11, boolean z12) {
                super(1);
                this.f122967c = z11;
                this.f122968d = z12;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x30.c invoke(p008h80.b.State state) {
                s.k(state, "state");
                if (this.f122967c) {
                    return null;
                }
                if (this.f122968d) {
                    return x30.d.a(x.f93528n);
                }
                SupportedPaymentMethod supportedPaymentMethod = (SupportedPaymentMethod) v.W0(state.g());
                return s.f(supportedPaymentMethod != null ? supportedPaymentMethod.getCode() : null, PaymentMethod.p.Card.code) ? x30.d.a(d0.J0) : x30.d.a(x.E);
            }
        }

        public b(p008h80.b interactor) {
            s.k(interactor, "interactor");
            this.interactor = interactor;
            this.buyButtonState = r90.g.n(new BuyButtonState(true, null, 2, null));
            this.showsContinueButton = true;
            this.topContentPadding = w4.h.g(0);
            this.bottomContentPadding = x70.d.a();
            this.walletsDividerSpacing = x70.d.b();
            this.showsMandates = true;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(1504163590);
            if (o.J()) {
                o.S(1504163590, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddFirstPaymentMethod.Content (PaymentSheetScreen.kt:277)");
            }
            p008h80.c.a(this.interactor, modifier, lVarV, (i11 << 3) & 112, 0);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.m(this.interactor.getState(), new C2658b(isWalletEnabled, isCompleteFlow));
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.TRUE);
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.n(p008h80.h0.f71089a.a(false, this.interactor.n(), PaymentSheetTopBarState.a.b.f71083a));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.interactor.close();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p */
        public EnumC2659c getAnimationStyle() {
            return e.a(this);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }
    }

    /* JADX INFO: renamed from: x70.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx70/c$c;", "", "<init>", "(Ljava/lang/String;I)V", "PrimaryButtonAnchored", "FullPage", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EnumC2659c {
        PrimaryButtonAnchored,
        FullPage;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<EnumC2659c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e {
        public static EnumC2659c a(c cVar) {
            return EnumC2659c.FullPage;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010&\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R \u0010,\u001a\u00020'8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010/\u001a\u00020'8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R \u00102\u001a\u00020'8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001a\u00105\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Lx70/c$f;", "Lx70/c;", "Ljava/io/Closeable;", "Lh80/t;", "interactor", "<init>", "(Lh80/t;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "close", "()V", "a", "Lh80/t;", "getInteractor", "()Lh80/t;", "Lx70/a;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "n", "()F", "topContentPadding", "e", "t", "bottomContentPadding", "f", "B", "walletsDividerSpacing", "g", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements c, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final t interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f122989d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f122990e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f122989d = dVar;
                this.f122990e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                f.this.C(this.f122989d, lVar, k2.a(this.f122990e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        public f(t interactor) {
            s.k(interactor, "interactor");
            this.interactor = interactor;
            this.buyButtonState = r90.g.n(new BuyButtonState(false, null, 2, null));
            float f11 = 0;
            this.topContentPadding = w4.h.g(f11);
            this.bottomContentPadding = w4.h.g(f11);
            this.walletsDividerSpacing = x70.d.b();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(-1252883967);
            if (o.J()) {
                o.S(-1252883967, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.EditPaymentMethod.Content (PaymentSheetScreen.kt:318)");
            }
            p008h80.l.d(this.interactor, modifier, lVarV, (i11 << 3) & 112, 0);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.n(x30.d.a(d0.N0));
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.FALSE);
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.n(p008h80.h0.f71089a.a(true, this.interactor.getIsLiveMode(), PaymentSheetTopBarState.a.b.f71083a));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.interactor.close();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p */
        public EnumC2659c getAnimationStyle() {
            return e.a(this);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010&\u001a\u00020\u001e8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R \u0010)\u001a\u00020\u001e8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001a\u0010,\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Lx70/c$g;", "Lx70/c;", "<init>", "()V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "Lx70/a;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "n", "()F", "topContentPadding", "e", "t", "bottomContentPadding", "f", "B", "walletsDividerSpacing", "g", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean showsContinueButton = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final float topContentPadding;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final float bottomContentPadding;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final boolean showsMandates = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f122991a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final StateFlow<BuyButtonState> buyButtonState = r90.g.n(new BuyButtonState(false, null, 2, null));

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final float walletsDividerSpacing = x70.d.b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f122998h = 8;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f123000d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f123001e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f123000d = dVar;
                this.f123001e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                g.this.C(this.f123000d, lVar, k2.a(this.f123001e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        static {
            float f11 = 0;
            topContentPadding = w4.h.g(f11);
            bottomContentPadding = w4.h.g(f11);
        }

        private g() {
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B */
        public float getWalletsDividerSpacing() {
            return walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            int i12;
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(1798980290);
            if ((i11 & 14) == 0) {
                i12 = (lVarV.n(modifier) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i12 & 11) == 2 && lVarV.b()) {
                lVarV.j();
            } else {
                if (o.J()) {
                    o.S(1798980290, i12, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.Loading.Content (PaymentSheetScreen.kt:112)");
                }
                m30.b.a(modifier, lVarV, i12 & 14, 0);
                if (o.J()) {
                    o.R();
                }
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H */
        public boolean getShowsContinueButton() {
            return showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I */
        public boolean getShowsMandates() {
            return showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.n(null);
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.FALSE);
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.n(null);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n */
        public float getTopContentPadding() {
            return topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p */
        public EnumC2659c getAnimationStyle() {
            return e.a(this);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t */
        public float getBottomContentPadding() {
            return bottomContentPadding;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001a\u0010!\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010'\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010*\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R \u0010-\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001a\u00100\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lx70/c$h;", "Lx70/c;", "Lj80/f;", "interactor", "<init>", "(Lj80/f;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "a", "Lj80/f;", "Lx70/a;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "n", "()F", "topContentPadding", "e", "t", "bottomContentPadding", "f", "B", "walletsDividerSpacing", "g", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j80.f interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f123010d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f123011e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f123010d = dVar;
                this.f123011e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                h.this.C(this.f123010d, lVar, k2.a(this.f123011e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        public h(j80.f interactor) {
            s.k(interactor, "interactor");
            this.interactor = interactor;
            this.buyButtonState = r90.g.n(new BuyButtonState(false, null, 2, null));
            float f11 = 0;
            this.topContentPadding = w4.h.g(f11);
            this.bottomContentPadding = w4.h.g(f11);
            this.walletsDividerSpacing = x70.d.d();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(1539421821);
            if (o.J()) {
                o.S(1539421821, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageOneSavedPaymentMethod.Content (PaymentSheetScreen.kt:492)");
            }
            j80.g.a(this.interactor, lVarV, 0);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.n(x30.d.a(x.f93509d0));
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.FALSE);
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.n(p008h80.h0.f71089a.a(true, this.interactor.getState().getIsLiveMode(), PaymentSheetTopBarState.a.b.f71083a));
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p */
        public EnumC2659c getAnimationStyle() {
            return e.a(this);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010$\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010-\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R \u00100\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001a\u00103\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lx70/c$i;", "Lx70/c;", "Ljava/io/Closeable;", "Lj80/i;", "interactor", "<init>", "(Lj80/i;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "close", "()V", "a", "Lj80/i;", "Lx70/a;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "n", "()F", "topContentPadding", "e", "t", "bottomContentPadding", "f", "B", "walletsDividerSpacing", "g", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements c, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j80.i interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f123020d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f123021e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f123020d = dVar;
                this.f123021e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                i.this.C(this.f123020d, lVar, k2.a(this.f123021e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj80/i$a;", "state", "Lx30/c;", "a", "(Lj80/i$a;)Lx30/c;"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.l<j80.i.State, x30.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f123022c = new b();

            b() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x30.c invoke(j80.i.State state) {
                s.k(state, "state");
                return x30.d.a(state.getIsEditing() ? x.K : x.f93521j0);
            }
        }

        /* JADX INFO: renamed from: x70.c$i$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj80/i$a;", "state", "Lh80/g0;", "a", "(Lj80/i$a;)Lh80/g0;"}, k = 3, mv = {1, 9, 0})
        static final class C2660c extends u implements wn0.l<j80.i.State, PaymentSheetTopBarState> {

            /* JADX INFO: renamed from: x70.c$i$c$a */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class a extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ i f123024c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(i iVar) {
                    super(0);
                    this.f123024c = iVar;
                }

                public final void b() {
                    this.f123024c.interactor.a(j80.i.b.d.f82957a);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            C2660c() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaymentSheetTopBarState invoke(j80.i.State state) {
                s.k(state, "state");
                return p008h80.h0.f71089a.a(true, i.this.interactor.n(), new PaymentSheetTopBarState.a.Maybe(state.getIsEditing(), state.getCanEdit(), new a(i.this)));
            }
        }

        public i(j80.i interactor) {
            s.k(interactor, "interactor");
            this.interactor = interactor;
            this.buyButtonState = r90.g.n(new BuyButtonState(false, null, 2, null));
            float f11 = 0;
            this.topContentPadding = w4.h.g(f11);
            this.bottomContentPadding = w4.h.g(f11);
            this.walletsDividerSpacing = x70.d.d();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(-449464720);
            if (o.J()) {
                o.S(-449464720, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageSavedPaymentMethods.Content (PaymentSheetScreen.kt:454)");
            }
            j80.j.a(this.interactor, lVarV, 0);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.m(this.interactor.getState(), b.f123022c);
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.FALSE);
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.m(this.interactor.getState(), new C2660c());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.interactor.close();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p */
        public EnumC2659c getAnimationStyle() {
            return e.a(this);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001a\u0010!\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010'\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010*\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R \u0010-\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001a\u00100\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lx70/c$k;", "Lx70/c;", "Lj80/n;", "interactor", "<init>", "(Lj80/n;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "a", "Lj80/n;", "Lx70/a;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "n", "()F", "topContentPadding", "e", "t", "bottomContentPadding", "f", "B", "walletsDividerSpacing", "g", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f123049d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f123050e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f123049d = dVar;
                this.f123050e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                k.this.C(this.f123049d, lVar, k2.a(this.f123050e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        public k(n interactor) {
            s.k(interactor, "interactor");
            this.interactor = interactor;
            this.buyButtonState = r90.g.n(new BuyButtonState(true, null, 2, null));
            this.showsContinueButton = true;
            this.topContentPadding = w4.h.g(0);
            this.bottomContentPadding = x70.d.c();
            this.walletsDividerSpacing = x70.d.d();
            this.showsMandates = true;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(-1185148305);
            if (o.J()) {
                o.S(-1185148305, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalMode.Content (PaymentSheetScreen.kt:365)");
            }
            j80.o.b(this.interactor, modifier, lVarV, (i11 << 3) & 112, 0);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            x30.c cVarA;
            if (isWalletEnabled) {
                cVarA = null;
            } else {
                cVarA = isCompleteFlow ? x30.d.a(x.f93519i0) : x30.d.a(x.E);
            }
            return r90.g.n(cVarA);
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return this.interactor.a();
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.n(p008h80.h0.f71089a.a(false, this.interactor.n(), PaymentSheetTopBarState.a.b.f71083a));
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p */
        public EnumC2659c getAnimationStyle() {
            return e.a(this);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }
    }

    /* JADX INFO: renamed from: B */
    float getWalletsDividerSpacing();

    void C(androidx.compose.ui.d dVar, p020r2.l lVar, int i11);

    /* JADX INFO: renamed from: H */
    boolean getShowsContinueButton();

    /* JADX INFO: renamed from: I */
    boolean getShowsMandates();

    StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled);

    StateFlow<Boolean> T(boolean isCompleteFlow);

    StateFlow<PaymentSheetTopBarState> c();

    /* JADX INFO: renamed from: n */
    float getTopContentPadding();

    StateFlow<BuyButtonState> o();

    /* JADX INFO: renamed from: p */
    EnumC2659c getAnimationStyle();

    /* JADX INFO: renamed from: t */
    float getBottomContentPadding();

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\fR\u001a\u0010*\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00100\u001a\u00020+8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00103\u001a\u00020+8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R \u00106\u001a\u00020+8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001a\u0010<\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b>\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Lx70/c$j;", "Lx70/c;", "Ljava/io/Closeable;", "Lh80/u0;", "interactor", "Lx70/c$j$b;", "cvcRecollectionState", "<init>", "(Lh80/u0;Lx70/c$j$b;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "close", "()V", "a", "Lh80/u0;", "b", "Lx70/c$j$b;", "c0", "()Lx70/c$j$b;", "Lx70/a;", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", DateTokenConverter.CONVERTER_KEY, "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", "e", Gender.FEMALE, "n", "()F", "topContentPadding", "f", "t", "bottomContentPadding", "g", "B", "walletsDividerSpacing", "Lx70/c$c;", "h", "Lx70/c$c;", "p", "()Lx70/c$c;", "animationStyle", IntegerTokenConverter.CONVERTER_KEY, "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements c, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final u0 interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b cvcRecollectionState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final EnumC2659c animationStyle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f123035d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f123036e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f123035d = dVar;
                this.f123036e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                j.this.C(this.f123035d, lVar, k2.a(this.f123036e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lx70/c$j$b;", "", "a", "b", "Lx70/c$j$b$a;", "Lx70/c$j$b$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface b {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx70/c$j$b$a;", "Lx70/c$j$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f123037a = new a();

                private a() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                public int hashCode() {
                    return 689265788;
                }

                public String toString() {
                    return "NotRequired";
                }
            }

            /* JADX INFO: renamed from: x70.c$j$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lx70/c$j$b$b;", "Lx70/c$j$b;", "Lkotlinx/coroutines/flow/StateFlow;", "Lz80/q0;", "cvcControllerFlow", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;)V", "a", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class C2661b implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final StateFlow<q0> cvcControllerFlow;

                public C2661b(StateFlow<q0> cvcControllerFlow) {
                    s.k(cvcControllerFlow, "cvcControllerFlow");
                    this.cvcControllerFlow = cvcControllerFlow;
                }

                public final StateFlow<q0> a() {
                    return this.cvcControllerFlow;
                }
            }
        }

        /* JADX INFO: renamed from: x70.c$j$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh80/u0$a;", "state", "Lh80/g0;", "a", "(Lh80/u0$a;)Lh80/g0;"}, k = 3, mv = {1, 9, 0})
        static final class C2662c extends u implements wn0.l<u0.State, PaymentSheetTopBarState> {

            /* JADX INFO: renamed from: x70.c$j$c$a */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class a extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ j f123040c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(0);
                    this.f123040c = jVar;
                }

                public final void b() {
                    this.f123040c.interactor.a(u0.b.e.f71589a);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            C2662c() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaymentSheetTopBarState invoke(u0.State state) {
                s.k(state, "state");
                return p008h80.h0.f71089a.a(false, j.this.interactor.n(), new PaymentSheetTopBarState.a.Maybe(state.getIsEditing(), state.getCanEdit(), new a(j.this)));
            }
        }

        public j(u0 interactor, b cvcRecollectionState) {
            s.k(interactor, "interactor");
            s.k(cvcRecollectionState, "cvcRecollectionState");
            this.interactor = interactor;
            this.cvcRecollectionState = cvcRecollectionState;
            this.buyButtonState = r90.g.n(new BuyButtonState(true, null, 2, null));
            this.topContentPadding = s0.j();
            this.bottomContentPadding = w4.h.g(0);
            this.walletsDividerSpacing = x70.d.b();
            this.animationStyle = EnumC2659c.PrimaryButtonAnchored;
            this.showsMandates = true;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(-289202489);
            if (o.J()) {
                o.S(-289202489, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.SelectSavedPaymentMethods.Content (PaymentSheetScreen.kt:168)");
            }
            t0.j(this.interactor, this.cvcRecollectionState, modifier, lVarV, (i11 << 6) & 896);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.n((isCompleteFlow && isWalletEnabled) ? null : x30.d.a(x.f93521j0));
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.valueOf(isCompleteFlow));
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.m(this.interactor.getState(), new C2662c());
        }

        /* JADX INFO: renamed from: c0, reason: from getter */
        public final b getCvcRecollectionState() {
            return this.cvcRecollectionState;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.interactor.close();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public EnumC2659c getAnimationStyle() {
            return this.animationStyle;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }

        public /* synthetic */ j(u0 u0Var, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(u0Var, (i11 & 2) != 0 ? b.a.f123037a : bVar);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010&\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R \u0010,\u001a\u00020'8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010/\u001a\u00020'8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R \u00102\u001a\u00020'8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001a\u00105\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Lx70/c$l;", "Lx70/c;", "Ljava/io/Closeable;", "Lj80/s;", "interactor", "", "showsWalletHeader", "<init>", "(Lj80/s;Z)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "isCompleteFlow", "isWalletEnabled", "Lx30/c;", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "close", "()V", "a", "Lj80/s;", "b", "Z", "Lx70/a;", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", DateTokenConverter.CONVERTER_KEY, "H", "()Z", "showsContinueButton", "Lw4/h;", "e", Gender.FEMALE, "n", "()F", "topContentPadding", "f", "t", "bottomContentPadding", "g", "B", "walletsDividerSpacing", "h", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements c, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j80.s interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean showsWalletHeader;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f123060d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f123061e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f123060d = dVar;
                this.f123061e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                l.this.C(this.f123060d, lVar, k2.a(this.f123061e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        public l(j80.s interactor, boolean z11) {
            s.k(interactor, "interactor");
            this.interactor = interactor;
            this.showsWalletHeader = z11;
            this.buyButtonState = r90.g.n(new BuyButtonState(true, null, 2, null));
            this.showsContinueButton = true;
            this.topContentPadding = w4.h.g(0);
            this.bottomContentPadding = x70.d.c();
            this.walletsDividerSpacing = x70.d.d();
            this.showsMandates = true;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(1422248203);
            if (o.J()) {
                o.S(1422248203, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalModeForm.Content (PaymentSheetScreen.kt:403)");
            }
            j80.t.b(this.interactor, lVarV, 0);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow<x30.c> J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.n(null);
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.valueOf(this.showsWalletHeader));
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.n(p008h80.h0.f71089a.a(this.interactor.a(), this.interactor.n(), PaymentSheetTopBarState.a.b.f71083a));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.interactor.close();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p */
        public EnumC2659c getAnimationStyle() {
            return e.a(this);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }

        public /* synthetic */ l(j80.s sVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(sVar, (i11 & 2) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001a\u0010!\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010'\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010*\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R \u0010-\u001a\u00020\"8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001a\u00100\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lx70/c$d;", "Lx70/c;", "Lc80/e;", "interactor", "<init>", "(Lc80/e;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/g0;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "isCompleteFlow", "isWalletEnabled", "", "J", "(ZZ)Lkotlinx/coroutines/flow/StateFlow;", "T", "(Z)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "C", "(Landroidx/compose/ui/d;Lr2/l;I)V", "a", "Lc80/e;", "Lx70/a;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "o", "buyButtonState", "Z", "H", "()Z", "showsContinueButton", "Lw4/h;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "n", "()F", "topContentPadding", "e", "t", "bottomContentPadding", "f", "B", "walletsDividerSpacing", "g", "I", "showsMandates", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c80.e interactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<BuyButtonState> buyButtonState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean showsContinueButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float topContentPadding;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float bottomContentPadding;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float walletsDividerSpacing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean showsMandates;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f122977d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f122978e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.d dVar, int i11) {
                super(2);
                this.f122977d = dVar;
                this.f122978e = i11;
            }

            public final void a(p020r2.l lVar, int i11) {
                d.this.C(this.f122977d, lVar, k2.a(this.f122978e | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        public d(c80.e interactor) {
            s.k(interactor, "interactor");
            this.interactor = interactor;
            this.buyButtonState = r90.g.n(new BuyButtonState(true, new BuyButtonState.BuyButtonOverride(x30.d.g(x.G, new Object[0], null, 4, null), false)));
            this.topContentPadding = w4.h.g(0);
            this.bottomContentPadding = x70.d.c();
            this.walletsDividerSpacing = x70.d.d();
        }

        @Override // x70.c
        /* JADX INFO: renamed from: B, reason: from getter */
        public float getWalletsDividerSpacing() {
            return this.walletsDividerSpacing;
        }

        @Override // x70.c
        public void C(androidx.compose.ui.d modifier, p020r2.l lVar, int i11) {
            s.k(modifier, "modifier");
            p020r2.l lVarV = lVar.v(-521548963);
            if (o.J()) {
                o.S(-521548963, i11, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.CvcRecollection.Content (PaymentSheetScreen.kt:532)");
            }
            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c.c(this.interactor, lVarV, 0);
            if (o.J()) {
                o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(modifier, i11));
            }
        }

        @Override // x70.c
        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getShowsContinueButton() {
            return this.showsContinueButton;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: I, reason: from getter */
        public boolean getShowsMandates() {
            return this.showsMandates;
        }

        @Override // x70.c
        public StateFlow J(boolean isCompleteFlow, boolean isWalletEnabled) {
            return r90.g.n(null);
        }

        @Override // x70.c
        public StateFlow<Boolean> T(boolean isCompleteFlow) {
            return r90.g.n(Boolean.FALSE);
        }

        @Override // x70.c
        public StateFlow<PaymentSheetTopBarState> c() {
            return r90.g.m(this.interactor.c(), new b());
        }

        @Override // x70.c
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getTopContentPadding() {
            return this.topContentPadding;
        }

        @Override // x70.c
        public StateFlow<BuyButtonState> o() {
            return this.buyButtonState;
        }

        @Override // x70.c
        /* JADX INFO: renamed from: p */
        public EnumC2659c getAnimationStyle() {
            return e.a(this);
        }

        @Override // x70.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public float getBottomContentPadding() {
            return this.bottomContentPadding;
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc80/c;", "complete", "Lh80/g0;", "a", "(Lc80/c;)Lh80/g0;"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.l<c80.c, PaymentSheetTopBarState> {
            b() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaymentSheetTopBarState invoke(c80.c complete) {
                s.k(complete, "complete");
                return p008h80.h0.f71089a.a(false, !d.this.interactor.a().getValue().getIsTestMode(), new PaymentSheetTopBarState.a.Maybe(complete instanceof c80.c.b, false, a.f122980c));
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class a extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final a f122980c = new a();

                a() {
                    super(0);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }

                public final void b() {
                }
            }
        }
    }
}
