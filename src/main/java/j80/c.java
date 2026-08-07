package j80;

import androidx.p003lifecycle.d1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import f30.y;
import g80.WalletsState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n70.DisplayableSavedPaymentMethod;
import okhttp3.internal.http2.Http2Connection;
import p010i90.d0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import u70.FormFieldValues;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 p2\u00020\u0001:\u0001GBÃ\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\t\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\u0004\u0012\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0004\u0012\u001a\u0010\u001e\u001a\u0016\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u001c\u0012\u0004\u0012\u00020\u001d0\t\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100\t\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\t\u0012\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u0004\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u00100\t\u0012\u0014\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00100\t\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0016\u0010)\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u001c\u0012\u0004\u0012\u00020\u00100\t\u0012\u0016\u0010*\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u001c\u0012\u0004\u0012\u00020\u00100\t\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J-\u00101\u001a\b\u0012\u0004\u0012\u0002000\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b3\u00104J3\u00105\u001a\u0004\u0018\u00010 2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b5\u00106J1\u00109\u001a\u0002082\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\b\u00107\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u0002082\u0006\u0010\u001f\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\nH\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00102\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010ER \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010ER\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR(\u0010\u001e\u001a\u0016\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u001c\u0012\u0004\u0012\u00020\u001d0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010ER\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010NR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010ER \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010ER\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010NR\u0014\u0010%\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u00100\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ER\"\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00100\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010ER\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010NR$\u0010)\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u001c\u0012\u0004\u0012\u00020\u00100\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010ER$\u0010*\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u001c\u0012\u0004\u0012\u00020\u00100\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010ER\u001a\u0010+\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010T\u001a\u0004\bS\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020a0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001c\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010NR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u0002080\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010NR \u0010m\u001a\b\u0012\u0004\u0012\u00020i0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010N\u001a\u0004\bk\u0010lR \u0010o\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010N\u001a\u0004\bD\u0010l¨\u0006q"}, d2 = {"Lj80/c;", "Lj80/n;", "Lu60/e;", "paymentMethodMetadata", "Lkotlinx/coroutines/flow/StateFlow;", "", "processing", "Lw70/j;", "selection", "Lkotlin/Function1;", "", "", "Li90/d0;", "formElementsForCode", "requiresFormScreen", "Lx70/c;", "Ljn0/h0;", "transitionTo", "Lkotlin/Function2;", "Lu70/c;", "onFormFieldValuesChanged", "Lkotlin/Function0;", "manageScreenFactory", "manageOneSavedPaymentMethodFactory", "formScreenFactory", "Lcom/stripe/android/model/v0;", "paymentMethods", "mostRecentlySelectedSavedPaymentMethod", "Lcom/stripe/android/model/PaymentMethodCode;", "Lx30/c;", "providePaymentMethodName", "canRemove", "Ln70/g;", "onEditPaymentMethod", "onSelectSavedPaymentMethod", "Lg80/n;", "walletsState", "isFlowController", "onMandateTextUpdated", "updateSelection", "isCurrentScreen", "reportPaymentMethodTypeSelected", "reportFormShown", "isLiveMode", "Lkotlin/coroutines/CoroutineContext;", "dispatcher", "<init>", "(Lu60/e;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/p;Lwn0/a;Lwn0/a;Lwn0/l;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/l;Lkotlinx/coroutines/flow/StateFlow;Lwn0/l;Lwn0/l;Lkotlinx/coroutines/flow/StateFlow;ZLwn0/l;Lwn0/l;Lkotlinx/coroutines/flow/StateFlow;Lwn0/l;Lwn0/l;ZLkotlin/coroutines/CoroutineContext;)V", "Lj80/e;", "o", "(Ljava/util/List;Lg80/n;)Ljava/util/List;", "r", "(Lg80/n;)Z", "p", "(Ljava/util/List;Lu60/e;Lcom/stripe/android/model/v0;)Ln70/g;", "savedPaymentMethod", "Lj80/n$a;", "m", "(Ljava/util/List;Ln70/g;Z)Lj80/n$a;", "q", "(ZLn70/g;)Lj80/n$a;", "selectedPaymentMethodCode", "s", "(Ljava/lang/String;)V", "Lj80/n$c;", "viewAction", "b", "(Lj80/n$c;)V", "a", "Lwn0/l;", "c", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "e", "Lwn0/a;", "f", "g", "h", "Lkotlinx/coroutines/flow/StateFlow;", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "n", "Z", "t", "()Z", "Lkotlinx/coroutines/CoroutineScope;", "u", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/MutableStateFlow;", "v", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_verticalModeScreenSelection", "w", "verticalModeScreenSelection", "Lt60/g;", "x", "Ljava/util/List;", "supportedPaymentMethods", "y", "displayedSavedPaymentMethod", "z", "availableSavedPaymentMethodAction", "Lj80/n$b;", "A", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "B", "showsWalletsHeader", "C", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements n {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int D = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final StateFlow<n.State> state;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final StateFlow<Boolean> showsWalletsHeader;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, List<d0>> formElementsForCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, Boolean> requiresFormScreen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<x70.c, h0> transitionTo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<FormFieldValues, String, h0> onFormFieldValuesChanged;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<x70.c> manageScreenFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<x70.c> manageOneSavedPaymentMethodFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, x70.c> formScreenFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, x30.c> providePaymentMethodName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> canRemove;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<DisplayableSavedPaymentMethod, h0> onEditPaymentMethod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<PaymentMethod, h0> onSelectSavedPaymentMethod;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<WalletsState> walletsState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isFlowController;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<x30.c, h0> onMandateTextUpdated;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<w70.j, h0> updateSelection;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isCurrentScreen;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, h0> reportPaymentMethodTypeSelected;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, h0> reportFormShown;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<w70.j> _verticalModeScreenSelection;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<w70.j> verticalModeScreenSelection;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final List<SupportedPaymentMethod> supportedPaymentMethods;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<DisplayableSavedPaymentMethod> displayedSavedPaymentMethod;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<n.a> availableSavedPaymentMethodAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$1", f = "PaymentMethodVerticalLayoutInteractor.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_PIN_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f82865n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ StateFlow<w70.j> f82866o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c f82867p;

        /* JADX INFO: renamed from: j80.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/j;", "it", "Ljn0/h0;", "a", "(Lw70/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C1738a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f82868a;

            C1738a(c cVar) {
                this.f82868a = cVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(w70.j jVar, Continuation<? super h0> continuation) {
                if (jVar == null) {
                    return h0.f84049a;
                }
                String strC = q70.c.c(jVar instanceof w70.j.e ? (w70.j.e) jVar : null);
                if (strC == null) {
                    strC = q70.c.c(jVar instanceof w70.j.ExternalPaymentMethod ? (w70.j.ExternalPaymentMethod) jVar : null);
                }
                if (strC == null || !((Boolean) this.f82868a.requiresFormScreen.invoke(strC)).booleanValue()) {
                    this.f82868a._verticalModeScreenSelection.setValue(jVar);
                }
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(StateFlow<? extends w70.j> stateFlow, c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f82866o = stateFlow;
            this.f82867p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f82866o, this.f82867p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f82865n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<w70.j> stateFlow = this.f82866o;
                C1738a c1738a = new C1738a(this.f82867p);
                this.f82865n = 1;
                if (stateFlow.collect(c1738a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$2", f = "PaymentMethodVerticalLayoutInteractor.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f82869n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/v0;", "mostRecentlySelectedSavedPaymentMethod", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/v0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f82871a;

            a(c cVar) {
                this.f82871a = cVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(PaymentMethod paymentMethod, Continuation<? super h0> continuation) {
                if (paymentMethod == null && (this.f82871a.verticalModeScreenSelection.getValue() instanceof w70.j.Saved)) {
                    this.f82871a._verticalModeScreenSelection.setValue(null);
                }
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f82869n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flowDrop = FlowKt.drop(c.this.mostRecentlySelectedSavedPaymentMethod, 1);
                a aVar = new a(c.this);
                this.f82869n = 1;
                if (flowDrop.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: j80.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$3", f = "PaymentMethodVerticalLayoutInteractor.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class C1739c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f82872n;

        /* JADX INFO: renamed from: j80.c$c$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isCurrentScreen", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f82874a;

            a(c cVar) {
                this.f82874a = cVar;
            }

            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                if (z11) {
                    this.f82874a.updateSelection.invoke(this.f82874a.verticalModeScreenSelection.getValue());
                }
                return h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C1739c(Continuation<? super C1739c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new C1739c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f82872n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow stateFlow = c.this.isCurrentScreen;
                a aVar = new a(c.this);
                this.f82872n = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1739c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: j80.c$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lj80/c$d;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Lu60/e;", "paymentMethodMetadata", "Ln70/b;", "customerStateHolder", "Lj80/n;", "a", "(Lk80/a;Lu60/e;Ln70/b;)Lj80/n;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j80.c$d$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx70/c;", "b", "()Lx70/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<x70.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82875c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ PaymentMethodMetadata f82876d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ n70.b f82877e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k80.a aVar, PaymentMethodMetadata paymentMethodMetadata, n70.b bVar) {
                super(0);
                this.f82875c = aVar;
                this.f82876d = paymentMethodMetadata;
                this.f82877e = bVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x70.c invoke() {
                j80.a.Companion companion = j80.a.INSTANCE;
                k80.a aVar = this.f82875c;
                return new x70.c.h(companion.a(aVar, this.f82876d, this.f82877e, aVar.getSavedPaymentMethodMutator()));
            }
        }

        /* JADX INFO: renamed from: j80.c$d$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedPaymentMethodCode", "Lx70/c;", "a", "(Ljava/lang/String;)Lx70/c;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.l<String, x70.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82878c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ PaymentMethodMetadata f82879d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ n70.b f82880e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k80.a aVar, PaymentMethodMetadata paymentMethodMetadata, n70.b bVar) {
                super(1);
                this.f82878c = aVar;
                this.f82879d = paymentMethodMetadata;
                this.f82880e = bVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x70.c invoke(String selectedPaymentMethodCode) {
                p013kotlin.jvm.internal.s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                return new x70.c.l(d.INSTANCE.a(selectedPaymentMethodCode, this.f82878c, this.f82879d, this.f82880e), false, 2, null);
            }
        }

        /* JADX INFO: renamed from: j80.c$d$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln70/g;", "it", "Ljn0/h0;", "a", "(Ln70/g;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1740c extends p013kotlin.jvm.internal.u implements wn0.l<DisplayableSavedPaymentMethod, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82881c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1740c(k80.a aVar) {
                super(1);
                this.f82881c = aVar;
            }

            public final void a(DisplayableSavedPaymentMethod it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                this.f82881c.getSavedPaymentMethodMutator().s(it.getPaymentMethod());
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
                a(displayableSavedPaymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.c$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/v0;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/v0;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1741d extends p013kotlin.jvm.internal.u implements wn0.l<PaymentMethod, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82882c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1741d(k80.a aVar) {
                super(1);
                this.f82882c = aVar;
            }

            public final void a(PaymentMethod it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                this.f82882c.I(new w70.j.Saved(it, null, null, 6, null));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(PaymentMethod paymentMethod) {
                a(paymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.c$d$e */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx30/c;", "it", "Ljn0/h0;", "a", "(Lx30/c;)V"}, k = 3, mv = {1, 9, 0})
        static final class e extends p013kotlin.jvm.internal.u implements wn0.l<x30.c, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82883c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(k80.a aVar) {
                super(1);
                this.f82883c = aVar;
            }

            public final void a(x30.c cVar) {
                this.f82883c.getMandateHandler().e(cVar, true);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(x30.c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.c$d$f */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class f extends p013kotlin.jvm.internal.p implements wn0.l<String, List<? extends d0>> {
            f(Object obj) {
                super(1, obj, n70.k.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final List<d0> invoke(String p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return ((n70.k) this.receiver).b(p11);
            }
        }

        /* JADX INFO: renamed from: j80.c$d$g */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class g extends p013kotlin.jvm.internal.p implements wn0.l<String, Boolean> {
            g(Object obj) {
                super(1, obj, n70.k.class, "requiresFormScreen", "requiresFormScreen(Ljava/lang/String;)Z", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return Boolean.valueOf(((n70.k) this.receiver).d(p11));
            }
        }

        /* JADX INFO: renamed from: j80.c$d$h */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class h extends p013kotlin.jvm.internal.p implements wn0.l<x70.c, h0> {
            h(Object obj) {
                super(1, obj, x70.b.class, "transitionToWithDelay", "transitionToWithDelay(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V", 0);
            }

            public final void a(x70.c p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((x70.b) this.receiver).o(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(x70.c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.c$d$i */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class i extends p013kotlin.jvm.internal.p implements wn0.p<FormFieldValues, String, h0> {
            i(Object obj) {
                super(2, obj, n70.k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void a(FormFieldValues formFieldValues, String p11) {
                p013kotlin.jvm.internal.s.k(p11, "p1");
                ((n70.k) this.receiver).c(formFieldValues, p11);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(FormFieldValues formFieldValues, String str) {
                a(formFieldValues, str);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.c$d$j */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class j extends p013kotlin.jvm.internal.p implements wn0.l<w70.j, h0> {
            j(Object obj) {
                super(1, obj, k80.a.class, "updateSelection", "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void a(w70.j jVar) {
                ((k80.a) this.receiver).Q(jVar);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w70.j jVar) {
                a(jVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.c$d$k */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx70/c;", "it", "", "a", "(Lx70/c;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class k extends p013kotlin.jvm.internal.u implements wn0.l<x70.c, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final k f82884c = new k();

            k() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(x70.c it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                return Boolean.valueOf(it instanceof x70.c.k);
            }
        }

        /* JADX INFO: renamed from: j80.c$d$l */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class l extends p013kotlin.jvm.internal.p implements wn0.l<String, h0> {
            l(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                o(str);
                return h0.f84049a;
            }

            public final void o(String p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((EventReporter) this.receiver).q(p11);
            }
        }

        /* JADX INFO: renamed from: j80.c$d$m */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class m extends p013kotlin.jvm.internal.p implements wn0.l<String, h0> {
            m(Object obj) {
                super(1, obj, EventReporter.class, "onPaymentMethodFormShown", "onPaymentMethodFormShown(Ljava/lang/String;)V", 0);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                o(str);
                return h0.f84049a;
            }

            public final void o(String p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((EventReporter) this.receiver).j(p11);
            }
        }

        /* JADX INFO: renamed from: j80.c$d$n */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx70/c;", "b", "()Lx70/c;"}, k = 3, mv = {1, 9, 0})
        static final class n extends p013kotlin.jvm.internal.u implements wn0.a<x70.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82885c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ PaymentMethodMetadata f82886d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ n70.b f82887e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(k80.a aVar, PaymentMethodMetadata paymentMethodMetadata, n70.b bVar) {
                super(0);
                this.f82885c = aVar;
                this.f82886d = paymentMethodMetadata;
                this.f82887e = bVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x70.c invoke() {
                j80.b.Companion companion = j80.b.INSTANCE;
                k80.a aVar = this.f82885c;
                return new x70.c.i(companion.b(aVar, this.f82886d, this.f82887e, aVar.getSavedPaymentMethodMutator()));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j80.n a(k80.a viewModel, PaymentMethodMetadata paymentMethodMetadata, n70.b customerStateHolder) {
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
            p013kotlin.jvm.internal.s.k(customerStateHolder, "customerStateHolder");
            n70.k kVarA = n70.k.INSTANCE.a(viewModel, n70.m.INSTANCE.a(viewModel, d1.a(viewModel)), paymentMethodMetadata);
            return new c(paymentMethodMetadata, viewModel.z(), viewModel.C(), new f(kVarA), new g(kVarA), new h(viewModel.getNavigationHandler()), new i(kVarA), new n(viewModel, paymentMethodMetadata, customerStateHolder), new a(viewModel, paymentMethodMetadata, customerStateHolder), new b(viewModel, paymentMethodMetadata, customerStateHolder), customerStateHolder.c(), customerStateHolder.b(), viewModel.getSavedPaymentMethodMutator().q(), viewModel.getSavedPaymentMethodMutator().m(), new C1740c(viewModel), new C1741d(viewModel), viewModel.E(), !viewModel.getIsCompleteFlow(), new e(viewModel), new j(viewModel), r90.g.m(viewModel.getNavigationHandler().f(), k.f82884c), new l(viewModel.getEventReporter()), new m(viewModel.getEventReporter()), paymentMethodMetadata.getStripeIntent().getIsLiveMode(), null, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/stripe/android/model/v0;", "paymentMethods", "Ln70/g;", "displayedSavedPaymentMethod", "", "canRemove", "Lj80/n$a;", "a", "(Ljava/util/List;Ln70/g;Z)Lj80/n$a;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.q<List<? extends PaymentMethod>, DisplayableSavedPaymentMethod, Boolean, n.a> {
        e() {
            super(3);
        }

        public final n.a a(List<PaymentMethod> paymentMethods, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z11) {
            p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
            return c.this.m(paymentMethods, displayableSavedPaymentMethod, z11);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ n.a invoke(List<? extends PaymentMethod> list, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, Boolean bool) {
            return a(list, displayableSavedPaymentMethod, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/stripe/android/model/v0;", "paymentMethods", "mostRecentlySelectedSavedPaymentMethod", "Ln70/g;", "a", "(Ljava/util/List;Lcom/stripe/android/model/v0;)Ln70/g;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.p<List<? extends PaymentMethod>, PaymentMethod, DisplayableSavedPaymentMethod> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PaymentMethodMetadata f82890d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(PaymentMethodMetadata paymentMethodMetadata) {
            super(2);
            this.f82890d = paymentMethodMetadata;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DisplayableSavedPaymentMethod invoke(List<PaymentMethod> paymentMethods, PaymentMethod paymentMethod) {
            p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
            return c.this.p(paymentMethods, this.f82890d, paymentMethod);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<h0> {
        g() {
            super(0);
        }

        public final void b() {
            c.this.updateSelection.invoke(w70.j.d.f121147b);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<h0> {
        h() {
            super(0);
        }

        public final void b() {
            c.this.updateSelection.invoke(w70.j.c.f121146b);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SupportedPaymentMethod f82894d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(SupportedPaymentMethod supportedPaymentMethod) {
            super(0);
            this.f82894d = supportedPaymentMethod;
        }

        public final void b() {
            c.this.b(new n.c.PaymentMethodSelected(this.f82894d.getCode()));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg80/n;", "walletsState", "", "a", "(Lg80/n;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.l<WalletsState, Boolean> {
        j() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WalletsState walletsState) {
            return Boolean.valueOf(!c.this.r(walletsState));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "Lcom/stripe/android/model/v0;", "paymentMethods", "", "isProcessing", "Lw70/j;", "mostRecentSelection", "Ln70/g;", "displayedSavedPaymentMethod", "Lg80/n;", "walletsState", "Lj80/n$a;", "action", "Lj80/n$b;", "a", "(Ljava/util/List;ZLw70/j;Ln70/g;Lg80/n;Lj80/n$a;)Lj80/n$b;"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.t<List<? extends PaymentMethod>, Boolean, w70.j, DisplayableSavedPaymentMethod, WalletsState, n.a, n.State> {
        k() {
            super(6);
        }

        public final n.State a(List<PaymentMethod> paymentMethods, boolean z11, w70.j jVar, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, WalletsState walletsState, n.a action) {
            p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
            p013kotlin.jvm.internal.s.k(action, "action");
            return new n.State(c.this.o(paymentMethods, walletsState), z11, jVar, displayableSavedPaymentMethod, action);
        }

        @Override // wn0.t
        public /* bridge */ /* synthetic */ n.State i(List<? extends PaymentMethod> list, Boolean bool, w70.j jVar, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, WalletsState walletsState, n.a aVar) {
            return a(list, bool.booleanValue(), jVar, displayableSavedPaymentMethod, walletsState, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(PaymentMethodMetadata paymentMethodMetadata, StateFlow<Boolean> processing, StateFlow<? extends w70.j> selection, wn0.l<? super String, ? extends List<? extends d0>> formElementsForCode, wn0.l<? super String, Boolean> requiresFormScreen, wn0.l<? super x70.c, h0> transitionTo, wn0.p<? super FormFieldValues, ? super String, h0> onFormFieldValuesChanged, wn0.a<? extends x70.c> manageScreenFactory, wn0.a<? extends x70.c> manageOneSavedPaymentMethodFactory, wn0.l<? super String, ? extends x70.c> formScreenFactory, StateFlow<? extends List<PaymentMethod>> paymentMethods, StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod, wn0.l<? super String, ? extends x30.c> providePaymentMethodName, StateFlow<Boolean> canRemove, wn0.l<? super DisplayableSavedPaymentMethod, h0> onEditPaymentMethod, wn0.l<? super PaymentMethod, h0> onSelectSavedPaymentMethod, StateFlow<WalletsState> walletsState, boolean z11, wn0.l<? super x30.c, h0> onMandateTextUpdated, wn0.l<? super w70.j, h0> updateSelection, StateFlow<Boolean> isCurrentScreen, wn0.l<? super String, h0> reportPaymentMethodTypeSelected, wn0.l<? super String, h0> reportFormShown, boolean z12, CoroutineContext dispatcher) {
        p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
        p013kotlin.jvm.internal.s.k(processing, "processing");
        p013kotlin.jvm.internal.s.k(selection, "selection");
        p013kotlin.jvm.internal.s.k(formElementsForCode, "formElementsForCode");
        p013kotlin.jvm.internal.s.k(requiresFormScreen, "requiresFormScreen");
        p013kotlin.jvm.internal.s.k(transitionTo, "transitionTo");
        p013kotlin.jvm.internal.s.k(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        p013kotlin.jvm.internal.s.k(manageScreenFactory, "manageScreenFactory");
        p013kotlin.jvm.internal.s.k(manageOneSavedPaymentMethodFactory, "manageOneSavedPaymentMethodFactory");
        p013kotlin.jvm.internal.s.k(formScreenFactory, "formScreenFactory");
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        p013kotlin.jvm.internal.s.k(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        p013kotlin.jvm.internal.s.k(providePaymentMethodName, "providePaymentMethodName");
        p013kotlin.jvm.internal.s.k(canRemove, "canRemove");
        p013kotlin.jvm.internal.s.k(onEditPaymentMethod, "onEditPaymentMethod");
        p013kotlin.jvm.internal.s.k(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        p013kotlin.jvm.internal.s.k(walletsState, "walletsState");
        p013kotlin.jvm.internal.s.k(onMandateTextUpdated, "onMandateTextUpdated");
        p013kotlin.jvm.internal.s.k(updateSelection, "updateSelection");
        p013kotlin.jvm.internal.s.k(isCurrentScreen, "isCurrentScreen");
        p013kotlin.jvm.internal.s.k(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        p013kotlin.jvm.internal.s.k(reportFormShown, "reportFormShown");
        p013kotlin.jvm.internal.s.k(dispatcher, "dispatcher");
        this.formElementsForCode = formElementsForCode;
        this.requiresFormScreen = requiresFormScreen;
        this.transitionTo = transitionTo;
        this.onFormFieldValuesChanged = onFormFieldValuesChanged;
        this.manageScreenFactory = manageScreenFactory;
        this.manageOneSavedPaymentMethodFactory = manageOneSavedPaymentMethodFactory;
        this.formScreenFactory = formScreenFactory;
        this.mostRecentlySelectedSavedPaymentMethod = mostRecentlySelectedSavedPaymentMethod;
        this.providePaymentMethodName = providePaymentMethodName;
        this.canRemove = canRemove;
        this.onEditPaymentMethod = onEditPaymentMethod;
        this.onSelectSavedPaymentMethod = onSelectSavedPaymentMethod;
        this.walletsState = walletsState;
        this.isFlowController = z11;
        this.onMandateTextUpdated = onMandateTextUpdated;
        this.updateSelection = updateSelection;
        this.isCurrentScreen = isCurrentScreen;
        this.reportPaymentMethodTypeSelected = reportPaymentMethodTypeSelected;
        this.reportFormShown = reportFormShown;
        this.isLiveMode = z12;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.coroutineScope = CoroutineScope;
        MutableStateFlow<w70.j> MutableStateFlow = StateFlowKt.MutableStateFlow(selection.getValue());
        this._verticalModeScreenSelection = MutableStateFlow;
        this.verticalModeScreenSelection = MutableStateFlow;
        this.supportedPaymentMethods = paymentMethodMetadata.E();
        StateFlow<DisplayableSavedPaymentMethod> stateFlowH = r90.g.h(paymentMethods, mostRecentlySelectedSavedPaymentMethod, new f(paymentMethodMetadata));
        this.displayedSavedPaymentMethod = stateFlowH;
        StateFlow<n.a> stateFlowG = r90.g.g(paymentMethods, stateFlowH, canRemove, new e());
        this.availableSavedPaymentMethodAction = stateFlowG;
        this.state = r90.g.d(paymentMethods, processing, MutableStateFlow, stateFlowH, walletsState, stateFlowG, new k());
        this.showsWalletsHeader = r90.g.m(walletsState, new j());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(selection, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new b(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new C1739c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.a m(List<PaymentMethod> paymentMethods, DisplayableSavedPaymentMethod savedPaymentMethod, boolean canRemove) {
        if (paymentMethods == null || savedPaymentMethod == null) {
            return n.a.NONE;
        }
        int size = paymentMethods.size();
        if (size != 0) {
            return size != 1 ? n.a.MANAGE_ALL : q(canRemove, savedPaymentMethod);
        }
        return n.a.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DisplayablePaymentMethod> o(List<PaymentMethod> paymentMethods, WalletsState walletsState) {
        List<SupportedPaymentMethod> list = this.supportedPaymentMethods;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (SupportedPaymentMethod supportedPaymentMethod : list) {
            arrayList.add(supportedPaymentMethod.a(paymentMethods, new i(supportedPaymentMethod)));
        }
        ArrayList arrayList2 = new ArrayList();
        if (r(walletsState)) {
            if (walletsState != null && walletsState.getLink() != null) {
                arrayList2.add(new DisplayablePaymentMethod(PaymentMethod.p.Link.code, x30.d.a(f30.d0.B0), n70.u.f93490v, null, null, false, x30.d.a(f30.d0.C0), new g()));
            }
            if (walletsState != null && walletsState.getGooglePay() != null) {
                arrayList2.add(new DisplayablePaymentMethod("google_pay", x30.d.a(f30.d0.f63973t0), y.f64221c, null, null, false, null, new h()));
            }
        }
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (p013kotlin.jvm.internal.s.f(((DisplayablePaymentMethod) it.next()).getCode(), PaymentMethod.p.Card.code)) {
                List<DisplayablePaymentMethod> listP1 = v.p1(arrayList);
                listP1.addAll(i11 + 1, arrayList2);
                return listP1;
            }
            i11++;
        }
        i11 = -1;
        List<DisplayablePaymentMethod> listP2 = v.p1(arrayList);
        listP2.addAll(i11 + 1, arrayList2);
        return listP2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisplayableSavedPaymentMethod p(List<PaymentMethod> paymentMethods, PaymentMethodMetadata paymentMethodMetadata, PaymentMethod mostRecentlySelectedSavedPaymentMethod) {
        if (mostRecentlySelectedSavedPaymentMethod == null) {
            mostRecentlySelectedSavedPaymentMethod = paymentMethods != null ? (PaymentMethod) v.q0(paymentMethods) : null;
        }
        if (mostRecentlySelectedSavedPaymentMethod != null) {
            return q.a(mostRecentlySelectedSavedPaymentMethod, this.providePaymentMethodName, paymentMethodMetadata);
        }
        return null;
    }

    private final n.a q(boolean canRemove, DisplayableSavedPaymentMethod savedPaymentMethod) {
        if (savedPaymentMethod == null || !savedPaymentMethod.f()) {
            return canRemove ? n.a.MANAGE_ONE : n.a.NONE;
        }
        return n.a.EDIT_CARD_BRAND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(WalletsState walletsState) {
        return (!this.isFlowController || walletsState == null || walletsState.getGooglePay() == null) ? false : true;
    }

    private final void s(String selectedPaymentMethodCode) {
        this.onFormFieldValuesChanged.invoke(new FormFieldValues(null, w70.j.a.NoRequest, 1, null), selectedPaymentMethodCode);
    }

    @Override // j80.n
    public StateFlow<Boolean> a() {
        return this.showsWalletsHeader;
    }

    @Override // j80.n
    public void b(n.c viewAction) {
        x30.c mandateText;
        p013kotlin.jvm.internal.s.k(viewAction, "viewAction");
        if (!(viewAction instanceof n.c.PaymentMethodSelected)) {
            if (viewAction instanceof n.c.SavedPaymentMethodSelected) {
                this.reportPaymentMethodTypeSelected.invoke("saved");
                this.onSelectSavedPaymentMethod.invoke(((n.c.SavedPaymentMethodSelected) viewAction).getSavedPaymentMethod());
                return;
            } else if (p013kotlin.jvm.internal.s.f(viewAction, n.c.e.f83042a)) {
                this.transitionTo.invoke(this.manageScreenFactory.invoke());
                return;
            } else if (p013kotlin.jvm.internal.s.f(viewAction, n.c.d.f83041a)) {
                this.transitionTo.invoke(this.manageOneSavedPaymentMethodFactory.invoke());
                return;
            } else {
                if (viewAction instanceof n.c.EditPaymentMethod) {
                    this.onEditPaymentMethod.invoke(((n.c.EditPaymentMethod) viewAction).getSavedPaymentMethod());
                    return;
                }
                return;
            }
        }
        n.c.PaymentMethodSelected paymentMethodSelected = (n.c.PaymentMethodSelected) viewAction;
        this.reportPaymentMethodTypeSelected.invoke(paymentMethodSelected.getSelectedPaymentMethodCode());
        if (this.requiresFormScreen.invoke(paymentMethodSelected.getSelectedPaymentMethodCode()).booleanValue()) {
            this.reportFormShown.invoke(paymentMethodSelected.getSelectedPaymentMethodCode());
            this.transitionTo.invoke(this.formScreenFactory.invoke(paymentMethodSelected.getSelectedPaymentMethodCode()));
            return;
        }
        s(paymentMethodSelected.getSelectedPaymentMethodCode());
        Iterator<T> it = this.formElementsForCode.invoke(paymentMethodSelected.getSelectedPaymentMethodCode()).iterator();
        do {
            if (!it.hasNext()) {
                mandateText = null;
                break;
            }
            mandateText = ((d0) it.next()).getMandateText();
        } while (mandateText == null);
        if (mandateText != null) {
            this.onMandateTextUpdated.invoke(mandateText);
        }
    }

    @Override // j80.n
    public StateFlow<n.State> getState() {
        return this.state;
    }

    @Override // j80.n
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    public /* synthetic */ c(PaymentMethodMetadata paymentMethodMetadata, StateFlow stateFlow, StateFlow stateFlow2, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, wn0.p pVar, wn0.a aVar, wn0.a aVar2, wn0.l lVar4, StateFlow stateFlow3, StateFlow stateFlow4, wn0.l lVar5, StateFlow stateFlow5, wn0.l lVar6, wn0.l lVar7, StateFlow stateFlow6, boolean z11, wn0.l lVar8, wn0.l lVar9, StateFlow stateFlow7, wn0.l lVar10, wn0.l lVar11, boolean z12, CoroutineContext coroutineContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodMetadata, stateFlow, stateFlow2, lVar, lVar2, lVar3, pVar, aVar, aVar2, lVar4, stateFlow3, stateFlow4, lVar5, stateFlow5, lVar6, lVar7, stateFlow6, z11, lVar8, lVar9, stateFlow7, lVar10, lVar11, z12, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Dispatchers.getDefault() : coroutineContext);
    }
}
