package nd0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import androidx.core.app.o;
import androidx.core.app.r;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.brentvatne.exoplayer.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.wire.ProtoAdapter;
import com.tesla.notifications.charging.ChargingNotificationDismissedException;
import fc0.u5;
import ie0.y;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jn0.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import vb0.NotificationPackage;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u0016\u0010)\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0016\u0010+\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0013\u0010-\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0013\u0010/\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0013\u00101\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0018¨\u00062"}, d2 = {"Lnd0/k;", "Lvb0/a;", "Landroid/os/Bundle;", "bundle", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/os/Bundle;Landroid/content/Context;)V", "", "manufacturerKey", "valueKey", "m", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/app/PendingIntent;", AnalyticsAttribute.Intent, "Lvb0/b;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/app/PendingIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/app/PendingIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "b", "Landroid/content/Context;", "l", "()Ljava/lang/String;", "productId", "j", "notificationIdentifier", "c", "actions", "", "k", "()I", "priority", "", DateTokenConverter.CONVERTER_KEY, "()J", "alertTimeMillis", "e", "attachment", "f", "category", "g", "channelId", "n", "title", "h", "message", "o", "vin", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements vb0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.tesla.logging.g f93870d = com.tesla.logging.g.INSTANCE.a("TeslaNotification");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bundle bundle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: nd0.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0014\u0010&\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0014\u0010'\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0014\u0010(\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0014\u0010)\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lnd0/k$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/core/app/r;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Landroidx/core/app/r;", "appContext", "Ljn0/h0;", "a", "(Landroid/content/Context;)V", "Landroidx/core/app/o$e;", "b", "(Landroid/content/Context;)Landroidx/core/app/o$e;", "", "title", "text", "Landroid/app/PendingIntent;", AnalyticsAttribute.Intent, "", "id", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;I)V", "c", "()I", "getNotificationColor$annotations", "notificationColor", "NOTIFICATION_ICON_COLOR", "Ljava/lang/String;", "NOTIFICATION_ICON_COLOR_ENG", "DEFAULT_CHANNEL_ID", "PHONE_KEY_SERVICE_CHANNEL", "TAG", "PRIORITY_HIGH", "KEY_PRODUCT_ID", "KEY_VIN", "KEY_NOTIFICATION_IDENTIFIER", "ATTACHMENT_IDENTIFIER", "KEY_ACTIONS", "THIRD_PARTY_CHANNEL", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final r d(Context context) {
            r rVarE = r.e(context);
            s.j(rVarE, "from(...)");
            return rVarE;
        }

        public final void a(Context appContext) {
            s.k(appContext, "appContext");
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            Resources resources = appContext.getResources();
            v0.a();
            NotificationChannel notificationChannelA = ga.c.a("default_channel", resources.getString(bc0.a.U), 4);
            notificationChannelA.setDescription(resources.getString(bc0.a.T));
            notificationChannelA.setLockscreenVisibility(1);
            v0.a();
            NotificationChannel notificationChannelA2 = ga.c.a("phone_key_service_channel", resources.getString(bc0.a.W), 2);
            notificationChannelA2.setDescription(resources.getString(bc0.a.V));
            d(appContext).d(Arrays.asList(notificationChannelA, notificationChannelA2));
        }

        public final o.e b(Context context) {
            s.h(context);
            o.e eVarF = new o.e(context, "default_channel").D(jj0.b.b()).i(c()).h("default_channel").L(System.currentTimeMillis()).C(true).f(true);
            s.j(eVarF, "setAutoCancel(...)");
            return eVarF;
        }

        public final int c() {
            return Color.parseColor("#CC0000");
        }

        @SuppressLint({"MissingPermission"})
        public final void e(Context context, String title, String text, PendingIntent intent, int id2) {
            s.k(context, "context");
            o.e eVarZ = b(context).m(title).l(text).k(intent).z(true);
            s.j(eVarZ, "setOnlyAlertOnce(...)");
            d(context).g(id2, eVarZ.c());
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.notifications.TeslaNotificationFactory", f = "TeslaNotificationFactory.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {124, 143}, m = "getNotification", n = {"this", "this", "teslaNotification", "builder", "title", "message", "identifier", "actionsBase64", "updatedIntent", "notificationId"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93873n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93874o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f93875p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f93876q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f93877r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f93878s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f93879t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f93880u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f93881v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f93882w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f93884y;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93882w = obj;
            this.f93884y |= Integer.MIN_VALUE;
            return k.this.i(null, this);
        }
    }

    public k(Bundle bundle, Context context) {
        s.k(bundle, "bundle");
        s.k(context, "context");
        this.bundle = bundle;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
    }

    public static final void b(Context context) {
        INSTANCE.a(context);
    }

    private final String c() {
        if (this.bundle.containsKey("actions")) {
            return this.bundle.getString("actions");
        }
        return null;
    }

    private final long d() {
        String string = this.bundle.getString("alert_time");
        return string != null ? Long.parseLong(string) * ((long) 1000) : System.currentTimeMillis();
    }

    private final String e() {
        return this.bundle.getString("attachment");
    }

    private final String f() {
        y yVar = y.f77624a;
        if (yVar.d()) {
            return m("huawei", "category");
        }
        if (yVar.f()) {
            return m("vivo", "category");
        }
        return null;
    }

    private final String g() {
        y yVar = y.f77624a;
        if (yVar.a()) {
            return m("oppo", "channel_id");
        }
        if (yVar.e()) {
            return m("xiaomi", "channel_id");
        }
        return null;
    }

    private final String j() {
        return this.bundle.getString("alert_id");
    }

    private final int k() {
        String string = this.bundle.getString("priority");
        return (string == null || !s.f(string, "high")) ? 0 : 1;
    }

    private final String l() {
        return this.bundle.getString("product_id_s");
    }

    private final String m(String manufacturerKey, String valueKey) {
        String string = this.bundle.getString("third_party_channel");
        f93870d.j("parse notification value for " + manufacturerKey + ":" + valueKey + " from " + string);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has(manufacturerKey)) {
                return new JSONObject(jSONObject.getString(manufacturerKey)).getString(valueKey);
            }
            return null;
        } catch (JSONException e11) {
            f93870d.d("Failed to parse notification value for " + manufacturerKey + ":" + valueKey + " from " + string, e11);
            return null;
        }
    }

    @Override // vb0.a
    public Object a(Context context, Bundle bundle, PendingIntent pendingIntent, Continuation<? super NotificationPackage> continuation) {
        return new k(bundle, context).i(pendingIntent, continuation);
    }

    public final String h() {
        return this.bundle.getString("override_string");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00c0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00e6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [T, android.app.PendingIntent] */
    public final Object i(PendingIntent pendingIntent, Continuation<? super NotificationPackage> continuation) {
        b bVar;
        int iC;
        k kVar;
        o.e eVarB;
        String strN;
        String strH;
        String strJ;
        String strC;
        n0 n0Var;
        k kVar2;
        n0 n0Var2;
        int i11;
        String str;
        String str2;
        o.e eVar;
        String str3;
        String str4;
        k kVar3;
        k kVar4;
        pd0.c.AbstractC2164c abstractC2164c;
        u5 u5Var;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f93884y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f93884y = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object objL = bVar2.f93882w;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar2.f93884y;
        boolean z11 = true;
        if (i13 == 0) {
            t.b(objL);
            f93870d.a("getNotification notificationIdentifier=" + j());
            if (s.f(j(), "ALERT_CHARGING_LIVE_ACTIVITY")) {
                pd0.c cVar = pd0.c.f102111a;
                Context context = this.context;
                Bundle bundle = this.bundle;
                bVar2.f93873n = this;
                bVar2.f93884y = 1;
                objL = cVar.l(context, bundle, pendingIntent, bVar2);
                if (objL != coroutine_suspended) {
                    kVar4 = this;
                    abstractC2164c = (pd0.c.AbstractC2164c) objL;
                    if (abstractC2164c instanceof pd0.c.AbstractC2164c.Notification) {
                        return ((pd0.c.AbstractC2164c.Notification) abstractC2164c).getPackage_();
                    }
                    if (!s.f(abstractC2164c, pd0.c.AbstractC2164c.a.f102116a)) {
                        throw new ChargingNotificationDismissedException("Backend dismissed " + kVar4.j());
                    }
                    if (s.f(abstractC2164c, pd0.c.AbstractC2164c.b.f102117a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Malformed " + kVar4.j() + " push — see logs");
                }
            } else {
                iC = zn0.c.INSTANCE.c();
                kVar = new k(this.bundle, this.context);
                eVarB = INSTANCE.b(this.context);
                strN = kVar.n();
                strH = kVar.h();
                strJ = kVar.j();
                strC = kVar.c();
                n0Var = new n0();
                n0Var.f86529a = pendingIntent;
                String strE = kVar.e();
                if (strE != null) {
                    od0.d dVar = od0.d.f97137a;
                    Context context2 = this.context;
                    String strL = l();
                    bVar2.f93873n = this;
                    bVar2.f93874o = kVar;
                    bVar2.f93875p = eVarB;
                    bVar2.f93876q = strN;
                    bVar2.f93877r = strH;
                    bVar2.f93878s = strJ;
                    bVar2.f93879t = strC;
                    bVar2.f93880u = n0Var;
                    bVar2.f93881v = iC;
                    bVar2.f93884y = 2;
                    if (dVar.j(context2, strE, iC, strN, strH, strL, eVarB, bVar2) != coroutine_suspended) {
                        n0Var2 = n0Var;
                        kVar2 = this;
                        i11 = iC;
                        str = strN;
                        str2 = strH;
                        eVar = eVarB;
                        str3 = strJ;
                        str4 = strC;
                        kVar3 = kVar;
                        Context context3 = kVar2.context;
                        od0.d dVar2 = od0.d.f97137a;
                        String strL2 = kVar2.l();
                        s.h(strL2);
                        n0Var2.f86529a = PendingIntent.getActivity(context3, 9110, dVar2.h(context3, strL2), 67108864);
                        strC = str4;
                        strJ = str3;
                        eVarB = eVar;
                        kVar = kVar3;
                        n0Var = n0Var2;
                        strH = str2;
                        strN = str;
                        iC = i11;
                    }
                } else {
                    kVar2 = this;
                }
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            kVar4 = (k) bVar2.f93873n;
            t.b(objL);
            abstractC2164c = (pd0.c.AbstractC2164c) objL;
            if (abstractC2164c instanceof pd0.c.AbstractC2164c.Notification) {
                return ((pd0.c.AbstractC2164c.Notification) abstractC2164c).getPackage_();
            }
            if (!s.f(abstractC2164c, pd0.c.AbstractC2164c.a.f102116a)) {
                throw new ChargingNotificationDismissedException("Backend dismissed " + kVar4.j());
            }
            if (s.f(abstractC2164c, pd0.c.AbstractC2164c.b.f102117a)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Malformed " + kVar4.j() + " push — see logs");
        }
        if (i13 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = bVar2.f93881v;
        n0Var2 = (n0) bVar2.f93880u;
        str4 = (String) bVar2.f93879t;
        str3 = (String) bVar2.f93878s;
        str2 = (String) bVar2.f93877r;
        str = (String) bVar2.f93876q;
        eVar = (o.e) bVar2.f93875p;
        kVar3 = (k) bVar2.f93874o;
        kVar2 = (k) bVar2.f93873n;
        t.b(objL);
        Context context4 = kVar2.context;
        od0.d dVar3 = od0.d.f97137a;
        String strL3 = kVar2.l();
        s.h(strL3);
        n0Var2.f86529a = PendingIntent.getActivity(context4, 9110, dVar3.h(context4, strL3), 67108864);
        strC = str4;
        strJ = str3;
        eVarB = eVar;
        kVar = kVar3;
        n0Var = n0Var2;
        strH = str2;
        strN = str;
        iC = i11;
        eVarB.A(kVar2.k()).m(strN).k((PendingIntent) n0Var.f86529a).l(strH).L(kVar.d()).F(new o.c().h(strH));
        String strF = kVar.f();
        if (strF != null) {
            f93870d.j("setting category " + strF);
            eVarB.g(strF);
        }
        String strG = kVar.g();
        if (strG != null) {
            f93870d.j("setting channelId " + strG);
            eVarB.h(strG);
        }
        String strO = kVar2.o();
        String str5 = null;
        u5 u5VarC = null;
        if (strO == null) {
            String strL4 = kVar2.l();
            if (strL4 != null && (u5VarC = be0.e.INSTANCE.a().c(strL4)) != null) {
                strO = wb0.e.v(u5VarC);
            }
            u5Var = u5VarC;
            str5 = strL4;
        } else {
            u5Var = null;
        }
        if (strO == null && str5 != null) {
            String str6 = "VIN was null, " + (u5Var == null ? "vehicle data null," : "vehicle data is not null") + " cannot process actions for identifier '" + strJ + "'";
            f93870d.d(str6, new Throwable(str6));
        } else if (strC != null && strC.length() != 0) {
            try {
                ProtoAdapter<oc0.b> protoAdapter = oc0.b.f97106c;
                byte[] bArrDecode = Base64.decode(strC, 0);
                s.j(bArrDecode, "decode(...)");
                List<oc0.a> listC = protoAdapter.decode(bArrDecode).c();
                nd0.b bVarA = nd0.b.INSTANCE.a();
                if (listC.size() <= 1) {
                    z11 = false;
                }
                Iterator<oc0.a> it = listC.iterator();
                while (it.hasNext()) {
                    a aVarB = bVarA.b(it.next());
                    if (aVarB != null) {
                        NotificationContent notificationContentB = aVarB.b(z11);
                        eVarB.a(notificationContentB.getIcon(), kVar2.context.getString(notificationContentB.getTitle()), aVarB.c(kVar2.context, iC, strO));
                    }
                }
            } catch (IOException e11) {
                f93870d.d("Exception thrown decoding actions proto base64", e11);
            }
        }
        Notification notificationC = eVarB.c();
        s.j(notificationC, "build(...)");
        return new NotificationPackage(iC, notificationC);
    }

    public final String n() {
        String string = this.bundle.getString("alert_args");
        if (string == null) {
            return null;
        }
        try {
            return new JSONArray(string).getString(0);
        } catch (JSONException e11) {
            f93870d.d("Failed to parse notification args", e11);
            return null;
        }
    }

    public final String o() {
        return this.bundle.getString("vin");
    }
}
