package p027z70;

import android.app.Application;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.f0;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n0;
import com.stripe.android.model.y0;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.paymentsheet.y;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import f30.PaymentConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p010i90.SameAsShippingElement;
import p010i90.a0;
import p010i90.j0;
import p010i90.q0;
import p010i90.r1;
import p010i90.v1;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p017o70.AddressDetails;
import w80.Amount;
import wn0.r;
import x30.c;
import y70.FormArguments;
import z80.SaveForFutureUseElement;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 ¼\u00012\u00020\u0001:\u0006½\u0001¾\u0001¿\u0001B/\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010,J+\u00101\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u001a2\b\u00100\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b1\u00102J'\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u001aH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u0002062\u0006\u0010=\u001a\u0002092\b\b\u0002\u0010>\u001a\u000209H\u0002¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020EH\u0007¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u001e¢\u0006\u0004\bI\u0010JJ\u0019\u0010L\u001a\u00020\u000f2\n\b\u0002\u0010K\u001a\u0004\u0018\u000106¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u000f¢\u0006\u0004\bN\u0010,J\r\u0010O\u001a\u00020\u001a¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u0004\u0018\u00010Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010c\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010e\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010bR\u0014\u0010g\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010bR\u0014\u0010i\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010bR\u0016\u0010l\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0017\u0010q\u001a\u00020m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\ba\u0010pR\u001d\u0010w\u001a\b\u0012\u0004\u0012\u00020\u001a0r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0016\u0010y\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010kR\u0017\u0010z\u001a\u00020m8\u0006¢\u0006\f\n\u0004\bF\u0010o\u001a\u0004\bW\u0010pR\u001f\u0010|\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010t\u001a\u0004\b{\u0010vR\u0016\u0010}\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010kR\u0016\u0010~\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010kR\u001a\u0010\u0082\u0001\u001a\u00020\u007f8\u0006¢\u0006\u000e\n\u0005\bI\u0010\u0080\u0001\u001a\u0005\bd\u0010\u0081\u0001R!\u0010\u0084\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0r8\u0006¢\u0006\r\n\u0004\b\u001c\u0010t\u001a\u0005\b\u0083\u0001\u0010vR\u0019\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010\u0086\u0001R\u001d\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006¢\u0006\u000e\n\u0005\bC\u0010\u0089\u0001\u001a\u0005\bj\u0010\u008a\u0001R\u001b\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0006¢\u0006\u000e\n\u0005\bL\u0010\u008d\u0001\u001a\u0005\bQ\u0010\u008e\u0001R#\u0010\u0092\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u00010r8\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010t\u001a\u0005\b\u0091\u0001\u0010vR\"\u0010\u0095\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010r8\u0006¢\u0006\r\n\u0005\b\u0094\u0001\u0010t\u001a\u0004\b^\u0010vR \u0010\u0099\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\"\u0010\u000e\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001030\u009a\u00018\u0006¢\u0006\u000e\n\u0005\b1\u0010\u009b\u0001\u001a\u0005\bh\u0010\u009c\u0001R\u001f\u0010\u009d\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010E0\u0096\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u0098\u0001R$\u0010\u009f\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010E0\u009a\u00018\u0006¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u009b\u0001\u001a\u0005\bS\u0010\u009c\u0001R\u0016\u0010¡\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0001\u0010bR\u001c\u0010¦\u0001\u001a\u00030¢\u00018\u0006¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\bs\u0010¥\u0001R\u001e\u0010:\u001a\b\u0012\u0004\u0012\u0002090r8\u0006¢\u0006\r\n\u0005\b§\u0001\u0010t\u001a\u0004\bn\u0010vR\u001e\u0010«\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001e\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0r8\u0006¢\u0006\f\n\u0004\bb\u0010t\u001a\u0004\bU\u0010vR\u001f\u0010®\u0001\u001a\b\u0012\u0004\u0012\u0002090r8\u0006¢\u0006\r\n\u0005\b\u00ad\u0001\u0010t\u001a\u0004\bf\u0010vR3\u0010·\u0001\u001a\u0005\u0018\u00010¯\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b°\u0001\u0010±\u0001\u0012\u0005\b¶\u0001\u0010,\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R(\u0010º\u0001\u001a\u0002092\u0007\u0010¸\u0001\u001a\u0002098B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\bZ\u0010¹\u0001\"\u0005\b\u0094\u0001\u0010<R(\u0010»\u0001\u001a\u0002092\u0007\u0010¸\u0001\u001a\u0002098B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\bx\u0010¹\u0001\"\u0005\b\u0097\u0001\u0010<¨\u0006À\u0001"}, d2 = {"Lz70/h;", "Landroidx/lifecycle/c1;", "Lz70/h$c;", "args", "Landroid/app/Application;", Kind.APPLICATION, "Ljavax/inject/Provider;", "Lf30/o;", "lazyPaymentConfig", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Lz70/h$c;Landroid/app/Application;Ljavax/inject/Provider;Landroidx/lifecycle/s0;)V", "Lcom/stripe/android/payments/bankaccount/navigation/a;", "result", "Ljn0/h0;", "J", "(Lcom/stripe/android/payments/bankaccount/navigation/a;)V", "Lcom/stripe/android/payments/bankaccount/navigation/e$b;", "H", "(Lcom/stripe/android/payments/bankaccount/navigation/e$b;)V", "Lcom/stripe/android/payments/bankaccount/navigation/a$b;", "I", "(Lcom/stripe/android/payments/bankaccount/navigation/a$b;)V", "Lcom/stripe/android/payments/bankaccount/navigation/c$c;", "usBankAccountData", "", "intentId", "L", "(Lcom/stripe/android/payments/bankaccount/navigation/c$c;Ljava/lang/String;)V", "Lz70/f;", "q", "()Lz70/f;", "clientSecret", "k", "(Ljava/lang/String;)V", "m", "Lb70/a$a;", "n", "()Lb70/a$a;", "Lb70/a$b;", "p", "()Lb70/a$b;", "l", "()V", "Lz70/f$c;", "resultIdentifier", "bankName", "last4", "S", "(Lz70/f$c;Ljava/lang/String;Ljava/lang/String;)V", "Lw70/j$e$d;", "o", "(Lz70/f$c;Ljava/lang/String;Ljava/lang/String;)Lw70/j$e$d;", "Lx30/c;", "j", "()Lx30/c;", "", "saveForFutureUse", "T", "(Z)V", "isVerifyWithMicrodeposits", "isSaveForFutureUseSelected", "h", "(ZZ)Lx30/c;", "Lh/d;", "activityResultRegistryOwner", Gender.NONE, "(Lh/d;)V", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "G", "(Lcom/stripe/android/payments/bankaccount/navigation/e;)V", "screenState", "K", "(Lz70/f;)V", AnalyticsAttribute.Error, Gender.OTHER, "(Lx30/c;)V", Gender.MALE, "r", "()Ljava/lang/String;", "s", "Lz70/h$c;", "t", "Landroid/app/Application;", "u", "Ljavax/inject/Provider;", "v", "Landroidx/lifecycle/s0;", "Lcom/stripe/android/paymentsheet/y$c;", "w", "Lcom/stripe/android/paymentsheet/y$c;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/y$d;", "x", "Lcom/stripe/android/paymentsheet/y$d;", "collectionConfiguration", "y", "Z", "collectingAddress", "z", "collectingPhone", "A", "collectingName", "B", "collectingEmail", "C", "Ljava/lang/String;", "defaultName", "Li90/v1;", "D", "Li90/v1;", "()Li90/v1;", "nameController", "Lkotlinx/coroutines/flow/StateFlow;", "E", "Lkotlinx/coroutines/flow/StateFlow;", "getName", "()Lkotlinx/coroutines/flow/StateFlow;", "name", Gender.FEMALE, "defaultEmail", "emailController", "getEmail", Scopes.EMAIL, "defaultPhoneCountry", "defaultPhone", "Li90/q0;", "Li90/q0;", "()Li90/q0;", "phoneController", "getPhone", "phone", "Lcom/stripe/android/model/b;", "Lcom/stripe/android/model/b;", "defaultAddress", "Li90/d1;", "Li90/d1;", "()Li90/d1;", "sameAsShippingElement", "Li90/b;", "Li90/b;", "()Li90/b;", "addressElement", "P", "getAddress", PlaceTypes.ADDRESS, "Li90/g0;", "Q", "lastTextFieldIdentifier", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "R", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_result", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "_collectBankAccountResult", Gender.UNKNOWN, "collectBankAccountResult", "V", "defaultSaveForFutureUse", "Lz80/b2;", "W", "Lz80/b2;", "()Lz80/b2;", "saveForFutureUseElement", "X", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Y", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentScreenState", "currentScreenState", "a0", "requiredFields", "Lb70/f;", "b0", "Lb70/f;", "getCollectBankAccountLauncher", "()Lb70/f;", "setCollectBankAccountLauncher", "(Lb70/f;)V", "getCollectBankAccountLauncher$annotations", "collectBankAccountLauncher", "value", "()Z", "hasLaunched", "shouldReset", "c0", "c", DateTokenConverter.CONVERTER_KEY, "e", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h extends c1 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final d f127274c0 = new d(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f127275d0 = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final boolean collectingName;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final boolean collectingEmail;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final String defaultName;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final v1 nameController;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final StateFlow<String> name;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String defaultEmail;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final v1 emailController;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final StateFlow<String> email;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String defaultPhoneCountry;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String defaultPhone;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final q0 phoneController;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final StateFlow<String> phone;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final Address defaultAddress;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final SameAsShippingElement sameAsShippingElement;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final p010i90.b addressElement;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final StateFlow<Address> address;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final StateFlow<IdentifierSpec> lastTextFieldIdentifier;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final MutableSharedFlow<w70.j.e.USBankAccount> _result;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final Flow<w70.j.e.USBankAccount> result;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final MutableSharedFlow<com.stripe.android.payments.bankaccount.navigation.e> _collectBankAccountResult;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final Flow<com.stripe.android.payments.bankaccount.navigation.e> collectBankAccountResult;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final boolean defaultSaveForFutureUse;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final SaveForFutureUseElement saveForFutureUseElement;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final StateFlow<Boolean> saveForFutureUse;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final MutableStateFlow<p027z70.f> _currentScreenState;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final StateFlow<p027z70.f> currentScreenState;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> requiredFields;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private b70.f collectBankAccountLauncher;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Args args;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Provider<PaymentConfiguration> lazyPaymentConfig;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final y.BillingDetails defaultBillingDetails;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final y.BillingDetailsCollectionConfiguration collectionConfiguration;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final boolean collectingAddress;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean collectingPhone;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$1", f = "USBankAccountFormViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127286n;

        /* JADX INFO: renamed from: z70.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C2764a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f127288a;

            C2764a(h hVar) {
                this.f127288a = hVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super h0> continuation) {
                if (str != null) {
                    this.f127288a.getPhoneController().getCountryDropdownController().t(str);
                }
                return h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f127286n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow<String> stateFlowX = h.this.getAddressElement().getCountryElement().i().x();
                C2764a c2764a = new C2764a(h.this);
                this.f127286n = 1;
                if (stateFlowX.collect(c2764a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$2", f = "USBankAccountFormViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127289n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "saveForFutureUse", "Ljn0/h0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$2$1", f = "USBankAccountFormViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<Boolean, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f127291n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ boolean f127292o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ h f127293p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f127293p = hVar;
            }

            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                return ((a) create(Boolean.valueOf(z11), continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f127293p, continuation);
                aVar.f127292o = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super h0> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f127291n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f127293p.T(this.f127292o);
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f127289n;
            if (i11 == 0) {
                t.b(obj);
                Flow flowOnEach = FlowKt.onEach(h.this.D(), new a(h.this, null));
                this.f127289n = 1;
                if (FlowKt.collect(flowOnEach, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: z70.h$c, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b+\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b-\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b&\u0010\u0017¨\u00066"}, d2 = {"Lz70/h$c;", "", "", "instantDebits", "Lcom/stripe/android/model/n0;", "linkMode", "Ly70/a;", "formArgs", "showCheckbox", "isCompleteFlow", "isPaymentFlow", "", "stripeIntentId", "clientSecret", "onBehalfOf", "Lw70/j$e$d;", "savedPaymentMethod", "Lo70/a;", "shippingDetails", "hostedSurface", "<init>", "(ZLcom/stripe/android/model/n0;Ly70/a;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw70/j$e$d;Lo70/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "Lcom/stripe/android/model/n0;", "e", "()Lcom/stripe/android/model/n0;", "c", "Ly70/a;", "()Ly70/a;", "h", "j", "f", "k", "g", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "Lw70/j$e$d;", "()Lw70/j$e$d;", "Lo70/a;", "getShippingDetails", "()Lo70/a;", "l", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean instantDebits;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final n0 linkMode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormArguments formArgs;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showCheckbox;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCompleteFlow;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPaymentFlow;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stripeIntentId;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String onBehalfOf;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j.e.USBankAccount savedPaymentMethod;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDetails shippingDetails;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String hostedSurface;

        public Args(boolean z11, n0 n0Var, FormArguments formArgs, boolean z12, boolean z13, boolean z14, String str, String str2, String str3, w70.j.e.USBankAccount dVar, AddressDetails aVar, String hostedSurface) {
            s.k(formArgs, "formArgs");
            s.k(hostedSurface, "hostedSurface");
            this.instantDebits = z11;
            this.linkMode = n0Var;
            this.formArgs = formArgs;
            this.showCheckbox = z12;
            this.isCompleteFlow = z13;
            this.isPaymentFlow = z14;
            this.stripeIntentId = str;
            this.clientSecret = str2;
            this.onBehalfOf = str3;
            this.savedPaymentMethod = dVar;
            this.shippingDetails = aVar;
            this.hostedSurface = hostedSurface;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FormArguments getFormArgs() {
            return this.formArgs;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getHostedSurface() {
            return this.hostedSurface;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getInstantDebits() {
            return this.instantDebits;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final n0 getLinkMode() {
            return this.linkMode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.instantDebits == args.instantDebits && this.linkMode == args.linkMode && s.f(this.formArgs, args.formArgs) && this.showCheckbox == args.showCheckbox && this.isCompleteFlow == args.isCompleteFlow && this.isPaymentFlow == args.isPaymentFlow && s.f(this.stripeIntentId, args.stripeIntentId) && s.f(this.clientSecret, args.clientSecret) && s.f(this.onBehalfOf, args.onBehalfOf) && s.f(this.savedPaymentMethod, args.savedPaymentMethod) && s.f(this.shippingDetails, args.shippingDetails) && s.f(this.hostedSurface, args.hostedSurface);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getOnBehalfOf() {
            return this.onBehalfOf;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final w70.j.e.USBankAccount getSavedPaymentMethod() {
            return this.savedPaymentMethod;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getShowCheckbox() {
            return this.showCheckbox;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.instantDebits) * 31;
            n0 n0Var = this.linkMode;
            int iHashCode2 = (((((((((iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31) + this.formArgs.hashCode()) * 31) + Boolean.hashCode(this.showCheckbox)) * 31) + Boolean.hashCode(this.isCompleteFlow)) * 31) + Boolean.hashCode(this.isPaymentFlow)) * 31;
            String str = this.stripeIntentId;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.clientSecret;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.onBehalfOf;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            w70.j.e.USBankAccount dVar = this.savedPaymentMethod;
            int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            AddressDetails aVar = this.shippingDetails;
            return ((iHashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.hostedSurface.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getStripeIntentId() {
            return this.stripeIntentId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsCompleteFlow() {
            return this.isCompleteFlow;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsPaymentFlow() {
            return this.isPaymentFlow;
        }

        public String toString() {
            return "Args(instantDebits=" + this.instantDebits + ", linkMode=" + this.linkMode + ", formArgs=" + this.formArgs + ", showCheckbox=" + this.showCheckbox + ", isCompleteFlow=" + this.isCompleteFlow + ", isPaymentFlow=" + this.isPaymentFlow + ", stripeIntentId=" + this.stripeIntentId + ", clientSecret=" + this.clientSecret + ", onBehalfOf=" + this.onBehalfOf + ", savedPaymentMethod=" + this.savedPaymentMethod + ", shippingDetails=" + this.shippingDetails + ", hostedSurface=" + this.hostedSurface + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz70/h$d;", "", "<init>", "()V", "", "HAS_LAUNCHED_KEY", "Ljava/lang/String;", "SHOULD_RESET_KEY", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lz70/h$e;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lkotlin/Function0;", "Lz70/h$c;", "argsSupplier", "<init>", "(Lwn0/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<Args> argsSupplier;

        public e(wn0.a<Args> argsSupplier) {
            s.k(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            h hVarA = a80.a.a().a(z30.b.a(extras)).build().a().get().c(this.argsSupplier.invoke()).b(v0.a(extras)).build().a();
            s.i(hVarA, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel.Factory.create");
            return hVarA;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "formFieldValues", "Lcom/stripe/android/model/b;", "a", "(Ljava/util/List;)Lcom/stripe/android/model/b;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.l<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>, Address> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f127307c = new f();

        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Address invoke(List<Pair<IdentifierSpec, FormFieldEntry>> formFieldValues) {
            s.k(formFieldValues, "formFieldValues");
            List<Pair<IdentifierSpec, FormFieldEntry>> list = formFieldValues;
            LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(v.y(list, 10)), 16));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Pair pairA = x.a(pair.e(), ((FormFieldEntry) pair.f()).getValue());
                linkedHashMap.put(pairA.e(), pairA.f());
            }
            return p027z70.i.d(Address.INSTANCE, linkedHashMap);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "formFieldEntry", "", "a", "(Ln90/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.l<FormFieldEntry, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f127308c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(FormFieldEntry formFieldEntry) {
            s.k(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.getIsComplete()) {
                formFieldEntry = null;
            }
            if (formFieldEntry != null) {
                return formFieldEntry.getValue();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: z70.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Li90/g0;", "it", "a", "(Ljava/util/List;)Li90/g0;"}, k = 3, mv = {1, 9, 0})
    static final class C2765h extends u implements wn0.l<List<? extends IdentifierSpec>, IdentifierSpec> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2765h f127309c = new C2765h();

        C2765h() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdentifierSpec invoke(List<IdentifierSpec> it) {
            s.k(it, "it");
            return (IdentifierSpec) v.A0(it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "formFieldEntry", "", "a", "(Ln90/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.l<FormFieldEntry, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f127310c = new i();

        i() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(FormFieldEntry formFieldEntry) {
            String value;
            s.k(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.getIsComplete()) {
                formFieldEntry = null;
            }
            return (formFieldEntry == null || (value = formFieldEntry.getValue()) == null) ? "" : value;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "formFieldEntry", "", "a", "(Ln90/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements wn0.l<FormFieldEntry, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f127311c = new j();

        j() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(FormFieldEntry formFieldEntry) {
            s.k(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.getIsComplete()) {
                formFieldEntry = null;
            }
            if (formFieldEntry != null) {
                return formFieldEntry.getValue();
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class k extends p013kotlin.jvm.internal.p implements wn0.l<com.stripe.android.payments.bankaccount.navigation.a, h0> {
        k(Object obj) {
            super(1, obj, h.class, "handleInstantDebitsResult", "handleInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V", 0);
        }

        public final void a(com.stripe.android.payments.bankaccount.navigation.a p11) {
            s.k(p11, "p0");
            ((h) this.receiver).J(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.payments.bankaccount.navigation.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class l extends p013kotlin.jvm.internal.p implements wn0.l<com.stripe.android.payments.bankaccount.navigation.e, h0> {
        l(Object obj) {
            super(1, obj, h.class, "handleCollectBankAccountResult", "handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V", 0);
        }

        public final void a(com.stripe.android.payments.bankaccount.navigation.e p11) {
            s.k(p11, "p0");
            ((h) this.receiver).G(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.payments.bankaccount.navigation.e eVar) {
            a(eVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "it", "", "a", "(Ln90/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class m extends u implements wn0.l<FormFieldEntry, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f127312c = new m();

        m() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FormFieldEntry it) {
            s.k(it, "it");
            return Boolean.valueOf(it.getIsComplete());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "it", "", "a", "(Ln90/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class n extends u implements wn0.l<FormFieldEntry, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f127313c = new n();

        n() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FormFieldEntry it) {
            s.k(it, "it");
            return Boolean.valueOf(it.getIsComplete());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln90/a;", "it", "", "a", "(Ln90/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class o extends u implements wn0.l<FormFieldEntry, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f127314c = new o();

        o() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FormFieldEntry it) {
            s.k(it, "it");
            return Boolean.valueOf(it.getIsComplete());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "formFieldValues", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class p extends u implements wn0.l<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f127315c = new p();

        p() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<Pair<IdentifierSpec, FormFieldEntry>> formFieldValues) {
            s.k(formFieldValues, "formFieldValues");
            List<Pair<IdentifierSpec, FormFieldEntry>> list = formFieldValues;
            boolean z11 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((FormFieldEntry) ((Pair) it.next()).f()).getIsComplete()) {
                        z11 = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "validName", "validEmail", "validPhone", "validAddress", "a", "(ZZZZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class q extends u implements r<Boolean, Boolean, Boolean, Boolean, Boolean> {
        q() {
            super(4);
        }

        public final Boolean a(boolean z11, boolean z12, boolean z13, boolean z14) {
            boolean z15 = false;
            if (!h.this.args.getInstantDebits()) {
                z12 = z11 && z12;
            }
            boolean z16 = (z13 || h.this.collectionConfiguration.getPhone() != y.BillingDetailsCollectionConfiguration.b.Always) && (z14 || h.this.collectionConfiguration.getAddress() != y.BillingDetailsCollectionConfiguration.a.Full);
            if (z12 && z16) {
                z15 = true;
            }
            return Boolean.valueOf(z15);
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            return a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f9  */
    public h(Args args, Application application, Provider<PaymentConfiguration> lazyPaymentConfig, s0 savedStateHandle) {
        String name;
        String strB;
        y.Address aVarA;
        String strB2;
        String strC;
        y.Address aVarA2;
        Address bVarA;
        SameAsShippingElement d1Var;
        StateFlow<IdentifierSpec> stateFlowN;
        w70.j.e.USBankAccount.Input bVarJ;
        Map<IdentifierSpec, String> mapB;
        Map<IdentifierSpec, String> mapB2;
        Boolean boolE1;
        w70.j.e.USBankAccount.Input bVarJ2;
        String strB3;
        s.k(args, "args");
        s.k(application, "application");
        s.k(lazyPaymentConfig, "lazyPaymentConfig");
        s.k(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.application = application;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.savedStateHandle = savedStateHandle;
        y.BillingDetails cVarB = args.getFormArgs().getBillingDetails();
        this.defaultBillingDetails = cVarB;
        y.BillingDetailsCollectionConfiguration dVarC = args.getFormArgs().getBillingDetailsCollectionConfiguration();
        this.collectionConfiguration = dVarC;
        boolean zD = false;
        boolean z11 = args.getFormArgs().getBillingDetailsCollectionConfiguration().getAddress() == y.BillingDetailsCollectionConfiguration.a.Full;
        this.collectingAddress = z11;
        boolean z12 = args.getFormArgs().getBillingDetailsCollectionConfiguration().getPhone() == y.BillingDetailsCollectionConfiguration.b.Always;
        this.collectingPhone = z12;
        y.BillingDetailsCollectionConfiguration.b bVarH = args.getFormArgs().getBillingDetailsCollectionConfiguration().getName();
        y.BillingDetailsCollectionConfiguration.b bVar = y.BillingDetailsCollectionConfiguration.b.Never;
        boolean z13 = bVarH != bVar;
        this.collectingName = z13;
        boolean z14 = args.getFormArgs().getBillingDetailsCollectionConfiguration().getEmail() != bVar;
        this.collectingEmail = z14;
        if (args.getSavedPaymentMethod() != null) {
            name = args.getSavedPaymentMethod().getInput().getName();
        } else {
            name = ((z13 || dVarC.getAttachDefaultsToPaymentMethod()) && cVarB != null) ? cVarB.getName() : null;
        }
        this.defaultName = name;
        r1 r1VarA = j0.INSTANCE.a(name);
        this.nameController = r1VarA;
        this.name = r90.g.m(r1VarA.m(), i.f127310c);
        if (args.getSavedPaymentMethod() != null) {
            strB = args.getSavedPaymentMethod().getInput().getEmail();
        } else {
            strB = ((z14 || dVarC.getAttachDefaultsToPaymentMethod()) && cVarB != null) ? cVarB.getEmail() : null;
        }
        this.defaultEmail = strB;
        a0.Companion companion = a0.INSTANCE;
        w70.j.e.USBankAccount savedPaymentMethod = args.getSavedPaymentMethod();
        if (savedPaymentMethod != null && (bVarJ2 = savedPaymentMethod.getInput()) != null && (strB3 = bVarJ2.getEmail()) != null) {
            strB = strB3;
        }
        r1 r1VarB = a0.Companion.b(companion, strB, false, 2, null);
        this.emailController = r1VarB;
        this.email = r90.g.m(r1VarB.m(), g.f127308c);
        if (args.getSavedPaymentMethod() != null) {
            Address bVarA2 = args.getSavedPaymentMethod().getInput().getAddress();
            if (bVarA2 != null) {
                strB2 = bVarA2.getCountry();
            } else {
                strB2 = null;
            }
        } else if ((!z12 && !dVarC.getAttachDefaultsToPaymentMethod()) || cVarB == null || (aVarA = cVarB.getAddress()) == null) {
            strB2 = null;
        } else {
            strB2 = aVarA.getCountry();
        }
        this.defaultPhoneCountry = strB2;
        if (args.getSavedPaymentMethod() != null) {
            strC = args.getSavedPaymentMethod().getInput().getPhone();
        } else {
            strC = ((z12 || dVarC.getAttachDefaultsToPaymentMethod()) && cVarB != null) ? cVarB.getPhone() : null;
        }
        this.defaultPhone = strC;
        String str = strC;
        q0 q0VarB = q0.Companion.b(q0.INSTANCE, str == null ? "" : str, strB2, null, false, false, 28, null);
        this.phoneController = q0VarB;
        this.phone = r90.g.m(q0VarB.m(), j.f127311c);
        if (args.getSavedPaymentMethod() != null) {
            bVarA = args.getSavedPaymentMethod().getInput().getAddress();
        } else {
            bVarA = ((!z11 && !dVarC.getAttachDefaultsToPaymentMethod()) || cVarB == null || (aVarA2 = cVarB.getAddress()) == null) ? null : p027z70.i.a(aVarA2);
        }
        this.defaultAddress = bVarA;
        AddressDetails aVarH = args.getFormArgs().getShippingDetails();
        if (aVarH == null || (mapB2 = p017o70.b.b(aVarH, cVarB)) == null) {
            d1Var = null;
        } else {
            IdentifierSpec.Companion bVar2 = IdentifierSpec.INSTANCE;
            String str2 = mapB2.get(bVar2.w());
            if (str2 == null || (boolE1 = p013kotlin.text.t.E1(str2)) == null) {
                d1Var = null;
            } else {
                d1Var = new SameAsShippingElement(bVar2.w(), new p010i90.c1(boolE1.booleanValue()));
            }
        }
        this.sameAsShippingElement = d1Var;
        IdentifierSpec.Companion bVar3 = IdentifierSpec.INSTANCE;
        IdentifierSpec g0VarA = bVar3.a("billing_details[address]");
        Map<IdentifierSpec, String> mapI = (bVarA == null || (mapB = p027z70.i.b(bVarA)) == null) ? p013kotlin.collections.v0.i() : mapB;
        AddressDetails aVarH2 = args.getFormArgs().getShippingDetails();
        p010i90.b bVar4 = new p010i90.b(g0VarA, mapI, null, null, null, d1Var, aVarH2 != null ? p017o70.b.b(aVarH2, args.getFormArgs().getBillingDetails()) : null, null, false, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, null);
        this.addressElement = bVar4;
        this.address = bVarA == null ? StateFlowKt.MutableStateFlow(null) : r90.g.m(bVar4.c(), f.f127307c);
        if (z11) {
            stateFlowN = r90.g.m(bVar4.e(), C2765h.f127309c);
        } else if (z12) {
            stateFlowN = r90.g.n(bVar3.t());
        } else if (z14) {
            stateFlowN = r90.g.n(bVar3.n());
        } else {
            stateFlowN = z13 ? r90.g.n(bVar3.r()) : r90.g.n(null);
        }
        this.lastTextFieldIdentifier = stateFlowN;
        MutableSharedFlow<w70.j.e.USBankAccount> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._result = mutableSharedFlowMutableSharedFlow$default;
        this.result = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<com.stripe.android.payments.bankaccount.navigation.e> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._collectBankAccountResult = mutableSharedFlowMutableSharedFlow$default2;
        this.collectBankAccountResult = mutableSharedFlowMutableSharedFlow$default2;
        w70.j.e.USBankAccount savedPaymentMethod2 = args.getSavedPaymentMethod();
        if (savedPaymentMethod2 != null && (bVarJ = savedPaymentMethod2.getInput()) != null) {
            zD = bVarJ.getSaveForFutureUse();
        }
        this.defaultSaveForFutureUse = zD;
        SaveForFutureUseElement b2Var = new SaveForFutureUseElement(zD, args.getFormArgs().getMerchantName());
        this.saveForFutureUseElement = b2Var;
        this.saveForFutureUse = b2Var.getController().v();
        MutableStateFlow<p027z70.f> MutableStateFlow = StateFlowKt.MutableStateFlow(q());
        this._currentScreenState = MutableStateFlow;
        this.currentScreenState = MutableStateFlow;
        this.requiredFields = r90.g.f(r90.g.m(r1VarA.m(), m.f127312c), r90.g.m(r1VarB.m(), n.f127313c), r90.g.m(q0VarB.m(), o.f127314c), r90.g.m(bVar4.c(), p.f127315c), new q());
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new a(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new b(null), 3, null);
        y.BillingDetails cVarB2 = args.getFormArgs().getBillingDetails();
        if ((cVarB2 != null ? cVarB2.getName() : null) != null) {
            args.getFormArgs().getBillingDetailsCollectionConfiguration().getAttachDefaultsToPaymentMethod();
        }
        y.BillingDetails cVarB3 = args.getFormArgs().getBillingDetails();
        if ((cVarB3 != null ? cVarB3.getEmail() : null) != null) {
            args.getFormArgs().getBillingDetailsCollectionConfiguration().getAttachDefaultsToPaymentMethod();
        }
    }

    private final boolean F() {
        return s.f(this.savedStateHandle.f("should_reset"), Boolean.TRUE);
    }

    private final void H(com.stripe.android.payments.bankaccount.navigation.e.Completed result) {
        StripeIntent stripeIntentB = result.getResponse().getIntent();
        String id2 = stripeIntentB != null ? stripeIntentB.getId() : null;
        CollectBankAccountResponseInternal.USBankAccountData c0936cC = result.getResponse().getUsBankAccountData();
        if (c0936cC != null) {
            L(c0936cC, id2);
        } else {
            O(x30.d.a(n70.x.f93524l));
        }
    }

    private final void I(com.stripe.android.payments.bankaccount.navigation.a.Completed result) {
        MutableStateFlow<p027z70.f> mutableStateFlow = this._currentScreenState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new p027z70.f.MandateCollection(new z70.f.c.PaymentMethod(result.getPaymentMethodId()), result.getBankName(), result.getLast4(), result.getIntent().getId(), j(), i(this, false, false, 2, null)))) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(com.stripe.android.payments.bankaccount.navigation.a result) {
        Q(false);
        if (result instanceof com.stripe.android.payments.bankaccount.navigation.a.Completed) {
            I((com.stripe.android.payments.bankaccount.navigation.a.Completed) result);
        } else if (result instanceof com.stripe.android.payments.bankaccount.navigation.a.Failed) {
            O(x30.d.a(n70.x.f93524l));
        } else if (result instanceof com.stripe.android.payments.bankaccount.navigation.a.C0932a) {
            P(this, null, 1, null);
        }
    }

    private final void L(CollectBankAccountResponseInternal.USBankAccountData usBankAccountData, String intentId) {
        FinancialConnectionsAccount financialConnectionsAccount;
        f0 f0VarE = usBankAccountData.getFinancialConnectionsSession().getPaymentAccount();
        if (f0VarE instanceof BankAccount) {
            MutableStateFlow<p027z70.f> mutableStateFlow = this._currentScreenState;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new p027z70.f.VerifyWithMicrodeposits((BankAccount) f0VarE, usBankAccountData.getFinancialConnectionsSession().getId(), intentId, j(), i(this, true, false, 2, null)))) {
            }
        } else if (!(f0VarE instanceof FinancialConnectionsAccount)) {
            if (f0VarE == null) {
                O(x30.d.a(n70.x.f93524l));
            }
        } else {
            MutableStateFlow<p027z70.f> mutableStateFlow2 = this._currentScreenState;
            do {
                financialConnectionsAccount = (FinancialConnectionsAccount) f0VarE;
            } while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new p027z70.f.MandateCollection(new z70.f.c.Session(usBankAccountData.getFinancialConnectionsSession().getId()), financialConnectionsAccount.getInstitutionName(), financialConnectionsAccount.getLast4(), intentId, j(), i(this, false, false, 2, null))));
        }
    }

    public static /* synthetic */ void P(h hVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = null;
        }
        hVar.O(cVar);
    }

    private final void Q(boolean z11) {
        this.savedStateHandle.n("has_launched", Boolean.valueOf(z11));
    }

    private final void R(boolean z11) {
        this.savedStateHandle.n("should_reset", Boolean.valueOf(z11));
    }

    private final void S(z70.f.c resultIdentifier, String bankName, String last4) {
        if (bankName == null || last4 == null) {
            return;
        }
        this._result.tryEmit(o(resultIdentifier, last4, bankName));
        R(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(boolean saveForFutureUse) {
        p027z70.f value;
        p027z70.f fVar;
        MutableStateFlow<p027z70.f> mutableStateFlow = this._currentScreenState;
        do {
            value = mutableStateFlow.getValue();
            fVar = value;
        } while (!mutableStateFlow.compareAndSet(value, p027z70.g.a(fVar, h(fVar instanceof p027z70.f.VerifyWithMicrodeposits, saveForFutureUse))));
    }

    private final c h(boolean isVerifyWithMicrodeposits, boolean isSaveForFutureUseSelected) {
        return p027z70.j.f127317a.a(r(), isVerifyWithMicrodeposits, isSaveForFutureUseSelected, this.args.getInstantDebits(), !this.args.getIsPaymentFlow());
    }

    static /* synthetic */ c i(h hVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = hVar.saveForFutureUse.getValue().booleanValue();
        }
        return hVar.h(z11, z12);
    }

    private final c j() {
        if (!this.args.getIsCompleteFlow()) {
            return x30.d.a(w80.n.f121526o);
        }
        if (!this.args.getIsPaymentFlow()) {
            return x30.d.a(w80.n.C0);
        }
        Amount bVarA = this.args.getFormArgs().getAmount();
        s.h(bVarA);
        return bVarA.a();
    }

    private final void k(String clientSecret) {
        if (w()) {
            return;
        }
        Q(true);
        if (clientSecret != null) {
            m(clientSecret);
        } else {
            l();
        }
    }

    private final void l() {
        String stripeIntentId = this.args.getStripeIntentId();
        if (stripeIntentId == null) {
            return;
        }
        if (!this.args.getIsPaymentFlow()) {
            b70.f fVar = this.collectBankAccountLauncher;
            if (fVar != null) {
                fVar.e(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), new b70.a.USBankAccount(this.name.getValue(), this.email.getValue()), stripeIntentId, null, this.args.getOnBehalfOf());
                return;
            }
            return;
        }
        b70.f fVar2 = this.collectBankAccountLauncher;
        if (fVar2 != null) {
            String strC = this.lazyPaymentConfig.get().getPublishableKey();
            String strD = this.lazyPaymentConfig.get().getStripeAccountId();
            b70.a.USBankAccount bVar = new b70.a.USBankAccount(this.name.getValue(), this.email.getValue());
            String onBehalfOf = this.args.getOnBehalfOf();
            Amount bVarA = this.args.getFormArgs().getAmount();
            Integer numValueOf = bVarA != null ? Integer.valueOf((int) bVarA.getValue()) : null;
            Amount bVarA2 = this.args.getFormArgs().getAmount();
            fVar2.c(strC, strD, bVar, stripeIntentId, null, onBehalfOf, numValueOf, bVarA2 != null ? bVarA2.getCurrencyCode() : null);
        }
    }

    private final void m(String clientSecret) {
        b70.a aVarN = this.args.getInstantDebits() ? n() : p();
        if (this.args.getIsPaymentFlow()) {
            b70.f fVar = this.collectBankAccountLauncher;
            if (fVar != null) {
                fVar.d(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), clientSecret, aVarN);
                return;
            }
            return;
        }
        b70.f fVar2 = this.collectBankAccountLauncher;
        if (fVar2 != null) {
            fVar2.b(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), clientSecret, aVarN);
        }
    }

    private final b70.a.InstantDebits n() {
        com.stripe.android.financialconnections.a.ElementsSessionContext.b c0818c;
        if (this.args.getClientSecret() == null) {
            c0818c = com.stripe.android.financialconnections.a.ElementsSessionContext.b.C0814a.f50145a;
        } else if (this.args.getIsPaymentFlow()) {
            String stripeIntentId = this.args.getStripeIntentId();
            s.h(stripeIntentId);
            c0818c = new com.stripe.android.financialconnections.a.ElementsSessionContext.b.PaymentIntent(stripeIntentId);
        } else {
            String stripeIntentId2 = this.args.getStripeIntentId();
            s.h(stripeIntentId2);
            c0818c = new com.stripe.android.financialconnections.a.ElementsSessionContext.b.SetupIntent(stripeIntentId2);
        }
        String value = this.email.getValue();
        Amount bVarA = this.args.getFormArgs().getAmount();
        Long lValueOf = bVarA != null ? Long.valueOf(bVarA.getValue()) : null;
        Amount bVarA2 = this.args.getFormArgs().getAmount();
        return new b70.a.InstantDebits(value, new com.stripe.android.financialconnections.a.ElementsSessionContext(c0818c, lValueOf, bVarA2 != null ? bVarA2.getCurrencyCode() : null, this.args.getLinkMode()));
    }

    private final w70.j.e.USBankAccount o(z70.f.c resultIdentifier, String last4, String bankName) {
        PaymentMethodCreateParams paymentMethodCreateParamsP;
        w70.j.a aVarC = p027z70.i.c(this.args.getShowCheckbox(), this.saveForFutureUse.getValue().booleanValue());
        boolean z11 = resultIdentifier instanceof z70.f.c.PaymentMethod;
        if (z11) {
            paymentMethodCreateParamsP = PaymentMethodCreateParams.INSTANCE.I(((z70.f.c.PaymentMethod) resultIdentifier).getId(), true, p013kotlin.collections.d1.c("PaymentSheet"), this.args.getFormArgs().getPaymentMethodSaveConsentBehavior().r1(this.args.getFormArgs().getHasIntentToSetup(), aVarC));
        } else {
            if (!(resultIdentifier instanceof z70.f.c.Session)) {
                throw new NoWhenBranchMatchedException();
            }
            paymentMethodCreateParamsP = PaymentMethodCreateParams.Companion.p(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.USBankAccount(((z70.f.c.Session) resultIdentifier).getId()), new PaymentMethod.BillingDetails(this.address.getValue(), this.email.getValue(), this.name.getValue(), this.phone.getValue()), null, this.args.getFormArgs().getPaymentMethodSaveConsentBehavior().r1(this.args.getFormArgs().getHasIntentToSetup(), aVarC), 4, null);
        }
        PaymentMethodCreateParams paymentMethodCreateParams = paymentMethodCreateParamsP;
        z70.f.c.PaymentMethod paymentMethod = z11 ? (z70.f.c.PaymentMethod) resultIdentifier : null;
        w70.j.e.USBankAccount.InstantDebitsInfo cVar = paymentMethod != null ? new w70.j.e.USBankAccount.InstantDebitsInfo(paymentMethod.getId(), this.args.getLinkMode()) : null;
        y0.USBankAccount dVar = resultIdentifier instanceof z70.f.c.Session ? new y0.USBankAccount(aVarC.getSetupFutureUsage()) : null;
        String string = this.application.getString(n70.x.W, last4);
        int iA = p027z70.b.INSTANCE.a(bankName);
        p027z70.f value = this.currentScreenState.getValue();
        w70.j.e.USBankAccount.Input bVar = new w70.j.e.USBankAccount.Input(this.name.getValue(), this.email.getValue(), this.phone.getValue(), this.address.getValue(), this.saveForFutureUse.getValue().booleanValue());
        s.h(string);
        return new w70.j.e.USBankAccount(string, iA, bVar, value, cVar, paymentMethodCreateParams, aVarC, dVar, null, 256, null);
    }

    private final b70.a.USBankAccount p() {
        return new b70.a.USBankAccount(this.name.getValue(), this.email.getValue());
    }

    private final p027z70.f q() {
        if (this.args.getSavedPaymentMethod() != null) {
            return this.args.getSavedPaymentMethod().getScreenState();
        }
        return new p027z70.f.BillingDetailsCollection(null, x30.d.a(w80.n.f121526o), false, 1, null);
    }

    private final boolean w() {
        return s.f(this.savedStateHandle.f("has_launched"), Boolean.TRUE);
    }

    public final StateFlow<Boolean> A() {
        return this.requiredFields;
    }

    public final Flow<w70.j.e.USBankAccount> B() {
        return this.result;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final SameAsShippingElement getSameAsShippingElement() {
        return this.sameAsShippingElement;
    }

    public final StateFlow<Boolean> D() {
        return this.saveForFutureUse;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final SaveForFutureUseElement getSaveForFutureUseElement() {
        return this.saveForFutureUseElement;
    }

    public final void G(com.stripe.android.payments.bankaccount.navigation.e result) {
        s.k(result, "result");
        Q(false);
        this._collectBankAccountResult.tryEmit(result);
        if (result instanceof com.stripe.android.payments.bankaccount.navigation.e.Completed) {
            H((com.stripe.android.payments.bankaccount.navigation.e.Completed) result);
        } else if (result instanceof com.stripe.android.payments.bankaccount.navigation.e.Failed) {
            O(x30.d.a(n70.x.f93524l));
        } else if (result instanceof com.stripe.android.payments.bankaccount.navigation.e.a) {
            P(this, null, 1, null);
        }
    }

    public final void K(p027z70.f screenState) {
        p027z70.f.SavedAccount savedAccount;
        String financialConnectionsSessionId;
        s.k(screenState, "screenState");
        if (screenState instanceof p027z70.f.BillingDetailsCollection) {
            MutableStateFlow<p027z70.f> mutableStateFlow = this._currentScreenState;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), p027z70.f.BillingDetailsCollection.f((p027z70.f.BillingDetailsCollection) screenState, null, null, true, 3, null))) {
            }
            k(this.args.getClientSecret());
        } else if (screenState instanceof p027z70.f.MandateCollection) {
            p027z70.f.MandateCollection mandateCollection = (p027z70.f.MandateCollection) screenState;
            S(mandateCollection.getResultIdentifier(), mandateCollection.getBankName(), mandateCollection.getLast4());
        } else if (screenState instanceof p027z70.f.VerifyWithMicrodeposits) {
            p027z70.f.VerifyWithMicrodeposits verifyWithMicrodeposits = (p027z70.f.VerifyWithMicrodeposits) screenState;
            S(new z70.f.c.Session(verifyWithMicrodeposits.getFinancialConnectionsSessionId()), verifyWithMicrodeposits.getPaymentAccount().getBankName(), verifyWithMicrodeposits.getPaymentAccount().getLast4());
        } else {
            if (!(screenState instanceof p027z70.f.SavedAccount) || (financialConnectionsSessionId = (savedAccount = (p027z70.f.SavedAccount) screenState).getFinancialConnectionsSessionId()) == null) {
                return;
            }
            S(new z70.f.c.Session(financialConnectionsSessionId), savedAccount.getBankName(), savedAccount.getLast4());
        }
    }

    public final void M() {
        if (F()) {
            P(this, null, 1, null);
        }
        this._result.tryEmit(null);
        this._collectBankAccountResult.tryEmit(null);
        b70.f fVar = this.collectBankAccountLauncher;
        if (fVar != null) {
            fVar.a();
        }
        this.collectBankAccountLauncher = null;
    }

    public final void N(h.d activityResultRegistryOwner) {
        s.k(activityResultRegistryOwner, "activityResultRegistryOwner");
        this.collectBankAccountLauncher = this.args.getInstantDebits() ? b70.d.INSTANCE.b(this.args.getHostedSurface(), activityResultRegistryOwner, new k(this)) : b70.f.INSTANCE.d(this.args.getHostedSurface(), activityResultRegistryOwner, new l(this));
    }

    public final void O(c error) {
        Q(false);
        R(false);
        this.saveForFutureUseElement.getController().w(true);
        this._collectBankAccountResult.tryEmit(null);
        MutableStateFlow<p027z70.f> mutableStateFlow = this._currentScreenState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new p027z70.f.BillingDetailsCollection(error, x30.d.a(w80.n.f121526o), false))) {
        }
    }

    public final String r() {
        CharSequence charSequenceSubSequence;
        String strE = this.args.getFormArgs().getMerchantName();
        int length = strE.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i11 = length - 1;
            if (strE.charAt(length) != '.') {
                charSequenceSubSequence = strE.subSequence(0, length + 1);
                break;
            }
            if (i11 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i11;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final p010i90.b getAddressElement() {
        return this.addressElement;
    }

    public final Flow<com.stripe.android.payments.bankaccount.navigation.e> t() {
        return this.collectBankAccountResult;
    }

    public final StateFlow<p027z70.f> u() {
        return this.currentScreenState;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final v1 getEmailController() {
        return this.emailController;
    }

    public final StateFlow<IdentifierSpec> x() {
        return this.lastTextFieldIdentifier;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final v1 getNameController() {
        return this.nameController;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final q0 getPhoneController() {
        return this.phoneController;
    }
}
