package p011ja;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@d0.b("activity")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f \u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lja/a;", "Lja/d0;", "Lja/a$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "l", "()Lja/a$b;", "", "k", "()Z", "destination", "Landroid/os/Bundle;", "args", "Lja/y;", "navOptions", "Lja/d0$a;", "navigatorExtras", "Lja/r;", "m", "(Lja/a$b;Landroid/os/Bundle;Lja/y;Lja/d0$a;)Lja/r;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", DateTokenConverter.CONVERTER_KEY, "Landroid/app/Activity;", "hostActivity", "e", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a extends d0<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Activity hostActivity;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001e8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t8F@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b¨\u0006%"}, d2 = {"Lja/a$b;", "Lja/r;", "Lja/d0;", "activityNavigator", "<init>", "(Lja/d0;)V", "", "z", "()Z", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Intent;", "<set-?>", "m", "Landroid/content/Intent;", "D", "()Landroid/content/Intent;", AnalyticsAttribute.Intent, "n", "Ljava/lang/String;", "C", "dataPattern", "Landroid/content/ComponentName;", "component", "Landroid/content/ComponentName;", "B", "()Landroid/content/ComponentName;", "action", "A", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b extends r {

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Intent intent;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private String dataPattern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d0<? extends b> activityNavigator) {
            super(activityNavigator);
            s.k(activityNavigator, "activityNavigator");
        }

        public final String A() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName B() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getDataPattern() {
            return this.dataPattern;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        @Override // p011ja.r
        public boolean equals(Object other) {
            boolean zFilterEquals;
            if (this == other) {
                return true;
            }
            if (other != null && (other instanceof b) && super.equals(other)) {
                Intent intent = this.intent;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((b) other).intent);
                } else {
                    zFilterEquals = ((b) other).intent == null;
                }
                if (zFilterEquals && s.f(this.dataPattern, ((b) other).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p011ja.r
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.dataPattern;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // p011ja.r
        public String toString() {
            ComponentName componentNameB = B();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameB != null) {
                sb2.append(" class=");
                sb2.append(componentNameB.getClassName());
            } else {
                String strA = A();
                if (strA != null) {
                    sb2.append(" action=");
                    sb2.append(strA);
                }
            }
            String string = sb2.toString();
            s.j(string, "sb.toString()");
            return string;
        }

        @Override // p011ja.r
        public boolean z() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lja/a$c;", "Lja/d0$a;", "", "flags", "I", "b", "()I", "Landroidx/core/app/d;", "activityOptions", "Landroidx/core/app/d;", "a", "()Landroidx/core/app/d;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements d0.a {
        public final androidx.core.app.d a() {
            throw null;
        }

        public final int b() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<Context, Context> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f83190c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            s.k(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public a(Context context) {
        s.k(context, "context");
        this.context = context;
        for (Object obj : ho0.l.q(context, d.f83190c)) {
            if (((Context) obj) instanceof Activity) {
                this.hostActivity = (Activity) obj;
            }
        }
        obj = null;
        this.hostActivity = (Activity) obj;
    }

    @Override // p011ja.d0
    public boolean k() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // p011ja.d0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @Override // p011ja.d0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public r d(b destination, Bundle args, y navOptions, d0.a navigatorExtras) {
        androidx.core.app.d dVarA;
        Intent intent;
        int intExtra;
        s.k(destination, "destination");
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (args != null) {
            intent2.putExtras(args);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!args.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + args + " to fill data pattern " + dataPattern);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(args.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z11 = navigatorExtras instanceof c;
        if (z11) {
            intent2.addFlags(((c) navigatorExtras).b());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.getSingleTop()) {
            intent2.addFlags(PKIFailureInfo.duplicateCertReq);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.getId());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim <= 0 || !s.f(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !s.f(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", popEnterAnim);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", popExitAnim);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            }
        }
        if (!z11 || (dVarA = ((c) navigatorExtras).a()) == null) {
            this.context.startActivity(intent2);
        } else {
            androidx.core.content.b.startActivity(this.context, intent2, dVarA.b());
        }
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int enterAnim = navOptions.getEnterAnim();
        int exitAnim = navOptions.getExitAnim();
        if ((enterAnim <= 0 || !s.f(resources.getResourceTypeName(enterAnim), "animator")) && (exitAnim <= 0 || !s.f(resources.getResourceTypeName(exitAnim), "animator"))) {
            if (enterAnim < 0 && exitAnim < 0) {
                return null;
            }
            this.hostActivity.overridePendingTransition(n.f(enterAnim, 0), n.f(exitAnim, 0));
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
        return null;
    }
}
