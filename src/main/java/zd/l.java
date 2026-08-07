package zd;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ezvcard.property.Gender;
import jn0.h0;
import ke.ButtonComponentParams;
import ke.FieldState;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import wn0.p;
import yd.BacsDirectDebitInputData;
import yd.BacsDirectDebitOutputData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010\u0018J\u001d\u0010(\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b+\u0010)J\u0019\u0010.\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\f2\u0006\u0010\u0010\u001a\u0002002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u0010\u001aJ\u000f\u00104\u001a\u00020,H\u0016¢\u0006\u0004\b4\u00105R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00107R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00109R\u0016\u0010<\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lzd/l;", "Landroid/widget/LinearLayout;", "Lkf/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "Ljn0/h0;", "x", "(Landroid/content/Context;)V", "Lxd/b;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "E", "(Lxd/b;Lkotlinx/coroutines/CoroutineScope;)V", "Lyd/b;", "bacsDirectDebitOutputData", "H", "(Lyd/b;)V", "u", "()V", "o", "B", "y", "r", "Lke/d;", "componentParams", "setAmountConsentSwitchText", "(Lke/d;)V", "outputData", "I", "Lke/j;", "", "bankAccountNumberFieldState", Gender.FEMALE, "(Lke/j;)V", "sortCodeFieldState", "G", "Landroid/view/View;", "view", "n", "(Landroid/view/View;)V", "Lje/b;", "b", "(Lje/b;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "a", "getView", "()Landroid/view/View;", "Lvd/b;", "Lvd/b;", "binding", "Landroid/content/Context;", "c", "Lxd/b;", "bacsDelegate", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l extends LinearLayout implements kf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vd.b binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Context localizedContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private xd.b bacsDelegate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyd/a;", "Ljn0/h0;", "a", "(Lyd/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<BacsDirectDebitInputData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f128074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Editable editable) {
            super(1);
            this.f128074c = editable;
        }

        public final void a(BacsDirectDebitInputData updateInputData) {
            s.k(updateInputData, "$this$updateInputData");
            updateInputData.j(this.f128074c.toString());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BacsDirectDebitInputData bacsDirectDebitInputData) {
            a(bacsDirectDebitInputData);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyd/a;", "Ljn0/h0;", "a", "(Lyd/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<BacsDirectDebitInputData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f128075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11) {
            super(1);
            this.f128075c = z11;
        }

        public final void a(BacsDirectDebitInputData updateInputData) {
            s.k(updateInputData, "$this$updateInputData");
            updateInputData.i(this.f128075c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BacsDirectDebitInputData bacsDirectDebitInputData) {
            a(bacsDirectDebitInputData);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyd/a;", "Ljn0/h0;", "a", "(Lyd/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<BacsDirectDebitInputData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f128076c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11) {
            super(1);
            this.f128076c = z11;
        }

        public final void a(BacsDirectDebitInputData updateInputData) {
            s.k(updateInputData, "$this$updateInputData");
            updateInputData.h(this.f128076c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BacsDirectDebitInputData bacsDirectDebitInputData) {
            a(bacsDirectDebitInputData);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyd/a;", "Ljn0/h0;", "a", "(Lyd/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<BacsDirectDebitInputData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f128077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Editable editable) {
            super(1);
            this.f128077c = editable;
        }

        public final void a(BacsDirectDebitInputData updateInputData) {
            s.k(updateInputData, "$this$updateInputData");
            updateInputData.k(this.f128077c.toString());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BacsDirectDebitInputData bacsDirectDebitInputData) {
            a(bacsDirectDebitInputData);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyd/a;", "Ljn0/h0;", "a", "(Lyd/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.l<BacsDirectDebitInputData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f128078c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Editable editable) {
            super(1);
            this.f128078c = editable;
        }

        public final void a(BacsDirectDebitInputData updateInputData) {
            s.k(updateInputData, "$this$updateInputData");
            updateInputData.m(t.F1(this.f128078c.toString()).toString());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BacsDirectDebitInputData bacsDirectDebitInputData) {
            a(bacsDirectDebitInputData);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyd/a;", "Ljn0/h0;", "a", "(Lyd/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.l<BacsDirectDebitInputData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f128079c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Editable editable) {
            super(1);
            this.f128079c = editable;
        }

        public final void a(BacsDirectDebitInputData updateInputData) {
            s.k(updateInputData, "$this$updateInputData");
            updateInputData.n(this.f128079c.toString());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BacsDirectDebitInputData bacsDirectDebitInputData) {
            a(bacsDirectDebitInputData);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyd/b;", "it", "Ljn0/h0;", "<anonymous>", "(Lyd/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.bacs.internal.ui.view.BacsDirectDebitInputView$observeDelegate$1", f = "BacsDirectDebitInputView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<BacsDirectDebitOutputData, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f128080n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f128081o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(BacsDirectDebitOutputData bacsDirectDebitOutputData, Continuation<? super h0> continuation) {
            return ((g) create(bacsDirectDebitOutputData, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = l.this.new g(continuation);
            gVar.f128081o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f128080n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            l.this.H((BacsDirectDebitOutputData) this.f128081o);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyd/a;", "Ljn0/h0;", "a", "(Lyd/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.l<BacsDirectDebitInputData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BacsDirectDebitOutputData f128083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(BacsDirectDebitOutputData bacsDirectDebitOutputData) {
            super(1);
            this.f128083c = bacsDirectDebitOutputData;
        }

        public final void a(BacsDirectDebitInputData updateInputData) {
            s.k(updateInputData, "$this$updateInputData");
            updateInputData.k(this.f128083c.b().b());
            updateInputData.j(this.f128083c.a().b());
            updateInputData.n(this.f128083c.e().b());
            updateInputData.m(this.f128083c.d().b());
            updateInputData.h(this.f128083c.getIsAccountConsentChecked());
            updateInputData.i(this.f128083c.getIsAmountConsentChecked());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BacsDirectDebitInputData bacsDirectDebitInputData) {
            a(bacsDirectDebitInputData);
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(l this$0, View view, boolean z11) {
        s.k(this$0, "this$0");
        xd.b bVar = this$0.bacsDelegate;
        Context context = null;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        ke.p validation = bVar.c().d().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutShopperEmail = this$0.binding.f119028j;
            s.j(textInputLayoutShopperEmail, "textInputLayoutShopperEmail");
            nf.j.d(textInputLayoutShopperEmail);
        } else if (validation instanceof ke.p.Invalid) {
            TextInputLayout textInputLayoutShopperEmail2 = this$0.binding.f119028j;
            s.j(textInputLayoutShopperEmail2, "textInputLayoutShopperEmail");
            Context context2 = this$0.localizedContext;
            if (context2 == null) {
                s.B("localizedContext");
            } else {
                context = context2;
            }
            String string = context.getString(((ke.p.Invalid) validation).getReason());
            s.j(string, "getString(...)");
            nf.j.j(textInputLayoutShopperEmail2, string);
        }
    }

    private final void B() {
        AdyenTextInputEditText adyenTextInputEditText = this.binding.f119023e;
        if (adyenTextInputEditText == null) {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: zd.f
                @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    l.C(this.f128065a, editable);
                }
            });
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zd.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                l.D(this.f128066a, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(l this$0, Editable it) {
        s.k(this$0, "this$0");
        s.k(it, "it");
        xd.b bVar = this$0.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        bVar.t(new f(it));
        TextInputLayout textInputLayoutSortCode = this$0.binding.f119029k;
        s.j(textInputLayoutSortCode, "textInputLayoutSortCode");
        nf.j.d(textInputLayoutSortCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(l this$0, View view, boolean z11) {
        s.k(this$0, "this$0");
        xd.b bVar = this$0.bacsDelegate;
        Context context = null;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        ke.p validation = bVar.c().e().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutSortCode = this$0.binding.f119029k;
            s.j(textInputLayoutSortCode, "textInputLayoutSortCode");
            nf.j.d(textInputLayoutSortCode);
        } else if (validation instanceof ke.p.Invalid) {
            TextInputLayout textInputLayoutSortCode2 = this$0.binding.f119029k;
            s.j(textInputLayoutSortCode2, "textInputLayoutSortCode");
            Context context2 = this$0.localizedContext;
            if (context2 == null) {
                s.B("localizedContext");
            } else {
                context = context2;
            }
            String string = context.getString(((ke.p.Invalid) validation).getReason());
            s.j(string, "getString(...)");
            nf.j.j(textInputLayoutSortCode2, string);
        }
    }

    private final void E(xd.b delegate, CoroutineScope coroutineScope) {
        FlowKt.launchIn(FlowKt.onEach(delegate.h(), new g(null)), coroutineScope);
    }

    private final void F(FieldState<String> bankAccountNumberFieldState) {
        if (bankAccountNumberFieldState.getValidation().a()) {
            n(this.binding.f119020b);
        }
    }

    private final void G(FieldState<String> sortCodeFieldState) {
        if (sortCodeFieldState.getValidation().a()) {
            n(this.binding.f119023e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(BacsDirectDebitOutputData bacsDirectDebitOutputData) {
        me.a aVar = me.a.VERBOSE;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = l.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "bacsDirectDebitOutputData changed", null);
        }
        F(bacsDirectDebitOutputData.a());
        G(bacsDirectDebitOutputData.e());
    }

    private final void I(BacsDirectDebitOutputData outputData) {
        xd.b bVar = this.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        bVar.t(new h(outputData));
    }

    private final void n(View view) {
        if (getRootView().findFocus() != view || view == null) {
            return;
        }
        findViewById(view.getNextFocusForwardId()).requestFocus();
    }

    private final void o() {
        AdyenTextInputEditText adyenTextInputEditText = this.binding.f119020b;
        if (adyenTextInputEditText == null) {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: zd.b
                @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    l.p(this.f128061a, editable);
                }
            });
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zd.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                l.q(this.f128062a, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(l this$0, Editable it) {
        s.k(this$0, "this$0");
        s.k(it, "it");
        xd.b bVar = this$0.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        bVar.t(new a(it));
        TextInputLayout textInputLayoutBankAccountNumber = this$0.binding.f119026h;
        s.j(textInputLayoutBankAccountNumber, "textInputLayoutBankAccountNumber");
        nf.j.d(textInputLayoutBankAccountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(l this$0, View view, boolean z11) {
        s.k(this$0, "this$0");
        xd.b bVar = this$0.bacsDelegate;
        Context context = null;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        ke.p validation = bVar.c().a().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutBankAccountNumber = this$0.binding.f119026h;
            s.j(textInputLayoutBankAccountNumber, "textInputLayoutBankAccountNumber");
            nf.j.d(textInputLayoutBankAccountNumber);
        } else if (validation instanceof ke.p.Invalid) {
            TextInputLayout textInputLayoutBankAccountNumber2 = this$0.binding.f119026h;
            s.j(textInputLayoutBankAccountNumber2, "textInputLayoutBankAccountNumber");
            Context context2 = this$0.localizedContext;
            if (context2 == null) {
                s.B("localizedContext");
            } else {
                context = context2;
            }
            String string = context.getString(((ke.p.Invalid) validation).getReason());
            s.j(string, "getString(...)");
            nf.j.j(textInputLayoutBankAccountNumber2, string);
        }
    }

    private final void r() {
        this.binding.f119025g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zd.j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                l.s(this.f128069a, compoundButton, z11);
            }
        });
        this.binding.f119024f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zd.k
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                l.t(this.f128070a, compoundButton, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(l this$0, CompoundButton compoundButton, boolean z11) {
        s.k(this$0, "this$0");
        xd.b bVar = this$0.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        bVar.t(new b(z11));
        TextView textViewErrorConsentAmount = this$0.binding.f119031m;
        s.j(textViewErrorConsentAmount, "textViewErrorConsentAmount");
        textViewErrorConsentAmount.setVisibility(!z11 ? 0 : 8);
    }

    private final void setAmountConsentSwitchText(ButtonComponentParams componentParams) {
        Context context;
        Amount amount = componentParams.getAmount();
        Context context2 = null;
        if (amount != null) {
            String strB = le.d.f89947a.b(amount, componentParams.getShopperLocale());
            SwitchCompat switchCompat = this.binding.f119025g;
            Context context3 = this.localizedContext;
            if (context3 == null) {
                s.B("localizedContext");
            } else {
                context2 = context3;
            }
            switchCompat.setText(context2.getString(ud.h.f116142c, strB));
            return;
        }
        SwitchCompat switchConsentAmount = this.binding.f119025g;
        s.j(switchConsentAmount, "switchConsentAmount");
        int i11 = ud.i.f116152f;
        Context context4 = this.localizedContext;
        if (context4 == null) {
            s.B("localizedContext");
            context = null;
        } else {
            context = context4;
        }
        nf.j.i(switchConsentAmount, i11, context, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(l this$0, CompoundButton compoundButton, boolean z11) {
        s.k(this$0, "this$0");
        xd.b bVar = this$0.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        bVar.t(new c(z11));
        TextView textViewErrorConsentAccount = this$0.binding.f119030l;
        s.j(textViewErrorConsentAccount, "textViewErrorConsentAccount");
        textViewErrorConsentAccount.setVisibility(!z11 ? 0 : 8);
    }

    private final void u() {
        AdyenTextInputEditText adyenTextInputEditText = this.binding.f119021c;
        if (adyenTextInputEditText == null) {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: zd.d
                @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    l.v(this.f128063a, editable);
                }
            });
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zd.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                l.w(this.f128064a, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(l this$0, Editable it) {
        s.k(this$0, "this$0");
        s.k(it, "it");
        xd.b bVar = this$0.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        bVar.t(new d(it));
        TextInputLayout textInputLayoutHolderName = this$0.binding.f119027i;
        s.j(textInputLayoutHolderName, "textInputLayoutHolderName");
        nf.j.d(textInputLayoutHolderName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(l this$0, View view, boolean z11) {
        s.k(this$0, "this$0");
        xd.b bVar = this$0.bacsDelegate;
        Context context = null;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        ke.p validation = bVar.c().b().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutHolderName = this$0.binding.f119027i;
            s.j(textInputLayoutHolderName, "textInputLayoutHolderName");
            nf.j.d(textInputLayoutHolderName);
        } else if (validation instanceof ke.p.Invalid) {
            TextInputLayout textInputLayoutHolderName2 = this$0.binding.f119027i;
            s.j(textInputLayoutHolderName2, "textInputLayoutHolderName");
            Context context2 = this$0.localizedContext;
            if (context2 == null) {
                s.B("localizedContext");
            } else {
                context = context2;
            }
            String string = context.getString(((ke.p.Invalid) validation).getReason());
            s.j(string, "getString(...)");
            nf.j.j(textInputLayoutHolderName2, string);
        }
    }

    private final void x(Context localizedContext) {
        TextInputLayout textInputLayoutHolderName = this.binding.f119027i;
        s.j(textInputLayoutHolderName, "textInputLayoutHolderName");
        nf.j.g(textInputLayoutHolderName, ud.i.f116148b, localizedContext);
        TextInputLayout textInputLayoutBankAccountNumber = this.binding.f119026h;
        s.j(textInputLayoutBankAccountNumber, "textInputLayoutBankAccountNumber");
        nf.j.g(textInputLayoutBankAccountNumber, ud.i.f116147a, localizedContext);
        TextInputLayout textInputLayoutSortCode = this.binding.f119029k;
        s.j(textInputLayoutSortCode, "textInputLayoutSortCode");
        nf.j.g(textInputLayoutSortCode, ud.i.f116150d, localizedContext);
        TextInputLayout textInputLayoutShopperEmail = this.binding.f119028j;
        s.j(textInputLayoutShopperEmail, "textInputLayoutShopperEmail");
        nf.j.g(textInputLayoutShopperEmail, ud.i.f116149c, localizedContext);
        SwitchCompat switchConsentAccount = this.binding.f119024f;
        s.j(switchConsentAccount, "switchConsentAccount");
        nf.j.i(switchConsentAccount, ud.i.f116151e, localizedContext, false, 4, null);
        xd.b bVar = this.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        setAmountConsentSwitchText(bVar.getComponentParams());
    }

    private final void y() {
        AdyenTextInputEditText adyenTextInputEditText = this.binding.f119022d;
        if (adyenTextInputEditText == null) {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: zd.h
                @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    l.z(this.f128067a, editable);
                }
            });
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zd.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                l.A(this.f128068a, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(l this$0, Editable it) {
        s.k(this$0, "this$0");
        s.k(it, "it");
        xd.b bVar = this$0.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        bVar.t(new e(it));
        TextInputLayout textInputLayoutShopperEmail = this$0.binding.f119028j;
        s.j(textInputLayoutShopperEmail, "textInputLayoutShopperEmail");
        nf.j.d(textInputLayoutShopperEmail);
    }

    @Override // kf.e
    public void a() {
        boolean z11;
        xd.b bVar = this.bacsDelegate;
        Context context = null;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        BacsDirectDebitOutputData bacsDirectDebitOutputDataC = bVar.c();
        ke.p validation = bacsDirectDebitOutputDataC.b().getValidation();
        boolean z12 = true;
        if (validation instanceof ke.p.Invalid) {
            this.binding.f119021c.requestFocus();
            TextInputLayout textInputLayoutHolderName = this.binding.f119027i;
            s.j(textInputLayoutHolderName, "textInputLayoutHolderName");
            Context context2 = this.localizedContext;
            if (context2 == null) {
                s.B("localizedContext");
                context2 = null;
            }
            String string = context2.getString(((ke.p.Invalid) validation).getReason());
            s.j(string, "getString(...)");
            nf.j.j(textInputLayoutHolderName, string);
            z11 = true;
        } else {
            z11 = false;
        }
        ke.p validation2 = bacsDirectDebitOutputDataC.a().getValidation();
        if (validation2 instanceof ke.p.Invalid) {
            if (!z11) {
                this.binding.f119020b.requestFocus();
                z11 = true;
            }
            TextInputLayout textInputLayoutBankAccountNumber = this.binding.f119026h;
            s.j(textInputLayoutBankAccountNumber, "textInputLayoutBankAccountNumber");
            Context context3 = this.localizedContext;
            if (context3 == null) {
                s.B("localizedContext");
                context3 = null;
            }
            String string2 = context3.getString(((ke.p.Invalid) validation2).getReason());
            s.j(string2, "getString(...)");
            nf.j.j(textInputLayoutBankAccountNumber, string2);
        }
        ke.p validation3 = bacsDirectDebitOutputDataC.e().getValidation();
        if (validation3 instanceof ke.p.Invalid) {
            if (!z11) {
                this.binding.f119023e.requestFocus();
                z11 = true;
            }
            TextInputLayout textInputLayoutSortCode = this.binding.f119029k;
            s.j(textInputLayoutSortCode, "textInputLayoutSortCode");
            Context context4 = this.localizedContext;
            if (context4 == null) {
                s.B("localizedContext");
                context4 = null;
            }
            String string3 = context4.getString(((ke.p.Invalid) validation3).getReason());
            s.j(string3, "getString(...)");
            nf.j.j(textInputLayoutSortCode, string3);
        }
        ke.p validation4 = bacsDirectDebitOutputDataC.d().getValidation();
        if (validation4 instanceof ke.p.Invalid) {
            if (!z11) {
                this.binding.f119022d.requestFocus();
            }
            TextInputLayout textInputLayoutShopperEmail = this.binding.f119028j;
            s.j(textInputLayoutShopperEmail, "textInputLayoutShopperEmail");
            Context context5 = this.localizedContext;
            if (context5 == null) {
                s.B("localizedContext");
            } else {
                context = context5;
            }
            String string4 = context.getString(((ke.p.Invalid) validation4).getReason());
            s.j(string4, "getString(...)");
            nf.j.j(textInputLayoutShopperEmail, string4);
        }
        if (!bacsDirectDebitOutputDataC.getIsAmountConsentChecked()) {
            if (z11) {
                z12 = z11;
            } else {
                this.binding.f119025g.requestFocus();
            }
            TextView textViewErrorConsentAmount = this.binding.f119031m;
            s.j(textViewErrorConsentAmount, "textViewErrorConsentAmount");
            textViewErrorConsentAmount.setVisibility(0);
            z11 = z12;
        }
        if (bacsDirectDebitOutputDataC.getIsAccountConsentChecked()) {
            return;
        }
        if (!z11) {
            this.binding.f119024f.requestFocus();
        }
        TextView textViewErrorConsentAccount = this.binding.f119030l;
        s.j(textViewErrorConsentAccount, "textViewErrorConsentAccount");
        textViewErrorConsentAccount.setVisibility(0);
    }

    @Override // kf.e
    public void b(je.b delegate, CoroutineScope coroutineScope, Context localizedContext) {
        s.k(delegate, "delegate");
        s.k(coroutineScope, "coroutineScope");
        s.k(localizedContext, "localizedContext");
        if (!(delegate instanceof xd.b)) {
            throw new IllegalArgumentException("Unsupported delegate type");
        }
        xd.b bVar = (xd.b) delegate;
        this.bacsDelegate = bVar;
        this.localizedContext = localizedContext;
        x(localizedContext);
        E(bVar, coroutineScope);
        xd.b bVar2 = this.bacsDelegate;
        if (bVar2 == null) {
            s.B("bacsDelegate");
            bVar2 = null;
        }
        BacsDirectDebitOutputData bacsDirectDebitOutputDataC = bVar2.c();
        I(bacsDirectDebitOutputDataC);
        this.binding.f119021c.setText(bacsDirectDebitOutputDataC.b().b());
        this.binding.f119020b.setText(bacsDirectDebitOutputDataC.a().b());
        this.binding.f119023e.setText(bacsDirectDebitOutputDataC.e().b());
        this.binding.f119022d.setText(bacsDirectDebitOutputDataC.d().b());
        this.binding.f119025g.setChecked(bacsDirectDebitOutputDataC.getIsAmountConsentChecked());
        this.binding.f119024f.setChecked(bacsDirectDebitOutputDataC.getIsAccountConsentChecked());
        u();
        o();
        B();
        y();
        r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        vd.b bVarB = vd.b.b(LayoutInflater.from(context), this);
        s.j(bVarB, "inflate(...)");
        this.binding = bVarB;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(gf.d.f68798b);
        setPadding(dimension, dimension, dimension, 0);
    }

    @Override // kf.e
    public View getView() {
        return this;
    }
}
