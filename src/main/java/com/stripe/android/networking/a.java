package com.stripe.android.networking;

import android.content.Context;
import android.net.http.HttpResponseCache;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConsumerPaymentDetailsShare;
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
import com.stripe.android.model.PaymentMethodsList;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import h30.b;
import java.io.File;
import java.io.IOException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o30.ApiVersion;
import o30.AppInfo;
import o30.StripeError;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import r30.FraudDetectionData;
import w30.AnalyticsRequest;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ·\u00012\u00020\u0001:\u0003\u0084\u0001~B¯\u0001\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 BS\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\"J:\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J6\u00102\u001a\b\u0012\u0004\u0012\u0002010)2\u0006\u0010.\u001a\u00020-2\u0006\u0010&\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u00010/H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u0002062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000504H\u0002¢\u0006\u0004\b7\u00108J^\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\b\b\u0000\u0010:*\u0002092\u0006\u0010<\u001a\u00020;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=2 \b\u0002\u0010@\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0005040)\u0012\u0004\u0012\u0002060?H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u0002062\u0006\u0010F\u001a\u00020CH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u000206H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u0002062\u0006\u0010K\u001a\u00020/H\u0002¢\u0006\u0004\bL\u0010MJ1\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020P0O2\u0006\u0010N\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002¢\u0006\u0004\bQ\u0010RJ+\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050T2\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002¢\u0006\u0004\bU\u0010VJE\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020P0O2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020P0O2\b\u0010X\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010YH\u0002¢\u0006\u0004\b[\u0010\\J(\u0010]\u001a\b\u0012\u0004\u0012\u00020#0)*\u00020#2\u0006\u0010&\u001a\u00020%H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^J:\u0010`\u001a\b\u0012\u0004\u0012\u00020_0)2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u0010aJ:\u0010b\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010,J:\u0010c\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010aJ,\u0010d\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010eJ,\u0010g\u001a\b\u0012\u0004\u0012\u00020f0)2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bg\u0010eJ4\u0010j\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010h\u001a\u00020\u00052\u0006\u0010i\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bj\u0010kJ:\u0010n\u001a\b\u0012\u0004\u0012\u00020f0)2\u0006\u0010m\u001a\u00020l2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bn\u0010oJ:\u0010p\u001a\b\u0012\u0004\u0012\u00020f0)2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010aJ4\u0010r\u001a\b\u0012\u0004\u0012\u00020f0)2\u0006\u0010q\u001a\u00020\u00052\u0006\u0010i\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010kJ,\u0010t\u001a\b\u0012\u0004\u0012\u00020s0)2\u0006\u0010X\u001a\u00020W2\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010uJ4\u0010y\u001a\b\u0012\u0004\u0012\u00020s0)2\u0006\u0010v\u001a\u00020\u00052\u0006\u0010x\u001a\u00020w2\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010zJ,\u0010~\u001a\b\u0012\u0004\u0012\u00020}0)2\u0006\u0010|\u001a\u00020{2\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJG\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020s0)2\u0007\u0010\u0080\u0001\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010v\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J>\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020s0)2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010v\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001JG\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020s0)2\u0007\u0010\u0086\u0001\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010v\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0083\u0001JF\u0010\u008a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0'0)2\b\u0010\u0089\u0001\u001a\u00030\u0088\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J@\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010)2\u0007\u0010\u0080\u0001\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J(\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010)2\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J2\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010)2\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J3\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010)2\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0081\u0001\u001a\u00020%H\u0097@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J0\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010)2\u0006\u0010i\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009c\u0001\u0010eJO\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u00050)2\u0007\u0010\u009d\u0001\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u00020\u00052\u0013\u0010\u009f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010O2\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J<\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010)2\u0007\u0010\u009d\u0001\u001a\u00020\u00052\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u00052\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¤\u0001\u0010kJ2\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010)2\u0007\u0010.\u001a\u00030¥\u00012\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001J:\u0010ª\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010)2\u0006\u0010h\u001a\u00020\u00052\u0007\u0010.\u001a\u00030©\u00012\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001J:\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010)2\u0006\u0010q\u001a\u00020\u00052\u0007\u0010.\u001a\u00030©\u00012\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¬\u0001\u0010«\u0001J\u001a\u0010\u00ad\u0001\u001a\u00020\u00052\u0006\u0010h\u001a\u00020\u0005H\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001a\u0010¯\u0001\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u0005H\u0001¢\u0006\u0006\b¯\u0001\u0010®\u0001JO\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010h\u001a\u00020\u00052\u0007\u0010°\u0001\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b±\u0001\u0010²\u0001JO\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020f0)2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00052\u0007\u0010°\u0001\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b³\u0001\u0010²\u0001JD\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010N\u001a\u00020\u00052\b\u0010µ\u0001\u001a\u00030´\u00012\b\u0010¶\u0001\u001a\u00030´\u00012\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001J8\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010N\u001a\u00020\u00052\u0007\u0010¹\u0001\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\bº\u0001\u0010kJD\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020f0)2\u0006\u0010N\u001a\u00020\u00052\b\u0010µ\u0001\u001a\u00030´\u00012\b\u0010¶\u0001\u001a\u00030´\u00012\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b»\u0001\u0010¸\u0001J8\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00020f0)2\u0006\u0010N\u001a\u00020\u00052\u0007\u0010¹\u0001\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¼\u0001\u0010kJ\u001a\u0010½\u0001\u001a\u00020\u00052\u0006\u0010v\u001a\u00020\u0005H\u0001¢\u0006\u0006\b½\u0001\u0010®\u0001J\u001a\u0010¾\u0001\u001a\u00020\u00052\u0006\u0010v\u001a\u00020\u0005H\u0001¢\u0006\u0006\b¾\u0001\u0010®\u0001J/\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u0002010)2\u0006\u0010.\u001a\u00020-2\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J?\u0010Â\u0001\u001a\t\u0012\u0005\u0012\u00030Á\u00010)2\u0007\u0010\u0081\u0001\u001a\u00020%2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010OH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001JA\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u0005042\u0006\u0010<\u001a\u00020;2\u001e\u0010@\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0005040)\u0012\u0004\u0012\u0002060?H\u0081@¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001b\u0010Ç\u0001\u001a\u0002062\u0007\u0010.\u001a\u00030Æ\u0001H\u0001¢\u0006\u0006\bÇ\u0001\u0010È\u0001J \u0010É\u0001\u001a\u00020\u00052\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010Ë\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010Ì\u0001R\u0017\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b~\u0010Í\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010Î\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010Ï\u0001R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010Ð\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bp\u0010Ñ\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010Ò\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010Ó\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bt\u0010Ô\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010Õ\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010Ö\u0001R\u0017\u0010Ù\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010Ø\u0001R\u001a\u0010Ý\u0001\u001a\u0005\u0018\u00010Ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001R)\u0010à\u0001\u001a\u0004\u0018\u00010\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0005040)8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006á\u0001"}, d2 = {"Lcom/stripe/android/networking/a;", "Lz60/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "", "publishableKeyProvider", "Lo30/c;", "appInfo", "Lo30/d;", "logger", "Lkotlin/coroutines/CoroutineContext;", "workContext", "", "productUsageTokens", "Lw30/j0;", "stripeNetworkClient", "Lw30/c;", "analyticsRequestExecutor", "Lr30/g;", "fraudDetectionDataRepository", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lr30/f;", "fraudDetectionDataParamsUtils", "Lf30/i0;", "betas", "apiVersion", "sdkVersion", "<init>", "(Landroid/content/Context;Lwn0/a;Lo30/c;Lo30/d;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lw30/j0;Lw30/c;Lr30/g;Lh30/b$a;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lr30/f;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "appContext", "(Landroid/content/Context;Lwn0/a;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lw30/c;Lo30/d;)V", "Lcom/stripe/android/model/l;", "confirmPaymentIntentParams", "Lw30/l$c;", "options", "", "expandFields", "Ljn0/s;", "Lcom/stripe/android/model/u0;", "T", "(Lcom/stripe/android/model/l;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/j0;", "params", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "analyticsEvent", "Lcom/stripe/android/model/h0;", "n0", "(Lcom/stripe/android/model/j0;Lw30/l$c;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw30/l0;", "response", "Ljn0/h0;", "h0", "(Lw30/l0;)V", "Lt30/f;", "ModelType", "Lw30/l;", "apiRequest", "Lu30/a;", "jsonParser", "Lkotlin/Function1;", "onResponse", "W", "(Lw30/l;Lu30/a;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/networking/a$c;", "V", "()Lcom/stripe/android/networking/a$c;", "dnsCacheData", "m0", "(Lcom/stripe/android/networking/a$c;)V", "a0", "()V", "event", "Y", "(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V", "clientSecret", "", "", Gender.UNKNOWN, "(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;", "attribution", "Lkotlin/Pair;", "R", "(Ljava/util/Set;)Lkotlin/Pair;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/j1;", "sourceParams", "j0", "(Ljava/util/Map;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/j1;)Ljava/util/Map;", "l0", "(Lcom/stripe/android/model/l;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent;", "D", "(Ljava/lang/String;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "m", "z", "(Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/d1;", "A", "paymentIntentId", "sourceId", "E", "(Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/m;", "confirmSetupIntentParams", "p", "(Lcom/stripe/android/model/m;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "setupIntentId", "s", "Lcom/stripe/android/model/v0;", "j", "(Lcom/stripe/android/model/w0;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethodId", "Lcom/stripe/android/model/a1;", "paymentMethodUpdateParams", "e", "(Ljava/lang/String;Lcom/stripe/android/model/a1;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/q1;", "tokenParams", "Lcom/stripe/android/model/p1;", "c", "(Lcom/stripe/android/model/q1;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customerId", "requestOptions", "y", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ljava/util/Set;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customerSessionClientSecret", "t", "Lcom/stripe/android/model/p0;", "listPaymentMethodsParams", "C", "(Lcom/stripe/android/model/p0;Ljava/util/Set;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/a0;", "q", "(Ljava/lang/String;Ljava/util/Set;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/e;", "h", "(Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh30/a;", "bin", "Lcom/stripe/android/model/j;", "v", "(Lh30/a;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/k1;", "authParams", "Lcom/stripe/android/model/l1;", Gender.FEMALE, "(Lcom/stripe/android/model/k1;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "G", "consumerSessionClientSecret", "id", "extraParams", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerAccountPublishableKey", "Lcom/stripe/android/model/t;", "a", "Lcom/stripe/android/model/x;", "Lcom/stripe/android/model/l0;", "f", "(Lcom/stripe/android/model/x;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/y;", "l", "(Ljava/lang/String;Lcom/stripe/android/model/y;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "f0", "(Ljava/lang/String;)Ljava/lang/String;", "g0", "financialConnectionsSessionId", "B", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "", "firstAmount", "secondAmount", "n", "(Ljava/lang/String;IILw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "r", "u", IntegerTokenConverter.CONVERTER_KEY, "b0", "c0", "H", "(Lcom/stripe/android/model/j0;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/s0;", "I", "(Lw30/l$c;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i0", "(Lw30/l;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw30/b;", "Z", "(Lw30/b;)V", "x", "(Ljava/util/Set;)Ljava/lang/String;", "Landroid/content/Context;", "Lwn0/a;", "Lo30/c;", "Lo30/d;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/Set;", "Lw30/j0;", "Lw30/c;", "Lr30/g;", "Lh30/b$a;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lr30/f;", "Lw30/l$b;", "Lw30/l$b;", "apiRequestFactory", "Lr30/d;", "e0", "()Lr30/d;", "fraudDetectionData", "d0", "(Ljava/lang/Object;)Ljava/lang/String;", "errorMessage", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements z60.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f51760o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> publishableKeyProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AppInfo appInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<String> productUsageTokens;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w30.j0 stripeNetworkClient;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final r30.g fraudDetectionDataRepository;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b.a cardAccountRangeRepositoryFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final r30.f fraudDetectionDataParamsUtils;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final w30.l.b apiRequestFactory;

    /* JADX INFO: renamed from: com.stripe.android.networking.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository$2", f = "StripeApiRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C0924a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51774n;

        C0924a(Continuation<? super C0924a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new C0924a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51774n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            HttpResponseCache.install(new File(a.this.context.getCacheDir(), "stripe_api_repository_cache"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((C0924a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class a0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f51776c = new a0();

        a0() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class a1 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PaymentAnalyticsEvent f51777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f51778d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(PaymentAnalyticsEvent paymentAnalyticsEvent, a aVar) {
            super(1);
            this.f51777c = paymentAnalyticsEvent;
            this.f51778d = aVar;
        }

        public final void b(Object obj) {
            PaymentAnalyticsEvent paymentAnalyticsEvent = this.f51777c;
            if (paymentAnalyticsEvent != null) {
                a aVar = this.f51778d;
                aVar.Z(PaymentAnalyticsRequestFactory.w(aVar.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.networking.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b)\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000bJ/\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u000bJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b \u0010\u000bJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0001¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0001¢\u0006\u0004\b&\u0010\u000bJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0001¢\u0006\u0004\b'\u0010\u000bJ\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b(\u0010\u000bR\u0014\u0010+\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010/\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00101\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*R\u0014\u00103\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010*R\u0014\u00105\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010*R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lcom/stripe/android/networking/a$b;", "", "<init>", "()V", "", "path", "", "args", "g", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "f", "(Ljava/lang/String;)Ljava/lang/String;", "p", "r", "", "expandFields", "", "e", "(Ljava/util/List;)Ljava/util/Map;", "paymentIntentId", "y", "v", "w", "m", "k", "setupIntentId", "z", "n", "l", "paymentMethodId", "j", "customerId", "x", "financialConnectionsSessionId", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "clientSecret", "C", "D", "t", "B", "()Ljava/lang/String;", "tokensUrl", "u", "paymentMethodsUrl", "q", "logoutConsumerUrl", "A", "sharePaymentDetailsUrl", "o", "deferredFinancialConnectionsSessionUrl", "s", "mobileCardElementConfigUrl", "DNS_CACHE_TTL_PROPERTY_NAME", "Ljava/lang/String;", "PAYMENT_USER_AGENT", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, List<String>> e(List<String> expandFields) {
            if (expandFields.isEmpty()) {
                expandFields = null;
            }
            Map<String, List<String>> mapF = expandFields != null ? p013kotlin.collections.v0.f(jn0.x.a("expand", expandFields)) : null;
            return mapF == null ? p013kotlin.collections.v0.i() : mapF;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String path) {
            return "https://api.stripe.com/v1/" + path;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(String path, Object... args) {
            p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
            Locale locale = Locale.ENGLISH;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(locale, path, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            p013kotlin.jvm.internal.s.j(str, "format(...)");
            return f(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String p(String path) {
            return "https://api.stripe.com/edge-internal/" + path;
        }

        private final String r(String path) {
            return "https://merchant-ui-api.stripe.com/elements/" + path;
        }

        public final /* synthetic */ String A() {
            return f("consumers/payment_details/share");
        }

        public final /* synthetic */ String B() {
            return f("tokens");
        }

        public final /* synthetic */ String C(String clientSecret) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            return g("payment_intents/%s/verify_microdeposits", clientSecret);
        }

        public final /* synthetic */ String D(String clientSecret) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            return g("setup_intents/%s/verify_microdeposits", clientSecret);
        }

        public final /* synthetic */ String h(String paymentIntentId, String financialConnectionsSessionId) {
            p013kotlin.jvm.internal.s.k(paymentIntentId, "paymentIntentId");
            p013kotlin.jvm.internal.s.k(financialConnectionsSessionId, "financialConnectionsSessionId");
            return g("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String i(String setupIntentId, String financialConnectionsSessionId) {
            p013kotlin.jvm.internal.s.k(setupIntentId, "setupIntentId");
            p013kotlin.jvm.internal.s.k(financialConnectionsSessionId, "financialConnectionsSessionId");
            return g("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String j(String paymentMethodId) {
            p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
            return g("payment_methods/%s/attach", paymentMethodId);
        }

        public final /* synthetic */ String k(String paymentIntentId) {
            p013kotlin.jvm.internal.s.k(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/source_cancel", paymentIntentId);
        }

        public final /* synthetic */ String l(String setupIntentId) {
            p013kotlin.jvm.internal.s.k(setupIntentId, "setupIntentId");
            return g("setup_intents/%s/source_cancel", setupIntentId);
        }

        public final /* synthetic */ String m(String paymentIntentId) {
            p013kotlin.jvm.internal.s.k(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/confirm", paymentIntentId);
        }

        public final /* synthetic */ String n(String setupIntentId) {
            p013kotlin.jvm.internal.s.k(setupIntentId, "setupIntentId");
            return g("setup_intents/%s/confirm", setupIntentId);
        }

        public final /* synthetic */ String o() {
            return f("connections/link_account_sessions_for_deferred_payment");
        }

        public final /* synthetic */ String q() {
            return f("consumers/sessions/log_out");
        }

        public final String s() {
            return r("mobile-card-element-config");
        }

        public final /* synthetic */ String t(String paymentMethodId) {
            p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
            return f("payment_methods/" + paymentMethodId);
        }

        public final /* synthetic */ String u() {
            return f("payment_methods");
        }

        public final /* synthetic */ String v(String paymentIntentId) {
            p013kotlin.jvm.internal.s.k(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String w(String paymentIntentId) {
            p013kotlin.jvm.internal.s.k(paymentIntentId, "paymentIntentId");
            return g("setup_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String x(String customerId) {
            p013kotlin.jvm.internal.s.k(customerId, "customerId");
            return g("customers/%s", customerId);
        }

        public final /* synthetic */ String y(String paymentIntentId) {
            p013kotlin.jvm.internal.s.k(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s", paymentIntentId);
        }

        public final /* synthetic */ String z(String setupIntentId) {
            p013kotlin.jvm.internal.s.k(setupIntentId, "setupIntentId");
            return g("setup_intents/%s", setupIntentId);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {622}, m = "createToken-0E7RQCE", n = {}, s = {})
    static final class b0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51779n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51781p;

        b0(Continuation<? super b0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51779n = obj;
            this.f51781p |= Integer.MIN_VALUE;
            Object objC = a.this.c(null, null, this);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : jn0.s.a(objC);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "retrievePaymentIntent-BWLJW6A", n = {}, s = {})
    static final class b1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51782n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51784p;

        b1(Continuation<? super b1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51782n = obj;
            this.f51784p |= Integer.MIN_VALUE;
            Object objM = a.this.m(null, null, null, this);
            return objM == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM : jn0.s.a(objM);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/a$c;", "", "<init>", "()V", "a", "b", "Lcom/stripe/android/networking/a$c$a;", "Lcom/stripe/android/networking/a$c$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static abstract class c {

        /* JADX INFO: renamed from: com.stripe.android.networking.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/networking/a$c$a;", "Lcom/stripe/android/networking/a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class C0925a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0925a f51785a = new C0925a();

            private C0925a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0925a);
            }

            public int hashCode() {
                return 2054089437;
            }

            public String toString() {
                return "Failure";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.networking.a$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/networking/a$c$b;", "Lcom/stripe/android/networking/a$c;", "", "originalDnsCacheTtl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String originalDnsCacheTtl;

            public Success(String str) {
                super(null);
                this.originalDnsCacheTtl = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getOriginalDnsCacheTtl() {
                return this.originalDnsCacheTtl;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && p013kotlin.jvm.internal.s.f(this.originalDnsCacheTtl, ((Success) other).originalDnsCacheTtl);
            }

            public int hashCode() {
                String str = this.originalDnsCacheTtl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Success(originalDnsCacheTtl=" + this.originalDnsCacheTtl + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class c0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.q1 f51788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(com.stripe.android.model.q1 q1Var) {
            super(1);
            this.f51788d = q1Var;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(aVar.paymentAnalyticsRequestFactory.y(this.f51788d.a(), this.f51788d.getTokenType()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class c1 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {
        c1() {
            super(1);
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(PaymentAnalyticsRequestFactory.w(aVar.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentRetrieve, null, null, null, null, null, 62, null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1219}, m = "attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51790n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51792p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51790n = obj;
            this.f51792p |= Integer.MIN_VALUE;
            Object objB = a.this.B(null, null, null, null, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.s.a(objB);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {734}, m = "detachPaymentMethod-BWLJW6A", n = {}, s = {})
    static final class d0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51793n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51795p;

        d0(Continuation<? super d0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51793n = obj;
            this.f51795p |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, null, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.s.a(objB);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {460}, m = "retrieveSetupIntent-BWLJW6A", n = {}, s = {})
    static final class d1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51796n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51798p;

        d1(Continuation<? super d1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51796n = obj;
            this.f51798p |= Integer.MIN_VALUE;
            Object objG = a.this.g(null, null, null, this);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : jn0.s.a(objG);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f51799c = new e();

        e() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class e0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<String> f51801d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(Set<String> set) {
            super(1);
            this.f51801d = set;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(aVar.paymentAnalyticsRequestFactory.r(this.f51801d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class e1 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {
        e1() {
            super(1);
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(PaymentAnalyticsRequestFactory.w(aVar.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentRetrieve, null, null, null, null, null, 62, null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1245}, m = "attachFinancialConnectionsSessionToSetupIntent-hUnOzRk", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51803n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51805p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51803n = obj;
            this.f51805p |= Integer.MIN_VALUE;
            Object objW = a.this.w(null, null, null, null, null, this);
            return objW == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : jn0.s.a(objW);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {763}, m = "detachPaymentMethod-yxL6bBk", n = {}, s = {})
    static final class f0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51806n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51808p;

        f0(Continuation<? super f0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51806n = obj;
            this.f51808p |= Integer.MIN_VALUE;
            Object objT = a.this.t(null, null, null, null, this);
            return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : jn0.s.a(objT);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {186, 189}, m = "retrieveStripeIntent-BWLJW6A", n = {}, s = {})
    static final class f1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51809n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51811p;

        f1(Continuation<? super f1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51809n = obj;
            this.f51811p |= Integer.MIN_VALUE;
            Object objD = a.this.D(null, null, null, this);
            return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : jn0.s.a(objD);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f51812c = new g();

        g() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class g0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<String> f51814d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(Set<String> set) {
            super(1);
            this.f51814d = set;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(aVar.paymentAnalyticsRequestFactory.r(this.f51814d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1104}, m = "sharePaymentDetails-yxL6bBk", n = {}, s = {})
    static final class g1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51815n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51817p;

        g1(Continuation<? super g1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51815n = obj;
            this.f51817p |= Integer.MIN_VALUE;
            Object objD = a.this.d(null, null, null, null, this);
            return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : jn0.s.a(objD);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {705}, m = "attachPaymentMethod-yxL6bBk", n = {}, s = {})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51818n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51820p;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51818n = obj;
            this.f51820p |= Integer.MIN_VALUE;
            Object objY = a.this.y(null, null, null, null, this);
            return objY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objY : jn0.s.a(objY);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0}, l = {1565}, m = "fetchStripeModelResult-BWLJW6A", n = {"jsonParser"}, s = {"L$0"})
    static final class h0<ModelType extends t30.f> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51821n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f51822o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f51824q;

        h0(Continuation<? super h0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51822o = obj;
            this.f51824q |= Integer.MIN_VALUE;
            Object objW = a.this.W(null, null, null, this);
            return objW == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : jn0.s.a(objW);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {974}, m = "start3ds2Auth-0E7RQCE", n = {}, s = {})
    static final class h1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51825n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51827p;

        h1(Continuation<? super h1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51825n = obj;
            this.f51827p |= Integer.MIN_VALUE;
            Object objF = a.this.F(null, null, this);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : jn0.s.a(objF);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<String> f51829d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Set<String> set) {
            super(1);
            this.f51829d = set;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(aVar.paymentAnalyticsRequestFactory.q(this.f51829d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lt30/f;", "ModelType", "Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class i0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f51830c = new i0();

        i0() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class i1 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {
        i1() {
            super(1);
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(PaymentAnalyticsRequestFactory.w(aVar.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Start, null, null, null, null, null, 62, null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {382}, m = "cancelPaymentIntentSource-BWLJW6A", n = {}, s = {})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51832n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51834p;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51832n = obj;
            this.f51834p |= Integer.MIN_VALUE;
            Object objE = a.this.E(null, null, null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : jn0.s.a(objE);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0}, l = {954}, m = "getCardMetadata-0E7RQCE", n = {"this"}, s = {"L$0"})
    static final class j0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51835n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f51836o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f51838q;

        j0(Continuation<? super j0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51836o = obj;
            this.f51838q |= Integer.MIN_VALUE;
            Object objV = a.this.v(null, null, this);
            return objV == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objV : jn0.s.a(objV);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {588}, m = "updatePaymentMethod-BWLJW6A", n = {}, s = {})
    static final class j1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51839n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51841p;

        j1(Continuation<? super j1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51839n = obj;
            this.f51841p |= Integer.MIN_VALUE;
            Object objE = a.this.e(null, null, null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : jn0.s.a(objE);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {
        k() {
            super(1);
        }

        public final void b(Object obj) {
            a.this.Y(PaymentAnalyticsEvent.PaymentIntentCancelSource);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {937}, m = "getFpxBankStatus-gIAlu-s", n = {}, s = {})
    static final class k0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51843n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51845p;

        k0(Continuation<? super k0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51843n = obj;
            this.f51845p |= Integer.MIN_VALUE;
            Object objH = a.this.h(null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : jn0.s.a(objH);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class k1 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.a1 f51847d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k1(com.stripe.android.model.a1 a1Var) {
            super(1);
            this.f51847d = a1Var;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(aVar.paymentAnalyticsRequestFactory.u(this.f51847d.getType().code, this.f51847d.d()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {482}, m = "cancelSetupIntentSource-BWLJW6A", n = {}, s = {})
    static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51848n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51850p;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51848n = obj;
            this.f51850p |= Integer.MIN_VALUE;
            Object objS = a.this.s(null, null, null, this);
            return objS == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objS : jn0.s.a(objS);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class l0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {
        l0() {
            super(1);
        }

        public final void b(Object obj) {
            a.this.Y(PaymentAnalyticsEvent.FpxBankStatusesRetrieve);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1276}, m = "verifyPaymentIntentWithMicrodeposits-yxL6bBk", n = {}, s = {})
    static final class l1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51852n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51854p;

        l1(Continuation<? super l1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51852n = obj;
            this.f51854p |= Integer.MIN_VALUE;
            Object objN = a.this.n(null, 0, 0, null, this);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : jn0.s.a(objN);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {
        m() {
            super(1);
        }

        public final void b(Object obj) {
            a.this.Y(PaymentAnalyticsEvent.SetupIntentCancelSource);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {787}, m = "getPaymentMethods-BWLJW6A", n = {}, s = {})
    static final class m0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51856n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51858p;

        m0(Continuation<? super m0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51856n = obj;
            this.f51858p |= Integer.MIN_VALUE;
            Object objC = a.this.C(null, null, null, this);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : jn0.s.a(objC);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class m1 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m1 f51859c = new m1();

        m1() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {992}, m = "complete3ds2Auth-0E7RQCE", n = {}, s = {})
    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51860n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51862p;

        n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51860n = obj;
            this.f51862p |= Integer.MIN_VALUE;
            Object objG = a.this.G(null, null, this);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : jn0.s.a(objG);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class n0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<String> f51864d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(Set<String> set) {
            super(1);
            this.f51864d = set;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(PaymentAnalyticsRequestFactory.w(aVar.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CustomerRetrievePaymentMethods, this.f51864d, null, null, null, null, 60, null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1305}, m = "verifyPaymentIntentWithMicrodeposits-BWLJW6A", n = {}, s = {})
    static final class n1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51865n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51867p;

        n1(Continuation<? super n1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51865n = obj;
            this.f51867p |= Integer.MIN_VALUE;
            Object objR = a.this.r(null, null, null, this);
            return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : jn0.s.a(objR);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0, 0, 0}, l = {211, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "confirmPaymentIntent-BWLJW6A", n = {"this", "options", "expandFields"}, s = {"L$0", "L$1", "L$2"})
    static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51868n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f51869o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f51870p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f51871q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f51873s;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51871q = obj;
            this.f51873s |= Integer.MIN_VALUE;
            Object objK = a.this.k(null, null, null, this);
            return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : jn0.s.a(objK);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1126}, m = "logOut-BWLJW6A", n = {}, s = {})
    static final class o0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51874n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51876p;

        o0(Continuation<? super o0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51874n = obj;
            this.f51876p |= Integer.MIN_VALUE;
            Object objA = a.this.a(null, null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class o1 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o1 f51877c = new o1();

        o1() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "confirmPaymentIntentInternal-BWLJW6A", n = {}, s = {})
    static final class p extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51878n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51880p;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51878n = obj;
            this.f51880p |= Integer.MIN_VALUE;
            Object objT = a.this.T(null, null, null, this);
            return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : jn0.s.a(objT);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0, 0, 0, 0}, l = {1587}, m = "makeApiRequest$payments_core_release", n = {"this", "apiRequest", "onResponse", "dnsCacheData"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class p0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51881n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f51882o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f51883p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f51884q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f51885r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f51887t;

        p0(Continuation<? super p0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51885r = obj;
            this.f51887t |= Integer.MIN_VALUE;
            return a.this.i0(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1335}, m = "verifySetupIntentWithMicrodeposits-yxL6bBk", n = {}, s = {})
    static final class p1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51888n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51890p;

        p1(Continuation<? super p1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51888n = obj;
            this.f51890p |= Integer.MIN_VALUE;
            Object objU = a.this.u(null, 0, 0, null, this);
            return objU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objU : jn0.s.a(objU);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "result", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConfirmPaymentIntentParams f51891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f51892d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(ConfirmPaymentIntentParams confirmPaymentIntentParams, a aVar) {
            super(1);
            this.f51891c = confirmPaymentIntentParams;
            this.f51892d = aVar;
        }

        public final void b(Object obj) {
            String type;
            PaymentMethodCreateParams paymentMethodCreateParams = this.f51891c.getPaymentMethodCreateParams();
            if (paymentMethodCreateParams == null || (type = paymentMethodCreateParams.i()) == null) {
                SourceParams sourceParams = this.f51891c.getSourceParams();
                type = sourceParams != null ? sourceParams.getType() : null;
            }
            a aVar = this.f51892d;
            aVar.Z(aVar.paymentAnalyticsRequestFactory.s(type, this.f51892d.d0(obj)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0}, l = {1730}, m = "maybeForDashboard-0E7RQCE", n = {"$this$maybeForDashboard_u2d0E7RQCE"}, s = {"L$0"})
    static final class q0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51893n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f51894o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f51896q;

        q0(Continuation<? super q0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51894o = obj;
            this.f51896q |= Integer.MIN_VALUE;
            Object objL0 = a.this.l0(null, null, this);
            return objL0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL0 : jn0.s.a(objL0);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1362}, m = "verifySetupIntentWithMicrodeposits-BWLJW6A", n = {}, s = {})
    static final class q1 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51897n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51899p;

        q1(Continuation<? super q1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51897n = obj;
            this.f51899p |= Integer.MIN_VALUE;
            Object objI = a.this.i(null, null, null, this);
            return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : jn0.s.a(objI);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {416}, m = "confirmSetupIntent-BWLJW6A", n = {}, s = {})
    static final class r extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51900n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51902p;

        r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51900n = obj;
            this.f51902p |= Integer.MIN_VALUE;
            Object objP = a.this.p(null, null, null, this);
            return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : jn0.s.a(objP);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_REPORT_VALUE}, m = "refreshPaymentIntent-0E7RQCE", n = {}, s = {})
    static final class r0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51903n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51905p;

        r0(Continuation<? super r0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51903n = obj;
            this.f51905p |= Integer.MIN_VALUE;
            Object objZ = a.this.z(null, null, this);
            return objZ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZ : jn0.s.a(objZ);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "result", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ConfirmSetupIntentParams f51907d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(ConfirmSetupIntentParams confirmSetupIntentParams) {
            super(1);
            this.f51907d = confirmSetupIntentParams;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = aVar.paymentAnalyticsRequestFactory;
            PaymentMethodCreateParams paymentMethodCreateParams = this.f51907d.getPaymentMethodCreateParams();
            aVar.Z(paymentAnalyticsRequestFactory.x(paymentMethodCreateParams != null ? paymentMethodCreateParams.i() : null, a.this.d0(obj)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class s0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {
        s0() {
            super(1);
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(PaymentAnalyticsRequestFactory.w(aVar.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentRefresh, null, null, null, null, null, 62, null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1145}, m = "createFinancialConnectionsSessionForDeferredPayments-0E7RQCE", n = {}, s = {})
    static final class t extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51909n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51911p;

        t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51909n = obj;
            this.f51911p |= Integer.MIN_VALUE;
            Object objF = a.this.f(null, null, this);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : jn0.s.a(objF);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {358}, m = "refreshSetupIntent-0E7RQCE", n = {}, s = {})
    static final class t0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51912n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51914p;

        t0(Continuation<? super t0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51912n = obj;
            this.f51914p |= Integer.MIN_VALUE;
            Object objA = a.this.A(null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f51915c = new u();

        u() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class u0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {
        u0() {
            super(1);
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(PaymentAnalyticsRequestFactory.w(aVar.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentRefresh, null, null, null, null, null, 62, null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1162}, m = "createPaymentIntentFinancialConnectionsSession-BWLJW6A", n = {}, s = {})
    static final class v extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51917n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51919p;

        v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51917n = obj;
            this.f51919p |= Integer.MIN_VALUE;
            Object objL = a.this.l(null, null, null, this);
            return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : jn0.s.a(objL);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1466}, m = "retrieveCardElementConfig-0E7RQCE", n = {}, s = {})
    static final class v0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51920n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51922p;

        v0(Continuation<? super v0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51920n = obj;
            this.f51922p |= Integer.MIN_VALUE;
            Object objI = a.this.I(null, null, this);
            return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : jn0.s.a(objI);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class w extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f51923c = new w();

        w() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {871}, m = "retrieveCustomer-BWLJW6A", n = {}, s = {})
    static final class w0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51924n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51926p;

        w0(Continuation<? super w0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51924n = obj;
            this.f51926p |= Integer.MIN_VALUE;
            Object objQ = a.this.q(null, null, null, this);
            return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : jn0.s.a(objQ);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {562}, m = "createPaymentMethod-0E7RQCE", n = {}, s = {})
    static final class x extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51927n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51929p;

        x(Continuation<? super x> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51927n = obj;
            this.f51929p |= Integer.MIN_VALUE;
            Object objJ = a.this.j(null, null, this);
            return objJ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ : jn0.s.a(objJ);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class x0 extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<String> f51931d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(Set<String> set) {
            super(1);
            this.f51931d = set;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(PaymentAnalyticsRequestFactory.w(aVar.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CustomerRetrieve, this.f51931d, null, null, null, null, 60, null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljn0/s;", "Lw30/l0;", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class y extends p013kotlin.jvm.internal.u implements wn0.l<jn0.s<? extends w30.l0<String>>, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PaymentMethodCreateParams f51933d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(PaymentMethodCreateParams paymentMethodCreateParams) {
            super(1);
            this.f51933d = paymentMethodCreateParams;
        }

        public final void b(Object obj) {
            a aVar = a.this;
            aVar.Z(aVar.paymentAnalyticsRequestFactory.t(this.f51933d.getCode(), this.f51933d.e()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(jn0.s<? extends w30.l0<String>> sVar) {
            b(sVar.getValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1425}, m = "retrieveElementsSession-0E7RQCE", n = {}, s = {})
    static final class y0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51934n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51936p;

        y0(Continuation<? super y0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51934n = obj;
            this.f51936p |= Integer.MIN_VALUE;
            Object objH = a.this.H(null, null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : jn0.s.a(objH);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1179}, m = "createSetupIntentFinancialConnectionsSession-BWLJW6A", n = {}, s = {})
    static final class z extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51937n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51939p;

        z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51937n = obj;
            this.f51939p |= Integer.MIN_VALUE;
            Object objO = a.this.o(null, null, null, this);
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : jn0.s.a(objO);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1505}, m = "retrieveElementsSession-BWLJW6A", n = {}, s = {})
    static final class z0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51940n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f51942p;

        z0(Continuation<? super z0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51940n = obj;
            this.f51942p |= Integer.MIN_VALUE;
            Object objN0 = a.this.n0(null, null, null, this);
            return objN0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN0 : jn0.s.a(objN0);
        }
    }

    public a(Context context, wn0.a<String> publishableKeyProvider, AppInfo appInfo, o30.d logger, CoroutineContext workContext, Set<String> productUsageTokens, w30.j0 stripeNetworkClient, w30.c analyticsRequestExecutor, r30.g fraudDetectionDataRepository, b.a cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, r30.f fraudDetectionDataParamsUtils, Set<? extends f30.i0> betas, String apiVersion, String sdkVersion) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(productUsageTokens, "productUsageTokens");
        p013kotlin.jvm.internal.s.k(stripeNetworkClient, "stripeNetworkClient");
        p013kotlin.jvm.internal.s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        p013kotlin.jvm.internal.s.k(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        p013kotlin.jvm.internal.s.k(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        p013kotlin.jvm.internal.s.k(betas, "betas");
        p013kotlin.jvm.internal.s.k(apiVersion, "apiVersion");
        p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
        this.context = context;
        this.publishableKeyProvider = publishableKeyProvider;
        this.appInfo = appInfo;
        this.logger = logger;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
        this.stripeNetworkClient = stripeNetworkClient;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.fraudDetectionDataParamsUtils = fraudDetectionDataParamsUtils;
        this.apiRequestFactory = new w30.l.b(appInfo, apiVersion, sdkVersion);
        a0();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(workContext), null, null, new C0924a(null), 3, null);
    }

    private final Pair<String, String> R(Set<String> attribution) {
        return jn0.x.a("payment_user_agent", x(attribution));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Pair S(a aVar, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = p013kotlin.collections.d1.d();
        }
        return aVar.R(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object T(ConfirmPaymentIntentParams confirmPaymentIntentParams, w30.l.Options options, List<String> list, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        p pVar;
        Object objB;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i11 = pVar.f51880p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f51880p = i11 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        p pVar2 = pVar;
        Object obj = pVar2.f51878n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pVar2.f51880p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        r30.f fVar = this.fraudDetectionDataParamsUtils;
        Map<String, Object> mapC3 = confirmPaymentIntentParams.c3();
        if (options.e()) {
            mapC3 = p013kotlin.collections.v0.n(mapC3, "client_secret");
        }
        Map<String, ?> mapB = fVar.b(p013kotlin.collections.v0.r(j0(mapC3, confirmPaymentIntentParams.getPaymentMethodCreateParams(), confirmPaymentIntentParams.getSourceParams()), INSTANCE.e(list)), e0());
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new PaymentIntent.ClientSecret(confirmPaymentIntentParams.getClientSecret()).getPaymentIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        a0();
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.m((String) objB), options, mapB, false, 8, null);
        x60.u uVar = new x60.u();
        q qVar = new q(confirmPaymentIntentParams, this);
        pVar2.f51880p = 1;
        Object objW = W(lVarD, uVar, qVar, pVar2);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    private final Map<String, Object> U(String clientSecret, List<String> expandFields) {
        return p013kotlin.collections.v0.r(p013kotlin.collections.v0.f(jn0.x.a("client_secret", clientSecret)), INSTANCE.e(expandFields));
    }

    private final c V() {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            String property = Security.getProperty("networkaddress.cache.ttl");
            Security.setProperty("networkaddress.cache.ttl", WebrtcBuildVersion.maint_version);
            objB = jn0.s.b(new c.Success(property));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        c.C0925a c0925a = c.C0925a.f51785a;
        if (jn0.s.g(objB)) {
            objB = c0925a;
        }
        return (c) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <ModelType extends t30.f> Object W(w30.l lVar, u30.a<? extends ModelType> aVar, wn0.l<? super jn0.s<w30.l0<String>>, jn0.h0> lVar2, Continuation<? super jn0.s<? extends ModelType>> continuation) {
        h0 h0Var;
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i11 = h0Var.f51824q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h0Var.f51824q = i11 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(continuation);
            }
        } else {
            h0Var = new h0(continuation);
        }
        Object objI0 = h0Var.f51822o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = h0Var.f51824q;
        try {
            if (i12 == 0) {
                jn0.t.b(objI0);
                jn0.s.Companion companion = jn0.s.INSTANCE;
                h0Var.f51821n = aVar;
                h0Var.f51824q = 1;
                objI0 = i0(lVar, lVar2, h0Var);
                if (objI0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (u30.a) h0Var.f51821n;
                jn0.t.b(objI0);
            }
            t30.f fVarA = aVar.a(w30.e0.a((w30.l0) objI0));
            if (fVarA != null) {
                return jn0.s.b(fVarA);
            }
            throw new APIException(null, null, 0, "Unable to parse response with " + aVar.getClass().getSimpleName(), null, 23, null);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object X(a aVar, w30.l lVar, u30.a aVar2, wn0.l lVar2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar2 = i0.f51830c;
        }
        return aVar.W(lVar, aVar2, lVar2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(PaymentAnalyticsEvent event) {
        Z(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, event, null, null, null, null, null, 62, null));
    }

    private final void a0() {
        this.fraudDetectionDataRepository.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d0(Object obj) {
        Object objB;
        w30.l0<String> l0Var = (w30.l0) (jn0.s.g(obj) ? null : obj);
        Throwable thE = jn0.s.e(obj);
        if (thE != null) {
            return q30.a.a(thE);
        }
        if (l0Var == null || !l0Var.getIsError()) {
            return null;
        }
        try {
            h0(l0Var);
            objB = jn0.s.b(jn0.h0.f84049a);
        } catch (Throwable th2) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE2 = jn0.s.e(objB);
        if (thE2 != null) {
            return q30.a.a(thE2);
        }
        return null;
    }

    private final FraudDetectionData e0() {
        return this.fraudDetectionDataRepository.a();
    }

    private final void h0(w30.l0<String> response) throws CardException, InvalidRequestException, PermissionException, RateLimitException, APIException, AuthenticationException {
        w30.d0 requestId = response.getRequestId();
        String value = requestId != null ? requestId.getValue() : null;
        int code = response.getCode();
        StripeError stripeErrorE = z60.f.e(new u30.b().a(w30.e0.a(response)), this.context);
        if (code == 429) {
            throw new RateLimitException(stripeErrorE, value, null, null, 12, null);
        }
        switch (code) {
            case 400:
            case 404:
                throw new InvalidRequestException(stripeErrorE, value, code, null, null, 24, null);
            case HttpStatusCode.UNAUTHORIZED_401 /* 401 */:
                throw new AuthenticationException(stripeErrorE, value);
            case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                throw new CardException(stripeErrorE, value);
            case DownloaderService.STATUS_FORBIDDEN /* 403 */:
                throw new PermissionException(stripeErrorE, value);
            default:
                throw new APIException(stripeErrorE, value, code, null, null, 24, null);
        }
    }

    private final Map<String, Object> j0(Map<String, ? extends Object> params, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams) {
        Set<String> setD;
        Set setD2;
        Object obj = params.get("payment_method_data");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            if (paymentMethodCreateParams == null || (setD2 = paymentMethodCreateParams.e()) == null) {
                setD2 = p013kotlin.collections.d1.d();
            }
            Map<String, Object> mapS = p013kotlin.collections.v0.s(params, jn0.x.a("payment_method_data", p013kotlin.collections.v0.s(map, R(setD2))));
            if (mapS != null) {
                return mapS;
            }
        }
        Object obj2 = params.get("source_data");
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 == null) {
            return params;
        }
        if (sourceParams == null || (setD = sourceParams.a()) == null) {
            setD = p013kotlin.collections.d1.d();
        }
        return p013kotlin.collections.v0.s(params, jn0.x.a("source_data", p013kotlin.collections.v0.s(map2, R(setD))));
    }

    static /* synthetic */ Map k0(a aVar, Map map, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            sourceParams = null;
        }
        return aVar.j0(map, paymentMethodCreateParams, sourceParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l0(ConfirmPaymentIntentParams confirmPaymentIntentParams, w30.l.Options options, Continuation<? super jn0.s<ConfirmPaymentIntentParams>> continuation) {
        q0 q0Var;
        Object objJ;
        if (continuation instanceof q0) {
            q0Var = (q0) continuation;
            int i11 = q0Var.f51896q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q0Var.f51896q = i11 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(continuation);
            }
        } else {
            q0Var = new q0(continuation);
        }
        Object obj = q0Var.f51894o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = q0Var.f51896q;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (!options.e() || confirmPaymentIntentParams.getPaymentMethodCreateParams() == null) {
                return jn0.s.b(confirmPaymentIntentParams);
            }
            PaymentMethodCreateParams paymentMethodCreateParams = confirmPaymentIntentParams.getPaymentMethodCreateParams();
            q0Var.f51893n = confirmPaymentIntentParams;
            q0Var.f51896q = 1;
            objJ = j(paymentMethodCreateParams, options, q0Var);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmPaymentIntentParams = (ConfirmPaymentIntentParams) q0Var.f51893n;
            jn0.t.b(obj);
            objJ = ((jn0.s) obj).getValue();
        }
        if (!jn0.s.h(objJ)) {
            return jn0.s.b(objJ);
        }
        try {
            ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.INSTANCE;
            String clientSecret = confirmPaymentIntentParams.getClientSecret();
            String str = ((PaymentMethod) objJ).id;
            p013kotlin.jvm.internal.s.h(str);
            return jn0.s.b(companion.d(clientSecret, str, confirmPaymentIntentParams.getPaymentMethodOptions()));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(th2));
        }
    }

    private final void m0(c dnsCacheData) {
        if (dnsCacheData instanceof c.Success) {
            String originalDnsCacheTtl = ((c.Success) dnsCacheData).getOriginalDnsCacheTtl();
            if (originalDnsCacheTtl == null) {
                originalDnsCacheTtl = "-1";
            }
            Security.setProperty("networkaddress.cache.ttl", originalDnsCacheTtl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object n0(com.stripe.android.model.j0 j0Var, w30.l.Options options, PaymentAnalyticsEvent paymentAnalyticsEvent, Continuation<? super jn0.s<ElementsSession>> continuation) {
        z0 z0Var;
        if (continuation instanceof z0) {
            z0Var = (z0) continuation;
            int i11 = z0Var.f51942p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                z0Var.f51942p = i11 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(continuation);
            }
        } else {
            z0Var = new z0(continuation);
        }
        z0 z0Var2 = z0Var;
        Object obj = z0Var2.f51940n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = z0Var2.f51942p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        if (options.e()) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(new IllegalArgumentException("Invalid API key")));
        }
        a0();
        x60.p pVar = new x60.p(j0Var, options.d(), null, 4, null);
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put("type", j0Var.getType());
        String clientSecret = j0Var.getClientSecret();
        if (clientSecret != null) {
            mapC.put("client_secret", clientSecret);
        }
        mapC.put("locale", j0Var.getLocale());
        String customerSessionClientSecret = j0Var.getCustomerSessionClientSecret();
        if (customerSessionClientSecret != null) {
            mapC.put("customer_session_client_secret", customerSessionClientSecret);
        }
        List<String> listY1 = j0Var.Y1();
        if (listY1.isEmpty()) {
            listY1 = null;
        }
        if (listY1 != null) {
            mapC.put("external_payment_methods", listY1);
        }
        String defaultPaymentMethodId = j0Var.getDefaultPaymentMethodId();
        if (defaultPaymentMethodId != null) {
            mapC.put("client_default_payment_method", defaultPaymentMethodId);
        }
        com.stripe.android.model.j0.DeferredIntentType deferredIntentType = j0Var instanceof com.stripe.android.model.j0.DeferredIntentType ? (com.stripe.android.model.j0.DeferredIntentType) j0Var : null;
        if (deferredIntentType != null) {
            mapC.putAll(deferredIntentType.getDeferredIntentParams().c());
        }
        Map mapB = p013kotlin.collections.v0.b(mapC);
        w30.l.b bVar = this.apiRequestFactory;
        Companion companion2 = INSTANCE;
        w30.l lVarB = w30.l.b.b(bVar, companion2.f("elements/sessions"), options, p013kotlin.collections.v0.r(mapB, companion2.e(j0Var.g3())), false, 8, null);
        a1 a1Var = new a1(paymentAnalyticsEvent, this);
        z0Var2.f51942p = 1;
        Object objW = W(lVarB, pVar, a1Var, z0Var2);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // z60.g
    public Object A(String str, w30.l.Options options, Continuation<? super jn0.s<SetupIntent>> continuation) {
        t0 t0Var;
        Object objB;
        if (continuation instanceof t0) {
            t0Var = (t0) continuation;
            int i11 = t0Var.f51914p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t0Var.f51914p = i11 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(continuation);
            }
        } else {
            t0Var = new t0(continuation);
        }
        t0 t0Var2 = t0Var;
        Object obj = t0Var2.f51912n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = t0Var2.f51914p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        a0();
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.w((String) objB), options, U(str, p013kotlin.collections.v.m()), false, 8, null);
        x60.x xVar = new x60.x();
        u0 u0Var = new u0();
        t0Var2.f51914p = 1;
        Object objW = W(lVarD, xVar, u0Var, t0Var2);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // z60.g
    public Object B(String str, String str2, String str3, w30.l.Options options, List<String> list, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f51792p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f51792p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f51790n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f51792p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l.b bVar = this.apiRequestFactory;
        Companion companion = INSTANCE;
        w30.l lVarD = w30.l.b.d(bVar, companion.h(str2, str3), options, p013kotlin.collections.v0.r(p013kotlin.collections.v0.f(jn0.x.a("client_secret", str)), companion.e(list)), false, 8, null);
        x60.u uVar = new x60.u();
        e eVar = e.f51799c;
        dVar.f51792p = 1;
        Object objW = W(lVarD, uVar, eVar, dVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object C(ListPaymentMethodsParams listPaymentMethodsParams, Set<String> set, w30.l.Options options, Continuation<? super jn0.s<? extends List<PaymentMethod>>> continuation) {
        m0 m0Var;
        Object objW;
        if (continuation instanceof m0) {
            m0Var = (m0) continuation;
            int i11 = m0Var.f51858p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m0Var.f51858p = i11 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(continuation);
            }
        } else {
            m0Var = new m0(continuation);
        }
        Object obj = m0Var.f51856n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = m0Var.f51858p;
        if (i12 == 0) {
            jn0.t.b(obj);
            w30.l lVarB = w30.l.b.b(this.apiRequestFactory, INSTANCE.u(), options, listPaymentMethodsParams.c3(), false, 8, null);
            x60.w wVar = new x60.w();
            n0 n0Var = new n0(set);
            m0Var.f51858p = 1;
            objW = W(lVarB, wVar, n0Var, m0Var);
            if (objW == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objW = ((jn0.s) obj).getValue();
        }
        return jn0.s.h(objW) ? jn0.s.b(((PaymentMethodsList) objW).a()) : jn0.s.b(objW);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object D(String str, w30.l.Options options, List<String> list, Continuation<? super jn0.s<? extends StripeIntent>> continuation) {
        f1 f1Var;
        if (continuation instanceof f1) {
            f1Var = (f1) continuation;
            int i11 = f1Var.f51811p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f1Var.f51811p = i11 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(continuation);
            }
        } else {
            f1Var = new f1(continuation);
        }
        Object obj = f1Var.f51809n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = f1Var.f51811p;
        if (i12 != 0) {
            if (i12 == 1) {
                jn0.t.b(obj);
                return ((jn0.s) obj).getValue();
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        if (PaymentIntent.ClientSecret.INSTANCE.a(str)) {
            f1Var.f51811p = 1;
            Object objM = m(str, options, list, f1Var);
            if (objM != coroutine_suspended) {
                return objM;
            }
        } else {
            if (!SetupIntent.ClientSecret.INSTANCE.a(str)) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(new IllegalStateException("Invalid client secret.")));
            }
            f1Var.f51811p = 2;
            Object objG = g(str, options, list, f1Var);
            if (objG != coroutine_suspended) {
                return objG;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object E(String str, String str2, w30.l.Options options, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f51834p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f51834p = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object obj = jVar.f51832n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar.f51834p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        a0();
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.k(str), options, p013kotlin.collections.v0.f(jn0.x.a("source", str2)), false, 8, null);
        x60.u uVar = new x60.u();
        k kVar = new k();
        jVar.f51834p = 1;
        Object objW = W(lVarD, uVar, kVar, jVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object F(Stripe3ds2AuthParams stripe3ds2AuthParams, w30.l.Options options, Continuation<? super jn0.s<Stripe3ds2AuthResult>> continuation) {
        h1 h1Var;
        if (continuation instanceof h1) {
            h1Var = (h1) continuation;
            int i11 = h1Var.f51827p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h1Var.f51827p = i11 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(continuation);
            }
        } else {
            h1Var = new h1(continuation);
        }
        Object obj = h1Var.f51825n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = h1Var.f51827p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.f("3ds2/authenticate"), options, stripe3ds2AuthParams.c3(), false, 8, null);
        x60.e0 e0Var = new x60.e0();
        i1 i1Var = new i1();
        h1Var.f51827p = 1;
        Object objW = W(lVarD, e0Var, i1Var, h1Var);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // z60.g
    public Object G(String str, w30.l.Options options, Continuation<? super jn0.s<Stripe3ds2AuthResult>> continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i11 = nVar.f51862p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f51862p = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        n nVar2 = nVar;
        Object obj = nVar2.f51860n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = nVar2.f51862p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.f("3ds2/challenge_complete"), options, p013kotlin.collections.v0.f(jn0.x.a("source", str)), false, 8, null);
        x60.e0 e0Var = new x60.e0();
        nVar2.f51862p = 1;
        Object objX = X(this, lVarD, e0Var, null, nVar2, 4, null);
        return objX == coroutine_suspended ? coroutine_suspended : objX;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object H(com.stripe.android.model.j0 j0Var, w30.l.Options options, Continuation<? super jn0.s<ElementsSession>> continuation) {
        y0 y0Var;
        if (continuation instanceof y0) {
            y0Var = (y0) continuation;
            int i11 = y0Var.f51936p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                y0Var.f51936p = i11 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(continuation);
            }
        } else {
            y0Var = new y0(continuation);
        }
        Object obj = y0Var.f51934n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = y0Var.f51936p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        y0Var.f51936p = 1;
        Object objN0 = n0(j0Var, options, null, y0Var);
        return objN0 == coroutine_suspended ? coroutine_suspended : objN0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // z60.g
    public Object I(w30.l.Options options, Map<String, String> map, Continuation<? super jn0.s<MobileCardElementConfig>> continuation) {
        v0 v0Var;
        if (continuation instanceof v0) {
            v0Var = (v0) continuation;
            int i11 = v0Var.f51922p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v0Var.f51922p = i11 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(continuation);
            }
        } else {
            v0Var = new v0(continuation);
        }
        v0 v0Var2 = v0Var;
        Object obj = v0Var2.f51920n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = v0Var2.f51922p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarB = w30.l.b.b(this.apiRequestFactory, INSTANCE.s(), options, map, false, 8, null);
        x60.s sVar = new x60.s();
        v0Var2.f51922p = 1;
        Object objX = X(this, lVarB, sVar, null, v0Var2, 4, null);
        return objX == coroutine_suspended ? coroutine_suspended : objX;
    }

    public final void Z(AnalyticsRequest params) {
        p013kotlin.jvm.internal.s.k(params, "params");
        this.analyticsRequestExecutor.a(params);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // z60.g
    public Object a(String str, String str2, w30.l.Options options, Continuation<? super jn0.s<ConsumerSession>> continuation) {
        o0 o0Var;
        if (continuation instanceof o0) {
            o0Var = (o0) continuation;
            int i11 = o0Var.f51876p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o0Var.f51876p = i11 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(continuation);
            }
        } else {
            o0Var = new o0(continuation);
        }
        o0 o0Var2 = o0Var;
        Object obj = o0Var2.f51874n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = o0Var2.f51876p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.q(), options, p013kotlin.collections.v0.m(jn0.x.a("request_surface", "android_payment_element"), jn0.x.a("credentials", p013kotlin.collections.v0.f(jn0.x.a("consumer_session_client_secret", str)))), false, 8, null);
        x60.i iVar = new x60.i();
        o0Var2.f51876p = 1;
        Object objX = X(this, lVarD, iVar, null, o0Var2, 4, null);
        return objX == coroutine_suspended ? coroutine_suspended : objX;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object b(Set<String> set, String str, w30.l.Options options, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        d0 d0Var;
        if (continuation instanceof d0) {
            d0Var = (d0) continuation;
            int i11 = d0Var.f51795p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d0Var.f51795p = i11 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(continuation);
            }
        } else {
            d0Var = new d0(continuation);
        }
        Object obj = d0Var.f51793n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = d0Var.f51795p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, b0(str), options, null, false, 12, null);
        x60.v vVar = new x60.v();
        e0 e0Var = new e0(set);
        d0Var.f51795p = 1;
        Object objW = W(lVarD, vVar, e0Var, d0Var);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    public final String b0(String paymentMethodId) {
        p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
        return INSTANCE.g("payment_methods/%s/detach", paymentMethodId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object c(com.stripe.android.model.q1 q1Var, w30.l.Options options, Continuation<? super jn0.s<Token>> continuation) {
        b0 b0Var;
        if (continuation instanceof b0) {
            b0Var = (b0) continuation;
            int i11 = b0Var.f51781p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b0Var.f51781p = i11 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(continuation);
            }
        } else {
            b0Var = new b0(continuation);
        }
        Object obj = b0Var.f51779n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = b0Var.f51781p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        a0();
        w30.l.b bVar = this.apiRequestFactory;
        String strB = INSTANCE.B();
        Map mapS = p013kotlin.collections.v0.s(q1Var.c3(), R(q1Var.a()));
        FraudDetectionData fraudDetectionDataE0 = e0();
        Map<String, String> mapC = fraudDetectionDataE0 != null ? fraudDetectionDataE0.c() : null;
        if (mapC == null) {
            mapC = p013kotlin.collections.v0.i();
        }
        w30.l lVarD = w30.l.b.d(bVar, strB, options, p013kotlin.collections.v0.r(mapS, mapC), false, 8, null);
        x60.f0 f0Var = new x60.f0();
        c0 c0Var = new c0(q1Var);
        b0Var.f51781p = 1;
        Object objW = W(lVarD, f0Var, c0Var, b0Var);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    public final String c0(String paymentMethodId) {
        p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
        return INSTANCE.g("elements/payment_methods/%s/detach", paymentMethodId);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // z60.g
    public Object d(String str, String str2, Map<String, ?> map, w30.l.Options options, Continuation<? super jn0.s<String>> continuation) {
        g1 g1Var;
        Object objX;
        if (continuation instanceof g1) {
            g1Var = (g1) continuation;
            int i11 = g1Var.f51817p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g1Var.f51817p = i11 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(continuation);
            }
        } else {
            g1Var = new g1(continuation);
        }
        g1 g1Var2 = g1Var;
        Object obj = g1Var2.f51815n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = g1Var2.f51817p;
        if (i12 == 0) {
            jn0.t.b(obj);
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.A(), options, p013kotlin.collections.v0.r(p013kotlin.collections.v0.m(jn0.x.a("request_surface", "android_payment_element"), jn0.x.a("credentials", p013kotlin.collections.v0.f(jn0.x.a("consumer_session_client_secret", str))), jn0.x.a("id", str2), S(this, null, 1, null)), map == null ? p013kotlin.collections.v0.i() : map), false, 8, null);
            x60.h hVar = x60.h.f122843b;
            g1Var2.f51817p = 1;
            objX = X(this, lVarD, hVar, null, g1Var2, 4, null);
            if (objX == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objX = ((jn0.s) obj).getValue();
        }
        return jn0.s.h(objX) ? jn0.s.b(((ConsumerPaymentDetailsShare) objX).getId()) : jn0.s.b(objX);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object e(String str, com.stripe.android.model.a1 a1Var, w30.l.Options options, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        j1 j1Var;
        if (continuation instanceof j1) {
            j1Var = (j1) continuation;
            int i11 = j1Var.f51841p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j1Var.f51841p = i11 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(continuation);
            }
        } else {
            j1Var = new j1(continuation);
        }
        Object obj = j1Var.f51839n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = j1Var.f51841p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        a0();
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.t(str), options, a1Var.c3(), false, 8, null);
        x60.v vVar = new x60.v();
        k1 k1Var = new k1(a1Var);
        j1Var.f51841p = 1;
        Object objW = W(lVarD, vVar, k1Var, j1Var);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object f(CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams, w30.l.Options options, Continuation<? super jn0.s<FinancialConnectionsSession>> continuation) {
        t tVar;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i11 = tVar.f51911p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tVar.f51911p = i11 - Integer.MIN_VALUE;
            } else {
                tVar = new t(continuation);
            }
        } else {
            tVar = new t(continuation);
        }
        Object obj = tVar.f51909n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tVar.f51911p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.o(), options, createFinancialConnectionsSessionForDeferredPaymentParams.a(), false, 8, null);
        x60.q qVar = new x60.q();
        u uVar = u.f51915c;
        tVar.f51911p = 1;
        Object objW = W(lVarD, qVar, uVar, tVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    public final /* synthetic */ String f0(String paymentIntentId) {
        p013kotlin.jvm.internal.s.k(paymentIntentId, "paymentIntentId");
        return INSTANCE.g("payment_intents/%s/link_account_sessions", paymentIntentId);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // z60.g
    public Object g(String str, w30.l.Options options, List<String> list, Continuation<? super jn0.s<SetupIntent>> continuation) {
        d1 d1Var;
        Object objB;
        if (continuation instanceof d1) {
            d1Var = (d1) continuation;
            int i11 = d1Var.f51798p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d1Var.f51798p = i11 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(continuation);
            }
        } else {
            d1Var = new d1(continuation);
        }
        d1 d1Var2 = d1Var;
        Object obj = d1Var2.f51796n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = d1Var2.f51798p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        a0();
        w30.l lVarB = w30.l.b.b(this.apiRequestFactory, INSTANCE.z((String) objB), options, U(str, list), false, 8, null);
        x60.x xVar = new x60.x();
        e1 e1Var = new e1();
        d1Var2.f51798p = 1;
        Object objW = W(lVarB, xVar, e1Var, d1Var2);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    public final /* synthetic */ String g0(String setupIntentId) {
        p013kotlin.jvm.internal.s.k(setupIntentId, "setupIntentId");
        return INSTANCE.g("setup_intents/%s/link_account_sessions", setupIntentId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object h(w30.l.Options options, Continuation<? super jn0.s<BankStatuses>> continuation) {
        k0 k0Var;
        if (continuation instanceof k0) {
            k0Var = (k0) continuation;
            int i11 = k0Var.f51845p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k0Var.f51845p = i11 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(continuation);
            }
        } else {
            k0Var = new k0(continuation);
        }
        Object obj = k0Var.f51843n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = k0Var.f51845p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarB = w30.l.b.b(this.apiRequestFactory, INSTANCE.f("fpx/bank_statuses"), w30.l.Options.b(options, null, null, null, 5, null), p013kotlin.collections.v0.f(jn0.x.a("account_holder_type", Kind.INDIVIDUAL)), false, 8, null);
        x60.r rVar = new x60.r();
        l0 l0Var = new l0();
        k0Var.f51845p = 1;
        Object objW = W(lVarB, rVar, l0Var, k0Var);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // z60.g
    public Object i(String str, String str2, w30.l.Options options, Continuation<? super jn0.s<SetupIntent>> continuation) {
        q1 q1Var;
        Object objB;
        if (continuation instanceof q1) {
            q1Var = (q1) continuation;
            int i11 = q1Var.f51899p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q1Var.f51899p = i11 - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(continuation);
            }
        } else {
            q1Var = new q1(continuation);
        }
        q1 q1Var2 = q1Var;
        Object obj = q1Var2.f51897n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = q1Var2.f51899p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.D((String) objB), options, p013kotlin.collections.v0.m(jn0.x.a("client_secret", str), jn0.x.a("descriptor_code", str2)), false, 8, null);
        x60.x xVar = new x60.x();
        q1Var2.f51899p = 1;
        Object objX = X(this, lVarD, xVar, null, q1Var2, 4, null);
        return objX == coroutine_suspended ? coroutine_suspended : objX;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i0(w30.l lVar, wn0.l<? super jn0.s<w30.l0<String>>, jn0.h0> lVar2, Continuation<? super w30.l0<String>> continuation) throws Throwable {
        p0 p0Var;
        c cVarV;
        a aVar;
        Object objA;
        Object objB;
        Throwable thE;
        w30.l0<String> l0Var;
        if (continuation instanceof p0) {
            p0Var = (p0) continuation;
            int i11 = p0Var.f51887t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p0Var.f51887t = i11 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(continuation);
            }
        } else {
            p0Var = new p0(continuation);
        }
        Object obj = p0Var.f51885r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = p0Var.f51887t;
        if (i12 == 0) {
            jn0.t.b(obj);
            cVarV = V();
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                w30.j0 j0Var = this.stripeNetworkClient;
                p0Var.f51881n = this;
                p0Var.f51882o = lVar;
                p0Var.f51883p = lVar2;
                p0Var.f51884q = cVarV;
                p0Var.f51887t = 1;
                objA = j0Var.a(lVar, p0Var);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = this;
                objB = jn0.s.b((w30.l0) objA);
            } catch (Throwable th2) {
                th = th2;
                aVar = this;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th));
                lVar2.invoke(jn0.s.a(objB));
                thE = jn0.s.e(objB);
                if (thE != null) {
                    if (thE instanceof IOException) {
                        throw APIConnectionException.INSTANCE.a((IOException) thE, lVar.getBaseUrl());
                    }
                    throw thE;
                }
                l0Var = (w30.l0) objB;
                if (l0Var.getIsError()) {
                    aVar.h0(l0Var);
                }
                aVar.m0(cVarV);
                return l0Var;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c cVar = (c) p0Var.f51884q;
            lVar2 = (wn0.l) p0Var.f51883p;
            w30.l lVar3 = (w30.l) p0Var.f51882o;
            a aVar2 = (a) p0Var.f51881n;
            try {
                jn0.t.b(obj);
                cVarV = cVar;
                lVar = lVar3;
                aVar = aVar2;
                objA = obj;
                try {
                    objB = jn0.s.b((w30.l0) objA);
                } catch (Throwable th3) {
                    th = th3;
                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th));
                }
            } catch (Throwable th4) {
                cVarV = cVar;
                lVar = lVar3;
                aVar = aVar2;
                th = th4;
                jn0.s.Companion companion4 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th));
                lVar2.invoke(jn0.s.a(objB));
                thE = jn0.s.e(objB);
                if (thE != null) {
                    if (thE instanceof IOException) {
                        throw APIConnectionException.INSTANCE.a((IOException) thE, lVar.getBaseUrl());
                    }
                    throw thE;
                }
                l0Var = (w30.l0) objB;
                if (l0Var.getIsError()) {
                    aVar.h0(l0Var);
                }
                aVar.m0(cVarV);
                return l0Var;
            }
        }
        lVar2.invoke(jn0.s.a(objB));
        thE = jn0.s.e(objB);
        if (thE != null) {
            if (thE instanceof IOException) {
                throw APIConnectionException.INSTANCE.a((IOException) thE, lVar.getBaseUrl());
            }
            throw thE;
        }
        l0Var = (w30.l0) objB;
        if (l0Var.getIsError()) {
            aVar.h0(l0Var);
        }
        aVar.m0(cVarV);
        return l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object j(PaymentMethodCreateParams paymentMethodCreateParams, w30.l.Options options, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        x xVar;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i11 = xVar.f51929p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f51929p = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(continuation);
            }
        } else {
            xVar = new x(continuation);
        }
        Object obj = xVar.f51927n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = xVar.f51929p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        a0();
        w30.l.b bVar = this.apiRequestFactory;
        String strU = INSTANCE.u();
        Map mapS = p013kotlin.collections.v0.s(paymentMethodCreateParams.c3(), R(paymentMethodCreateParams.e()));
        FraudDetectionData fraudDetectionDataE0 = e0();
        Map<String, String> mapC = fraudDetectionDataE0 != null ? fraudDetectionDataE0.c() : null;
        if (mapC == null) {
            mapC = p013kotlin.collections.v0.i();
        }
        w30.l lVarD = w30.l.b.d(bVar, strU, options, p013kotlin.collections.v0.r(mapS, mapC), false, 8, null);
        x60.v vVar = new x60.v();
        y yVar = new y(paymentMethodCreateParams);
        xVar.f51929p = 1;
        Object objW = W(lVarD, vVar, yVar, xVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object k(ConfirmPaymentIntentParams confirmPaymentIntentParams, w30.l.Options options, List<String> list, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        o oVar;
        Object objL0;
        a aVar;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i11 = oVar.f51873s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f51873s = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        Object obj = oVar.f51871q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = oVar.f51873s;
        if (i12 == 0) {
            jn0.t.b(obj);
            oVar.f51868n = this;
            oVar.f51869o = options;
            oVar.f51870p = list;
            oVar.f51873s = 1;
            objL0 = l0(confirmPaymentIntentParams, options, oVar);
            if (objL0 != coroutine_suspended) {
                aVar = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        list = (List) oVar.f51870p;
        options = (w30.l.Options) oVar.f51869o;
        aVar = (a) oVar.f51868n;
        jn0.t.b(obj);
        objL0 = ((jn0.s) obj).getValue();
        Throwable thE = jn0.s.e(objL0);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        oVar.f51868n = null;
        oVar.f51869o = null;
        oVar.f51870p = null;
        oVar.f51873s = 2;
        Object objT = aVar.T((ConfirmPaymentIntentParams) objL0, options, list, oVar);
        return objT == coroutine_suspended ? coroutine_suspended : objT;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object l(String str, com.stripe.android.model.y yVar, w30.l.Options options, Continuation<? super jn0.s<FinancialConnectionsSession>> continuation) {
        v vVar;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i11 = vVar.f51919p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vVar.f51919p = i11 - Integer.MIN_VALUE;
            } else {
                vVar = new v(continuation);
            }
        } else {
            vVar = new v(continuation);
        }
        Object obj = vVar.f51917n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = vVar.f51919p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, f0(str), options, yVar.a(), false, 8, null);
        x60.q qVar = new x60.q();
        w wVar = w.f51923c;
        vVar.f51919p = 1;
        Object objW = W(lVarD, qVar, wVar, vVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // z60.g
    public Object m(String str, w30.l.Options options, List<String> list, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        b1 b1Var;
        Object objB;
        if (continuation instanceof b1) {
            b1Var = (b1) continuation;
            int i11 = b1Var.f51784p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b1Var.f51784p = i11 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(continuation);
            }
        } else {
            b1Var = new b1(continuation);
        }
        b1 b1Var2 = b1Var;
        Object obj = b1Var2.f51782n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = b1Var2.f51784p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        String str2 = (String) objB;
        Map<String, Object> mapE = options.e() ? INSTANCE.e(list) : U(str, list);
        a0();
        w30.l lVarB = w30.l.b.b(this.apiRequestFactory, INSTANCE.y(str2), options, mapE, false, 8, null);
        x60.u uVar = new x60.u();
        c1 c1Var = new c1();
        b1Var2.f51784p = 1;
        Object objW = W(lVarB, uVar, c1Var, b1Var2);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // z60.g
    public Object n(String str, int i11, int i12, w30.l.Options options, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        l1 l1Var;
        Object objB;
        if (continuation instanceof l1) {
            l1Var = (l1) continuation;
            int i13 = l1Var.f51854p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                l1Var.f51854p = i13 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(continuation);
            }
        } else {
            l1Var = new l1(continuation);
        }
        Object obj = l1Var.f51852n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = l1Var.f51854p;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.C((String) objB), options, p013kotlin.collections.v0.m(jn0.x.a("client_secret", str), jn0.x.a("amounts", p013kotlin.collections.v.p(Boxing.boxInt(i11), Boxing.boxInt(i12)))), false, 8, null);
        x60.u uVar = new x60.u();
        m1 m1Var = m1.f51859c;
        l1Var.f51854p = 1;
        Object objW = W(lVarD, uVar, m1Var, l1Var);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object o(String str, com.stripe.android.model.y yVar, w30.l.Options options, Continuation<? super jn0.s<FinancialConnectionsSession>> continuation) {
        z zVar;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i11 = zVar.f51939p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zVar.f51939p = i11 - Integer.MIN_VALUE;
            } else {
                zVar = new z(continuation);
            }
        } else {
            zVar = new z(continuation);
        }
        Object obj = zVar.f51937n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = zVar.f51939p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, g0(str), options, yVar.a(), false, 8, null);
        x60.q qVar = new x60.q();
        a0 a0Var = a0.f51776c;
        zVar.f51939p = 1;
        Object objW = W(lVarD, qVar, a0Var, zVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // z60.g
    public Object p(ConfirmSetupIntentParams confirmSetupIntentParams, w30.l.Options options, List<String> list, Continuation<? super jn0.s<SetupIntent>> continuation) {
        r rVar;
        Object objB;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i11 = rVar.f51902p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f51902p = i11 - Integer.MIN_VALUE;
            } else {
                rVar = new r(continuation);
            }
        } else {
            rVar = new r(continuation);
        }
        r rVar2 = rVar;
        Object obj = rVar2.f51900n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rVar2.f51902p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new SetupIntent.ClientSecret(confirmSetupIntentParams.getClientSecret()).getSetupIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        a0();
        w30.l.b bVar = this.apiRequestFactory;
        Companion companion3 = INSTANCE;
        w30.l lVarD = w30.l.b.d(bVar, companion3.n((String) objB), options, this.fraudDetectionDataParamsUtils.b(p013kotlin.collections.v0.r(k0(this, confirmSetupIntentParams.c3(), confirmSetupIntentParams.getPaymentMethodCreateParams(), null, 4, null), companion3.e(list)), e0()), false, 8, null);
        x60.x xVar = new x60.x();
        s sVar = new s(confirmSetupIntentParams);
        rVar2.f51902p = 1;
        Object objW = W(lVarD, xVar, sVar, rVar2);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object q(String str, Set<String> set, w30.l.Options options, Continuation<? super jn0.s<Customer>> continuation) {
        w0 w0Var;
        if (continuation instanceof w0) {
            w0Var = (w0) continuation;
            int i11 = w0Var.f51926p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w0Var.f51926p = i11 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(continuation);
            }
        } else {
            w0Var = new w0(continuation);
        }
        Object obj = w0Var.f51924n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = w0Var.f51926p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarB = w30.l.b.b(this.apiRequestFactory, INSTANCE.x(str), options, null, false, 12, null);
        x60.l lVar = new x60.l();
        x0 x0Var = new x0(set);
        w0Var.f51926p = 1;
        Object objW = W(lVarB, lVar, x0Var, w0Var);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // z60.g
    public Object r(String str, String str2, w30.l.Options options, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        n1 n1Var;
        Object objB;
        if (continuation instanceof n1) {
            n1Var = (n1) continuation;
            int i11 = n1Var.f51867p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n1Var.f51867p = i11 - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(continuation);
            }
        } else {
            n1Var = new n1(continuation);
        }
        n1 n1Var2 = n1Var;
        Object obj = n1Var2.f51865n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = n1Var2.f51867p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.C((String) objB), options, p013kotlin.collections.v0.m(jn0.x.a("client_secret", str), jn0.x.a("descriptor_code", str2)), false, 8, null);
        x60.u uVar = new x60.u();
        o1 o1Var = o1.f51877c;
        n1Var2.f51867p = 1;
        Object objW = W(lVarD, uVar, o1Var, n1Var2);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z60.g
    public Object s(String str, String str2, w30.l.Options options, Continuation<? super jn0.s<SetupIntent>> continuation) {
        l lVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i11 = lVar.f51850p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f51850p = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object obj = lVar.f51848n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = lVar.f51850p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.l(str), options, p013kotlin.collections.v0.f(jn0.x.a("source", str2)), false, 8, null);
        x60.x xVar = new x60.x();
        m mVar = new m();
        lVar.f51850p = 1;
        Object objW = W(lVarD, xVar, mVar, lVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // z60.g
    public Object t(String str, Set<String> set, String str2, w30.l.Options options, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        f0 f0Var;
        if (continuation instanceof f0) {
            f0Var = (f0) continuation;
            int i11 = f0Var.f51808p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f0Var.f51808p = i11 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(continuation);
            }
        } else {
            f0Var = new f0(continuation);
        }
        Object obj = f0Var.f51806n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = f0Var.f51808p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, c0(str2), options, p013kotlin.collections.v0.f(jn0.x.a("customer_session_client_secret", str)), false, 8, null);
        x60.v vVar = new x60.v();
        g0 g0Var = new g0(set);
        f0Var.f51808p = 1;
        Object objW = W(lVarD, vVar, g0Var, f0Var);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // z60.g
    public Object u(String str, int i11, int i12, w30.l.Options options, Continuation<? super jn0.s<SetupIntent>> continuation) {
        p1 p1Var;
        Object objB;
        if (continuation instanceof p1) {
            p1Var = (p1) continuation;
            int i13 = p1Var.f51890p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                p1Var.f51890p = i13 - Integer.MIN_VALUE;
            } else {
                p1Var = new p1(continuation);
            }
        } else {
            p1Var = new p1(continuation);
        }
        p1 p1Var2 = p1Var;
        Object obj = p1Var2.f51888n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = p1Var2.f51890p;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.D((String) objB), options, p013kotlin.collections.v0.m(jn0.x.a("client_secret", str), jn0.x.a("amounts", p013kotlin.collections.v.p(Boxing.boxInt(i11), Boxing.boxInt(i12)))), false, 8, null);
        x60.x xVar = new x60.x();
        p1Var2.f51890p = 1;
        Object objX = X(this, lVarD, xVar, null, p1Var2, 4, null);
        return objX == coroutine_suspended ? coroutine_suspended : objX;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // z60.g
    public Object v(h30.a aVar, w30.l.Options options, Continuation<? super jn0.s<CardMetadata>> continuation) {
        j0 j0Var;
        Object objX;
        a aVar2;
        if (continuation instanceof j0) {
            j0Var = (j0) continuation;
            int i11 = j0Var.f51838q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j0Var.f51838q = i11 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(continuation);
            }
        } else {
            j0Var = new j0(continuation);
        }
        j0 j0Var2 = j0Var;
        Object obj = j0Var2.f51836o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = j0Var2.f51838q;
        if (i12 == 0) {
            jn0.t.b(obj);
            w30.l lVarB = w30.l.b.b(this.apiRequestFactory, INSTANCE.p("card-metadata"), w30.l.Options.b(options, null, null, null, 5, null), p013kotlin.collections.v0.m(jn0.x.a(Action.KEY_ATTRIBUTE, options.getApiKey()), jn0.x.a("bin_prefix", aVar.getValue())), false, 8, null);
            x60.f fVar = new x60.f(aVar);
            j0Var2.f51835n = this;
            j0Var2.f51838q = 1;
            objX = X(this, lVarB, fVar, null, j0Var2, 4, null);
            if (objX == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar3 = (a) j0Var2.f51835n;
            jn0.t.b(obj);
            objX = ((jn0.s) obj).getValue();
            aVar2 = aVar3;
        }
        if (jn0.s.e(objX) != null) {
            aVar2.Y(PaymentAnalyticsEvent.CardMetadataLoadFailure);
        }
        return objX;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // z60.g
    public Object w(String str, String str2, String str3, w30.l.Options options, List<String> list, Continuation<? super jn0.s<SetupIntent>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f51805p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f51805p = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f51803n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f51805p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        w30.l.b bVar = this.apiRequestFactory;
        Companion companion = INSTANCE;
        w30.l lVarD = w30.l.b.d(bVar, companion.i(str2, str3), options, p013kotlin.collections.v0.r(p013kotlin.collections.v0.f(jn0.x.a("client_secret", str)), companion.e(list)), false, 8, null);
        x60.x xVar = new x60.x();
        g gVar = g.f51812c;
        fVar.f51805p = 1;
        Object objW = W(lVarD, xVar, gVar, fVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    @Override // z60.g
    public String x(Set<String> attribution) {
        p013kotlin.jvm.internal.s.k(attribution, "attribution");
        return p013kotlin.collections.v.y0(p013kotlin.collections.d1.n(p013kotlin.collections.d1.n(p013kotlin.collections.d1.c("stripe-android/20.52.3"), this.productUsageTokens), attribution), ";", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // z60.g
    public Object y(String str, Set<String> set, String str2, w30.l.Options options, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        h hVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f51820p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f51820p = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object obj = hVar.f51818n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f51820p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        a0();
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.j(str2), options, p013kotlin.collections.v0.f(jn0.x.a("customer", str)), false, 8, null);
        x60.v vVar = new x60.v();
        i iVar = new i(set);
        hVar.f51820p = 1;
        Object objW = W(lVarD, vVar, iVar, hVar);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // z60.g
    public Object z(String str, w30.l.Options options, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        r0 r0Var;
        Object objB;
        if (continuation instanceof r0) {
            r0Var = (r0) continuation;
            int i11 = r0Var.f51905p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r0Var.f51905p = i11 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(continuation);
            }
        } else {
            r0Var = new r0(continuation);
        }
        r0 r0Var2 = r0Var;
        Object obj = r0Var2.f51903n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = r0Var2.f51905p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(thE));
        }
        a0();
        w30.l lVarD = w30.l.b.d(this.apiRequestFactory, INSTANCE.v((String) objB), options, U(str, p013kotlin.collections.v.m()), false, 8, null);
        x60.u uVar = new x60.u();
        s0 s0Var = new s0();
        r0Var2.f51905p = 1;
        Object objW = W(lVarD, uVar, s0Var, r0Var2);
        return objW == coroutine_suspended ? coroutine_suspended : objW;
    }

    public /* synthetic */ a(Context context, wn0.a aVar, AppInfo appInfo, o30.d dVar, CoroutineContext coroutineContext, Set set, w30.j0 j0Var, w30.c cVar, r30.g gVar, b.a aVar2, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, r30.f fVar, Set set2, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        wn0.a aVar3;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        String strB;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory3;
        o30.d dVar2;
        String str3;
        AppInfo appInfoB = (i11 & 4) != 0 ? f30.h0.INSTANCE.b() : appInfo;
        o30.d dVarB = (i11 & 8) != 0 ? o30.d.INSTANCE.b() : dVar;
        CoroutineContext io2 = (i11 & 16) != 0 ? Dispatchers.getIO() : coroutineContext;
        Set setD = (i11 & 32) != 0 ? p013kotlin.collections.d1.d() : set;
        o30.d dVar3 = dVarB;
        w30.j0 rVar = (i11 & 64) != 0 ? new w30.r(io2, null, null, 0, dVar3, 14, null) : j0Var;
        w30.c oVar = (i11 & 128) != 0 ? new w30.o(dVar3, io2) : cVar;
        r30.g gVarB = (i11 & 256) != 0 ? f30.u.b(context, io2) : gVar;
        b.a jVar = (i11 & 512) != 0 ? new h30.j(context, oVar) : aVar2;
        if ((i11 & 1024) != 0) {
            aVar3 = aVar;
            paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(context, (wn0.a<String>) aVar3, (Set<String>) setD);
        } else {
            aVar3 = aVar;
            paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
        }
        r30.f fVar2 = (i11 & 2048) != 0 ? new r30.f() : fVar;
        Set setD2 = (i11 & 4096) != 0 ? p013kotlin.collections.d1.d() : set2;
        if ((i11 & PKIFailureInfo.certRevoked) != 0) {
            Set set3 = setD2;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(set3, 10));
            Iterator it = set3.iterator();
            while (it.hasNext()) {
                arrayList.add(((f30.i0) it.next()).getCode());
            }
            strB = new ApiVersion(p013kotlin.collections.v.r1(arrayList)).b();
        } else {
            strB = str;
        }
        if ((i11 & 16384) != 0) {
            paymentAnalyticsRequestFactory3 = paymentAnalyticsRequestFactory2;
            dVar2 = dVar3;
            str3 = "AndroidBindings/20.52.3";
        } else {
            paymentAnalyticsRequestFactory3 = paymentAnalyticsRequestFactory2;
            dVar2 = dVar3;
            str3 = str2;
        }
        this(context, aVar3, appInfoB, dVar2, io2, setD, rVar, oVar, gVarB, jVar, paymentAnalyticsRequestFactory3, fVar2, setD2, strB, str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context appContext, wn0.a<String> publishableKeyProvider, CoroutineContext workContext, Set<String> productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, w30.c analyticsRequestExecutor, o30.d logger) {
        this(appContext, publishableKeyProvider, null, logger, workContext, productUsageTokens, null, analyticsRequestExecutor, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 31556, null);
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(productUsageTokens, "productUsageTokens");
        p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        p013kotlin.jvm.internal.s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        p013kotlin.jvm.internal.s.k(logger, "logger");
    }
}
