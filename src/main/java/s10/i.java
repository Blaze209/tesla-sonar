package s10;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Address;
import com.stripe.android.model.BankAccount;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.Card;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.GooglePayResult;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.r0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Gender;
import f30.l;
import f30.m;
import j40.FinancialConnectionsEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.x;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u0019\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020\u00002\u0006\u0010#\u001a\u00020,H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0019\u00100\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b0\u00101\u001a\u0019\u00103\u001a\u0002022\b\u0010#\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b3\u00104\u001a\u0019\u00106\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b6\u00107\u001a\u001b\u0010:\u001a\u0004\u0018\u00010\u00022\b\u00109\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010=\u001a\u00020<2\b\u0010#\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b=\u0010>\u001a\u0019\u0010?\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0019\u0010B\u001a\u00020A2\b\u0010#\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\bB\u0010C\u001a\u0019\u0010D\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010AH\u0000¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010H\u001a\u0004\u0018\u00010\u00022\b\u0010G\u001a\u0004\u0018\u00010FH\u0000¢\u0006\u0004\bH\u0010I\u001a\u0017\u0010K\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020JH\u0000¢\u0006\u0004\bK\u0010L\u001a\u0017\u0010O\u001a\u00020\u00022\u0006\u0010N\u001a\u00020MH\u0000¢\u0006\u0004\bO\u0010P\u001a\u0017\u0010S\u001a\u00020\u00022\u0006\u0010R\u001a\u00020QH\u0000¢\u0006\u0004\bS\u0010T\u001a\u0017\u0010V\u001a\u00020\u00002\u0006\u0010#\u001a\u00020UH\u0001¢\u0006\u0004\bV\u0010W\u001a%\u0010[\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0001¢\u0006\u0004\b[\u0010\\\u001a\u001b\u0010_\u001a\u0004\u0018\u00010\u00002\b\u0010^\u001a\u0004\u0018\u00010]H\u0000¢\u0006\u0004\b_\u0010`\u001a\u001b\u0010b\u001a\u0004\u0018\u00010\u00002\b\u0010^\u001a\u0004\u0018\u00010aH\u0000¢\u0006\u0004\bb\u0010c\u001a-\u0010g\u001a\u0004\u0018\u00010\u00002\b\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\bg\u0010h\u001a#\u0010l\u001a\u00020j2\b\u0010i\u001a\u0004\u0018\u00010d2\b\u0010k\u001a\u0004\u0018\u00010jH\u0000¢\u0006\u0004\bl\u0010m\u001a%\u0010o\u001a\u0004\u0018\u00010(2\b\u0010n\u001a\u0004\u0018\u00010d2\b\u0010k\u001a\u0004\u0018\u00010jH\u0000¢\u0006\u0004\bo\u0010p\u001a'\u0010s\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010r2\b\u0010q\u001a\u0004\u0018\u00010dH\u0000¢\u0006\u0004\bs\u0010t\u001a\u001b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010u\u001a\u0004\u0018\u00010dH\u0000¢\u0006\u0004\bw\u0010x\u001a#\u0010y\u001a\u0004\u0018\u00010\u00002\b\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\by\u0010z\u001a!\u0010|\u001a\u0004\u0018\u00010{2\b\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b|\u0010}\u001a!\u0010~\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b~\u0010\u007f\u001a\"\u0010\u0080\u0001\u001a\u00020\u00062\b\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u001c\u0010\u0084\u0001\u001a\u00020\u00002\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u001a\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0086\u0001\u001a\u00020d¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u001c\u0010\u008c\u0001\u001a\u00020\u00022\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u001d\u0010\u008f\u0001\u001a\u00020\u00002\t\u0010#\u001a\u0005\u0018\u00010\u008e\u0001H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u001d\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010#\u001a\u0004\u0018\u00010\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u001c\u0010\u0096\u0001\u001a\u00030\u0095\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010d¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u001c\u0010\u009a\u0001\u001a\u00020\u00022\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a8\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0\u009f\u00012\u001d\u0010\u009e\u0001\u001a\u0018\u0012\u0004\u0012\u00020{\u0018\u00010\u009c\u0001j\u000b\u0012\u0004\u0012\u00020{\u0018\u0001`\u009d\u0001H\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001\u001a\u001c\u0010¤\u0001\u001a\u00020\u00022\b\u0010£\u0001\u001a\u00030¢\u0001H\u0000¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001a!\u0010¨\u0001\u001a\u00030§\u0001*\f\u0012\u0007\u0012\u0005\u0018\u00010¦\u00010\u009f\u0001H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001a%\u0010ª\u0001\u001a\u00020d*\u0011\u0012\u0004\u0012\u00020\u0000\u0012\u0007\u0012\u0005\u0018\u00010¦\u00010rH\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001¨\u0006¬\u0001"}, d2 = {"", Action.KEY_ATTRIBUTE, "Lcom/facebook/react/bridge/WritableMap;", "value", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;", "", "canAddCard", PermissionsResponse.STATUS_KEY, "token", "Lcom/facebook/react/bridge/WritableNativeMap;", "b", "(ZLjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableNativeMap;", "Lcom/stripe/android/model/StripeIntent$Status;", "E", "(Lcom/stripe/android/model/StripeIntent$Status;)Ljava/lang/String;", "Lcom/stripe/android/model/u0$b;", "captureMethod", "k", "(Lcom/stripe/android/model/u0$b;)Ljava/lang/String;", "Lcom/stripe/android/model/u0$e;", "m", "(Lcom/stripe/android/model/u0$e;)Ljava/lang/String;", "urlScheme", "P", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/model/u0$h;", "shipping", "D", "(Lcom/stripe/android/model/u0$h;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/h;", "brand", "l", "(Lcom/stripe/android/model/h;)Ljava/lang/String;", "Lcom/stripe/android/model/v0$p;", "type", "G", "(Lcom/stripe/android/model/v0$p;)Ljava/lang/String;", Gender.NONE, "(Ljava/lang/String;)Lcom/stripe/android/model/v0$p;", "Lcom/stripe/android/model/v0$e;", "billingDatails", "q", "(Lcom/stripe/android/model/v0$e;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/p1$c;", Gender.UNKNOWN, "(Lcom/stripe/android/model/p1$c;)Ljava/lang/String;", "Lcom/stripe/android/model/BankAccount$Type;", "p", "(Lcom/stripe/android/model/BankAccount$Type;)Ljava/lang/String;", "Lcom/stripe/android/model/d$c;", "J", "(Ljava/lang/String;)Lcom/stripe/android/model/d$c;", "Lcom/stripe/android/model/BankAccount$Status;", "o", "(Lcom/stripe/android/model/BankAccount$Status;)Ljava/lang/String;", "Lcom/stripe/android/model/BankAccount;", "bankAccount", "n", "(Lcom/stripe/android/model/BankAccount;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/v0$r$b;", "S", "(Ljava/lang/String;)Lcom/stripe/android/model/v0$r$b;", "B", "(Lcom/stripe/android/model/v0$r$b;)Ljava/lang/String;", "Lcom/stripe/android/model/v0$r$c;", "T", "(Ljava/lang/String;)Lcom/stripe/android/model/v0$r$c;", "C", "(Lcom/stripe/android/model/v0$r$c;)Ljava/lang/String;", "Lcom/stripe/android/model/g;", "card", "r", "(Lcom/stripe/android/model/g;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/p1;", "A", "(Lcom/stripe/android/model/p1;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/v0;", "paymentMethod", "w", "(Lcom/stripe/android/model/v0;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/u0;", "paymentIntent", "v", "(Lcom/stripe/android/model/u0;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/r0;", "t", "(Lcom/stripe/android/model/r0;)Ljava/lang/String;", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "Lcom/stripe/android/model/StripeIntent$a;", "data", Gender.FEMALE, "(Lcom/stripe/android/model/StripeIntent$NextActionType;Lcom/stripe/android/model/StripeIntent$a;)Lcom/facebook/react/bridge/WritableNativeMap;", "Lcom/stripe/android/model/u0$g$c;", "errorType", "u", "(Lcom/stripe/android/model/u0$g$c;)Ljava/lang/String;", "Lcom/stripe/android/model/d1$e$c;", "x", "(Lcom/stripe/android/model/d1$e$c;)Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "map", "default", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "addressMap", "Lcom/stripe/android/model/b;", "cardAddress", "I", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/stripe/android/model/b;)Lcom/stripe/android/model/b;", "billingDetails", "K", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/stripe/android/model/b;)Lcom/stripe/android/model/v0$e;", OrcaKeys.METADATA, "", "L", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;", "shippingDetails", "Lcom/stripe/android/model/l$d;", "Q", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/model/l$d;", "h", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/String;", "", "f", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;", "g", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;", "e", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z", "", "timestamp", "a", "(J)Ljava/lang/String;", "params", "Lf30/l$g;", "R", "(Lcom/facebook/react/bridge/ReadableMap;)Lf30/l$g;", "Lcom/stripe/android/model/d1;", "setupIntent", "y", "(Lcom/stripe/android/model/d1;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/StripeIntent$Usage;", "H", "(Lcom/stripe/android/model/StripeIntent$Usage;)Ljava/lang/String;", "Lcom/stripe/android/model/l$c;", Gender.MALE, "(Ljava/lang/String;)Lcom/stripe/android/model/l$c;", "readableMap", "Landroid/os/Bundle;", "V", "(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;", "Lcom/stripe/android/model/m0;", "googlePayResult", "z", "(Lcom/stripe/android/model/m0;)Lcom/facebook/react/bridge/WritableMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "networksAsInts", "", Gender.OTHER, "(Ljava/util/ArrayList;)Ljava/util/List;", "Lj40/i;", "event", "s", "(Lj40/i;)Lcom/facebook/react/bridge/WritableMap;", "", "Lcom/facebook/react/bridge/WritableArray;", "X", "(Ljava/util/List;)Lcom/facebook/react/bridge/WritableArray;", "W", "(Ljava/util/Map;)Lcom/facebook/react/bridge/ReadableMap;", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f109672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f109673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f109674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f109675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f109676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f109677g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f109678h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f109679i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f109680j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f109681k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int[] f109682l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int[] f109683m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int[] f109684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ int[] f109685o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ int[] f109686p;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.Status.Canceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.Status.Processing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f109671a = iArr;
            int[] iArr2 = new int[PaymentIntent.b.values().length];
            try {
                iArr2[PaymentIntent.b.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PaymentIntent.b.Manual.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f109672b = iArr2;
            int[] iArr3 = new int[PaymentIntent.e.values().length];
            try {
                iArr3[PaymentIntent.e.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PaymentIntent.e.Manual.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f109673c = iArr3;
            int[] iArr4 = new int[com.stripe.android.model.h.values().length];
            try {
                iArr4[com.stripe.android.model.h.AmericanExpress.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[com.stripe.android.model.h.DinersClub.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[com.stripe.android.model.h.Discover.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.stripe.android.model.h.JCB.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.stripe.android.model.h.MasterCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.stripe.android.model.h.UnionPay.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[com.stripe.android.model.h.Visa.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[com.stripe.android.model.h.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            f109674d = iArr4;
            int[] iArr5 = new int[PaymentMethod.p.values().length];
            try {
                iArr5[PaymentMethod.p.AfterpayClearpay.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[PaymentMethod.p.Alipay.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[PaymentMethod.p.AuBecsDebit.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[PaymentMethod.p.BacsDebit.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[PaymentMethod.p.Bancontact.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[PaymentMethod.p.Card.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[PaymentMethod.p.CardPresent.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[PaymentMethod.p.Eps.ordinal()] = 8;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[PaymentMethod.p.Fpx.ordinal()] = 9;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[PaymentMethod.p.Giropay.ordinal()] = 10;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[PaymentMethod.p.GrabPay.ordinal()] = 11;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[PaymentMethod.p.Ideal.ordinal()] = 12;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[PaymentMethod.p.Netbanking.ordinal()] = 13;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[PaymentMethod.p.Oxxo.ordinal()] = 14;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[PaymentMethod.p.P24.ordinal()] = 15;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[PaymentMethod.p.SepaDebit.ordinal()] = 16;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[PaymentMethod.p.Sofort.ordinal()] = 17;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[PaymentMethod.p.Upi.ordinal()] = 18;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[PaymentMethod.p.WeChatPay.ordinal()] = 19;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[PaymentMethod.p.Klarna.ordinal()] = 20;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[PaymentMethod.p.USBankAccount.ordinal()] = 21;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[PaymentMethod.p.PayPal.ordinal()] = 22;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[PaymentMethod.p.Affirm.ordinal()] = 23;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[PaymentMethod.p.CashAppPay.ordinal()] = 24;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[PaymentMethod.p.RevolutPay.ordinal()] = 25;
            } catch (NoSuchFieldError unused44) {
            }
            f109675e = iArr5;
            int[] iArr6 = new int[Token.c.values().length];
            try {
                iArr6[Token.c.Account.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[Token.c.BankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[Token.c.Card.ordinal()] = 3;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[Token.c.CvcUpdate.ordinal()] = 4;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[Token.c.Person.ordinal()] = 5;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[Token.c.Pii.ordinal()] = 6;
            } catch (NoSuchFieldError unused50) {
            }
            f109676f = iArr6;
            int[] iArr7 = new int[BankAccount.Type.values().length];
            try {
                iArr7[BankAccount.Type.Company.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[BankAccount.Type.Individual.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            f109677g = iArr7;
            int[] iArr8 = new int[BankAccount.Status.values().length];
            try {
                iArr8[BankAccount.Status.Errored.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr8[BankAccount.Status.New.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr8[BankAccount.Status.Validated.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr8[BankAccount.Status.VerificationFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr8[BankAccount.Status.Verified.ordinal()] = 5;
            } catch (NoSuchFieldError unused57) {
            }
            f109678h = iArr8;
            int[] iArr9 = new int[PaymentMethod.USBankAccount.b.values().length];
            try {
                iArr9[PaymentMethod.USBankAccount.b.COMPANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr9[PaymentMethod.USBankAccount.b.INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            f109679i = iArr9;
            int[] iArr10 = new int[PaymentMethod.USBankAccount.c.values().length];
            try {
                iArr10[PaymentMethod.USBankAccount.c.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr10[PaymentMethod.USBankAccount.c.SAVINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            f109680j = iArr10;
            int[] iArr11 = new int[r0.values().length];
            try {
                iArr11[r0.AMOUNTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr11[r0.DESCRIPTOR_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused63) {
            }
            f109681k = iArr11;
            int[] iArr12 = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr12[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr12[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 2;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr12[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 3;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr12[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 4;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr12[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 5;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr12[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 6;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr12[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 7;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr12[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 8;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr12[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 9;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr12[StripeIntent.NextActionType.DisplayBoletoDetails.ordinal()] = 10;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr12[StripeIntent.NextActionType.DisplayKonbiniDetails.ordinal()] = 11;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr12[StripeIntent.NextActionType.SwishRedirect.ordinal()] = 12;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr12[StripeIntent.NextActionType.DisplayMultibancoDetails.ordinal()] = 13;
            } catch (NoSuchFieldError unused76) {
            }
            f109682l = iArr12;
            int[] iArr13 = new int[PaymentIntent.Error.c.values().length];
            try {
                iArr13[PaymentIntent.Error.c.ApiConnectionError.ordinal()] = 1;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr13[PaymentIntent.Error.c.AuthenticationError.ordinal()] = 2;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr13[PaymentIntent.Error.c.ApiError.ordinal()] = 3;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr13[PaymentIntent.Error.c.CardError.ordinal()] = 4;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr13[PaymentIntent.Error.c.IdempotencyError.ordinal()] = 5;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr13[PaymentIntent.Error.c.InvalidRequestError.ordinal()] = 6;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr13[PaymentIntent.Error.c.RateLimitError.ordinal()] = 7;
            } catch (NoSuchFieldError unused83) {
            }
            f109683m = iArr13;
            int[] iArr14 = new int[SetupIntent.Error.c.values().length];
            try {
                iArr14[SetupIntent.Error.c.ApiConnectionError.ordinal()] = 1;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr14[SetupIntent.Error.c.AuthenticationError.ordinal()] = 2;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr14[SetupIntent.Error.c.ApiError.ordinal()] = 3;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr14[SetupIntent.Error.c.CardError.ordinal()] = 4;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr14[SetupIntent.Error.c.IdempotencyError.ordinal()] = 5;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr14[SetupIntent.Error.c.InvalidRequestError.ordinal()] = 6;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr14[SetupIntent.Error.c.RateLimitError.ordinal()] = 7;
            } catch (NoSuchFieldError unused90) {
            }
            f109684n = iArr14;
            int[] iArr15 = new int[StripeIntent.Usage.values().length];
            try {
                iArr15[StripeIntent.Usage.OffSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr15[StripeIntent.Usage.OnSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr15[StripeIntent.Usage.OneTime.ordinal()] = 3;
            } catch (NoSuchFieldError unused93) {
            }
            f109685o = iArr15;
            int[] iArr16 = new int[ReadableType.values().length];
            try {
                iArr16[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr16[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr16[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr16[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr16[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr16[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused99) {
            }
            f109686p = iArr16;
        }
    }

    public static final WritableMap A(Token token) {
        s.k(token, "token");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", token.getId());
        writableNativeMap.putString("created", String.valueOf(token.getCreated().getTime()));
        writableNativeMap.putString("type", U(token.getType()));
        writableNativeMap.putBoolean("livemode", token.getLivemode());
        writableNativeMap.putMap("bankAccount", n(token.getBankAccount()));
        writableNativeMap.putMap("card", r(token.getCard()));
        writableNativeMap.putBoolean("used", token.getUsed());
        return writableNativeMap;
    }

    public static final String B(PaymentMethod.USBankAccount.b bVar) {
        int i11 = bVar == null ? -1 : a.f109679i[bVar.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "Unknown" : "Individual";
        }
        return "Company";
    }

    public static final String C(PaymentMethod.USBankAccount.c cVar) {
        int i11 = cVar == null ? -1 : a.f109680j[cVar.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "Unknown" : "Savings";
        }
        return "Checking";
    }

    public static final WritableMap D(PaymentIntent.Shipping shipping) {
        s.k(shipping, "shipping");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("city", shipping.getAddress().getCity());
        writableNativeMap2.putString(PlaceTypes.COUNTRY, shipping.getAddress().getCountry());
        writableNativeMap2.putString("line1", shipping.getAddress().getLine1());
        writableNativeMap2.putString("line2", shipping.getAddress().getLine2());
        writableNativeMap2.putString("postalCode", shipping.getAddress().getPostalCode());
        writableNativeMap2.putString("state", shipping.getAddress().getState());
        writableNativeMap.putMap(PlaceTypes.ADDRESS, writableNativeMap2);
        writableNativeMap.putString("name", shipping.getName());
        writableNativeMap.putString("carrier", shipping.getCarrier());
        writableNativeMap.putString("phone", shipping.getPhone());
        writableNativeMap.putString("trackingNumber", shipping.getTrackingNumber());
        return writableNativeMap;
    }

    public static final String E(StripeIntent.Status status) {
        switch (status == null ? -1 : a.f109671a[status.ordinal()]) {
            case 1:
                return "Succeeded";
            case 2:
                return "RequiresPaymentMethod";
            case 3:
                return "RequiresConfirmation";
            case 4:
                return "Canceled";
            case 5:
                return "Processing";
            case 6:
                return "RequiresAction";
            case 7:
                return "RequiresCapture";
            default:
                return "Unknown";
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static final WritableNativeMap F(StripeIntent.NextActionType nextActionType, StripeIntent.a aVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        switch (nextActionType == null ? -1 : a.f109682l[nextActionType.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                StripeIntent.a.RedirectToUrl redirectToUrl = aVar instanceof StripeIntent.a.RedirectToUrl ? (StripeIntent.a.RedirectToUrl) aVar : null;
                if (redirectToUrl != null) {
                    writableNativeMap.putString("type", "urlRedirect");
                    writableNativeMap.putString("redirectUrl", redirectToUrl.getUrl().toString());
                }
                return writableNativeMap;
            case 2:
                StripeIntent.a.VerifyWithMicrodeposits verifyWithMicrodeposits = aVar instanceof StripeIntent.a.VerifyWithMicrodeposits ? (StripeIntent.a.VerifyWithMicrodeposits) aVar : null;
                if (verifyWithMicrodeposits != null) {
                    writableNativeMap.putString("type", "verifyWithMicrodeposits");
                    writableNativeMap.putString("arrivalDate", String.valueOf(verifyWithMicrodeposits.getArrivalDate()));
                    writableNativeMap.putString("redirectUrl", verifyWithMicrodeposits.getHostedVerificationUrl());
                    writableNativeMap.putString("microdepositType", t(verifyWithMicrodeposits.getMicrodepositType()));
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 3:
                StripeIntent.a.DisplayOxxoDetails displayOxxoDetails = aVar instanceof StripeIntent.a.DisplayOxxoDetails ? (StripeIntent.a.DisplayOxxoDetails) aVar : null;
                if (displayOxxoDetails != null) {
                    writableNativeMap.putString("type", "oxxoVoucher");
                    writableNativeMap.putInt("expiration", displayOxxoDetails.getExpiresAfter());
                    writableNativeMap.putString("voucherURL", displayOxxoDetails.getHostedVoucherUrl());
                    writableNativeMap.putString("voucherNumber", displayOxxoDetails.getNumber());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 4:
                StripeIntent.a.WeChatPayRedirect weChatPayRedirect = aVar instanceof StripeIntent.a.WeChatPayRedirect ? (StripeIntent.a.WeChatPayRedirect) aVar : null;
                if (weChatPayRedirect != null) {
                    writableNativeMap.putString("type", "weChatRedirect");
                    writableNativeMap.putString("redirectUrl", weChatPayRedirect.getWeChat().getQrCodeUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 5:
                return null;
            case 10:
                StripeIntent.a.DisplayBoletoDetails displayBoletoDetails = aVar instanceof StripeIntent.a.DisplayBoletoDetails ? (StripeIntent.a.DisplayBoletoDetails) aVar : null;
                if (displayBoletoDetails != null) {
                    writableNativeMap.putString("type", "boletoVoucher");
                    writableNativeMap.putString("voucherURL", displayBoletoDetails.getHostedVoucherUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 11:
                StripeIntent.a.DisplayKonbiniDetails displayKonbiniDetails = aVar instanceof StripeIntent.a.DisplayKonbiniDetails ? (StripeIntent.a.DisplayKonbiniDetails) aVar : null;
                if (displayKonbiniDetails != null) {
                    writableNativeMap.putString("type", "konbiniVoucher");
                    writableNativeMap.putString("voucherURL", displayKonbiniDetails.getHostedVoucherUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 12:
                StripeIntent.a.SwishRedirect swishRedirect = aVar instanceof StripeIntent.a.SwishRedirect ? (StripeIntent.a.SwishRedirect) aVar : null;
                if (swishRedirect != null) {
                    writableNativeMap.putString("type", "swishRedirect");
                    writableNativeMap.putString("mobileAuthUrl", swishRedirect.getMobileAuthUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 13:
                StripeIntent.a.DisplayMultibancoDetails displayMultibancoDetails = aVar instanceof StripeIntent.a.DisplayMultibancoDetails ? (StripeIntent.a.DisplayMultibancoDetails) aVar : null;
                if (displayMultibancoDetails != null) {
                    writableNativeMap.putString("type", "multibanco");
                    writableNativeMap.putString("voucherURL", displayMultibancoDetails.getHostedVoucherUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
        }
    }

    public static final String G(PaymentMethod.p pVar) {
        switch (pVar == null ? -1 : a.f109675e[pVar.ordinal()]) {
            case 1:
                return "AfterpayClearpay";
            case 2:
                return "Alipay";
            case 3:
                return "AuBecsDebit";
            case 4:
                return "BacsDebit";
            case 5:
                return "Bancontact";
            case 6:
                return "Card";
            case 7:
                return "CardPresent";
            case 8:
                return "Eps";
            case 9:
                return "Fpx";
            case 10:
                return "Giropay";
            case 11:
                return "GrabPay";
            case 12:
                return "Ideal";
            case 13:
                return "Netbanking";
            case 14:
                return "Oxxo";
            case 15:
                return "P24";
            case 16:
                return "SepaDebit";
            case 17:
                return "Sofort";
            case 18:
                return "Upi";
            case 19:
                return "WeChatPay";
            case 20:
                return "Klarna";
            case 21:
                return "USBankAccount";
            case 22:
                return "PayPal";
            case 23:
                return "Affirm";
            case 24:
                return "CashApp";
            case 25:
                return "RevolutPay";
            default:
                return "Unknown";
        }
    }

    public static final String H(StripeIntent.Usage usage) {
        int i11 = usage == null ? -1 : a.f109685o[usage.ordinal()];
        if (i11 == 1) {
            return "OffSession";
        }
        if (i11 != 2) {
            return i11 != 3 ? "Unknown" : "OneTime";
        }
        return "OnSession";
    }

    public static final Address I(ReadableMap readableMap, Address address) {
        Address.a aVar = new Address.a();
        if (readableMap != null) {
            aVar.g(j(readableMap, "postalCode", null, 4, null)).b(j(readableMap, "city", null, 4, null)).c(j(readableMap, PlaceTypes.COUNTRY, null, 4, null)).e(j(readableMap, "line1", null, 4, null)).f(j(readableMap, "line2", null, 4, null)).h(j(readableMap, "state", null, 4, null));
        }
        if (address != null) {
            String postalCode = address.getPostalCode();
            if (postalCode != null && postalCode.length() != 0) {
                aVar.g(address.getPostalCode());
            }
            String country = address.getCountry();
            if (country != null && country.length() != 0) {
                aVar.c(address.getCountry());
            }
        }
        return aVar.a();
    }

    public static final BankAccountTokenParams.c J(String str) {
        if (s.f(str, "Company")) {
            return BankAccountTokenParams.c.Company;
        }
        return s.f(str, "Individual") ? BankAccountTokenParams.c.Individual : BankAccountTokenParams.c.Individual;
    }

    public static final PaymentMethod.BillingDetails K(ReadableMap readableMap, Address address) {
        if (readableMap == null && address == null) {
            return null;
        }
        Address addressI = I(g(readableMap, PlaceTypes.ADDRESS), address);
        PaymentMethod.BillingDetails.a aVar = new PaymentMethod.BillingDetails.a();
        if (readableMap != null) {
            aVar.d(j(readableMap, "name", null, 4, null)).e(j(readableMap, "phone", null, 4, null)).c(j(readableMap, Scopes.EMAIL, null, 4, null));
        }
        aVar.b(addressI);
        return aVar.a();
    }

    public static final Map<String, String> L(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (readableMap == null || (hashMap = readableMap.toHashMap()) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(hashMap.size()));
        Iterator<T> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final ConfirmPaymentIntentParams.c M(String str) {
        if (s.f(str, "OffSession")) {
            return ConfirmPaymentIntentParams.c.OffSession;
        }
        if (s.f(str, "OnSession")) {
            return ConfirmPaymentIntentParams.c.OnSession;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final PaymentMethod.p N(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2075365938:
                if (str.equals("CashApp")) {
                    return PaymentMethod.p.CashAppPay;
                }
                return null;
            case -2045037915:
                if (str.equals("Klarna")) {
                    return PaymentMethod.p.Klarna;
                }
                return null;
            case -1911368973:
                if (str.equals("PayPal")) {
                    return PaymentMethod.p.PayPal;
                }
                return null;
            case -1813087929:
                if (str.equals("Sofort")) {
                    return PaymentMethod.p.Sofort;
                }
                return null;
            case -752190179:
                if (str.equals("BacsDebit")) {
                    return PaymentMethod.p.BacsDebit;
                }
                return null;
            case -600549687:
                if (str.equals("SepaDebit")) {
                    return PaymentMethod.p.SepaDebit;
                }
                return null;
            case -529183021:
                if (str.equals("USBankAccount")) {
                    return PaymentMethod.p.USBankAccount;
                }
                return null;
            case -430881083:
                if (str.equals("AuBecsDebit")) {
                    return PaymentMethod.p.AuBecsDebit;
                }
                return null;
            case -346968055:
                if (str.equals("Netbanking")) {
                    return PaymentMethod.p.Netbanking;
                }
                return null;
            case -302881593:
                if (str.equals("AfterpayClearpay")) {
                    return PaymentMethod.p.AfterpayClearpay;
                }
                return null;
            case -295777438:
                if (str.equals("WeChatPay")) {
                    return PaymentMethod.p.WeChatPay;
                }
                return null;
            case 69896:
                if (str.equals("Eps")) {
                    return PaymentMethod.p.Eps;
                }
                return null;
            case 70862:
                if (str.equals("Fpx")) {
                    return PaymentMethod.p.Fpx;
                }
                return null;
            case 78482:
                if (str.equals("P24")) {
                    return PaymentMethod.p.P24;
                }
                return null;
            case 85262:
                if (str.equals("Upi")) {
                    return PaymentMethod.p.Upi;
                }
                return null;
            case 2092848:
                if (str.equals("Card")) {
                    return PaymentMethod.p.Card;
                }
                return null;
            case 2472640:
                if (str.equals("Oxxo")) {
                    return PaymentMethod.p.Oxxo;
                }
                return null;
            case 70496309:
                if (str.equals("Ideal")) {
                    return PaymentMethod.p.Ideal;
                }
                return null;
            case 72721745:
                if (str.equals("Bancontact")) {
                    return PaymentMethod.p.Bancontact;
                }
                return null;
            case 1326873577:
                if (str.equals("RevolutPay")) {
                    return PaymentMethod.p.RevolutPay;
                }
                return null;
            case 1703011721:
                if (str.equals("Giropay")) {
                    return PaymentMethod.p.Giropay;
                }
                return null;
            case 1918741355:
                if (str.equals("CardPresent")) {
                    return PaymentMethod.p.CardPresent;
                }
                return null;
            case 1944556188:
                if (str.equals("GrabPay")) {
                    return PaymentMethod.p.GrabPay;
                }
                return null;
            case 1958237187:
                if (str.equals("Affirm")) {
                    return PaymentMethod.p.Affirm;
                }
                return null;
            case 1963873898:
                if (str.equals("Alipay")) {
                    return PaymentMethod.p.Alipay;
                }
                return null;
            default:
                return null;
        }
    }

    public static final List<com.stripe.android.model.h> O(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return v.m();
        }
        Map mapM = v0.m(x.a(0, com.stripe.android.model.h.JCB), x.a(1, com.stripe.android.model.h.AmericanExpress), x.a(2, com.stripe.android.model.h.CartesBancaires), x.a(3, com.stripe.android.model.h.DinersClub), x.a(4, com.stripe.android.model.h.Discover), x.a(5, com.stripe.android.model.h.MasterCard), x.a(6, com.stripe.android.model.h.UnionPay), x.a(7, com.stripe.android.model.h.Visa), x.a(8, com.stripe.android.model.h.Unknown));
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            com.stripe.android.model.h hVar = (com.stripe.android.model.h) mapM.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (hVar != null) {
                arrayList2.add(hVar);
            }
        }
        return arrayList2;
    }

    public static final String P(String str) {
        if (str == null) {
            return null;
        }
        return str + "://safepay";
    }

    public static final ConfirmPaymentIntentParams.Shipping Q(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        Address addressI = I(g(readableMap, PlaceTypes.ADDRESS), null);
        String strJ = j(readableMap, "name", null, 4, null);
        if (strJ == null) {
            strJ = "";
        }
        return new ConfirmPaymentIntentParams.Shipping(addressI, strJ, null, null, null, 28, null);
    }

    public static final l.Stripe3ds2UiCustomization R(ReadableMap params) {
        s.k(params, "params");
        ReadableMap readableMapG = g(params, AnnotatedPrivateKey.LABEL);
        ReadableMap map = params.getMap("navigationBar");
        ReadableMap readableMapG2 = g(params, "textField");
        ReadableMap readableMapG3 = g(params, "submitButton");
        ReadableMap readableMapG4 = g(params, "cancelButton");
        ReadableMap readableMapG5 = g(params, "nextButton");
        ReadableMap readableMapG6 = g(params, "continueButton");
        ReadableMap readableMapG7 = g(params, "resendButton");
        l.Stripe3ds2LabelCustomization.a aVar = new l.Stripe3ds2LabelCustomization.a();
        l.Stripe3ds2ToolbarCustomization.a aVar2 = new l.Stripe3ds2ToolbarCustomization.a();
        m mVar = new m();
        l.Stripe3ds2ButtonCustomization.a aVar3 = new l.Stripe3ds2ButtonCustomization.a();
        l.Stripe3ds2ButtonCustomization.a aVar4 = new l.Stripe3ds2ButtonCustomization.a();
        l.Stripe3ds2ButtonCustomization.a aVar5 = new l.Stripe3ds2ButtonCustomization.a();
        l.Stripe3ds2ButtonCustomization.a aVar6 = new l.Stripe3ds2ButtonCustomization.a();
        l.Stripe3ds2ButtonCustomization.a aVar7 = new l.Stripe3ds2ButtonCustomization.a();
        String strH = h(readableMapG, "headingTextColor");
        if (strH != null) {
            aVar.b(strH);
        }
        String strH2 = h(readableMapG, "textColor");
        if (strH2 != null) {
            aVar.d(strH2);
        }
        Integer numF = f(readableMapG, "headingFontSize");
        if (numF != null) {
            aVar.c(numF.intValue());
        }
        Integer numF2 = f(readableMapG, "textFontSize");
        if (numF2 != null) {
            aVar.e(numF2.intValue());
        }
        String strH3 = h(map, "headerText");
        if (strH3 != null) {
            aVar2.d(strH3);
        }
        String strH4 = h(map, "buttonText");
        if (strH4 != null) {
            aVar2.c(strH4);
        }
        String strH5 = h(map, "textColor");
        if (strH5 != null) {
            aVar2.f(strH5);
        }
        String strH6 = h(map, "statusBarColor");
        if (strH6 != null) {
            aVar2.e(strH6);
        }
        String strH7 = h(map, "backgroundColor");
        if (strH7 != null) {
            aVar2.b(strH7);
        }
        Integer numF3 = f(map, "textFontSize");
        if (numF3 != null) {
            aVar2.g(numF3.intValue());
        }
        String strH8 = h(readableMapG2, "borderColor");
        if (strH8 != null) {
            mVar.a(strH8);
        }
        String strH9 = h(readableMapG2, "textColor");
        if (strH9 != null) {
            mVar.d(strH9);
        }
        Integer numF4 = f(readableMapG2, "borderWidth");
        if (numF4 != null) {
            mVar.b(numF4.intValue());
        }
        Integer numF5 = f(readableMapG2, Snapshot.BORDER_RADIUS);
        if (numF5 != null) {
            mVar.c(numF5.intValue());
        }
        Integer numF6 = f(readableMapG2, "textFontSize");
        if (numF6 != null) {
            mVar.e(numF6.intValue());
        }
        String strH10 = h(readableMapG3, "backgroundColor");
        if (strH10 != null) {
            aVar3.b(strH10);
        }
        Integer numF7 = f(readableMapG3, Snapshot.BORDER_RADIUS);
        if (numF7 != null) {
            aVar3.c(numF7.intValue());
        }
        String strH11 = h(readableMapG3, "textColor");
        if (strH11 != null) {
            aVar3.d(strH11);
        }
        Integer numF8 = f(readableMapG3, "textFontSize");
        if (numF8 != null) {
            aVar3.e(numF8.intValue());
        }
        String strH12 = h(readableMapG4, "backgroundColor");
        if (strH12 != null) {
            aVar4.b(strH12);
        }
        Integer numF9 = f(readableMapG4, Snapshot.BORDER_RADIUS);
        if (numF9 != null) {
            aVar4.c(numF9.intValue());
        }
        String strH13 = h(readableMapG4, "textColor");
        if (strH13 != null) {
            aVar4.d(strH13);
        }
        Integer numF10 = f(readableMapG4, "textFontSize");
        if (numF10 != null) {
            aVar4.e(numF10.intValue());
        }
        String strH14 = h(readableMapG6, "backgroundColor");
        if (strH14 != null) {
            aVar6.b(strH14);
        }
        Integer numF11 = f(readableMapG6, Snapshot.BORDER_RADIUS);
        if (numF11 != null) {
            aVar6.c(numF11.intValue());
        }
        String strH15 = h(readableMapG6, "textColor");
        if (strH15 != null) {
            aVar6.d(strH15);
        }
        Integer numF12 = f(readableMapG6, "textFontSize");
        if (numF12 != null) {
            aVar6.e(numF12.intValue());
        }
        String strH16 = h(readableMapG5, "backgroundColor");
        if (strH16 != null) {
            aVar5.b(strH16);
        }
        Integer numF13 = f(readableMapG5, Snapshot.BORDER_RADIUS);
        if (numF13 != null) {
            aVar5.c(numF13.intValue());
        }
        String strH17 = h(readableMapG5, "textColor");
        if (strH17 != null) {
            aVar5.d(strH17);
        }
        Integer numF14 = f(readableMapG5, "textFontSize");
        if (numF14 != null) {
            aVar5.e(numF14.intValue());
        }
        String strH18 = h(readableMapG7, "backgroundColor");
        if (strH18 != null) {
            aVar7.b(strH18);
        }
        Integer numF15 = f(readableMapG7, Snapshot.BORDER_RADIUS);
        if (numF15 != null) {
            aVar7.c(numF15.intValue());
        }
        String strH19 = h(readableMapG7, "textColor");
        if (strH19 != null) {
            aVar7.d(strH19);
        }
        Integer numF16 = f(readableMapG7, "textFontSize");
        if (numF16 != null) {
            aVar7.e(numF16.intValue());
        }
        l.Stripe3ds2UiCustomization.a aVarD = new l.Stripe3ds2UiCustomization.a().e(aVar.a()).f(aVar2.a()).d(aVar3.a(), l.Stripe3ds2UiCustomization.b.SUBMIT).d(aVar6.a(), l.Stripe3ds2UiCustomization.b.CONTINUE).d(aVar5.a(), l.Stripe3ds2UiCustomization.b.SELECT).d(aVar4.a(), l.Stripe3ds2UiCustomization.b.CANCEL).d(aVar7.a(), l.Stripe3ds2UiCustomization.b.RESEND);
        String strH20 = h(params, "accentColor");
        if (strH20 != null) {
            aVarD.c(strH20);
        }
        return aVarD.a();
    }

    public static final PaymentMethod.USBankAccount.b S(String str) {
        if (s.f(str, "Company")) {
            return PaymentMethod.USBankAccount.b.COMPANY;
        }
        return s.f(str, "Individual") ? PaymentMethod.USBankAccount.b.INDIVIDUAL : PaymentMethod.USBankAccount.b.INDIVIDUAL;
    }

    public static final PaymentMethod.USBankAccount.c T(String str) {
        if (s.f(str, "Savings")) {
            return PaymentMethod.USBankAccount.c.SAVINGS;
        }
        return s.f(str, "Checking") ? PaymentMethod.USBankAccount.c.CHECKING : PaymentMethod.USBankAccount.c.CHECKING;
    }

    public static final String U(Token.c type) {
        s.k(type, "type");
        switch (a.f109676f[type.ordinal()]) {
            case 1:
                return "Account";
            case 2:
                return "BankAccount";
            case 3:
                return "Card";
            case 4:
                return "CvcUpdate";
            case 5:
                return "Person";
            case 6:
                return "Pii";
            default:
                return "Unknown";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle V(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                switch (a.f109686p[readableMap.getType(strNextKey).ordinal()]) {
                    case 1:
                        bundle.putString(strNextKey, null);
                        break;
                    case 2:
                        bundle.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                        break;
                    case 3:
                        try {
                            int i11 = readableMap.getInt(strNextKey);
                            double d11 = readableMap.getDouble(strNextKey);
                            if (d11 - ((double) i11) == 0.0d) {
                                bundle.putInt(strNextKey, i11);
                            } else {
                                bundle.putDouble(strNextKey, d11);
                            }
                            h0 h0Var = h0.f84049a;
                        } catch (Exception unused) {
                            Log.e("toBundleException", "Failed to add number to bundle. Failed on: " + strNextKey + ".");
                        }
                        break;
                    case 4:
                        bundle.putString(strNextKey, readableMap.getString(strNextKey));
                        break;
                    case 5:
                        bundle.putBundle(strNextKey, V(readableMap.getMap(strNextKey)));
                        break;
                    case 6:
                        ReadableArray array = readableMap.getArray(strNextKey);
                        ArrayList<Object> arrayList = array != null ? array.toArrayList() : null;
                        if (arrayList == null) {
                            bundle.putString(strNextKey, null);
                        } else if (!arrayList.isEmpty()) {
                            Object objO0 = v.o0(arrayList);
                            if (objO0 instanceof String) {
                                bundle.putStringArrayList(strNextKey, arrayList);
                            } else if (!(objO0 instanceof Integer)) {
                                Log.e("toBundleException", "Cannot put arrays of objects into bundles. Failed on: " + strNextKey + ".");
                            } else {
                                bundle.putIntegerArrayList(strNextKey, arrayList);
                            }
                        } else {
                            bundle.putStringArrayList(strNextKey, new ArrayList());
                        }
                        break;
                    default:
                        Log.e("toBundleException", "Could not convert object with key: " + strNextKey + ".");
                        break;
                }
            }
        }
        return bundle;
    }

    private static final ReadableMap W(Map<String, ? extends Object> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                writableMapCreateMap.putNull(key);
            } else if (value instanceof Boolean) {
                writableMapCreateMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                writableMapCreateMap.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Double) {
                writableMapCreateMap.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                writableMapCreateMap.putString(key, (String) value);
            } else if (value instanceof Map) {
                s.i(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                writableMapCreateMap.putMap(key, W((Map) value));
            } else if (value instanceof List) {
                s.i(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                writableMapCreateMap.putArray(key, X((List) value));
            } else {
                writableMapCreateMap.putString(key, value.toString());
            }
        }
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    private static final WritableArray X(List<? extends Object> list) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (Object obj : list) {
            if (obj == null) {
                writableArrayCreateArray.pushNull();
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableArrayCreateArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof Map) {
                s.i(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                writableArrayCreateArray.pushMap(W((Map) obj));
            } else if (obj instanceof List) {
                s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                writableArrayCreateArray.pushArray(X((List) obj));
            } else {
                writableArrayCreateArray.pushString(obj.toString());
            }
        }
        s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    private static final String a(long j11) {
        return String.valueOf(j11 * ((long) 1000));
    }

    public static final WritableNativeMap b(boolean z11, String str, WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap.putBoolean("canAddCard", z11);
        if (str != null) {
            writableNativeMap2.putString(PermissionsResponse.STATUS_KEY, str);
        }
        if (writableMap != null) {
            writableNativeMap2.putMap("token", writableMap);
        }
        writableNativeMap.putMap("details", writableNativeMap2);
        return writableNativeMap;
    }

    public static /* synthetic */ WritableNativeMap c(boolean z11, String str, WritableMap writableMap, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            writableMap = null;
        }
        return b(z11, str, writableMap);
    }

    public static final WritableMap d(String key, WritableMap value) {
        s.k(key, "key");
        s.k(value, "value");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap(key, value);
        return writableNativeMap;
    }

    public static final boolean e(ReadableMap readableMap, String key) {
        s.k(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return false;
        }
        return readableMap.getBoolean(key);
    }

    public static final Integer f(ReadableMap readableMap, String key) {
        s.k(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return null;
        }
        return Integer.valueOf(readableMap.getInt(key));
    }

    public static final ReadableMap g(ReadableMap readableMap, String key) {
        s.k(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return null;
        }
        return readableMap.getMap(key);
    }

    private static final String h(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str)) {
            return null;
        }
        return readableMap.getString(str);
    }

    public static final String i(ReadableMap readableMap, String key, String str) {
        s.k(key, "key");
        if (readableMap != null) {
            String string = readableMap.hasKey(key) ? readableMap.getString(key) : str;
            if (string != null) {
                return string;
            }
        }
        return str;
    }

    public static /* synthetic */ String j(ReadableMap readableMap, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return i(readableMap, str, str2);
    }

    public static final String k(PaymentIntent.b bVar) {
        int i11 = bVar == null ? -1 : a.f109672b[bVar.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "Unknown" : "Manual";
        }
        return "Automatic";
    }

    public static final String l(com.stripe.android.model.h hVar) {
        switch (hVar == null ? -1 : a.f109674d[hVar.ordinal()]) {
            case 1:
                return "AmericanExpress";
            case 2:
                return "DinersClub";
            case 3:
                return "Discover";
            case 4:
                return "JCB";
            case 5:
                return "MasterCard";
            case 6:
                return "UnionPay";
            case 7:
                return "Visa";
            case 8:
            default:
                return "Unknown";
        }
    }

    public static final String m(PaymentIntent.e eVar) {
        int i11 = eVar == null ? -1 : a.f109673c[eVar.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "Unknown" : "Manual";
        }
        return "Automatic";
    }

    public static final WritableMap n(BankAccount bankAccount) {
        if (bankAccount == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", bankAccount.getId());
        writableNativeMap.putString("bankName", bankAccount.getBankName());
        writableNativeMap.putString("accountHolderName", bankAccount.getAccountHolderName());
        writableNativeMap.putString("accountHolderType", p(bankAccount.getAccountHolderType()));
        writableNativeMap.putString("currency", bankAccount.getCurrency());
        writableNativeMap.putString(PlaceTypes.COUNTRY, bankAccount.getCountryCode());
        writableNativeMap.putString("routingNumber", bankAccount.getRoutingNumber());
        writableNativeMap.putString(PermissionsResponse.STATUS_KEY, o(bankAccount.getStatus()));
        writableNativeMap.putString("fingerprint", bankAccount.getFingerprint());
        writableNativeMap.putString("last4", bankAccount.getLast4());
        return writableNativeMap;
    }

    public static final String o(BankAccount.Status status) {
        int i11 = status == null ? -1 : a.f109678h[status.ordinal()];
        if (i11 == 1) {
            return "Errored";
        }
        if (i11 == 2) {
            return "New";
        }
        if (i11 == 3) {
            return "Validated";
        }
        if (i11 != 4) {
            return i11 != 5 ? "Unknown" : "Verified";
        }
        return "VerificationFailed";
    }

    public static final String p(BankAccount.Type type) {
        int i11 = type == null ? -1 : a.f109677g[type.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "Unknown" : "Individual";
        }
        return "Company";
    }

    public static final WritableMap q(PaymentMethod.BillingDetails billingDetails) {
        Address address;
        Address address2;
        Address address3;
        Address address4;
        Address address5;
        Address address6;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString(PlaceTypes.COUNTRY, (billingDetails == null || (address6 = billingDetails.address) == null) ? null : address6.getCountry());
        writableNativeMap2.putString("city", (billingDetails == null || (address5 = billingDetails.address) == null) ? null : address5.getCity());
        writableNativeMap2.putString("line1", (billingDetails == null || (address4 = billingDetails.address) == null) ? null : address4.getLine1());
        writableNativeMap2.putString("line2", (billingDetails == null || (address3 = billingDetails.address) == null) ? null : address3.getLine2());
        writableNativeMap2.putString("postalCode", (billingDetails == null || (address2 = billingDetails.address) == null) ? null : address2.getPostalCode());
        writableNativeMap2.putString("state", (billingDetails == null || (address = billingDetails.address) == null) ? null : address.getState());
        writableNativeMap.putString(Scopes.EMAIL, billingDetails != null ? billingDetails.email : null);
        writableNativeMap.putString("phone", billingDetails != null ? billingDetails.phone : null);
        writableNativeMap.putString("name", billingDetails != null ? billingDetails.name : null);
        writableNativeMap.putMap(PlaceTypes.ADDRESS, writableNativeMap2);
        return writableNativeMap;
    }

    public static final WritableMap r(Card card) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (card == null) {
            return null;
        }
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap.putString(PlaceTypes.COUNTRY, card.getCountry());
        writableNativeMap.putString("brand", l(card.getBrand()));
        writableNativeMap.putString("currency", card.getCurrency());
        Integer expMonth = card.getExpMonth();
        if (expMonth != null) {
            writableNativeMap.putInt("expMonth", expMonth.intValue());
        } else {
            writableNativeMap.putNull("expMonth");
        }
        Integer expYear = card.getExpYear();
        if (expYear != null) {
            writableNativeMap.putInt("expYear", expYear.intValue());
        } else {
            writableNativeMap.putNull("expYear");
        }
        writableNativeMap.putString("id", card.getId());
        writableNativeMap.putString("last4", card.getLast4());
        com.stripe.android.model.i funding = card.getFunding();
        writableNativeMap.putString("funding", funding != null ? funding.name() : null);
        writableNativeMap.putString("name", card.getName());
        writableNativeMap2.putString("city", card.getAddressCity());
        writableNativeMap2.putString(PlaceTypes.COUNTRY, card.getAddressCountry());
        writableNativeMap2.putString("line1", card.getAddressLine1());
        writableNativeMap2.putString("line2", card.getAddressLine2());
        writableNativeMap2.putString("state", card.getAddressState());
        writableNativeMap2.putString("postalCode", card.getAddressZip());
        writableNativeMap.putMap(PlaceTypes.ADDRESS, writableNativeMap2);
        return writableNativeMap;
    }

    public static final WritableMap s(FinancialConnectionsEvent event) {
        s.k(event, "event");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", event.getName().getValue());
        writableMapCreateMap.putMap(OrcaKeys.METADATA, W(event.getMetadata().a()));
        s.j(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    @SuppressLint({"RestrictedApi"})
    public static final String t(r0 type) {
        s.k(type, "type");
        int i11 = a.f109681k[type.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "unknown" : "descriptorCode";
        }
        return "amounts";
    }

    public static final String u(PaymentIntent.Error.c cVar) {
        switch (cVar == null ? -1 : a.f109683m[cVar.ordinal()]) {
            case 1:
                return "api_connection_error";
            case 2:
                return "authentication_error";
            case 3:
                return "api_error";
            case 4:
                return "card_error";
            case 5:
                return "idempotency_error";
            case 6:
                return "invalid_request_error";
            case 7:
                return "rate_limit_error";
            default:
                return null;
        }
    }

    public static final WritableMap v(PaymentIntent paymentIntent) {
        WritableMap writableMapW;
        PaymentMethod paymentMethod;
        s.k(paymentIntent, "paymentIntent");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", paymentIntent.getId());
        writableNativeMap.putString("clientSecret", paymentIntent.getClientSecret());
        writableNativeMap.putBoolean("livemode", paymentIntent.getIsLiveMode());
        writableNativeMap.putString("paymentMethodId", paymentIntent.getPaymentMethodId());
        PaymentMethod paymentMethod2 = paymentIntent.getPaymentMethod();
        if (paymentMethod2 == null || (writableMapW = w(paymentMethod2)) == null) {
            writableMapW = null;
        }
        writableNativeMap.putMap("paymentMethod", writableMapW);
        writableNativeMap.putString("receiptEmail", paymentIntent.getReceiptEmail());
        writableNativeMap.putString("currency", paymentIntent.getCurrency());
        writableNativeMap.putString(PermissionsResponse.STATUS_KEY, E(paymentIntent.getStatus()));
        writableNativeMap.putString("description", paymentIntent.getDescription());
        writableNativeMap.putString("receiptEmail", paymentIntent.getReceiptEmail());
        writableNativeMap.putString("created", a(paymentIntent.getCreated()));
        writableNativeMap.putString("captureMethod", k(paymentIntent.getCaptureMethod()));
        writableNativeMap.putString("confirmationMethod", m(paymentIntent.getConfirmationMethod()));
        writableNativeMap.putMap("nextAction", F(paymentIntent.P0(), paymentIntent.getNextActionData()));
        writableNativeMap.putNull("lastPaymentError");
        writableNativeMap.putNull("shipping");
        writableNativeMap.putNull("amount");
        writableNativeMap.putNull("canceledAt");
        PaymentIntent.Error lastPaymentError = paymentIntent.getLastPaymentError();
        if (lastPaymentError != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("code", lastPaymentError.getCode());
            writableNativeMap2.putString("message", lastPaymentError.getMessage());
            writableNativeMap2.putString("type", u(lastPaymentError.getType()));
            writableNativeMap2.putString("declineCode", lastPaymentError.getDeclineCode());
            PaymentIntent.Error lastPaymentError2 = paymentIntent.getLastPaymentError();
            if (lastPaymentError2 != null && (paymentMethod = lastPaymentError2.getPaymentMethod()) != null) {
                writableNativeMap2.putMap("paymentMethod", w(paymentMethod));
            }
            writableNativeMap.putMap("lastPaymentError", writableNativeMap2);
        }
        PaymentIntent.Shipping shipping = paymentIntent.getShipping();
        if (shipping != null) {
            writableNativeMap.putMap("shipping", D(shipping));
        }
        Long amount = paymentIntent.getAmount();
        if (amount != null) {
            writableNativeMap.putDouble("amount", amount.longValue());
        }
        writableNativeMap.putString("canceledAt", a(paymentIntent.getCanceledAt()));
        return writableNativeMap;
    }

    public static final WritableMap w(PaymentMethod paymentMethod) {
        PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks;
        PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks2;
        PaymentMethod.Card.ThreeDSecureUsage threeDSecureUsage;
        PaymentMethod.Card.Networks networks;
        Set<String> setA;
        PaymentMethod.Card.Networks networks2;
        Integer num;
        Integer num2;
        s.k(paymentMethod, "paymentMethod");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", paymentMethod.id);
        writableNativeMap.putString(com.adyen.checkout.components.core.action.Action.PAYMENT_METHOD_TYPE, G(paymentMethod.type));
        writableNativeMap.putBoolean("livemode", paymentMethod.liveMode);
        writableNativeMap.putString("customerId", paymentMethod.customerId);
        writableNativeMap.putMap("billingDetails", q(paymentMethod.billingDetails));
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        PaymentMethod.Card card = paymentMethod.card;
        writableNativeMap2.putString("brand", l(card != null ? card.brand : null));
        PaymentMethod.Card card2 = paymentMethod.card;
        writableNativeMap2.putString(PlaceTypes.COUNTRY, card2 != null ? card2.country : null);
        PaymentMethod.Card card3 = paymentMethod.card;
        if (card3 != null && (num2 = card3.expiryYear) != null) {
            writableNativeMap2.putInt("expYear", num2.intValue());
        }
        PaymentMethod.Card card4 = paymentMethod.card;
        if (card4 != null && (num = card4.expiryMonth) != null) {
            writableNativeMap2.putInt("expMonth", num.intValue());
        }
        PaymentMethod.Card card5 = paymentMethod.card;
        writableNativeMap2.putString("funding", card5 != null ? card5.funding : null);
        PaymentMethod.Card card6 = paymentMethod.card;
        writableNativeMap2.putString("last4", card6 != null ? card6.last4 : null);
        PaymentMethod.Card card7 = paymentMethod.card;
        writableNativeMap2.putString("fingerprint", card7 != null ? card7.fingerprint : null);
        PaymentMethod.Card card8 = paymentMethod.card;
        writableNativeMap2.putString("preferredNetwork", (card8 == null || (networks2 = card8.networks) == null) ? null : networks2.getPreferred());
        PaymentMethod.Card card9 = paymentMethod.card;
        List listM1 = (card9 == null || (networks = card9.networks) == null || (setA = networks.a()) == null) ? null : v.m1(setA);
        writableNativeMap2.putArray("availableNetworks", listM1 instanceof ReadableArray ? (ReadableArray) listM1 : null);
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        PaymentMethod.Card card10 = paymentMethod.card;
        writableNativeMap3.putBoolean("isSupported", (card10 == null || (threeDSecureUsage = card10.threeDSecureUsage) == null) ? false : threeDSecureUsage.isSupported);
        h0 h0Var = h0.f84049a;
        writableNativeMap2.putMap("threeDSecureUsage", writableNativeMap3);
        writableNativeMap.putMap("Card", writableNativeMap2);
        WritableNativeMap writableNativeMap4 = new WritableNativeMap();
        PaymentMethod.SepaDebit sepaDebit = paymentMethod.sepaDebit;
        writableNativeMap4.putString("bankCode", sepaDebit != null ? sepaDebit.bankCode : null);
        PaymentMethod.SepaDebit sepaDebit2 = paymentMethod.sepaDebit;
        writableNativeMap4.putString(PlaceTypes.COUNTRY, sepaDebit2 != null ? sepaDebit2.country : null);
        PaymentMethod.SepaDebit sepaDebit3 = paymentMethod.sepaDebit;
        writableNativeMap4.putString("fingerprint", sepaDebit3 != null ? sepaDebit3.fingerprint : null);
        PaymentMethod.SepaDebit sepaDebit4 = paymentMethod.sepaDebit;
        writableNativeMap4.putString("last4", sepaDebit4 != null ? sepaDebit4.branchCode : null);
        writableNativeMap.putMap("SepaDebit", writableNativeMap4);
        WritableNativeMap writableNativeMap5 = new WritableNativeMap();
        PaymentMethod.BacsDebit bacsDebit = paymentMethod.bacsDebit;
        writableNativeMap5.putString("fingerprint", bacsDebit != null ? bacsDebit.fingerprint : null);
        PaymentMethod.BacsDebit bacsDebit2 = paymentMethod.bacsDebit;
        writableNativeMap5.putString("last4", bacsDebit2 != null ? bacsDebit2.last4 : null);
        PaymentMethod.BacsDebit bacsDebit3 = paymentMethod.bacsDebit;
        writableNativeMap5.putString("sortCode", bacsDebit3 != null ? bacsDebit3.sortCode : null);
        writableNativeMap.putMap("BacsDebit", writableNativeMap5);
        WritableNativeMap writableNativeMap6 = new WritableNativeMap();
        PaymentMethod.BacsDebit bacsDebit4 = paymentMethod.bacsDebit;
        writableNativeMap6.putString("bsbNumber", bacsDebit4 != null ? bacsDebit4.sortCode : null);
        PaymentMethod.BacsDebit bacsDebit5 = paymentMethod.bacsDebit;
        writableNativeMap6.putString("fingerprint", bacsDebit5 != null ? bacsDebit5.fingerprint : null);
        PaymentMethod.BacsDebit bacsDebit6 = paymentMethod.bacsDebit;
        writableNativeMap6.putString("last4", bacsDebit6 != null ? bacsDebit6.last4 : null);
        writableNativeMap.putMap("AuBecsDebit", writableNativeMap6);
        WritableNativeMap writableNativeMap7 = new WritableNativeMap();
        PaymentMethod.Sofort sofort = paymentMethod.sofort;
        writableNativeMap7.putString(PlaceTypes.COUNTRY, sofort != null ? sofort.country : null);
        writableNativeMap.putMap("Sofort", writableNativeMap7);
        WritableNativeMap writableNativeMap8 = new WritableNativeMap();
        PaymentMethod.Ideal ideal = paymentMethod.ideal;
        writableNativeMap8.putString("bankName", ideal != null ? ideal.bank : null);
        PaymentMethod.Ideal ideal2 = paymentMethod.ideal;
        writableNativeMap8.putString("bankIdentifierCode", ideal2 != null ? ideal2.bankIdentifierCode : null);
        writableNativeMap.putMap("Ideal", writableNativeMap8);
        WritableNativeMap writableNativeMap9 = new WritableNativeMap();
        PaymentMethod.Fpx fpx = paymentMethod.fpx;
        writableNativeMap9.putString("accountHolderType", fpx != null ? fpx.accountHolderType : null);
        PaymentMethod.Fpx fpx2 = paymentMethod.fpx;
        writableNativeMap9.putString(PlaceTypes.BANK, fpx2 != null ? fpx2.bank : null);
        writableNativeMap.putMap("Fpx", writableNativeMap9);
        WritableNativeMap writableNativeMap10 = new WritableNativeMap();
        PaymentMethod.Upi upi = paymentMethod.upi;
        writableNativeMap10.putString("vpa", upi != null ? upi.vpa : null);
        writableNativeMap.putMap("Upi", writableNativeMap10);
        WritableNativeMap writableNativeMap11 = new WritableNativeMap();
        PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
        writableNativeMap11.putString("routingNumber", uSBankAccount != null ? uSBankAccount.routingNumber : null);
        PaymentMethod.USBankAccount uSBankAccount2 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("accountType", C(uSBankAccount2 != null ? uSBankAccount2.accountType : null));
        PaymentMethod.USBankAccount uSBankAccount3 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("accountHolderType", B(uSBankAccount3 != null ? uSBankAccount3.accountHolderType : null));
        PaymentMethod.USBankAccount uSBankAccount4 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("last4", uSBankAccount4 != null ? uSBankAccount4.last4 : null);
        PaymentMethod.USBankAccount uSBankAccount5 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("bankName", uSBankAccount5 != null ? uSBankAccount5.bankName : null);
        PaymentMethod.USBankAccount uSBankAccount6 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("linkedAccount", uSBankAccount6 != null ? uSBankAccount6.linkedAccount : null);
        PaymentMethod.USBankAccount uSBankAccount7 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("fingerprint", uSBankAccount7 != null ? uSBankAccount7.fingerprint : null);
        PaymentMethod.USBankAccount uSBankAccount8 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("preferredNetworks", (uSBankAccount8 == null || (uSBankNetworks2 = uSBankAccount8.networks) == null) ? null : uSBankNetworks2.getPreferred());
        PaymentMethod.USBankAccount uSBankAccount9 = paymentMethod.usBankAccount;
        List<String> listB = (uSBankAccount9 == null || (uSBankNetworks = uSBankAccount9.networks) == null) ? null : uSBankNetworks.b();
        writableNativeMap11.putArray("supportedNetworks", listB instanceof ReadableArray ? (ReadableArray) listB : null);
        writableNativeMap.putMap("USBankAccount", writableNativeMap11);
        return writableNativeMap;
    }

    public static final String x(SetupIntent.Error.c cVar) {
        switch (cVar == null ? -1 : a.f109684n[cVar.ordinal()]) {
            case 1:
                return "api_connection_error";
            case 2:
                return "authentication_error";
            case 3:
                return "api_error";
            case 4:
                return "card_error";
            case 5:
                return "idempotency_error";
            case 6:
                return "invalid_request_error";
            case 7:
                return "rate_limit_error";
            default:
                return null;
        }
    }

    public static final WritableMap y(SetupIntent setupIntent) {
        WritableMap writableMapW;
        PaymentMethod paymentMethod;
        s.k(setupIntent, "setupIntent");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        s.j(writableArrayCreateArray, "createArray(...)");
        writableNativeMap.putString("id", setupIntent.getId());
        writableNativeMap.putString(PermissionsResponse.STATUS_KEY, E(setupIntent.getStatus()));
        writableNativeMap.putString("description", setupIntent.getDescription());
        writableNativeMap.putBoolean("livemode", setupIntent.getIsLiveMode());
        writableNativeMap.putString("clientSecret", setupIntent.getClientSecret());
        writableNativeMap.putString("paymentMethodId", setupIntent.getPaymentMethodId());
        PaymentMethod paymentMethod2 = setupIntent.getPaymentMethod();
        if (paymentMethod2 == null || (writableMapW = w(paymentMethod2)) == null) {
            writableMapW = null;
        }
        writableNativeMap.putMap("paymentMethod", writableMapW);
        writableNativeMap.putString("usage", H(setupIntent.getUsage()));
        writableNativeMap.putString("created", a(setupIntent.getCreated()));
        writableNativeMap.putMap("nextAction", F(setupIntent.P0(), setupIntent.getNextActionData()));
        SetupIntent.Error lastSetupError = setupIntent.getLastSetupError();
        if (lastSetupError != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("code", lastSetupError.getCode());
            writableNativeMap2.putString("message", lastSetupError.getMessage());
            writableNativeMap2.putString("type", x(lastSetupError.getType()));
            writableNativeMap2.putString("declineCode", lastSetupError.getDeclineCode());
            SetupIntent.Error lastSetupError2 = setupIntent.getLastSetupError();
            if (lastSetupError2 != null && (paymentMethod = lastSetupError2.getPaymentMethod()) != null) {
                writableNativeMap2.putMap("paymentMethod", w(paymentMethod));
            }
            writableNativeMap.putMap("lastSetupError", writableNativeMap2);
        }
        Iterator<String> it = setupIntent.t().iterator();
        while (it.hasNext()) {
            PaymentMethod.p pVarA = PaymentMethod.p.INSTANCE.a(it.next());
            if (pVarA != null) {
                writableArrayCreateArray.pushString(G(pVarA));
            }
        }
        writableNativeMap.putArray("paymentMethodTypes", writableArrayCreateArray);
        return writableNativeMap;
    }

    public static final WritableMap z(GooglePayResult googlePayResult) {
        Address address;
        Address address2;
        Address address3;
        Address address4;
        Address address5;
        Address address6;
        Address address7;
        String phone;
        s.k(googlePayResult, "googlePayResult");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("emailAddress", googlePayResult.getEmail());
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        googlePayResult.getName();
        ShippingInformation shippingInformation = googlePayResult.getShippingInformation();
        String country = null;
        writableNativeMap2.putString("givenName", shippingInformation != null ? shippingInformation.getName() : null);
        writableNativeMap.putMap("name", writableNativeMap2);
        ShippingInformation shippingInformation2 = googlePayResult.getShippingInformation();
        if (shippingInformation2 == null || (phone = shippingInformation2.getPhone()) == null) {
            writableNativeMap.putString("phoneNumber", googlePayResult.getPhoneNumber());
        } else {
            writableNativeMap.putString("phoneNumber", phone);
        }
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        ShippingInformation shippingInformation3 = googlePayResult.getShippingInformation();
        writableNativeMap3.putString("city", (shippingInformation3 == null || (address7 = shippingInformation3.getAddress()) == null) ? null : address7.getCity());
        ShippingInformation shippingInformation4 = googlePayResult.getShippingInformation();
        writableNativeMap3.putString(PlaceTypes.COUNTRY, (shippingInformation4 == null || (address6 = shippingInformation4.getAddress()) == null) ? null : address6.getCountry());
        ShippingInformation shippingInformation5 = googlePayResult.getShippingInformation();
        writableNativeMap3.putString("postalCode", (shippingInformation5 == null || (address5 = shippingInformation5.getAddress()) == null) ? null : address5.getPostalCode());
        ShippingInformation shippingInformation6 = googlePayResult.getShippingInformation();
        writableNativeMap3.putString("state", (shippingInformation6 == null || (address4 = shippingInformation6.getAddress()) == null) ? null : address4.getState());
        ShippingInformation shippingInformation7 = googlePayResult.getShippingInformation();
        String line1 = (shippingInformation7 == null || (address3 = shippingInformation7.getAddress()) == null) ? null : address3.getLine1();
        ShippingInformation shippingInformation8 = googlePayResult.getShippingInformation();
        String line2 = (shippingInformation8 == null || (address2 = shippingInformation8.getAddress()) == null) ? null : address2.getLine2();
        String str = "";
        if (line1 == null) {
            line1 = "";
        }
        if (line2 != null) {
            str = "\n" + line2;
        }
        writableNativeMap3.putString("street", line1 + str);
        ShippingInformation shippingInformation9 = googlePayResult.getShippingInformation();
        if (shippingInformation9 != null && (address = shippingInformation9.getAddress()) != null) {
            country = address.getCountry();
        }
        writableNativeMap3.putString("isoCountryCode", country);
        writableNativeMap.putMap("postalAddress", writableNativeMap3);
        return writableNativeMap;
    }
}
