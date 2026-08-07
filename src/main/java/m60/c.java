package m60;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import c60.LinkConfiguration;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.Scopes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.APIConnectionException;
import ezvcard.property.Gender;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import p010i90.a0;
import p010i90.f1;
import p010i90.j0;
import p010i90.q0;
import p010i90.r1;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001lB3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0010J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020'*\u00020\u00022\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u000e¢\u0006\u0004\b*\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000204078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00108R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u0002040:8\u0006¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b2\u0010<R\u0014\u0010?\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010BR\u0016\u0010E\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u0014\u0010G\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010H\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010DR\u0017\u0010M\u001a\u00020I8\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010S\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010V\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bT\u0010J\u001a\u0004\bU\u0010LR\u0017\u0010[\u001a\u00020W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b/\u0010ZR\u001c\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010;R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010;R\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010;R\u001c\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u00108R\u001f\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b0:8\u0006¢\u0006\f\n\u0004\be\u0010;\u001a\u0004\bf\u0010<R\u0016\u0010i\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010>R\u0011\u0010k\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010j¨\u0006m"}, d2 = {"Lm60/c;", "Landroidx/lifecycle/c1;", "Lm60/k;", "signupMode", "Lc60/c;", "config", "Ld60/c;", "linkAccountManager", "Le60/e;", "linkEventsReporter", "Lo30/d;", "logger", "<init>", "(Lm60/k;Lc60/c;Ld60/c;Le60/e;Lo30/d;)V", "Ljn0/h0;", "E", "()V", "D", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dropFirst", "B", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", Scopes.EMAIL, "phoneNumber", "name", "Lm60/m;", "x", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lm60/m;", "w", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "", AnalyticsAttribute.Error, "y", "(Ljava/lang/Throwable;)V", "hasPrefilledEmail", "hasPrefilledPhone", "Lm60/l;", "z", "(Lm60/k;ZZ)Lm60/l;", "A", "s", "Lm60/k;", "u", "()Lm60/k;", "t", "Ld60/c;", "Le60/e;", "v", "Lo30/d;", "Lm60/e;", "Lm60/e;", "initialViewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_viewState", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "Z", "showOptionalLabel", "", "Lm60/j;", "Ljava/util/Set;", "prefillEligibleFields", "Ljava/lang/String;", "prefilledEmail", "C", "prefilledPhone", "prefilledName", "Li90/r1;", "Li90/r1;", "o", "()Li90/r1;", "emailController", "Li90/q0;", Gender.FEMALE, "Li90/q0;", "r", "()Li90/q0;", "phoneController", "G", "q", "nameController", "Li90/f1;", "H", "Li90/f1;", "()Li90/f1;", "sectionController", "I", "consumerEmail", "J", "consumerPhoneNumber", "K", "consumerName", "Lk60/b;", "L", "_errorMessage", Gender.MALE, "p", "errorMessage", Gender.NONE, "hasExpanded", "()Z", "requiresNameCollection", "a", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends c1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Set<m60.j> prefillEligibleFields;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final String prefilledEmail;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final String prefilledPhone;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final String prefilledName;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final r1 emailController;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final q0 phoneController;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final r1 nameController;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final f1 sectionController;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final StateFlow<String> consumerEmail;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final StateFlow<String> consumerPhoneNumber;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final StateFlow<String> consumerName;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final MutableStateFlow<k60.b> _errorMessage;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final StateFlow<k60.b> errorMessage;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean hasExpanded;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final m60.k signupMode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final d60.c linkAccountManager;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final e60.e linkEventsReporter;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InlineSignupViewState initialViewState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<InlineSignupViewState> _viewState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<InlineSignupViewState> viewState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean showOptionalLabel;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lm60/c$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lm60/k;", "signupMode", "Lf60/b;", "linkComponent", "<init>", "(Lm60/k;Lf60/b;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Lm60/k;", "b", "Lf60/b;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m60.k signupMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final f60.b linkComponent;

        public a(m60.k signupMode, f60.b linkComponent) {
            s.k(signupMode, "signupMode");
            s.k(linkComponent, "linkComponent");
            this.signupMode = signupMode;
            this.linkComponent = linkComponent;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass) {
            s.k(modelClass, "modelClass");
            c cVarA = this.linkComponent.b().a(this.signupMode);
            s.i(cVarA, "null cannot be cast to non-null type T of com.stripe.android.link.ui.inline.InlineSignupViewModel.Factory.create");
            return cVarA;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91341a;

        static {
            int[] iArr = new int[m60.k.values().length];
            try {
                iArr[m60.k.AlongsideSaveForFutureUse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m60.k.InsteadOfSaveForFutureUse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91341a = iArr;
        }
    }

    /* JADX INFO: renamed from: m60.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "it", "", "a", "(Ln90/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class C1949c extends u implements wn0.l<FormFieldEntry, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1949c f91342c = new C1949c();

        C1949c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(FormFieldEntry it) {
            s.k(it, "it");
            if (!it.getIsComplete()) {
                it = null;
            }
            if (it != null) {
                return it.getValue();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "it", "", "a", "(Ln90/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<FormFieldEntry, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f91343c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(FormFieldEntry it) {
            s.k(it, "it");
            if (!it.getIsComplete()) {
                it = null;
            }
            if (it != null) {
                return it.getValue();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "it", "", "a", "(Ln90/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.l<FormFieldEntry, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f91344c = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(FormFieldEntry it) {
            s.k(it, "it");
            if (!it.getIsComplete()) {
                it = null;
            }
            if (it != null) {
                return it.getValue();
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel", f = "InlineSignupViewModel.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_PIN_VALUE}, m = "lookupConsumerEmail", n = {"this", Scopes.EMAIL}, s = {"L$0", "L$1"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f91345n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f91346o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f91347p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f91349r;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f91347p = obj;
            this.f91349r |= Integer.MIN_VALUE;
            return c.this.w(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Scopes.EMAIL, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchEmailInput$2", f = "InlineSignupViewModel.kt", i = {0}, l = {175, 177}, m = "invokeSuspend", n = {Scopes.EMAIL}, s = {"L$0"})
    static final class g extends SuspendLambda implements p<String, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91350n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f91351o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.l<o60.b, h0> f91352p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ c f91353q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(wn0.l<? super o60.b, h0> lVar, c cVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f91352p = lVar;
            this.f91353q = cVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation<? super h0> continuation) {
            return ((g) create(str, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f91352p, this.f91353q, continuation);
            gVar.f91351o = obj;
            return gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            if (r6.w(r1, r5) == r0) goto L20;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f91350n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L5c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f91351o
                java.lang.String r1 = (java.lang.String) r1
                jn0.t.b(r6)
                goto L40
            L22:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f91351o
                r1 = r6
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L55
                boolean r6 = p013kotlin.text.t.y0(r1)
                if (r6 == 0) goto L33
                goto L55
            L33:
                r5.f91351o = r1
                r5.f91350n = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L40
                goto L54
            L40:
                wn0.l<o60.b, jn0.h0> r6 = r5.f91352p
                o60.b r3 = o60.b.VerifyingEmail
                r6.invoke(r3)
                m60.c r6 = r5.f91353q
                r3 = 0
                r5.f91351o = r3
                r5.f91350n = r2
                java.lang.Object r6 = m60.c.j(r6, r1, r5)
                if (r6 != r0) goto L5c
            L54:
                return r0
            L55:
                wn0.l<o60.b, jn0.h0> r6 = r5.f91352p
                o60.b r0 = o60.b.InputtingPrimaryField
                r6.invoke(r0)
            L5c:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m60.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo60/b;", "signUpState", "Ljn0/h0;", "a", "(Lo60/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.l<o60.b, h0> {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f91355a;

            static {
                int[] iArr = new int[o60.b.values().length];
                try {
                    iArr[o60.b.InputtingPrimaryField.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o60.b.VerifyingEmail.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[o60.b.InputtingRemainingFields.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f91355a = iArr;
            }
        }

        h() {
            super(1);
        }

        public final void a(o60.b signUpState) {
            m userInput;
            s.k(signUpState, "signUpState");
            c.this.n();
            MutableStateFlow mutableStateFlow = c.this._viewState;
            c cVar = c.this;
            while (true) {
                Object value = mutableStateFlow.getValue();
                InlineSignupViewState inlineSignupViewState = (InlineSignupViewState) value;
                int i11 = a.f91355a[signUpState.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    userInput = inlineSignupViewState.getUserInput();
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userInput = cVar.x((String) cVar.consumerEmail.getValue(), (String) cVar.consumerPhoneNumber.getValue(), (String) cVar.consumerName.getValue());
                }
                o60.b bVar = signUpState;
                if (mutableStateFlow.compareAndSet(value, InlineSignupViewState.b(inlineSignupViewState, userInput, null, null, null, null, false, false, bVar, 126, null))) {
                    return;
                } else {
                    signUpState = bVar;
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(o60.b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel", f = "InlineSignupViewModel.kt", i = {0}, l = {146}, m = "watchPhoneInput", n = {"this"}, s = {"L$0"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f91356n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f91357o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f91359q;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f91357o = obj;
            this.f91359q |= Integer.MIN_VALUE;
            return c.this.D(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchPhoneInput$2", f = "InlineSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<String, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91360n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f91361o;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation<? super Boolean> continuation) {
            return ((j) create(str, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(continuation);
            jVar.f91361o = obj;
            return jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f91360n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            String str = (String) this.f91361o;
            return Boxing.boxBoolean(!(str == null || p013kotlin.text.t.y0(str)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$1", f = "InlineSignupViewModel.kt", i = {}, l = {124, 125, 127}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91362n;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new k(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            if (r6.B(true, r5) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (m60.c.C(r6, false, r5, 1, null) == r0) goto L22;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f91362n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L54
            L1e:
                jn0.t.b(r6)
                goto L3c
            L22:
                jn0.t.b(r6)
                m60.c r6 = m60.c.this
                m60.e r6 = m60.c.h(r6)
                boolean r6 = r6.l()
                if (r6 == 0) goto L47
                m60.c r6 = m60.c.this
                r5.f91362n = r4
                java.lang.Object r6 = m60.c.m(r6, r5)
                if (r6 != r0) goto L3c
                goto L53
            L3c:
                m60.c r6 = m60.c.this
                r5.f91362n = r3
                java.lang.Object r6 = m60.c.l(r6, r4, r5)
                if (r6 != r0) goto L54
                goto L53
            L47:
                m60.c r6 = m60.c.this
                r5.f91362n = r2
                r1 = 0
                r2 = 0
                java.lang.Object r6 = m60.c.C(r6, r1, r5, r4, r2)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m60.c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$2", f = "InlineSignupViewModel.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91364n;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.a implements r<String, String, String, Continuation<? super m>, Object>, SuspendFunction {
            a(Object obj) {
                super(4, obj, c.class, "mapToUserInput", "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;", 4);
            }

            @Override // wn0.r
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, String str2, String str3, Continuation<? super m> continuation) {
                return l.b((c) this.receiver, str, str2, str3, continuation);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm60/m;", "it", "Ljn0/h0;", "a", "(Lm60/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f91366a;

            b(c cVar) {
                this.f91366a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(m mVar, Continuation<? super h0> continuation) {
                MutableStateFlow mutableStateFlow = this.f91366a._viewState;
                while (true) {
                    Object value = mutableStateFlow.getValue();
                    m mVar2 = mVar;
                    if (mutableStateFlow.compareAndSet(value, InlineSignupViewState.b((InlineSignupViewState) value, mVar2, null, null, null, null, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null))) {
                        return h0.f84049a;
                    }
                    mVar = mVar2;
                }
            }
        }

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object b(c cVar, String str, String str2, String str3, Continuation continuation) {
            return cVar.x(str, str2, str3);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new l(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f91364n;
            if (i11 == 0) {
                t.b(obj);
                Flow flowCombine = FlowKt.combine(c.this.consumerEmail, c.this.consumerPhoneNumber, c.this.consumerName, new a(c.this));
                b bVar = new b(c.this);
                this.f91364n = 1;
                if (flowCombine.collect(bVar, this) == coroutine_suspended) {
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
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(m60.k signupMode, LinkConfiguration config, d60.c linkAccountManager, e60.e linkEventsReporter, o30.d logger) {
        s.k(signupMode, "signupMode");
        s.k(config, "config");
        s.k(linkAccountManager, "linkAccountManager");
        s.k(linkEventsReporter, "linkEventsReporter");
        s.k(logger, "logger");
        this.signupMode = signupMode;
        this.linkAccountManager = linkAccountManager;
        this.linkEventsReporter = linkEventsReporter;
        this.logger = logger;
        InlineSignupViewState inlineSignupViewStateA = InlineSignupViewState.INSTANCE.a(signupMode, config);
        this.initialViewState = inlineSignupViewStateA;
        MutableStateFlow<InlineSignupViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(inlineSignupViewStateA);
        this._viewState = MutableStateFlow;
        this.viewState = MutableStateFlow;
        boolean z11 = signupMode == m60.k.AlongsideSaveForFutureUse;
        this.showOptionalLabel = z11;
        Set<m60.j> setE = inlineSignupViewStateA.e();
        this.prefillEligibleFields = setE;
        String email = setE.contains(m60.j.Email) ? config.getCustomerInfo().getEmail() : null;
        this.prefilledEmail = email;
        String phone = setE.contains(m60.j.Phone) ? config.getCustomerInfo().getPhone() : null;
        String str = phone == null ? "" : phone;
        this.prefilledPhone = str;
        String name = setE.contains(m60.j.Name) ? config.getCustomerInfo().getName() : null;
        this.prefilledName = name;
        r1 r1VarA = a0.INSTANCE.a(email, inlineSignupViewStateA.k() && z11);
        this.emailController = r1VarA;
        q0 q0VarB = q0.Companion.b(q0.INSTANCE, str, config.getCustomerInfo().getBillingCountryCode(), null, inlineSignupViewStateA.l() && z11, false, 20, null);
        this.phoneController = q0VarB;
        r1 r1VarA2 = j0.INSTANCE.a(name);
        this.nameController = r1VarA2;
        this.sectionController = new f1(null, v.r(r1VarA, q0VarB, s() ? r1VarA2 : null));
        this.consumerEmail = r90.g.m(r1VarA.m(), C1949c.f91342c);
        this.consumerPhoneNumber = r90.g.m(q0VarB.m(), e.f91344c);
        this.consumerName = r90.g.m(r1VarA2.m(), d.f91343c);
        MutableStateFlow<k60.b> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._errorMessage = MutableStateFlow2;
        this.errorMessage = MutableStateFlow2;
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(boolean z11, Continuation<? super h0> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.drop(this.consumerEmail, z11 ? 1 : 0), new g(new h(), this, null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : h0.f84049a;
    }

    static /* synthetic */ Object C(c cVar, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return cVar.B(z11, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(Continuation<? super h0> continuation) {
        i iVar;
        c cVar;
        InlineSignupViewState value;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f91359q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f91359q = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f91357o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar.f91359q;
        if (i12 == 0) {
            t.b(obj);
            StateFlow<String> stateFlow = this.consumerPhoneNumber;
            j jVar = new j(null);
            iVar.f91356n = this;
            iVar.f91359q = 1;
            if (FlowKt.first(stateFlow, jVar, iVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) iVar.f91356n;
            t.b(obj);
        }
        MutableStateFlow<InlineSignupViewState> mutableStateFlow = cVar._viewState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, InlineSignupViewState.b(value, null, null, null, null, null, false, false, o60.b.InputtingRemainingFields, 127, null)));
        return h0.f84049a;
    }

    private final void E() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new k(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new l(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        this._errorMessage.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object w(String str, Continuation<? super h0> continuation) {
        f fVar;
        Object objB;
        c cVar;
        InlineSignupViewState value;
        boolean z11;
        InlineSignupViewState value2;
        InlineSignupViewState value3;
        String str2 = str;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f91349r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f91349r = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f91347p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f91349r;
        if (i12 == 0) {
            t.b(obj);
            n();
            d60.c cVar2 = this.linkAccountManager;
            fVar.f91345n = this;
            fVar.f91346o = str2;
            fVar.f91349r = 1;
            objB = cVar2.b(str2, false, fVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) fVar.f91346o;
            cVar = (c) fVar.f91345n;
            t.b(obj);
            objB = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            MutableStateFlow<InlineSignupViewState> mutableStateFlow = cVar._viewState;
            do {
                value = mutableStateFlow.getValue();
                z11 = thE instanceof APIConnectionException;
            } while (!mutableStateFlow.compareAndSet(value, InlineSignupViewState.b(value, null, null, null, null, null, false, z11, o60.b.InputtingPrimaryField, 63, null)));
            if (!z11) {
                cVar.y(thE);
            }
        } else if (((g60.b) objB) != null) {
            MutableStateFlow<InlineSignupViewState> mutableStateFlow2 = cVar._viewState;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, InlineSignupViewState.b(value3, new m.SignIn(str2), null, null, null, null, false, false, o60.b.InputtingPrimaryField, 62, null)));
        } else {
            MutableStateFlow<InlineSignupViewState> mutableStateFlow3 = cVar._viewState;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, InlineSignupViewState.b(value2, null, null, null, null, null, false, false, o60.b.InputtingRemainingFields, 63, null)));
            cVar.linkEventsReporter.g(true);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m x(String email, String phoneNumber, String name) {
        m60.k signupMode = this.initialViewState.getSignupMode();
        if (email != null && phoneNumber != null && signupMode != null) {
            boolean z11 = (s() && (name == null || p013kotlin.text.t.y0(name))) ? false : true;
            m.SignUp signUp = new m.SignUp(email, this.phoneController.y(phoneNumber), this.phoneController.w(), name, z(signupMode, this.prefilledEmail != null, !p013kotlin.text.t.y0(this.prefilledPhone)));
            if (z11) {
                return signUp;
            }
        }
        return null;
    }

    private final void y(Throwable error) {
        k60.b bVarA = k60.c.a(error);
        this.logger.error("Error: ", error);
        this._errorMessage.setValue(bVarA);
    }

    private final m60.l z(m60.k kVar, boolean z11, boolean z12) {
        int i11 = b.f91341a[kVar.ordinal()];
        if (i11 == 1) {
            if (z11) {
                return m60.l.ImpliedWithPrefilledEmail;
            }
            if (z11) {
                throw new NoWhenBranchMatchedException();
            }
            return m60.l.Implied;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z11 && z12) {
            return m60.l.CheckboxWithPrefilledEmailAndPhone;
        }
        return z11 ? m60.l.CheckboxWithPrefilledEmail : m60.l.Checkbox;
    }

    public final void A() {
        InlineSignupViewState value;
        InlineSignupViewState inlineSignupViewState;
        MutableStateFlow<InlineSignupViewState> mutableStateFlow = this._viewState;
        do {
            value = mutableStateFlow.getValue();
            inlineSignupViewState = value;
        } while (!mutableStateFlow.compareAndSet(value, InlineSignupViewState.b(inlineSignupViewState, null, null, null, null, null, !inlineSignupViewState.getIsExpanded(), false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null)));
        if (!this._viewState.getValue().getIsExpanded() || this.hasExpanded) {
            return;
        }
        this.hasExpanded = true;
        this.linkEventsReporter.b();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final r1 getEmailController() {
        return this.emailController;
    }

    public final StateFlow<k60.b> p() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final r1 getNameController() {
        return this.nameController;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final q0 getPhoneController() {
        return this.phoneController;
    }

    public final boolean s() {
        return this.initialViewState.c().contains(m60.j.Name);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final f1 getSectionController() {
        return this.sectionController;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final m60.k getSignupMode() {
        return this.signupMode;
    }

    public final StateFlow<InlineSignupViewState> v() {
        return this.viewState;
    }
}
