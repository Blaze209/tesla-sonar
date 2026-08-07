package g80;

import c60.LinkConfiguration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n0;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.y;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import n70.r;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p017o70.AddressDetails;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import w60.LinkInlineConfiguration;
import w70.q;
import z80.ExternalPaymentMethodSpec;
import z80.b1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0001\u0018\u00002\u00020\u0001:\u0001,B\u0095\u0001\b\u0007\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J<\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-JF\u00104\u001a\b\u0012\u0004\u0012\u0002030*2\u0006\u0010$\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\b\u00102\u001a\u0004\u0018\u000100H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J1\u0010;\u001a\u00020:2\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002032\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u00020'H\u0002¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020%2\u0006\u00106\u001a\u000203H\u0002¢\u0006\u0004\b?\u0010@J:\u0010I\u001a\u0004\u0018\u00010H2\b\u0010A\u001a\u0004\u0018\u00010>2\u0006\u0010B\u001a\u00020:2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010G\u001a\u00020FH\u0082@¢\u0006\u0004\bI\u0010JJ&\u0010M\u001a\b\u0012\u0004\u0012\u00020L0/2\u0006\u0010B\u001a\u00020:2\u0006\u0010K\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bM\u0010NJ,\u0010O\u001a\u0004\u0018\u0001072\u0006\u00106\u001a\u0002032\u0006\u0010=\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010>H\u0082@¢\u0006\u0004\bO\u0010PJX\u0010V\u001a\u0002072\u0006\u0010=\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010>2\u0006\u00106\u001a\u0002032\b\u0010Q\u001a\u0004\u0018\u0001002\u0006\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020'2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020'0TH\u0082@¢\u0006\u0004\bV\u0010WJP\u0010Y\u001a\u00020X2\u0006\u0010=\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010>2\u0006\u00106\u001a\u0002032\b\u0010Q\u001a\u0004\u0018\u0001002\u0006\u0010R\u001a\u00020'2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020'0TH\u0082@¢\u0006\u0004\bY\u0010ZJ \u0010[\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u000203H\u0082@¢\u0006\u0004\b[\u0010\\J\u0014\u0010]\u001a\u00020'*\u00020%H\u0082@¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020'H\u0082@¢\u0006\u0004\b_\u0010`J0\u0010b\u001a\u0004\u0018\u00010a2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0CH\u0082@¢\u0006\u0004\bb\u0010cJ(\u0010d\u001a\u00020D2\u0006\u0010=\u001a\u00020%2\u0006\u00109\u001a\u00020'2\u0006\u00106\u001a\u000203H\u0082@¢\u0006\u0004\bd\u0010eJ\u001a\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010=\u001a\u00020%H\u0082@¢\u0006\u0004\bg\u0010^J(\u0010i\u001a\u00020D2\u0006\u0010=\u001a\u00020%2\u0006\u00109\u001a\u00020'2\u0006\u0010h\u001a\u00020'H\u0082@¢\u0006\u0004\bi\u0010jJ\u001b\u0010m\u001a\u0004\u0018\u00010l2\b\u0010k\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010r\u001a\u00020q2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020'2\u0006\u0010B\u001a\u00020:H\u0002¢\u0006\u0004\bt\u0010uJ7\u0010w\u001a\u00020q2\u0006\u00106\u001a\u0002032\u0006\u0010k\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010v\u001a\u00020'2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020q2\u0006\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\b{\u0010|J2\u0010\u0080\u0001\u001a\u00020q2\u000e\u0010}\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\u000e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020~\u0018\u00010/H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R#\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010\u0082\u0001R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0082\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u009c\u0001"}, d2 = {"Lg80/d;", "Lg80/h;", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/y$j;", "Ln70/r;", "prefsRepositoryFactory", "La60/d;", "Lcom/stripe/android/googlepaylauncher/l;", "googlePayRepositoryFactory", "Lf80/b;", "elementsSessionRepository", "Lcom/stripe/android/paymentsheet/repositories/b;", "customerRepository", "Lt60/d;", "lpmRepository", "Lo30/d;", "logger", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lh70/h;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lg80/f;", "accountStatusProvider", "Ld60/d;", "linkStore", "Lz80/b1;", "externalPaymentMethodsRepository", "Lz30/j;", "userFacingLogger", "Lr70/a;", "cvcRecollectionHandler", "<init>", "(Lwn0/l;Lwn0/l;Lf80/b;Lcom/stripe/android/paymentsheet/repositories/b;Lt60/d;Lo30/d;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lh70/h;Lkotlin/coroutines/CoroutineContext;Lg80/f;Ld60/d;Lz80/b1;Lz30/j;Lr70/a;)V", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lcom/stripe/android/paymentsheet/y$h;", "paymentSheetConfiguration", "", "isReloadingAfterProcessDeath", "initializedViaCompose", "Ljn0/s;", "Lg80/l;", "a", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$h;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customer", "", "", "externalPaymentMethods", "defaultPaymentMethodId", "Lcom/stripe/android/model/h0;", "I", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$j;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementsSession", "Lg80/g;", "linkState", "isGooglePayReady", "Lu60/e;", "z", "(Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/model/h0;Lg80/g;Z)Lu60/e;", "config", "Lg80/d$a;", "u", "(Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/model/h0;)Lg80/d$a;", "customerInfo", OrcaKeys.METADATA, "Lkotlinx/coroutines/Deferred;", "Lw70/m;", "savedSelection", "Lu60/i;", "cardBrandFilter", "Lg80/a;", "v", "(Lg80/d$a;Lu60/e;Lkotlinx/coroutines/Deferred;Lu60/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customerConfig", "Lcom/stripe/android/model/v0;", "H", "(Lu60/e;Lcom/stripe/android/paymentsheet/y$j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y", "(Lcom/stripe/android/model/h0;Lcom/stripe/android/paymentsheet/y$h;Lg80/d$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "merchantCountry", "passthroughModeEnabled", "linkSignUpDisabled", "", "flags", "D", "(Lcom/stripe/android/paymentsheet/y$h;Lg80/d$a;Lcom/stripe/android/model/h0;Ljava/lang/String;ZZLjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc60/c;", "w", "(Lcom/stripe/android/paymentsheet/y$h;Lg80/d$a;Lcom/stripe/android/model/h0;Ljava/lang/String;ZLjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "A", "(Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/model/h0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "B", "(Lcom/stripe/android/paymentsheet/y$h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "C", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw70/j;", "J", "(Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "L", "(Lcom/stripe/android/paymentsheet/y$h;ZLcom/stripe/android/model/h0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw70/m$d;", "K", "isLinkAvailable", Gender.MALE, "(Lcom/stripe/android/paymentsheet/y$h;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "Lw60/b;", "x", "(Lg80/g;)Lw60/b;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Ljn0/h0;", Gender.OTHER, "(Lcom/stripe/android/model/StripeIntent;)V", Gender.NONE, "(Lu60/e;)Z", "isGooglePaySupported", "G", "(Lcom/stripe/android/model/h0;Lg80/l;ZZLcom/stripe/android/paymentsheet/y$m;)V", "", AnalyticsAttribute.Error, Gender.FEMALE, "(Ljava/lang/Throwable;)V", "requestedExternalPaymentMethods", "Lz80/a1;", "actualExternalPaymentMethods", "E", "(Ljava/util/List;Ljava/util/List;)V", "Lwn0/l;", "b", "c", "Lf80/b;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/repositories/b;", "e", "Lt60/d;", "f", "Lo30/d;", "g", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "h", "Lh70/h;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "j", "Lg80/f;", "k", "Ld60/d;", "l", "Lz80/b1;", "m", "Lz30/j;", "n", "Lr70/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements g80.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<y.CustomerConfiguration, r> prefsRepositoryFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<a60.d, com.stripe.android.googlepaylauncher.l> googlePayRepositoryFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f80.b elementsSessionRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.repositories.b customerRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t60.d lpmRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final EventReporter eventReporter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g80.f accountStatusProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final d60.d linkStore;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final b1 externalPaymentMethodsRepository;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final z30.j userFacingLogger;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final r70.a cvcRecollectionHandler;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0006\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lg80/d$a;", "", "", "getId", "()Ljava/lang/String;", "id", "a", "ephemeralKeySecret", "b", "Lg80/d$a$a;", "Lg80/d$a$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private interface a {

        /* JADX INFO: renamed from: g80.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0012\u0010\t¨\u0006\u001c"}, d2 = {"Lg80/d$a$a;", "Lg80/d$a;", "Lcom/stripe/android/model/h0$d;", "elementsSessionCustomer", "", "customerSessionClientSecret", "<init>", "(Lcom/stripe/android/model/h0$d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/h0$d;", "c", "()Lcom/stripe/android/model/h0$d;", "b", "Ljava/lang/String;", "getId", "id", DateTokenConverter.CONVERTER_KEY, "ephemeralKeySecret", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CustomerSession implements a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f67496e = ElementsSession.Customer.f51191d;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ElementsSession.Customer elementsSessionCustomer;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String customerSessionClientSecret;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String id;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final String ephemeralKeySecret;

            public CustomerSession(ElementsSession.Customer elementsSessionCustomer, String customerSessionClientSecret) {
                s.k(elementsSessionCustomer, "elementsSessionCustomer");
                s.k(customerSessionClientSecret, "customerSessionClientSecret");
                this.elementsSessionCustomer = elementsSessionCustomer;
                this.customerSessionClientSecret = customerSessionClientSecret;
                this.id = elementsSessionCustomer.getSession().getCustomerId();
                this.ephemeralKeySecret = elementsSessionCustomer.getSession().getApiKey();
            }

            @Override // g80.d.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getEphemeralKeySecret() {
                return this.ephemeralKeySecret;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getCustomerSessionClientSecret() {
                return this.customerSessionClientSecret;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ElementsSession.Customer getElementsSessionCustomer() {
                return this.elementsSessionCustomer;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomerSession)) {
                    return false;
                }
                CustomerSession customerSession = (CustomerSession) other;
                return s.f(this.elementsSessionCustomer, customerSession.elementsSessionCustomer) && s.f(this.customerSessionClientSecret, customerSession.customerSessionClientSecret);
            }

            @Override // g80.d.a
            public String getId() {
                return this.id;
            }

            public int hashCode() {
                return (this.elementsSessionCustomer.hashCode() * 31) + this.customerSessionClientSecret.hashCode();
            }

            public String toString() {
                return "CustomerSession(elementsSessionCustomer=" + this.elementsSessionCustomer + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ")";
            }
        }

        /* JADX INFO: renamed from: g80.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0013\u0010\n¨\u0006\u001f"}, d2 = {"Lg80/d$a$b;", "Lg80/d$a;", "Lcom/stripe/android/paymentsheet/y$j;", "customerConfig", "Lcom/stripe/android/paymentsheet/y$i$b;", "accessType", "<init>", "(Lcom/stripe/android/paymentsheet/y$j;Lcom/stripe/android/paymentsheet/y$i$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/paymentsheet/y$j;", "c", "()Lcom/stripe/android/paymentsheet/y$j;", "b", "Lcom/stripe/android/paymentsheet/y$i$b;", "()Lcom/stripe/android/paymentsheet/y$i$b;", "Ljava/lang/String;", "getId", "id", DateTokenConverter.CONVERTER_KEY, "ephemeralKeySecret", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Legacy implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final y.CustomerConfiguration customerConfig;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final y.i.LegacyCustomerEphemeralKey accessType;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String id;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final String ephemeralKeySecret;

            public Legacy(y.CustomerConfiguration customerConfig, y.i.LegacyCustomerEphemeralKey accessType) {
                s.k(customerConfig, "customerConfig");
                s.k(accessType, "accessType");
                this.customerConfig = customerConfig;
                this.accessType = accessType;
                this.id = customerConfig.getId();
                this.ephemeralKeySecret = accessType.getEphemeralKeySecret();
            }

            @Override // g80.d.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getEphemeralKeySecret() {
                return this.ephemeralKeySecret;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final y.i.LegacyCustomerEphemeralKey getAccessType() {
                return this.accessType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final y.CustomerConfiguration getCustomerConfig() {
                return this.customerConfig;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Legacy)) {
                    return false;
                }
                Legacy legacy = (Legacy) other;
                return s.f(this.customerConfig, legacy.customerConfig) && s.f(this.accessType, legacy.accessType);
            }

            @Override // g80.d.a
            public String getId() {
                return this.id;
            }

            public int hashCode() {
                return (this.customerConfig.hashCode() * 31) + this.accessType.hashCode();
            }

            public String toString() {
                return "Legacy(customerConfig=" + this.customerConfig + ", accessType=" + this.accessType + ")";
            }
        }

        /* JADX INFO: renamed from: a */
        String getEphemeralKeySecret();

        String getId();
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f67506b;

        static {
            int[] iArr = new int[g60.a.values().length];
            try {
                iArr[g60.a.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g60.a.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g60.a.VerificationStarted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g60.a.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g60.a.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f67505a = iArr;
            int[] iArr2 = new int[y.GooglePayConfiguration.c.values().length];
            try {
                iArr2[y.GooglePayConfiguration.c.Production.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[y.GooglePayConfiguration.c.Test.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f67506b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {0, 0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "createCustomerState", n = {"savedSelection", "cardBrandFilter", "cardBrandFilter"}, s = {"L$0", "L$1", "L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67507n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f67508o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f67509p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f67510q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f67511r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f67512s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f67514u;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67512s = obj;
            this.f67514u |= Integer.MIN_VALUE;
            return d.this.v(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: g80.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {HttpStatusCode.UNPROCESSABLE_ENTITY_422}, m = "createLinkConfiguration", n = {"config", "elementsSession", "merchantCountry", "flags", "customerPhone", "shippingAddress", "passthroughModeEnabled"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"})
    static final class C1390d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67515n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f67516o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f67517p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f67518q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f67519r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f67520s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f67521t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f67522u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f67524w;

        C1390d(Continuation<? super C1390d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67522u = obj;
            this.f67524w |= Integer.MIN_VALUE;
            return d.this.w(null, null, null, null, false, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {}, l = {476}, m = "isGooglePayReady", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f67525n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f67527p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67525n = obj;
            this.f67527p |= Integer.MIN_VALUE;
            return d.this.B(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {}, l = {90}, m = "load-yxL6bBk", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f67528n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f67530p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67528n = obj;
            this.f67530p |= Integer.MIN_VALUE;
            Object objA = d.this.a(null, null, false, false, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class g extends p implements wn0.l<Throwable, h0> {
        g(Object obj) {
            super(1, obj, d.class, "reportFailedLoad", "reportFailedLoad(Ljava/lang/Throwable;)V", 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            invoke2(th2);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p11) {
            s.k(p11, "p0");
            ((d) this.receiver).F(p11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lg80/l;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lg80/l;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$load$3", f = "PaymentSheetLoader.kt", i = {0, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7}, l = {93, 95, 107, 148, 159, 160, 161, 170}, m = "invokeSuspend", n = {"$this$runCatching", "$this$runCatching", "$this$runCatching", "elementsSession", "customerInfo", "elementsSession", "linkState", "customer", "initialPaymentSelection", "stripeIntent", "elementsSession", "linkState", "initialPaymentSelection", "stripeIntent", "paymentMethodMetadata", "elementsSession", "initialPaymentSelection", "stripeIntent", "paymentMethodMetadata", "elementsSession", "stripeIntent", "paymentMethodMetadata", "state"}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0"})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Full>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67531n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f67532o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f67533p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f67534q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f67535r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f67536s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f67537t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f67538u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f67540w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ y.Configuration f67541x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ y.m f67542y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ boolean f67543z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lg80/a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lg80/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$load$3$customer$1", f = "PaymentSheetLoader.kt", i = {}, l = {137, 135}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super CustomerState>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f67544n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f67545o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f67546p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ d f67547q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f67548r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Deferred<PaymentMethodMetadata> f67549s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Deferred<w70.m> f67550t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ y.Configuration f67551u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d dVar, a aVar, Deferred<PaymentMethodMetadata> deferred, Deferred<? extends w70.m> deferred2, y.Configuration configuration, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f67547q = dVar;
                this.f67548r = aVar;
                this.f67549s = deferred;
                this.f67550t = deferred2;
                this.f67551u = configuration;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f67547q, this.f67548r, this.f67549s, this.f67550t, this.f67551u, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a aVar;
                d dVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f67546p;
                if (i11 == 0) {
                    t.b(obj);
                    d dVar2 = this.f67547q;
                    aVar = this.f67548r;
                    Deferred<PaymentMethodMetadata> deferred = this.f67549s;
                    this.f67544n = dVar2;
                    this.f67545o = aVar;
                    this.f67546p = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait != coroutine_suspended) {
                        dVar = dVar2;
                        obj = objAwait;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                aVar = (a) this.f67545o;
                dVar = (d) this.f67544n;
                t.b(obj);
                a aVar2 = aVar;
                Deferred<w70.m> deferred2 = this.f67550t;
                u60.i iVar = new u60.i(this.f67551u.getCardBrandAcceptance());
                this.f67544n = null;
                this.f67545o = null;
                this.f67546p = 2;
                Object objV = dVar.v(aVar2, (PaymentMethodMetadata) obj, deferred2, iVar, this);
                return objV == coroutine_suspended ? coroutine_suspended : objV;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerState> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lw70/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lw70/j;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$load$3$initialPaymentSelection$1", f = "PaymentSheetLoader.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super w70.j>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67552n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f67553o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Deferred<w70.m> f67554p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ Deferred<CustomerState> f67555q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(d dVar, Deferred<? extends w70.m> deferred, Deferred<CustomerState> deferred2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f67553o = dVar;
                this.f67554p = deferred;
                this.f67555q = deferred2;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f67553o, this.f67554p, this.f67555q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f67552n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                d dVar = this.f67553o;
                Deferred<w70.m> deferred = this.f67554p;
                Deferred<CustomerState> deferred2 = this.f67555q;
                this.f67552n = 1;
                Object objJ = dVar.J(deferred, deferred2, this);
                return objJ == coroutine_suspended ? coroutine_suspended : objJ;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super w70.j> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lg80/g;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lg80/g;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$load$3$linkState$1", f = "PaymentSheetLoader.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super LinkState>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67556n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f67557o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ ElementsSession f67558p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ y.Configuration f67559q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f67560r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d dVar, ElementsSession elementsSession, y.Configuration configuration, a aVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f67557o = dVar;
                this.f67558p = elementsSession;
                this.f67559q = configuration;
                this.f67560r = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new c(this.f67557o, this.f67558p, this.f67559q, this.f67560r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f67556n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                d dVar = this.f67557o;
                ElementsSession elementsSession = this.f67558p;
                y.Configuration configuration = this.f67559q;
                a aVar = this.f67560r;
                this.f67556n = 1;
                Object objY = dVar.y(elementsSession, configuration, aVar, this);
                return objY == coroutine_suspended ? coroutine_suspended : objY;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LinkState> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: g80.d$h$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lu60/e;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lu60/e;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$load$3$metadata$1", f = "PaymentSheetLoader.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class C1391d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super PaymentMethodMetadata>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67561n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Deferred<LinkState> f67562o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ d f67563p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ y.Configuration f67564q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ElementsSession f67565r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ boolean f67566s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1391d(Deferred<LinkState> deferred, d dVar, y.Configuration configuration, ElementsSession elementsSession, boolean z11, Continuation<? super C1391d> continuation) {
                super(2, continuation);
                this.f67562o = deferred;
                this.f67563p = dVar;
                this.f67564q = configuration;
                this.f67565r = elementsSession;
                this.f67566s = z11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C1391d(this.f67562o, this.f67563p, this.f67564q, this.f67565r, this.f67566s, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f67561n;
                if (i11 == 0) {
                    t.b(obj);
                    Deferred<LinkState> deferred = this.f67562o;
                    this.f67561n = 1;
                    obj = deferred.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return this.f67563p.z(this.f67564q, this.f67565r, (LinkState) obj, this.f67566s);
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaymentMethodMetadata> continuation) {
                return ((C1391d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lw70/m;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lw70/m;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$load$3$savedSelection$1", f = "PaymentSheetLoader.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super w70.m>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67567n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f67568o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ y.Configuration f67569p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ boolean f67570q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ElementsSession f67571r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(d dVar, y.Configuration configuration, boolean z11, ElementsSession elementsSession, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f67568o = dVar;
                this.f67569p = configuration;
                this.f67570q = z11;
                this.f67571r = elementsSession;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new e(this.f67568o, this.f67569p, this.f67570q, this.f67571r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f67567n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                d dVar = this.f67568o;
                y.Configuration configuration = this.f67569p;
                boolean z11 = this.f67570q;
                ElementsSession elementsSession = this.f67571r;
                this.f67567n = 1;
                Object objL = dVar.L(configuration, z11, elementsSession, this);
                return objL == coroutine_suspended ? coroutine_suspended : objL;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super w70.m> continuation) {
                return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z11, y.Configuration configuration, y.m mVar, boolean z12, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f67540w = z11;
            this.f67541x = configuration;
            this.f67542y = mVar;
            this.f67543z = z12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = d.this.new h(this.f67540w, this.f67541x, this.f67542y, this.f67543z, continuation);
            hVar.f67538u = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00cb A[PHI: r0 r1 r2 r3
          0x00cb: PHI (r0v11 g80.d$a) = (r0v8 g80.d$a), (r0v17 g80.d$a) binds: [B:30:0x015b, B:13:0x00ba] A[DONT_GENERATE, DONT_INLINE]
          0x00cb: PHI (r1v14 com.stripe.android.model.h0) = (r1v10 com.stripe.android.model.h0), (r1v18 com.stripe.android.model.h0) binds: [B:30:0x015b, B:13:0x00ba] A[DONT_GENERATE, DONT_INLINE]
          0x00cb: PHI (r2v10 kotlinx.coroutines.CoroutineScope) = (r2v8 kotlinx.coroutines.CoroutineScope), (r2v14 kotlinx.coroutines.CoroutineScope) binds: [B:30:0x015b, B:13:0x00ba] A[DONT_GENERATE, DONT_INLINE]
          0x00cb: PHI (r3v7 java.lang.Object) = (r3v6 java.lang.Object), (r3v12 java.lang.Object) binds: [B:30:0x015b, B:13:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0123  */
        /* JADX WARN: Code duplicated, block: B:24:0x0128  */
        /* JADX WARN: Code duplicated, block: B:28:0x013c  */
        /* JADX WARN: Code duplicated, block: B:35:0x01de  */
        /* JADX WARN: Code duplicated, block: B:38:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:41:0x020d  */
        /* JADX WARN: Code duplicated, block: B:45:0x022b  */
        /* JADX WARN: Code duplicated, block: B:49:0x024e  */
        /* JADX WARN: Code duplicated, block: B:53:0x027d  */
        /* JADX WARN: Code duplicated, block: B:56:0x028c  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws g80.j.NoPaymentMethodTypesAvailable {
            CoroutineScope coroutineScope;
            Object objK;
            CoroutineScope coroutineScope2;
            w70.m.PaymentMethod paymentMethod;
            String id2;
            Object objI;
            CoroutineScope coroutineScope3;
            ElementsSession elementsSession;
            a aVarU;
            Object objA;
            ElementsSession elementsSession2;
            Deferred deferredAsync$default;
            Deferred deferredAsync$default2;
            Deferred deferredAsync$default3;
            StripeIntent stripeIntent;
            Object objAwait;
            Deferred deferred;
            Deferred deferred2;
            StripeIntent stripeIntent2;
            Deferred deferred3;
            PaymentMethodMetadata paymentMethodMetadata;
            y.Configuration configuration;
            Object objAwait2;
            Deferred deferred4;
            PaymentMethodMetadata paymentMethodMetadata2;
            Deferred deferred5;
            CustomerState customerState;
            Object objAwait3;
            CustomerState customerState2;
            Deferred deferred6;
            PaymentMethodMetadata paymentMethodMetadata3;
            StripeIntent stripeIntent3;
            y.Configuration configuration2;
            LinkState linkState;
            Object objAwait4;
            y.Configuration configuration3;
            LinkState linkState2;
            StripeIntent stripeIntent4;
            ElementsSession elementsSession3;
            Full full;
            d dVar;
            boolean z11;
            Object objC;
            Full full2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f67537t) {
                case 0:
                    t.b(obj);
                    coroutineScope = (CoroutineScope) this.f67538u;
                    d.this.eventReporter.g(this.f67540w);
                    d dVar2 = d.this;
                    y.Configuration configuration4 = this.f67541x;
                    this.f67538u = coroutineScope;
                    this.f67537t = 1;
                    objK = dVar2.K(configuration4, this);
                    if (objK != coroutine_suspended) {
                        coroutineScope2 = coroutineScope;
                        paymentMethod = (w70.m.PaymentMethod) objK;
                        d dVar3 = d.this;
                        y.m mVar = this.f67542y;
                        y.CustomerConfiguration customer = this.f67541x.getCustomer();
                        List<String> listI = this.f67541x.i();
                        if (paymentMethod != null) {
                            id2 = paymentMethod.getId();
                        } else {
                            id2 = null;
                        }
                        this.f67538u = coroutineScope2;
                        this.f67537t = 2;
                        objI = dVar3.I(mVar, customer, listI, id2, this);
                        if (objI != coroutine_suspended) {
                            coroutineScope3 = coroutineScope2;
                            t.b(objI);
                            elementsSession = (ElementsSession) objI;
                            aVarU = d.this.u(this.f67541x, elementsSession);
                            d dVar4 = d.this;
                            y.Configuration configuration5 = this.f67541x;
                            this.f67538u = coroutineScope3;
                            this.f67531n = elementsSession;
                            this.f67532o = aVarU;
                            this.f67537t = 3;
                            objA = dVar4.A(configuration5, elementsSession, this);
                            if (objA != coroutine_suspended) {
                                a aVar = aVarU;
                                elementsSession2 = elementsSession;
                                boolean zBooleanValue = ((Boolean) objA).booleanValue();
                                CoroutineScope coroutineScope4 = coroutineScope3;
                                Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new e(d.this, this.f67541x, zBooleanValue, elementsSession2, null), 3, null);
                                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new c(d.this, elementsSession2, this.f67541x, aVar, null), 3, null);
                                CoroutineScope coroutineScope5 = coroutineScope3;
                                Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope5, null, null, new C1391d(deferredAsync$default, d.this, this.f67541x, elementsSession2, zBooleanValue, null), 3, null);
                                deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope5, null, null, new a(d.this, aVar, deferredAsync$default5, deferredAsync$default4, this.f67541x, null), 3, null);
                                deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope5, null, null, new b(d.this, deferredAsync$default4, deferredAsync$default2, null), 3, null);
                                stripeIntent = elementsSession2.getStripeIntent();
                                this.f67538u = elementsSession2;
                                this.f67531n = deferredAsync$default;
                                this.f67532o = deferredAsync$default2;
                                this.f67533p = deferredAsync$default3;
                                this.f67534q = stripeIntent;
                                this.f67537t = 4;
                                objAwait = deferredAsync$default5.await(this);
                                if (objAwait != coroutine_suspended) {
                                    deferred = deferredAsync$default3;
                                    deferred2 = deferredAsync$default2;
                                    stripeIntent2 = stripeIntent;
                                    deferred3 = deferredAsync$default;
                                    paymentMethodMetadata = (PaymentMethodMetadata) objAwait;
                                    d.this.O(stripeIntent2);
                                    if (!d.this.N(paymentMethodMetadata)) {
                                        throw new g80.j.NoPaymentMethodTypesAvailable(v.y0(stripeIntent2.t(), ", ", null, null, 0, null, null, 62, null));
                                    }
                                    configuration = this.f67541x;
                                    this.f67538u = elementsSession2;
                                    this.f67531n = deferred3;
                                    this.f67532o = deferred;
                                    this.f67533p = stripeIntent2;
                                    this.f67534q = paymentMethodMetadata;
                                    this.f67535r = configuration;
                                    this.f67537t = 5;
                                    objAwait2 = deferred2.await(this);
                                    if (objAwait2 != coroutine_suspended) {
                                        Deferred deferred7 = deferred3;
                                        deferred4 = deferred;
                                        paymentMethodMetadata2 = paymentMethodMetadata;
                                        deferred5 = deferred7;
                                        customerState = (CustomerState) objAwait2;
                                        this.f67538u = elementsSession2;
                                        this.f67531n = deferred4;
                                        this.f67532o = stripeIntent2;
                                        this.f67533p = paymentMethodMetadata2;
                                        this.f67534q = configuration;
                                        this.f67535r = customerState;
                                        this.f67537t = 6;
                                        objAwait3 = deferred5.await(this);
                                        if (objAwait3 != coroutine_suspended) {
                                            PaymentMethodMetadata paymentMethodMetadata4 = paymentMethodMetadata2;
                                            customerState2 = customerState;
                                            deferred6 = deferred4;
                                            paymentMethodMetadata3 = paymentMethodMetadata4;
                                            y.Configuration configuration6 = configuration;
                                            stripeIntent3 = stripeIntent2;
                                            configuration2 = configuration6;
                                            linkState = (LinkState) objAwait3;
                                            this.f67538u = elementsSession2;
                                            this.f67531n = stripeIntent3;
                                            this.f67532o = paymentMethodMetadata3;
                                            this.f67533p = configuration2;
                                            this.f67534q = customerState2;
                                            this.f67535r = linkState;
                                            this.f67537t = 7;
                                            objAwait4 = deferred6.await(this);
                                            if (objAwait4 != coroutine_suspended) {
                                                configuration3 = configuration2;
                                                linkState2 = linkState;
                                                stripeIntent4 = stripeIntent3;
                                                elementsSession3 = elementsSession2;
                                                full = new Full(configuration3, customerState2, linkState2, (w70.j) objAwait4, q.e(stripeIntent4), paymentMethodMetadata3);
                                                dVar = d.this;
                                                z11 = this.f67543z;
                                                this.f67538u = full;
                                                this.f67531n = dVar;
                                                this.f67532o = elementsSession3;
                                                this.f67533p = full;
                                                this.f67534q = null;
                                                this.f67535r = null;
                                                this.f67536s = z11;
                                                this.f67537t = 8;
                                                objC = dVar.C(this);
                                                if (objC != coroutine_suspended) {
                                                    full2 = full;
                                                    dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                                                    return full2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    coroutineScope = (CoroutineScope) this.f67538u;
                    t.b(obj);
                    objK = obj;
                    coroutineScope2 = coroutineScope;
                    paymentMethod = (w70.m.PaymentMethod) objK;
                    d dVar5 = d.this;
                    y.m mVar2 = this.f67542y;
                    y.CustomerConfiguration customer2 = this.f67541x.getCustomer();
                    List<String> listI2 = this.f67541x.i();
                    if (paymentMethod != null) {
                        id2 = paymentMethod.getId();
                    } else {
                        id2 = null;
                    }
                    this.f67538u = coroutineScope2;
                    this.f67537t = 2;
                    objI = dVar5.I(mVar2, customer2, listI2, id2, this);
                    if (objI != coroutine_suspended) {
                        coroutineScope3 = coroutineScope2;
                        t.b(objI);
                        elementsSession = (ElementsSession) objI;
                        aVarU = d.this.u(this.f67541x, elementsSession);
                        d dVar6 = d.this;
                        y.Configuration configuration7 = this.f67541x;
                        this.f67538u = coroutineScope3;
                        this.f67531n = elementsSession;
                        this.f67532o = aVarU;
                        this.f67537t = 3;
                        objA = dVar6.A(configuration7, elementsSession, this);
                        if (objA != coroutine_suspended) {
                            a aVar2 = aVarU;
                            elementsSession2 = elementsSession;
                            boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
                            CoroutineScope coroutineScope6 = coroutineScope3;
                            Deferred deferredAsync$default6 = BuildersKt__Builders_commonKt.async$default(coroutineScope6, null, null, new e(d.this, this.f67541x, zBooleanValue2, elementsSession2, null), 3, null);
                            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope6, null, null, new c(d.this, elementsSession2, this.f67541x, aVar2, null), 3, null);
                            CoroutineScope coroutineScope7 = coroutineScope3;
                            Deferred deferredAsync$default7 = BuildersKt__Builders_commonKt.async$default(coroutineScope7, null, null, new C1391d(deferredAsync$default, d.this, this.f67541x, elementsSession2, zBooleanValue2, null), 3, null);
                            deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope7, null, null, new a(d.this, aVar2, deferredAsync$default7, deferredAsync$default6, this.f67541x, null), 3, null);
                            deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope7, null, null, new b(d.this, deferredAsync$default6, deferredAsync$default2, null), 3, null);
                            stripeIntent = elementsSession2.getStripeIntent();
                            this.f67538u = elementsSession2;
                            this.f67531n = deferredAsync$default;
                            this.f67532o = deferredAsync$default2;
                            this.f67533p = deferredAsync$default3;
                            this.f67534q = stripeIntent;
                            this.f67537t = 4;
                            objAwait = deferredAsync$default7.await(this);
                            if (objAwait != coroutine_suspended) {
                                deferred = deferredAsync$default3;
                                deferred2 = deferredAsync$default2;
                                stripeIntent2 = stripeIntent;
                                deferred3 = deferredAsync$default;
                                paymentMethodMetadata = (PaymentMethodMetadata) objAwait;
                                d.this.O(stripeIntent2);
                                if (!d.this.N(paymentMethodMetadata)) {
                                    throw new g80.j.NoPaymentMethodTypesAvailable(v.y0(stripeIntent2.t(), ", ", null, null, 0, null, null, 62, null));
                                }
                                configuration = this.f67541x;
                                this.f67538u = elementsSession2;
                                this.f67531n = deferred3;
                                this.f67532o = deferred;
                                this.f67533p = stripeIntent2;
                                this.f67534q = paymentMethodMetadata;
                                this.f67535r = configuration;
                                this.f67537t = 5;
                                objAwait2 = deferred2.await(this);
                                if (objAwait2 != coroutine_suspended) {
                                    Deferred deferred8 = deferred3;
                                    deferred4 = deferred;
                                    paymentMethodMetadata2 = paymentMethodMetadata;
                                    deferred5 = deferred8;
                                    customerState = (CustomerState) objAwait2;
                                    this.f67538u = elementsSession2;
                                    this.f67531n = deferred4;
                                    this.f67532o = stripeIntent2;
                                    this.f67533p = paymentMethodMetadata2;
                                    this.f67534q = configuration;
                                    this.f67535r = customerState;
                                    this.f67537t = 6;
                                    objAwait3 = deferred5.await(this);
                                    if (objAwait3 != coroutine_suspended) {
                                        PaymentMethodMetadata paymentMethodMetadata5 = paymentMethodMetadata2;
                                        customerState2 = customerState;
                                        deferred6 = deferred4;
                                        paymentMethodMetadata3 = paymentMethodMetadata5;
                                        y.Configuration configuration8 = configuration;
                                        stripeIntent3 = stripeIntent2;
                                        configuration2 = configuration8;
                                        linkState = (LinkState) objAwait3;
                                        this.f67538u = elementsSession2;
                                        this.f67531n = stripeIntent3;
                                        this.f67532o = paymentMethodMetadata3;
                                        this.f67533p = configuration2;
                                        this.f67534q = customerState2;
                                        this.f67535r = linkState;
                                        this.f67537t = 7;
                                        objAwait4 = deferred6.await(this);
                                        if (objAwait4 != coroutine_suspended) {
                                            configuration3 = configuration2;
                                            linkState2 = linkState;
                                            stripeIntent4 = stripeIntent3;
                                            elementsSession3 = elementsSession2;
                                            full = new Full(configuration3, customerState2, linkState2, (w70.j) objAwait4, q.e(stripeIntent4), paymentMethodMetadata3);
                                            dVar = d.this;
                                            z11 = this.f67543z;
                                            this.f67538u = full;
                                            this.f67531n = dVar;
                                            this.f67532o = elementsSession3;
                                            this.f67533p = full;
                                            this.f67534q = null;
                                            this.f67535r = null;
                                            this.f67536s = z11;
                                            this.f67537t = 8;
                                            objC = dVar.C(this);
                                            if (objC != coroutine_suspended) {
                                                full2 = full;
                                                dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                                                return full2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    CoroutineScope coroutineScope8 = (CoroutineScope) this.f67538u;
                    t.b(obj);
                    objI = ((jn0.s) obj).getValue();
                    coroutineScope3 = coroutineScope8;
                    t.b(objI);
                    elementsSession = (ElementsSession) objI;
                    aVarU = d.this.u(this.f67541x, elementsSession);
                    d dVar7 = d.this;
                    y.Configuration configuration9 = this.f67541x;
                    this.f67538u = coroutineScope3;
                    this.f67531n = elementsSession;
                    this.f67532o = aVarU;
                    this.f67537t = 3;
                    objA = dVar7.A(configuration9, elementsSession, this);
                    if (objA != coroutine_suspended) {
                        a aVar3 = aVarU;
                        elementsSession2 = elementsSession;
                        boolean zBooleanValue3 = ((Boolean) objA).booleanValue();
                        CoroutineScope coroutineScope9 = coroutineScope3;
                        Deferred deferredAsync$default8 = BuildersKt__Builders_commonKt.async$default(coroutineScope9, null, null, new e(d.this, this.f67541x, zBooleanValue3, elementsSession2, null), 3, null);
                        deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope9, null, null, new c(d.this, elementsSession2, this.f67541x, aVar3, null), 3, null);
                        CoroutineScope coroutineScope10 = coroutineScope3;
                        Deferred deferredAsync$default9 = BuildersKt__Builders_commonKt.async$default(coroutineScope10, null, null, new C1391d(deferredAsync$default, d.this, this.f67541x, elementsSession2, zBooleanValue3, null), 3, null);
                        deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope10, null, null, new a(d.this, aVar3, deferredAsync$default9, deferredAsync$default8, this.f67541x, null), 3, null);
                        deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope10, null, null, new b(d.this, deferredAsync$default8, deferredAsync$default2, null), 3, null);
                        stripeIntent = elementsSession2.getStripeIntent();
                        this.f67538u = elementsSession2;
                        this.f67531n = deferredAsync$default;
                        this.f67532o = deferredAsync$default2;
                        this.f67533p = deferredAsync$default3;
                        this.f67534q = stripeIntent;
                        this.f67537t = 4;
                        objAwait = deferredAsync$default9.await(this);
                        if (objAwait != coroutine_suspended) {
                            deferred = deferredAsync$default3;
                            deferred2 = deferredAsync$default2;
                            stripeIntent2 = stripeIntent;
                            deferred3 = deferredAsync$default;
                            paymentMethodMetadata = (PaymentMethodMetadata) objAwait;
                            d.this.O(stripeIntent2);
                            if (!d.this.N(paymentMethodMetadata)) {
                                throw new g80.j.NoPaymentMethodTypesAvailable(v.y0(stripeIntent2.t(), ", ", null, null, 0, null, null, 62, null));
                            }
                            configuration = this.f67541x;
                            this.f67538u = elementsSession2;
                            this.f67531n = deferred3;
                            this.f67532o = deferred;
                            this.f67533p = stripeIntent2;
                            this.f67534q = paymentMethodMetadata;
                            this.f67535r = configuration;
                            this.f67537t = 5;
                            objAwait2 = deferred2.await(this);
                            if (objAwait2 != coroutine_suspended) {
                                Deferred deferred9 = deferred3;
                                deferred4 = deferred;
                                paymentMethodMetadata2 = paymentMethodMetadata;
                                deferred5 = deferred9;
                                customerState = (CustomerState) objAwait2;
                                this.f67538u = elementsSession2;
                                this.f67531n = deferred4;
                                this.f67532o = stripeIntent2;
                                this.f67533p = paymentMethodMetadata2;
                                this.f67534q = configuration;
                                this.f67535r = customerState;
                                this.f67537t = 6;
                                objAwait3 = deferred5.await(this);
                                if (objAwait3 != coroutine_suspended) {
                                    PaymentMethodMetadata paymentMethodMetadata6 = paymentMethodMetadata2;
                                    customerState2 = customerState;
                                    deferred6 = deferred4;
                                    paymentMethodMetadata3 = paymentMethodMetadata6;
                                    y.Configuration configuration10 = configuration;
                                    stripeIntent3 = stripeIntent2;
                                    configuration2 = configuration10;
                                    linkState = (LinkState) objAwait3;
                                    this.f67538u = elementsSession2;
                                    this.f67531n = stripeIntent3;
                                    this.f67532o = paymentMethodMetadata3;
                                    this.f67533p = configuration2;
                                    this.f67534q = customerState2;
                                    this.f67535r = linkState;
                                    this.f67537t = 7;
                                    objAwait4 = deferred6.await(this);
                                    if (objAwait4 != coroutine_suspended) {
                                        configuration3 = configuration2;
                                        linkState2 = linkState;
                                        stripeIntent4 = stripeIntent3;
                                        elementsSession3 = elementsSession2;
                                        full = new Full(configuration3, customerState2, linkState2, (w70.j) objAwait4, q.e(stripeIntent4), paymentMethodMetadata3);
                                        dVar = d.this;
                                        z11 = this.f67543z;
                                        this.f67538u = full;
                                        this.f67531n = dVar;
                                        this.f67532o = elementsSession3;
                                        this.f67533p = full;
                                        this.f67534q = null;
                                        this.f67535r = null;
                                        this.f67536s = z11;
                                        this.f67537t = 8;
                                        objC = dVar.C(this);
                                        if (objC != coroutine_suspended) {
                                            full2 = full;
                                            dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                                            return full2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 3:
                    aVarU = (a) this.f67532o;
                    elementsSession = (ElementsSession) this.f67531n;
                    coroutineScope3 = (CoroutineScope) this.f67538u;
                    t.b(obj);
                    objA = obj;
                    a aVar4 = aVarU;
                    elementsSession2 = elementsSession;
                    boolean zBooleanValue4 = ((Boolean) objA).booleanValue();
                    CoroutineScope coroutineScope11 = coroutineScope3;
                    Deferred deferredAsync$default10 = BuildersKt__Builders_commonKt.async$default(coroutineScope11, null, null, new e(d.this, this.f67541x, zBooleanValue4, elementsSession2, null), 3, null);
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope11, null, null, new c(d.this, elementsSession2, this.f67541x, aVar4, null), 3, null);
                    CoroutineScope coroutineScope12 = coroutineScope3;
                    Deferred deferredAsync$default11 = BuildersKt__Builders_commonKt.async$default(coroutineScope12, null, null, new C1391d(deferredAsync$default, d.this, this.f67541x, elementsSession2, zBooleanValue4, null), 3, null);
                    deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope12, null, null, new a(d.this, aVar4, deferredAsync$default11, deferredAsync$default10, this.f67541x, null), 3, null);
                    deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope12, null, null, new b(d.this, deferredAsync$default10, deferredAsync$default2, null), 3, null);
                    stripeIntent = elementsSession2.getStripeIntent();
                    this.f67538u = elementsSession2;
                    this.f67531n = deferredAsync$default;
                    this.f67532o = deferredAsync$default2;
                    this.f67533p = deferredAsync$default3;
                    this.f67534q = stripeIntent;
                    this.f67537t = 4;
                    objAwait = deferredAsync$default11.await(this);
                    if (objAwait != coroutine_suspended) {
                        deferred = deferredAsync$default3;
                        deferred2 = deferredAsync$default2;
                        stripeIntent2 = stripeIntent;
                        deferred3 = deferredAsync$default;
                        paymentMethodMetadata = (PaymentMethodMetadata) objAwait;
                        d.this.O(stripeIntent2);
                        if (!d.this.N(paymentMethodMetadata)) {
                            throw new g80.j.NoPaymentMethodTypesAvailable(v.y0(stripeIntent2.t(), ", ", null, null, 0, null, null, 62, null));
                        }
                        configuration = this.f67541x;
                        this.f67538u = elementsSession2;
                        this.f67531n = deferred3;
                        this.f67532o = deferred;
                        this.f67533p = stripeIntent2;
                        this.f67534q = paymentMethodMetadata;
                        this.f67535r = configuration;
                        this.f67537t = 5;
                        objAwait2 = deferred2.await(this);
                        if (objAwait2 != coroutine_suspended) {
                            Deferred deferred10 = deferred3;
                            deferred4 = deferred;
                            paymentMethodMetadata2 = paymentMethodMetadata;
                            deferred5 = deferred10;
                            customerState = (CustomerState) objAwait2;
                            this.f67538u = elementsSession2;
                            this.f67531n = deferred4;
                            this.f67532o = stripeIntent2;
                            this.f67533p = paymentMethodMetadata2;
                            this.f67534q = configuration;
                            this.f67535r = customerState;
                            this.f67537t = 6;
                            objAwait3 = deferred5.await(this);
                            if (objAwait3 != coroutine_suspended) {
                                PaymentMethodMetadata paymentMethodMetadata7 = paymentMethodMetadata2;
                                customerState2 = customerState;
                                deferred6 = deferred4;
                                paymentMethodMetadata3 = paymentMethodMetadata7;
                                y.Configuration configuration11 = configuration;
                                stripeIntent3 = stripeIntent2;
                                configuration2 = configuration11;
                                linkState = (LinkState) objAwait3;
                                this.f67538u = elementsSession2;
                                this.f67531n = stripeIntent3;
                                this.f67532o = paymentMethodMetadata3;
                                this.f67533p = configuration2;
                                this.f67534q = customerState2;
                                this.f67535r = linkState;
                                this.f67537t = 7;
                                objAwait4 = deferred6.await(this);
                                if (objAwait4 != coroutine_suspended) {
                                    configuration3 = configuration2;
                                    linkState2 = linkState;
                                    stripeIntent4 = stripeIntent3;
                                    elementsSession3 = elementsSession2;
                                    full = new Full(configuration3, customerState2, linkState2, (w70.j) objAwait4, q.e(stripeIntent4), paymentMethodMetadata3);
                                    dVar = d.this;
                                    z11 = this.f67543z;
                                    this.f67538u = full;
                                    this.f67531n = dVar;
                                    this.f67532o = elementsSession3;
                                    this.f67533p = full;
                                    this.f67534q = null;
                                    this.f67535r = null;
                                    this.f67536s = z11;
                                    this.f67537t = 8;
                                    objC = dVar.C(this);
                                    if (objC != coroutine_suspended) {
                                        full2 = full;
                                        dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                                        return full2;
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 4:
                    StripeIntent stripeIntent5 = (StripeIntent) this.f67534q;
                    deferred = (Deferred) this.f67533p;
                    Deferred deferred11 = (Deferred) this.f67532o;
                    deferred3 = (Deferred) this.f67531n;
                    ElementsSession elementsSession4 = (ElementsSession) this.f67538u;
                    t.b(obj);
                    stripeIntent2 = stripeIntent5;
                    deferred2 = deferred11;
                    elementsSession2 = elementsSession4;
                    objAwait = obj;
                    paymentMethodMetadata = (PaymentMethodMetadata) objAwait;
                    d.this.O(stripeIntent2);
                    if (!d.this.N(paymentMethodMetadata)) {
                        throw new g80.j.NoPaymentMethodTypesAvailable(v.y0(stripeIntent2.t(), ", ", null, null, 0, null, null, 62, null));
                    }
                    configuration = this.f67541x;
                    this.f67538u = elementsSession2;
                    this.f67531n = deferred3;
                    this.f67532o = deferred;
                    this.f67533p = stripeIntent2;
                    this.f67534q = paymentMethodMetadata;
                    this.f67535r = configuration;
                    this.f67537t = 5;
                    objAwait2 = deferred2.await(this);
                    if (objAwait2 != coroutine_suspended) {
                        Deferred deferred12 = deferred3;
                        deferred4 = deferred;
                        paymentMethodMetadata2 = paymentMethodMetadata;
                        deferred5 = deferred12;
                        customerState = (CustomerState) objAwait2;
                        this.f67538u = elementsSession2;
                        this.f67531n = deferred4;
                        this.f67532o = stripeIntent2;
                        this.f67533p = paymentMethodMetadata2;
                        this.f67534q = configuration;
                        this.f67535r = customerState;
                        this.f67537t = 6;
                        objAwait3 = deferred5.await(this);
                        if (objAwait3 != coroutine_suspended) {
                            PaymentMethodMetadata paymentMethodMetadata8 = paymentMethodMetadata2;
                            customerState2 = customerState;
                            deferred6 = deferred4;
                            paymentMethodMetadata3 = paymentMethodMetadata8;
                            y.Configuration configuration12 = configuration;
                            stripeIntent3 = stripeIntent2;
                            configuration2 = configuration12;
                            linkState = (LinkState) objAwait3;
                            this.f67538u = elementsSession2;
                            this.f67531n = stripeIntent3;
                            this.f67532o = paymentMethodMetadata3;
                            this.f67533p = configuration2;
                            this.f67534q = customerState2;
                            this.f67535r = linkState;
                            this.f67537t = 7;
                            objAwait4 = deferred6.await(this);
                            if (objAwait4 != coroutine_suspended) {
                                configuration3 = configuration2;
                                linkState2 = linkState;
                                stripeIntent4 = stripeIntent3;
                                elementsSession3 = elementsSession2;
                                full = new Full(configuration3, customerState2, linkState2, (w70.j) objAwait4, q.e(stripeIntent4), paymentMethodMetadata3);
                                dVar = d.this;
                                z11 = this.f67543z;
                                this.f67538u = full;
                                this.f67531n = dVar;
                                this.f67532o = elementsSession3;
                                this.f67533p = full;
                                this.f67534q = null;
                                this.f67535r = null;
                                this.f67536s = z11;
                                this.f67537t = 8;
                                objC = dVar.C(this);
                                if (objC != coroutine_suspended) {
                                    full2 = full;
                                    dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                                    return full2;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 5:
                    y.Configuration configuration13 = (y.Configuration) this.f67535r;
                    paymentMethodMetadata2 = (PaymentMethodMetadata) this.f67534q;
                    stripeIntent2 = (StripeIntent) this.f67533p;
                    deferred4 = (Deferred) this.f67532o;
                    deferred5 = (Deferred) this.f67531n;
                    ElementsSession elementsSession5 = (ElementsSession) this.f67538u;
                    t.b(obj);
                    elementsSession2 = elementsSession5;
                    configuration = configuration13;
                    objAwait2 = obj;
                    customerState = (CustomerState) objAwait2;
                    this.f67538u = elementsSession2;
                    this.f67531n = deferred4;
                    this.f67532o = stripeIntent2;
                    this.f67533p = paymentMethodMetadata2;
                    this.f67534q = configuration;
                    this.f67535r = customerState;
                    this.f67537t = 6;
                    objAwait3 = deferred5.await(this);
                    if (objAwait3 != coroutine_suspended) {
                        PaymentMethodMetadata paymentMethodMetadata9 = paymentMethodMetadata2;
                        customerState2 = customerState;
                        deferred6 = deferred4;
                        paymentMethodMetadata3 = paymentMethodMetadata9;
                        y.Configuration configuration14 = configuration;
                        stripeIntent3 = stripeIntent2;
                        configuration2 = configuration14;
                        linkState = (LinkState) objAwait3;
                        this.f67538u = elementsSession2;
                        this.f67531n = stripeIntent3;
                        this.f67532o = paymentMethodMetadata3;
                        this.f67533p = configuration2;
                        this.f67534q = customerState2;
                        this.f67535r = linkState;
                        this.f67537t = 7;
                        objAwait4 = deferred6.await(this);
                        if (objAwait4 != coroutine_suspended) {
                            configuration3 = configuration2;
                            linkState2 = linkState;
                            stripeIntent4 = stripeIntent3;
                            elementsSession3 = elementsSession2;
                            full = new Full(configuration3, customerState2, linkState2, (w70.j) objAwait4, q.e(stripeIntent4), paymentMethodMetadata3);
                            dVar = d.this;
                            z11 = this.f67543z;
                            this.f67538u = full;
                            this.f67531n = dVar;
                            this.f67532o = elementsSession3;
                            this.f67533p = full;
                            this.f67534q = null;
                            this.f67535r = null;
                            this.f67536s = z11;
                            this.f67537t = 8;
                            objC = dVar.C(this);
                            if (objC != coroutine_suspended) {
                                full2 = full;
                                dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                                return full2;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 6:
                    CustomerState customerState3 = (CustomerState) this.f67535r;
                    y.Configuration configuration15 = (y.Configuration) this.f67534q;
                    PaymentMethodMetadata paymentMethodMetadata10 = (PaymentMethodMetadata) this.f67533p;
                    StripeIntent stripeIntent6 = (StripeIntent) this.f67532o;
                    Deferred deferred13 = (Deferred) this.f67531n;
                    ElementsSession elementsSession6 = (ElementsSession) this.f67538u;
                    t.b(obj);
                    elementsSession2 = elementsSession6;
                    stripeIntent3 = stripeIntent6;
                    paymentMethodMetadata3 = paymentMethodMetadata10;
                    configuration2 = configuration15;
                    customerState2 = customerState3;
                    deferred6 = deferred13;
                    objAwait3 = obj;
                    linkState = (LinkState) objAwait3;
                    this.f67538u = elementsSession2;
                    this.f67531n = stripeIntent3;
                    this.f67532o = paymentMethodMetadata3;
                    this.f67533p = configuration2;
                    this.f67534q = customerState2;
                    this.f67535r = linkState;
                    this.f67537t = 7;
                    objAwait4 = deferred6.await(this);
                    if (objAwait4 != coroutine_suspended) {
                        configuration3 = configuration2;
                        linkState2 = linkState;
                        stripeIntent4 = stripeIntent3;
                        elementsSession3 = elementsSession2;
                        full = new Full(configuration3, customerState2, linkState2, (w70.j) objAwait4, q.e(stripeIntent4), paymentMethodMetadata3);
                        dVar = d.this;
                        z11 = this.f67543z;
                        this.f67538u = full;
                        this.f67531n = dVar;
                        this.f67532o = elementsSession3;
                        this.f67533p = full;
                        this.f67534q = null;
                        this.f67535r = null;
                        this.f67536s = z11;
                        this.f67537t = 8;
                        objC = dVar.C(this);
                        if (objC != coroutine_suspended) {
                            full2 = full;
                            dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                            return full2;
                        }
                    }
                    return coroutine_suspended;
                case 7:
                    LinkState linkState3 = (LinkState) this.f67535r;
                    customerState2 = (CustomerState) this.f67534q;
                    y.Configuration configuration16 = (y.Configuration) this.f67533p;
                    paymentMethodMetadata3 = (PaymentMethodMetadata) this.f67532o;
                    stripeIntent4 = (StripeIntent) this.f67531n;
                    ElementsSession elementsSession7 = (ElementsSession) this.f67538u;
                    t.b(obj);
                    linkState2 = linkState3;
                    configuration3 = configuration16;
                    elementsSession3 = elementsSession7;
                    objAwait4 = obj;
                    full = new Full(configuration3, customerState2, linkState2, (w70.j) objAwait4, q.e(stripeIntent4), paymentMethodMetadata3);
                    dVar = d.this;
                    z11 = this.f67543z;
                    this.f67538u = full;
                    this.f67531n = dVar;
                    this.f67532o = elementsSession3;
                    this.f67533p = full;
                    this.f67534q = null;
                    this.f67535r = null;
                    this.f67536s = z11;
                    this.f67537t = 8;
                    objC = dVar.C(this);
                    if (objC != coroutine_suspended) {
                        full2 = full;
                        dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                        return full2;
                    }
                    return coroutine_suspended;
                case 8:
                    z11 = this.f67536s;
                    Full full3 = (Full) this.f67533p;
                    elementsSession3 = (ElementsSession) this.f67532o;
                    dVar = (d) this.f67531n;
                    full2 = (Full) this.f67538u;
                    t.b(obj);
                    full = full3;
                    objC = obj;
                    dVar.G(elementsSession3, full, z11, ((Boolean) objC).booleanValue(), this.f67542y);
                    return full2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Full> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {350, 359}, m = "loadLinkState", n = {"this", "config", "elementsSession", "linkSignUpDisabled", "this", "config", "elementsSession", "linkConfig", "linkSignUpDisabled"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67572n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f67573o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f67574p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f67575q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f67576r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f67577s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f67579u;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67577s = obj;
            this.f67579u |= Integer.MIN_VALUE;
            return d.this.D(null, null, null, null, false, false, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m = "retrieveCustomerPaymentMethods", n = {}, s = {})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f67580n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f67582p;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67580n = obj;
            this.f67582p |= Integer.MIN_VALUE;
            return d.this.H(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {}, l = {183}, m = "retrieveElementsSession-yxL6bBk", n = {}, s = {})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f67583n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f67585p;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67583n = obj;
            this.f67585p |= Integer.MIN_VALUE;
            Object objI = d.this.I(null, null, null, null, this);
            return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : jn0.s.a(objI);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {0, 1, 1}, l = {DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, DownloaderService.STATUS_UNKNOWN_ERROR, DownloaderService.STATUS_UNHANDLED_HTTP_CODE}, m = "retrieveInitialPaymentSelection", n = {"customer", "customer", "selection"}, s = {"L$0", "L$0", "L$1"})
    static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67586n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f67587o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f67588p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f67590r;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67588p = obj;
            this.f67590r |= Integer.MIN_VALUE;
            return d.this.J(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", f = "PaymentSheetLoader.kt", i = {}, l = {521}, m = "retrieveSavedPaymentMethodSelection", n = {}, s = {})
    static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f67591n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f67593p;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67591n = obj;
            this.f67593p |= Integer.MIN_VALUE;
            return d.this.K(null, this);
        }
    }

    public d(wn0.l<y.CustomerConfiguration, r> prefsRepositoryFactory, wn0.l<a60.d, com.stripe.android.googlepaylauncher.l> googlePayRepositoryFactory, f80.b elementsSessionRepository, com.stripe.android.paymentsheet.repositories.b customerRepository, t60.d lpmRepository, o30.d logger, EventReporter eventReporter, h70.h errorReporter, CoroutineContext workContext, g80.f accountStatusProvider, d60.d linkStore, b1 externalPaymentMethodsRepository, z30.j userFacingLogger, r70.a cvcRecollectionHandler) {
        s.k(prefsRepositoryFactory, "prefsRepositoryFactory");
        s.k(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        s.k(elementsSessionRepository, "elementsSessionRepository");
        s.k(customerRepository, "customerRepository");
        s.k(lpmRepository, "lpmRepository");
        s.k(logger, "logger");
        s.k(eventReporter, "eventReporter");
        s.k(errorReporter, "errorReporter");
        s.k(workContext, "workContext");
        s.k(accountStatusProvider, "accountStatusProvider");
        s.k(linkStore, "linkStore");
        s.k(externalPaymentMethodsRepository, "externalPaymentMethodsRepository");
        s.k(userFacingLogger, "userFacingLogger");
        s.k(cvcRecollectionHandler, "cvcRecollectionHandler");
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.elementsSessionRepository = elementsSessionRepository;
        this.customerRepository = customerRepository;
        this.lpmRepository = lpmRepository;
        this.logger = logger;
        this.eventReporter = eventReporter;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.accountStatusProvider = accountStatusProvider;
        this.linkStore = linkStore;
        this.externalPaymentMethodsRepository = externalPaymentMethodsRepository;
        this.userFacingLogger = userFacingLogger;
        this.cvcRecollectionHandler = cvcRecollectionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(y.Configuration configuration, ElementsSession elementsSession, Continuation<? super Boolean> continuation) {
        return elementsSession.getIsGooglePayEnabled() ? B(configuration, continuation) : Boxing.boxBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(y.Configuration configuration, Continuation<? super Boolean> continuation) {
        e eVar;
        y.GooglePayConfiguration.c environment;
        a60.d dVar;
        Flow<Boolean> flowIsReady;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f67527p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f67527p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objFirst = eVar.f67525n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f67527p;
        boolean z11 = false;
        if (i12 == 0) {
            t.b(objFirst);
            y.GooglePayConfiguration googlePay = configuration.getGooglePay();
            if (googlePay != null && (environment = googlePay.getEnvironment()) != null) {
                wn0.l<a60.d, com.stripe.android.googlepaylauncher.l> lVar = this.googlePayRepositoryFactory;
                int i13 = b.f67506b[environment.ordinal()];
                if (i13 == 1) {
                    dVar = a60.d.Production;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = a60.d.Test;
                }
                com.stripe.android.googlepaylauncher.l lVarInvoke = lVar.invoke(dVar);
                if (lVarInvoke != null && (flowIsReady = lVarInvoke.isReady()) != null) {
                    eVar.f67527p = 1;
                    objFirst = FlowKt.first(flowIsReady, eVar);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Boxing.boxBoolean(z11);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(objFirst);
        if (((Boolean) objFirst).booleanValue()) {
            z11 = true;
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(Continuation<? super Boolean> continuation) {
        return FlowKt.first(this.googlePayRepositoryFactory.invoke(a60.d.Production).isReady(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object D(y.Configuration configuration, a aVar, ElementsSession elementsSession, String str, boolean z11, boolean z12, Map<String, Boolean> map, Continuation<? super LinkState> continuation) {
        i iVar;
        boolean z13;
        d dVar;
        y.Configuration configuration2;
        ElementsSession elementsSession2;
        d dVar2;
        y.Configuration configuration3;
        ElementsSession elementsSession3;
        LinkConfiguration linkConfiguration;
        boolean z14;
        int i11;
        LinkState.b bVar;
        boolean z15;
        boolean zC;
        m60.k kVar;
        m60.k kVar2;
        boolean zContains;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i12 = iVar.f67579u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iVar.f67579u = i12 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f67577s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = iVar2.f67579u;
        if (i13 == 0) {
            t.b(obj);
            iVar2.f67572n = this;
            iVar2.f67573o = configuration;
            iVar2.f67574p = elementsSession;
            z13 = z12;
            iVar2.f67576r = z13;
            iVar2.f67579u = 1;
            Object objW = w(configuration, aVar, elementsSession, str, z11, map, iVar2);
            if (objW != coroutine_suspended) {
                dVar = this;
                configuration2 = configuration;
                elementsSession2 = elementsSession;
                obj = objW;
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            boolean z16 = iVar2.f67576r;
            elementsSession2 = (ElementsSession) iVar2.f67574p;
            configuration2 = (y.Configuration) iVar2.f67573o;
            d dVar3 = (d) iVar2.f67572n;
            t.b(obj);
            z13 = z16;
            dVar = dVar3;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z14 = iVar2.f67576r;
            linkConfiguration = (LinkConfiguration) iVar2.f67575q;
            elementsSession3 = (ElementsSession) iVar2.f67574p;
            configuration3 = (y.Configuration) iVar2.f67573o;
            dVar2 = (d) iVar2.f67572n;
            t.b(obj);
        }
        g60.a aVar2 = (g60.a) obj;
        i11 = b.f67505a[aVar2.ordinal()];
        if (i11 != 1) {
            bVar = LinkState.b.LoggedIn;
        } else if (i11 != 2 || i11 == 3) {
            bVar = LinkState.b.NeedsVerification;
        } else {
            if (i11 != 4 && i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = LinkState.b.LoggedOut;
        }
        PaymentMethod.p pVar = PaymentMethod.p.Card;
        String str2 = pVar.code;
        StripeIntent stripeIntent = elementsSession3.getStripeIntent();
        u60.h hVarA = u60.f.a(elementsSession3);
        if (configuration3.getCustomer() != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean zA = t60.f.a(str2, hVarA, stripeIntent, z15);
        zC = dVar2.linkStore.c();
        kVar = null;
        if (!zC || z14) {
            kVar2 = null;
        } else {
            kVar2 = zA ? m60.k.AlongsideSaveForFutureUse : m60.k.InsteadOfSaveForFutureUse;
        }
        zContains = linkConfiguration.getStripeIntent().u3().contains(pVar.code);
        boolean z17 = aVar2 == g60.a.SignedOut;
        if (zContains && z17) {
            kVar = kVar2;
        }
        return new LinkState(linkConfiguration, bVar, kVar);
        LinkConfiguration linkConfiguration2 = (LinkConfiguration) obj;
        g80.f fVar = dVar.accountStatusProvider;
        iVar2.f67572n = dVar;
        iVar2.f67573o = configuration2;
        iVar2.f67574p = elementsSession2;
        iVar2.f67575q = linkConfiguration2;
        iVar2.f67576r = z13;
        iVar2.f67579u = 2;
        Object objA = fVar.a(linkConfiguration2, iVar2);
        if (objA != coroutine_suspended) {
            dVar2 = dVar;
            configuration3 = configuration2;
            elementsSession3 = elementsSession2;
            linkConfiguration = linkConfiguration2;
            obj = objA;
            z14 = z13;
            g60.a aVar3 = (g60.a) obj;
            i11 = b.f67505a[aVar3.ordinal()];
            if (i11 != 1) {
                bVar = LinkState.b.LoggedIn;
            } else if (i11 != 2) {
                bVar = LinkState.b.NeedsVerification;
            } else {
                bVar = LinkState.b.NeedsVerification;
            }
            PaymentMethod.p pVar2 = PaymentMethod.p.Card;
            String str3 = pVar2.code;
            StripeIntent stripeIntent2 = elementsSession3.getStripeIntent();
            u60.h hVarA2 = u60.f.a(elementsSession3);
            if (configuration3.getCustomer() != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zA2 = t60.f.a(str3, hVarA2, stripeIntent2, z15);
            zC = dVar2.linkStore.c();
            kVar = null;
            if (zC) {
                kVar2 = null;
            } else {
                kVar2 = null;
            }
            zContains = linkConfiguration.getStripeIntent().u3().contains(pVar2.code);
            if (aVar3 == g60.a.SignedOut) {
            }
            if (zContains) {
                kVar = kVar2;
            }
            return new LinkState(linkConfiguration, bVar, kVar);
        }
        return coroutine_suspended;
    }

    private final void E(List<String> requestedExternalPaymentMethods, List<ExternalPaymentMethodSpec> actualExternalPaymentMethods) {
        ArrayList arrayList;
        List<String> list = requestedExternalPaymentMethods;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (actualExternalPaymentMethods != null) {
            List<ExternalPaymentMethodSpec> list2 = actualExternalPaymentMethods;
            arrayList = new ArrayList(v.y(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ExternalPaymentMethodSpec) it.next()).getType());
            }
        } else {
            arrayList = null;
        }
        for (String str : requestedExternalPaymentMethods) {
            if (arrayList == null || !arrayList.contains(str)) {
                this.userFacingLogger.a("Requested external payment method " + str + " is not supported. View all available external payment methods here: https://docs.stripe.com/payments/external-payment-methods?platform=android#available-external-payment-methods");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Throwable error) {
        this.logger.error("Failure loading PaymentSheetState", error);
        this.eventReporter.u(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(ElementsSession elementsSession, Full state, boolean isReloadingAfterProcessDeath, boolean isGooglePaySupported, y.m initializationMode) {
        Throwable sessionsError = elementsSession.getSessionsError();
        if (sessionsError != null) {
            this.eventReporter.d(sessionsError);
        }
        boolean z11 = !state.i().v3() || isReloadingAfterProcessDeath;
        if (state.getValidationError() != null && z11) {
            this.eventReporter.u(state.getValidationError());
            return;
        }
        EventReporter eventReporter = this.eventReporter;
        ElementsSession.LinkSettings linkSettings = elementsSession.getLinkSettings();
        n0 linkMode = linkSettings != null ? linkSettings.getLinkMode() : null;
        String strA = w70.d.a(elementsSession.getStripeIntent());
        w70.j paymentSelection = state.getPaymentSelection();
        List<SupportedPaymentMethod> listE = state.getPaymentMethodMetadata().E();
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(((SupportedPaymentMethod) it.next()).getCode());
        }
        eventReporter.s(paymentSelection, linkMode, isGooglePaySupported, strA, initializationMode, arrayList, this.cvcRecollectionHandler.b(state.getPaymentMethodMetadata().getStripeIntent(), initializationMode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(PaymentMethodMetadata paymentMethodMetadata, y.CustomerConfiguration customerConfiguration, Continuation<? super List<PaymentMethod>> continuation) {
        j jVar;
        Object objC;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f67582p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f67582p = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object obj = jVar.f67580n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar.f67582p;
        if (i12 == 0) {
            t.b(obj);
            List<PaymentMethod.p> listL = paymentMethodMetadata.L();
            y.i accessType = customerConfiguration.getAccessType();
            y.i.CustomerSession customerSession = accessType instanceof y.i.CustomerSession ? (y.i.CustomerSession) accessType : null;
            String customerSessionClientSecret = customerSession != null ? customerSession.getCustomerSessionClientSecret() : null;
            com.stripe.android.paymentsheet.repositories.b bVar = this.customerRepository;
            com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo = new com.stripe.android.paymentsheet.repositories.b.CustomerInfo(customerConfiguration.getId(), customerConfiguration.getEphemeralKeySecret(), customerSessionClientSecret);
            boolean isLiveMode = paymentMethodMetadata.getStripeIntent().getIsLiveMode();
            jVar.f67582p = 1;
            objC = bVar.c(customerInfo, listL, isLiveMode, jVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objC = ((jn0.s) obj).getValue();
        }
        t.b(objC);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objC) {
            if (((PaymentMethod) obj2).a()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object I(y.m mVar, y.CustomerConfiguration customerConfiguration, List<String> list, String str, Continuation<? super jn0.s<ElementsSession>> continuation) {
        k kVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f67585p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f67585p = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f67583n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar2.f67585p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        f80.b bVar = this.elementsSessionRepository;
        kVar2.f67585p = 1;
        Object objA = bVar.a(mVar, customerConfiguration, list, str, kVar2);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba A[PHI: r9
      0x00ba: PHI (r9v2 kotlinx.coroutines.Deferred<g80.a>) = 
      (r9v1 kotlinx.coroutines.Deferred<g80.a>)
      (r9v4 kotlinx.coroutines.Deferred<g80.a>)
      (r9v4 kotlinx.coroutines.Deferred<g80.a>)
      (r9v4 kotlinx.coroutines.Deferred<g80.a>)
     binds: [B:47:0x00b8, B:33:0x0081, B:35:0x0087, B:44:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r10 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (r10 == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(kotlinx.coroutines.Deferred<? extends w70.m> r8, kotlinx.coroutines.Deferred<g80.CustomerState> r9, p013kotlin.coroutines.Continuation<? super w70.j> r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.d.J(kotlinx.coroutines.Deferred, kotlinx.coroutines.Deferred, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K(y.Configuration configuration, Continuation<? super w70.m.PaymentMethod> continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f67593p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f67593p = i11 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objM = mVar.f67591n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mVar.f67593p;
        if (i12 == 0) {
            t.b(objM);
            y.CustomerConfiguration customer = configuration.getCustomer();
            y.i accessType = customer != null ? customer.getAccessType() : null;
            if (!(accessType instanceof y.i.CustomerSession)) {
                if ((accessType instanceof y.i.LegacyCustomerEphemeralKey) || accessType == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            mVar.f67593p = 1;
            objM = M(configuration, false, false, mVar);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objM);
        }
        if (objM instanceof w70.m.PaymentMethod) {
            return (w70.m.PaymentMethod) objM;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(y.Configuration configuration, boolean z11, ElementsSession elementsSession, Continuation<? super w70.m> continuation) {
        return M(configuration, z11, elementsSession.m(), continuation);
    }

    private final Object M(y.Configuration configuration, boolean z11, boolean z12, Continuation<? super w70.m> continuation) {
        return this.prefsRepositoryFactory.invoke(configuration.getCustomer()).b(z11, z12, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N(PaymentMethodMetadata metadata) {
        return !metadata.K().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(StripeIntent stripeIntent) {
        if (stripeIntent.m3().isEmpty()) {
            return;
        }
        this.logger.a("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: " + stripeIntent.m3() + ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a u(y.Configuration config, ElementsSession elementsSession) {
        y.CustomerConfiguration customer = config.getCustomer();
        y.i accessType = customer != null ? customer.getAccessType() : null;
        if (!(accessType instanceof y.i.CustomerSession)) {
            if (accessType instanceof y.i.LegacyCustomerEphemeralKey) {
                return new a.Legacy(customer, (y.i.LegacyCustomerEphemeralKey) accessType);
            }
            return null;
        }
        ElementsSession.Customer customer2 = elementsSession.getCustomer();
        if (customer2 != null) {
            return new a.CustomerSession(customer2, ((y.i.CustomerSession) accessType).getCustomerSessionClientSecret());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Excepted 'customer' attribute as part of 'elements_session' response!");
        h70.h.b.a(this.errorReporter, h70.h.f.PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND, StripeException.INSTANCE.b(illegalStateException), null, 4, null);
        if (elementsSession.getStripeIntent().getIsLiveMode()) {
            return null;
        }
        throw illegalStateException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00df  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(a aVar, PaymentMethodMetadata paymentMethodMetadata, Deferred<? extends w70.m> deferred, u60.i iVar, Continuation<? super CustomerState> continuation) {
        c cVar;
        CustomerState customerStateA;
        String str;
        Deferred<? extends w70.m> deferred2;
        CustomerState.Companion companion;
        y.i.LegacyCustomerEphemeralKey legacyCustomerEphemeralKey;
        List<PaymentMethod> listD;
        u60.i iVar2;
        ArrayList arrayList;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f67514u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f67514u = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objAwait = cVar.f67512s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f67514u;
        if (i12 != 0) {
            if (i12 == 1) {
                legacyCustomerEphemeralKey = (y.i.LegacyCustomerEphemeralKey) cVar.f67511r;
                str = (String) cVar.f67510q;
                companion = (CustomerState.Companion) cVar.f67509p;
                iVar = (u60.i) cVar.f67508o;
                deferred2 = (Deferred) cVar.f67507n;
                t.b(objAwait);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                customerStateA = (CustomerState) cVar.f67509p;
                listD = (List) cVar.f67508o;
                iVar2 = (u60.i) cVar.f67507n;
                t.b(objAwait);
            }
            CustomerState customerState = customerStateA;
            List listD2 = g80.i.d(listD, (w70.m) objAwait);
            arrayList = new ArrayList();
            for (Object obj : listD2) {
                if (iVar2.b((PaymentMethod) obj)) {
                    arrayList.add(obj);
                }
            }
            return CustomerState.b(customerState, null, null, null, arrayList, null, 23, null);
        }
        t.b(objAwait);
        if (!(aVar instanceof a.CustomerSession)) {
            if (aVar instanceof a.Legacy) {
                CustomerState.Companion companion2 = CustomerState.INSTANCE;
                a.Legacy legacy = (a.Legacy) aVar;
                String id2 = legacy.getId();
                y.i.LegacyCustomerEphemeralKey accessType = legacy.getAccessType();
                y.CustomerConfiguration customerConfig = legacy.getCustomerConfig();
                cVar.f67507n = deferred;
                cVar.f67508o = iVar;
                cVar.f67509p = companion2;
                cVar.f67510q = id2;
                cVar.f67511r = accessType;
                cVar.f67514u = 1;
                Object objH = H(paymentMethodMetadata, customerConfig, cVar);
                if (objH != coroutine_suspended) {
                    str = id2;
                    deferred2 = deferred;
                    companion = companion2;
                    objAwait = objH;
                    legacyCustomerEphemeralKey = accessType;
                }
            } else {
                customerStateA = null;
            }
            return coroutine_suspended;
        }
        a.CustomerSession customerSession = (a.CustomerSession) aVar;
        customerStateA = CustomerState.INSTANCE.a(customerSession.getElementsSessionCustomer(), paymentMethodMetadata.L(), customerSession.getCustomerSessionClientSecret());
        if (customerStateA != null) {
            return null;
        }
        listD = customerStateA.d();
        cVar.f67507n = iVar;
        cVar.f67508o = listD;
        cVar.f67509p = customerStateA;
        cVar.f67510q = null;
        cVar.f67511r = null;
        cVar.f67514u = 2;
        objAwait = deferred.await(cVar);
        if (objAwait != coroutine_suspended) {
            iVar2 = iVar;
            CustomerState customerState2 = customerStateA;
            List listD3 = g80.i.d(listD, (w70.m) objAwait);
            arrayList = new ArrayList();
            while (r11.hasNext()) {
                if (iVar2.b((PaymentMethod) obj)) {
                    arrayList.add(obj);
                }
            }
            return CustomerState.b(customerState2, null, null, null, arrayList, null, 23, null);
        }
        return coroutine_suspended;
        customerStateA = companion.b(str, legacyCustomerEphemeralKey, (List) objAwait);
        deferred = deferred2;
        if (customerStateA != null) {
            return null;
        }
        listD = customerStateA.d();
        cVar.f67507n = iVar;
        cVar.f67508o = listD;
        cVar.f67509p = customerStateA;
        cVar.f67510q = null;
        cVar.f67511r = null;
        cVar.f67514u = 2;
        objAwait = deferred.await(cVar);
        if (objAwait != coroutine_suspended) {
            iVar2 = iVar;
            CustomerState customerState3 = customerStateA;
            List listD4 = g80.i.d(listD, (w70.m) objAwait);
            arrayList = new ArrayList();
            while (r11.hasNext()) {
                if (iVar2.b((PaymentMethod) obj)) {
                    arrayList.add(obj);
                }
            }
            return CustomerState.b(customerState3, null, null, null, arrayList, null, 23, null);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0151  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object w(y.Configuration configuration, a aVar, ElementsSession elementsSession, String str, boolean z11, Map<String, Boolean> map, Continuation<? super LinkConfiguration> continuation) {
        C1390d c1390d;
        String phone;
        Map<IdentifierSpec, String> mapB;
        y.Configuration configuration2;
        boolean z12;
        Map<String, Boolean> map2;
        String str2;
        ElementsSession elementsSession2;
        String str3;
        Map<IdentifierSpec, String> map3;
        String email;
        String str4;
        boolean z13;
        Map<String, Boolean> map4;
        Map<IdentifierSpec, String> map5;
        y.BillingDetails defaultBillingDetails;
        String name;
        y.BillingDetails defaultBillingDetails2;
        String country;
        y.Address address;
        if (continuation instanceof C1390d) {
            c1390d = (C1390d) continuation;
            int i11 = c1390d.f67524w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1390d.f67524w = i11 - Integer.MIN_VALUE;
            } else {
                c1390d = new C1390d(continuation);
            }
        } else {
            c1390d = new C1390d(continuation);
        }
        Object obj = c1390d.f67522u;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1390d.f67524w;
        if (i12 == 0) {
            t.b(obj);
            AddressDetails shippingDetails = configuration.getShippingDetails();
            if (shippingDetails != null ? s.f(shippingDetails.getIsCheckboxSelected(), Boxing.boxBoolean(true)) : false) {
                phone = shippingDetails.getPhoneNumber();
            } else {
                y.BillingDetails defaultBillingDetails3 = configuration.getDefaultBillingDetails();
                phone = defaultBillingDetails3 != null ? defaultBillingDetails3.getPhone() : null;
            }
            mapB = shippingDetails != null ? s.f(shippingDetails.getIsCheckboxSelected(), Boxing.boxBoolean(true)) : false ? p017o70.b.b(shippingDetails, configuration.getDefaultBillingDetails()) : null;
            y.BillingDetails defaultBillingDetails4 = configuration.getDefaultBillingDetails();
            if (defaultBillingDetails4 == null || (email = defaultBillingDetails4.getEmail()) == null) {
                if (aVar != null) {
                    com.stripe.android.paymentsheet.repositories.b bVar = this.customerRepository;
                    String id2 = aVar.getId();
                    String ephemeralKeySecret = aVar.getEphemeralKeySecret();
                    a.CustomerSession customerSession = aVar instanceof a.CustomerSession ? (a.CustomerSession) aVar : null;
                    com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo = new com.stripe.android.paymentsheet.repositories.b.CustomerInfo(id2, ephemeralKeySecret, customerSession != null ? customerSession.getCustomerSessionClientSecret() : null);
                    configuration2 = configuration;
                    c1390d.f67515n = configuration2;
                    c1390d.f67516o = elementsSession;
                    c1390d.f67517p = str;
                    map2 = map;
                    c1390d.f67518q = map2;
                    c1390d.f67519r = phone;
                    c1390d.f67520s = mapB;
                    z12 = z11;
                    c1390d.f67521t = z12;
                    c1390d.f67524w = 1;
                    Object objE = bVar.e(customerInfo, c1390d);
                    if (objE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map3 = mapB;
                    obj = objE;
                    str2 = phone;
                    elementsSession2 = elementsSession;
                    str3 = str;
                } else {
                    configuration2 = configuration;
                    z12 = z11;
                    map2 = map;
                    str2 = phone;
                    elementsSession2 = elementsSession;
                    str3 = str;
                }
                map5 = mapB;
                map4 = map2;
                z13 = z12;
                str4 = str3;
                phone = str2;
                email = null;
            } else {
                configuration2 = configuration;
                elementsSession2 = elementsSession;
                str4 = str;
                z13 = z11;
                map4 = map;
                map5 = mapB;
            }
            String merchantDisplayName = configuration2.getMerchantDisplayName();
            defaultBillingDetails = configuration2.getDefaultBillingDetails();
            if (defaultBillingDetails != null) {
                name = defaultBillingDetails.getName();
            } else {
                name = null;
            }
            defaultBillingDetails2 = configuration2.getDefaultBillingDetails();
            if (defaultBillingDetails2 != null || (address = defaultBillingDetails2.getAddress()) == null) {
                country = null;
            } else {
                country = address.getCountry();
            }
            LinkConfiguration.CustomerInfo customerInfo2 = new LinkConfiguration.CustomerInfo(name, email, phone, country);
            ElementsSession.CardBrandChoice cardBrandChoice = elementsSession2.getCardBrandChoice();
            return new LinkConfiguration(elementsSession2.getStripeIntent(), merchantDisplayName, str4, customerInfo2, map5, z13, map4, cardBrandChoice != null ? new LinkConfiguration.CardBrandChoice(cardBrandChoice.getEligible(), cardBrandChoice.b()) : null);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z14 = c1390d.f67521t;
        map3 = (Map) c1390d.f67520s;
        str2 = (String) c1390d.f67519r;
        Map<String, Boolean> map6 = (Map) c1390d.f67518q;
        str3 = (String) c1390d.f67517p;
        elementsSession2 = (ElementsSession) c1390d.f67516o;
        y.Configuration configuration3 = (y.Configuration) c1390d.f67515n;
        t.b(obj);
        z12 = z14;
        configuration2 = configuration3;
        map2 = map6;
        Customer customer = (Customer) obj;
        if (customer != null) {
            map5 = map3;
            map4 = map2;
            z13 = z12;
            str4 = str3;
            phone = str2;
            email = customer.getEmail();
        } else {
            mapB = map3;
            map5 = mapB;
            map4 = map2;
            z13 = z12;
            str4 = str3;
            phone = str2;
            email = null;
        }
        String merchantDisplayName2 = configuration2.getMerchantDisplayName();
        defaultBillingDetails = configuration2.getDefaultBillingDetails();
        if (defaultBillingDetails != null) {
            name = defaultBillingDetails.getName();
        } else {
            name = null;
        }
        defaultBillingDetails2 = configuration2.getDefaultBillingDetails();
        if (defaultBillingDetails2 != null) {
            country = null;
        } else {
            country = null;
        }
        LinkConfiguration.CustomerInfo customerInfo3 = new LinkConfiguration.CustomerInfo(name, email, phone, country);
        ElementsSession.CardBrandChoice cardBrandChoice2 = elementsSession2.getCardBrandChoice();
        return new LinkConfiguration(elementsSession2.getStripeIntent(), merchantDisplayName2, str4, customerInfo3, map5, z13, map4, cardBrandChoice2 != null ? new LinkConfiguration.CardBrandChoice(cardBrandChoice2.getEligible(), cardBrandChoice2.b()) : null);
    }

    private final LinkInlineConfiguration x(LinkState state) {
        m60.k signupMode;
        if (state == null || (signupMode = state.getSignupMode()) == null) {
            return null;
        }
        return new LinkInlineConfiguration(signupMode, state.getConfiguration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(ElementsSession elementsSession, y.Configuration configuration, a aVar, Continuation<? super LinkState> continuation) {
        if (!elementsSession.m() || configuration.getBillingDetailsCollectionConfiguration().c()) {
            return null;
        }
        Object objD = D(configuration, aVar, elementsSession, elementsSession.getMerchantCountry(), elementsSession.f(), elementsSession.c(), elementsSession.e(), continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : (LinkState) objD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodMetadata z(y.Configuration paymentSheetConfiguration, ElementsSession elementsSession, LinkState linkState, boolean isGooglePayReady) {
        t60.d.Result resultB = this.lpmRepository.b(elementsSession.getStripeIntent(), elementsSession.getPaymentMethodSpecs());
        if (resultB.getFailedToParseServerResponse()) {
            this.eventReporter.v(resultB.getFailedToParseServerErrorMessage());
        }
        List<ExternalPaymentMethodSpec> listA = this.externalPaymentMethodsRepository.a(elementsSession.getExternalPaymentMethodData());
        E(paymentSheetConfiguration.i(), listA);
        return PaymentMethodMetadata.INSTANCE.b(elementsSession, paymentSheetConfiguration, resultB.c(), listA, isGooglePayReady, x(linkState));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // g80.h
    public Object a(y.m mVar, y.Configuration configuration, boolean z11, boolean z12, Continuation<? super jn0.s<Full>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f67530p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f67530p = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f67528n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f67530p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        CoroutineContext coroutineContext = this.workContext;
        g gVar = new g(this);
        h hVar = new h(z12, configuration, mVar, z11, null);
        fVar.f67530p = 1;
        Object objA = k30.a.a(coroutineContext, gVar, hVar, fVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
