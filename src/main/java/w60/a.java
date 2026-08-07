package w60;

import c60.LinkConfiguration;
import c60.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.StateFlow;
import m60.InlineSignupViewState;
import m60.f;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import r90.g;
import wn0.l;
import wn0.p;
import z80.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lw60/a;", "Lz80/z1;", "Lw60/b;", "configuration", "Lc60/d;", "linkConfigurationCoordinator", "Lkotlin/Function1;", "Lm60/e;", "Ljn0/h0;", "onLinkInlineSignupStateChanged", "<init>", "(Lw60/b;Lc60/d;Lwn0/l;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "enabled", "f", "(ZLr2/l;I)V", DateTokenConverter.CONVERTER_KEY, "Lw60/b;", "e", "Lc60/d;", "Lwn0/l;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LinkInlineConfiguration configuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d linkConfigurationCoordinator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<InlineSignupViewState, h0> onLinkInlineSignupStateChanged;

    /* JADX INFO: renamed from: w60.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2592a extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f121086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f121087e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2592a(boolean z11, int i11) {
            super(2);
            this.f121086d = z11;
            this.f121087e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            a.this.f(this.f121086d, lVar, k2.a(this.f121087e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(LinkInlineConfiguration configuration, d linkConfigurationCoordinator, l<? super InlineSignupViewState, h0> onLinkInlineSignupStateChanged) {
        super(IdentifierSpec.INSTANCE.a("link_form"), true);
        s.k(configuration, "configuration");
        s.k(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        s.k(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.configuration = configuration;
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.onLinkInlineSignupStateChanged = onLinkInlineSignupStateChanged;
    }

    @Override // p010i90.d0
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c() {
        return g.n(v.m());
    }

    @Override // z80.z1
    public void f(boolean z11, p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(-736893023);
        if (o.J()) {
            o.S(-736893023, i11, -1, "com.stripe.android.lpmfoundations.paymentmethod.link.LinkFormElement.ComposeUI (LinkFormElement.kt:25)");
        }
        f.a(this.linkConfigurationCoordinator, this.configuration.getLinkConfiguration(), this.configuration.getSignupMode(), z11, this.onLinkInlineSignupStateChanged, lVarV, (LinkConfiguration.f18792i << 3) | 8 | ((i11 << 9) & 7168));
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C2592a(z11, i11));
        }
    }
}
