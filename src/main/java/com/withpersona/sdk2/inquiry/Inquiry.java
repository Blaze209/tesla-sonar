package com.withpersona.sdk2.inquiry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.result.contract.ActivityResultContract;
import bh0.a0;
import bh0.m2;
import bh0.s;
import bh0.z;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import jn0.e;
import lg0.a;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import q5.c;
import zi0.CollectedData;
import zi0.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 82\u00020\u0001:\u000298BÇ\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\fH\u0007¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u00100\u001a\u00020&2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00106R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00107R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00101R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry;", "", "", "templateId", "templateVersion", "inquiryId", "sessionToken", "oneTimeLinkCode", "referenceId", "accountId", "Lcom/withpersona/sdk2/inquiry/Fields;", "fields", "", "theme", "Lcom/withpersona/sdk2/inquiry/Environment;", AnalyticsAttribute.Environment, "environmentId", "", "enableErrorLogging", "returnCollectedData", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "useServerStyles", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "themeSetId", "locale", "consumeExceptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/Fields;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/Environment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/FallbackMode;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "toInquiryActivityIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "Landroid/app/Activity;", "activity", "requestCode", "Ljn0/h0;", "start", "(Landroid/app/Activity;I)V", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "buildInlineInquiry", "()Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Landroid/os/Bundle;", "bundle", "addArgumentsToBundle$inquiry_dynamic_feature_release", "(Landroid/os/Bundle;)V", "addArgumentsToBundle", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/Fields;", "Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/Environment;", "Ljava/lang/Boolean;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "Companion", "Contract", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Inquiry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountId;
    private final Boolean consumeExceptions;
    private final Boolean enableErrorLogging;
    private final Environment environment;
    private final String environmentId;
    private final FallbackMode fallbackMode;
    private final Fields fields;
    private final String inquiryId;
    private final String locale;
    private final String oneTimeLinkCode;
    private final String referenceId;
    private final Boolean returnCollectedData;
    private final String sessionToken;
    private final StaticInquiryTemplate staticInquiryTemplate;
    private final String templateId;
    private final String templateVersion;
    private final Integer theme;
    private final String themeSetId;
    private final Boolean useServerStyles;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u0018J%\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001a\u00020#¢\u0006\u0004\b%\u0010\u0003R.\u0010-\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b,\u0010\u0003\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbh0/z;", "getStatus", "(Landroid/os/Bundle;Landroid/content/Context;)Lbh0/z;", "", "templateId", "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "fromTemplate", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "templateVersion", "fromTemplateVersion", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "fromStaticTemplate", "(Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "inquiryId", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "fromInquiry", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "oneTimeLinkCode", "fromOneTimeLinkCode", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "onActivityResult", "(Landroid/content/Intent;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "bundle", "extractInquiryResponseFromBundle", "(Landroid/os/Bundle;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "Ljn0/h0;", "prefetchModels", "cancelRunningInquiries", "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "value", "getOnEventListener", "()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "setOnEventListener", "(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V", "getOnEventListener$annotations", "onEventListener", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[z.values().length];
                try {
                    iArr[z.INQUIRY_COMPLETE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[z.INQUIRY_CANCELED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[z.INQUIRY_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalInquiryApi
        public static /* synthetic */ void getOnEventListener$annotations() {
        }

        private final z getStatus(Bundle bundle, Context context) {
            String string;
            z zVarValueOf = null;
            if (bundle != null && (string = bundle.getString("PERSONA_ACTIVITY_RESULT")) != null) {
                try {
                    zVarValueOf = z.valueOf(string);
                } catch (Exception unused) {
                }
            }
            if (zVarValueOf != null) {
                return zVarValueOf;
            }
            if (context == null) {
                return z.INQUIRY_CANCELED;
            }
            return new a(context).f() ? z.INQUIRY_ERROR : z.INQUIRY_CANCELED;
        }

        public static /* synthetic */ InquiryResponse onActivityResult$default(Companion companion, Intent intent, Context context, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                context = null;
            }
            return companion.onActivityResult(intent, context);
        }

        public final void cancelRunningInquiries() {
            InquiryActivityBroadcastManager.INSTANCE.cancelRunningInquiries();
        }

        public final InquiryResponse extractInquiryResponseFromBundle(Bundle bundle, Context context) {
            s sVar;
            Object unknownField;
            Object dateField;
            d dVar;
            d dVar2;
            z status = getStatus(bundle, context);
            String string = bundle != null ? bundle.getString("INQUIRY_ID_KEY") : null;
            int i11 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return new InquiryResponse.Cancel(string, bundle != null ? bundle.getString("SESSION_TOKEN_KEY") : null);
                }
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                String string2 = bundle != null ? bundle.getString("ERROR_DEBUG_MESSAGE_KEY") : null;
                String strE = context != null ? new a(context).e() : null;
                if (bundle != null) {
                    try {
                        dVar = (d) bundle.getParcelable("ERROR_CODE_KEY");
                    } catch (Exception unused) {
                        dVar2 = d.UnexpectedError;
                    }
                } else {
                    dVar = null;
                }
                d dVar3 = dVar != null ? dVar : null;
                if (dVar3 == null) {
                    dVar3 = d.UnexpectedError;
                }
                dVar2 = dVar3;
                if (string2 == null) {
                    string2 = "An otherwise unexpected error occurred.";
                }
                return new InquiryResponse.Error(string2, dVar2, strE);
            }
            if (bundle == null || (sVar = (s) c.a(bundle, "FIELDS_MAP_KEY", s.class)) == null) {
                sVar = new s(v0.i());
            }
            String string3 = bundle != null ? bundle.getString("INQUIRY_STATUS_KEY") : null;
            CollectedData collectedData = bundle != null ? (CollectedData) c.a(bundle, "COLLECTED_DATA", CollectedData.class) : null;
            p013kotlin.jvm.internal.s.h(string);
            p013kotlin.jvm.internal.s.h(string3);
            Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> mapA = sVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapA.size()));
            Iterator<T> it = mapA.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                com.withpersona.sdk2.inquiry.network.dto.InquiryField inquiryField = (com.withpersona.sdk2.inquiry.network.dto.InquiryField) entry.getValue();
                if (inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.StringField) {
                    unknownField = new InquiryField.StringField(((com.withpersona.sdk2.inquiry.network.dto.InquiryField.StringField) inquiryField).getValue());
                } else if (inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.IntegerField) {
                    unknownField = new InquiryField.IntegerField(((com.withpersona.sdk2.inquiry.network.dto.InquiryField.IntegerField) inquiryField).getValue());
                } else if (inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.BooleanField) {
                    unknownField = new InquiryField.BooleanField(((com.withpersona.sdk2.inquiry.network.dto.InquiryField.BooleanField) inquiryField).getValue());
                } else if (inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.FloatField) {
                    unknownField = new InquiryField.FloatField(((com.withpersona.sdk2.inquiry.network.dto.InquiryField.FloatField) inquiryField).getValue());
                } else if (inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField) {
                    String value = ((com.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField) inquiryField).getValue();
                    if (value != null) {
                        dateField = new InquiryField.DateField(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(value));
                        unknownField = dateField;
                    } else {
                        unknownField = new InquiryField.DateField(null);
                    }
                } else if (inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.DatetimeField) {
                    String value2 = ((com.withpersona.sdk2.inquiry.network.dto.InquiryField.DatetimeField) inquiryField).getValue();
                    if (value2 != null) {
                        dateField = new InquiryField.DateField(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(value2));
                        unknownField = dateField;
                    } else {
                        unknownField = new InquiryField.DatetimeField(null);
                    }
                } else if (inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.ChoicesField) {
                    unknownField = new InquiryField.ChoicesField(((com.withpersona.sdk2.inquiry.network.dto.InquiryField.ChoicesField) inquiryField).getValue());
                } else if (inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.MultiChoicesField) {
                    unknownField = new InquiryField.MultiChoicesField(((com.withpersona.sdk2.inquiry.network.dto.InquiryField.MultiChoicesField) inquiryField).getValue());
                } else {
                    if (!(inquiryField instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryField.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    unknownField = new InquiryField.UnknownField(((com.withpersona.sdk2.inquiry.network.dto.InquiryField.Unknown) inquiryField).getType());
                }
                linkedHashMap.put(key, unknownField);
            }
            return new InquiryResponse.Complete(string, string3, linkedHashMap, collectedData);
        }

        public final InquiryBuilder fromInquiry(String inquiryId) {
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            return InquiryBuilder.INSTANCE.fromInquiryId$inquiry_dynamic_feature_release(inquiryId);
        }

        public final InquiryBuilder fromOneTimeLinkCode(String oneTimeLinkCode) {
            p013kotlin.jvm.internal.s.k(oneTimeLinkCode, "oneTimeLinkCode");
            return InquiryBuilder.INSTANCE.fromOneTimeLinkCode$inquiry_dynamic_feature_release(oneTimeLinkCode);
        }

        @ExperimentalInquiryFlow
        public final InquiryTemplateBuilder fromStaticTemplate(StaticInquiryTemplate staticInquiryTemplate) {
            p013kotlin.jvm.internal.s.k(staticInquiryTemplate, "staticInquiryTemplate");
            return new InquiryTemplateBuilder(null, null, staticInquiryTemplate, 3, null);
        }

        public final InquiryTemplateBuilder fromTemplate(String templateId) {
            p013kotlin.jvm.internal.s.k(templateId, "templateId");
            return new InquiryTemplateBuilder(templateId, null, null, 6, null);
        }

        public final InquiryTemplateBuilder fromTemplateVersion(String templateVersion) {
            p013kotlin.jvm.internal.s.k(templateVersion, "templateVersion");
            return new InquiryTemplateBuilder(null, templateVersion, null, 5, null);
        }

        public final OnInquiryEventListener getOnEventListener() {
            return a0.INSTANCE.a().getOnEventListener();
        }

        @e
        public final InquiryResponse onActivityResult(Intent intent) {
            return onActivityResult$default(this, intent, null, 2, null);
        }

        public final void prefetchModels() throws IllegalAccessException, InstantiationException {
            m2.f17300a.a();
        }

        public final void setOnEventListener(OnInquiryEventListener onInquiryEventListener) {
            a0.INSTANCE.a().d(onInquiryEventListener);
        }

        private Companion() {
        }

        @e
        public final InquiryResponse onActivityResult(Intent intent, Context context) {
            return extractInquiryResponseFromBundle(intent != null ? intent.getExtras() : null, context);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Contract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "<init>", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "createIntent", "Landroid/content/Intent;", "input", "parseResult", StatusResponse.RESULT_CODE, "", AnalyticsAttribute.Intent, "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Contract extends ActivityResultContract<Inquiry, InquiryResponse> {
        private Context context;

        @e
        public Contract() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Contract(Context context) {
            this();
            p013kotlin.jvm.internal.s.k(context, "context");
            this.context = context;
        }

        @Override // androidx.p002activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Inquiry input) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(input, "input");
            return input.toInquiryActivityIntent(context);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p002activity.result.contract.ActivityResultContract
        public InquiryResponse parseResult(int resultCode, Intent intent) {
            return Inquiry.INSTANCE.onActivityResult(intent, this.context);
        }
    }

    public Inquiry(String str, String str2, String str3, String str4, String str5, String str6, String str7, Fields fields, Integer num, Environment environment, String str8, Boolean bool, Boolean bool2, FallbackMode fallbackMode, Boolean bool3, StaticInquiryTemplate staticInquiryTemplate, String str9, String str10, Boolean bool4) {
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.oneTimeLinkCode = str5;
        this.referenceId = str6;
        this.accountId = str7;
        this.fields = fields;
        this.theme = num;
        this.environment = environment;
        this.environmentId = str8;
        this.enableErrorLogging = bool;
        this.returnCollectedData = bool2;
        this.fallbackMode = fallbackMode;
        this.useServerStyles = bool3;
        this.staticInquiryTemplate = staticInquiryTemplate;
        this.themeSetId = str9;
        this.locale = str10;
        this.consumeExceptions = bool4;
    }

    public static final InquiryResponse extractInquiryResponseFromBundle(Bundle bundle, Context context) {
        return INSTANCE.extractInquiryResponseFromBundle(bundle, context);
    }

    public static final InquiryBuilder fromInquiry(String str) {
        return INSTANCE.fromInquiry(str);
    }

    public static final InquiryBuilder fromOneTimeLinkCode(String str) {
        return INSTANCE.fromOneTimeLinkCode(str);
    }

    @ExperimentalInquiryFlow
    public static final InquiryTemplateBuilder fromStaticTemplate(StaticInquiryTemplate staticInquiryTemplate) {
        return INSTANCE.fromStaticTemplate(staticInquiryTemplate);
    }

    public static final InquiryTemplateBuilder fromTemplate(String str) {
        return INSTANCE.fromTemplate(str);
    }

    public static final InquiryTemplateBuilder fromTemplateVersion(String str) {
        return INSTANCE.fromTemplateVersion(str);
    }

    @e
    public static final InquiryResponse onActivityResult(Intent intent) {
        return INSTANCE.onActivityResult(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent toInquiryActivityIntent(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.withpersona.sdk2.inquiry.internal.InquiryActivity");
        Bundle bundle = new Bundle();
        addArgumentsToBundle$inquiry_dynamic_feature_release(bundle);
        intent.replaceExtras(bundle);
        return intent;
    }

    public final void addArgumentsToBundle$inquiry_dynamic_feature_release(Bundle bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        String str = this.templateId;
        if (str != null) {
            bundle.putString("TEMPLATE_ID_KEY", str);
        }
        String str2 = this.templateVersion;
        if (str2 != null) {
            bundle.putString("TEMPLATE_VERSION_KEY", str2);
        }
        String str3 = this.inquiryId;
        if (str3 != null) {
            bundle.putString("INQUIRY_ID_KEY", str3);
        }
        String str4 = this.oneTimeLinkCode;
        if (str4 != null) {
            bundle.putString("ONE_TIME_LINK_CODE", str4);
        }
        String str5 = this.sessionToken;
        if (str5 != null) {
            bundle.putString("SESSION_TOKEN_KEY", str5);
        }
        String str6 = this.referenceId;
        if (str6 != null) {
            bundle.putString("REFERENCE_ID_KEY", str6);
        }
        String str7 = this.accountId;
        if (str7 != null) {
            bundle.putString("ACCOUNT_ID_KEY", str7);
        }
        Fields fields = this.fields;
        if (fields != null) {
            bundle.putParcelable("FIELDS_MAP_KEY", new s(fields.getFields$inquiry_dynamic_feature_release()));
        }
        Integer num = this.theme;
        if (num != null) {
            bundle.putInt("THEME_KEY", num.intValue());
        }
        StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
        if (staticInquiryTemplate != null) {
            bundle.putParcelable("STATIC_INQUIRY_TEMPLATE_KEY", staticInquiryTemplate);
        }
        Environment environment = this.environment;
        if (environment != null) {
            bundle.putString("ENVIRONMENT_KEY", environment.name());
        }
        String str8 = this.environmentId;
        if (str8 != null) {
            bundle.putString("ENVIRONMENT_ID_KEY", str8);
        }
        Boolean bool = this.enableErrorLogging;
        if (bool != null) {
            bundle.putBoolean("ENABLE_ERROR_LOGGING", bool.booleanValue());
        }
        Boolean bool2 = this.returnCollectedData;
        if (bool2 != null) {
            bundle.putBoolean("RETURN_COLLECTED_DATA", bool2.booleanValue());
        }
        FallbackMode fallbackMode = this.fallbackMode;
        if (fallbackMode != null) {
            bundle.putString("FALLBACK_MODE", fallbackMode.name());
        }
        Boolean bool3 = this.useServerStyles;
        if (bool3 != null) {
            bundle.putBoolean("USE_SERVER_STYLES", bool3.booleanValue());
        }
        String str9 = this.themeSetId;
        if (str9 != null) {
            bundle.putString("THEME_SET_ID_KEY", str9);
        }
        String str10 = this.locale;
        if (str10 != null) {
            bundle.putString("LOCALE", str10);
        }
        Boolean bool4 = this.consumeExceptions;
        if (bool4 != null) {
            bundle.putBoolean("CONSUME_EXCEPTIONS", bool4.booleanValue());
        }
    }

    @ExperimentalInlineApi
    public final InlineInquiryBuilder buildInlineInquiry() {
        return new InlineInquiryBuilder(this);
    }

    @e
    public final void start(Activity activity, int requestCode) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        activity.startActivityForResult(toInquiryActivityIntent(activity), requestCode);
    }

    @e
    public static final InquiryResponse onActivityResult(Intent intent, Context context) {
        return INSTANCE.onActivityResult(intent, context);
    }
}
