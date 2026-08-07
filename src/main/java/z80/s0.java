package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.AccountRange;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002\u0080\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!JR\u0010.\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0017ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010@\u001a\u00020<8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b:\u0010?R \u0010C\u001a\u00020A8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\bB\u0010?R\u001a\u0010G\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\b2\u0010FR\u001a\u0010I\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u00103\u001a\u0004\bH\u00105R \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000b0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010V\u001a\b\u0012\u0004\u0012\u00020\u000b0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010M\u001a\u0004\bU\u0010OR \u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010OR \u0010[\u001a\b\u0012\u0004\u0012\u00020\u000b0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010M\u001a\u0004\bZ\u0010OR\u0014\u0010\\\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00107R \u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0]0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010`R\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010SR \u0010f\u001a\b\u0012\u0004\u0012\u00020^0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010M\u001a\u0004\be\u0010OR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020^0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010MR \u0010i\u001a\b\u0012\u0004\u0012\u00020^0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010M\u001a\u0004\bh\u0010OR\u001a\u0010k\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\bj\u00107\u001a\u0004\bj\u00109R \u0010r\u001a\u00020l8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\be\u0010m\u0012\u0004\bp\u0010q\u001a\u0004\bn\u0010oR\"\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010M\u001a\u0004\b=\u0010OR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00140J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010MR \u0010y\u001a\b\u0012\u0004\u0012\u00020\u00140J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010M\u001a\u0004\bb\u0010OR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\r0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010SR \u0010}\u001a\b\u0012\u0004\u0012\u00020\r0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010M\u001a\u0004\b0\u0010OR \u0010~\u001a\b\u0012\u0004\u0012\u00020\r0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010M\u001a\u0004\bL\u0010OR$\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u007f0J8\u0016X\u0096\u0004¢\u0006\r\n\u0004\bX\u0010M\u001a\u0005\b\u0080\u0001\u0010OR#\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\r0J8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010M\u001a\u0005\b\u0083\u0001\u0010OR#\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010J8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u0085\u0001\u0010M\u001a\u0004\bW\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Lz80/s0;", "Lz80/k0;", "Lz80/j0;", "cardTextFieldConfig", "Lh30/b;", "cardAccountRangeRepository", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "workContext", "Lh30/p;", "staticCardAccountRanges", "", "initialValue", "", "showOptionalLabel", "Lz80/b0;", "cardBrandChoiceConfig", "<init>", "(Lz80/j0;Lh30/b;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lh30/p;Ljava/lang/String;ZLz80/b0;)V", "displayFormatted", "Li90/x1;", "q", "(Ljava/lang/String;)Li90/x1;", "rawValue", "Ljn0/h0;", "t", "(Ljava/lang/String;)V", "newHasFocus", "h", "(Z)V", "Li90/w1$a$a;", "item", IntegerTokenConverter.CONVERTER_KEY, "(Li90/w1$a$a;)V", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "b", "Lz80/j0;", "c", "Ljava/lang/String;", "l", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Z", "n", "()Z", "e", "Lz80/b0;", "Lo4/x;", "f", "I", "()I", "capitalization", "Lo4/y;", "o", "keyboardType", "Lo4/z0;", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "getDebugLabel", "debugLabel", "Lkotlinx/coroutines/flow/StateFlow;", "", "j", "Lkotlinx/coroutines/flow/StateFlow;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", AnnotatedPrivateKey.LABEL, "Lkotlinx/coroutines/flow/MutableStateFlow;", "k", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_fieldValue", "p", "fieldValue", "m", "D", "rawFieldValue", "getContentDescription", "contentDescription", "isEligibleForCardBrandChoice", "", "Lcom/stripe/android/model/h;", "brandChoices", "Ljava/util/List;", "preferredBrands", "r", "mostRecentUserSelectedBrand", "s", "w", "selectedCardBrandFlow", "impliedCardBrand", "u", "cardBrandFlow", "v", "cardScanEnabled", "Lh30/c;", "Lh30/c;", "C", "()Lh30/c;", "getAccountRangeService$annotations", "()V", "accountRangeService", "Li90/w1;", "x", "trailingIcon", "y", "_fieldState", "z", "fieldState", "A", "_hasFocus", "B", "loading", "visibleError", "Li90/c0;", "a", AnalyticsAttribute.Error, "E", "isComplete", "Ln90/a;", Gender.FEMALE, "formFieldValue", "G", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s0 extends k0 {
    private static final a G = new a(null);
    public static final int H = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final MutableStateFlow<Boolean> _hasFocus;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final StateFlow<Boolean> loading;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final StateFlow<Boolean> visibleError;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final StateFlow<p010i90.c0> error;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final StateFlow<Boolean> isComplete;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final StateFlow<FormFieldEntry> formFieldValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j0 cardTextFieldConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean showOptionalLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0 cardBrandChoiceConfig;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int capitalization;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int keyboardType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final o4.z0 visualTransformation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> label;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<String> _fieldValue;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> fieldValue;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> rawFieldValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> contentDescription;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isEligibleForCardBrandChoice;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<List<com.stripe.android.model.h>> brandChoices;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final List<com.stripe.android.model.h> preferredBrands;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<com.stripe.android.model.h> mostRecentUserSelectedBrand;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<com.stripe.android.model.h> selectedCardBrandFlow;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<com.stripe.android.model.h> impliedCardBrand;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<com.stripe.android.model.h> cardBrandFlow;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean cardScanEnabled;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final h30.c accountRangeService;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.w1> trailingIcon;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.x1> _fieldState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.x1> fieldState;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz80/s0$a;", "", "<init>", "()V", "", "STATIC_ICON_COUNT", "I", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$1", f = "CardNumberController.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127776n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c90.a f127778p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li90/x1;", "state", "Ljn0/h0;", "<anonymous>", "(Li90/x1;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$1$1", f = "CardNumberController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<p010i90.x1, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f127779n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f127780o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c90.a f127781p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c90.a aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f127781p = aVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p010i90.x1 x1Var, Continuation<? super jn0.h0> continuation) {
                return ((a) create(x1Var, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f127781p, continuation);
                aVar.f127780o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f127779n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                if (((p010i90.x1) this.f127780o) instanceof i90.z1.a) {
                    this.f127781p.a();
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c90.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f127778p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return s0.this.new b(this.f127778p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f127776n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flowDrop = FlowKt.drop(s0.this.r(), 1);
                a aVar = new a(this.f127778p, null);
                this.f127776n = 1;
                if (FlowKt.collectLatest(flowDrop, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f127783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p010i90.j1 f127784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f127785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f127786g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f127787h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f127788i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f127789j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f127790k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, p010i90.j1 j1Var, androidx.compose.ui.d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
            super(2);
            this.f127783d = z11;
            this.f127784e = j1Var;
            this.f127785f = dVar;
            this.f127786g = set;
            this.f127787h = identifierSpec;
            this.f127788i = i11;
            this.f127789j = i12;
            this.f127790k = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            s0.this.g(this.f127783d, this.f127784e, this.f127785f, this.f127786g, this.f127787h, this.f127788i, this.f127789j, lVar, p020r2.k2.a(this.f127790k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/model/h;", "brand", "", "fieldValue", "Li90/x1;", "a", "(Lcom/stripe/android/model/h;Ljava/lang/String;)Li90/x1;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<com.stripe.android.model.h, String, p010i90.x1> {
        d() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p010i90.x1 invoke(com.stripe.android.model.h brand, String fieldValue) {
            p013kotlin.jvm.internal.s.k(brand, "brand");
            p013kotlin.jvm.internal.s.k(fieldValue, "fieldValue");
            j0 j0Var = s0.this.cardTextFieldConfig;
            AccountRange accountRangeD = s0.this.getAccountRangeService().d();
            return j0Var.c(brand, fieldValue, accountRangeD != null ? accountRangeD.getPanLength() : brand.getMaxLengthForCardNumber(fieldValue));
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"z80/s0$e", "Lh30/c$a;", "", "Lcom/stripe/android/model/a;", "accountRanges", "Ljn0/h0;", "a", "(Ljava/util/List;)V", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements h30.c.a {
        e() {
        }

        @Override // h30.c.a
        public void a(List<AccountRange> accountRanges) {
            p013kotlin.jvm.internal.s.k(accountRanges, "accountRanges");
            AccountRange accountRange = (AccountRange) p013kotlin.collections.v.q0(accountRanges);
            if (accountRange != null) {
                int panLength = accountRange.getPanLength();
                o4.z0 visualTransformation = s0.this.getVisualTransformation();
                p013kotlin.jvm.internal.s.i(visualTransformation, "null cannot be cast to non-null type com.stripe.android.ui.core.elements.CardNumberVisualTransformation");
                ((m0) visualTransformation).a(Integer.valueOf(panLength));
            }
            List<AccountRange> list = accountRanges;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AccountRange) it.next()).b());
            }
            s0.this.brandChoices.setValue(p013kotlin.collections.v.h0(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(s0.this.isEligibleForCardBrandChoice);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/stripe/android/model/h;", InquiryField.ChoicesField.TYPE, "selected", "a", "(Ljava/util/List;Lcom/stripe/android/model/h;)Lcom/stripe/android/model/h;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.p<List<? extends com.stripe.android.model.h>, com.stripe.android.model.h, com.stripe.android.model.h> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f127794c = new g();

        g() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.model.h invoke(List<? extends com.stripe.android.model.h> choices, com.stripe.android.model.h selected) {
            p013kotlin.jvm.internal.s.k(choices, "choices");
            p013kotlin.jvm.internal.s.k(selected, "selected");
            com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.W0(choices);
            return hVar == null ? selected : hVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<String, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f127795c = new h();

        h() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return w80.a.a(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "visibleError", "Li90/x1;", "fieldState", "Li90/c0;", "a", "(ZLi90/x1;)Li90/c0;"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.p<Boolean, p010i90.x1, p010i90.c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f127796c = new i();

        i() {
            super(2);
        }

        public final p010i90.c0 a(boolean z11, p010i90.x1 fieldState) {
            p013kotlin.jvm.internal.s.k(fieldState, "fieldState");
            p010i90.c0 c0VarA = fieldState.a();
            if (c0VarA == null || !z11) {
                return null;
            }
            return c0VarA;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ p010i90.c0 invoke(Boolean bool, p010i90.x1 x1Var) {
            return a(bool.booleanValue(), x1Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "complete", "", "value", "Ln90/a;", "a", "(ZLjava/lang/String;)Ln90/a;"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.p<Boolean, String, FormFieldEntry> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f127797c = new j();

        j() {
            super(2);
        }

        public final FormFieldEntry a(boolean z11, String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return new FormFieldEntry(value, z11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ FormFieldEntry invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/stripe/android/model/h;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/h;"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<String, com.stripe.android.model.h> {
        k() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.model.h invoke(String it) {
            com.stripe.android.model.h hVarB;
            p013kotlin.jvm.internal.s.k(it, "it");
            AccountRange accountRangeD = s0.this.getAccountRangeService().d();
            if (accountRangeD != null && (hVarB = accountRangeD.b()) != null) {
                return hVarB;
            }
            com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.q0(com.stripe.android.model.h.INSTANCE.c(it));
            return hVar == null ? com.stripe.android.model.h.Unknown : hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li90/x1;", "it", "", "a", "(Li90/x1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.l<p010i90.x1, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f127799c = new l();

        l() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p010i90.x1 it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return Boolean.valueOf(it.isValid());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.l<String, String> {
        m() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return s0.this.cardTextFieldConfig.b(it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/model/h;", "previous", "", InquiryField.ChoicesField.TYPE, "a", "(Lcom/stripe/android/model/h;Ljava/util/List;)Lcom/stripe/android/model/h;"}, k = 3, mv = {1, 9, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.p<com.stripe.android.model.h, List<? extends com.stripe.android.model.h>, com.stripe.android.model.h> {
        n() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.model.h invoke(com.stripe.android.model.h hVar, List<? extends com.stripe.android.model.h> choices) {
            Object next;
            p013kotlin.jvm.internal.s.k(choices, "choices");
            com.stripe.android.model.h hVar2 = com.stripe.android.model.h.Unknown;
            if (hVar == hVar2) {
                return hVar;
            }
            if (p013kotlin.collections.v.g0(choices, hVar)) {
                return hVar == null ? hVar2 : hVar;
            }
            Iterator it = s0.this.preferredBrands.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!choices.contains((com.stripe.android.model.h) next));
            com.stripe.android.model.h hVar3 = (com.stripe.android.model.h) next;
            return hVar3 == null ? com.stripe.android.model.h.Unknown : hVar3;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", InquiryField.FloatField.TYPE2, "", "Lcom/stripe/android/model/h;", "brands", "chosen", "Li90/w1;", "a", "(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/h;)Li90/w1;"}, k = 3, mv = {1, 9, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.q<String, List<? extends com.stripe.android.model.h>, com.stripe.android.model.h, p010i90.w1> {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f127803a;

            static {
                int[] iArr = new int[com.stripe.android.model.h.values().length];
                try {
                    iArr[com.stripe.android.model.h.Unknown.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f127803a = iArr;
            }
        }

        o() {
            super(3);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p010i90.w1 invoke(String number, List<? extends com.stripe.android.model.h> brands, com.stripe.android.model.h chosen) {
            p010i90.w1.Dropdown.Item item;
            p013kotlin.jvm.internal.s.k(number, "number");
            p013kotlin.jvm.internal.s.k(brands, "brands");
            p013kotlin.jvm.internal.s.k(chosen, "chosen");
            if (!s0.this.isEligibleForCardBrandChoice || number.length() <= 0) {
                if (s0.this.getAccountRangeService().d() != null) {
                    AccountRange accountRangeD = s0.this.getAccountRangeService().d();
                    p013kotlin.jvm.internal.s.h(accountRangeD);
                    return new p010i90.w1.Trailing(accountRangeD.b().getIcon(), null, false, null, 10, null);
                }
                List<com.stripe.android.model.h> listC = com.stripe.android.model.h.INSTANCE.c(number);
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listC, 10));
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(new p010i90.w1.Trailing(((com.stripe.android.model.h) it.next()).getIcon(), null, false, null, 10, null));
                }
                List listD1 = p013kotlin.collections.v.d1(arrayList, 3);
                ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listC, 10));
                Iterator<T> it2 = listC.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new p010i90.w1.Trailing(((com.stripe.android.model.h) it2.next()).getIcon(), null, false, null, 10, null));
                }
                return new p010i90.w1.MultiTrailing(listD1, p013kotlin.collections.v.i0(arrayList2, 3));
            }
            com.stripe.android.model.h hVar = com.stripe.android.model.h.Unknown;
            p010i90.w1.Dropdown.Item item2 = new p010i90.w1.Dropdown.Item(hVar.getCode(), x30.d.a(f30.d0.X), hVar.getIcon());
            if (brands.size() == 1) {
                com.stripe.android.model.h hVar2 = brands.get(0);
                item = new p010i90.w1.Dropdown.Item(hVar2.getCode(), x30.d.b(hVar2.getDisplayName()), hVar2.getIcon());
            } else {
                item = a.f127803a[chosen.ordinal()] == 1 ? null : new p010i90.w1.Dropdown.Item(chosen.getCode(), x30.d.b(chosen.getDisplayName()), chosen.getIcon());
            }
            List<? extends com.stripe.android.model.h> list = brands;
            ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (com.stripe.android.model.h hVar3 : list) {
                arrayList3.add(new p010i90.w1.Dropdown.Item(hVar3.getCode(), x30.d.b(hVar3.getDisplayName()), hVar3.getIcon()));
            }
            x30.c cVarA = x30.d.a(f30.d0.Y);
            if (item != null) {
                item2 = item;
            }
            return new p010i90.w1.Dropdown(cVarA, brands.size() < 2, item2, arrayList3);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li90/x1;", "fieldState", "", "hasFocus", "a", "(Li90/x1;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.p<p010i90.x1, Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f127804c = new p();

        p() {
            super(2);
        }

        public final Boolean a(p010i90.x1 fieldState, boolean z11) {
            p013kotlin.jvm.internal.s.k(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Boolean invoke(p010i90.x1 x1Var, Boolean bool) {
            return a(x1Var, bool.booleanValue());
        }
    }

    public /* synthetic */ s0(j0 j0Var, h30.b bVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, h30.p pVar, String str, boolean z11, b0 b0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j0Var, bVar, coroutineContext, coroutineContext2, (i11 & 16) != 0 ? new h30.k() : pVar, str, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? b0.b.f127364a : b0Var);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final h30.c getAccountRangeService() {
        return this.accountRangeService;
    }

    public StateFlow<String> D() {
        return this.rawFieldValue;
    }

    @Override // p010i90.l1
    public StateFlow<p010i90.c0> a() {
        return this.error;
    }

    @Override // p010i90.v1
    public StateFlow<Boolean> b() {
        return this.loading;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: c, reason: from getter */
    public o4.z0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // p010i90.v1
    public StateFlow<p010i90.w1> f() {
        return this.trailingIcon;
    }

    @Override // z80.k0, p010i90.v1, p010i90.i1
    public void g(boolean z11, p010i90.j1 field, androidx.compose.ui.d modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i11, int i12, p020r2.l lVar, int i13) {
        p013kotlin.jvm.internal.s.k(field, "field");
        p013kotlin.jvm.internal.s.k(modifier, "modifier");
        p013kotlin.jvm.internal.s.k(hiddenIdentifiers, "hiddenIdentifiers");
        p020r2.l lVarV = lVar.v(722479676);
        if (p020r2.o.J()) {
            p020r2.o.S(722479676, i13, -1, "com.stripe.android.ui.core.elements.DefaultCardNumberController.ComposeUI (CardNumberController.kt:314)");
        }
        Function0.g(jn0.h0.f84049a, new b((c90.a) lVarV.U(c90.b.a()), null), lVarV, 70);
        super.g(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, lVarV, (i13 & 14) | 16781376 | (i13 & 896) | (IdentifierSpec.f76539d << 12) | (57344 & i13) | (458752 & i13) | (3670016 & i13));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i13));
        }
    }

    @Override // p010i90.v1
    public StateFlow<String> getContentDescription() {
        return this.contentDescription;
    }

    @Override // p010i90.v1
    public StateFlow<Integer> getLabel() {
        return this.label;
    }

    @Override // p010i90.v1
    public void h(boolean newHasFocus) {
        this._hasFocus.setValue(Boolean.valueOf(newHasFocus));
    }

    @Override // p010i90.v1
    public void i(p010i90.w1.Dropdown.Item item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        this.mostRecentUserSelectedBrand.setValue(com.stripe.android.model.h.INSTANCE.b(item.getId()));
    }

    @Override // p010i90.h0
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // p010i90.v1
    public StateFlow<Boolean> j() {
        return this.visibleError;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: l, reason: from getter */
    public String getInitialValue() {
        return this.initialValue;
    }

    @Override // p010i90.h0
    public StateFlow<FormFieldEntry> m() {
        return this.formFieldValue;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: o, reason: from getter */
    public int getKeyboardType() {
        return this.keyboardType;
    }

    @Override // p010i90.v1
    public StateFlow<String> p() {
        return this.fieldValue;
    }

    @Override // p010i90.v1
    public p010i90.x1 q(String displayFormatted) {
        p013kotlin.jvm.internal.s.k(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.cardTextFieldConfig.d(displayFormatted));
        this.accountRangeService.h(new h30.f.Unvalidated(displayFormatted));
        return null;
    }

    @Override // p010i90.v1
    public StateFlow<p010i90.x1> r() {
        return this.fieldState;
    }

    @Override // p010i90.h0
    public void t(String rawValue) {
        p013kotlin.jvm.internal.s.k(rawValue, "rawValue");
        q(this.cardTextFieldConfig.a(rawValue));
    }

    @Override // z80.k0
    public StateFlow<com.stripe.android.model.h> u() {
        return this.cardBrandFlow;
    }

    @Override // z80.k0
    /* JADX INFO: renamed from: v, reason: from getter */
    public boolean getCardScanEnabled() {
        return this.cardScanEnabled;
    }

    @Override // z80.k0
    public StateFlow<com.stripe.android.model.h> w() {
        return this.selectedCardBrandFlow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(j0 cardTextFieldConfig, h30.b cardAccountRangeRepository, CoroutineContext uiContext, CoroutineContext workContext, h30.p staticCardAccountRanges, String str, boolean z11, b0 cardBrandChoiceConfig) {
        List<com.stripe.android.model.h> listM;
        super(null);
        p013kotlin.jvm.internal.s.k(cardTextFieldConfig, "cardTextFieldConfig");
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepository, "cardAccountRangeRepository");
        p013kotlin.jvm.internal.s.k(uiContext, "uiContext");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(staticCardAccountRanges, "staticCardAccountRanges");
        p013kotlin.jvm.internal.s.k(cardBrandChoiceConfig, "cardBrandChoiceConfig");
        com.stripe.android.model.h initialBrand = null;
        this.cardTextFieldConfig = cardTextFieldConfig;
        this.initialValue = str;
        this.showOptionalLabel = z11;
        this.cardBrandChoiceConfig = cardBrandChoiceConfig;
        this.capitalization = cardTextFieldConfig.getCapitalization();
        this.keyboardType = cardTextFieldConfig.getKeyboard();
        this.visualTransformation = cardTextFieldConfig.getVisualTransformation();
        this.debugLabel = cardTextFieldConfig.getDebugLabel();
        this.label = r90.g.n(Integer.valueOf(cardTextFieldConfig.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String()));
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        this.rawFieldValue = r90.g.m(MutableStateFlow, new m());
        this.contentDescription = r90.g.m(MutableStateFlow, h.f127795c);
        boolean z12 = cardBrandChoiceConfig instanceof b0.Eligible;
        this.isEligibleForCardBrandChoice = z12;
        MutableStateFlow<List<com.stripe.android.model.h>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(p013kotlin.collections.v.m());
        this.brandChoices = MutableStateFlow2;
        if (cardBrandChoiceConfig instanceof b0.Eligible) {
            listM = ((b0.Eligible) cardBrandChoiceConfig).b();
        } else {
            if (!(cardBrandChoiceConfig instanceof b0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            listM = p013kotlin.collections.v.m();
        }
        this.preferredBrands = listM;
        if (cardBrandChoiceConfig instanceof b0.Eligible) {
            initialBrand = ((b0.Eligible) cardBrandChoiceConfig).getInitialBrand();
        } else if (!(cardBrandChoiceConfig instanceof b0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        MutableStateFlow<com.stripe.android.model.h> MutableStateFlow3 = StateFlowKt.MutableStateFlow(initialBrand);
        this.mostRecentUserSelectedBrand = MutableStateFlow3;
        this.selectedCardBrandFlow = r90.g.h(MutableStateFlow3, MutableStateFlow2, new n());
        StateFlow<com.stripe.android.model.h> stateFlowM = r90.g.m(MutableStateFlow, new k());
        this.impliedCardBrand = stateFlowM;
        this.cardBrandFlow = z12 ? r90.g.h(MutableStateFlow2, w(), g.f127794c) : stateFlowM;
        this.cardScanEnabled = true;
        h30.c cVar = new h30.c(cardAccountRangeRepository, uiContext, workContext, staticCardAccountRanges, new e(), new f());
        this.accountRangeService = cVar;
        this.trailingIcon = r90.g.g(MutableStateFlow, MutableStateFlow2, w(), new o());
        StateFlow<p010i90.x1> stateFlowH = r90.g.h(stateFlowM, MutableStateFlow, new d());
        this._fieldState = stateFlowH;
        this.fieldState = stateFlowH;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._hasFocus = MutableStateFlow4;
        this.loading = cVar.g();
        this.visibleError = r90.g.h(stateFlowH, MutableStateFlow4, p.f127804c);
        this.error = r90.g.h(j(), stateFlowH, i.f127796c);
        this.isComplete = r90.g.m(stateFlowH, l.f127799c);
        this.formFieldValue = r90.g.h(isComplete(), D(), j.f127797c);
        String initialValue = getInitialValue();
        t(initialValue != null ? initialValue : "");
    }
}
