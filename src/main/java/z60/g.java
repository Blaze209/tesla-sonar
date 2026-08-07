package z60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.MobileCardElementConfig;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.a1;
import com.stripe.android.model.j0;
import com.stripe.android.model.q1;
import com.stripe.android.model.y;
import ezvcard.property.Gender;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.s;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import w30.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J<\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u000bJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0013J4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0017J,\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J4\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J,\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\b2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/JB\u00104\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0006\u00100\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u0010&\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J:\u00106\u001a\b\u0012\u0004\u0012\u00020#0\b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u0010&\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107JB\u00109\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0006\u00108\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u0010&\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00105J@\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00060\b2\u0006\u0010;\u001a\u00020:2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=J:\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\b2\u0006\u00100\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J$\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\b2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ,\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\b2\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ,\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\b2\u0006\u0010J\u001a\u00020I2\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ,\u0010N\u001a\b\u0012\u0004\u0012\u00020K0\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010\u0013JH\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u00022\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u0003\u0018\u00010Q2\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ6\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\b2\u0006\u0010O\u001a\u00020\u00022\b\u0010U\u001a\u0004\u0018\u00010\u00022\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010\u0017J,\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\b2\u0006\u0010Y\u001a\u00020X2\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010\\J4\u0010^\u001a\b\u0012\u0004\u0012\u00020Z0\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020]2\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_J4\u0010`\u001a\b\u0012\u0004\u0012\u00020Z0\b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020]2\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u0010_JJ\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010cJJ\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010cJ<\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020e2\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010iJ4\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010j\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010\u0017J<\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020e2\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bl\u0010iJ4\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010j\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010\u0017J,\u0010p\u001a\b\u0012\u0004\u0012\u00020o0\b2\u0006\u0010Y\u001a\u00020n2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010qJ<\u0010s\u001a\b\u0012\u0004\u0012\u00020r0\b2\u0006\u00103\u001a\u00020\u00042\u0016\b\u0002\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010QH§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bs\u0010tJ\u001f\u0010v\u001a\u00020\u00022\u000e\b\u0002\u0010u\u001a\b\u0012\u0004\u0012\u00020\u000201H'¢\u0006\u0004\bv\u0010w\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006x"}, d2 = {"Lz60/g;", "", "", "clientSecret", "Lw30/l$c;", "options", "", "expandFields", "Ljn0/s;", "Lcom/stripe/android/model/StripeIntent;", "D", "(Ljava/lang/String;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/l;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/u0;", "k", "(Lcom/stripe/android/model/l;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "z", "(Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentIntentId", "sourceId", "E", "(Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/m;", "confirmSetupIntentParams", "Lcom/stripe/android/model/d1;", "p", "(Lcom/stripe/android/model/m;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "A", "setupIntentId", "s", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/v0;", "j", "(Lcom/stripe/android/model/w0;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethodId", "Lcom/stripe/android/model/a1;", "paymentMethodUpdateParams", "e", "(Ljava/lang/String;Lcom/stripe/android/model/a1;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/q1;", "tokenParams", "Lcom/stripe/android/model/p1;", "c", "(Lcom/stripe/android/model/q1;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customerId", "", "productUsageTokens", "requestOptions", "y", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ljava/util/Set;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customerSessionClientSecret", "t", "Lcom/stripe/android/model/p0;", "listPaymentMethodsParams", "C", "(Lcom/stripe/android/model/p0;Ljava/util/Set;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/a0;", "q", "(Ljava/lang/String;Ljava/util/Set;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/e;", "h", "(Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh30/a;", "bin", "Lcom/stripe/android/model/j;", "v", "(Lh30/a;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/k1;", "authParams", "Lcom/stripe/android/model/l1;", Gender.FEMALE, "(Lcom/stripe/android/model/k1;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "G", "consumerSessionClientSecret", "id", "", "extraParams", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerAccountPublishableKey", "Lcom/stripe/android/model/t;", "a", "Lcom/stripe/android/model/x;", "params", "Lcom/stripe/android/model/l0;", "f", "(Lcom/stripe/android/model/x;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/y;", "l", "(Ljava/lang/String;Lcom/stripe/android/model/y;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "financialConnectionsSessionId", "B", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "", "firstAmount", "secondAmount", "n", "(Ljava/lang/String;IILw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "r", "u", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/j0;", "Lcom/stripe/android/model/h0;", "H", "(Lcom/stripe/android/model/j0;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/s0;", "I", "(Lw30/l$c;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attribution", "x", "(Ljava/util/Set;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface g {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ String a(g gVar, Set set, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildPaymentUserAgent");
            }
            if ((i11 & 1) != 0) {
                set = d1.d();
            }
            return gVar.x(set);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object b(g gVar, String str, l.Options cVar, List list, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent-BWLJW6A");
            }
            if ((i11 & 4) != 0) {
                list = v.m();
            }
            return gVar.m(str, cVar, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object c(g gVar, String str, l.Options cVar, List list, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent-BWLJW6A");
            }
            if ((i11 & 4) != 0) {
                list = v.m();
            }
            return gVar.g(str, cVar, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object d(g gVar, String str, l.Options cVar, List list, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveStripeIntent-BWLJW6A");
            }
            if ((i11 & 4) != 0) {
                list = v.m();
            }
            return gVar.D(str, cVar, list, continuation);
        }
    }

    Object A(String str, l.Options cVar, Continuation<? super s<SetupIntent>> continuation);

    Object B(String str, String str2, String str3, l.Options cVar, List<String> list, Continuation<? super s<PaymentIntent>> continuation);

    Object C(ListPaymentMethodsParams p0Var, Set<String> set, l.Options cVar, Continuation<? super s<? extends List<PaymentMethod>>> continuation);

    Object D(String str, l.Options cVar, List<String> list, Continuation<? super s<? extends StripeIntent>> continuation);

    Object E(String str, String str2, l.Options cVar, Continuation<? super s<PaymentIntent>> continuation);

    Object F(Stripe3ds2AuthParams k1Var, l.Options cVar, Continuation<? super s<Stripe3ds2AuthResult>> continuation);

    Object G(String str, l.Options cVar, Continuation<? super s<Stripe3ds2AuthResult>> continuation);

    Object H(j0 j0Var, l.Options cVar, Continuation<? super s<ElementsSession>> continuation);

    Object I(l.Options cVar, Map<String, String> map, Continuation<? super s<MobileCardElementConfig>> continuation);

    Object a(String str, String str2, l.Options cVar, Continuation<? super s<ConsumerSession>> continuation);

    Object b(Set<String> set, String str, l.Options cVar, Continuation<? super s<PaymentMethod>> continuation);

    Object c(q1 q1Var, l.Options cVar, Continuation<? super s<Token>> continuation);

    Object d(String str, String str2, Map<String, ?> map, l.Options cVar, Continuation<? super s<String>> continuation);

    Object e(String str, a1 a1Var, l.Options cVar, Continuation<? super s<PaymentMethod>> continuation);

    Object f(CreateFinancialConnectionsSessionForDeferredPaymentParams xVar, l.Options cVar, Continuation<? super s<FinancialConnectionsSession>> continuation);

    Object g(String str, l.Options cVar, List<String> list, Continuation<? super s<SetupIntent>> continuation);

    Object h(l.Options cVar, Continuation<? super s<BankStatuses>> continuation);

    Object i(String str, String str2, l.Options cVar, Continuation<? super s<SetupIntent>> continuation);

    Object j(PaymentMethodCreateParams paymentMethodCreateParams, l.Options cVar, Continuation<? super s<PaymentMethod>> continuation);

    Object k(ConfirmPaymentIntentParams lVar, l.Options cVar, List<String> list, Continuation<? super s<PaymentIntent>> continuation);

    Object l(String str, y yVar, l.Options cVar, Continuation<? super s<FinancialConnectionsSession>> continuation);

    Object m(String str, l.Options cVar, List<String> list, Continuation<? super s<PaymentIntent>> continuation);

    Object n(String str, int i11, int i12, l.Options cVar, Continuation<? super s<PaymentIntent>> continuation);

    Object o(String str, y yVar, l.Options cVar, Continuation<? super s<FinancialConnectionsSession>> continuation);

    Object p(ConfirmSetupIntentParams mVar, l.Options cVar, List<String> list, Continuation<? super s<SetupIntent>> continuation);

    Object q(String str, Set<String> set, l.Options cVar, Continuation<? super s<Customer>> continuation);

    Object r(String str, String str2, l.Options cVar, Continuation<? super s<PaymentIntent>> continuation);

    Object s(String str, String str2, l.Options cVar, Continuation<? super s<SetupIntent>> continuation);

    Object t(String str, Set<String> set, String str2, l.Options cVar, Continuation<? super s<PaymentMethod>> continuation);

    Object u(String str, int i11, int i12, l.Options cVar, Continuation<? super s<SetupIntent>> continuation);

    Object v(h30.a aVar, l.Options cVar, Continuation<? super s<CardMetadata>> continuation);

    Object w(String str, String str2, String str3, l.Options cVar, List<String> list, Continuation<? super s<SetupIntent>> continuation);

    String x(Set<String> attribution);

    Object y(String str, Set<String> set, String str2, l.Options cVar, Continuation<? super s<PaymentMethod>> continuation);

    Object z(String str, l.Options cVar, Continuation<? super s<PaymentIntent>> continuation);
}
